package com.yandex.go.places.organization.card.impl.ui.card.flex.v1;

import com.yandex.go.places.models.data.entities.network.map.e;
import defpackage.mvg;
import defpackage.ne80;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.v1.OrganizationCardFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1", f = "OrganizationCardFlexPresenter.kt", l = {196}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1 extends SuspendLambda implements wls {
    final /* synthetic */ Object $data;
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1(c cVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$data = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1(this.this$0, this.$data, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardFlexPresenter$mapObjectSharedDataParser$1$processSharedData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ne80 ne80Var = (ne80) this.this$0.J.a.getValue();
            if (ne80Var != null) {
                c cVar = this.this$0;
                Object obj2 = this.$data;
                com.yandex.go.places.organization.card.impl.domain.interactors.flex.a aVar = cVar.N;
                this.L$0 = null;
                this.label = 1;
                if (aVar.b.a.emit(new Pair(ne80Var.a, (e) obj2), this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
