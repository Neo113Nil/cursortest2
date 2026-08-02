package ru.ok.android.webrtc.protocol.impl.commands;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.LongSparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.RtcCommand;
import ru.ok.android.webrtc.protocol.RtcCommandConfig;
import ru.ok.android.webrtc.protocol.RtcCommandExecutor;
import ru.ok.android.webrtc.protocol.RtcCommandSerializer;
import ru.ok.android.webrtc.protocol.RtcFormat;
import ru.ok.android.webrtc.protocol.RtcResponse;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandSerializeException;
import ru.ok.android.webrtc.protocol.exceptions.RtcRetryLimitExceedException;
import ru.ok.android.webrtc.protocol.impl.commands.RtcCommandExecutorImpl;
import ru.ok.android.webrtc.protocol.impl.utils.RetryBackoffCalculator;
import xsna.axk;
import xsna.cwq;
import xsna.e6a0;
import xsna.f2l;
import xsna.i6k;
import xsna.ivy0;
import xsna.k50;
import xsna.l96;
import xsna.nm30;
import xsna.qc9;
import xsna.tou;
import xsna.tzz;
import xsna.v9j;
import xsna.vy4;
import xsna.wv6;
import xsna.zwy0;

/* loaded from: classes9.dex */
public class RtcCommandExecutorImpl implements RtcCommandExecutor {
    public static final String EXEC_THREAD_NAME = "RtcCommExec";
    public static final String TAG = "RTCCommand";
    public final RtcCommandSerializer a;
    public final HandlerThread e;
    public final Handler f;
    public final zwy0 n;
    public final RTCLog o;
    public final AtomicReference b = new AtomicReference(null);
    public final a c = new a(this);
    public final b d = new b(this);
    public final Handler g = new Handler(Looper.getMainLooper());
    public final Handler h = new Handler(Looper.getMainLooper());
    public final RetryBackoffCalculator i = new RetryBackoffCalculator();
    public final AtomicBoolean j = new AtomicBoolean(false);
    public long k = 0;
    public final LongSparseArray l = new LongSparseArray();
    public final LinkedList m = new LinkedList();

    public static class Builder {
        public RTCLog a;
        public RtcCommandSerializer b = null;

        public RtcCommandExecutorImpl build() {
            return new RtcCommandExecutorImpl(this);
        }

        public Builder setLog(RTCLog rTCLog) {
            this.a = rTCLog;
            return this;
        }

        public Builder setSerializer(@Nullable RtcCommandSerializer rtcCommandSerializer) {
            this.b = rtcCommandSerializer;
            return this;
        }
    }

    public RtcCommandExecutorImpl(Builder builder) {
        RtcCommandSerializer rtcCommandSerializer = builder.b;
        if (rtcCommandSerializer == null) {
            throw new IllegalArgumentException("Illegal 'serializer' value: null");
        }
        this.a = rtcCommandSerializer;
        RTCLog rTCLog = builder.a;
        this.o = rTCLog;
        this.n = new zwy0(rTCLog);
        HandlerThread handlerThread = new HandlerThread(EXEC_THREAD_NAME);
        this.e = handlerThread;
        handlerThread.start();
        this.f = new Handler(handlerThread.getLooper());
    }

