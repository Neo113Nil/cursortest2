package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review;

import com.yandex.go.places.models.data.entities.network.actions.DeleteReviewFlexAction;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review.DeleteReviewActionHandler$handle$1", f = "DeleteReviewActionHandler.kt", l = {20}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DeleteReviewActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ DeleteReviewFlexAction $action;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteReviewActionHandler$handle$1(b bVar, DeleteReviewFlexAction deleteReviewFlexAction, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = deleteReviewFlexAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeleteReviewActionHandler$handle$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeleteReviewActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.places.organization.card.impl.data.repositories.a aVar = this.this$0.a;
            DeleteReviewFlexAction deleteReviewFlexAction = this.$action;
            String str = deleteReviewFlexAction.a;
            String str2 = deleteReviewFlexAction.b;
            this.label = 1;
            if (aVar.a(str, str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.c.reloadDocument();
        return zy11.a;
    }
}
