package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tkr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.navigation.FlexRouteHandlerImpl$hideOverlay$1$1", f = "FlexRouteHandlerImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class FlexRouteHandlerImpl$hideOverlay$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ tkr $overlay;
    final /* synthetic */ boolean $withAnimation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexRouteHandlerImpl$hideOverlay$1$1(tkr tkrVar, boolean z, Continuation<? super FlexRouteHandlerImpl$hideOverlay$1$1> continuation) {
        super(2, continuation);
        this.$overlay = tkrVar;
        this.$withAnimation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new FlexRouteHandlerImpl$hideOverlay$1$1(this.$overlay, this.$withAnimation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((FlexRouteHandlerImpl$hideOverlay$1$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        tkr tkrVar = this.$overlay;
        if (tkrVar != null) {
            tkrVar.hideOverlay(this.$withAnimation);
        }
        return zy11.a;
    }
}
