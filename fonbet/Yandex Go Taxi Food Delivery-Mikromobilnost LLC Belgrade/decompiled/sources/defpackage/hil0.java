package defpackage;

import java.util.Locale;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class hil0 implements wil0 {
    public static final int[] h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public final vil0 a;
    public final boolean b;
    public final int c;
    public g001 d;
    public long e;
    public long f;
    public int g;

    public hil0(vil0 vil0Var) {
        this.a = vil0Var;
        String str = vil0Var.c.n;
        str.getClass();
        this.b = "audio/amr-wb".equals(str);
        this.c = vil0Var.b;
        this.e = -9223372036854775807L;
        this.g = -1;
        this.f = 0L;
    }

    @Override // defpackage.wil0
    public final void a(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.wil0
    public final void b(long j) {
        this.e = j;
    }

    @Override // defpackage.wil0
    public final void c(ef90 ef90Var, long j, int i2, boolean z) {
        int a;
        d6z.z(this.d);
        int i3 = this.g;
        if (i3 != -1 && i2 != (a = sil0.a(i3))) {
            int i4 = tw21.a;
            Locale locale = Locale.US;
            lk91.j("Received RTP packet with unexpected sequence number. Expected: " + a + "; received: " + i2 + Extension.DOT_CHAR);
        }
        ef90Var.L(1);
        int h2 = (ef90Var.h() >> 3) & 15;
        boolean z2 = (h2 >= 0 && h2 <= 8) || h2 == 15;
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        boolean z3 = this.b;
        sb.append(z3 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(h2);
        d6z.k(sb.toString(), z2);
        int i5 = z3 ? i[h2] : h[h2];
        int a2 = ef90Var.a();
        d6z.k("compound payload not supported currently", a2 == i5);
        this.d.a(ef90Var, a2, 0);
        this.d.c(qva1.d(this.c, this.f, j, this.e), 1, a2, 0, null);
        this.g = i2;
    }

    @Override // defpackage.wil0
    public final void d(d5p d5pVar, int i2) {
        g001 B = d5pVar.B(i2, 1);
        this.d = B;
        B.d(this.a.c);
    }
}
