package com.ybsdk.feature.change.payment.method.internal.repositories;

import com.ybsdk.core.utils.d;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.feature.change.payment.method.api.ChangePaymentMethodParameter;
import com.ybsdk.feature.change.payment.method.internal.network.ChangePaymentMethodsApi;
import defpackage.d6v;
import defpackage.ny61;
import java.util.Map;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class a {
    public final ChangePaymentMethodsApi a;

    public a(ChangePaymentMethodsApi changePaymentMethodsApi) {
        this.a = changePaymentMethodsApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Map map, d6v d6vVar, ContinuationImpl continuationImpl) {
        ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1;
        int i;
        if (continuationImpl instanceof ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1) {
            changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1 = (ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1) continuationImpl;
            int i2 = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2(this, str, map, null);
                changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1.label = 1;
                Object a = d.a(d6vVar, changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$2, changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1(this, continuationImpl);
        Object obj2 = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetInit$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Map map, int i, d6v d6vVar, ContinuationImpl continuationImpl) {
        ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1;
        int i2;
        if (continuationImpl instanceof ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1) {
            changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1 = (ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1) continuationImpl;
            int i3 = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1.label = i3 - Integer.MIN_VALUE;
                Object obj = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1.label;
                if (i2 == 0) {
                    if (i2 == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2 changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2(this, i, str, map, null);
                changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1.label = 1;
                Object a = d.a(d6vVar, changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$2, changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1 = new ChangePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1(this, continuationImpl);
        Object obj2 = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = changePaymentMethodRepository$defaultPaymentMethodUnifiedSetStatus$1.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ChangePaymentMethodParameter changePaymentMethodParameter, boolean z, String str, String str2, ContinuationImpl continuationImpl) {
        ChangePaymentMethodRepository$getChangePaymentMethod$1 changePaymentMethodRepository$getChangePaymentMethod$1;
        int i;
        if (continuationImpl instanceof ChangePaymentMethodRepository$getChangePaymentMethod$1) {
            changePaymentMethodRepository$getChangePaymentMethod$1 = (ChangePaymentMethodRepository$getChangePaymentMethod$1) continuationImpl;
            int i2 = changePaymentMethodRepository$getChangePaymentMethod$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changePaymentMethodRepository$getChangePaymentMethod$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changePaymentMethodRepository$getChangePaymentMethod$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changePaymentMethodRepository$getChangePaymentMethod$1.label;
                if (i == 0) {
                    if (i == 1) {
                        b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                ChangePaymentMethodRepository$getChangePaymentMethod$2 changePaymentMethodRepository$getChangePaymentMethod$2 = new ChangePaymentMethodRepository$getChangePaymentMethod$2(this, changePaymentMethodParameter, z, str2, str, null);
                changePaymentMethodRepository$getChangePaymentMethod$1.label = 1;
                Object c = c.c(changePaymentMethodRepository$getChangePaymentMethod$2, changePaymentMethodRepository$getChangePaymentMethod$1);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        changePaymentMethodRepository$getChangePaymentMethod$1 = new ChangePaymentMethodRepository$getChangePaymentMethod$1(this, continuationImpl);
        Object obj2 = changePaymentMethodRepository$getChangePaymentMethod$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changePaymentMethodRepository$getChangePaymentMethod$1.label;
        if (i == 0) {
        }
    }
}
