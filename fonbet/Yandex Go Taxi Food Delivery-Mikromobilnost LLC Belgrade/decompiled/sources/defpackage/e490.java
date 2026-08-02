package defpackage;

/* loaded from: classes4.dex */
public final class e490 extends o2 {
    public l2 a;
    public d490 b;
    public s1 c;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(3);
        c2Var.a(this.a);
        d490 d490Var = this.b;
        if (d490Var != null) {
            c2Var.a(d490Var);
        }
        s1 s1Var = this.c;
        if (s1Var != null) {
            c2Var.a(s1Var);
        }
        return new jqf(c2Var);
    }
}
