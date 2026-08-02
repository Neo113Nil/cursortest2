package com.ybsdk.feature.card.internal.presentation.carddeletion;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.CardCommonEvents$CardUserBlockResultResult;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.feature.card.internal.interactors.c;
import com.ybsdk.feature.deeplink.api.DeeplinkNavigation;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import defpackage.ad8;
import defpackage.al8;
import defpackage.cd8;
import defpackage.ds31;
import defpackage.gd8;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.l3h;
import defpackage.pz40;
import defpackage.qn8;
import defpackage.rk6;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.w511;
import defpackage.zc8;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final c B;
    public final qn8 C;
    public final al8 D;
    public final AppAnalyticsReporter E;
    public final tfl0 F;
    public final CardDeletionScreenParams G;

    public a(c cVar, qn8 qn8Var, al8 al8Var, AppAnalyticsReporter appAnalyticsReporter, tfl0 tfl0Var, CardDeletionScreenParams cardDeletionScreenParams) {
        super(new rk6(20, cardDeletionScreenParams), new gd8(cardDeletionScreenParams.getCardManagementSettingTextMap()));
        this.B = cVar;
        this.C = qn8Var;
        this.D = al8Var;
        this.E = appAnalyticsReporter;
        this.F = tfl0Var;
        this.G = cardDeletionScreenParams;
        appAnalyticsReporter.k.a.a("card.user_block.warning", null);
    }

    public final void b0() {
        boolean shouldExitCardScenario = this.G.getShouldExitCardScenario();
        tfl0 tfl0Var = this.F;
        if (!shouldExitCardScenario) {
            tfl0Var.e();
            return;
        }
        int i = cd8.a[((zc8) X()).c.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        w511.b();
                        return;
                    }
                }
            }
            Z(ad8.a);
            return;
        }
        tfl0Var.e();
    }

    public final void c0(String str) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zc8.a((zc8) value, CardDeletionOperationState.IN_PROGRESS, null, 27)));
        this.E.k.a.a("card.user_block.initiated", null);
        tje.N(ds31.a(this), null, null, new CardDeletionViewModel$deleteCard$2(this, str, null), 3);
    }

    public final void d0() {
        b0();
    }

    public final void e0() {
        b0();
    }

    public final void f0() {
        int i = cd8.a[((zc8) X()).c.ordinal()];
        if (i == 1) {
            c0(null);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                c0(null);
            } else if (i == 4) {
                b0();
            } else {
                w511.b();
            }
        }
    }

    public final void g0(CardSecondFactorHelper$SecondFactorResult cardSecondFactorHelper$SecondFactorResult) {
        if (cardSecondFactorHelper$SecondFactorResult instanceof CardSecondFactorHelper$SecondFactorResult.VerificationToken) {
            c0(((CardSecondFactorHelper$SecondFactorResult.VerificationToken) cardSecondFactorHelper$SecondFactorResult).getVerificationToken());
        } else if (jl40.l(cardSecondFactorHelper$SecondFactorResult, CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE)) {
            this.E.k.j(CardCommonEvents$CardUserBlockResultResult.ERROR, "2fa canceled");
        } else {
            if (cardSecondFactorHelper$SecondFactorResult == null) {
                return;
            }
            w511.b();
        }
    }

    public final void h0() {
        String str = ((zc8) X()).e;
        com.ybsdk.di.modules.features.c cVar = (com.ybsdk.di.modules.features.c) this.D;
        if (str != null) {
            cVar.b(str);
            return;
        }
        ((l3h) ((j3h) cVar.a.get())).d(com.ybsdk.feature.deeplink.api.a.a(new DeeplinkAction.Support(null, null, 3, null), DeeplinkNavigation.Add.INSTANCE));
    }
}
