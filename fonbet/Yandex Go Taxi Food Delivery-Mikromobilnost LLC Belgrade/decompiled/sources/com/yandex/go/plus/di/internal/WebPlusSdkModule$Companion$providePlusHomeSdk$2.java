package com.yandex.go.plus.di.internal;

import defpackage.i3y;
import defpackage.mgd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oo2;
import defpackage.qgd0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/yandex/plus/pay/ui/core/internal/a;", "<anonymous>", "()Lcom/yandex/plus/pay/ui/core/internal/a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.plus.di.internal.WebPlusSdkModule$Companion$providePlusHomeSdk$2", f = "WebPlusSdkModule.kt", l = {152}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class WebPlusSdkModule$Companion$providePlusHomeSdk$2 extends SuspendLambda implements tls {
    final /* synthetic */ qgd0 $plusPayUiProvider;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebPlusSdkModule$Companion$providePlusHomeSdk$2(qgd0 qgd0Var, Continuation continuation) {
        super(1, continuation);
        this.$plusPayUiProvider = qgd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new WebPlusSdkModule$Companion$providePlusHomeSdk$2(this.$plusPayUiProvider, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((WebPlusSdkModule$Companion$providePlusHomeSdk$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qgd0 qgd0Var = this.$plusPayUiProvider;
        this.label = 1;
        com.yandex.plus.pay.ui.core.internal.a aVar = (com.yandex.plus.pay.ui.core.internal.a) ((i3y) ((oo2) ((mgd0) qgd0Var).a.a).x).getValue();
        return aVar == coroutineSingletons ? coroutineSingletons : aVar;
    }
}
