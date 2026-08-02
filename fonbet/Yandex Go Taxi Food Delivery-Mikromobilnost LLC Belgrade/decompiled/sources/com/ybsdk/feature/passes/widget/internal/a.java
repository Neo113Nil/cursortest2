package com.ybsdk.feature.passes.widget.internal;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.WalletLoyaltyWidgetPageTypeCommon;
import com.ybsdk.core.analytics.generated.delegates.LoyaltyCardsWidgetEvents$WalletLoyaltyCardsWidgetLoadingResultResult;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import com.ybsdk.feature.passes.widget.api.entity.PassesWidgetScreenType;
import defpackage.ew2;
import defpackage.hm90;
import defpackage.kgx;
import defpackage.km90;
import defpackage.l0p;
import defpackage.mm90;
import defpackage.nm90;
import defpackage.ny61;
import defpackage.p370;
import defpackage.r8j0;
import defpackage.rr51;
import defpackage.s8j0;
import defpackage.w511;
import java.util.LinkedHashMap;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final AppAnalyticsReporter a;
    public final b b;
    public final p370 c;
    public final WalletLoyaltyWidgetPageTypeCommon d;

    public a(AppAnalyticsReporter appAnalyticsReporter, b bVar, p370 p370Var) {
        WalletLoyaltyWidgetPageTypeCommon walletLoyaltyWidgetPageTypeCommon;
        this.a = appAnalyticsReporter;
        this.b = bVar;
        this.c = p370Var;
        int i = km90.a[((PassesWidgetScreenType) p370Var.w).ordinal()];
        if (i == 1) {
            walletLoyaltyWidgetPageTypeCommon = WalletLoyaltyWidgetPageTypeCommon.PAY_BY_QR;
        } else {
            if (i != 2) {
                w511.b();
                throw null;
            }
            walletLoyaltyWidgetPageTypeCommon = WalletLoyaltyWidgetPageTypeCommon.PAY_BY_NFC;
        }
        this.d = walletLoyaltyWidgetPageTypeCommon;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nm90 nm90Var, ContinuationImpl continuationImpl) {
        PassesWidgetInteractorImpl$loadPassesWidgetData$1 passesWidgetInteractorImpl$loadPassesWidgetData$1;
        int i;
        Object a;
        if (continuationImpl instanceof PassesWidgetInteractorImpl$loadPassesWidgetData$1) {
            passesWidgetInteractorImpl$loadPassesWidgetData$1 = (PassesWidgetInteractorImpl$loadPassesWidgetData$1) continuationImpl;
            int i2 = passesWidgetInteractorImpl$loadPassesWidgetData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passesWidgetInteractorImpl$loadPassesWidgetData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passesWidgetInteractorImpl$loadPassesWidgetData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passesWidgetInteractorImpl$loadPassesWidgetData$1.label;
                RequestStatus$Data$Source requestStatus$Data$Source = null;
                p370 p370Var = this.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l0p l0pVar = this.a.H;
                    Boolean valueOf = Boolean.valueOf(p370Var.z());
                    LinkedHashMap linkedHashMap = new LinkedHashMap(2);
                    linkedHashMap.put("page_type", this.d.getOriginalValue());
                    linkedHashMap.put("local_agreement_accepted", valueOf);
                    l0pVar.a.a("wallet_loyalty_cards_widget.loading.initiated", linkedHashMap);
                    PassesWidgetScreenType passesWidgetScreenType = (PassesWidgetScreenType) p370Var.w;
                    passesWidgetInteractorImpl$loadPassesWidgetData$1.L$0 = nm90Var;
                    passesWidgetInteractorImpl$loadPassesWidgetData$1.label = 1;
                    a = this.b.a(passesWidgetScreenType, passesWidgetInteractorImpl$loadPassesWidgetData$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nm90Var = (nm90) passesWidgetInteractorImpl$loadPassesWidgetData$1.L$0;
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (!(a instanceof Result.Failure)) {
                    Throwable a2 = Result.a(a);
                    if (a2 == null) {
                        return nm90Var;
                    }
                    b(null, false);
                    boolean z = nm90Var.b;
                    return !z ? nm90Var : new nm90(new s8j0(a2), z);
                }
                hm90 hm90Var = (hm90) a;
                boolean z2 = hm90Var.b;
                b(Boolean.valueOf(z2), true);
                ew2 ew2Var = ((mm90) p370Var.b).a;
                kgx kgxVar = mm90.b[0];
                ew2Var.d(z2);
                boolean z3 = nm90Var.b;
                if (!z3) {
                    return nm90Var;
                }
                rr51 rr51Var = hm90Var.a;
                if (!z2) {
                    rr51Var = null;
                }
                return new nm90(new r8j0(new hm90(rr51Var, z2), requestStatus$Data$Source, 14), z3);
            }
        }
        passesWidgetInteractorImpl$loadPassesWidgetData$1 = new PassesWidgetInteractorImpl$loadPassesWidgetData$1(this, continuationImpl);
        Object obj2 = passesWidgetInteractorImpl$loadPassesWidgetData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passesWidgetInteractorImpl$loadPassesWidgetData$1.label;
        RequestStatus$Data$Source requestStatus$Data$Source2 = null;
        p370 p370Var2 = this.c;
        if (i != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }

    public final void b(Boolean bool, boolean z) {
        l0p l0pVar = this.a.H;
        LoyaltyCardsWidgetEvents$WalletLoyaltyCardsWidgetLoadingResultResult loyaltyCardsWidgetEvents$WalletLoyaltyCardsWidgetLoadingResultResult = z ? LoyaltyCardsWidgetEvents$WalletLoyaltyCardsWidgetLoadingResultResult.OK : LoyaltyCardsWidgetEvents$WalletLoyaltyCardsWidgetLoadingResultResult.ERROR;
        Boolean valueOf = Boolean.valueOf(this.c.z());
        LinkedHashMap linkedHashMap = new LinkedHashMap(4);
        linkedHashMap.put("page_type", this.d.getOriginalValue());
        linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, loyaltyCardsWidgetEvents$WalletLoyaltyCardsWidgetLoadingResultResult.getOriginalValue());
        linkedHashMap.put("local_agreement_accepted", valueOf);
        if (bool != null) {
            linkedHashMap.put("remote_agreement_accepted", bool);
        }
        l0pVar.a.a("wallet_loyalty_cards_widget.loading.result", linkedHashMap);
    }
}
