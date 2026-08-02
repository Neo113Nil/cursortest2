package defpackage;

/* loaded from: classes4.dex */
public final class e4x0 extends o2 {
    public static final l2 w = new l2(0);
    public l2 a;
    public jqf b;
    public gzo c;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(4);
        l2 l2Var = this.a;
        int i = 0;
        boolean z = true;
        if (!l2Var.q(w)) {
            c2Var.a(new oqf(z, i, l2Var, i));
        }
        c2Var.a(this.b);
        gzo gzoVar = this.c;
        if (gzoVar != null) {
            c2Var.a(new oqf(z, 2, gzoVar, i));
        }
        return new jqf(c2Var);
    }
}
