package com.yandex.go.platform.navigation.impl;

import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wg41;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.navigation.impl.NavigationPresenter$onLaunched$1", f = "NavigationPresenter.kt", l = {42, 44}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class NavigationPresenter$onLaunched$1 extends SuspendLambda implements wls {
    final /* synthetic */ List<com.yandex.go.platform.navigation.model.a> $nativeFeatures;
    final /* synthetic */ d $navigator;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationPresenter$onLaunched$1(c cVar, List list, d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$nativeFeatures = list;
        this.$navigator = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavigationPresenter$onLaunched$1 navigationPresenter$onLaunched$1 = new NavigationPresenter$onLaunched$1(this.this$0, this.$nativeFeatures, this.$navigator, continuation);
        navigationPresenter$onLaunched$1.L$0 = obj;
        return navigationPresenter$onLaunched$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationPresenter$onLaunched$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        if (com.yandex.go.platform.navigation.impl.c.a(r14, r6, r13) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            tseVar = (tse) this.L$0;
            c cVar = this.this$0;
            List<com.yandex.go.platform.navigation.model.a> list = this.$nativeFeatures;
            this.L$0 = tseVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
        }
        e.H(tseVar, new jqr(this.this$0.c.a, new NavigationPresenter$observeBarVisibility$1(2, this.$navigator, d.class, "setBarVisibility", "setBarVisibility(Z)Lkotlinx/coroutines/Job;", 12), 3));
        this.this$0.getClass();
        wg41 wg41Var = new wg41();
        b bVar = new b(this.$nativeFeatures, this.this$0, this.$navigator);
        this.L$0 = null;
        this.label = 2;
        Object emit = bVar.emit(wg41Var, this);
        if (emit != coroutineSingletons) {
            emit = zy11Var;
        }
        return emit == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
