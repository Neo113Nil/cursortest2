package com.yandex.go.summary.interactor.core;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.deeplinks.generated.summary.SummarySection;
import defpackage.afv0;
import defpackage.egb1;
import defpackage.frl0;
import defpackage.lzu0;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.oiv0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.vje;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes6.dex */
public final class q implements vje {
    public final /* synthetic */ t a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ oiv0 c;

    public q(t tVar, tse tseVar, oiv0 oiv0Var) {
        this.a = tVar;
        this.b = tseVar;
        this.c = oiv0Var;
    }

    @Override // defpackage.vje
    public final Object a(Intent intent, Continuation continuation) {
        tls tlsVar;
        final t tVar = this.a;
        tVar.getClass();
        Uri data = intent.getData();
        if (data != null) {
            if ("requirement".equalsIgnoreCase(data.getAuthority())) {
                tlsVar = new SummaryLifecycleActionsInteractor$getIntentUriHandler$1(1, tVar.H.get(), ru.yandex.taxi.summary.deeplink.requirement.a.class, "handleRequirementDeeplink", "handleRequirementDeeplink(Landroid/net/Uri;)V", 0);
            } else if ("scheduleride".equalsIgnoreCase(data.getAuthority())) {
                tlsVar = new SummaryLifecycleActionsInteractor$getIntentUriHandler$2(1, tVar.I.get(), ru.yandex.taxi.scheduleride.deeplink.b.class, "handleDeeplink", "handleDeeplink(Landroid/net/Uri;)V", 0);
            } else if ("driver_instructions_on_summary".equalsIgnoreCase(data.getAuthority())) {
                final tse tseVar = this.b;
                tlsVar = new tls() { // from class: com.yandex.go.summary.interactor.core.j
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        tje.N(tse.this, null, null, new SummaryLifecycleActionsInteractor$getIntentUriHandler$3$1(tVar, null), 3);
                        return zy11.a;
                    }
                };
            } else if (egb1.c(data)) {
                tlsVar = new SummaryLifecycleActionsInteractor$getIntentUriHandler$4(1, tVar.C.get(), ru.yandex.taxi.summary.deeplink.b.class, "handleRedirectDeeplink", "handleRedirectDeeplink(Landroid/net/Uri;Lru/yandex/taxi/tariffs/model/SelectionOrigin;)V", 0);
            } else {
                afv0 r = frl0.C.r(data);
                tlsVar = null;
                if ((r != null ? r.a : null) == SummarySection.PRICE_INFO) {
                    tlsVar = new lzu0(4, this.c, data);
                }
            }
            if (tlsVar != null) {
                tlsVar.invoke(data);
                return new m5u(true, false);
            }
        }
        return n5u.a;
    }
}
