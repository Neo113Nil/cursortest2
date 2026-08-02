package defpackage;

/* loaded from: classes4.dex */
public final class phx extends o2 {
    public l2 a = new l2(3);
    public yq80 b;
    public w2 c;
    public xr1 w;
    public i3 x;

    public phx(yq80 yq80Var, dqf dqfVar, xr1 xr1Var, jqf jqfVar) {
        this.b = yq80Var;
        this.c = dqfVar;
        this.w = xr1Var;
        this.x = jqfVar;
    }

    public static phx m(s3 s3Var) {
        yq80 yq80Var;
        i3 y = i3.y(s3Var, false);
        if (y == null) {
            return null;
        }
        i3 z = i3.z(y);
        phx phxVar = new phx();
        phxVar.a = (l2) z.A(0);
        o2 y2 = ((s3) z.A(1)).y();
        int i = 2;
        if (y2 == null || (y2 instanceof yq80)) {
            yq80Var = (yq80) y2;
        } else if (y2 instanceof p0x) {
            yq80Var = new yq80((p0x) y2);
        } else {
            if (!(y2 instanceof i3)) {
                if (y2 instanceof s3) {
                    s3 s3Var2 = (s3) y2;
                    if (s3Var2.l(0)) {
                        xyu0 m = xyu0.m((w2) w2.b.Hg(s3Var2, false));
                        yq80 yq80Var2 = new yq80();
                        yq80Var2.a = new oqf(2, 128, 0, m, 0);
                        yq80Var = yq80Var2;
                    } else if (s3Var2.l(1)) {
                        yq80Var = new yq80(new ar80((i3) i3.b.Hg(s3Var2, false)));
                    }
                }
                ny61.g("Invalid OriginatorIdentifierOrKey: ".concat(y2.getClass().getName()));
                return null;
            }
            yq80Var = new yq80(p0x.m(y2));
        }
        phxVar.b = yq80Var;
        if (z.A(2) instanceof s3) {
            phxVar.c = w2.u((s3) z.A(2), true);
            i = 3;
        }
        phxVar.w = xr1.m(z.A(i));
        phxVar.x = (i3) z.A(i + 1);
        return phxVar;
    }

    @Override // defpackage.a2
    public final b3 toASN1Primitive() {
        c2 c2Var = new c2(5);
        c2Var.a(this.a);
        c2Var.a(new oqf(true, 0, this.b, 0));
        w2 w2Var = this.c;
        if (w2Var != null) {
            c2Var.a(new oqf(true, 1, w2Var, 0));
        }
        c2Var.a(this.w);
        c2Var.a(this.x);
        return new jqf(c2Var);
    }
}
