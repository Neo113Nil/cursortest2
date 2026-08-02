package com.yandex.go.business.impl.web;

import defpackage.aj31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tn51;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.progress.SimpleSpinnerModalView;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V", "com/yandex/go/business/impl/web/YangoBusinessJsNativeApi$handleAction$1"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.business.impl.web.YangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1", f = "YangoBusinessJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class YangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ tn51 receiver$inlined;
    final /* synthetic */ YangoBusinessJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1(YangoBusinessJsNativeApi yangoBusinessJsNativeApi, String str, Continuation continuation, tn51 tn51Var) {
        super(2, continuation);
        this.this$0 = yangoBusinessJsNativeApi;
        this.$promiseId = str;
        this.receiver$inlined = tn51Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1(this.this$0, this.$promiseId, continuation, this.receiver$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        YangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1 yangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1 = (YangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        yangoBusinessJsNativeApi$handleWebViewLoadError$$inlined$handleAction$1.invokeSuspend(zy11Var);
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
        SimpleSpinnerModalView simpleSpinnerModalView = ((com.yandex.go.business.impl.router.b) ((aj31) this.receiver$inlined).b).I;
        if (simpleSpinnerModalView != null) {
            simpleSpinnerModalView.dismiss();
        }
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
