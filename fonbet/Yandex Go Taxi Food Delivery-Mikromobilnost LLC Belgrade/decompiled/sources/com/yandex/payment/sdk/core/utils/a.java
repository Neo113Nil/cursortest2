package com.yandex.payment.sdk.core.utils;

import defpackage.i3y;
import defpackage.ny61;
import defpackage.ogb;
import defpackage.q251;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a();
    public static final i3y b = kotlin.a.a(new q251(11));
    public static final i3y c = kotlin.a.a(new q251(12));

    public static void c() {
        if (b.getValue() == null) {
            return;
        }
        ny61.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        YBUtils$checkPayment$1 yBUtils$checkPayment$1;
        int i;
        if (continuationImpl instanceof YBUtils$checkPayment$1) {
            yBUtils$checkPayment$1 = (YBUtils$checkPayment$1) continuationImpl;
            int i2 = yBUtils$checkPayment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBUtils$checkPayment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBUtils$checkPayment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBUtils$checkPayment$1.label;
                if (i != 0) {
                    b.b(obj);
                    c();
                    return new ogb();
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        yBUtils$checkPayment$1 = new YBUtils$checkPayment$1(this, continuationImpl);
        Object obj2 = yBUtils$checkPayment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBUtils$checkPayment$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Result b(ContinuationImpl continuationImpl) {
        YBUtils$getBalance$1 yBUtils$getBalance$1;
        int i;
        if (continuationImpl instanceof YBUtils$getBalance$1) {
            yBUtils$getBalance$1 = (YBUtils$getBalance$1) continuationImpl;
            int i2 = yBUtils$getBalance$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yBUtils$getBalance$1.label = i2 - Integer.MIN_VALUE;
                Object obj = yBUtils$getBalance$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yBUtils$getBalance$1.label;
                if (i != 0) {
                    b.b(obj);
                    c();
                    return null;
                }
                if (i == 1) {
                    b.b(obj);
                    return new Result(((Result) obj).getValue());
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }
        yBUtils$getBalance$1 = new YBUtils$getBalance$1(this, continuationImpl);
        Object obj2 = yBUtils$getBalance$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yBUtils$getBalance$1.label;
        if (i != 0) {
        }
    }
}
