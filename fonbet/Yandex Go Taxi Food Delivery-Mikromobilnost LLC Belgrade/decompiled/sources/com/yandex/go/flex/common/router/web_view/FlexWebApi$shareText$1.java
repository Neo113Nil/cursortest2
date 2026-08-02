package com.yandex.go.flex.common.router.web_view;

import defpackage.gym;
import defpackage.j73;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkJsNativeApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.common.router.web_view.FlexWebApi$shareText$1", f = "FlexWebApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class FlexWebApi$shareText$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ FlexWebApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexWebApi$shareText$1(FlexWebApi flexWebApi, String str, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = flexWebApi;
        this.$promiseId = str;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FlexWebApi$shareText$1(this.this$0, this.$promiseId, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FlexWebApi$shareText$1 flexWebApi$shareText$1 = (FlexWebApi$shareText$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        flexWebApi$shareText$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object deserialize;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        FlexWebApi flexWebApi = this.this$0;
        String[] strArr = this.$params;
        try {
            deserialize = flexWebApi.deserialize((String) j73.C(strArr), WebViewFromDeeplinkJsNativeApi.a.Companion.serializer());
            ((gym) flexWebApi.getRouterCallbacks()).q(((WebViewFromDeeplinkJsNativeApi.a) deserialize).a);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            jst.e.c("FlexWebApi.shareText cant find param = " + j73.D(strArr));
        }
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
