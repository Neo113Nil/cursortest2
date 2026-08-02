package com.ybsdk.feature.card.internal.presentation.cardlimit;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.card.api.CardSecondFactorHelper$SecondFactorResult;
import com.ybsdk.feature.card.internal.interactors.g;
import defpackage.ds31;
import defpackage.g8e;
import defpackage.gao;
import defpackage.gi8;
import defpackage.ii8;
import defpackage.il8;
import defpackage.ki8;
import defpackage.oi8;
import defpackage.pz40;
import defpackage.qn8;
import defpackage.qq7;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import defpackage.we8;
import defpackage.zka1;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final tfl0 B;
    public final qn8 C;
    public final g D;
    public final String E;
    public final AppAnalyticsReporter F;

    public a(tfl0 tfl0Var, qn8 qn8Var, g gVar, String str, AppAnalyticsReporter appAnalyticsReporter, oi8 oi8Var) {
        super(new we8(1), oi8Var);
        this.B = tfl0Var;
        this.C = qn8Var;
        this.D = gVar;
        this.E = str;
        this.F = appAnalyticsReporter;
        b0();
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        this.F.l.a.a("card.limit_setting_screen.load.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        tje.N(ds31.a(this), null, null, new CardLimitViewModel$invalidateData$2(this, null), 3);
    }

    public final void c0(String str) {
        String str2;
        Object t8j0Var;
        if (str == null) {
            return;
        }
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            u8j0 u8j0Var = (u8j0) value;
            if (u8j0Var instanceof r8j0) {
                r8j0 r8j0Var = (r8j0) u8j0Var;
                str2 = str;
                t8j0Var = new r8j0(gi8.a((gi8) r8j0Var.a, str2, null, 0, false, 29), r8j0Var.b, r8j0Var.c, r8j0Var.d);
            } else {
                str2 = str;
                if (u8j0Var instanceof s8j0) {
                    t8j0Var = new s8j0(((s8j0) u8j0Var).a);
                } else {
                    if (!(u8j0Var instanceof t8j0)) {
                        w511.b();
                        return;
                    }
                    t8j0Var = new t8j0();
                }
            }
            if (r0Var.k(value, t8j0Var)) {
                return;
            } else {
                str = str2;
            }
        }
    }

    public final void d0() {
        gi8 gi8Var = (gi8) ((u8j0) X()).a();
        if (gi8Var == null || gi8Var.e) {
            return;
        }
        tje.N(ds31.a(this), null, null, new CardLimitViewModel$saveCardLimit$1(this, null, null), 3);
    }

    public final void e0(CardSecondFactorHelper$SecondFactorResult cardSecondFactorHelper$SecondFactorResult) {
        if (cardSecondFactorHelper$SecondFactorResult instanceof CardSecondFactorHelper$SecondFactorResult.VerificationToken) {
            tje.N(ds31.a(this), null, null, new CardLimitViewModel$saveCardLimit$1(this, ((CardSecondFactorHelper$SecondFactorResult.VerificationToken) cardSecondFactorHelper$SecondFactorResult).getVerificationToken(), null), 3);
        } else if (cardSecondFactorHelper$SecondFactorResult == null) {
            Z(new ki8(gao.e(null, null, null, 7)));
        } else {
            if (cardSecondFactorHelper$SecondFactorResult.equals(CardSecondFactorHelper$SecondFactorResult.Cancel.INSTANCE)) {
                return;
            }
            w511.b();
        }
    }

    public final void f0(int i) {
        r0 r0Var;
        Object value;
        u8j0 u8j0Var = (u8j0) X();
        if (u8j0Var instanceof r8j0) {
            gi8 gi8Var = (gi8) ((r8j0) u8j0Var).a;
            String str = ((il8) gi8Var.a.get(gi8Var.d)).a;
            qq7 qq7Var = this.F.l;
            qq7Var.a.a("card.limit_setting_screen.select_period", g8e.w(1, "selected_limit", str));
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zka1.d((u8j0) value, new ii8(i, 0))));
    }
}
