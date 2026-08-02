package com.ybsdk.feature.card.internal.presentation.cardreissue;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.di.modules.features.c;
import com.ybsdk.feature.card.api.CardReissueScreenParams;
import com.ybsdk.feature.card.internal.interactors.j;
import defpackage.al8;
import defpackage.dm8;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.em8;
import defpackage.fm8;
import defpackage.gm8;
import defpackage.hm8;
import defpackage.im8;
import defpackage.jm8;
import defpackage.km8;
import defpackage.lm8;
import defpackage.m04;
import defpackage.qn8;
import defpackage.rk6;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.vm7;
import defpackage.vm8;
import defpackage.w511;
import defpackage.x4c;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public static final Text.Resource I = unr0.h(Text.Companion, dzh0.ybsdk_card_reissue_digital_error_title);
    public static final Text.Resource J = new Text.Resource(dzh0.ybsdk_card_reissue_digital_error_message);
    public final CardReissueScreenParams B;
    public final al8 C;
    public final j D;
    public final qn8 E;
    public final m04 F;
    public final vm7 G;
    public final tfl0 H;

    public a(CardReissueScreenParams cardReissueScreenParams, al8 al8Var, j jVar, qn8 qn8Var, m04 m04Var, vm7 vm7Var, tfl0 tfl0Var) {
        super(new rk6(27, cardReissueScreenParams), new vm8(cardReissueScreenParams.getPrimaryButtonTitle(), cardReissueScreenParams.getSecondaryButtonTitle()));
        this.B = cardReissueScreenParams;
        this.C = al8Var;
        this.D = jVar;
        this.E = qn8Var;
        this.F = m04Var;
        this.G = vm7Var;
        this.H = tfl0Var;
        m04Var.a.k.a.a("card.reissue.start", null);
    }

    public final void b0() {
        boolean shouldExitCardScenario = this.B.getShouldExitCardScenario();
        tfl0 tfl0Var = this.H;
        if (!shouldExitCardScenario) {
            tfl0Var.e();
            return;
        }
        km8 km8Var = (km8) X();
        if ((km8Var instanceof dm8) || (km8Var instanceof em8) || (km8Var instanceof hm8) || (km8Var instanceof fm8)) {
            tfl0Var.e();
        } else if ((km8Var instanceof gm8) || (km8Var instanceof im8) || (km8Var instanceof jm8)) {
            Z(lm8.a);
        } else {
            w511.b();
        }
    }

    public final void c0() {
        this.H.e();
    }

    public final void d0(String str) {
        String str2;
        Object X = X();
        dm8 dm8Var = X instanceof dm8 ? (dm8) X : null;
        if (dm8Var == null || (str2 = dm8Var.c) == null) {
            x4c.g("Attempt start card reissue without operationId after 2FA", null, null, null, 14);
        } else {
            tje.N(ds31.a(this), null, null, new CardReissueViewModel$startCardReissue$1(this, str2, str, null), 3);
        }
    }

    public final void e0() {
        this.F.a.k.a.a("card.reissue.cancel", null);
        b0();
    }

    public final void f0() {
        this.F.a.k.a.a("card.reissue.submit", null);
        tje.N(ds31.a(this), null, null, new CardReissueViewModel$startCardReissue$1(this, null, null, null), 3);
    }

    public final void g0() {
        this.F.a.k.a.a("card.reissue.support_click", null);
        km8 km8Var = (km8) X();
        boolean z = km8Var instanceof em8;
        al8 al8Var = this.C;
        if (z) {
            String str = ((em8) km8Var).c;
            if (str != null) {
                ((c) al8Var).b(str);
                return;
            }
            return;
        }
        if (km8Var instanceof jm8) {
            String str2 = ((jm8) km8Var).c;
            if (str2 != null) {
                ((c) al8Var).b(str2);
                return;
            }
            return;
        }
        if ((km8Var instanceof dm8) || (km8Var instanceof fm8) || (km8Var instanceof gm8) || (km8Var instanceof hm8) || (km8Var instanceof im8)) {
            return;
        }
        w511.b();
    }
}
