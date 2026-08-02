package com.yandex.go.platform.payments.domain;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.yandex.go.platform.payments.models.PaymentException;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import com.yandex.payment.sdk.ui.BaseActivity;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.xplat.payment.sdk.ApiMethodNameForAnalytics;
import defpackage.b60;
import defpackage.ffx;
import defpackage.ksi0;
import defpackage.l50;
import defpackage.lb20;
import defpackage.mb20;
import defpackage.mrj;
import defpackage.ny61;
import defpackage.q40;
import defpackage.qv90;
import defpackage.sv90;
import defpackage.zy11;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final Context a;
    public final b60 b;
    public final l50 c;
    public final com.yandex.go.platform.payments.internal.a d;
    public final lb20 e;

    public d(Context context, com.yandex.go.platform.sdk.activity.b bVar, com.yandex.go.platform.sdk.activity.b bVar2, com.yandex.go.platform.payments.internal.a aVar, lb20 lb20Var) {
        this.a = context;
        this.b = bVar;
        this.c = bVar2;
        this.d = aVar;
        this.e = lb20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r14 != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a4, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005d, code lost:
    
        if (r14 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        VerifyCardInteractor$verifyCard$1 verifyCardInteractor$verifyCard$1;
        int i;
        if (continuationImpl instanceof VerifyCardInteractor$verifyCard$1) {
            verifyCardInteractor$verifyCard$1 = (VerifyCardInteractor$verifyCard$1) continuationImpl;
            int i2 = verifyCardInteractor$verifyCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                verifyCardInteractor$verifyCard$1.label = i2 - Integer.MIN_VALUE;
                VerifyCardInteractor$verifyCard$1 verifyCardInteractor$verifyCard$12 = verifyCardInteractor$verifyCard$1;
                Object obj = verifyCardInteractor$verifyCard$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = verifyCardInteractor$verifyCard$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Context applicationContext = this.a.getApplicationContext();
                    verifyCardInteractor$verifyCard$12.L$0 = this;
                    verifyCardInteractor$verifyCard$12.L$1 = str;
                    verifyCardInteractor$verifyCard$12.label = 1;
                    obj = this.d.b(applicationContext, str2, str3, null, verifyCardInteractor$verifyCard$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (d) verifyCardInteractor$verifyCard$12.L$0;
                        kotlin.b.b(obj);
                        q40 q40Var = (q40) obj;
                        this.getClass();
                        Intent intent = q40Var.c;
                        if (intent != null) {
                            BoundCard boundCard = (BoundCard) ffx.P(intent, "DATA", BoundCard.class);
                            if (boundCard != null) {
                                boundCard.toString();
                                return zy11.a;
                            }
                            PaymentKitError paymentKitError = (PaymentKitError) ffx.P(intent, "ERROR", PaymentKitError.class);
                            if (paymentKitError != null) {
                                ((mb20) this.e).a("VerifyCardInteractor", "Error while verifying card", paymentKitError);
                                return new Result.Failure(new IllegalStateException(paymentKitError.getMessage()));
                            }
                        }
                        return q40Var.b == -1 ? new Result.Failure(PaymentException.EmptyResult.a) : new Result.Failure(PaymentException.AbortPaymentOperation.a);
                    }
                    str = (String) verifyCardInteractor$verifyCard$12.L$1;
                    this = (d) verifyCardInteractor$verifyCard$12.L$0;
                    kotlin.b.b(obj);
                }
                ksi0 ksi0Var = (ksi0) obj;
                b60 b60Var = this.b;
                ksi0Var.getClass();
                Intent putExtra = ksi0Var.a(true, BindCardActivity.class).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, false).putExtra(BaseActivity.EXTRA_VERIFY_CARD_ID, str).putExtra(BaseActivity.EXTRA_CAMERA_CARD_SCANNER, (Parcelable) null);
                sv90 sv90Var = qv90.a;
                ApiMethodNameForAnalytics apiMethodNameForAnalytics = ApiMethodNameForAnalytics.VERIFY_CARD;
                sv90Var.getClass();
                ksi0Var.i(new mrj(15, apiMethodNameForAnalytics));
                b60Var.startActivityForResult(putExtra, 402);
                l50 l50Var = this.c;
                verifyCardInteractor$verifyCard$12.L$0 = this;
                verifyCardInteractor$verifyCard$12.L$1 = null;
                verifyCardInteractor$verifyCard$12.label = 2;
                obj = l50Var.a(402, verifyCardInteractor$verifyCard$12);
            }
        }
        verifyCardInteractor$verifyCard$1 = new VerifyCardInteractor$verifyCard$1(this, continuationImpl);
        VerifyCardInteractor$verifyCard$1 verifyCardInteractor$verifyCard$122 = verifyCardInteractor$verifyCard$1;
        Object obj2 = verifyCardInteractor$verifyCard$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = verifyCardInteractor$verifyCard$122.label;
        if (i != 0) {
        }
        ksi0 ksi0Var2 = (ksi0) obj2;
        b60 b60Var2 = this.b;
        ksi0Var2.getClass();
        Intent putExtra2 = ksi0Var2.a(true, BindCardActivity.class).putExtra(BaseActivity.EXTRA_PAYMENT_CONTEXT, false).putExtra(BaseActivity.EXTRA_VERIFY_CARD_ID, str).putExtra(BaseActivity.EXTRA_CAMERA_CARD_SCANNER, (Parcelable) null);
        sv90 sv90Var2 = qv90.a;
        ApiMethodNameForAnalytics apiMethodNameForAnalytics2 = ApiMethodNameForAnalytics.VERIFY_CARD;
        sv90Var2.getClass();
        ksi0Var2.i(new mrj(15, apiMethodNameForAnalytics2));
        b60Var2.startActivityForResult(putExtra2, 402);
        l50 l50Var2 = this.c;
        verifyCardInteractor$verifyCard$122.L$0 = this;
        verifyCardInteractor$verifyCard$122.L$1 = null;
        verifyCardInteractor$verifyCard$122.label = 2;
        obj2 = l50Var2.a(402, verifyCardInteractor$verifyCard$122);
    }
}
