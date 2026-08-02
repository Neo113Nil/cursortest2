package defpackage;

import java.io.InputStream;

/* loaded from: classes4.dex */
public final class cwf extends wd4 {
    public final boolean w;

    public cwf(int i, int i2, boolean z, o3 o3Var) {
        super(i, i2, o3Var);
        this.w = z;
    }

    @Override // defpackage.wd4, defpackage.mlv
    public final b3 a() {
        boolean z = this.w;
        o3 o3Var = this.c;
        int i = this.a;
        int i2 = this.b;
        if (!z) {
            return new oqf(4, i, i2, new dqf(((cph) ((InputStream) o3Var.w)).c()), 1);
        }
        c2 I = o3Var.I();
        return I.b == 1 ? new oqf(3, i, i2, I.c(0), 1) : new oqf(4, i, i2, tvf.a(I), 1);
    }

    @Override // defpackage.wd4, defpackage.t3
    public final a2 g() {
        if (this.w) {
            return this.c.G();
        }
        ny61.v("Explicit tags must be constructed (see X.690 8.14.2)");
        return null;
    }

    @Override // defpackage.wd4, defpackage.t3
    public final a2 j(int i) {
        boolean z = this.w;
        o3 o3Var = this.c;
        return z ? o3Var.C(i) : o3Var.E(i, (cph) ((InputStream) o3Var.w));
    }
}
