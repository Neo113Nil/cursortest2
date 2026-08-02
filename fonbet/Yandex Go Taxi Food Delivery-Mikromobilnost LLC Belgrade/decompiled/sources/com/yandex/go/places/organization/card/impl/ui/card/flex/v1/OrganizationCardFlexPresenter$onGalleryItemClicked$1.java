package com.yandex.go.places.organization.card.impl.ui.card.flex.v1;

import defpackage.k7v;
import defpackage.ki80;
import defpackage.mi80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.ub60;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.v1.OrganizationCardFlexPresenter$onGalleryItemClicked$1", f = "OrganizationCardFlexPresenter.kt", l = {328}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OrganizationCardFlexPresenter$onGalleryItemClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ mi80 $item;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrganizationCardFlexPresenter$onGalleryItemClicked$1(c cVar, mi80 mi80Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$item = mi80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OrganizationCardFlexPresenter$onGalleryItemClicked$1(this.this$0, this.$item, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OrganizationCardFlexPresenter$onGalleryItemClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            com.yandex.go.places.organization.card.impl.domain.interactors.flex.a aVar = cVar.N;
            String str = cVar.g0;
            List list = cVar.f0;
            mi80 mi80Var = this.$item;
            ki80 ki80Var = mi80Var instanceof ki80 ? (ki80) mi80Var : null;
            k7v k7vVar = ki80Var != null ? ki80Var.a : null;
            ub60 ub60Var = new ub60(18, cVar);
            this.label = 1;
            if (aVar.b(str, list, k7vVar, ub60Var, this) == coroutineSingletons) {
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
