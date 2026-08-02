package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import defpackage.cyd;
import defpackage.lb3;
import defpackage.ny61;
import defpackage.rb10;
import defpackage.tw21;
import defpackage.ucf;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class b implements rb10 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference d;
    public final cyd e;
    public boolean f;

    public b(MediaCodec mediaCodec, HandlerThread handlerThread) {
        cyd cydVar = new cyd();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = cydVar;
        this.d = new AtomicReference();
    }

    public static lb3 b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new lb3();
                }
                return (lb3) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rb10
    public final void a(int i, int i2, long j, int i3) {
        j();
        lb3 b = b();
        b.a = i;
        b.b = i2;
        b.d = j;
        b.e = i3;
        Handler handler = this.c;
        int i4 = tw21.a;
        handler.obtainMessage(1, b).sendToTarget();
    }

    @Override // defpackage.rb10
    public final void f(int i, ucf ucfVar, long j, int i2) {
        j();
        lb3 b = b();
        b.a = i;
        b.b = 0;
        b.d = j;
        b.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = b.c;
        cryptoInfo.numSubSamples = ucfVar.f;
        int[] iArr = ucfVar.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = ucfVar.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = ucfVar.b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 == null || bArr2.length < bArr.length) {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = ucfVar.a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 == null || bArr4.length < bArr3.length) {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            } else {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = ucfVar.c;
        if (tw21.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(ucfVar.g, ucfVar.h));
        }
        this.c.obtainMessage(2, b).sendToTarget();
    }

    @Override // defpackage.rb10
    public final void flush() {
        if (this.f) {
            try {
                Handler handler = this.c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                cyd cydVar = this.e;
                cydVar.c();
                Handler handler2 = this.c;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                cydVar.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                ny61.o(e);
            }
        }
    }

    @Override // defpackage.rb10
    public final void j() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.rb10
    public final void setParameters(Bundle bundle) {
        j();
        Handler handler = this.c;
        int i = tw21.a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.rb10
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.rb10
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        final Looper looper = handlerThread.getLooper();
        this.c = new Handler(looper) { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer$1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar = b.this;
                ArrayDeque arrayDeque = b.g;
                bVar.getClass();
                int i = message.what;
                lb3 lb3Var = null;
                if (i == 1) {
                    lb3 lb3Var2 = (lb3) message.obj;
                    try {
                        bVar.a.queueInputBuffer(lb3Var2.a, 0, lb3Var2.b, lb3Var2.d, lb3Var2.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = bVar.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    lb3Var = lb3Var2;
                } else if (i == 2) {
                    lb3 lb3Var3 = (lb3) message.obj;
                    int i2 = lb3Var3.a;
                    MediaCodec.CryptoInfo cryptoInfo = lb3Var3.c;
                    long j = lb3Var3.d;
                    int i3 = lb3Var3.e;
                    try {
                        synchronized (b.h) {
                            bVar.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = bVar.d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    lb3Var = lb3Var3;
                } else if (i == 3) {
                    bVar.e.d();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = bVar.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(i));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        bVar.a.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = bVar.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (lb3Var != null) {
                    ArrayDeque arrayDeque2 = b.g;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(lb3Var);
                    }
                }
            }
        };
        this.f = true;
    }
}
