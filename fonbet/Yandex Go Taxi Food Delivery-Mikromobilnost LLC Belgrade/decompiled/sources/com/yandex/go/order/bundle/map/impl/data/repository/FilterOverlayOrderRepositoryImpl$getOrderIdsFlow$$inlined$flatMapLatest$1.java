package com.yandex.go.order.bundle.map.impl.data.repository;

import defpackage.bvf0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.w4r;
import defpackage.w511;
import defpackage.x4r;
import defpackage.y4r;
import defpackage.yaf0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.bundle.map.impl.data.repository.FilterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1", f = "FilterOverlayOrderRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class FilterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1(Continuation continuation, g gVar) {
        super(3, continuation);
        this.this$0 = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FilterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1 filterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1 = new FilterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        filterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        filterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return filterOverlayOrderRepositoryImpl$getOrderIdsFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr X;
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            y4r y4rVar = (y4r) obj2;
            if (y4rVar instanceof x4r) {
                g gVar = this.this$0;
                yaf0 yaf0Var = ((x4r) y4rVar).a;
                if (yaf0Var == null) {
                    gVar.getClass();
                    jst.e.q("Missing screen configuration");
                    X = bvf0.c(EmptySet.a);
                } else {
                    X = new d(new ru.yandex.taxi.widgets.data.repository.widget_models.b(gVar.a.d.c, yaf0Var));
                }
            } else {
                if (!(y4rVar instanceof w4r)) {
                    w511.b();
                    return null;
                }
                X = kotlinx.coroutines.flow.e.X(this.this$0.c, new FilterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1(((w4r) y4rVar).a, null));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(X, vprVar, this) == coroutineSingletons) {
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
