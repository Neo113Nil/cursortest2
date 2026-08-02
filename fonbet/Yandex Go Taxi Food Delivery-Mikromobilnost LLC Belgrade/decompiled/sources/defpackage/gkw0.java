package defpackage;

/* loaded from: classes14.dex */
public final class gkw0 extends h55 {
    public final st0 D;

    public gkw0(st0 st0Var) {
        super(null);
        this.D = st0Var;
    }

    public static final void P(gkw0 gkw0Var, sy60 sy60Var, miw0 miw0Var, bu0 bu0Var, o2y0 o2y0Var) {
        if (miw0Var instanceof jiw0) {
            gkw0Var.A((bjw0) ((xvf0) bu0Var.g).get(), ((jiw0) miw0Var).a, new ekw0(gkw0Var, bu0Var, o2y0Var));
            return;
        }
        if (jl40.l(miw0Var, hiw0.a)) {
            sy60Var.a();
            return;
        }
        if (miw0Var instanceof eiw0) {
            gkw0Var.r(new lxo0(25, gkw0Var, o2y0Var, miw0Var));
            return;
        }
        if (jl40.l(miw0Var, giw0.a)) {
            gkw0Var.r(new nit(3, o2y0Var));
            return;
        }
        if (miw0Var instanceof iiw0) {
            gkw0Var.r(new ajw0(miw0Var, 2));
            return;
        }
        if (jl40.l(miw0Var, fiw0.a)) {
            gkw0Var.r(new nit(4, o2y0Var));
            return;
        }
        if (jl40.l(miw0Var, kiw0.a)) {
            gkw0Var.r(new nit(5, o2y0Var));
        } else if (miw0Var instanceof liw0) {
            gkw0Var.r(new lzu0(11, o2y0Var, miw0Var));
        } else {
            w511.b();
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        o2y0 o2y0Var = (o2y0) obj;
        st0 st0Var = this.D;
        st0Var.getClass();
        o2y0Var.getClass();
        bu0 bu0Var = new bu0();
        bu0Var.a = new qag(st0Var, 6);
        int i = 3;
        qag qagVar = new qag(st0Var, i);
        bu0Var.b = qagVar;
        qag qagVar2 = new qag(st0Var, 5);
        bu0Var.c = qagVar2;
        int i2 = 9;
        qag qagVar3 = new qag(st0Var, i2);
        bu0Var.d = qagVar3;
        bu0Var.e = n3w.a(new ziw0(new cjw0(qagVar, qagVar2, qagVar3)));
        xvf0 b = i5m.b(new uzu0(new qag(st0Var, 0), i2));
        bu0Var.f = b;
        int i3 = 2;
        bu0Var.g = i5m.b(new pso0((qag) bu0Var.a, (n3w) bu0Var.e, n3w.a(new fjw0(new y94(b))), i3));
        bu0Var.h = n3w.a(new pjw0(new vx0((qag) bu0Var.b, (qag) bu0Var.d, (qag) bu0Var.c)));
        n3w a = n3w.a(o2y0Var);
        qag qagVar4 = new qag(st0Var, 1);
        qag qagVar5 = new qag(st0Var, 4);
        qag qagVar6 = new qag(st0Var, 7);
        qag qagVar7 = new qag(st0Var, i3);
        int i4 = 22;
        xvf0 b2 = i5m.b(new pso0((qag) bu0Var.a, (n3w) bu0Var.h, n3w.a(new sjw0(new zxs0(new miv0(i5m.b(new u6o0(a, qagVar4, new uzu0(new y2s0(qagVar5, qagVar6, qagVar7, i4), 10), (qag) bu0Var.c, new qag(st0Var, 8), qagVar6)), i4), (xvf0) bu0Var.f))), i));
        bu0Var.i = b2;
        A((tjw0) b2.get(), o2y0Var, new fkw0(this, bu0Var, o2y0Var));
    }
}
