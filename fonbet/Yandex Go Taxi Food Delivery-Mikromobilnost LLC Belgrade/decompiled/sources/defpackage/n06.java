package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public final class n06 implements g2v0, jyg {
    public final kds0 a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final nyg[] e;
    public final oyg[] f;
    public int g;
    public int h;
    public nyg i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public long m;
    public final /* synthetic */ int n;
    public final Object o;

    public n06(nyg[] nygVarArr, oyg[] oygVarArr) {
        oyg l06Var;
        nyg nygVar;
        this.b = new Object();
        this.m = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = nygVarArr;
        this.g = nygVarArr.length;
        int i = 0;
        for (int i2 = 0; i2 < this.g; i2++) {
            nyg[] nygVarArr2 = this.e;
            switch (this.n) {
                case 0:
                    nygVar = new nyg(1);
                    break;
                default:
                    nygVar = new k2v0();
                    break;
            }
            nygVarArr2[i2] = nygVar;
        }
        this.f = oygVarArr;
        this.h = oygVarArr.length;
        for (int i3 = 0; i3 < this.h; i3++) {
            oyg[] oygVarArr2 = this.f;
            switch (this.n) {
                case 0:
                    l06Var = new l06(this);
                    break;
                default:
                    l06Var = new d69(this);
                    break;
            }
            oygVarArr2[i3] = l06Var;
        }
        kds0 kds0Var = new kds0(i, this);
        this.a = kds0Var;
        kds0Var.start();
    }

    @Override // defpackage.g2v0
    public void a(long j) {
    }

    public final DecoderException b(Throwable th) {
        switch (this.n) {
            case 0:
                return new ImageDecoderException("Unexpected decode error", th);
            default:
                return new SubtitleDecoderException("Unexpected decode error", th);
        }
    }

    public final DecoderException c(nyg nygVar, oyg oygVar, boolean z) {
        int i = this.n;
        Object obj = this.o;
        switch (i) {
            case 0:
                gcv gcvVar = (gcv) oygVar;
                try {
                    ByteBuffer byteBuffer = nygVar.w;
                    byteBuffer.getClass();
                    d6z.x(byteBuffer.hasArray());
                    d6z.l(byteBuffer.arrayOffset() == 0);
                    byte[] array = byteBuffer.array();
                    int remaining = byteBuffer.remaining();
                    ((quz) obj).getClass();
                    try {
                        gcvVar.w = s8b1.a(remaining, array);
                        gcvVar.b = nygVar.y;
                        return null;
                    } catch (ParserException e) {
                        throw new ImageDecoderException(ly3.k(array.length, remaining, ", input length = ", Extension.C_BRAKE, new StringBuilder("Could not decode image data with BitmapFactory. (data.length = ")), e);
                    } catch (IOException e2) {
                        throw new ImageDecoderException(e2);
                    }
                } catch (ImageDecoderException e3) {
                    return e3;
                }
            default:
                k2v0 k2v0Var = (k2v0) nygVar;
                l2v0 l2v0Var = (l2v0) oygVar;
                try {
                    ByteBuffer byteBuffer2 = k2v0Var.w;
                    byteBuffer2.getClass();
                    byte[] array2 = byteBuffer2.array();
                    int limit = byteBuffer2.limit();
                    q2v0 q2v0Var = (q2v0) obj;
                    if (z) {
                        q2v0Var.reset();
                    }
                    e2v0 d = q2v0Var.d(0, limit, array2);
                    long j = k2v0Var.y;
                    long j2 = k2v0Var.B;
                    l2v0Var.b = j;
                    l2v0Var.w = d;
                    if (j2 != ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED) {
                        j = j2;
                    }
                    l2v0Var.x = j;
                    l2v0Var.c = false;
                    return null;
                } catch (SubtitleDecoderException e4) {
                    return e4;
                }
        }
    }

    @Override // defpackage.jyg
    public final Object d() {
        nyg nygVar;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                d6z.x(this.i == null);
                int i = this.g;
                if (i == 0) {
                    nygVar = null;
                } else {
                    nyg[] nygVarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    nygVar = nygVarArr[i2];
                }
                this.i = nygVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nygVar;
    }

    @Override // defpackage.jyg
    public final void f(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    d6z.x(z);
                    this.m = j;
                }
                z = true;
                d6z.x(z);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jyg
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                nyg nygVar = this.i;
                if (nygVar != null) {
                    nygVar.d();
                    nyg[] nygVarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    nygVarArr[i] = nygVar;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    nyg nygVar2 = (nyg) this.c.removeFirst();
                    nygVar2.d();
                    nyg[] nygVarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    nygVarArr2[i2] = nygVar2;
                }
                while (!this.d.isEmpty()) {
                    ((oyg) this.d.removeFirst()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean h() {
        boolean z;
        DecoderException b;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            nyg nygVar = (nyg) this.c.removeFirst();
            oyg[] oygVarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            oyg oygVar = oygVarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (nygVar.b(4)) {
                oygVar.a(4);
            } else {
                oygVar.b = nygVar.y;
                if (nygVar.b(SelfTester_JCP.DECRYPT_CNT)) {
                    oygVar.a(SelfTester_JCP.DECRYPT_CNT);
                }
                long j = nygVar.y;
                synchronized (this.b) {
                    long j2 = this.m;
                    if (j2 != -9223372036854775807L && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    oygVar.c = true;
                }
                try {
                    b = c(nygVar, oygVar, z2);
                } catch (OutOfMemoryError e) {
                    b = b(e);
                } catch (RuntimeException e2) {
                    b = b(e2);
                }
                if (b != null) {
                    synchronized (this.b) {
                        this.j = b;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        oygVar.e();
                    } else if (oygVar.c) {
                        oygVar.e();
                    } else {
                        this.d.addLast(oygVar);
                    }
                    nygVar.d();
                    nyg[] nygVarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    nygVarArr[i2] = nygVar;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.jyg
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final oyg g() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (oyg) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.jyg
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void e(nyg nygVar) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                d6z.l(nygVar == this.i);
                this.c.addLast(nygVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(oyg oygVar) {
        synchronized (this.b) {
            oygVar.d();
            oyg[] oygVarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            oygVarArr[i] = oygVar;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.jyg
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n06(q2v0 q2v0Var) {
        this(new k2v0[2], new l2v0[2]);
        this.n = 1;
        int i = this.g;
        nyg[] nygVarArr = this.e;
        d6z.x(i == nygVarArr.length);
        for (nyg nygVar : nygVarArr) {
            nygVar.f(1024);
        }
        this.o = q2v0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n06(quz quzVar) {
        this(new nyg[1], new gcv[1]);
        this.n = 0;
        this.o = quzVar;
    }
}
