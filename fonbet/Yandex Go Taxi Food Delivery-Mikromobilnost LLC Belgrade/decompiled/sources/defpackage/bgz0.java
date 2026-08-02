package defpackage;

import com.yandex.go.taxi.order.feedback.domain.b;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class bgz0 {
    public final tse a;
    public final dm21 b;
    public final o2y0 c;
    public final wze0 d;
    public final tgz0 e;
    public final orq f;
    public final xdf g;
    public final ufz0 h;
    public final yvf0 i;
    public final uio0 j;
    public final oep0 k;
    public final a3y0 l = new a3y0(TaxiOrderLogGroup.FEEDBACK.getTag(), "TipsInteractor");
    public final r0 m = bvf0.c(null);
    public final n0 n = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    public pzt0 o;

    public bgz0(tse tseVar, dm21 dm21Var, o2y0 o2y0Var, wze0 wze0Var, tgz0 tgz0Var, orq orqVar, xdf xdfVar, ufz0 ufz0Var, yvf0 yvf0Var, uio0 uio0Var, oep0 oep0Var) {
        this.a = tseVar;
        this.b = dm21Var;
        this.c = o2y0Var;
        this.d = wze0Var;
        this.e = tgz0Var;
        this.f = orqVar;
        this.g = xdfVar;
        this.h = ufz0Var;
        this.i = yvf0Var;
        this.j = uio0Var;
        this.k = oep0Var;
    }

    public final void a() {
        o2y0 o2y0Var = this.c;
        TaxiOrder b = o2y0Var.b();
        ufz0 ufz0Var = this.h;
        if (ufz0Var.a(b)) {
            ((pep0) this.k).f(new xx70(this.i, new pxy0(6, this), 13), o2y0Var.b(), hxx.a);
            vfz0 vfz0Var = ufz0Var.a;
            vfz0Var.a.setValue(vfz0Var, vfz0.b[0], 0);
        }
    }

    public final void b(String str, TipsType tipsType) {
        String str2 = this.c.b().a;
        isq isqVar = new isq(this.c.b().a, ((b) this.b).b(str2));
        isqVar.h = str;
        isqVar.g = tipsType;
        isqVar.i = true;
        DriveState driveState = this.c.b().h.b;
        DriveState driveState2 = DriveState.COMPLETE;
        dm21 dm21Var = this.b;
        if (driveState == driveState2) {
            ((b) dm21Var).d(str2, new ksq(isqVar));
        } else {
            ((b) dm21Var).c(new ksq(isqVar), true);
        }
    }

    public final OrderStatusInfo.TipsSuggestions c() {
        return this.c.b().V().E;
    }
}
