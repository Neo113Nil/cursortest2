package com.ybsdk.feature.autotopup.internal.domain;

import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupRecurrentWidgetToggledState;
import com.ybsdk.core.analytics.generated.delegates.TopupEvents$TopupRecurrentWidgetToggledType;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.autotopup.api.dto.PaymentMethodInfoDto;
import defpackage.bu3;
import defpackage.cu3;
import defpackage.d6v;
import defpackage.du3;
import defpackage.f42;
import defpackage.jl40;
import defpackage.mw3;
import defpackage.ny61;
import defpackage.ov3;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.y1b1;
import defpackage.z94;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes3.dex */
public final class a {
    public final com.ybsdk.feature.autotopup.internal.data.a a;
    public final f42 b;
    public final ov3 c;

    public a(com.ybsdk.feature.autotopup.internal.data.a aVar, f42 f42Var, ov3 ov3Var) {
        this.a = aVar;
        this.b = f42Var;
        this.c = ov3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mw3 mw3Var, d6v d6vVar, ContinuationImpl continuationImpl) {
        AutoTopupInteractorImpl$updateAutoTopupOffer$1 autoTopupInteractorImpl$updateAutoTopupOffer$1;
        int i;
        TopupEvents$TopupRecurrentWidgetToggledState topupEvents$TopupRecurrentWidgetToggledState;
        TopupEvents$TopupRecurrentWidgetToggledType topupEvents$TopupRecurrentWidgetToggledType;
        String str;
        Boolean bool;
        boolean z;
        Object O;
        BigDecimal amount;
        BigDecimal amount2;
        List list;
        Throwable a;
        mw3 mw3Var2 = mw3Var;
        if (continuationImpl instanceof AutoTopupInteractorImpl$updateAutoTopupOffer$1) {
            autoTopupInteractorImpl$updateAutoTopupOffer$1 = (AutoTopupInteractorImpl$updateAutoTopupOffer$1) continuationImpl;
            int i2 = autoTopupInteractorImpl$updateAutoTopupOffer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupInteractorImpl$updateAutoTopupOffer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = autoTopupInteractorImpl$updateAutoTopupOffer$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupInteractorImpl$updateAutoTopupOffer$1.label;
                f42 f42Var = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    z94 z94Var = f42Var.b.o0;
                    String str2 = mw3Var2.a;
                    Boolean bool2 = mw3Var2.d;
                    if (jl40.l(bool2, Boolean.TRUE)) {
                        topupEvents$TopupRecurrentWidgetToggledState = TopupEvents$TopupRecurrentWidgetToggledState.ON;
                    } else if (jl40.l(bool2, Boolean.FALSE)) {
                        topupEvents$TopupRecurrentWidgetToggledState = TopupEvents$TopupRecurrentWidgetToggledState.OFF;
                    } else {
                        if (bool2 != null) {
                            w511.b();
                            return null;
                        }
                        topupEvents$TopupRecurrentWidgetToggledState = null;
                    }
                    y1b1 y1b1Var = mw3Var2.e;
                    if (jl40.l(y1b1Var, bu3.a)) {
                        topupEvents$TopupRecurrentWidgetToggledType = TopupEvents$TopupRecurrentWidgetToggledType.LIMIT_EXACT;
                    } else if (jl40.l(y1b1Var, cu3.a)) {
                        topupEvents$TopupRecurrentWidgetToggledType = TopupEvents$TopupRecurrentWidgetToggledType.LIMIT_FILL;
                    } else if (jl40.l(y1b1Var, du3.a)) {
                        topupEvents$TopupRecurrentWidgetToggledType = TopupEvents$TopupRecurrentWidgetToggledType.REGULAR_PERIOD;
                    } else {
                        if (y1b1Var != null) {
                            w511.b();
                            return null;
                        }
                        topupEvents$TopupRecurrentWidgetToggledType = null;
                    }
                    String str3 = mw3Var2.h;
                    PaymentMethodInfoDto paymentMethodInfoDto = mw3Var2.j;
                    if (paymentMethodInfoDto == null || (str = paymentMethodInfoDto.getPaymentMethodId()) == null) {
                        str = "";
                    }
                    Money money = mw3Var2.f;
                    String plainString = (money == null || (amount2 = money.getAmount()) == null) ? null : amount2.toPlainString();
                    Money money2 = mw3Var2.g;
                    String plainString2 = (money2 == null || (amount = money2.getAmount()) == null) ? null : amount.toPlainString();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(7);
                    if (str2 != null) {
                        linkedHashMap.put("autoTopUpId", str2);
                    }
                    if (topupEvents$TopupRecurrentWidgetToggledState != null) {
                        linkedHashMap.put(ClidProvider.STATE, topupEvents$TopupRecurrentWidgetToggledState.getOriginalValue());
                    }
                    if (topupEvents$TopupRecurrentWidgetToggledType != null) {
                        linkedHashMap.put("type", topupEvents$TopupRecurrentWidgetToggledType.getOriginalValue());
                    }
                    if (str3 != null) {
                        linkedHashMap.put("agreementId", str3);
                    }
                    linkedHashMap.put("paymentMethodId", str);
                    if (plainString != null) {
                        linkedHashMap.put("money", plainString);
                    }
                    if (plainString2 != null) {
                        linkedHashMap.put("threshold", plainString2);
                    }
                    z94Var.a.a("topup.recurrent.widget_toggled", linkedHashMap);
                    String str4 = mw3Var2.a;
                    Object obj3 = str4 != null ? str4 : "";
                    bool = null;
                    wls autoTopupInteractorImpl$updateAutoTopupOffer$result$1 = new AutoTopupInteractorImpl$updateAutoTopupOffer$result$1(str4, this, mw3Var2, null);
                    autoTopupInteractorImpl$updateAutoTopupOffer$1.L$0 = mw3Var2;
                    z = true;
                    autoTopupInteractorImpl$updateAutoTopupOffer$1.label = 1;
                    O = d6vVar.O(autoTopupInteractorImpl$updateAutoTopupOffer$result$1, obj3, autoTopupInteractorImpl$updateAutoTopupOffer$1);
                    if (O == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mw3Var2 = (mw3) autoTopupInteractorImpl$updateAutoTopupOffer$1.L$0;
                    kotlin.b.b(obj);
                    O = ((Result) obj).getValue();
                    z = true;
                    bool = null;
                }
                if (!(O instanceof Result.Failure)) {
                    O = mw3.a(mw3Var2, (String) O, bool, 2046);
                }
                if (O instanceof Result.Failure) {
                    mw3 mw3Var3 = (mw3) O;
                    Boolean bool3 = mw3Var3.d;
                    this.c.a.a.edit().putBoolean("need_show_auto_topup_tooltip", bool3 != null ? bool3.booleanValue() : false).apply();
                    list = null;
                    f42Var.B(mw3Var2.a == null ? z : false, mw3Var3, null);
                } else {
                    list = null;
                }
                a = Result.a(O);
                if (a != null) {
                    x4c.g("Auto topup failed", a, list, list, 12);
                    f42Var.B(mw3Var2.a == null ? z : false, mw3Var2, a.getMessage());
                }
                return O;
            }
        }
        autoTopupInteractorImpl$updateAutoTopupOffer$1 = new AutoTopupInteractorImpl$updateAutoTopupOffer$1(this, continuationImpl);
        Object obj4 = autoTopupInteractorImpl$updateAutoTopupOffer$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupInteractorImpl$updateAutoTopupOffer$1.label;
        f42 f42Var2 = this.b;
        if (i != 0) {
        }
        if (!(O instanceof Result.Failure)) {
        }
        if (O instanceof Result.Failure) {
        }
        a = Result.a(O);
        if (a != null) {
        }
        return O;
    }
}
