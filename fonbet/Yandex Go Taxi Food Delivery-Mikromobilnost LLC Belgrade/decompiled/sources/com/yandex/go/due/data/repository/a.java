package com.yandex.go.due.data.repository;

import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest;
import com.yandex.go.due.experiment.MulticlassPreorderExperiment;
import com.yandex.go.experiments.zoneinfo.ScheduledOrderExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import com.yandex.go.zone.repository.o;
import defpackage.b580;
import defpackage.d0l0;
import defpackage.dbl0;
import defpackage.dqe0;
import defpackage.fn21;
import defpackage.gay0;
import defpackage.i3y;
import defpackage.jbh;
import defpackage.jn40;
import defpackage.jst;
import defpackage.lr40;
import defpackage.lv90;
import defpackage.mdh;
import defpackage.now;
import defpackage.ny61;
import defpackage.on2;
import defpackage.pex0;
import defpackage.pp40;
import defpackage.qbl0;
import defpackage.qqo;
import defpackage.rfa0;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.xjg;
import defpackage.yal0;
import defpackage.yvf0;
import defpackage.zzk0;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes12.dex */
public final class a {
    public final tt2 a;
    public final dqe0 b;
    public final o c;
    public final fn21 d;
    public final qbl0 e;
    public final wiq0 f;
    public final yvf0 g;
    public final xjg h;
    public final pp40 i;
    public final i3y j;
    public final qqo k;

    public a(on2 on2Var, tt2 tt2Var, dqe0 dqe0Var, o oVar, fn21 fn21Var, qbl0 qbl0Var, wiq0 wiq0Var, yvf0 yvf0Var, xjg xjgVar, pp40 pp40Var, rqo rqoVar) {
        this.a = tt2Var;
        this.b = dqe0Var;
        this.c = oVar;
        this.d = fn21Var;
        this.e = qbl0Var;
        this.f = wiq0Var;
        this.g = yvf0Var;
        this.h = xjgVar;
        this.i = pp40Var;
        this.j = kotlin.a.a(new lr40(on2Var, 12));
        ScheduledOrderExperiment.Companion.getClass();
        this.k = ((jbh) rqoVar).c(new ScheduledOrderExperiment(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ScheduledOrderAvailabilityRequest a(ScheduledOrderAvailabilityRequest.ScheduledOrderView.Type type, ScheduledOrderAvailabilityRequest.OpenOrigin openOrigin, b580 b580Var) {
        List list;
        rfa0 rfa0Var;
        Boolean bool;
        now nowVar;
        Boolean bool2;
        String str;
        Set set;
        String Hg = ((h) this.d).Hg();
        if (Hg == null || Hg.length() == 0) {
            jst.e.x(new IllegalArgumentException(), "user id should not be empty");
        }
        pex0 m = ((k) this.f).m();
        if (m != null && m.K0 && ((MulticlassPreorderExperiment) this.i.a.b()).getB()) {
            jn40 jn40Var = m.V;
            list = (jn40Var == null || (set = jn40Var.f) == null) ? EmptyList.a : kotlin.collections.a.J0(set);
        } else {
            list = ((ScheduledOrderExperiment) this.k.b()).b;
        }
        List list2 = list;
        dbl0 b = this.e.b();
        yal0 yal0Var = b != null ? b.a : null;
        lv90 a = ((gay0) this.g.get()).b.a();
        if (a.a != null) {
            PaymentMethod$Type paymentMethod$Type = a.a;
            if (paymentMethod$Type == null) {
                ny61.g("Required value was null.");
                return null;
            }
            rfa0Var = new rfa0(paymentMethod$Type, a.b, (String) null, (Boolean) null, (List) null, 28);
        } else {
            rfa0Var = null;
        }
        if (openOrigin == ScheduledOrderAvailabilityRequest.OpenOrigin.INTERCITY_DASHBOARD) {
            bool2 = Boolean.TRUE;
        } else {
            if (yal0Var == null || (nowVar = yal0Var.o) == null) {
                bool = null;
                d0l0 d0l0Var = this.b.a.G;
                zzk0 zzk0Var = d0l0.Companion;
                List d = d0l0Var.d(false, false);
                Zone b2 = this.c.b();
                str = b2 == null ? b2.a : null;
                if (str == null) {
                    str = "";
                }
                return new ScheduledOrderAvailabilityRequest(d, str, list2, this.b.a.g(), bool, m == null ? m.b : null, type != null ? new ScheduledOrderAvailabilityRequest.ScheduledOrderView(type) : null, openOrigin, rfa0Var, this.h.d(b580Var));
            }
            bool2 = nowVar.a;
        }
        bool = bool2;
        d0l0 d0l0Var2 = this.b.a.G;
        zzk0 zzk0Var2 = d0l0.Companion;
        List d2 = d0l0Var2.d(false, false);
        Zone b22 = this.c.b();
        if (b22 == null) {
        }
        if (str == null) {
        }
        return new ScheduledOrderAvailabilityRequest(d2, str, list2, this.b.a.g(), bool, m == null ? m.b : null, type != null ? new ScheduledOrderAvailabilityRequest.ScheduledOrderView(type) : null, openOrigin, rfa0Var, this.h.d(b580Var));
    }

    public final Object b(ScheduledOrderAvailabilityRequest scheduledOrderAvailabilityRequest, SuspendLambda suspendLambda) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ScheduledOrderAvailabilityRepository$getAvailability$2(this, scheduledOrderAvailabilityRequest, null), suspendLambda);
    }
}
