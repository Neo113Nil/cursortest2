package com.yandex.plus.pay.internal.analytics;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.pay.inapp.api.PlusPayInAppProductType;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppBillingUnavailableException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppCancelException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppConnectionException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppInvalidSignatureException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppItemAlreadyOwnedException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppItemUnavailableException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppNotEnoughFundsException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppPurchaseNotFoundException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppPurchaseUnspecifiedStateException;
import defpackage.bt90;
import defpackage.bwt;
import defpackage.g8e;
import defpackage.mcd0;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.rcd0;
import defpackage.ucd0;
import defpackage.yqx0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a implements ocd0 {
    public final ocd0 a;
    public final yqx0 b;

    public a(ocd0 ocd0Var, yqx0 yqx0Var) {
        this.a = ocd0Var;
        this.b = yqx0Var;
    }

    public static final void f(a aVar, Throwable th) {
        String str;
        yqx0 yqx0Var = aVar.b;
        if (th instanceof PlusPayInAppConnectionException) {
            g(aVar, th, "connection");
            return;
        }
        if (th instanceof PlusPayInAppBillingUnavailableException) {
            g(aVar, th, "billing_unavailable");
            return;
        }
        if (th instanceof PlusPayInAppItemUnavailableException) {
            g(aVar, th, "item_unavailable");
            return;
        }
        boolean z = th instanceof PlusPayInAppPurchaseNotFoundException;
        EmptyList emptyList = EmptyList.a;
        if (z) {
            String message = th.getMessage();
            str = message != null ? message : "";
            bt90 bt90Var = yqx0Var.a;
            String X = kotlin.collections.a.X(emptyList, null, null, null, null, 63);
            LinkedHashMap y = g8e.y(AuthSdkActivity.RESPONSE_TYPE_CODE, "purchase_not_found", Constants.KEY_MESSAGE, str);
            y.put("currency", "no_value");
            y.put("additionalData", "no_value");
            y.put("productIdentifier", X);
            y.put("_meta", bt90.b(new HashMap()));
            bt90Var.c("Error.Subscription.GooglePlay.Pay.Missing.Purchase", y);
            return;
        }
        if (th instanceof PlusPayInAppItemAlreadyOwnedException) {
            g(aVar, th, "item_already_owned");
            return;
        }
        if (th instanceof PlusPayInAppInvalidSignatureException) {
            g(aVar, th, "invalid_signature");
            return;
        }
        if (th instanceof PlusPayInAppPurchaseUnspecifiedStateException) {
            String message2 = th.getMessage();
            str = message2 != null ? message2 : "";
            bt90 bt90Var2 = yqx0Var.a;
            String X2 = kotlin.collections.a.X(emptyList, null, null, null, null, 63);
            LinkedHashMap y2 = g8e.y(AuthSdkActivity.RESPONSE_TYPE_CODE, "unspecified_purchase_state", Constants.KEY_MESSAGE, str);
            y2.put("currency", "no_value");
            y2.put("additionalData", "no_value");
            y2.put("productIdentifier", X2);
            y2.put("_meta", bt90.b(new HashMap()));
            bt90Var2.c("Error.Subscription.GooglePlay.Pay.Invalid.Unspecify", y2);
            return;
        }
        if (!(th instanceof PlusPayInAppNotEnoughFundsException)) {
            if (th instanceof PlusPayInAppCancelException) {
                return;
            }
            g(aVar, th, "unexpected");
            return;
        }
        String message3 = th.getMessage();
        str = message3 != null ? message3 : "";
        bt90 bt90Var3 = yqx0Var.a;
        String X3 = kotlin.collections.a.X(emptyList, null, null, null, null, 63);
        LinkedHashMap y3 = g8e.y(AuthSdkActivity.RESPONSE_TYPE_CODE, "not_enough_funds", Constants.KEY_MESSAGE, str);
        y3.put("currency", "no_value");
        y3.put("additionalData", "no_value");
        y3.put("productIdentifier", X3);
        y3.put("_meta", bt90.b(new HashMap()));
        bt90Var3.c("Error.Subscription.GooglePlay.Pay.NotEnoughFunds", y3);
    }

    public static final void g(a aVar, Throwable th, String str) {
        yqx0 yqx0Var = aVar.b;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        EmptyList emptyList = EmptyList.a;
        bt90 bt90Var = yqx0Var.a;
        String X = kotlin.collections.a.X(emptyList, null, null, null, null, 63);
        LinkedHashMap y = g8e.y(AuthSdkActivity.RESPONSE_TYPE_CODE, str, Constants.KEY_MESSAGE, message);
        y.put("currency", "no_value");
        y.put("additionalData", "no_value");
        y.put("productIdentifier", X);
        y.put("_meta", bt90.b(new HashMap()));
        bt90Var.c("Error.Subscription.GooglePlay.Pay.OtherError", y);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|32|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(List list, PlusPayInAppProductType plusPayInAppProductType, ContinuationImpl continuationImpl) {
        DiagnosticInAppPaymentFacadeDecorator$getProducts$1 diagnosticInAppPaymentFacadeDecorator$getProducts$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DiagnosticInAppPaymentFacadeDecorator$getProducts$1) {
            diagnosticInAppPaymentFacadeDecorator$getProducts$1 = (DiagnosticInAppPaymentFacadeDecorator$getProducts$1) continuationImpl;
            int i2 = diagnosticInAppPaymentFacadeDecorator$getProducts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diagnosticInAppPaymentFacadeDecorator$getProducts$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diagnosticInAppPaymentFacadeDecorator$getProducts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diagnosticInAppPaymentFacadeDecorator$getProducts$1.label;
                if (i != 0) {
                    b.b(obj);
                    ocd0 ocd0Var = this.a;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.L$0 = null;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.L$1 = null;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.L$2 = this;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.L$3 = null;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.L$4 = null;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.L$5 = null;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.I$0 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.I$1 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.I$2 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.I$3 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getProducts$1.label = 1;
                    obj = ocd0Var.a(list, plusPayInAppProductType, diagnosticInAppPaymentFacadeDecorator$getProducts$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) diagnosticInAppPaymentFacadeDecorator$getProducts$1.L$2;
                    b.b(obj);
                }
                Object failure = (List) obj;
                a = Result.a(failure);
                if (a != null) {
                    f(this, a);
                }
                b.b(failure);
                return failure;
            }
        }
        diagnosticInAppPaymentFacadeDecorator$getProducts$1 = new DiagnosticInAppPaymentFacadeDecorator$getProducts$1(this, continuationImpl);
        Object obj2 = diagnosticInAppPaymentFacadeDecorator$getProducts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diagnosticInAppPaymentFacadeDecorator$getProducts$1.label;
        if (i != 0) {
        }
        Object failure2 = (List) obj2;
        a = Result.a(failure2);
        if (a != null) {
        }
        b.b(failure2);
        return failure2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|32|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(PlusPayInAppProductType plusPayInAppProductType, ContinuationImpl continuationImpl) {
        DiagnosticInAppPaymentFacadeDecorator$getPurchases$1 diagnosticInAppPaymentFacadeDecorator$getPurchases$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DiagnosticInAppPaymentFacadeDecorator$getPurchases$1) {
            diagnosticInAppPaymentFacadeDecorator$getPurchases$1 = (DiagnosticInAppPaymentFacadeDecorator$getPurchases$1) continuationImpl;
            int i2 = diagnosticInAppPaymentFacadeDecorator$getPurchases$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diagnosticInAppPaymentFacadeDecorator$getPurchases$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diagnosticInAppPaymentFacadeDecorator$getPurchases$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diagnosticInAppPaymentFacadeDecorator$getPurchases$1.label;
                if (i != 0) {
                    b.b(obj);
                    ocd0 ocd0Var = this.a;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.L$0 = null;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.L$1 = this;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.L$2 = null;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.L$3 = null;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.L$4 = null;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.I$0 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.I$1 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.I$2 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.I$3 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getPurchases$1.label = 1;
                    obj = ocd0Var.b(plusPayInAppProductType, diagnosticInAppPaymentFacadeDecorator$getPurchases$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) diagnosticInAppPaymentFacadeDecorator$getPurchases$1.L$1;
                    b.b(obj);
                }
                Object failure = (List) obj;
                a = Result.a(failure);
                if (a != null) {
                    f(this, a);
                }
                b.b(failure);
                return failure;
            }
        }
        diagnosticInAppPaymentFacadeDecorator$getPurchases$1 = new DiagnosticInAppPaymentFacadeDecorator$getPurchases$1(this, continuationImpl);
        Object obj2 = diagnosticInAppPaymentFacadeDecorator$getPurchases$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diagnosticInAppPaymentFacadeDecorator$getPurchases$1.label;
        if (i != 0) {
        }
        Object failure2 = (List) obj2;
        a = Result.a(failure2);
        if (a != null) {
        }
        b.b(failure2);
        return failure2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0072, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        r7 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(rcd0 rcd0Var, ContinuationImpl continuationImpl) {
        DiagnosticInAppPaymentFacadeDecorator$completePurchase$1 diagnosticInAppPaymentFacadeDecorator$completePurchase$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DiagnosticInAppPaymentFacadeDecorator$completePurchase$1) {
            diagnosticInAppPaymentFacadeDecorator$completePurchase$1 = (DiagnosticInAppPaymentFacadeDecorator$completePurchase$1) continuationImpl;
            int i2 = diagnosticInAppPaymentFacadeDecorator$completePurchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diagnosticInAppPaymentFacadeDecorator$completePurchase$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diagnosticInAppPaymentFacadeDecorator$completePurchase$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diagnosticInAppPaymentFacadeDecorator$completePurchase$1.label;
                if (i != 0) {
                    b.b(obj);
                    ocd0 ocd0Var = this.a;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.L$0 = null;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.L$1 = this;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.L$2 = null;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.L$3 = null;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.L$4 = null;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.I$0 = 0;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.I$1 = 0;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.I$2 = 0;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.I$3 = 0;
                    diagnosticInAppPaymentFacadeDecorator$completePurchase$1.label = 1;
                    if (ocd0Var.c(rcd0Var, diagnosticInAppPaymentFacadeDecorator$completePurchase$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) diagnosticInAppPaymentFacadeDecorator$completePurchase$1.L$1;
                    b.b(obj);
                }
                Object obj2 = zy11.a;
                a = Result.a(obj2);
                if (a != null) {
                    f(this, a);
                }
                b.b(obj2);
                return obj2;
            }
        }
        diagnosticInAppPaymentFacadeDecorator$completePurchase$1 = new DiagnosticInAppPaymentFacadeDecorator$completePurchase$1(this, continuationImpl);
        Object obj3 = diagnosticInAppPaymentFacadeDecorator$completePurchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diagnosticInAppPaymentFacadeDecorator$completePurchase$1.label;
        if (i != 0) {
        }
        Object obj22 = zy11.a;
        a = Result.a(obj22);
        if (a != null) {
        }
        b.b(obj22);
        return obj22;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|32|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0042, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0078, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0040, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r8 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(bwt bwtVar, ucd0 ucd0Var, ContinuationImpl continuationImpl) {
        DiagnosticInAppPaymentFacadeDecorator$purchase$1 diagnosticInAppPaymentFacadeDecorator$purchase$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DiagnosticInAppPaymentFacadeDecorator$purchase$1) {
            diagnosticInAppPaymentFacadeDecorator$purchase$1 = (DiagnosticInAppPaymentFacadeDecorator$purchase$1) continuationImpl;
            int i2 = diagnosticInAppPaymentFacadeDecorator$purchase$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diagnosticInAppPaymentFacadeDecorator$purchase$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diagnosticInAppPaymentFacadeDecorator$purchase$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diagnosticInAppPaymentFacadeDecorator$purchase$1.label;
                if (i != 0) {
                    b.b(obj);
                    ocd0 ocd0Var = this.a;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.L$0 = null;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.L$1 = null;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.L$2 = this;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.L$3 = null;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.L$4 = null;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.L$5 = null;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.I$0 = 0;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.I$1 = 0;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.I$2 = 0;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.I$3 = 0;
                    diagnosticInAppPaymentFacadeDecorator$purchase$1.label = 1;
                    obj = ocd0Var.d(bwtVar, ucd0Var, diagnosticInAppPaymentFacadeDecorator$purchase$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) diagnosticInAppPaymentFacadeDecorator$purchase$1.L$2;
                    b.b(obj);
                }
                Object failure = (rcd0) obj;
                a = Result.a(failure);
                if (a != null) {
                    f(this, a);
                }
                b.b(failure);
                return failure;
            }
        }
        diagnosticInAppPaymentFacadeDecorator$purchase$1 = new DiagnosticInAppPaymentFacadeDecorator$purchase$1(this, continuationImpl);
        Object obj2 = diagnosticInAppPaymentFacadeDecorator$purchase$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diagnosticInAppPaymentFacadeDecorator$purchase$1.label;
        if (i != 0) {
        }
        Object failure2 = (rcd0) obj2;
        a = Result.a(failure2);
        if (a != null) {
        }
        b.b(failure2);
        return failure2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        r0 = new kotlin.Result.Failure(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.ocd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        DiagnosticInAppPaymentFacadeDecorator$getConfig$1 diagnosticInAppPaymentFacadeDecorator$getConfig$1;
        int i;
        Throwable a;
        if (continuationImpl instanceof DiagnosticInAppPaymentFacadeDecorator$getConfig$1) {
            diagnosticInAppPaymentFacadeDecorator$getConfig$1 = (DiagnosticInAppPaymentFacadeDecorator$getConfig$1) continuationImpl;
            int i2 = diagnosticInAppPaymentFacadeDecorator$getConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                diagnosticInAppPaymentFacadeDecorator$getConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = diagnosticInAppPaymentFacadeDecorator$getConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = diagnosticInAppPaymentFacadeDecorator$getConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    ocd0 ocd0Var = this.a;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.L$0 = this;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.L$1 = null;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.L$2 = null;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.L$3 = null;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.I$0 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.I$1 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.I$2 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.I$3 = 0;
                    diagnosticInAppPaymentFacadeDecorator$getConfig$1.label = 1;
                    obj = ocd0Var.e(diagnosticInAppPaymentFacadeDecorator$getConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) diagnosticInAppPaymentFacadeDecorator$getConfig$1.L$0;
                    b.b(obj);
                }
                Object obj2 = (mcd0) obj;
                a = Result.a(obj2);
                if (a != null) {
                    f(this, a);
                }
                b.b(obj2);
                return obj2;
            }
        }
        diagnosticInAppPaymentFacadeDecorator$getConfig$1 = new DiagnosticInAppPaymentFacadeDecorator$getConfig$1(this, continuationImpl);
        Object obj3 = diagnosticInAppPaymentFacadeDecorator$getConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = diagnosticInAppPaymentFacadeDecorator$getConfig$1.label;
        if (i != 0) {
        }
        Object obj22 = (mcd0) obj3;
        a = Result.a(obj22);
        if (a != null) {
        }
        b.b(obj22);
        return obj22;
    }
}
