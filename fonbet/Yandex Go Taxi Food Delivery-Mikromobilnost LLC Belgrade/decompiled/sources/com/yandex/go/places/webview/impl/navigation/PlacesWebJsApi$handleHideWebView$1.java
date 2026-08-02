package com.yandex.go.places.webview.impl.navigation;

import defpackage.a0;
import defpackage.j24;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tgc0;
import defpackage.tse;
import defpackage.wls;
import defpackage.ymu;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.webview.impl.navigation.PlacesWebJsApi$handleHideWebView$1", f = "PlacesWebJsApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PlacesWebJsApi$handleHideWebView$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ PlacesWebJsApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesWebJsApi$handleHideWebView$1(PlacesWebJsApi placesWebJsApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = placesWebJsApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesWebJsApi$handleHideWebView$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlacesWebJsApi$handleHideWebView$1 placesWebJsApi$handleHideWebView$1 = (PlacesWebJsApi$handleHideWebView$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        placesWebJsApi$handleHideWebView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tgc0 tgc0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        tgc0Var = this.this$0.callbacks;
        com.yandex.go.places.webview.impl.navigation.common.b bVar = (com.yandex.go.places.webview.impl.navigation.common.b) ((ymu) tgc0Var).c;
        bVar.r(new a0(10, new j24(9, bVar)));
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
