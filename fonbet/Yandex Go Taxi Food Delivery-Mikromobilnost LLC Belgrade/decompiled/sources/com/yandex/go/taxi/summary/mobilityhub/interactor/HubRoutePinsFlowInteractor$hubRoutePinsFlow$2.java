package com.yandex.go.taxi.summary.mobilityhub.interactor;

import com.yandex.go.address.models.Address;
import defpackage.d0l0;
import defpackage.khq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8b1;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Pair;", "Lkhq0;", "Ld0l0;", "<destruct>", "", "Lom30;", "<anonymous>", "(Lkotlin/Pair;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.HubRoutePinsFlowInteractor$hubRoutePinsFlow$2", f = "HubRoutePinsFlowInteractor.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class HubRoutePinsFlowInteractor$hubRoutePinsFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HubRoutePinsFlowInteractor$hubRoutePinsFlow$2(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HubRoutePinsFlowInteractor$hubRoutePinsFlow$2 hubRoutePinsFlowInteractor$hubRoutePinsFlow$2 = new HubRoutePinsFlowInteractor$hubRoutePinsFlow$2(this.this$0, continuation);
        hubRoutePinsFlowInteractor$hubRoutePinsFlow$2.L$0 = obj;
        return hubRoutePinsFlowInteractor$hubRoutePinsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HubRoutePinsFlowInteractor$hubRoutePinsFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            khq0 khq0Var = (khq0) pair.getFirst();
            d0l0 d0l0Var = (d0l0) pair.getSecond();
            List b = khq0Var != null ? s8b1.b(khq0Var) : null;
            if (b == null) {
                b = EmptyList.a;
            }
            if (b.isEmpty()) {
                return null;
            }
            com.yandex.go.taxi.summary.mobilityhub.mapper.b bVar = this.this$0.c;
            Address h = d0l0Var.h();
            zzs B = h != null ? h.B() : null;
            Address b2 = d0l0Var.b();
            zzs B2 = b2 != null ? b2.B() : null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = bVar.i(B, B2, b, this);
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
        return (List) (((List) obj).isEmpty() ? null : obj);
    }
}
