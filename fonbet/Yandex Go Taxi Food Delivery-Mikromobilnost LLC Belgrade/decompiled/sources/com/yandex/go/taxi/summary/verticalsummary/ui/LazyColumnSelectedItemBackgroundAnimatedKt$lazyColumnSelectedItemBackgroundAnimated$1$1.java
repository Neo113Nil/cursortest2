package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.gr5;
import defpackage.jj2;
import defpackage.m3u0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rol0;
import defpackage.tse;
import defpackage.tx40;
import defpackage.wls;
import defpackage.ye;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.ui.LazyColumnSelectedItemBackgroundAnimatedKt$lazyColumnSelectedItemBackgroundAnimated$1$1", f = "lazyColumnSelectedItemBackgroundAnimated.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class LazyColumnSelectedItemBackgroundAnimatedKt$lazyColumnSelectedItemBackgroundAnimated$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ jj2 $animationSpec;
    final /* synthetic */ oz40 $selectedIndexState;
    final /* synthetic */ m3u0 $selectedTariffIndexState;
    final /* synthetic */ tx40 $selectionAnimatable;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyColumnSelectedItemBackgroundAnimatedKt$lazyColumnSelectedItemBackgroundAnimated$1$1(m3u0 m3u0Var, oz40 oz40Var, jj2 jj2Var, tx40 tx40Var, Continuation continuation) {
        super(2, continuation);
        this.$selectedTariffIndexState = m3u0Var;
        this.$selectedIndexState = oz40Var;
        this.$animationSpec = jj2Var;
        this.$selectionAnimatable = tx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyColumnSelectedItemBackgroundAnimatedKt$lazyColumnSelectedItemBackgroundAnimated$1$1(this.$selectedTariffIndexState, this.$selectedIndexState, this.$animationSpec, this.$selectionAnimatable, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyColumnSelectedItemBackgroundAnimatedKt$lazyColumnSelectedItemBackgroundAnimated$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            rol0 o = androidx.compose.runtime.f.o(new gr5(this.$selectedTariffIndexState, 4));
            ye yeVar = new ye(11, this.$selectedIndexState, this.$animationSpec, this.$selectionAnimatable);
            this.label = 1;
            if (o.collect(yeVar, this) == coroutineSingletons) {
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
