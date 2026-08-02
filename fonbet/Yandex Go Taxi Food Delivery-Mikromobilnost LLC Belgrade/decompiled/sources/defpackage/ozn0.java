package defpackage;

import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName;
import com.yandex.go.scooters.mosru.c;

/* loaded from: classes13.dex */
public final class ozn0 implements ypm0 {
    public final /* synthetic */ c a;
    public final /* synthetic */ qzn0 b;

    public ozn0(c cVar, qzn0 qzn0Var) {
        this.a = cVar;
        this.b = qzn0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        c cVar = this.a;
        cVar.G.b(qtb1.O);
        cVar.r(new vkn0(29));
    }

    @Override // defpackage.ypm0
    public final void c1() {
        c cVar = this.a;
        czn0 czn0Var = cVar.G;
        czn0Var.b(new syn0(ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName.AUTHORIZE));
        czn0Var.b(qtb1.O);
        qzn0 qzn0Var = this.b;
        c.Q(cVar, (vzn0) qzn0Var.a.d.c, qzn0Var.d);
    }

    @Override // defpackage.ypm0
    public final void onCancel() {
        c cVar = this.a;
        czn0 czn0Var = cVar.G;
        czn0Var.b(new syn0(ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName.CLOSE));
        czn0Var.b(qtb1.O);
        qzn0 qzn0Var = this.b;
        s6k0 s6k0Var = qzn0Var.a.e;
        c.Q(cVar, s6k0Var != null ? (vzn0) s6k0Var.c : null, qzn0Var.d);
    }
}
