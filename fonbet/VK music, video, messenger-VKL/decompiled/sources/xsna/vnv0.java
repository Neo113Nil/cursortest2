package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class vnv0 implements izs {
    public final /* synthetic */ mov0 b;
    public final /* synthetic */ fhx0 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ bqu0 e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ vnv0(mov0 mov0Var, fhx0 fhx0Var, long j, bqu0 bqu0Var, boolean z) {
        this.b = mov0Var;
        this.c = fhx0Var;
        this.d = j;
        this.e = bqu0Var;
        this.f = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        final int i = this.c.a;
        mov0 mov0Var = this.b;
        io.reactivex.rxjava3.disposables.b bVar = mov0Var.b;
        final long j = this.d;
        hg1.e(bVar, new io.reactivex.rxjava3.internal.operators.maybe.u(zq70.D(new rw80(new izs() { // from class: xsna.bov0
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                zen0 d = vdx0Var.d();
                int i2 = i;
                return d.i(i2, j).l(new i630(new owa(i2, 1), 22));
            }
        }), 1000L), new wii0(lov0.b, 16)).subscribe(new o330(new fov0(mov0Var, i, this.f), 28), new dpo0(new efr0(mov0Var, 12), 8), new o0s(this.e, 4)));
        return s3q0.a;
    }
}
