package com.yandex.go.preorder.lifecycle;

import com.yandex.go.address.models.Address;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wit0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lzy11;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.lifecycle.PreorderParamsChangeLifecycleListener$invokeSuggestFlow$1", f = "PreorderParamsChangeLifecycleListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PreorderParamsChangeLifecycleListener$invokeSuggestFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreorderParamsChangeLifecycleListener$invokeSuggestFlow$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PreorderParamsChangeLifecycleListener$invokeSuggestFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PreorderParamsChangeLifecycleListener$invokeSuggestFlow$1 preorderParamsChangeLifecycleListener$invokeSuggestFlow$1 = (PreorderParamsChangeLifecycleListener$invokeSuggestFlow$1) create((zy11) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        preorderParamsChangeLifecycleListener$invokeSuggestFlow$1.invokeSuspend(zy11Var);
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
        if (((com.yandex.go.taxi.tariffs.internal.repository.k) this.this$0.a).n() != null) {
            Address g = this.this$0.b.g();
            zzs B = g != null ? g.B() : null;
            if (B != null) {
                wit0 wit0Var = (wit0) this.this$0.e.a(true);
                wit0Var.a(false);
                wit0Var.b(B);
                ((ru.yandex.taxi.search.suggest.i) wit0Var.b).p(B, RoutePointType.POINT_A, "auto");
            }
        }
        return zy11.a;
    }
}
