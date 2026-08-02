package defpackage;

import com.yandex.go.scooters.misc.api.support.ScootersSupportEntryPoint;
import ru.yandex.taxi.scooters.domain.model.ScootersEvolvingFailedException;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.a;

/* loaded from: classes6.dex */
public final class gan0 implements ujn0 {
    public final /* synthetic */ a a;
    public final /* synthetic */ ScootersEvolvingFailedException b;
    public final /* synthetic */ zuo0 c;

    public gan0(a aVar, ScootersEvolvingFailedException scootersEvolvingFailedException, zuo0 zuo0Var) {
        this.a = aVar;
        this.b = scootersEvolvingFailedException;
        this.c = zuo0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.ujn0
    public final void k() {
        zuo0 zuo0Var = this.c;
        r2p0 r2p0Var = new r2p0(new t2p0(zuo0Var.getSessionId(), zuo0Var.j(), zuo0Var.m(), zuo0Var.getNumber().a, zuo0Var instanceof ea90 ? "reservation" : f4b1.c(zuo0Var)), ScootersSupportEntryPoint.DETAILED_ORDER);
        a aVar = this.a;
        aVar.A((m950) aVar.E.get(), r2p0Var, new p4g0(aVar, 5));
    }

    @Override // defpackage.ujn0
    public final void y0() {
        this.a.r(new v1n0(10));
    }

    @Override // defpackage.ujn0
    public final void z0() {
        ScootersEvolvingFailedException scootersEvolvingFailedException = this.b;
        lto0 riskyParkingMessage = scootersEvolvingFailedException.getRiskyParkingMessage();
        a.Q(this.a, true, new z5o0(this.c), scootersEvolvingFailedException.getNearestParkingGeo(), riskyParkingMessage != null ? riskyParkingMessage.b : null, riskyParkingMessage != null, null, 32);
    }
}
