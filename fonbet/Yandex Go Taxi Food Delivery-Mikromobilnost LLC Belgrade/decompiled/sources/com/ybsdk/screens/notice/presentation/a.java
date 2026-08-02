package com.ybsdk.screens.notice.presentation;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import defpackage.a3h;
import defpackage.ds31;
import defpackage.g8e;
import defpackage.j3h;
import defpackage.l3h;
import defpackage.nhz0;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s2u0;
import defpackage.s8j0;
import defpackage.sls;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.vxz0;
import defpackage.w511;
import defpackage.w691;
import defpackage.x4c;
import defpackage.z94;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tfl0 B;
    public final com.ybsdk.screens.notice.data.a C;
    public final AppAnalyticsReporter D;
    public final a3h E;
    public final TopupValueEntity F;
    public final sls G;
    public final j3h H;

    public a(tfl0 tfl0Var, com.ybsdk.screens.notice.data.a aVar, AppAnalyticsReporter appAnalyticsReporter, a3h a3hVar, TopupValueEntity topupValueEntity, sls slsVar, j3h j3hVar) {
        super(new nhz0(10), new s2u0(15));
        this.B = tfl0Var;
        this.C = aVar;
        this.D = appAnalyticsReporter;
        this.E = a3hVar;
        this.F = topupValueEntity;
        this.G = slsVar;
        this.H = j3hVar;
        b0();
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        this.D.o0.a.a("small_screen_topup.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        tje.N(ds31.a(this), null, null, new TopupNoticeDeprecatedViewModel$invalidate$2(this, null), 3);
    }

    public final void c0() {
        this.D.o0.a.a("small_screen_topup.closed", null);
        this.B.e();
    }

    public final void d0() {
        BaseDeeplinkAction action;
        u8j0 u8j0Var = (u8j0) X();
        boolean z = u8j0Var instanceof r8j0;
        AppAnalyticsReporter appAnalyticsReporter = this.D;
        if (!z) {
            if (u8j0Var instanceof s8j0) {
                appAnalyticsReporter.o0.a.a("small_screen_topup.button_click", g8e.w(1, "action", "Retry"));
                b0();
                return;
            } else {
                if (u8j0Var instanceof t8j0) {
                    return;
                }
                w511.b();
                return;
            }
        }
        z94 z94Var = appAnalyticsReporter.o0;
        vxz0 vxz0Var = (vxz0) ((r8j0) u8j0Var).a;
        String str = vxz0Var.e;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        if (str != null) {
            linkedHashMap.put("action", str);
        }
        z94Var.a.a("small_screen_topup.button_click", linkedHashMap);
        BaseDeeplinkAction baseDeeplinkAction = null;
        try {
            Deeplink e = w691.e(this.E, Uri.parse(vxz0Var.e), true, null, false, 12);
            if (e != null && (action = e.getAction()) != null) {
                if (action instanceof DeeplinkAction.Topup) {
                    action = DeeplinkAction.Topup.copy$default((DeeplinkAction.Topup) action, null, false, null, null, true, null, false, false, null, null, null, 2031, null);
                }
                baseDeeplinkAction = action;
            }
        } catch (Throwable th) {
            x4c.g("Can't parse action in topup notice", th, String.valueOf(X()), null, 8);
        }
        if (baseDeeplinkAction == null) {
            TopupValueEntity topupValueEntity = this.F;
            baseDeeplinkAction = new DeeplinkAction.Topup(new DeeplinkAction.Topup.DepositAmount(topupValueEntity.getCurrency(), topupValueEntity.getMoney()), false, null, topupValueEntity.getTopupType(), true, null, false, false, null, null, null, 2022, null);
        }
        ((l3h) this.H).d(new Deeplink(baseDeeplinkAction, null, DeeplinkNavigation.ReplaceRoot.INSTANCE, null, null, null, false, false, 250, null));
    }
}
