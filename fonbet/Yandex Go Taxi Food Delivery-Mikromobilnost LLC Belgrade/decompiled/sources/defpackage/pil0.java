package defpackage;

import java.util.Locale;

/* loaded from: classes10.dex */
public final class pil0 implements wil0 {
    public int a;
    public int b;
    public int c;
    public long d;
    public long e;
    public final Object f;
    public Object g;

    public pil0(int i, int i2, qd81 qd81Var, int i3, Object obj, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.f = qd81Var;
        this.c = i3;
        this.g = obj;
        this.d = j;
        this.e = j2;
    }

    @Override // defpackage.wil0
    public void a(long j, long j2) {
        this.d = j;
        this.e = j2;
        this.c = 0;
    }

    @Override // defpackage.wil0
    public void b(long j) {
    }

    @Override // defpackage.wil0
    public void c(ef90 ef90Var, long j, int i, boolean z) {
        int i2;
        int a;
        d6z.z((g001) this.g);
        int i3 = this.b;
        if (i3 != -1 && i != (a = sil0.a(i3))) {
            int i4 = tw21.a;
            Locale locale = Locale.US;
            lk91.j("Received RTP packet with unexpected sequence number. Expected: " + a + "; received: " + i + ". Dropping packet.");
        }
        int a2 = ef90Var.a();
        ((g001) this.g).a(ef90Var, a2, 0);
        if (this.c == 0) {
            byte[] bArr = ef90Var.a;
            byte[] bArr2 = {0, 0, 1, -74};
            ffx.o(bArr, "array");
            int i5 = 0;
            loop0: while (true) {
                if (i5 >= bArr.length - 3) {
                    i5 = -1;
                    break;
                }
                for (int i6 = 0; i6 < 4; i6++) {
                    if (bArr[i5 + i6] != bArr2[i6]) {
                        break;
                    }
                }
                break loop0;
                i5++;
            }
            if (i5 != -1) {
                ef90Var.K(i5 + 4);
                if ((ef90Var.h() >> 6) == 0) {
                    i2 = 1;
                    this.a = i2;
                }
            }
            i2 = 0;
            this.a = i2;
        }
        this.c += a2;
        if (z) {
            if (this.d == -9223372036854775807L) {
                this.d = j;
            }
            ((g001) this.g).c(qva1.d(90000, this.e, j, this.d), this.a, this.c, 0, null);
            this.c = 0;
        }
        this.b = i;
    }

    @Override // defpackage.wil0
    public void d(d5p d5pVar, int i) {
        g001 B = d5pVar.B(i, 2);
        this.g = B;
        int i2 = tw21.a;
        B.d(((vil0) this.f).c);
    }

    public pil0(vil0 vil0Var) {
        this.f = vil0Var;
        this.d = -9223372036854775807L;
        this.b = -1;
    }
}
