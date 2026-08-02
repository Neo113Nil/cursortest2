package defpackage;

/* loaded from: classes4.dex */
public final class bwj0 extends o2 {
    public static final l2 z = new l2(0);
    public boolean a;
    public l2 b;
    public bvj0 c;
    public g2 w;
    public i3 x;
    public gzo y;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        l2 l2Var = this.b;
        c2 c2Var = new c2(5);
        int i = 0;
        boolean z2 = true;
        char c = 1;
        char c2 = 1;
        if (this.a || !l2Var.q(z)) {
            c2Var.a(new oqf(c == true ? 1 : 0, i, l2Var, i));
        }
        c2Var.a(this.c);
        c2Var.a(this.w);
        c2Var.a(this.x);
        gzo gzoVar = this.y;
        if (gzoVar != null) {
            c2Var.a(new oqf(z2, c2 == true ? 1 : 0, gzoVar, i));
        }
        return new jqf(c2Var);
    }
}
