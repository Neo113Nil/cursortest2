package defpackage;

import com.yandex.go.scooters.misc.api.support.ScootersSupportEntryPoint;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.a;

/* loaded from: classes6.dex */
public final class p9n0 implements ujn0 {
    public final /* synthetic */ a a;
    public final /* synthetic */ zuo0 b;
    public final /* synthetic */ j6m0 c;
    public final /* synthetic */ sls w;
    public final /* synthetic */ sls x;

    public p9n0(a aVar, zuo0 zuo0Var, j6m0 j6m0Var, sls slsVar, sls slsVar2) {
        this.a = aVar;
        this.b = zuo0Var;
        this.c = j6m0Var;
        this.w = slsVar;
        this.x = slsVar2;
    }

    @Override // defpackage.sy60
    public final void a() {
        sls slsVar = this.x;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // defpackage.ujn0
    public final void k() {
        a aVar = this.a;
        m950 m950Var = (m950) aVar.H.get();
        zuo0 zuo0Var = this.b;
        aVar.A(m950Var, new r2p0(new t2p0(zuo0Var.getSessionId(), zuo0Var.j(), zuo0Var.m(), zuo0Var.getNumber().a, zuo0Var instanceof ea90 ? "reservation" : f4b1.c(zuo0Var)), ScootersSupportEntryPoint.COMPLETION_PHOTO), sy60.Q2);
    }

    @Override // defpackage.ujn0
    public final void y0() {
        this.c.invoke();
    }

    @Override // defpackage.ujn0
    public final void z0() {
        sls slsVar = this.w;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }
}
