package com.yandex.go.taxi.order.feedback.domain;

import com.yandex.go.feedback_common.data.model.FeedbackParam;
import com.yandex.go.feedback_common.services.d;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import com.yandex.go.taxi.order.models.api.response.FeedbackDto;
import com.yandex.go.taxi.order.q;
import defpackage.avu0;
import defpackage.dl01;
import defpackage.dm21;
import defpackage.em21;
import defpackage.evu0;
import defpackage.jqr;
import defpackage.jsq;
import defpackage.jtq0;
import defpackage.ksq;
import defpackage.l8x;
import defpackage.lz40;
import defpackage.of11;
import defpackage.pz40;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wx11;
import defpackage.ycs0;
import defpackage.ysg;
import defpackage.yu0;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.order.feedback.FeedbackStrategy;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes8.dex */
public final class b implements dm21 {
    public final tse a;
    public final ysg b;
    public final d c;
    public final q d;
    public final jtq0 e;
    public final h f;
    public final FeedbackStrategy g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ycs0 j = new ycs0(0);

    public b(tse tseVar, ysg ysgVar, d dVar, q qVar, jtq0 jtq0Var, h hVar, FeedbackStrategy feedbackStrategy) {
        this.a = tseVar;
        this.b = ysgVar;
        this.c = dVar;
        this.d = qVar;
        this.e = jtq0Var;
        this.f = hVar;
        this.g = feedbackStrategy;
    }

    public final tpr a(String str) {
        return (tpr) this.h.computeIfAbsent(str, new em21(0, new dl01(24, this, str)));
    }

    public final ksq b(String str) {
        pz40 pz40Var = (pz40) this.h.get(str);
        if (pz40Var != null) {
            return (ksq) ((r0) pz40Var).getValue();
        }
        TaxiOrder a = this.b.a(str);
        if (a == null) {
            return jsq.b(str);
        }
        ksq a2 = jsq.a(a);
        d(str, a2);
        return a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(ksq ksqVar, boolean z) {
        String Hg = this.f.Hg();
        if (Hg == null) {
            return;
        }
        FeedbackParam.a aVar = new FeedbackParam.a();
        aVar.a = Hg;
        String str = ksqVar.a;
        String str2 = ksqVar.j;
        int i = ksqVar.i;
        TipsType tipsType = ksqVar.g;
        boolean z2 = ksqVar.e;
        String str3 = ksqVar.f;
        aVar.d = str;
        if (i > 0) {
            aVar.c = Integer.valueOf(i);
        }
        aVar.e = str2;
        aVar.h = ksqVar.l;
        aVar.i = ksqVar.k;
        Integer num = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        aVar.g = this.e.b(null);
        FeedbackStrategy feedbackStrategy = this.g;
        feedbackStrategy.xe(aVar, ksqVar);
        if (z && z2) {
            if (str3 == null) {
                str3 = "";
            }
            aVar.b = new Tips(str3, tipsType);
        } else if (!z && z2 && str3 != null && str3.length() != 0) {
            Float j = avu0.j(str3);
            if ((j != null ? j.floatValue() : -1.0f) >= 0.0f) {
                aVar.b = new Tips(str3, tipsType);
            }
        }
        FeedbackParam.Companion.getClass();
        FeedbackParam a = com.yandex.go.feedback_common.data.model.a.a(aVar);
        if (z) {
            this.d.b(a);
        } else {
            String str4 = a.d;
            lz40 lz40Var = (lz40) this.i.computeIfAbsent(str4, new yu0(28, new of11(25)));
            ycs0 ycs0Var = this.j;
            l8x l8xVar = (l8x) ycs0Var.get(str4);
            if (l8xVar == null || !l8xVar.isActive()) {
                ycs0Var.replace(str4, com.yandex.go.coroutines.b.h(this.a, new jqr(new k(e.N(lz40Var, 1000L), new UserFeedbackRepositoryImpl$addFeedbackTask$1(this, str4, null)), new UserFeedbackRepositoryImpl$addFeedbackTask$2(this, null), 3)));
            }
            lz40Var.g(a);
        }
        FeedbackDto a2 = FeedbackDto.a(feedbackStrategy.J1(new FeedbackDto(num, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, 31), ksqVar), Integer.valueOf(i), null, null, 30);
        if (str2 == null || evu0.J(str2)) {
            str2 = null;
        }
        FeedbackDto a3 = FeedbackDto.a(a2, null, str2, null, 29);
        ysg ysgVar = this.b;
        TaxiOrder a4 = ysgVar.a(str);
        if (a4 != null) {
            a4.P(a3);
            ysgVar.g(a4);
        }
        d(str, ksqVar);
    }

    public final void d(String str, ksq ksqVar) {
        ((r0) ((pz40) this.h.computeIfAbsent(str, new yu0(29, new wx11(12, ksqVar))))).l(ksqVar);
    }
}