    public final /* synthetic */ void a(boolean z) {
        RtcTransport rtcTransport = (RtcTransport) this.b.get();
        if (rtcTransport != null) {
            rtcTransport.removeConnectionStateListener(this.c);
            rtcTransport.removeDataListener(this.d);
            if (z) {
                rtcTransport.dispose();
            }
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor
    public void addListener(@NonNull RtcCommandExecutor.Listener listener) {
        zwy0 zwy0Var = this.n;
        if (listener != null) {
            zwy0Var.b.add(listener);
        } else {
            zwy0Var.getClass();
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
    }

    public void awaitTermination(long j) throws InterruptedException {
        this.e.join(j);
    }

    public final /* synthetic */ void b(long j) {
        this.m.offer(Long.valueOf(j));
        b();
    }

    public final void c(long j) {
        ivy0 ivy0Var = (ivy0) this.l.get(j);
        if (ivy0Var == null || this.j.get()) {
            return;
        }
        RtcCommandConfig rtcCommandConfig = ivy0Var.d;
        this.i.setMinRetryTimeoutMs(rtcCommandConfig.minRetryTimeoutMs);
        this.i.setMaxRetryTimeoutMs(rtcCommandConfig.maxRetryTimeoutMs);
        this.i.setRetryBackoffFactor(rtcCommandConfig.retryBackoffFactor);
        this.i.setRetryBackoffJitter(rtcCommandConfig.retryBackoffJitter);
        this.i.setLatestRetryTimeout(ivy0Var.f);
        ivy0Var.e++;
        long calculate = this.i.calculate();
        ivy0Var.f = calculate;
        if (ivy0Var.e < rtcCommandConfig.maxRetryCount) {
            this.g.postDelayed(new axk(this, j, 1), calculate);
            return;
        }
        RtcRetryLimitExceedException rtcRetryLimitExceedException = new RtcRetryLimitExceedException();
        zwy0 zwy0Var = this.n;
        Command command = rtcCommandConfig.command;
        zwy0Var.getClass();
        zwy0Var.c.post(new e6a0(zwy0Var, command, rtcRetryLimitExceedException, 1));
        this.n.a(rtcCommandConfig.command);
        this.h.post(new l96(5, ivy0Var, rtcRetryLimitExceedException));
        this.l.remove(j);
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(long j) {
        this.f.post(new cwq(this, j, 1));
    }

    public void dispose(final boolean z) {
        if (this.j.compareAndSet(false, true)) {
            this.g.removeCallbacksAndMessages(null);
            this.f.removeCallbacksAndMessages(null);
            this.f.post(new Runnable() { // from class: xsna.vpg0
                @Override // java.lang.Runnable
                public final void run() {
                    RtcCommandExecutorImpl.this.a(z);
                }
            });
            this.e.quitSafely();
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor
    public void execute(@NonNull RtcCommandConfig<?, ?> rtcCommandConfig) {
        if (this.j.get()) {
            this.o.log(TAG, "execute on disposed");
        }
        if (rtcCommandConfig != null) {
            this.f.post(new i6k(4, this, rtcCommandConfig));
        } else {
            throw new IllegalArgumentException("Illegal 'config' value: " + rtcCommandConfig);
        }
    }

    @Override // ru.ok.android.webrtc.protocol.RtcCommandExecutor
    public void removeListener(@NonNull RtcCommandExecutor.Listener listener) {
        zwy0 zwy0Var = this.n;
        if (listener != null) {
            zwy0Var.b.remove(listener);
        } else {
            zwy0Var.getClass();
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
    }

    public void setTransport(@Nullable RtcTransport rtcTransport) {
        if (this.j.get()) {
            throw new IllegalStateException("Instance is disposed");
        }
        this.f.post(new v9j(6, this, rtcTransport));
    }

    public final void b() {
        RtcTransport rtcTransport = (RtcTransport) this.b.get();
        if (rtcTransport == null || !rtcTransport.isConnected()) {
            return;
        }
        Long l = (Long) this.m.poll();
        while (l != null) {
            ivy0 ivy0Var = (ivy0) this.l.get(l.longValue());
            if (ivy0Var != null) {
                try {
                    RtcCommandSerializer.SerializeResult serialize = this.a.serialize(ivy0Var.b, ivy0Var.c);
                    boolean send = rtcTransport.send(serialize.value, serialize.format);
                    if (send) {
                        zwy0 zwy0Var = this.n;
                        RtcCommand rtcCommand = ivy0Var.c;
                        zwy0Var.getClass();
                        zwy0Var.c.post(new tzz(8, zwy0Var, rtcCommand));
                        zwy0 zwy0Var2 = this.n;
                        byte[] bArr = serialize.value;
                        RtcFormat rtcFormat = serialize.format;
                        zwy0Var2.getClass();
                        zwy0Var2.c.post(new wv6(zwy0Var2, bArr, rtcFormat, 5));
                    }
                    if (send) {
                        if (ivy0Var.c.isNotify()) {
                            this.n.a(ivy0Var.c);
                            this.l.remove(ivy0Var.b);
                        }
                        this.h.post(new qc9(ivy0Var, 15));
                    } else {
                        c(ivy0Var.b);
                    }
                } catch (Throwable th) {
                    zwy0 zwy0Var3 = this.n;
                    RtcCommand rtcCommand2 = ivy0Var.c;
                    zwy0Var3.getClass();
                    zwy0Var3.c.post(new e6a0(zwy0Var3, rtcCommand2, th, 1));
                    this.n.a(ivy0Var.c);
                    this.h.post(new l96(5, ivy0Var, th));
                    this.l.remove(ivy0Var.b);
                }
            }
            l = (Long) this.m.poll();
        }
    }

    public final void a(RtcTransport rtcTransport) {
        RtcTransport rtcTransport2;
        if (this.j.get() || (rtcTransport2 = (RtcTransport) this.b.get()) == rtcTransport) {
            return;
        }
        this.b.set(rtcTransport);
        if (rtcTransport2 != null) {
            rtcTransport2.removeConnectionStateListener(this.c);
            rtcTransport2.removeDataListener(this.d);
        }
        a();
        if (rtcTransport != null) {
            rtcTransport.addDataListener(this.d);
            rtcTransport.addConnectionStateListener(this.c);
            boolean isConnected = rtcTransport.isConnected();
            RtcTransport rtcTransport3 = (RtcTransport) this.b.get();
            if (this.j.get() || rtcTransport3 != rtcTransport) {
                return;
            }
            if (isConnected) {
                b();
            } else {
                a();
            }
        }
    }

    public void dispose() {
        dispose(false);
    }

    public final void a(RtcCommandConfig rtcCommandConfig) {
        if (this.j.get()) {
            return;
        }
        long j = this.k + 1;
        this.k = j;
        this.l.put(j, new ivy0(j, rtcCommandConfig, this.o));
        zwy0 zwy0Var = this.n;
        Command command = rtcCommandConfig.command;
        zwy0Var.getClass();
        zwy0Var.c.post(new f2l(7, zwy0Var, command));
        a(j);
    }

    public final void a(RtcTransport rtcTransport, byte[] bArr, RtcFormat rtcFormat) {
        RtcTransport rtcTransport2 = (RtcTransport) this.b.get();
        if (this.j.get() || rtcTransport2 != rtcTransport) {
            return;
        }
        zwy0 zwy0Var = this.n;
        zwy0Var.getClass();
        zwy0Var.c.post(new nm30(zwy0Var, bArr, rtcFormat, 2));
        try {
            RtcCommandSerializer.DeserializeResult deserialize = this.a.deserialize(bArr, rtcFormat);
            if (deserialize == null) {
                return;
            }
            long j = deserialize.commandId;
            RtcResponse rtcResponse = deserialize.commandResponse;
            ivy0 ivy0Var = (ivy0) this.l.get(j);
            if (ivy0Var == null) {
                return;
            }
            RtcCommand rtcCommand = ivy0Var.c;
            if (rtcResponse == null) {
                throw new RtcCommandSerializeException(Long.valueOf(j), false, new ClassCastException("Unable to cast response to valid type. Response: " + rtcResponse));
            }
            zwy0 zwy0Var2 = this.n;
            zwy0Var2.getClass();
            zwy0Var2.c.post(new vy4(zwy0Var2, rtcCommand, rtcResponse, 6));
            this.n.a(rtcCommand);
            this.h.post(new k50(8, ivy0Var, rtcResponse));
            this.l.remove(j);
        } catch (RtcCommandException e) {
            Long commandId = e.getCommandId();
            ivy0 ivy0Var2 = commandId == null ? null : (ivy0) this.l.get(commandId.longValue());
            boolean isRecoverable = e.isRecoverable();
            if (commandId != null && ivy0Var2 != null) {
                RtcCommand rtcCommand2 = ivy0Var2.c;
                zwy0 zwy0Var3 = this.n;
                zwy0Var3.getClass();
                zwy0Var3.c.post(new e6a0(zwy0Var3, rtcCommand2, e, 1));
                if (isRecoverable) {
                    c(commandId.longValue());
                    return;
                }
                this.n.a(rtcCommand2);
                this.h.post(new l96(5, ivy0Var2, e));
                this.l.remove(commandId.longValue());
                return;
            }
            zwy0 zwy0Var4 = this.n;
            zwy0Var4.getClass();
            zwy0Var4.c.post(new tou(7, zwy0Var4, e));
        } catch (Throwable th) {
            zwy0 zwy0Var5 = this.n;
            zwy0Var5.getClass();
            zwy0Var5.c.post(new tou(7, zwy0Var5, th));
        }
    }

    public final void a() {
        this.g.removeCallbacksAndMessages(null);
        this.m.clear();
        for (int i = 0; i < this.l.size(); i++) {
            long keyAt = this.l.keyAt(i);
            ivy0 ivy0Var = (ivy0) this.l.valueAt(i);
            ivy0Var.e = 0L;
            ivy0Var.f = 0L;
            this.m.offer(Long.valueOf(keyAt));
        }
    }
}
