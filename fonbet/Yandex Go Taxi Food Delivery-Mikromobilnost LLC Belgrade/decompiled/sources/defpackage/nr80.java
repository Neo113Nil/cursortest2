package defpackage;

/* loaded from: classes4.dex */
public final class nr80 extends o2 {
    public i3 a;
    public i3 b;

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(2);
        c2Var.a(this.a);
        i3 i3Var = this.b;
        if (i3Var != null) {
            c2Var.a(i3Var);
        }
        return new jqf(c2Var);
    }
}
