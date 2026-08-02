package com.ybsdk.feature.split.deposit.internal.ui.deposit;

import android.net.Uri;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositRepayment;
import defpackage.b3z;
import defpackage.ds31;
import defpackage.evt0;
import defpackage.f42;
import defpackage.gas0;
import defpackage.h791;
import defpackage.itt0;
import defpackage.j3h;
import defpackage.np41;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qit0;
import defpackage.qtt0;
import defpackage.r8j0;
import defpackage.rtt0;
import defpackage.s8j0;
import defpackage.sd90;
import defpackage.tje;
import defpackage.tpr;
import defpackage.ttt0;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.vtt0;
import defpackage.vut0;
import defpackage.wtt0;
import defpackage.xut0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final com.ybsdk.feature.split.deposit.internal.data.deposit.repository.a B;
    public final b3z C;
    public final j3h D;
    public final np41 E;
    public final f42 F;
    public final itt0 G;
    public pzt0 H;

    public a(SplitDepositScreenParams splitDepositScreenParams, com.ybsdk.feature.split.deposit.internal.data.deposit.repository.a aVar, b3z b3zVar, j3h j3hVar, np41 np41Var, f42 f42Var, itt0 itt0Var, tpr tprVar, evt0 evt0Var) {
        super(new gas0(24, splitDepositScreenParams), evt0Var);
        this.B = aVar;
        this.C = b3zVar;
        this.D = j3hVar;
        this.E = np41Var;
        this.F = f42Var;
        this.G = itt0Var;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        b3zVar.a(new xut0(deeplinkHandleResult$DeeplinkType, this, 0));
        b3zVar.a(new xut0(deeplinkHandleResult$DeeplinkType, this, 1));
        c.a(tprVar, ds31.a(this), new qit0(5, this));
        d0();
    }

    public final void b0(String str) {
        r0 r0Var;
        Object value;
        wtt0 wtt0Var;
        r0 r0Var2;
        Object value2;
        if (str != null) {
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, vut0.a((vut0) value2, null, false, str, 251)));
        }
        u8j0 u8j0Var = ((vut0) X()).a;
        r8j0 r8j0Var = u8j0Var instanceof r8j0 ? (r8j0) u8j0Var : null;
        if (r8j0Var != null) {
            ttt0 ttt0Var = this.G.a.a;
            rtt0 rtt0Var = ttt0Var != null ? ttt0Var.b : null;
            qtt0 qtt0Var = rtt0Var != null ? rtt0Var.e : null;
            if (qtt0Var != null) {
                pz40 Y2 = Y();
                do {
                    r0Var = (r0) Y2;
                    value = r0Var.getValue();
                    wtt0Var = (wtt0) r8j0Var.a;
                    vtt0 vtt0Var = wtt0Var.c;
                } while (!r0Var.k(value, vut0.a((vut0) value, r8j0.d(r8j0Var, wtt0.a(wtt0Var, new vtt0(qtt0Var.a, qtt0Var.b, qtt0Var.c)), false, false, 14), false, null, 238)));
            }
        }
    }

    public final void c0(SplitDepositRepayment splitDepositRepayment) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new vut0(splitDepositRepayment.getOrderId(), splitDepositRepayment.getScenario(), splitDepositRepayment.getPreviousPaymentIndex(), 23)));
        d0();
    }

    public final void d0() {
        pzt0 pzt0Var = this.H;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            this.H = tje.N(ds31.a(this), null, null, new SplitDepositViewModel$loadSplitDepositScreen$1(this, null), 3);
        }
    }

    public final void e0() {
        this.F.b.k0.a.a("split_deposit.payment_screen.back_button.click", null);
    }

    public final void f0() {
        String supportUrl;
        u8j0 u8j0Var = ((vut0) X()).a;
        s8j0 s8j0Var = u8j0Var instanceof s8j0 ? (s8j0) u8j0Var : null;
        if (s8j0Var != null) {
            Throwable th = s8j0Var.a;
            FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
            if (failDataException == null || (supportUrl = failDataException.getSupportUrl()) == null) {
                return;
            }
            h791.f(this.D, supportUrl, com.ybsdk.feature.webview.api.a.b(this.E, supportUrl, null, null, 6));
        }
    }

    public final void g0() {
        d0();
    }

    public final void h0() {
        wtt0 wtt0Var = (wtt0) ((vut0) X()).a.a();
        if (wtt0Var == null) {
            return;
        }
        Uri h = sd90.h(Uri.parse(wtt0Var.b.b), "selected_payment_method_id", wtt0Var.c.a);
        this.F.b.k0.a.a("split_deposit.payment_screen.header.click", null);
        this.C.c(h.toString());
    }

    public final void i0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, vut0.a((vut0) value, null, false, null, 247)));
    }

    public final void j0() {
        d0();
    }
}
