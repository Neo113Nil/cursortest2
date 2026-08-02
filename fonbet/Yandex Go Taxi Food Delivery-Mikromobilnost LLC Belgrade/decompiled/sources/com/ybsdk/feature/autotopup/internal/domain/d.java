package com.ybsdk.feature.autotopup.internal.domain;

import defpackage.d6v;
import defpackage.hz3;
import defpackage.i1a0;
import defpackage.l5a0;
import defpackage.n1a0;
import defpackage.ny61;
import defpackage.s2b1;
import defpackage.xjt0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes3.dex */
public final class d {
    public final com.ybsdk.feature.autotopup.internal.data.b a;

    public d(com.ybsdk.feature.autotopup.internal.data.b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d6v d6vVar, String str, String str2, String str3, hz3 hz3Var, String str4, l5a0 l5a0Var, ContinuationImpl continuationImpl) {
        AutoTopupSaveV2InteractorImpl$saveAutoTopupV2$1 autoTopupSaveV2InteractorImpl$saveAutoTopupV2$1;
        int i;
        String str5;
        if (continuationImpl instanceof AutoTopupSaveV2InteractorImpl$saveAutoTopupV2$1) {
            autoTopupSaveV2InteractorImpl$saveAutoTopupV2$1 = (AutoTopupSaveV2InteractorImpl$saveAutoTopupV2$1) continuationImpl;
            int i2 = autoTopupSaveV2InteractorImpl$saveAutoTopupV2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                autoTopupSaveV2InteractorImpl$saveAutoTopupV2$1.label = i2 - Integer.MIN_VALUE;
                AutoTopupSaveV2InteractorImpl$saveAutoTopupV2$1 autoTopupSaveV2InteractorImpl$saveAutoTopupV2$12 = autoTopupSaveV2InteractorImpl$saveAutoTopupV2$1;
                Object obj = autoTopupSaveV2InteractorImpl$saveAutoTopupV2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = autoTopupSaveV2InteractorImpl$saveAutoTopupV2$12.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                Object c = s2b1.c(l5a0Var, str2);
                Throwable a = Result.a(c);
                if (a != null) {
                    return new Result.Failure(a);
                }
                xjt0 xjt0Var = (xjt0) c;
                n1a0 n1a0Var = xjt0Var.a;
                i1a0 i1a0Var = xjt0Var.b;
                if (str4 == null) {
                    this.a.getClass();
                    str5 = "autotopup_default_id";
                } else {
                    str5 = str4;
                }
                String i3 = d6vVar.i(str5);
                autoTopupSaveV2InteractorImpl$saveAutoTopupV2$12.label = 1;
                Object n = this.a.n(i3, str, str3, n1a0Var, i1a0Var, hz3Var, str4, l5a0Var, autoTopupSaveV2InteractorImpl$saveAutoTopupV2$12);
                return n == coroutineSingletons ? coroutineSingletons : n;
            }
        }
        autoTopupSaveV2InteractorImpl$saveAutoTopupV2$1 = new AutoTopupSaveV2InteractorImpl$saveAutoTopupV2$1(this, continuationImpl);
        AutoTopupSaveV2InteractorImpl$saveAutoTopupV2$1 autoTopupSaveV2InteractorImpl$saveAutoTopupV2$122 = autoTopupSaveV2InteractorImpl$saveAutoTopupV2$1;
        Object obj2 = autoTopupSaveV2InteractorImpl$saveAutoTopupV2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = autoTopupSaveV2InteractorImpl$saveAutoTopupV2$122.label;
        if (i == 0) {
        }
    }
}
