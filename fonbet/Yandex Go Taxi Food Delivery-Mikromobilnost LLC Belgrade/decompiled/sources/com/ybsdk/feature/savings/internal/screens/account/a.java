package com.ybsdk.feature.savings.internal.screens.account;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountLoadedType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountWidgetInitiatedType;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsAccountWidgetShownType;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.deeplink.api.DeeplinkHandleResult$DeeplinkType;
import com.ybsdk.feature.savings.api.SavingsActionStatus;
import com.ybsdk.feature.savings.internal.entities.AccountType;
import com.ybsdk.feature.savings.internal.interactors.d;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.shimmer.b;
import defpackage.a3m0;
import defpackage.b3m0;
import defpackage.b3z;
import defpackage.b8m0;
import defpackage.bev;
import defpackage.c8m0;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.e8m0;
import defpackage.edm0;
import defpackage.f8m0;
import defpackage.fdm0;
import defpackage.fob1;
import defpackage.g1k;
import defpackage.g5;
import defpackage.g8e;
import defpackage.gdm0;
import defpackage.j6m0;
import defpackage.jl40;
import defpackage.job1;
import defpackage.m9m0;
import defpackage.mdm0;
import defpackage.ndm0;
import defpackage.o8k0;
import defpackage.o8m0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.r7m0;
import defpackage.rcv;
import defpackage.rev;
import defpackage.rt1;
import defpackage.rv3;
import defpackage.s7m0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.ut51;
import defpackage.vcm0;
import defpackage.w2m0;
import defpackage.w511;
import defpackage.w7m0;
import defpackage.x6m0;
import defpackage.y7m0;
import defpackage.z7m0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final SavingsAccountScreenParams B;
    public final tfl0 C;
    public final Context D;
    public final AppAnalyticsReporter E;
    public final d F;
    public final mdm0 G;
    public final w2m0 H;
    public final fdm0 I;
    public final g5 J;
    public final g5 K;
    public final edm0 L;
    public final b M;
    public pzt0 N;
    public boolean O;
    public boolean P;
    public SavingsActionStatus Q;
    public boolean R;
    public boolean S;
    public final ArrayList T;

    public a(SavingsAccountScreenParams savingsAccountScreenParams, tfl0 tfl0Var, Context context, AppAnalyticsReporter appAnalyticsReporter, d dVar, mdm0 mdm0Var, w2m0 w2m0Var, fdm0 fdm0Var, g5 g5Var, g5 g5Var2, edm0 edm0Var, b bVar, o8m0 o8m0Var, ut51 ut51Var) {
        super(new o8k0(20, savingsAccountScreenParams, bVar), o8m0Var);
        this.B = savingsAccountScreenParams;
        this.C = tfl0Var;
        this.D = context;
        this.E = appAnalyticsReporter;
        this.F = dVar;
        this.G = mdm0Var;
        this.H = w2m0Var;
        this.I = fdm0Var;
        this.J = g5Var;
        this.K = g5Var2;
        this.L = edm0Var;
        this.M = bVar;
        this.R = true;
        this.T = new ArrayList();
        SavingsAccountViewModel$2 savingsAccountViewModel$2 = new SavingsAccountViewModel$2(0, this, a.class, "sendUnlockSideEffect", "sendUnlockSideEffect(Z)V", 0);
        b3z b3zVar = ((vcm0) edm0Var).a;
        DeeplinkHandleResult$DeeplinkType deeplinkHandleResult$DeeplinkType = DeeplinkHandleResult$DeeplinkType.SCREEN_OPEN;
        int i = 5;
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, savingsAccountViewModel$2, i));
        int i2 = 4;
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, new SavingsAccountViewModel$3(0, this, a.class, "sendThemeSelectorSideEffect", "sendThemeSelectorSideEffect()V", 0), i2));
        int i3 = 3;
        b3zVar.a(new rv3(deeplinkHandleResult$DeeplinkType, new j6m0(3, this), i3));
        d0(false);
        com.ybsdk.feature.savings.internal.helpers.a aVar = (com.ybsdk.feature.savings.internal.helpers.a) w2m0Var;
        c.a(e.t(com.ybsdk.feature.savings.internal.helpers.a.f(savingsAccountScreenParams.getAgreementId(), aVar.g)), ds31.a(this), new w7m0(this, 2));
        c.a(e.t(com.ybsdk.feature.savings.internal.helpers.a.f(savingsAccountScreenParams.getAgreementId(), aVar.f)), ds31.a(this), new w7m0(this, i3));
        c.a(e.t(com.ybsdk.feature.savings.internal.helpers.a.f(savingsAccountScreenParams.getAgreementId(), aVar.h)), ds31.a(this), new w7m0(this, 1));
        c.a(e.t(com.ybsdk.feature.savings.internal.helpers.a.f(savingsAccountScreenParams.getAgreementId(), aVar.i)), ds31.a(this), new w7m0(this, i2));
        c.a(e.t(com.ybsdk.feature.savings.internal.helpers.a.f(savingsAccountScreenParams.getAgreementId(), aVar.j)), ds31.a(this), new w7m0(this, i));
        c.a(ut51Var.a, ds31.a(this), new w7m0(this, 0));
    }

    public static final SavingsEvents$SavingsAccountLoadedType b0(a aVar, AccountType accountType) {
        aVar.getClass();
        int i = accountType == null ? -1 : f8m0.a[accountType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return SavingsEvents$SavingsAccountLoadedType.SAVER;
        }
        if (i == 2) {
            return SavingsEvents$SavingsAccountLoadedType.DEPOSIT;
        }
        if (i == 3) {
            return SavingsEvents$SavingsAccountLoadedType.FUND;
        }
        w511.b();
        return null;
    }

    @Override // defpackage.yr31
    public final void V() {
        Iterator it = this.T.iterator();
        while (it.hasNext()) {
            ((g1k) it.next()).dispose();
        }
    }

    public final m9m0 c0(String str) {
        List list;
        x6m0 x6m0Var = ((r7m0) X()).b;
        Object obj = null;
        if (x6m0Var == null || (list = x6m0Var.m) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof m9m0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((m9m0) next).a, str)) {
                obj = next;
                break;
            }
        }
        return (m9m0) obj;
    }

    public final void d0(boolean z) {
        r0 r0Var;
        Object value;
        r7m0 r7m0Var;
        x6m0 x6m0Var;
        pzt0 pzt0Var = this.N;
        if (pzt0Var == null || !pzt0Var.isActive()) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
                r7m0Var = (r7m0) value;
                x6m0Var = r7m0Var.b;
            } while (!r0Var.k(value, r7m0.a(r7m0Var, null, (x6m0Var == null || !z) ? null : x6m0Var, null, null, null, null, false, !z, 377)));
            if (!z) {
                tje.N(ds31.a(this), null, null, new SavingsAccountViewModel$loadInfo$2(this, null), 3);
            }
            Z(new z7m0(z));
            this.N = tje.N(ds31.a(this), null, null, new SavingsAccountViewModel$loadInfo$3(this, z, null), 3);
        }
    }

    public final boolean e0() {
        this.E.f0.a.a("savings.account.return.click", null);
        this.C.e();
        return true;
    }

    public final void f0() {
        MoneyEntity moneyEntity;
        BigDecimal amount;
        x6m0 x6m0Var = ((r7m0) X()).b;
        long longValue = (x6m0Var == null || (moneyEntity = x6m0Var.j) == null || (amount = moneyEntity.getAmount()) == null) ? 0L : amount.longValue();
        ndm0 ndm0Var = (ndm0) this.G;
        boolean z = longValue >= ((long) ndm0Var.a());
        if (ndm0Var.c() && z) {
            x6m0 x6m0Var2 = ((r7m0) X()).b;
            if ((x6m0Var2 != null ? x6m0Var2.d : null) != AccountType.DEPOSIT) {
                Z(y7m0.a);
            }
        }
    }

    public final void g0() {
        String str;
        x6m0 x6m0Var = ((r7m0) X()).b;
        if (x6m0Var == null || (str = x6m0Var.f) == null) {
            return;
        }
        this.E.f0.a.a("savings.account.profit_info", g8e.w(1, "text", str));
        Z(new c8m0(g8e.i(Text.Companion, str)));
    }

    public final void h0() {
        this.E.f0.a.a("savings.account.income.chart.action", null);
    }

    public final void i0(String str) {
        this.E.f0.a.a("savings.account.click", g8e.w(2, Constants.DEEPLINK, str == null ? "" : str));
        x0(str);
    }

    public final void j0() {
        this.R = false;
        this.P = false;
    }

    public final void k0() {
        String str;
        b3m0 b3m0Var;
        x6m0 x6m0Var = ((r7m0) X()).b;
        if (x6m0Var == null || (b3m0Var = x6m0Var.l) == null) {
            str = null;
        } else {
            a3m0 a3m0Var = b3m0Var.b;
            if (a3m0Var == null || (str = a3m0Var.b) == null) {
                str = b3m0Var.a.b;
            }
        }
        i0(str);
    }

    public final void l0() {
        this.P = true;
        if (this.O) {
            Z(b8m0.a);
        }
        this.O = false;
    }

    public final void m0() {
        d0(true);
    }

    public final void n0() {
        r0 r0Var;
        Object value;
        s7m0 s7m0Var = ((r7m0) X()).e;
        if (s7m0Var == null) {
            return;
        }
        String str = s7m0Var.a;
        rt1 rt1Var = this.E.f0;
        rt1Var.a.a("savings.account.theme_change.save.initiated", g8e.w(1, "theme_id", str));
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, r7m0.a((r7m0) value, null, null, null, null, null, s7m0Var, false, false, 463)));
        ((com.ybsdk.feature.savings.internal.helpers.a) this.H).d(this.B.getAgreementId(), this.b.i("IDEMPOTENCY_KEY_FOR_THEME"), str);
    }

    public final void o0() {
        b3m0 b3m0Var;
        x6m0 x6m0Var = ((r7m0) X()).b;
        i0((x6m0Var == null || (b3m0Var = x6m0Var.l) == null) ? null : b3m0Var.a.b);
    }

    public final void p0() {
        r0 r0Var;
        Object value;
        if (((r7m0) X()).e != null) {
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, r7m0.a((r7m0) value, null, null, null, null, null, null, false, false, 495)));
        }
    }

    public final void q0() {
        v0();
    }

    public final void r0() {
        this.K.c(unr0.h(Text.Companion, dzh0.ybsdk_savings_unlock_money_snackbar_keeped_title), new Text.Resource(dzh0.ybsdk_savings_unlock_money_snackbar_keeped_subtitle));
        this.E.f0.a.a("savings.account.unlock_money.stay", null);
    }

    public final void s0() {
        ((com.ybsdk.feature.savings.internal.helpers.a) this.H).b(this.B.getAgreementId(), this.b.i("IDEMPOTENCY_KEY_FOR_UNLOCK"), false);
        this.E.f0.a.a("savings.account.unlock_money.remove", null);
    }

    public final boolean t0(String str, String str2) {
        rt1 rt1Var = this.E.f0;
        x6m0 x6m0Var = ((r7m0) X()).b;
        SavingsEvents$SavingsAccountWidgetInitiatedType savingsEvents$SavingsAccountWidgetInitiatedType = null;
        AccountType accountType = x6m0Var != null ? x6m0Var.d : null;
        int i = accountType == null ? -1 : f8m0.a[accountType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                savingsEvents$SavingsAccountWidgetInitiatedType = SavingsEvents$SavingsAccountWidgetInitiatedType.SAVER;
            } else if (i == 2) {
                savingsEvents$SavingsAccountWidgetInitiatedType = SavingsEvents$SavingsAccountWidgetInitiatedType.DEPOSIT;
            } else {
                if (i != 3) {
                    w511.b();
                    return false;
                }
                savingsEvents$SavingsAccountWidgetInitiatedType = SavingsEvents$SavingsAccountWidgetInitiatedType.FUND;
            }
        }
        LinkedHashMap w = g8e.w(3, "id", str);
        if (savingsEvents$SavingsAccountWidgetInitiatedType != null) {
            w.put("type", savingsEvents$SavingsAccountWidgetInitiatedType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.widget.initiated", w);
        return x0(str2);
    }

    public final void u0(String str) {
        rt1 rt1Var = this.E.f0;
        x6m0 x6m0Var = ((r7m0) X()).b;
        SavingsEvents$SavingsAccountWidgetShownType savingsEvents$SavingsAccountWidgetShownType = null;
        AccountType accountType = x6m0Var != null ? x6m0Var.d : null;
        int i = accountType == null ? -1 : f8m0.a[accountType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                savingsEvents$SavingsAccountWidgetShownType = SavingsEvents$SavingsAccountWidgetShownType.SAVER;
            } else if (i == 2) {
                savingsEvents$SavingsAccountWidgetShownType = SavingsEvents$SavingsAccountWidgetShownType.DEPOSIT;
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                savingsEvents$SavingsAccountWidgetShownType = SavingsEvents$SavingsAccountWidgetShownType.FUND;
            }
        }
        LinkedHashMap w = g8e.w(2, "id", str);
        if (savingsEvents$SavingsAccountWidgetShownType != null) {
            w.put("type", savingsEvents$SavingsAccountWidgetShownType.getOriginalValue());
        }
        rt1Var.a.a("savings.account.widget.shown", w);
    }

    public final void v0() {
        x6m0 x6m0Var;
        String str;
        String str2 = null;
        this.E.f0.a.a("savings.account.support.click", null);
        Throwable th = ((r7m0) X()).c;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        if ((failDataException != null && (str = failDataException.getSupportUrl()) != null) || ((x6m0Var = ((r7m0) X()).b) != null && (str = x6m0Var.k) != null)) {
            str2 = str;
        }
        if (this.J.b(str2)) {
            return;
        }
        ((gdm0) this.I).a(str2);
    }

    public final void w0(ThemedImageUrlEntity themedImageUrlEntity) {
        Context context = this.D;
        String b = job1.b(themedImageUrlEntity, context);
        if (b == null) {
            return;
        }
        List list = rcv.a;
        String a = rcv.a(b, rev.f, context);
        coil.c f = com.ybsdk.core.utils.ext.a.f();
        bev b2 = com.ybsdk.core.utils.ext.a.b(context, 6, false);
        b2.c = a;
        this.T.add(f.b(b2.d()));
    }

    public final boolean x0(String str) {
        return ((vcm0) this.L).a(str);
    }

    public final void y0(boolean z) {
        Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_savings_unlock_money_title);
        Text.Resource resource = new Text.Resource(dzh0.ybsdk_savings_unlock_money_subtitle);
        ndm0 ndm0Var = (ndm0) this.G;
        ndm0Var.getClass();
        fob1.b(ndm0Var.a.l().getSpendingUnlock());
        ndm0Var.getClass();
        Z(new e8m0(h, resource, fob1.b(ndm0Var.a.l().getSpendingUnlock()), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_unlock_money_button_primary), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_unlock_money_button_secondary), null, null, null, null, null, null, false, this.Q == SavingsActionStatus.IN_PROGRESS, null, 3070), z));
    }
}
