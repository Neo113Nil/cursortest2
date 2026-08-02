package com.yandex.go.order.bundle.map.impl.data.repository;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.order.bundle.map.impl.data.repository.FilterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1", f = "FilterOverlayOrderRepositoryImpl.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class FilterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ String $bundleId$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1(String str, Continuation continuation) {
        super(3, continuation);
        this.$bundleId$inlined = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FilterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1 filterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1 = new FilterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1(this.$bundleId$inlined, (Continuation) obj3);
        filterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        filterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return filterOverlayOrderRepositoryImpl$getBundleOrdersIdsFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj3 = (Set) ((Map) obj2).get(this.$bundleId$inlined);
            if (obj3 == null) {
                jst.e.q("Failed to generate order ids for filtering from bundled order widget");
            }
            if (obj3 == null) {
                obj3 = EmptySet.a;
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            kotlinx.coroutines.flow.e.w(vprVar);
            Object emit = vprVar.emit(obj3, this);
            if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                emit = zy11Var;
            }
            if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                emit = zy11Var;
            }
            if (emit == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
