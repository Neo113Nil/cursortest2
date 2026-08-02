package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import defpackage.ifp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qis;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.setup.v2.AutoTopupSetupV2ViewModel$showFullScreen$1", f = "AutoTopupSetupV2ViewModel.kt", l = {149}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupSetupV2ViewModel$showFullScreen$1 extends SuspendLambda implements wls {
    final /* synthetic */ qis $fullScreen;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupSetupV2ViewModel$showFullScreen$1(b bVar, qis qisVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$fullScreen = qisVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupSetupV2ViewModel$showFullScreen$1(this.this$0, this.$fullScreen, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupSetupV2ViewModel$showFullScreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            com.ybsdk.feature.banners.impl.domain.interactors.a aVar = bVar.G;
            qis qisVar = this.$fullScreen;
            this.label = 1;
            if (aVar.b(bVar, qisVar, ifp0.b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
