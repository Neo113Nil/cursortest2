package com.yandex.go.places.impl.ui.main.map.filters;

import defpackage.bgc;
import defpackage.cg80;
import defpackage.evu0;
import defpackage.hn80;
import defpackage.ibc0;
import defpackage.jbc0;
import defpackage.kn80;
import defpackage.lg80;
import defpackage.mvg;
import defpackage.nuj;
import defpackage.ny61;
import defpackage.s7c0;
import defpackage.sn80;
import defpackage.svj;
import defpackage.tse;
import defpackage.u370;
import defpackage.u3m;
import defpackage.u9c0;
import defpackage.vvb1;
import defpackage.wls;
import defpackage.yl80;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.PlacesCategoryFiltersPresenter$onFilterClicked$1", f = "PlacesCategoryFiltersPresenter.kt", l = {176}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesCategoryFiltersPresenter$onFilterClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ ibc0 $selectedFilter;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesCategoryFiltersPresenter$onFilterClicked$1(f fVar, ibc0 ibc0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$selectedFilter = ibc0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesCategoryFiltersPresenter$onFilterClicked$1(this.this$0, this.$selectedFilter, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesCategoryFiltersPresenter$onFilterClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            kn80 kn80Var = this.this$0.Q;
            this.label = 1;
            obj = kn80Var.a.b(u9c0.b, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        u3m u3mVar = (u3m) obj;
        f fVar = this.this$0;
        cg80 cg80Var = cg80.b;
        nuj nujVar = nuj.b;
        if (u3mVar != null) {
            ibc0 ibc0Var = this.$selectedFilter;
            com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar = fVar.C;
            String str = u3mVar.b;
            String str2 = u3mVar.d;
            s7c0 s7c0Var = new s7c0(str, evu0.J(str2) ? null : str2, 2);
            jbc0 jbc0Var = ibc0Var.f;
            bVar.f(new sn80(s7c0Var, jbc0Var.c, jbc0Var.b, null, new hn80(ibc0Var.d), nujVar, cg80Var, false), true, new bgc(12));
        } else {
            com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2 = fVar.C;
            ibc0 ibc0Var2 = this.$selectedFilter;
            jbc0 jbc0Var2 = ibc0Var2.f;
            bVar2.d(new yl80(jbc0Var2.c, (String) null, (CharSequence) ibc0Var2.d, (svj) nujVar, (lg80) cg80Var, (u370) vvb1.H, jbc0Var2.b, false), true, new bgc(12));
        }
        return zy11.a;
    }
}
