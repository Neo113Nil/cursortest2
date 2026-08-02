package defpackage;

import com.yandex.go.taxi.order.controller.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class mq70 implements nw7 {
    public final /* synthetic */ TaxiOrder a;
    public final /* synthetic */ a b;
    public final /* synthetic */ qq70 c;

    public mq70(TaxiOrder taxiOrder, a aVar, qq70 qq70Var) {
        this.a = taxiOrder;
        this.b = aVar;
        this.c = qq70Var;
    }

    @Override // defpackage.nw7
    public final Object a(v780 v780Var, Continuation continuation) {
        DriveState driveState = this.a.h.b;
        this.b.t.b(v780Var.a);
        this.a.X(v780Var);
        this.b.h.g(this.a);
        this.b.A.f(this.a);
        a aVar = this.b;
        DriveState driveState2 = v780Var.a.i;
        qq70 qq70Var = this.c;
        o2y0 o2y0Var = aVar.c;
        if (driveState2 == DriveState.CANCELLED) {
            aVar.e(new sd30(12, qq70Var, driveState));
        } else {
            aVar.n.a(o2y0Var);
            if (driveState2 != null) {
                o2y0Var.b().T(driveState2);
                aVar.h.g(o2y0Var.b());
                qq70Var.g(driveState2);
            } else {
                qq70Var.g(driveState);
            }
        }
        this.b.u.d(v780Var.a.Y);
        return zy11.a;
    }

    @Override // defpackage.nw7
    public final void onError(Throwable th) {
        a aVar = this.b;
        a3y0 a3y0Var = aVar.G;
        String l = a3y0Var.l(new String[]{"cancelOrderBasedOnDriveState", "onError"});
        hst hstVar = jst.e;
        String str = a3y0Var.a;
        ist m = hstVar.m(l);
        ke00 a = m.b.a();
        if (a != null && a.b(15)) {
            a.a(15, str, th, "Failed to cancel order", m.a);
        }
        aVar.i("cancelFailed");
        aVar.n.a(aVar.c);
        this.c.g(DriveState.FAILED);
    }
}
