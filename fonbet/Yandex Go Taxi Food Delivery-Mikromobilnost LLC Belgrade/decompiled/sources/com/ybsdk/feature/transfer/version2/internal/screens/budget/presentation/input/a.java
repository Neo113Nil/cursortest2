package com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.delegates.GovServicesEvents$PaymentGovValidationLoadedResult;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.b;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusScreenParams;
import defpackage.ds31;
import defpackage.evu0;
import defpackage.h791;
import defpackage.j3h;
import defpackage.kp6;
import defpackage.m04;
import defpackage.mp6;
import defpackage.pz40;
import defpackage.qoi0;
import defpackage.r8j0;
import defpackage.rm01;
import defpackage.rm6;
import defpackage.rt1;
import defpackage.s8j0;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import java.util.LinkedHashMap;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final b B;
    public final rm01 C;
    public final j3h D;
    public final tfl0 E;
    public final com.ybsdk.feature.transfer.version2.internal.screens.a F;
    public final m04 G;

    public a(mp6 mp6Var, b bVar, rm01 rm01Var, j3h j3hVar, tfl0 tfl0Var, com.ybsdk.feature.transfer.version2.internal.screens.a aVar, m04 m04Var) {
        super(new rm6(7), mp6Var);
        this.B = bVar;
        this.C = rm01Var;
        this.D = j3hVar;
        this.E = tfl0Var;
        this.F = aVar;
        this.G = m04Var;
        c0();
    }

    public final void b0() {
        r0 r0Var;
        Object value;
        Object t8j0Var;
        kp6 kp6Var = (kp6) ((u8j0) X()).a();
        if (kp6Var == null) {
            return;
        }
        kp6 kp6Var2 = (kp6) ((u8j0) X()).a();
        m04 m04Var = this.G;
        boolean z = false;
        if (kp6Var2 != null) {
            m04Var.a.B.a.a("payment.gov.validation.initiated", null);
            String str = kp6Var2.b;
            Regex regex = kp6Var2.a.d.a;
            if (!evu0.J(str) && regex.h(str)) {
                z = true;
            }
        }
        rt1 rt1Var = m04Var.a.B;
        GovServicesEvents$PaymentGovValidationLoadedResult govServicesEvents$PaymentGovValidationLoadedResult = z ? GovServicesEvents$PaymentGovValidationLoadedResult.OK : GovServicesEvents$PaymentGovValidationLoadedResult.ERROR;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, govServicesEvents$PaymentGovValidationLoadedResult.getOriginalValue());
        rt1Var.a.a("payment.gov.validation.loaded", linkedHashMap);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            u8j0 u8j0Var = (u8j0) value;
            if (u8j0Var instanceof r8j0) {
                r8j0 r8j0Var = (r8j0) u8j0Var;
                t8j0Var = new r8j0(kp6.a(kp6Var, null, z, 3), r8j0Var.b, r8j0Var.c, r8j0Var.d);
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
        if (z) {
            BudgetChargesSearchStatusScreenParams budgetChargesSearchStatusScreenParams = new BudgetChargesSearchStatusScreenParams(kp6Var.b, null);
            this.F.getClass();
            this.E.l(new FragmentScreen("BudgetChargesSearchFragment", false, budgetChargesSearchStatusScreenParams, TransitionPolicyType.POPUP, qoi0.a(BudgetChargesSearchStatusFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null));
        }
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        tje.N(ds31.a(this), null, null, new BudgetChargesUinInputViewModel$onRequestData$2(this, null), 3);
    }

    public final void d0() {
        kp6 kp6Var = (kp6) ((u8j0) X()).a();
        if (kp6Var == null) {
            return;
        }
        h791.e(this.D, kp6Var.a.a.b.a, false, null, 14);
    }

    public final void e0(String str) {
        r0 r0Var;
        Object value;
        Object t8j0Var;
        kp6 kp6Var = (kp6) ((u8j0) X()).a();
        if (kp6Var == null || str.equals(kp6Var.b)) {
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            u8j0 u8j0Var = (u8j0) value;
            if (u8j0Var instanceof r8j0) {
                r8j0 r8j0Var = (r8j0) u8j0Var;
                t8j0Var = new r8j0(kp6.a(kp6Var, str, true, 1), r8j0Var.b, r8j0Var.c, r8j0Var.d);
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
