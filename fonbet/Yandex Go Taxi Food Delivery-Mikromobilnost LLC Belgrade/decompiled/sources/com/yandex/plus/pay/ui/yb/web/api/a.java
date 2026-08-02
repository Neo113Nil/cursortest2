package com.yandex.plus.pay.ui.yb.web.api;

import com.yandex.plus.core.activity.result.internal.c;
import com.yandex.plus.core.data.common.PlusThemedUrl;
import com.yandex.plus.pay.internal.model.PlusPayCompositeOfferDetails;
import com.yandex.plus.pay.internal.model.PlusPayWebPaymentWidgetTimeoutParams;
import com.yandex.plus.pay.ui.yb.api.PlusPayYbCardScenario;
import com.yandex.plus.pay.ui.yb.web.internal.YbWebResult;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.bhd0;
import defpackage.chd0;
import defpackage.dhd0;
import defpackage.ehb1;
import defpackage.ez51;
import defpackage.gbd0;
import defpackage.gz51;
import defpackage.h73;
import defpackage.ht11;
import defpackage.ind0;
import defpackage.ixn;
import defpackage.jhd0;
import defpackage.js41;
import defpackage.jz51;
import defpackage.ki41;
import defpackage.ny61;
import defpackage.pgz;
import defpackage.qrq0;
import defpackage.tpd0;
import defpackage.up51;
import defpackage.w511;
import defpackage.xyj;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final jhd0 a;
    public final String b;

    public a(String str, com.yandex.plus.domain.auth.impl.a aVar, ki41 ki41Var, pgz pgzVar, up51 up51Var, xyj xyjVar, ht11 ht11Var, jhd0 jhd0Var, gbd0 gbd0Var) {
        this.a = jhd0Var;
        this.b = str;
        ((Map) ez51.c.b.getValue()).put(str, new gz51(aVar, ki41Var, pgzVar, up51Var, xyjVar, ht11Var, gbd0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PlusPayYbCardScenario plusPayYbCardScenario, ContinuationImpl continuationImpl) {
        PlusPayYbWebFacade$launchScenario$1 plusPayYbWebFacade$launchScenario$1;
        int i;
        Object obj;
        Object obj2;
        String str;
        Object b;
        Long loadMessageTimeoutMillis;
        Long startMessageTimeoutMillis;
        PlusThemedUrl widgetUrls;
        PlusThemedUrl widgetUrls2;
        List<PlusPayCompositeOfferDetails.PaymentMethodsGroup> paymentMethodsGroups;
        YbWebResult ybWebResult;
        if (continuationImpl instanceof PlusPayYbWebFacade$launchScenario$1) {
            plusPayYbWebFacade$launchScenario$1 = (PlusPayYbWebFacade$launchScenario$1) continuationImpl;
            int i2 = plusPayYbWebFacade$launchScenario$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayYbWebFacade$launchScenario$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = plusPayYbWebFacade$launchScenario$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayYbWebFacade$launchScenario$1.label;
                if (i != 0) {
                    b.b(obj3);
                    jz51 jz51Var = (jz51) this.a;
                    ind0 a = jz51Var.b.a();
                    PlusPayCompositeOfferDetails offerDetails = a.b.getOfferDetails();
                    qrq0 l = (offerDetails == null || (paymentMethodsGroups = offerDetails.getPaymentMethodsGroups()) == null) ? ixn.a : kotlin.sequences.b.l(new h73(1, paymentMethodsGroups), new js41(29));
                    Iterator it = l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (((PlusPayCompositeOfferDetails.PaymentMethod) obj).getType() == PlusPayCompositeOfferDetails.PaymentMethod.Type.NEW_YB_CARD) {
                            break;
                        }
                    }
                    PlusPayCompositeOfferDetails.PaymentMethod paymentMethod = (PlusPayCompositeOfferDetails.PaymentMethod) obj;
                    Iterator it2 = l.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        PlusPayCompositeOfferDetails.PaymentMethod paymentMethod2 = (PlusPayCompositeOfferDetails.PaymentMethod) obj2;
                        if (paymentMethod2.getType() == PlusPayCompositeOfferDetails.PaymentMethod.Type.CARD && (widgetUrls2 = paymentMethod2.getWidgetUrls()) != null && widgetUrls2.isNotEmpty()) {
                            break;
                        }
                    }
                    PlusPayCompositeOfferDetails.PaymentMethod paymentMethod3 = (PlusPayCompositeOfferDetails.PaymentMethod) obj2;
                    if (paymentMethod == null) {
                        paymentMethod = paymentMethod3;
                    }
                    PlusPayWebPaymentWidgetTimeoutParams timeoutParams = paymentMethod != null ? paymentMethod.getTimeoutParams() : null;
                    if (paymentMethod != null && (widgetUrls = paymentMethod.getWidgetUrls()) != null) {
                        String str2 = (String) (tpd0.a(jz51Var.a, (PlusTheme) jz51Var.c.getValue()) ? widgetUrls.getDark() : widgetUrls.getLight());
                        if (str2 != null) {
                            str = ehb1.b(str2, a.a);
                            if (str != null) {
                                ny61.g("Widget url is absent!");
                                return null;
                            }
                            long j = 10000;
                            long longValue = (timeoutParams == null || (startMessageTimeoutMillis = timeoutParams.getStartMessageTimeoutMillis()) == null) ? 10000L : startMessageTimeoutMillis.longValue();
                            if (timeoutParams != null && (loadMessageTimeoutMillis = timeoutParams.getLoadMessageTimeoutMillis()) != null) {
                                j = loadMessageTimeoutMillis.longValue();
                            }
                            c cVar = c.d;
                            com.yandex.plus.pay.ui.yb.web.internal.ui.a aVar = new com.yandex.plus.pay.ui.yb.web.internal.ui.a(this.b);
                            PlusPayYbWebActivity.Arguments arguments = new PlusPayYbWebActivity.Arguments(str, longValue, j, plusPayYbCardScenario);
                            plusPayYbWebFacade$launchScenario$1.L$0 = null;
                            plusPayYbWebFacade$launchScenario$1.L$1 = null;
                            plusPayYbWebFacade$launchScenario$1.label = 1;
                            b = cVar.b(aVar, arguments, plusPayYbWebFacade$launchScenario$1);
                            if (b == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    str = null;
                    if (str != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj3);
                    b = ((Result) obj3).getValue();
                }
                if (Result.a(b) != null) {
                    b = YbWebResult.Cancel.INSTANCE;
                }
                ybWebResult = (YbWebResult) b;
                if (!(ybWebResult instanceof YbWebResult.SuccessOpenCard)) {
                    return new dhd0(((YbWebResult.SuccessOpenCard) ybWebResult).getPaymentMethodId());
                }
                if (ybWebResult instanceof YbWebResult.SuccessTopupCard) {
                    return new dhd0(null);
                }
                if (ybWebResult instanceof YbWebResult.Error) {
                    return new chd0(new PlusPayYbWebException("Something went wrong with yb webview"));
                }
                if (ybWebResult instanceof YbWebResult.Cancel) {
                    return bhd0.a;
                }
                w511.b();
                return null;
            }
        }
        plusPayYbWebFacade$launchScenario$1 = new PlusPayYbWebFacade$launchScenario$1(this, continuationImpl);
        Object obj32 = plusPayYbWebFacade$launchScenario$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayYbWebFacade$launchScenario$1.label;
        if (i != 0) {
        }
        if (Result.a(b) != null) {
        }
        ybWebResult = (YbWebResult) b;
        if (!(ybWebResult instanceof YbWebResult.SuccessOpenCard)) {
        }
    }
}
