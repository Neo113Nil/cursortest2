package com.yandex.go.platform.navigation.impl;

import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.navigation.impl.NavigationPresenter$observeFeaturesForViewState$2", f = "NavigationPresenter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class NavigationPresenter$observeFeaturesForViewState$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<com.yandex.go.platform.navigation.model.a> $features;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationPresenter$observeFeaturesForViewState$2(List list, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$features = list;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavigationPresenter$observeFeaturesForViewState$2 navigationPresenter$observeFeaturesForViewState$2 = new NavigationPresenter$observeFeaturesForViewState$2(this.$features, this.this$0, continuation);
        navigationPresenter$observeFeaturesForViewState$2.L$0 = obj;
        return navigationPresenter$observeFeaturesForViewState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NavigationPresenter$observeFeaturesForViewState$2 navigationPresenter$observeFeaturesForViewState$2 = (NavigationPresenter$observeFeaturesForViewState$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        navigationPresenter$observeFeaturesForViewState$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        List<com.yandex.go.platform.navigation.model.a> list = this.$features;
        c cVar = this.this$0;
        for (com.yandex.go.platform.navigation.model.a aVar : list) {
            e.H(tseVar, new jqr((tpr) aVar.c.invoke(cVar.a), new NavigationPresenter$observeFeaturesForViewState$2$1$1(cVar, aVar, null), 3));
        }
        return zy11.a;
    }
}
