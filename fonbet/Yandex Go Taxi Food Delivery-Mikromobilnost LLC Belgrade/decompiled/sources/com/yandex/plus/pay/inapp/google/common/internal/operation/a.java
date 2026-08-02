package com.yandex.plus.pay.inapp.google.common.internal.operation;

import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppBillingUnavailableException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppCancelException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppConnectionException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppItemAlreadyOwnedException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppItemUnavailableException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppNotEnoughFundsException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppPurchaseUnspecifiedStateException;
import com.yandex.plus.pay.inapp.internal.error.PlusPayInAppUnexpectedException;
import defpackage.gcd0;
import defpackage.hcd0;
import defpackage.ncd0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, zy11 zy11Var, ContinuationImpl continuationImpl) {
        GoogleBillingOperationExtKt$executeOrThrow$1 googleBillingOperationExtKt$executeOrThrow$1;
        int i;
        PlusPayGoogleBillingResponse$Code plusPayGoogleBillingResponse$Code;
        if (continuationImpl instanceof GoogleBillingOperationExtKt$executeOrThrow$1) {
            googleBillingOperationExtKt$executeOrThrow$1 = (GoogleBillingOperationExtKt$executeOrThrow$1) continuationImpl;
            int i2 = googleBillingOperationExtKt$executeOrThrow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleBillingOperationExtKt$executeOrThrow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = googleBillingOperationExtKt$executeOrThrow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleBillingOperationExtKt$executeOrThrow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    googleBillingOperationExtKt$executeOrThrow$1.L$0 = null;
                    googleBillingOperationExtKt$executeOrThrow$1.L$1 = null;
                    googleBillingOperationExtKt$executeOrThrow$1.label = 1;
                    obj = cVar.a(zy11Var, googleBillingOperationExtKt$executeOrThrow$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                gcd0 gcd0Var = (gcd0) obj;
                hcd0 hcd0Var = gcd0Var.b;
                plusPayGoogleBillingResponse$Code = hcd0Var.a;
                if (plusPayGoogleBillingResponse$Code != PlusPayGoogleBillingResponse$Code.OK) {
                    Object obj3 = gcd0Var.a;
                    if (obj3 != null) {
                        return obj3;
                    }
                    ny61.g("Data must be set when code is OK");
                    return null;
                }
                String str = hcd0Var.b;
                switch (ncd0.a[plusPayGoogleBillingResponse$Code.ordinal()]) {
                    case 1:
                    case 2:
                        throw new PlusPayInAppConnectionException();
                    case 3:
                    case 4:
                        throw new PlusPayInAppBillingUnavailableException();
                    case 5:
                        throw new PlusPayInAppItemUnavailableException();
                    case 6:
                    case 7:
                        throw new PlusPayInAppUnexpectedException(str);
                    case 8:
                        throw new PlusPayInAppItemAlreadyOwnedException();
                    case 9:
                        throw new PlusPayInAppCancelException();
                    case 10:
                        throw new PlusPayInAppUnexpectedException(str);
                    case 11:
                        throw new PlusPayInAppPurchaseUnspecifiedStateException();
                    case 12:
                        throw new PlusPayInAppNotEnoughFundsException();
                    default:
                        throw new PlusPayInAppUnexpectedException(str);
                }
            }
        }
        googleBillingOperationExtKt$executeOrThrow$1 = new GoogleBillingOperationExtKt$executeOrThrow$1(continuationImpl);
        Object obj4 = googleBillingOperationExtKt$executeOrThrow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleBillingOperationExtKt$executeOrThrow$1.label;
        if (i != 0) {
        }
        gcd0 gcd0Var2 = (gcd0) obj4;
        hcd0 hcd0Var2 = gcd0Var2.b;
        plusPayGoogleBillingResponse$Code = hcd0Var2.a;
        if (plusPayGoogleBillingResponse$Code != PlusPayGoogleBillingResponse$Code.OK) {
        }
    }
}
