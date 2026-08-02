package com.yandex.go.business.impl.web;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1", f = "YangoBusinessJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ YangoBusinessJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1(YangoBusinessJsNativeApi yangoBusinessJsNativeApi, String str, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yangoBusinessJsNativeApi;
        this.$promiseId = str;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1(this.this$0, this.$promiseId, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1 yangoBusinessJsNativeApi$handleSendAnalyticsEvent$1 = (YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        yangoBusinessJsNativeApi$handleSendAnalyticsEvent$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        YangoBusinessJsNativeApi yangoBusinessJsNativeApi = this.this$0;
        String str = this.$promiseId;
        String[] strArr = this.$params;
        tse c = yangoBusinessJsNativeApi.getScopeDelegate().c();
        yangoBusinessJsNativeApi.appDispatchers.getClass();
        sjh sjhVar = uyj.a;
        com.yandex.go.coroutines.b.g(c, mdh.b, null, new YangoBusinessJsNativeApi$handleSendAnalyticsEvent$1$invokeSuspend$$inlined$handleActionWithResult$1(yangoBusinessJsNativeApi, str, null, yangoBusinessJsNativeApi, strArr), 2);
        return zy11.a;
    }
}
