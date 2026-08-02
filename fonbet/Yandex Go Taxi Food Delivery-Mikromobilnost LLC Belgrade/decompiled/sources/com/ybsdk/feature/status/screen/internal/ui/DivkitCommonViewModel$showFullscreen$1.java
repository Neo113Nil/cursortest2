package com.ybsdk.feature.status.screen.internal.ui;

import defpackage.jfp0;
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
@mvg(c = "com.ybsdk.feature.status.screen.internal.ui.DivkitCommonViewModel$showFullscreen$1", f = "DivkitCommonViewModel.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DivkitCommonViewModel$showFullscreen$1 extends SuspendLambda implements wls {
    final /* synthetic */ qis $fullScreen;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivkitCommonViewModel$showFullscreen$1(a aVar, qis qisVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$fullScreen = qisVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivkitCommonViewModel$showFullscreen$1(this.this$0, this.$fullScreen, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivkitCommonViewModel$showFullscreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.banners.impl.domain.interactors.a aVar2 = aVar.H;
            qis qisVar = this.$fullScreen;
            jfp0 jfp0Var = new jfp0(aVar.B.getPath());
            this.label = 1;
            if (aVar2.b(aVar, qisVar, jfp0Var, this) == coroutineSingletons) {
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
