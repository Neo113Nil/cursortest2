package com.ybsdk.feature.card.internal.presentation.processing;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.features.c;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.feature.card.internal.repositories.b;
import defpackage.al8;
import defpackage.bo8;
import defpackage.c06;
import defpackage.ds31;
import defpackage.g2r0;
import defpackage.j2r0;
import defpackage.jl40;
import defpackage.k2r0;
import defpackage.lo8;
import defpackage.owf;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r8j0;
import defpackage.rk6;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import defpackage.x4e;
import defpackage.yn8;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final b B;
    public final al8 C;
    public final tfl0 D;
    public final CardSetStatusScreenParams E;
    public pzt0 F;
    public boolean G;
    public final c06 H;

    public a(b bVar, al8 al8Var, tfl0 tfl0Var, yn8 yn8Var, CardSetStatusScreenParams cardSetStatusScreenParams) {
        super(new rk6(28, cardSetStatusScreenParams), new lo8());
        this.B = bVar;
        this.C = al8Var;
        this.D = tfl0Var;
        this.E = cardSetStatusScreenParams;
        this.H = new c06(cardSetStatusScreenParams, (AppAnalyticsReporter) ((owf) yn8Var.a.b).get());
    }

    public static void b0(a aVar, String str, int i) {
        r0 r0Var;
        Object value;
        if ((i & 1) != 0) {
            str = null;
        }
        pzt0 pzt0Var = aVar.F;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, bo8.a((bo8) value, new t8j0())));
        aVar.F = tje.N(ds31.a(aVar), null, null, new CardSetStatusProcessingViewModel$loadScreen$2(aVar, str, null, null), 3);
    }

    public final void c0(boolean z) {
        String closeAction;
        c06 c06Var = this.H;
        rt1 rt1Var = ((AppAnalyticsReporter) c06Var.b).k;
        CardSetStatusScreenParams cardSetStatusScreenParams = (CardSetStatusScreenParams) c06Var.a;
        rt1Var.a.a("card.reissue_deletion.screen.close", x4e.t(2, "action_type", cardSetStatusScreenParams.getSetCardStatusActionType(), "card_type", cardSetStatusScreenParams.getCardType()));
        k2r0 k2r0Var = (k2r0) ((bo8) X()).a.a();
        if (k2r0Var == null || (closeAction = k2r0Var.a()) == null) {
            closeAction = this.E.getCloseAction();
            u8j0 u8j0Var = ((bo8) X()).a;
            u8j0Var.getClass();
            if (!(u8j0Var instanceof s8j0) && !z) {
                closeAction = null;
            }
        }
        if (closeAction == null || !((c) this.C).a(closeAction)) {
            this.D.e();
        }
    }

    public final void e0() {
        g2r0 g2r0Var;
        u8j0 u8j0Var = ((bo8) X()).a;
        r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
        Object obj = r8j0Var != null ? (k2r0) r8j0Var.a : null;
        j2r0 j2r0Var = obj instanceof j2r0 ? (j2r0) obj : null;
        if (j2r0Var == null || (g2r0Var = j2r0Var.d) == null) {
            return;
        }
        ((c) this.C).a(g2r0Var.b);
    }

    public final void f0() {
        b0(this, null, 3);
    }

    public final void g0(CardSecondFactorHelper$SecondFactorResult cardSecondFactorHelper$SecondFactorResult) {
        if (cardSecondFactorHelper$SecondFactorResult instanceof CardSecondFactorHelper$SecondFactorResult.VerificationToken) {
            b0(this, ((CardSecondFactorHelper$SecondFactorResult.VerificationToken) cardSecondFactorHelper$SecondFactorResult).getVerificationToken(), 2);
        } else if (jl40.l(cardSecondFactorHelper$SecondFactorResult, CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE)) {
            c0(true);
        } else {
            if (cardSecondFactorHelper$SecondFactorResult == null) {
                return;
            }
            w511.b();
        }
    }

    public final void h0() {
        g2r0 g2r0Var;
        u8j0 u8j0Var = ((bo8) X()).a;
        r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
        Object obj = r8j0Var != null ? (k2r0) r8j0Var.a : null;
        j2r0 j2r0Var = obj instanceof j2r0 ? (j2r0) obj : null;
        if (j2r0Var == null || (g2r0Var = j2r0Var.e) == null) {
            return;
        }
        ((c) this.C).a(g2r0Var.b);
    }

    public final void i0() {
        c06 c06Var = this.H;
        rt1 rt1Var = ((AppAnalyticsReporter) c06Var.b).k;
        CardSetStatusScreenParams cardSetStatusScreenParams = (CardSetStatusScreenParams) c06Var.a;
        rt1Var.a.a("card.reissue_deletion.screen.show", x4e.t(2, "action_type", cardSetStatusScreenParams.getSetCardStatusActionType(), "card_type", cardSetStatusScreenParams.getCardType()));
        if (this.G) {
            return;
        }
        this.G = true;
        b0(this, null, 3);
    }
}
