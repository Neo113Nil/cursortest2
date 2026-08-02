package com.ybsdk.feature.qr.internal.screens.container;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.internal.screens.container.QrContainerViewModel$observeWalletEvents$1", f = "QrContainerViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrContainerViewModel$observeWalletEvents$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrContainerViewModel$observeWalletEvents$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrContainerViewModel$observeWalletEvents$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        QrContainerViewModel$observeWalletEvents$1 qrContainerViewModel$observeWalletEvents$1 = (QrContainerViewModel$observeWalletEvents$1) create((zy11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        qrContainerViewModel$observeWalletEvents$1.invokeSuspend(zy11Var);
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
        this.this$0.b0();
        return zy11.a;
    }
}
