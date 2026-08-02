package defpackage;

import android.net.Uri;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.order.f;

/* loaded from: classes14.dex */
public final class gfk0 implements alk0 {
    public final /* synthetic */ ifk0 a;
    public final /* synthetic */ o2y0 b;

    public gfk0(ifk0 ifk0Var, o2y0 o2y0Var) {
        this.a = ifk0Var;
        this.b = o2y0Var;
    }

    @Override // defpackage.alk0
    public final void a(tls tlsVar) {
        ifk0 ifk0Var = this.a;
        ifk0Var.A((m950) ifk0Var.K.get(), this.b.b(), new ffk0(tlsVar));
    }

    @Override // defpackage.alk0
    public final void b(qim qimVar) {
        ifk0 ifk0Var = this.a;
        ifk0Var.A((m950) ifk0Var.G.get(), qimVar, sy60.Q2);
    }

    @Override // defpackage.alk0
    public final void c(o2y0 o2y0Var, bsq bsqVar) {
        ifk0 ifk0Var = this.a;
        ifk0Var.A((m950) ifk0Var.J.get(), new csq(o2y0Var, bsqVar), sy60.Q2);
    }

    @Override // defpackage.alk0
    public final void d(odf0 odf0Var) {
        ifk0 ifk0Var = this.a;
        ifk0Var.z((m950) ifk0Var.L.get(), new efk0(odf0Var));
    }

    @Override // defpackage.alk0
    public final void e(fmf fmfVar) {
        this.a.P(fmfVar);
    }

    @Override // defpackage.alk0
    public final void f() {
        ifk0 ifk0Var = this.a;
        ifk0Var.A((m950) ifk0Var.N.get(), this.b, new dfk0(ifk0Var, 0));
    }

    @Override // defpackage.alk0
    public final void g(String str) {
        wpc wpcVar = new wpc(eqc.b, 2);
        ifk0 ifk0Var = this.a;
        ifk0Var.A((m950) ifk0Var.T.get(), wpcVar, new cfk0(ifk0Var, this.b, str, 1));
    }

    @Override // defpackage.alk0
    public final void h(String str) {
        p0h p0hVar = (p0h) this.a.O.get();
        p0hVar.getClass();
        p0hVar.a.a(Uri.parse(str), DeeplinkSource.UNSPECIFIED);
    }

    @Override // defpackage.alk0
    public final void i() {
        ifk0 ifk0Var = this.a;
        tx70 tx70Var = (tx70) ifk0Var.Z.get();
        w030 w030Var = ifk0Var.D;
        w030Var.getClass();
        o2y0 o2y0Var = this.b;
        o2y0Var.getClass();
        s4g s4gVar = new s4g(tx70Var, 4);
        n3w a = n3w.a(o2y0Var);
        s4g s4gVar2 = new s4g(tx70Var, 5);
        ifk0Var.A(new by70(w030Var, new ge50((xvf0) s4gVar, (xvf0) a, (xvf0) new ut(s4gVar, a, s4gVar2, new s4g(tx70Var, 0), new s4g(tx70Var, 8), new s4g(tx70Var, 9), new s4g(tx70Var, 11), new s4g(tx70Var, 2), new s4g(tx70Var, 1), new s4g(tx70Var, 3), new s4g(tx70Var, 12), new s4g(tx70Var, 6), new s4g(tx70Var, 10), new ys10((xvf0) new f870(new s4g(tx70Var, 7), 14), (xvf0) new aos(a, 22), 27), 10), (xvf0) s4gVar2, 10, (byte) 0)), o2y0Var, new bfk0());
    }

    @Override // defpackage.alk0
    public final void j() {
        ((f) ((l2y0) this.a.I.get()).a).k0(this.b);
    }

    @Override // defpackage.alk0
    public final void l() {
        this.a.r(new qu(9));
    }
}
