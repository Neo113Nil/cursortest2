package com.yandex.go.promocodes.referral.impl.data;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.promocodes.referral.impl.net.experiments.ReferralGiftButtonExperiment;
import defpackage.ha2;
import defpackage.jbh;
import defpackage.lni0;
import defpackage.rqo;
import defpackage.scc;
import defpackage.tpr;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;

/* loaded from: classes8.dex */
public final class c {
    public final com.yandex.go.navigation.screen.c a;
    public final com.yandex.go.navigation.screen.b b;
    public final List c;
    public final ha2 d;

    public c(ru.yandex.taxi.badge.a aVar, com.yandex.go.navigation.screen.c cVar, rqo rqoVar, lni0 lni0Var) {
        this.a = cVar;
        com.yandex.go.navigation.screen.b c = cVar.c();
        this.b = c;
        this.c = scc.g(Screen.MAIN, Screen.SUMMARY, Screen.ROUTE_SELECTOR, Screen.CHOOSE_B);
        this.d = e.m(new o((tpr) lni0Var.d.getValue(), new ReferralGiftStateRepositoryImpl$ongoingAvailabilityStateFlow$1(3, null)), e.t(new n(new b(new o(aVar.a(), new ReferralGiftStateRepositoryImpl$badgeButtonAvailabilityFlow$1(3, null))), new ReferralGiftStateRepositoryImpl$badgeButtonAvailabilityFlow$3(2, null))), new o(((jbh) rqoVar).b(new ReferralGiftButtonExperiment(0)).c(), new ReferralGiftStateRepositoryImpl$experimentFlow$1(3, null)), c, new ReferralGiftStateRepositoryImpl$referralGiftVisibilityFlow$1(this, null));
    }
}
