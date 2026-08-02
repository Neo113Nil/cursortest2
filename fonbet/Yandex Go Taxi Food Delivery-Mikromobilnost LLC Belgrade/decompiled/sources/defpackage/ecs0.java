package defpackage;

/* loaded from: classes4.dex */
public final class ecs0 extends o2 {
    public i3 a;
    public i3 b;

    public static ecs0 m(a2 a2Var) {
        if (a2Var == null || (a2Var instanceof ecs0)) {
            return (ecs0) a2Var;
        }
        if (a2Var instanceof i3) {
            i3 i3Var = (i3) a2Var;
            ecs0 ecs0Var = new ecs0();
            if (i3Var.size() >= 1 && i3Var.size() <= 2) {
                ecs0Var.a = i3.z(i3Var.A(0));
                if (i3Var.size() > 1) {
                    ecs0Var.b = i3.z(i3Var.A(1));
                }
                return ecs0Var;
            }
            ny61.g(vfc.n(i3Var, new StringBuilder("Bad sequence size: ")));
        }
        return null;
    }

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
