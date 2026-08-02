package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation;

import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import defpackage.bj01;
import defpackage.ds31;
import defpackage.du20;
import defpackage.gu20;
import defpackage.h791;
import defpackage.iu20;
import defpackage.j3h;
import defpackage.m04;
import defpackage.ou01;
import defpackage.ou20;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.rm01;
import defpackage.s8j0;
import defpackage.sq20;
import defpackage.t8j0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.ury;
import defpackage.w511;
import defpackage.zmg;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final MobileProvidersListParams B;
    public final com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.data.a C;
    public final rm01 D;
    public final m04 E;
    public final j3h F;

    public a(ou20 ou20Var, MobileProvidersListParams mobileProvidersListParams, com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.data.a aVar, rm01 rm01Var, m04 m04Var, j3h j3hVar) {
        super(new sq20(7), ou20Var);
        this.B = mobileProvidersListParams;
        this.C = aVar;
        this.D = rm01Var;
        this.E = m04Var;
        this.F = j3hVar;
        d0();
        m04Var.a.L.a.a("payment.mobile_services.providers_initiated", null);
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
        du20 du20Var = uryVar instanceof du20 ? (du20) uryVar : null;
        if (du20Var == null) {
            return;
        }
        PaymentProviderEntity paymentProviderEntity = du20Var.a;
        Z(zmg.m);
        this.E.w(du20Var);
        if (paymentProviderEntity.getAction() != null) {
            h791.e(this.F, paymentProviderEntity.getAction(), false, null, 14);
        } else {
            Z(new iu20(paymentProviderEntity, this.B.getPhone()));
        }
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        tje.N(ds31.a(this), null, null, new MobileProvidersListViewModel$onRequestData$2(this, null), 3);
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
                gu20 gu20Var = (gu20) r8j0Var.a;
                t8j0Var = new r8j0(new gu20(gu20Var.a, str, gu20Var.c), r8j0Var.b, r8j0Var.c, r8j0Var.d);
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
