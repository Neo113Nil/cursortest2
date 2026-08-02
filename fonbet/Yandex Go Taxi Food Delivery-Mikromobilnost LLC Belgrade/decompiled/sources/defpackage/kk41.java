package defpackage;

import defpackage.yp6;
import java.io.Closeable;
import java.util.Random;
import okio.ByteString;

/* loaded from: classes4.dex */
public final class kk41 implements Closeable {
    public boolean A;
    public vs10 B;
    public final oq6 a;
    public final Random b;
    public final boolean c;
    public final boolean w;
    public final long x;
    public final yp6 z;
    public final yp6 y = new yp6();
    public final byte[] C = new byte[4];
    public final yp6.a D = new yp6.a();

    public kk41(oq6 oq6Var, Random random, boolean z, boolean z2, long j) {
        this.a = oq6Var;
        this.b = random;
        this.c = z;
        this.w = z2;
        this.x = j;
        this.z = oq6Var.h();
    }

    public final void a(int i, ByteString byteString) {
        if (this.A) {
            ny61.v("closed");
            return;
        }
        int h = byteString.h();
        if (h > 125) {
            ny61.g("Payload size must be less than or equal to 125");
            return;
        }
        yp6 yp6Var = this.z;
        yp6Var.e0(i | 128);
        yp6Var.e0(h | 128);
        Random random = this.b;
        byte[] bArr = this.C;
        random.nextBytes(bArr);
        yp6Var.m968write(bArr);
        if (h > 0) {
            long j = yp6Var.b;
            yp6Var.b0(byteString);
            yp6.a aVar = this.D;
            yp6Var.w(aVar);
            aVar.c(j);
            hk41.a(aVar, bArr);
            aVar.close();
        }
        this.a.flush();
    }

    public final void c(int i, ByteString byteString) {
        if (this.A) {
            ny61.v("closed");
            return;
        }
        yp6 yp6Var = this.y;
        yp6Var.b0(byteString);
        int i2 = i | 128;
        if (this.c && byteString.h() >= this.x) {
            vs10 vs10Var = this.B;
            if (vs10Var == null) {
                vs10Var = new vs10(this.w);
                this.B = vs10Var;
            }
            dph dphVar = vs10Var.w;
            yp6 yp6Var2 = vs10Var.b;
            if (yp6Var2.b != 0) {
                ny61.g("Failed requirement.");
                return;
            }
            if (vs10Var.a) {
                vs10Var.c.reset();
            }
            dphVar.write(yp6Var, yp6Var.b);
            dphVar.flush();
            if (yp6Var2.Q(yp6Var2.b - r11.h(), ws10.a)) {
                long j = yp6Var2.b - 4;
                yp6.a w = yp6Var2.w(j.a);
                try {
                    w.a(j);
                    w.close();
                } finally {
                }
            } else {
                yp6Var2.e0(0);
            }
            yp6Var.write(yp6Var2, yp6Var2.b);
            i2 = i | 192;
        }
        long j2 = yp6Var.b;
        yp6 yp6Var3 = this.z;
        yp6Var3.e0(i2);
        if (j2 <= 125) {
            yp6Var3.e0(((int) j2) | 128);
        } else if (j2 <= 65535) {
            yp6Var3.e0(254);
            yp6Var3.u0((int) j2);
        } else {
            yp6Var3.e0(255);
            yp6Var3.q0(j2);
        }
        Random random = this.b;
        byte[] bArr = this.C;
        random.nextBytes(bArr);
        yp6Var3.m968write(bArr);
        if (j2 > 0) {
            yp6.a aVar = this.D;
            yp6Var.w(aVar);
            aVar.c(0L);
            hk41.a(aVar, bArr);
            aVar.close();
        }
        yp6Var3.write(yp6Var, j2);
        this.a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vs10 vs10Var = this.B;
        if (vs10Var != null) {
            yf61.b(vs10Var);
        }
        yf61.b(this.a);
    }
}
