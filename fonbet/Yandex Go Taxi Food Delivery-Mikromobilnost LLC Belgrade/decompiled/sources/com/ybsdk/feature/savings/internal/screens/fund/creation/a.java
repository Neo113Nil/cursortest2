package com.ybsdk.feature.savings.internal.screens.fund.creation;

import android.content.Context;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.FundOpeningStatusScreenButtonCommon;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton;
import com.ybsdk.core.analytics.generated.delegates.SavingsEvents$SavingsOpeningFundTopupScreenSendingAccountsButtonClickButton;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.NumberFormatUtils$Currencies;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.savings.api.SavingsTwoFactorAuthResult;
import com.ybsdk.feature.savings.internal.entities.FundRequestStatusSuccessResponseEntity$ResultScreen$Type;
import defpackage.bvu0;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.fdm0;
import defpackage.fns;
import defpackage.g5;
import defpackage.gdm0;
import defpackage.gns;
import defpackage.h5a0;
import defpackage.hns;
import defpackage.ins;
import defpackage.j5a0;
import defpackage.jl40;
import defpackage.kns;
import defpackage.lns;
import defpackage.lrp0;
import defpackage.mns;
import defpackage.nns;
import defpackage.odq0;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.rr51;
import defpackage.rt1;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uc5;
import defpackage.uda0;
import defpackage.udm0;
import defpackage.unr0;
import defpackage.uos;
import defpackage.v5r;
import defpackage.vns;
import defpackage.vps;
import defpackage.w511;
import defpackage.w530;
import defpackage.wps;
import defpackage.x4c;
import defpackage.xps;
import defpackage.yps;
import defpackage.zps;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.coroutines.flow.r0;
import ru.yandex.video.m3.BuildConfig;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final FundCreationParams B;
    public final AppAnalyticsReporter C;
    public final g5 D;
    public final fdm0 E;
    public final tfl0 F;
    public final g5 G;
    public final Context H;
    public final w530 I;
    public final com.ybsdk.feature.savings.internal.interactors.a J;
    public final udm0 K;
    public pzt0 L;
    public pzt0 M;
    public boolean N;

    public a(FundCreationParams fundCreationParams, AppAnalyticsReporter appAnalyticsReporter, g5 g5Var, fdm0 fdm0Var, tfl0 tfl0Var, g5 g5Var2, Context context, w530 w530Var, com.ybsdk.feature.savings.internal.interactors.a aVar, udm0 udm0Var, vns vnsVar) {
        super(new v5r(25), vnsVar);
        this.B = fundCreationParams;
        this.C = appAnalyticsReporter;
        this.D = g5Var;
        this.E = fdm0Var;
        this.F = tfl0Var;
        this.G = g5Var2;
        this.H = context;
        this.I = w530Var;
        this.J = aVar;
        this.K = udm0Var;
        appAnalyticsReporter.f0.a.a("savings.opening.fund_topup_screen.show", null);
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = tje.N(ds31.a(this), null, null, new FundCreationViewModel$openFund$1(this, null, null), 3);
    }

    public static void p0(a aVar, Throwable th) {
        String str = ((ins) aVar.X()).f;
        pz40 Y = aVar.Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            Throwable th2 = th;
            if (r0Var.k(value, ins.a((ins) value, th2, null, null, null, str, 16))) {
                return;
            } else {
                th = th2;
            }
        }
    }

    public static void q0(a aVar, gns gnsVar) {
        String str = ((ins) aVar.X()).e;
        String str2 = ((ins) aVar.X()).f;
        pz40 Y = aVar.Y();
        while (true) {
            r0 r0Var = (r0) Y;
            Object value = r0Var.getValue();
            gns gnsVar2 = gnsVar;
            if (r0Var.k(value, new ins(null, null, null, gnsVar2, str, str2))) {
                return;
            } else {
                gnsVar = gnsVar2;
            }
        }
    }

    public final boolean b0(MoneyEntity moneyEntity) {
        MoneyEntity amount;
        gns gnsVar = ((ins) X()).d;
        if (gnsVar == null) {
            return true;
        }
        uos uosVar = gnsVar.j;
        Text.Constant constant = null;
        BigDecimal amount2 = moneyEntity != null ? moneyEntity.getAmount() : null;
        h5a0 h5a0Var = gnsVar.f;
        BigDecimal amount3 = (h5a0Var == null || (amount = h5a0Var.getAmount()) == null) ? null : amount.getAmount();
        if (amount2 != null) {
            if (amount2.compareTo(amount3) > 0) {
                constant = uosVar.c;
            } else if (amount2.compareTo(BigDecimal.valueOf(uosVar.a)) < 0) {
                constant = uosVar.b;
            }
        }
        Text.Constant constant2 = constant;
        q0(this, gns.a(gnsVar, null, null, null, constant2, BuildConfig.VERSION_CODE));
        return constant2 == null;
    }

    public final void c0() {
        if (((ins) X()).c != null) {
            this.D.b(((ins) X()).c.e.b);
            return;
        }
        if (((ins) X()).d == null) {
            x4c.g("statusScreen and openAndBuyScreen states are empty", null, null, Collections.singletonList(lrp0.k), 6);
            return;
        }
        gns gnsVar = ((ins) X()).d;
        if (!b0(gnsVar != null ? gnsVar.e : null)) {
            Z(lns.a);
            return;
        }
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = tje.N(ds31.a(this), null, null, new FundCreationViewModel$openFund$1(this, null, null), 3);
    }

    public final void d0(String str) {
        MoneyEntity moneyEntity;
        if (!this.N) {
            this.N = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        Integer l = bvu0.l(10, sb.toString());
        if (l != null) {
            int intValue = l.intValue();
            moneyEntity = new MoneyEntity(BigDecimal.valueOf(intValue), NumberFormatUtils$Currencies.RUB.getIso(), w530.a(this.I, Integer.valueOf(intValue), null, false, null, false, 62));
        } else {
            moneyEntity = new MoneyEntity(BigDecimal.ZERO, NumberFormatUtils$Currencies.RUB.getIso(), "");
        }
        MoneyEntity moneyEntity2 = moneyEntity;
        gns gnsVar = ((ins) X()).d;
        q0(this, gnsVar != null ? gns.a(gnsVar, moneyEntity2, null, null, null, 4079) : null);
        b0(moneyEntity2);
    }

    public final void e0() {
        this.C.f0.M(SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton.CLOSE, null);
    }

    public final void f0() {
        p0(this, null);
        String str = ((ins) X()).e;
        if (str != null) {
            n0(str);
            return;
        }
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = tje.N(ds31.a(this), null, null, new FundCreationViewModel$openFund$1(this, null, null), 3);
    }

    public final void g0() {
        Throwable th = ((ins) X()).a;
        FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
        String supportUrl = failDataException != null ? failDataException.getSupportUrl() : null;
        if (this.D.b(supportUrl)) {
            return;
        }
        ((gdm0) this.E).a(supportUrl);
    }

    public final void h0(SavingsTwoFactorAuthResult savingsTwoFactorAuthResult) {
        r0 r0Var;
        Object value;
        if (savingsTwoFactorAuthResult.equals(SavingsTwoFactorAuthResult.Cancel.INSTANCE)) {
            gns gnsVar = ((ins) X()).d;
            pz40 Y = Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new ins(null, null, null, gnsVar, null, null)));
            return;
        }
        if (!(savingsTwoFactorAuthResult instanceof SavingsTwoFactorAuthResult.Success)) {
            w511.b();
            return;
        }
        String verificationToken = ((SavingsTwoFactorAuthResult.Success) savingsTwoFactorAuthResult).getVerificationToken();
        pzt0 pzt0Var = this.L;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.L = tje.N(ds31.a(this), null, null, new FundCreationViewModel$openFund$1(this, verificationToken, null), 3);
    }

    public final void i0() {
        String str = ((ins) X()).e;
        if (str != null) {
            n0(str);
        }
    }

    public final void j0(boolean z) {
        if (z) {
            gns gnsVar = ((ins) X()).d;
            gns gnsVar2 = null;
            if (gnsVar != null) {
                gns gnsVar3 = ((ins) X()).d;
                gnsVar2 = gns.a(gnsVar, null, null, gnsVar3 != null ? gnsVar3.f : null, null, 4031);
            }
            q0(this, gnsVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0() {
        h5a0 h5a0Var;
        h5a0 h5a0Var2;
        h5a0 h5a0Var3;
        Object obj;
        gns gnsVar;
        rt1 rt1Var = this.C.f0;
        SavingsEvents$SavingsOpeningFundTopupScreenSendingAccountsButtonClickButton savingsEvents$SavingsOpeningFundTopupScreenSendingAccountsButtonClickButton = SavingsEvents$SavingsOpeningFundTopupScreenSendingAccountsButtonClickButton.READY;
        LinkedHashMap linkedHashMap = new LinkedHashMap(1);
        linkedHashMap.put("button", savingsEvents$SavingsOpeningFundTopupScreenSendingAccountsButtonClickButton.getOriginalValue());
        rt1Var.a.a("savings.opening.fund_topup_screen.sending_accounts.button.click", linkedHashMap);
        gns gnsVar2 = ((ins) X()).d;
        List list = gnsVar2 != null ? gnsVar2.i.a : null;
        if (gnsVar2 == null || (h5a0Var3 = gnsVar2.g) == null) {
            if (gnsVar2 == null || (h5a0Var2 = gnsVar2.f) == null) {
                h5a0Var = null;
                if (h5a0Var != null) {
                    this.G.c(unr0.h(Text.Companion, dzh0.ybsdk_common_default_error), Text.Empty.INSTANCE);
                    return;
                }
                boolean equals = h5a0Var.equals(gnsVar2 != null ? gnsVar2.f : null);
                kns knsVar = kns.a;
                if (!equals) {
                    gns gnsVar3 = ((ins) X()).d;
                    if (gnsVar3 != null) {
                        gns gnsVar4 = ((ins) X()).d;
                        gnsVar = gns.a(gnsVar3, null, h5a0Var, gnsVar4 != null ? gnsVar4.f : null, null, 3999);
                    } else {
                        gnsVar = null;
                    }
                    q0(this, gnsVar);
                    Z(knsVar);
                }
                gns gnsVar5 = ((ins) X()).d;
                b0(gnsVar5 != null ? gnsVar5.e : null);
                Z(knsVar);
                j0(true);
                return;
            }
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (jl40.l(((h5a0) obj).getId(), h5a0Var2.getId())) {
                            break;
                        }
                    }
                }
                h5a0Var3 = (h5a0) obj;
            } else {
                h5a0Var3 = null;
            }
        }
        h5a0Var = h5a0Var3;
        if (h5a0Var != null) {
        }
    }

    public final void l0() {
        AppAnalyticsReporter appAnalyticsReporter = this.C;
        appAnalyticsReporter.f0.M(SavingsEvents$SavingsOpeningFundTopupScreenButtonClickButton.LIST_SOURCES, null);
        gns gnsVar = ((ins) X()).d;
        if ((gnsVar != null ? gnsVar.i.a.size() : 0) <= 1) {
            return;
        }
        appAnalyticsReporter.f0.a.a("savings.opening.fund_topup_screen.sending_accounts.initiated", null);
        o0();
    }

    public final void m0(FundOpeningStatusScreenButtonCommon fundOpeningStatusScreenButtonCommon) {
        hns hnsVar = ((ins) X()).c;
        FundRequestStatusSuccessResponseEntity$ResultScreen$Type fundRequestStatusSuccessResponseEntity$ResultScreen$Type = hnsVar != null ? hnsVar.a : null;
        int i = fundRequestStatusSuccessResponseEntity$ResultScreen$Type == null ? -1 : nns.a[fundRequestStatusSuccessResponseEntity$ResultScreen$Type.ordinal()];
        AppAnalyticsReporter appAnalyticsReporter = this.C;
        if (i == -1) {
            rt1 rt1Var = appAnalyticsReporter.f0;
            LinkedHashMap linkedHashMap = new LinkedHashMap(1);
            linkedHashMap.put("button", fundOpeningStatusScreenButtonCommon.getOriginalValue());
            rt1Var.a.a("savings.opening.fund_error_screen.button.click", linkedHashMap);
            return;
        }
        if (i != 1) {
            w511.b();
            return;
        }
        rt1 rt1Var2 = appAnalyticsReporter.f0;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(1);
        linkedHashMap2.put("button", fundOpeningStatusScreenButtonCommon.getOriginalValue());
        rt1Var2.a.a("savings.opening.fund_wait_screen.button.click", linkedHashMap2);
    }

    public final void n0(String str) {
        pzt0 pzt0Var = this.M;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.M = tje.N(ds31.a(this), null, null, new FundCreationViewModel$requestStatus$1(this, str, null), 3);
    }

    public final void o0() {
        h5a0 h5a0Var;
        h5a0 h5a0Var2;
        gns gnsVar = ((ins) X()).d;
        if (gnsVar != null) {
            uda0 uda0Var = gnsVar.i;
            Text.Resource resource = new Text.Resource(dzh0.ybsdk_savings_source_selection_fund_open_ready_button);
            gns gnsVar2 = ((ins) X()).d;
            String str = null;
            String id = (gnsVar2 == null || (h5a0Var2 = gnsVar2.g) == null) ? null : h5a0Var2.getId();
            gns gnsVar3 = ((ins) X()).d;
            if (gnsVar3 != null && (h5a0Var = gnsVar3.f) != null) {
                str = h5a0Var.getId();
            }
            Z(new mns(resource, odq0.c(this.H, id, str, uda0Var, unr0.h(Text.Companion, dzh0.ybsdk_savings_fund_open_and_topup_bottom_sheet_title), 32)));
        }
    }

    public final void r0(zps zpsVar, Throwable th) {
        r0 r0Var;
        Object value;
        hns hnsVar;
        h5a0 h5a0Var;
        MoneyEntity moneyEntity;
        r0 r0Var2;
        Object value2;
        if (zpsVar instanceof vps) {
            vps vpsVar = (vps) zpsVar;
            fns fnsVar = new fns(vpsVar.a, vpsVar.b);
            pz40 Y = Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, ins.a((ins) value2, null, fnsVar, null, null, null, 56)));
            return;
        }
        if (zpsVar instanceof wps) {
            gns gnsVar = ((ins) X()).d;
            if (gnsVar == null || (h5a0Var = gnsVar.f) == null) {
                h5a0Var = ((wps) zpsVar).c;
            }
            h5a0 h5a0Var2 = h5a0Var;
            gns gnsVar2 = ((ins) X()).d;
            h5a0 h5a0Var3 = gnsVar2 != null ? gnsVar2.g : null;
            wps wpsVar = (wps) zpsVar;
            Text.Constant constant = wpsVar.h;
            Text.Constant constant2 = wpsVar.a;
            Text.Constant constant3 = wpsVar.b;
            rr51 rr51Var = wpsVar.g;
            gns gnsVar3 = ((ins) X()).d;
            if (gnsVar3 == null || (moneyEntity = gnsVar3.e) == null) {
                moneyEntity = wpsVar.e;
            }
            MoneyEntity moneyEntity2 = moneyEntity;
            uda0 uda0Var = wpsVar.d;
            uos uosVar = wpsVar.f;
            gns gnsVar4 = ((ins) X()).d;
            q0(this, new gns(constant2, constant3, constant, rr51Var, moneyEntity2, h5a0Var2, h5a0Var3, constant, uda0Var, uosVar, gnsVar4 != null ? gnsVar4.k : null, wpsVar.i));
            return;
        }
        if (!(zpsVar instanceof xps)) {
            if (zpsVar instanceof yps) {
                this.D.b(((yps) zpsVar).a);
                return;
            } else if (zpsVar == null) {
                p0(this, th);
                return;
            } else {
                w511.b();
                return;
            }
        }
        xps xpsVar = (xps) zpsVar;
        FundRequestStatusSuccessResponseEntity$ResultScreen$Type fundRequestStatusSuccessResponseEntity$ResultScreen$Type = xpsVar.a;
        hns hnsVar2 = new hns(fundRequestStatusSuccessResponseEntity$ResultScreen$Type, xpsVar.c, xpsVar.d, j5a0.d(xpsVar.b, 0, 3), xpsVar.e);
        int i = fundRequestStatusSuccessResponseEntity$ResultScreen$Type == null ? -1 : nns.a[fundRequestStatusSuccessResponseEntity$ResultScreen$Type.ordinal()];
        AppAnalyticsReporter appAnalyticsReporter = this.C;
        if (i == -1) {
            appAnalyticsReporter.f0.a.a("savings.opening.fund_error_screen.loaded", null);
        } else {
            if (i != 1) {
                w511.b();
                return;
            }
            appAnalyticsReporter.f0.a.a("savings.opening.fund_wait_screen.loaded", null);
        }
        pz40 Y2 = Y();
        do {
            r0Var = (r0) Y2;
            value = r0Var.getValue();
            hnsVar = hnsVar2;
            hnsVar2 = hnsVar;
        } while (!r0Var.k(value, ins.a((ins) value, null, null, hnsVar, null, null, 48)));
    }
}
