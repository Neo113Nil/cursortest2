package com.yandex.go.walking.navigation.impl.navigation_core.guidance;

import com.yandex.mapkit.navigation.transport.Navigation;
import defpackage.m141;
import defpackage.mvg;
import defpackage.n541;
import defpackage.ncg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.walking.navigation.impl.navigation_core.guidance.WalkNavGuidanceSessionInteractor$startNewSession$1", f = "WalkNavGuidanceSessionInteractor.kt", l = {53}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class WalkNavGuidanceSessionInteractor$startNewSession$1 extends SuspendLambda implements wls {
    final /* synthetic */ m141 $component;
    final /* synthetic */ Navigation $navigation;
    final /* synthetic */ n541 $routeAddresses;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalkNavGuidanceSessionInteractor$startNewSession$1(m141 m141Var, Navigation navigation, n541 n541Var, Continuation continuation) {
        super(2, continuation);
        this.$component = m141Var;
        this.$navigation = navigation;
        this.$routeAddresses = n541Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WalkNavGuidanceSessionInteractor$startNewSession$1(this.$component, this.$navigation, this.$routeAddresses, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WalkNavGuidanceSessionInteractor$startNewSession$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = (c) ((ncg) this.$component).b.get();
            Navigation navigation = this.$navigation;
            n541 n541Var = this.$routeAddresses;
            this.label = 1;
            if (cVar.a(navigation, n541Var, this) == coroutineSingletons) {
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
