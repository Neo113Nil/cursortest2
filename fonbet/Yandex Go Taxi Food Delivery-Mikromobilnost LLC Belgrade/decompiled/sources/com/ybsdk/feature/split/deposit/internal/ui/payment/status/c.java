package com.ybsdk.feature.split.deposit.internal.ui.payment.status;

import com.ybsdk.core.analytics.generated.delegates.SplitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.split.deposit.internal.domain.payment.status.model.PaymentStatus;
import defpackage.a9u0;
import defpackage.b3z;
import defpackage.cut0;
import defpackage.dka0;
import defpackage.ds31;
import defpackage.em3;
import defpackage.eut0;
import defpackage.f42;
import defpackage.fut0;
import defpackage.gtt0;
import defpackage.h791;
import defpackage.itt0;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.lut0;
import defpackage.n2e0;
import defpackage.np41;
import defpackage.o2e0;
import defpackage.p2e0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tw3;
import defpackage.uc5;
import defpackage.w511;
import defpackage.yjh;
import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes3.dex */
public final class c extends uc5 {
    public final SplitDepositPaymentStatusScreenParams B;
    public final b3z C;
    public final com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor.a D;
    public final j3h E;
    public final np41 F;
    public final tfl0 G;
    public final f42 H;
    public final yjh I;
    public final gtt0 J;
    public final pzt0 K;

    public c(SplitDepositPaymentStatusScreenParams splitDepositPaymentStatusScreenParams, b3z b3zVar, com.ybsdk.feature.split.deposit.internal.domain.payment.status.interactor.a aVar, j3h j3hVar, np41 np41Var, tfl0 tfl0Var, f42 f42Var, itt0 itt0Var, yjh yjhVar, gtt0 gtt0Var, lut0 lut0Var) {
        super(new tw3(itt0Var, 1), lut0Var);
        this.B = splitDepositPaymentStatusScreenParams;
        this.C = b3zVar;
        this.D = aVar;
        this.E = j3hVar;
        this.F = np41Var;
        this.G = tfl0Var;
        this.H = f42Var;
        this.I = yjhVar;
        this.J = gtt0Var;
        this.K = tje.N(ds31.a(this), null, null, new SplitDepositPaymentStatusViewModel$collectPaymentStatus$1(this, null), 3);
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new fut0(deeplinkHandleResult$DeeplinkType, this, 0));
        b3zVar.a(new fut0(deeplinkHandleResult$DeeplinkType, this, 1));
        b3zVar.a(new fut0(deeplinkHandleResult$DeeplinkType, this, 2));
    }

    public final void b0() {
        String str;
        dka0 dka0Var;
        s2e0 s2e0Var = ((cut0) X()).a;
        PaymentStatus paymentStatus = (s2e0Var == null || (dka0Var = (dka0) s2e0Var.a()) == null) ? null : dka0Var.a;
        PaymentStatus paymentStatus2 = PaymentStatus.CHALLENGE;
        tfl0 tfl0Var = this.G;
        if (paymentStatus == paymentStatus2) {
            pzt0 pzt0Var = this.K;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            tfl0Var.e();
            return;
        }
        if ((s2e0Var instanceof n2e0) || jl40.l(s2e0Var, r2e0.a)) {
            a9u0 a9u0Var = ((cut0) X()).d;
            if (a9u0Var != null) {
                str = a9u0Var.d;
            }
            str = null;
        } else if (jl40.l(s2e0Var, o2e0.a) || (s2e0Var instanceof p2e0) || s2e0Var == null) {
            a9u0 a9u0Var2 = ((cut0) X()).c;
            if (a9u0Var2 != null) {
                str = a9u0Var2.d;
            }
            str = null;
        } else {
            if (!(s2e0Var instanceof q2e0)) {
                w511.b();
                return;
            }
            dka0 dka0Var2 = (dka0) ((q2e0) s2e0Var).a;
            int i = eut0.a[dka0Var2.a.ordinal()];
            if (i == 1 || i == 2) {
                a9u0 a9u0Var3 = ((cut0) X()).c;
                if (a9u0Var3 != null) {
                    str = a9u0Var3.d;
                }
                str = null;
            } else if (i == 3) {
                a9u0 a9u0Var4 = dka0Var2.c;
                if (a9u0Var4 != null) {
                    str = a9u0Var4.d;
                }
                str = null;
            } else {
                if (i != 4) {
                    w511.b();
                    return;
                }
                a9u0 a9u0Var5 = dka0Var2.d;
                if (a9u0Var5 != null) {
                    str = a9u0Var5.d;
                }
                str = null;
            }
        }
        if (str == null || this.C.c(str) == null) {
            tfl0.b(tfl0Var, this.I.a(), null, true, 2);
        }
    }

    public final void c0() {
        this.H.b.k0.a.a("split_deposit.transaction_status.back_button.click", null);
        b0();
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, cut0.a((cut0) value, null, null, 61)));
    }

    public final void e0(Throwable th) {
        r0 r0Var;
        Object value;
        em3 em3Var = this.H.b.k0;
        SplitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus splitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus = SplitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus.FAIL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(ACSPConstants.STATUS, splitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus.getOriginalValue());
        em3Var.a.a("split_deposit.transaction_status.challenge.open.status", linkedHashMap);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, cut0.a((cut0) value, null, th, 61)));
    }

    public final void f0() {
        em3 em3Var = this.H.b.k0;
        SplitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus splitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus = SplitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus.SUCCESS;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put(ACSPConstants.STATUS, splitEvents$SplitDepositTransactionStatusChallengeOpenStatusStatus.getOriginalValue());
        em3Var.a.a("split_deposit.transaction_status.challenge.open.status", linkedHashMap);
    }

    public final void g0() {
        this.H.b.k0.a.a("split_deposit.transaction_status.close_button.click", null);
        b0();
    }

    public final void h0() {
        String supportUrl;
        Throwable th = ((cut0) X()).b;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
            return;
        }
        h791.f(this.E, supportUrl, com.ybsdk.feature.webview.api.a.b(this.F, supportUrl, null, null, 6));
    }

    public final void i0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, cut0.a((cut0) value, null, null, 47)));
    }
}
