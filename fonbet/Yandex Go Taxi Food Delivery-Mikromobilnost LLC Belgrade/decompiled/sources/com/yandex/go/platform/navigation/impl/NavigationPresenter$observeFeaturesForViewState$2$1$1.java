package com.yandex.go.platform.navigation.impl;

import defpackage.g050;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t850;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "badgeText", "Lzy11;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.yandex.go.platform.navigation.impl.NavigationPresenter$observeFeaturesForViewState$2$1$1", f = "NavigationPresenter.kt", l = {104, 108}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class NavigationPresenter$observeFeaturesForViewState$2$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.go.platform.navigation.model.a $feature;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationPresenter$observeFeaturesForViewState$2$1$1(c cVar, com.yandex.go.platform.navigation.model.a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$feature = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NavigationPresenter$observeFeaturesForViewState$2$1$1 navigationPresenter$observeFeaturesForViewState$2$1$1 = new NavigationPresenter$observeFeaturesForViewState$2$1$1(this.this$0, this.$feature, continuation);
        navigationPresenter$observeFeaturesForViewState$2$1$1.L$0 = obj;
        return navigationPresenter$observeFeaturesForViewState$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NavigationPresenter$observeFeaturesForViewState$2$1$1) create((String) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(7:(1:(1:(6:5|6|7|8|9|10)(2:16|17))(1:18))(3:41|(1:43)|31)|24|25|26|(4:28|29|(2:32|8)|31)|9|10)|19|20|21|22|23|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        r10 = th;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        c cVar;
        g050 g050Var;
        com.yandex.go.platform.navigation.model.a aVar;
        g050 g050Var2;
        t850 t850Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                str = (String) this.L$0;
                cVar = this.this$0;
                com.yandex.go.platform.navigation.model.a aVar2 = this.$feature;
                g050Var = cVar.h;
                this.L$0 = str;
                this.L$1 = cVar;
                this.L$2 = aVar2;
                this.L$3 = g050Var;
                this.label = 1;
                if (g050Var.a(this) != coroutineSingletons) {
                    aVar = aVar2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g050Var2 = (g050) this.L$0;
                try {
                    kotlin.b.b(obj);
                    g050Var = g050Var2;
                    g050Var.d(null);
                    return zy11.a;
                } catch (Throwable th) {
                    th = th;
                    g050Var2.d(null);
                    throw th;
                }
            }
            g050Var = (g050) this.L$3;
            aVar = (com.yandex.go.platform.navigation.model.a) this.L$2;
            cVar = (c) this.L$1;
            str = (String) this.L$0;
            kotlin.b.b(obj);
            t850 t850Var2 = new t850(t850Var.a, kotlin.collections.b.o(t850Var.b, new Pair(aVar, str)));
            cVar.f = t850Var2;
            wls wlsVar = cVar.d;
            if (wlsVar != null) {
                this.L$0 = g050Var;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (((NavigatorViewHolderImpl$1$onViewAttachedToWindow$1) wlsVar).invoke(t850Var2, this) != coroutineSingletons) {
                    g050Var2 = g050Var;
                    g050Var = g050Var2;
                }
                return coroutineSingletons;
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th2) {
            th = th2;
            th = th;
            g050Var2 = g050Var;
            g050Var2.d(null);
            throw th;
        }
        t850Var = cVar.f;
    }
}
