package defpackage;

import com.yandex.go.scooters.misc.api.support.ScootersSupportEntryPoint;
import ru.yandex.taxi.scooters.presentation.detailed_order.v2.a;

/* loaded from: classes6.dex */
public final class fgn0 implements lhn0 {
    public final /* synthetic */ a a;

    public fgn0(a aVar) {
        this.a = aVar;
    }

    public final void a(zuo0 zuo0Var) {
        r2p0 r2p0Var = new r2p0(new t2p0(zuo0Var.getSessionId(), zuo0Var.j(), zuo0Var.m(), zuo0Var.getNumber().a, zuo0Var instanceof ea90 ? "reservation" : f4b1.c(zuo0Var)), ScootersSupportEntryPoint.DETAILED_ORDER);
        a aVar = this.a;
        aVar.A((m950) aVar.J.get(), r2p0Var, sy60.Q2);
    }
}
