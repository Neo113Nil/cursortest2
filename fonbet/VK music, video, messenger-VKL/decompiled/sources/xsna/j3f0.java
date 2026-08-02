package xsna;

/* compiled from: ReactionsFeatureDependenciesImpl.kt */
/* loaded from: classes.dex */
public final class j3f0 {
    public final eaw a;
    public final bpn0 b;
    public final bpn0 c;
    public final bpn0 d = new bpn0(new lq6(4));
    public final bpn0 e;

    public j3f0(final a1w a1wVar, gx8 gx8Var, eaw eawVar) {
        this.a = eawVar;
        this.b = new bpn0(new rhx(a1wVar, this, gx8Var, 1));
        this.c = new bpn0(new gzs() { // from class: xsna.i3f0
            @Override // xsna.gzs
            public final Object invoke() {
                return new uaw(a1w.this, (cbw) this.b.getValue());
            }
        });
        this.e = new bpn0(new g58(a1wVar, this));
    }

    public final uaw a() {
        return (uaw) this.c.getValue();
    }

    public final yab b() {
        return (yab) this.e.getValue();
    }

    public final cbw c() {
        return (cbw) this.b.getValue();
    }

    public final m5f0 d() {
        return (m5f0) this.d.getValue();
    }

    public final xyt e(llp llpVar) {
        return new xyt(h(llpVar), (cbw) this.b.getValue(), (uaw) this.c.getValue());
    }

    public final v1f0 f(llp llpVar) {
        return new v1f0(h(llpVar), (cbw) this.b.getValue(), (uaw) this.c.getValue());
    }

    public final ebw g(llp llpVar) {
        return new ebw(h(llpVar), (uaw) this.c.getValue());
    }

    public final hbw h(llp llpVar) {
        return new hbw((a1w) llpVar, b(), this.a);
    }
}
