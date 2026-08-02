package com.ybsdk.feature.savings.internal.screens.fund.operation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountButtonClickType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountCloseAccountOpenType;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.savings.api.SavingsTwoFactorAuthResult;
import com.ybsdk.feature.savings.internal.interactors.b;
import defpackage.aps;
import defpackage.bps;
import defpackage.cps;
import defpackage.dnr;
import defpackage.dps;
import defpackage.ds31;
import defpackage.edm0;
import defpackage.eps;
import defpackage.fdm0;
import defpackage.fps;
import defpackage.g5;
import defpackage.gdm0;
import defpackage.gps;
import defpackage.hps;
import defpackage.j5a0;
import defpackage.lrp0;
import defpackage.mv3;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rps;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.udm0;
import defpackage.v5r;
import defpackage.vcm0;
import defpackage.w511;
import defpackage.x4c;
import defpackage.zos;
import java.util.Collections;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final FundOperationParams B;
    public final AppAnalyticsReporter C;
    public final g5 D;
    public final fdm0 E;
    public final tfl0 F;
    public final b G;
    public final udm0 H;
    public pzt0 I;
    public pzt0 J;

    public a(FundOperationParams fundOperationParams, AppAnalyticsReporter appAnalyticsReporter, g5 g5Var, fdm0 fdm0Var, tfl0 tfl0Var, b bVar, udm0 udm0Var, edm0 edm0Var, rps rpsVar) {
        super(new v5r(27), rpsVar);
        this.B = fundOperationParams;
        this.C = appAnalyticsReporter;
        this.D = g5Var;
        this.E = fdm0Var;
        this.F = tfl0Var;
        this.G = bVar;
        this.H = udm0Var;
        appAnalyticsReporter.f0.G(SavingsEvents$SavingsAccountCloseAccountOpenType.FUND, fundOperationParams.getType());
        h0(null, false);
        ((vcm0) edm0Var).a.a(new mv3(DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN, new dnr(10, this), 25));
    }

    public static void i0(a aVar, Throwable th) {
        String str = ((cps) aVar.X()).f;
        pz40 Y = aVar.Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            Throwable th2 = th;
            if (r0Var.k(value, cps.a((cps) value, th2, null, null, null, str, 16))) {
                return;
            } else {
                th = th2;
            }
        }
    }

    public final void b0() {
        i0(this, null);
        String str = ((cps) X()).e;
        if (str != null) {
            g0(str);
        } else {
            h0(null, false);
        }
    }

    public final void c0() {
        Throwable th = ((cps) X()).a;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        String supportUrl = failDataException != null ? failDataException.getSupportUrl() : null;
        if (this.D.b(supportUrl)) {
            return;
        }
        ((gdm0) this.E).a(supportUrl);
    }

    public final void d0(SavingsTwoFactorAuthResult savingsTwoFactorAuthResult) {
        r0 r0Var;
        Object value;
        if (!savingsTwoFactorAuthResult.equals(SavingsTwoFactorAuthResult.Cancel.INSTANCE)) {
            if (savingsTwoFactorAuthResult instanceof SavingsTwoFactorAuthResult.Success) {
                h0(((SavingsTwoFactorAuthResult.Success) savingsTwoFactorAuthResult).getVerificationToken(), true);
                return;
            } else {
                w511.b();
                return;
            }
        }
        aps apsVar = ((cps) X()).d;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new cps(null, null, null, apsVar, null, null)));
    }

    public final void e0() {
        String str = ((cps) X()).e;
        if (str != null) {
            g0(str);
        }
    }

    public final void f0() {
        this.C.f0.F(SavingsEvents$SavingsAccountCloseAccountButtonClickButton.CLOSE_SAVE, SavingsEvents$SavingsAccountCloseAccountButtonClickType.FUND, null, this.B.getType());
        if (((cps) X()).c != null) {
            this.D.b(((cps) X()).c.d.b);
        } else if (((cps) X()).d != null) {
            h0(null, true);
        } else {
            x4c.g("statusScreen and openAndBuyScreen states are empty", null, null, Collections.singletonList(lrp0.k), 6);
        }
    }

    public final void g0(String str) {
        pzt0 pzt0Var = this.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.J = tje.N(ds31.a(this), null, null, new FundOperationViewModel$requestStatus$1(this, str, null), 3);
    }

    public final void h0(String str, boolean z) {
        pzt0 pzt0Var = this.I;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.I = tje.N(ds31.a(this), null, null, new FundOperationViewModel$startOperation$1(this, str, z, null), 3);
    }

    public final void j0(hps hpsVar, Throwable th) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        if (hpsVar instanceof dps) {
            dps dpsVar = (dps) hpsVar;
            zos zosVar = new zos(dpsVar.a, dpsVar.b);
            pz40 Y = Y();
            do {
                r0Var3 = (r0) Y;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, cps.a((cps) value3, null, zosVar, null, null, null, 56)));
            return;
        }
        if (hpsVar instanceof eps) {
            eps epsVar = (eps) hpsVar;
            aps apsVar = new aps(epsVar.a, epsVar.b, epsVar.c, epsVar.d, epsVar.e, epsVar.f);
            String str = ((cps) X()).e;
            String str2 = ((cps) X()).f;
            pz40 Y2 = Y();
            do {
                r0Var2 = (r0) Y2;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, new cps(null, null, null, apsVar, str, str2)));
            return;
        }
        if (hpsVar instanceof fps) {
            fps fpsVar = (fps) hpsVar;
            bps bpsVar = new bps(fpsVar.b, fpsVar.c, j5a0.d(fpsVar.a, 0, 3), fpsVar.d);
            pz40 Y3 = Y();
            do {
                r0Var = (r0) Y3;
                value = r0Var.getValue();
            } while (!r0Var.k(value, cps.a((cps) value, null, null, bpsVar, null, null, 48)));
            return;
        }
        if (hpsVar instanceof gps) {
            this.D.b(((gps) hpsVar).a);
        } else if (hpsVar == null) {
            i0(this, th);
        } else {
            w511.b();
        }
    }
}
