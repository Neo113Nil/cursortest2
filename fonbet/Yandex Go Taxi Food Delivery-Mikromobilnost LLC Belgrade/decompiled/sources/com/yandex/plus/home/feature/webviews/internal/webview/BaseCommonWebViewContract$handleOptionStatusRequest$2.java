package com.yandex.plus.home.feature.webviews.internal.webview;

import defpackage.lmv;
import defpackage.mu80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.home.feature.webviews.internal.webview.BaseCommonWebViewContract$handleOptionStatusRequest$2", f = "BaseCommonWebViewContract.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BaseCommonWebViewContract$handleOptionStatusRequest$2 extends SuspendLambda implements wls {
    final /* synthetic */ mu80 $outMessage;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCommonWebViewContract$handleOptionStatusRequest$2(a aVar, mu80 mu80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$outMessage = mu80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseCommonWebViewContract$handleOptionStatusRequest$2(this.this$0, this.$outMessage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        BaseCommonWebViewContract$handleOptionStatusRequest$2 baseCommonWebViewContract$handleOptionStatusRequest$2 = (BaseCommonWebViewContract$handleOptionStatusRequest$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        baseCommonWebViewContract$handleOptionStatusRequest$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        boolean j = this.this$0.i.j(this.$outMessage.b);
        a aVar = this.this$0;
        mu80 mu80Var = this.$outMessage;
        String str = mu80Var.a;
        String str2 = mu80Var.b;
        Boolean valueOf = Boolean.valueOf(j && aVar.i.d(str2));
        if (!j || this.this$0.i.h(this.$outMessage.b)) {
            bool = valueOf;
            z = false;
        } else {
            z = true;
            bool = valueOf;
        }
        aVar.z(new lmv(str, str2, bool, z, j));
        return zy11.a;
    }
}
