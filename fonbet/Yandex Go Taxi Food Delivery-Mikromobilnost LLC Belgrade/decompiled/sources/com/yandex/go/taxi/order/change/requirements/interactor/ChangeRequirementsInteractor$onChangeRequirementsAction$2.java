package com.yandex.go.taxi.order.change.requirements.interactor;

import com.yandex.go.taxi.order.change.common.domain.d;
import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import defpackage.jl40;
import defpackage.lf9;
import defpackage.mf9;
import defpackage.mvg;
import defpackage.nf9;
import defpackage.ny61;
import defpackage.tb9;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.change.requirements.interactor.ChangeRequirementsInteractor$onChangeRequirementsAction$2", f = "ChangeRequirementsInteractor.kt", l = {27}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ChangeRequirementsInteractor$onChangeRequirementsAction$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ kotlinx.serialization.json.b $requirementsPayload;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeRequirementsInteractor$onChangeRequirementsAction$2(a aVar, String str, kotlinx.serialization.json.b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderId = str;
        this.$requirementsPayload = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChangeRequirementsInteractor$onChangeRequirementsAction$2(this.this$0, this.$orderId, this.$requirementsPayload, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangeRequirementsInteractor$onChangeRequirementsAction$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.order.change.requirements.repository.a aVar = this.this$0.c;
            String str = this.$orderId;
            kotlinx.serialization.json.b bVar = this.$requirementsPayload;
            this.label = 1;
            obj = aVar.a(str, this, bVar);
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
        nf9 nf9Var = (nf9) obj;
        a aVar2 = this.this$0;
        if (nf9Var instanceof lf9) {
            d dVar = aVar2.b;
            lf9 lf9Var = (lf9) nf9Var;
            dVar.a.h(new tb9(lf9Var.a, lf9Var.b, ChangeOrderState$Source.REQUIREMENT));
        } else {
            aVar2.getClass();
            if (!jl40.l(nf9Var, mf9.a)) {
                w511.b();
                return null;
            }
        }
        return zy11.a;
    }
}
