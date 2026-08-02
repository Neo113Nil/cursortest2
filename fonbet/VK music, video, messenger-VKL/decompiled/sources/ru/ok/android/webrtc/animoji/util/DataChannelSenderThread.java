package ru.ok.android.webrtc.animoji.util;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.android.webrtc.animoji.stats.AnimojiStatHandle;
import ru.ok.android.webrtc.animoji.util.DataChannelSendablePackage;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcTransport;
import xsna.s3q0;
import xsna.zcl;

/* loaded from: classes9.dex */
public final class DataChannelSenderThread<Pkg extends DataChannelSendablePackage> extends Thread {
    public static final Companion Companion = new Companion(null);
    public final AnimojiStatHandle a;
    public final int b;
    public RtcTransport c;
    public final ConcurrentLinkedQueue d;
    public final AtomicInteger e;
    public DataChannelSendablePackage f;
    public int g;
    public final ReentrantLock h;
    public final Condition i;
    public final ReentrantLock j;
    public volatile boolean k;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public DataChannelSenderThread(RtcTransport rtcTransport, AnimojiStatHandle animojiStatHandle, int i) {
        this.a = animojiStatHandle;
        this.b = i;
        this.c = rtcTransport;
        this.d = new ConcurrentLinkedQueue();
        this.e = new AtomicInteger(0);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.h = reentrantLock;
        this.i = reentrantLock.newCondition();
        this.j = new ReentrantLock();
    }

    public final boolean addPackage(Pkg pkg) {
        if (this.e.get() > this.b) {
            this.a.onSenderPackageDropped();
            return false;
        }
        this.d.add(pkg);
        this.a.onSenderPackageQueued();
        this.e.incrementAndGet();
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.i.signal();
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void releaseTransport() {
        ReentrantLock reentrantLock = this.j;
        reentrantLock.lock();
        try {
            this.c = null;
            s3q0 s3q0Var = s3q0.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        loop0: while (!this.k) {
            ReentrantLock reentrantLock3 = this.j;
            reentrantLock3.lock();
            try {
                RtcTransport rtcTransport = this.c;
                boolean z = rtcTransport == null;
                long bufferedAmount = rtcTransport != null ? rtcTransport.bufferedAmount() : 0L;
                s3q0 s3q0Var = s3q0.a;
                reentrantLock3.unlock();
                if (!z) {
                    while (!this.k && (bufferedAmount >= 8000000 || (this.f == null && this.d.isEmpty()))) {
                        try {
                            reentrantLock2 = this.h;
                            reentrantLock2.lock();
                        } catch (Throwable unused) {
                        }
                        try {
                            this.i.await(50L, TimeUnit.MILLISECONDS);
                            reentrantLock2.unlock();
                            reentrantLock = this.j;
                            reentrantLock.lock();
                            try {
                                RtcTransport rtcTransport2 = this.c;
                                z = rtcTransport2 == null;
                                bufferedAmount = rtcTransport2 != null ? rtcTransport2.bufferedAmount() : 0L;
                                s3q0 s3q0Var2 = s3q0.a;
                                reentrantLock.unlock();
                                if (z) {
                                    break loop0;
                                }
                            } finally {
                            }
                        } catch (Throwable th) {
                            reentrantLock2.unlock();
                            throw th;
                        }
                    }
                    if (this.k) {
                        break;
                    }
                    if (this.f == null) {
                        DataChannelSendablePackage dataChannelSendablePackage = (DataChannelSendablePackage) this.d.poll();
                        this.f = dataChannelSendablePackage;
                        if (dataChannelSendablePackage == null) {
                            continue;
                        } else {
                            this.e.decrementAndGet();
                        }
                    }
                    DataChannelSendablePackage dataChannelSendablePackage2 = this.f;
                    if (dataChannelSendablePackage2 != null) {
                        int i = this.g;
                        this.g = i + 1;
                        byte[] byteArray = dataChannelSendablePackage2.toByteArray(i);
                        if (byteArray == null) {
                            continue;
                        } else {
                            reentrantLock = this.j;
                            reentrantLock.lock();
                            try {
                                boolean z2 = this.c == null;
                                this.a.onSenderBytesSend(byteArray.length);
                                RtcTransport rtcTransport3 = this.c;
                                if (rtcTransport3 != null) {
                                    rtcTransport3.send(byteArray, RtcFormat.BINARY);
                                }
                                this.a.onSenderPackageSent();
                                this.f = null;
                                s3q0 s3q0Var3 = s3q0.a;
                                reentrantLock.unlock();
                                if (z2) {
                                    break;
                                }
                            } finally {
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    break;
                }
            } finally {
                reentrantLock3.unlock();
            }
        }
        this.f = null;
        this.d.clear();
    }

    public final void shutdown() {
        if (this.k) {
            return;
        }
        this.k = true;
        interrupt();
    }

    public /* synthetic */ DataChannelSenderThread(RtcTransport rtcTransport, AnimojiStatHandle animojiStatHandle, int i, int i2, zcl zclVar) {
        this(rtcTransport, animojiStatHandle, (i2 & 4) != 0 ? 30 : i);
    }

    public interface PushbackStrategy {

        public static final class REPLACE_ALL implements PushbackStrategy {
            public static final REPLACE_ALL INSTANCE = new REPLACE_ALL();

            @Override // ru.ok.android.webrtc.animoji.util.DataChannelSenderThread.PushbackStrategy
            public <Pkg> void onPushback(Pkg pkg, Queue<Pkg> queue) {
                queue.clear();
                queue.add(pkg);
            }
        }

        <Pkg> void onPushback(Pkg pkg, Queue<Pkg> queue);

        public static final class DROP implements PushbackStrategy {
            public static final DROP INSTANCE = new DROP();

            @Override // ru.ok.android.webrtc.animoji.util.DataChannelSenderThread.PushbackStrategy
            public <Pkg> void onPushback(Pkg pkg, Queue<Pkg> queue) {
            }
        }
    }
}
