package com.ybsdk.feature.savings.internal.screens.create;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.savings.internal.entities.SavingsAccountCreationStatusEntity$Status;
import com.ybsdk.feature.savings.internal.interactors.c;
import defpackage.ds31;
import defpackage.e5m0;
import defpackage.fdm0;
import defpackage.g5;
import defpackage.gdm0;
import defpackage.gya1;
import defpackage.pz40;
import defpackage.q4m0;
import defpackage.r4m0;
import defpackage.t4m0;
import defpackage.tcm0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u4m0;
import defpackage.uc5;
import defpackage.v4m0;
import defpackage.x4c;
import defpackage.x4m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final SavingsAccountCreationParams B;
    public final tfl0 C;
    public final tcm0 D;
    public final AppAnalyticsReporter E;
    public final c F;
    public final fdm0 G;
    public final g5 H;

    public a(SavingsAccountCreationParams savingsAccountCreationParams, e5m0 e5m0Var, tfl0 tfl0Var, tcm0 tcm0Var, AppAnalyticsReporter appAnalyticsReporter, c cVar, fdm0 fdm0Var, g5 g5Var) {
        super(new v4m0(0), e5m0Var);
        this.B = savingsAccountCreationParams;
        this.C = tfl0Var;
        this.D = tcm0Var;
        this.E = appAnalyticsReporter;
        this.F = cVar;
        this.G = fdm0Var;
        this.H = g5Var;
        appAnalyticsReporter.f0.a.a("savings.registration.loaded", null);
        c0();
    }

    public static final gya1 b0(a aVar, u4m0 u4m0Var) {
        aVar.getClass();
        SavingsAccountCreationStatusEntity$Status savingsAccountCreationStatusEntity$Status = u4m0Var.b;
        String str = u4m0Var.a;
        String str2 = u4m0Var.d;
        String str3 = u4m0Var.c;
        int i = x4m0.a[savingsAccountCreationStatusEntity$Status.ordinal()];
        if (i == 1) {
            return new q4m0(str3, str2, u4m0Var.h, str);
        }
        if (i != 2) {
            return null;
        }
        return new r4m0(u4m0Var.e, str3, str2, str);
    }

    public final void c0() {
        r0 r0Var;
        Object value;
        this.E.f0.a.a("savings.registration.creating_application.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, t4m0.a((t4m0) value, null)));
        tje.N(ds31.a(this), null, null, new SavingsAccountCreationViewModel$createSavingAccount$2(this, null), 3);
    }

    public final void d0() {
        if (((t4m0) X()).a instanceof r4m0) {
            ((gdm0) this.G).b();
            return;
        }
        x4c.g("Savings Account Opening status view button click in wrong error state", null, "error state: " + ((t4m0) X()).a, null, 10);
    }
}
