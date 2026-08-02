package com.ybsdk.screens.notice.presentation;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupNoticeScreenLoadedResult;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import defpackage.ds31;
import defpackage.j3h;
import defpackage.nhz0;
import defpackage.pz40;
import defpackage.s2u0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.z94;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c extends uc5 {
    public final String B;
    public final TopupValueEntity C;
    public final AppAnalyticsReporter D;
    public final j3h E;
    public final tfl0 F;
    public final com.ybsdk.screens.notice.data.a G;

    public c(String str, TopupValueEntity topupValueEntity, AppAnalyticsReporter appAnalyticsReporter, j3h j3hVar, tfl0 tfl0Var, com.ybsdk.screens.notice.data.a aVar) {
        super(new nhz0(11), new s2u0(16));
        this.B = str;
        this.C = topupValueEntity;
        this.D = appAnalyticsReporter;
        this.E = j3hVar;
        this.F = tfl0Var;
        this.G = aVar;
        b0();
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        this.D.o0.a.a("topup_notice.screen.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        tje.N(ds31.a(this), null, null, new TopupNoticeViewModel$loadData$2(this, null), 3);
    }

    public final void c0() {
        this.D.o0.a.a("topup_notice.screen.closed", null);
        this.F.e();
    }

    public final void d0(TopupEvents$TopupNoticeScreenLoadedResult topupEvents$TopupNoticeScreenLoadedResult, String str) {
        z94 z94Var = this.D.o0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(2);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, topupEvents$TopupNoticeScreenLoadedResult.getOriginalValue());
        if (str != null) {
            linkedHashMap.put("error", str);
        }
        z94Var.a.a("topup_notice.screen.loaded", linkedHashMap);
    }
}
