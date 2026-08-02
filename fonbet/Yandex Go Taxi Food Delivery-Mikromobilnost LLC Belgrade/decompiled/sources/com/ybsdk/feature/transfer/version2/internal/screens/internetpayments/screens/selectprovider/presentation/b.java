package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation;

import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.domain.InternetProviderWithPersonalAccountEntity;
import defpackage.bj01;
import defpackage.ds31;
import defpackage.euw;
import defpackage.g8e;
import defpackage.h791;
import defpackage.j3h;
import defpackage.m04;
import defpackage.ojw;
import defpackage.ou01;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.rm01;
import defpackage.rtw;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.ury;
import defpackage.utw;
import defpackage.w511;
import defpackage.wtw;
import defpackage.zmg;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final InternetPaymentSelectProviderScreenParams B;
    public final com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.data.a C;
    public final rm01 D;
    public final tfl0 E;
    public final com.ybsdk.feature.transfer.version2.internal.screens.a F;
    public final m04 G;
    public final j3h H;

    public b(rtw rtwVar, InternetPaymentSelectProviderScreenParams internetPaymentSelectProviderScreenParams, com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.data.a aVar, rm01 rm01Var, tfl0 tfl0Var, com.ybsdk.feature.transfer.version2.internal.screens.a aVar2, m04 m04Var, j3h j3hVar) {
        super(new ojw(15), rtwVar);
        this.B = internetPaymentSelectProviderScreenParams;
        this.C = aVar;
        this.D = rm01Var;
        this.E = tfl0Var;
        this.F = aVar2;
        this.G = m04Var;
        this.H = j3hVar;
        d0();
    }

    public final void b0() {
        u8j0 u8j0Var = (u8j0) X();
        if ((u8j0Var instanceof s8j0) || (u8j0Var instanceof t8j0)) {
            Z(zmg.m);
        } else if (u8j0Var instanceof r8j0) {
            Z(zmg.n);
        } else {
            w511.b();
        }
    }

    public final void c0(bj01 bj01Var) {
        ury uryVar = bj01Var.a;
        euw euwVar = uryVar instanceof euw ? (euw) uryVar : null;
        if (euwVar == null) {
            return;
        }
        InternetProviderWithPersonalAccountEntity internetProviderWithPersonalAccountEntity = euwVar.a;
        String name = internetProviderWithPersonalAccountEntity.getProvider().getName();
        this.G.a.E.a.a("payment.internet_tv.providers_click", g8e.w(1, "provider", name));
        String id = internetProviderWithPersonalAccountEntity.getProvider().getId();
        String personalAccount = internetProviderWithPersonalAccountEntity.getPersonalAccount();
        String action = internetProviderWithPersonalAccountEntity.getProvider().getAction();
        if (action != null) {
            h791.e(this.H, action, false, null, 14);
            return;
        }
        InternetPaymentSelectProviderScreenParams internetPaymentSelectProviderScreenParams = this.B;
        if (internetPaymentSelectProviderScreenParams.getWithResult()) {
            Z(new wtw(id));
            return;
        }
        InternetPaymentFormInputScreenParams internetPaymentFormInputScreenParams = new InternetPaymentFormInputScreenParams(id, false, personalAccount, internetPaymentSelectProviderScreenParams.getAgreementId());
        this.F.getClass();
        this.E.l(com.ybsdk.feature.transfer.version2.internal.screens.a.b(internetPaymentFormInputScreenParams));
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        this.G.a.E.a.a("payment.internet_tv.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        tje.N(ds31.a(this), null, null, new InternetPaymentSelectProviderViewModel$onRequestData$2(this, null), 3);
    }

    public final void e0() {
        String supportUrl;
        Object X = X();
        s8j0 s8j0Var = X instanceof s8j0 ? (s8j0) X : null;
        Object obj = s8j0Var != null ? s8j0Var.a : null;
        FailDataException failDataException = obj instanceof FailDataException ? (FailDataException) obj : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        ((ou01) this.D).a(supportUrl);
    }

    public final void f0(String str) {
        r0 r0Var;
        Object value;
        Object t8j0Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            u8j0 u8j0Var = (u8j0) value;
            if (u8j0Var instanceof r8j0) {
                r8j0 r8j0Var = (r8j0) u8j0Var;
                utw utwVar = (utw) r8j0Var.a;
                t8j0Var = new r8j0(new utw(utwVar.a, str, utwVar.c), r8j0Var.b, r8j0Var.c, r8j0Var.d);
            } else if (u8j0Var instanceof s8j0) {
                t8j0Var = new s8j0(((s8j0) u8j0Var).a);
            } else {
                if (!(u8j0Var instanceof t8j0)) {
                    w511.b();
                    return;
                }
                t8j0Var = new t8j0();
            }
        } while (!r0Var.k(value, t8j0Var));
    }
}
