package com.yandex.plus.pay.internal.feature.payment.inapp.google.domain;

import com.yandex.plus.pay.api.google.model.GoogleBillingConfig;
import defpackage.hbd0;
import defpackage.jse;
import defpackage.mcd0;
import defpackage.ny61;
import defpackage.ocd0;
import defpackage.tje;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final ocd0 a;
    public final jse b;
    public final hbd0 c;

    public a(ocd0 ocd0Var, jse jseVar, hbd0 hbd0Var) {
        this.a = ocd0Var;
        this.b = jseVar;
        this.c = hbd0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|13|(1:15)|16|(1:21)(2:18|19)))|35|6|7|(0)(0)|12|13|(0)|16|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0039, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        r6 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0060, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0037, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
    
        r6 = new kotlin.Result.Failure(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        GoogleConfigInteractorImpl$getBillingConfig$1 googleConfigInteractorImpl$getBillingConfig$1;
        Object obj;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof GoogleConfigInteractorImpl$getBillingConfig$1) {
            googleConfigInteractorImpl$getBillingConfig$1 = (GoogleConfigInteractorImpl$getBillingConfig$1) continuationImpl;
            int i2 = googleConfigInteractorImpl$getBillingConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                googleConfigInteractorImpl$getBillingConfig$1.label = i2 - Integer.MIN_VALUE;
                obj = googleConfigInteractorImpl$getBillingConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = googleConfigInteractorImpl$getBillingConfig$1.label;
                if (i != 0) {
                    b.b(obj);
                    ocd0 ocd0Var = aVar.a;
                    googleConfigInteractorImpl$getBillingConfig$1.L$0 = null;
                    googleConfigInteractorImpl$getBillingConfig$1.L$1 = null;
                    googleConfigInteractorImpl$getBillingConfig$1.L$2 = null;
                    googleConfigInteractorImpl$getBillingConfig$1.I$0 = 0;
                    googleConfigInteractorImpl$getBillingConfig$1.I$1 = 0;
                    googleConfigInteractorImpl$getBillingConfig$1.label = 1;
                    obj = ocd0Var.e(googleConfigInteractorImpl$getBillingConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                if (!(obj instanceof Result.Failure)) {
                    obj = new GoogleBillingConfig(((mcd0) obj).a());
                }
                if (obj instanceof Result.Failure) {
                    return obj;
                }
                return null;
            }
        }
        googleConfigInteractorImpl$getBillingConfig$1 = new GoogleConfigInteractorImpl$getBillingConfig$1(aVar, continuationImpl);
        obj = googleConfigInteractorImpl$getBillingConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = googleConfigInteractorImpl$getBillingConfig$1.label;
        if (i != 0) {
        }
        if (!(obj instanceof Result.Failure)) {
        }
        if (obj instanceof Result.Failure) {
        }
    }

    public final Object b(ContinuationImpl continuationImpl) {
        return tje.k0(this.b, new GoogleConfigInteractorImpl$getGoogleBillingConfig$2(this, null), continuationImpl);
    }
}
