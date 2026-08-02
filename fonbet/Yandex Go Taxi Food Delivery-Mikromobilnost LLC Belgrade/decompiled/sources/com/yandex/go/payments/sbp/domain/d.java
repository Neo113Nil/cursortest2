package com.yandex.go.payments.sbp.domain;

import com.yandex.go.payments.sbp.data.g;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class d {
    public final g a;

    public d(g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        SbpTokenBindingInteractor$bindSbpToken$1 sbpTokenBindingInteractor$bindSbpToken$1;
        int i;
        if (continuationImpl instanceof SbpTokenBindingInteractor$bindSbpToken$1) {
            sbpTokenBindingInteractor$bindSbpToken$1 = (SbpTokenBindingInteractor$bindSbpToken$1) continuationImpl;
            int i2 = sbpTokenBindingInteractor$bindSbpToken$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sbpTokenBindingInteractor$bindSbpToken$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sbpTokenBindingInteractor$bindSbpToken$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sbpTokenBindingInteractor$bindSbpToken$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    sbpTokenBindingInteractor$bindSbpToken$1.L$0 = null;
                    sbpTokenBindingInteractor$bindSbpToken$1.L$1 = null;
                    sbpTokenBindingInteractor$bindSbpToken$1.label = 1;
                    Object a = this.a.a(str, str2, sbpTokenBindingInteractor$bindSbpToken$1);
                    return a == coroutineSingletons ? coroutineSingletons : a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        sbpTokenBindingInteractor$bindSbpToken$1 = new SbpTokenBindingInteractor$bindSbpToken$1(this, continuationImpl);
        Object obj2 = sbpTokenBindingInteractor$bindSbpToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sbpTokenBindingInteractor$bindSbpToken$1.label;
        if (i != 0) {
        }
    }
}
