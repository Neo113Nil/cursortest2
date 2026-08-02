package com.yandex.go.platform.payments.domain;

import android.content.Context;
import android.content.Intent;
import com.yandex.go.platform.payments.models.PaymentException;
import com.yandex.payment.sdk.core.data.BoundCard;
import com.yandex.payment.sdk.core.data.PaymentKitError;
import defpackage.b60;
import defpackage.ffx;
import defpackage.ksi0;
import defpackage.l50;
import defpackage.lb20;
import defpackage.mb20;
import defpackage.ny61;
import defpackage.q40;
import defpackage.su5;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final Context a;
    public final b60 b;
    public final l50 c;
    public final com.yandex.go.platform.payments.internal.a d;
    public final lb20 e;

    public a(Context context, com.yandex.go.platform.sdk.activity.b bVar, com.yandex.go.platform.sdk.activity.b bVar2, com.yandex.go.platform.payments.internal.a aVar, lb20 lb20Var) {
        this.a = context;
        this.b = bVar;
        this.c = bVar2;
        this.d = aVar;
        this.e = lb20Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0063, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004e, code lost:
    
        if (r6 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        BindCardInteractor$bindCard$1 bindCardInteractor$bindCard$1;
        int i;
        Object b;
        Throwable a;
        if (continuationImpl instanceof BindCardInteractor$bindCard$1) {
            bindCardInteractor$bindCard$1 = (BindCardInteractor$bindCard$1) continuationImpl;
            int i2 = bindCardInteractor$bindCard$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bindCardInteractor$bindCard$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bindCardInteractor$bindCard$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bindCardInteractor$bindCard$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bindCardInteractor$bindCard$1.L$0 = this;
                    bindCardInteractor$bindCard$1.label = 1;
                    b = b(str, str2, str3, bindCardInteractor$bindCard$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (a) bindCardInteractor$bindCard$1.L$0;
                        kotlin.b.b(obj);
                        b = (q40) obj;
                        a = Result.a(b);
                        if (a != null) {
                            return new Result.Failure(a);
                        }
                        q40 q40Var = (q40) b;
                        this.getClass();
                        Intent intent = q40Var.c;
                        if (intent != null) {
                            BoundCard boundCard = (BoundCard) ffx.P(intent, "DATA", BoundCard.class);
                            if (boundCard != null) {
                                boundCard.toString();
                                return new su5(boundCard.getCardId(), boundCard.getRrn());
                            }
                            PaymentKitError paymentKitError = (PaymentKitError) ffx.P(intent, "ERROR", PaymentKitError.class);
                            if (paymentKitError != null) {
                                ((mb20) this.e).a("BindCardInteractor", "Error while binding card", paymentKitError);
                                return new Result.Failure(new IllegalStateException(paymentKitError.getMessage()));
                            }
                        }
                        return q40Var.b == -1 ? new Result.Failure(PaymentException.EmptyResult.a) : new Result.Failure(PaymentException.AbortPaymentOperation.a);
                    }
                    this = (a) bindCardInteractor$bindCard$1.L$0;
                    kotlin.b.b(obj);
                    b = ((Result) obj).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    l50 l50Var = this.c;
                    bindCardInteractor$bindCard$1.L$0 = this;
                    bindCardInteractor$bindCard$1.label = 2;
                    obj = l50Var.a(401, bindCardInteractor$bindCard$1);
                }
                a = Result.a(b);
                if (a != null) {
                }
            }
        }
        bindCardInteractor$bindCard$1 = new BindCardInteractor$bindCard$1(this, continuationImpl);
        Object obj2 = bindCardInteractor$bindCard$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bindCardInteractor$bindCard$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        a = Result.a(b);
        if (a != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        BindCardInteractor$showCardsActivity$1 bindCardInteractor$showCardsActivity$1;
        int i;
        try {
            if (continuationImpl instanceof BindCardInteractor$showCardsActivity$1) {
                bindCardInteractor$showCardsActivity$1 = (BindCardInteractor$showCardsActivity$1) continuationImpl;
                int i2 = bindCardInteractor$showCardsActivity$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bindCardInteractor$showCardsActivity$1.label = i2 - Integer.MIN_VALUE;
                    BindCardInteractor$showCardsActivity$1 bindCardInteractor$showCardsActivity$12 = bindCardInteractor$showCardsActivity$1;
                    Object obj = bindCardInteractor$showCardsActivity$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bindCardInteractor$showCardsActivity$12.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        com.yandex.go.platform.payments.internal.a aVar = this.d;
                        Context applicationContext = this.a.getApplicationContext();
                        bindCardInteractor$showCardsActivity$12.L$0 = this;
                        bindCardInteractor$showCardsActivity$12.label = 1;
                        obj = aVar.b(applicationContext, str, str3, str2, bindCardInteractor$showCardsActivity$12);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = (a) bindCardInteractor$showCardsActivity$12.L$0;
                        kotlin.b.b(obj);
                    }
                    this.b.startActivityForResult(((ksi0) obj).c(), 401);
                    return zy11.a;
                }
            }
            if (i != 0) {
            }
            this.b.startActivityForResult(((ksi0) obj).c(), 401);
            return zy11.a;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            return new Result.Failure(th);
        }
        bindCardInteractor$showCardsActivity$1 = new BindCardInteractor$showCardsActivity$1(this, continuationImpl);
        BindCardInteractor$showCardsActivity$1 bindCardInteractor$showCardsActivity$122 = bindCardInteractor$showCardsActivity$1;
        Object obj2 = bindCardInteractor$showCardsActivity$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bindCardInteractor$showCardsActivity$122.label;
    }
}
