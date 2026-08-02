package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.creditlimit.a;
import com.ybsdk.feature.cashback.impl.network.CashbackApi;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.input.BudgetChargesUinInputFragment;

/* loaded from: classes12.dex */
public final class pg5 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ pg5(og5 og5Var, v7p v7pVar, int i) {
        this.a = i;
        this.b = v7pVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new kg5("SetBrightnessAction", (krl0) ((oto0) xvf0Var).get(), b2r0.Companion.serializer());
            case 1:
                return new kg5("SetCreditLimitPurchaseSettingsAction", (a) ((oto0) xvf0Var).get(), q2r0.Companion.serializer());
            case 2:
                return new kg5("SetOrderResultFailAction", (pko) ((m7q0) xvf0Var).get(), r3r0.Companion.serializer());
            case 3:
                return new kg5("SetSessionExpiredAction", (q5p) ((m7q0) xvf0Var).get(), g4r0.Companion.serializer());
            case 4:
                return new kg5("ShowCutoutAction", (pko) ((z0s0) xvf0Var).get(), n6s0.Companion.serializer());
            case 5:
                return new kg5("ShowNativeScreenAction", (l7s0) ((z0s0) xvf0Var).get(), j7s0.Companion.serializer());
            case 6:
                return new kg5("StartOrderStatusPollingAction", (q5p) ((z0s0) xvf0Var).get(), q1u0.Companion.serializer());
            case 7:
                return new kg5("TerminalStateAction", (q5p) ((n2y0) xvf0Var).get(), ngy0.Companion.serializer());
            case 8:
                return new kg5("TopUpPayCardAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.topup.a) ((t4v0) xvf0Var).get(), vwz0.Companion.serializer());
            case 9:
                return new kg5("TransportFinishNfcAction", (c1x0) ((y501) xvf0Var).get(), p211.Companion.serializer());
            case 10:
                return new kg5("TransportReadBlocksAction", (j511) ((ibz0) xvf0Var).get(), f511.Companion.serializer());
            case 11:
                return new kg5("TransportReadCardAction", (kcz0) ((ibz0) xvf0Var).get(), r511.Companion.serializer());
            case 12:
                return new kg5("TransportWriteBlocksAction", (j511) ((ibz0) xvf0Var).get(), tb11.Companion.serializer());
            case 13:
                return new kg5("UpgradeSplitAction", (com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.upgrade.a) ((z6x0) xvf0Var).get(), gb21.Companion.serializer());
            case 14:
                return new t16((zc30) ((jl00) xvf0Var).get());
            case 15:
                return new u16((sy00) ((g3g) xvf0Var).get());
            case 16:
                return new sr4(10, (s411) ((ibz0) xvf0Var).get());
            case 17:
                return new pm5(3, (epf) xvf0Var);
            case 18:
                return new ru.yandex.taxi.masstransit.geopayment.adapter.a((v7j0) ((g3g) xvf0Var).get());
            case 19:
                return new BudgetChargesUinInputFragment((ht0) xvf0Var);
            case 20:
                return new i47((zuj0) ((jzf) xvf0Var).get(), 0);
            case 21:
                return new kh7((m2v) ((t4) xvf0Var).get());
            case 22:
                return new com.yandex.go.call_order_fallback.analytics.a((co40) ((rbx0) xvf0Var).get());
            case 23:
                return new o61((pho) ((p4g) xvf0Var).get());
            case 24:
                return new cy7((k7x0) ((xwf) xvf0Var).get());
            case 25:
                return new hh5(16, (co40) ((wz30) xvf0Var).get());
            case 26:
                return new pn8((al8) ((owf) xvf0Var).get());
            case 27:
                return new hh5(19, (ov3) ((owf) xvf0Var).get());
            case 28:
                return (CashbackApi) ((t0k0) ((owf) xvf0Var).get()).b(CashbackApi.class);
            default:
                return new c49((w530) ((owf) xvf0Var).get());
        }
    }

    public /* synthetic */ pg5(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }
}
