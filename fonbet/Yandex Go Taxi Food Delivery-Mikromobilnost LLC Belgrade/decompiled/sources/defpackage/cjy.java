package defpackage;

/* loaded from: classes8.dex */
public final class cjy extends sku {
    @Override // defpackage.sku
    public final vku a(po6 po6Var) {
        return new djy(this.a, po6Var);
    }

    @Override // defpackage.sku
    public final po6 c() {
        int i = 1;
        po6 po6Var = new po6(this.e + 1);
        double d = this.c;
        double d2 = this.d;
        int a = po6Var.a();
        while (true) {
            int[] iArr = po6Var.a;
            if (i >= a) {
                iArr[po6Var.a()] = Integer.MAX_VALUE;
                po6Var.b = po6Var.b();
                return po6Var;
            }
            iArr[i] = (int) (((((i - 1) * d2) + (((a - 1) - i) * d)) / (a - 2)) + 0.5d);
            i++;
        }
    }
}
