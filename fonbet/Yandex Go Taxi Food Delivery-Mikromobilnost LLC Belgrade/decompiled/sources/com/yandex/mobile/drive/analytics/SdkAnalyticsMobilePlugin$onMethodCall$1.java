package com.yandex.mobile.drive.analytics;

import defpackage.bfm;
import defpackage.d42;
import defpackage.da20;
import defpackage.ifm;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xjg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mobile.drive.analytics.SdkAnalyticsMobilePlugin$onMethodCall$1", f = "SdkAnalyticsMobilePlugin.kt", l = {43}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SdkAnalyticsMobilePlugin$onMethodCall$1 extends SuspendLambda implements wls {
    final /* synthetic */ ifm $analytics;
    final /* synthetic */ da20 $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdkAnalyticsMobilePlugin$onMethodCall$1(ifm ifmVar, da20 da20Var, Continuation continuation) {
        super(2, continuation);
        this.$analytics = ifmVar;
        this.$result = da20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdkAnalyticsMobilePlugin$onMethodCall$1(this.$analytics, this.$result, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdkAnalyticsMobilePlugin$onMethodCall$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ifm ifmVar = this.$analytics;
            this.label = 1;
            obj = (d42) ((bfm) ((xjg) ifmVar).b).b.get();
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
        d42 d42Var = (d42) obj;
        da20 da20Var = this.$result;
        if (d42Var == null) {
            da20Var.success(null);
        } else {
            da20Var.success(kotlin.collections.b.i(new Pair("deviceId", d42Var.b), new Pair("uuid", d42Var.a)));
        }
        return zy11.a;
    }
}
