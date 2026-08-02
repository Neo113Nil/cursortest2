package com.ybsdk.feature.credit.deposit.internal.screens.deposit;

import android.content.Context;
import android.net.Uri;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.coroutines.DebounceRequestRunner$PreviousRequestStrategy;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.CreditDepositTransactionStatusEntity$Status;
import com.ybsdk.feature.credit.deposit.internal.domain.entities.TooltipPosition;
import defpackage.a790;
import defpackage.abf;
import defpackage.awa0;
import defpackage.b790;
import defpackage.cbf;
import defpackage.ds31;
import defpackage.e3n;
import defpackage.el0;
import defpackage.fbf;
import defpackage.g1h;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jhd;
import defpackage.jl40;
import defpackage.kbf;
import defpackage.kp50;
import defpackage.l3h;
import defpackage.n2e0;
import defpackage.o2e0;
import defpackage.o430;
import defpackage.p2e0;
import defpackage.paf;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.r90;
import defpackage.raf;
import defpackage.rbv;
import defpackage.s2e0;
import defpackage.sae;
import defpackage.saf;
import defpackage.sd90;
import defpackage.t8j0;
import defpackage.taf;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.tm60;
import defpackage.tpr;
import defpackage.tv3;
import defpackage.u8j0;
import defpackage.uaf;
import defpackage.uc5;
import defpackage.utb1;
import defpackage.w511;
import defpackage.waf;
import defpackage.x4c;
import defpackage.x9f;
import defpackage.xaf;
import defpackage.z690;
import defpackage.z9f;
import defpackage.zva0;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final CreditScreenParams B;
    public final z9f C;
    public final com.ybsdk.feature.credit.deposit.internal.domain.a D;
    public final j3h E;
    public final Context F;
    public final tfl0 G;
    public final sae H;
    public final awa0 I;
    public final tv3 J;
    public final r90 K;
    public pzt0 L;
    public final com.ybsdk.core.utils.coroutines.a M;
    public pzt0 N;
    public pzt0 O;
    public boolean P;

    public a(CreditScreenParams creditScreenParams, z9f z9fVar, com.ybsdk.feature.credit.deposit.internal.domain.a aVar, j3h j3hVar, Context context, tfl0 tfl0Var, sae saeVar, awa0 awa0Var, tv3 tv3Var, r90 r90Var, tpr tprVar, kbf kbfVar) {
        super(new jhd(19, creditScreenParams, tv3Var), kbfVar);
        this.B = creditScreenParams;
        this.C = z9fVar;
        this.D = aVar;
        this.E = j3hVar;
        this.F = context;
        this.G = tfl0Var;
        this.H = saeVar;
        this.I = awa0Var;
        this.J = tv3Var;
        this.K = r90Var;
        this.M = new com.ybsdk.core.utils.coroutines.a(ds31.a(this), DebounceRequestRunner$PreviousRequestStrategy.KeepRunning);
        z9fVar.b();
        c.a(tprVar, ds31.a(this), new abf(this, 0));
        y0();
    }

    public static final void b0(a aVar, Text text, TooltipPosition tooltipPosition, Text text2, String str, rbv rbvVar) {
        Text text3 = text;
        if (jl40.l(text3, ((waf) aVar.X()).o) || ((waf) aVar.X()).j != null) {
            return;
        }
        pz40 Y = aVar.Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            pz40 pz40Var = Y;
            if (r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, null, null, null, null, null, text3, false, null, 245759))) {
                aVar.Z(new cbf(text, tooltipPosition, text2, rbvVar, str));
                return;
            } else {
                text3 = text;
                Y = pz40Var;
            }
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        d0();
    }

    public final void c0(String str) {
        raf rafVar;
        Locale locale = tm60.a;
        BigDecimal g = tm60.g(str);
        com.ybsdk.core.utils.coroutines.a aVar = this.M;
        if (g == null) {
            aVar.a();
            x4c.g("Incorrect input amount value", null, null, null, 14);
            return;
        }
        String currency = ((waf) X()).d.getCurrency();
        saf safVar = ((waf) X()).c;
        String str2 = (safVar == null || (rafVar = safVar.i) == null) ? null : rafVar.a;
        pz40 Y = Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            waf wafVar = (waf) value;
            BigDecimal bigDecimal = g;
            if (r0Var.k(value, waf.a(wafVar, null, null, MoneyEntity.copy$default(wafVar.d, bigDecimal, null, null, 6, null), null, new t8j0(), null, null, null, null, null, null, null, null, null, false, null, 262103))) {
                o430 o430Var = e3n.b;
                aVar.b(kp50.V(500L, DurationUnit.MILLISECONDS), new CreditDepositViewModel$checkAmount$2(this, bigDecimal, currency, str2, null), new CreditDepositViewModel$checkAmount$3(this, null));
                return;
            }
            g = bigDecimal;
        }
    }

    public final void d0() {
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = null;
        this.M.a();
        pzt0 pzt0Var2 = this.N;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.N = null;
        pzt0 pzt0Var3 = this.O;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        this.O = null;
    }

    public final void e0(el0 el0Var) {
        String str = el0Var.d;
        this.C.g(str);
        h791.e(this.E, str, false, null, 14);
    }

    public final void f0(String str) {
        h791.e(this.E, str, false, null, 14);
    }

    public final void g0() {
        this.C.c();
        this.G.e();
    }

    public final void h0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 261887)));
    }

    public final void i0() {
        this.C.n();
        z0();
    }

    public final void j0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 261887)));
    }

    public final void k0() {
        x9f x9fVar;
        r0 r0Var;
        Object value;
        this.C.a();
        u8j0 u8j0Var = ((waf) X()).f;
        if (u8j0Var == null || (x9fVar = (x9f) u8j0Var.a()) == null || !x9fVar.j) {
            x4c.g("Payment is not allowed, but pay button was clicked", null, null, null, 14);
            return;
        }
        pzt0 pzt0Var = this.N;
        if (pzt0Var == null || pzt0Var.k0()) {
            pzt0 pzt0Var2 = this.O;
            if (pzt0Var2 == null || pzt0Var2.k0()) {
                pz40 Y = Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, new p2e0(null, 15, null, null), null, null, null, null, null, false, null, 261631)));
                this.N = tje.N(ds31.a(this), null, null, new CreditDepositViewModel$onPayButtonClick$2(this, null), 3);
            }
        }
    }

    public final void l0(saf safVar) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, waf.a((waf) value, null, safVar, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 261883)));
        this.C.f(safVar);
        c0(((waf) X()).d.getAmount().toString());
    }

    public final void m0() {
        y0();
    }

    public final void n0() {
        r0 r0Var;
        Object value;
        this.C.n();
        String str = ((waf) X()).m;
        if (str == null) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 261631)));
            return;
        }
        s2e0 s2e0Var = ((waf) X()).j;
        if ((s2e0Var instanceof q2e0) || (s2e0Var instanceof p2e0) || jl40.l(s2e0Var, o2e0.a) || jl40.l(s2e0Var, r2e0.a)) {
            pzt0 pzt0Var = this.O;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            this.O = tje.N(ds31.a(this), null, null, new CreditDepositViewModel$observeTransactionStatus$1(this, str, null), 3);
            return;
        }
        if ((s2e0Var instanceof n2e0) || s2e0Var == null) {
            z0();
        } else {
            w511.b();
        }
    }

    public final void o0() {
        this.C.v();
        this.G.e();
    }

    public final void p0(String str) {
        z9f z9fVar = this.C;
        z9fVar.e();
        z9fVar.l();
        c0(str);
    }

    public final void q0() {
        this.C.t();
        s2e0 s2e0Var = ((waf) X()).j;
        if (s2e0Var instanceof n2e0) {
            Throwable th = ((n2e0) s2e0Var).a;
            FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
            String supportUrl = failDataException != null ? failDataException.getSupportUrl() : null;
            if (supportUrl == null) {
                x4c.g("Support button clicked, but support URL is absent", null, null, null, 14);
                return;
            }
            g1h g1hVar = (g1h) this.H.b;
            List c = ((l3h) g1hVar.a).c(supportUrl);
            if (c == null) {
                c = Collections.singletonList(com.ybsdk.feature.webview.api.a.b(g1hVar.b, supportUrl, null, null, 6));
            }
            this.G.m(c);
        }
    }

    public final void r0() {
        this.C.i();
        this.G.e();
    }

    public final void s0() {
        r0 r0Var;
        Object value;
        String str;
        Uri parse;
        this.C.u();
        paf pafVar = (paf) ((waf) X()).b.a();
        if (pafVar == null) {
            return;
        }
        if (pafVar.c != null || pafVar.e.c > 1) {
            paf pafVar2 = (paf) ((waf) X()).b.a();
            Uri uri = null;
            uri = null;
            uri = null;
            if (pafVar2 != null && (str = pafVar2.c) != null && (parse = Uri.parse(str)) != null) {
                saf safVar = ((waf) X()).c;
                uri = sd90.h(parse, "selected_payment_method_id", safVar != null ? safVar.a : null);
            }
            if (uri != null) {
                h791.d(this.E, uri, 14);
                return;
            }
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, uaf.a, null, null, null, null, null, null, false, null, 261887)));
        }
    }

    public final void t0() {
        String str;
        s2e0 s2e0Var = ((waf) X()).j;
        xaf xafVar = s2e0Var != null ? (xaf) s2e0Var.a() : null;
        CreditDepositTransactionStatusEntity$Status creditDepositTransactionStatusEntity$Status = xafVar != null ? xafVar.c : null;
        CreditDepositTransactionStatusEntity$Status creditDepositTransactionStatusEntity$Status2 = CreditDepositTransactionStatusEntity$Status.REQUIRED_3DS;
        z9f z9fVar = this.C;
        if (creditDepositTransactionStatusEntity$Status == creditDepositTransactionStatusEntity$Status2) {
            z9fVar.q();
        } else {
            z9fVar.d();
        }
        if (xafVar != null && (str = xafVar.k) != null) {
            if (h791.d(this.E, Uri.parse(str), 14) != null) {
                return;
            }
        }
        this.G.e();
    }

    public final void u0() {
        b790 b790Var;
        r0 r0Var;
        Object value;
        this.C.r();
        paf pafVar = (paf) ((waf) X()).b.a();
        if (pafVar == null || (b790Var = pafVar.g) == null) {
            return;
        }
        if (b790Var instanceof a790) {
            h791.e(this.E, ((a790) b790Var).b, false, null, 14);
            return;
        }
        if (!(b790Var instanceof z690)) {
            w511.b();
            return;
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, taf.a, null, null, null, null, null, null, false, null, 261887)));
    }

    public final void v0() {
        String str;
        String str2;
        r0 r0Var;
        Object value;
        waf wafVar;
        x9f x9fVar;
        x9f x9fVar2;
        this.C.j();
        u8j0 u8j0Var = ((waf) X()).f;
        if (u8j0Var == null || (x9fVar2 = (x9f) u8j0Var.a()) == null || (str = x9fVar2.f) == null) {
            paf pafVar = (paf) ((waf) X()).b.a();
            str = pafVar != null ? pafVar.h.f : null;
        }
        if (str != null) {
            h791.d(this.E, Uri.parse(str), 14);
            return;
        }
        u8j0 u8j0Var2 = ((waf) X()).f;
        if (u8j0Var2 == null || (x9fVar = (x9f) u8j0Var2.a()) == null || (str2 = x9fVar.c) == null) {
            paf pafVar2 = (paf) ((waf) X()).b.a();
            String str3 = pafVar2 != null ? pafVar2.h.c : null;
            if (str3 == null) {
                return;
            } else {
                str2 = str3;
            }
        }
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            wafVar = (waf) value;
        } while (!r0Var.k(value, waf.a(wafVar, null, null, MoneyEntity.copy$default(wafVar.d, new BigDecimal(str2), null, null, 6, null), null, null, null, null, null, null, null, null, null, null, null, false, null, 262135)));
    }

    public final void w0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 245759)));
    }

    public final void x0(String str) {
        this.C.g(str);
        h791.d(this.E, Uri.parse(str), 14);
    }

    public final void y0() {
        zva0 b = this.I.b("Data.CreditDeposit");
        d0();
        this.L = tje.N(ds31.a(this), null, null, new CreditDepositViewModel$requestData$1(this, b, null), 3);
    }

    public final void z0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 257535)));
        int i = fbf.a[utb1.b(this.B).ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            k0();
        } else if (i == 4) {
            y0();
        } else {
            w511.b();
        }
    }
}
