package com.yandex.go.multimodal_route.ui.rate_route;

import defpackage.agd;
import defpackage.iv40;
import defpackage.jv40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rv40;
import defpackage.tse;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.rate_route.MultimodalRoutesRateScreenRouter$content$1$1$1", f = "MultimodalRoutesRateScreenRouter.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRoutesRateScreenRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ rv40 $action;
    final /* synthetic */ jv40 $innerNavigator;
    final /* synthetic */ f $multimodalRoutesRateScreenUiActionInteractor;
    final /* synthetic */ yfd $this_buildContent;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRoutesRateScreenRouter$content$1$1$1(f fVar, yfd yfdVar, rv40 rv40Var, jv40 jv40Var, Continuation continuation) {
        super(2, continuation);
        this.$multimodalRoutesRateScreenUiActionInteractor = fVar;
        this.$this_buildContent = yfdVar;
        this.$action = rv40Var;
        this.$innerNavigator = jv40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalRoutesRateScreenRouter$content$1$1$1(this.$multimodalRoutesRateScreenUiActionInteractor, this.$this_buildContent, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MultimodalRoutesRateScreenRouter$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.$multimodalRoutesRateScreenUiActionInteractor;
            Object obj2 = ((agd) this.$this_buildContent).a;
            String str = ((iv40) obj2).a;
            String str2 = ((iv40) obj2).b;
            rv40 rv40Var = this.$action;
            jv40 jv40Var = this.$innerNavigator;
            this.label = 1;
            if (fVar.a(str, str2, rv40Var, jv40Var, this) == coroutineSingletons) {
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
