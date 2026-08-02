package xsna;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
/* loaded from: classes12.dex */
public final class a04 implements dq10 {
    public static final ArrayDeque<b> g = new ArrayDeque<>();
    public static final Object h = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public a c;
    public final AtomicReference<RuntimeException> d;
    public final wwi e;
    public boolean f;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            a04 a04Var = a04.this;
            int i = message.what;
            b bVar = null;
            if (i == 1) {
                b bVar2 = (b) message.obj;
                try {
                    a04Var.a.queueInputBuffer(bVar2.a, 0, bVar2.b, bVar2.d, bVar2.e);
                } catch (RuntimeException e) {
                    AtomicReference<RuntimeException> atomicReference = a04Var.d;
                    while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                    }
                }
                bVar = bVar2;
            } else if (i == 2) {
                b bVar3 = (b) message.obj;
                int i2 = bVar3.a;
                MediaCodec.CryptoInfo cryptoInfo = bVar3.c;
                long j = bVar3.d;
                int i3 = bVar3.e;
                try {
                    synchronized (a04.h) {
                        a04Var.a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                    }
                } catch (RuntimeException e2) {
                    AtomicReference<RuntimeException> atomicReference2 = a04Var.d;
                    while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                    }
                }
                bVar = bVar3;
            } else if (i == 3) {
                a04Var.e.f();
            } else if (i != 4) {
                AtomicReference<RuntimeException> atomicReference3 = a04Var.d;
                IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                }
            } else {
                try {
                    a04Var.a.setParameters((Bundle) message.obj);
                } catch (RuntimeException e3) {
                    AtomicReference<RuntimeException> atomicReference4 = a04Var.d;
                    while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                    }
                }
            }
            if (bVar != null) {
                ArrayDeque<b> arrayDeque = a04.g;
                synchronized (arrayDeque) {
                    arrayDeque.add(bVar);
                }
            }
        }
    }

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer.java */
    public static class b {
        public int a;
        public int b;
        public final MediaCodec.CryptoInfo c = new MediaCodec.CryptoInfo();
        public long d;
        public int e;
    }

    public a04(MediaCodec mediaCodec, HandlerThread handlerThread) {
        wwi wwiVar = new wwi();
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = wwiVar;
        this.d = new AtomicReference<>();
    }

    public static b d() {
        ArrayDeque<b> arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new b();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.dq10
    public final void a(int i, int i2, int i3, long j) {
        c();
        b d = d();
        d.a = i;
        d.b = i2;
        d.d = j;
        d.e = i3;
        a aVar = this.c;
        String str = y2r0.a;
        aVar.obtainMessage(1, d).sendToTarget();
    }

    @Override // xsna.dq10
    public final void b(int i, tjk tjkVar, long j, int i2) {
        c();
        b d = d();
        d.a = i;
        d.b = 0;
        d.d = j;
        d.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = d.c;
        cryptoInfo.numSubSamples = tjkVar.f;
        int[] iArr = tjkVar.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 == null || iArr2.length < iArr.length) {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = tjkVar.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 == null || iArr4.length < iArr3.length) {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            } else {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = tjkVar.b;
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
        byte[] bArr3 = tjkVar.a;
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
        cryptoInfo.mode = tjkVar.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(tjkVar.g, tjkVar.h));
        a aVar = this.c;
        String str = y2r0.a;
        aVar.obtainMessage(2, d).sendToTarget();
    }

    @Override // xsna.dq10
    public final void c() {
        RuntimeException andSet = this.d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    @Override // xsna.dq10
    public final void flush() {
        if (this.f) {
            try {
                a aVar = this.c;
                aVar.getClass();
                aVar.removeCallbacksAndMessages(null);
                wwi wwiVar = this.e;
                wwiVar.d();
                a aVar2 = this.c;
                aVar2.getClass();
                aVar2.obtainMessage(3).sendToTarget();
                wwiVar.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // xsna.dq10
    public final void setParameters(Bundle bundle) {
        c();
        a aVar = this.c;
        String str = y2r0.a;
        aVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // xsna.dq10
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // xsna.dq10
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new a(handlerThread.getLooper());
        this.f = true;
    }
}
