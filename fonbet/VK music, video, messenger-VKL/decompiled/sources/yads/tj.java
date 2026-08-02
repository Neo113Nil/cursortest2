package yads;

import android.media.MediaCodec;
import android.os.HandlerThread;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
public final class tj {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public rj c;
    public final AtomicReference d;
    public final vy e;
    public boolean f;

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new vy());
    }

    public static sj b() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new sj();
                }
                return (sj) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(Message message) {
        int i = message.what;
        sj sjVar = null;
        if (i == 0) {
            sj sjVar2 = (sj) message.obj;
            try {
                this.a.queueInputBuffer(sjVar2.a, sjVar2.b, sjVar2.c, sjVar2.e, sjVar2.f);
            } catch (RuntimeException e) {
                AtomicReference atomicReference = this.d;
                while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                }
            }
            sjVar = sjVar2;
        } else if (i == 1) {
            sj sjVar3 = (sj) message.obj;
            int i2 = sjVar3.a;
            int i3 = sjVar3.b;
            MediaCodec.CryptoInfo cryptoInfo = sjVar3.d;
            long j = sjVar3.e;
            int i4 = sjVar3.f;
            try {
                synchronized (h) {
                    this.a.queueSecureInputBuffer(i2, i3, cryptoInfo, j, i4);
                }
            } catch (RuntimeException e2) {
                AtomicReference atomicReference2 = this.d;
                while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                }
            }
            sjVar = sjVar3;
        } else if (i != 2) {
            AtomicReference atomicReference3 = this.d;
            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
            while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
            }
        } else {
            this.e.d();
        }
        if (sjVar != null) {
            a(sjVar);
        }
    }

    public tj(MediaCodec mediaCodec, HandlerThread handlerThread, vy vyVar) {
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = vyVar;
        this.d = new AtomicReference();
    }

    public final void a() {
        if (this.f) {
            try {
                rj rjVar = this.c;
                rjVar.getClass();
                rjVar.removeCallbacksAndMessages(null);
                vy vyVar = this.e;
                synchronized (vyVar) {
                    vyVar.a = false;
                }
                rj rjVar2 = this.c;
                rjVar2.getClass();
                rjVar2.obtainMessage(2).sendToTarget();
                this.e.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void a(int i, m20 m20Var, long j) {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
            sj b = b();
            b.a = i;
            b.b = 0;
            b.c = 0;
            b.e = j;
            b.f = 0;
            MediaCodec.CryptoInfo cryptoInfo = b.d;
            cryptoInfo.numSubSamples = m20Var.f;
            int[] iArr = m20Var.d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = m20Var.e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = m20Var.b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = m20Var.a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = m20Var.c;
            if (mc3.a >= 24) {
                cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(m20Var.g, m20Var.h));
            }
            this.c.obtainMessage(1, b).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public static void a(sj sjVar) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(sjVar);
        }
    }
}
