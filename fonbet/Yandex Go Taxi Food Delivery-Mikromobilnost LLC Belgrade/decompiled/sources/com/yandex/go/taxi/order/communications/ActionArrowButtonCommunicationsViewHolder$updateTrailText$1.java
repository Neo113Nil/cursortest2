package com.yandex.go.taxi.order.communications;

import defpackage.g00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.communications.ActionArrowButtonCommunicationsViewHolder$updateTrailText$1", f = "ActionArrowButtonCommunicationsViewHolder.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ActionArrowButtonCommunicationsViewHolder$updateTrailText$1 extends SuspendLambda implements wls {
    final /* synthetic */ g00 $widget;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionArrowButtonCommunicationsViewHolder$updateTrailText$1(a aVar, g00 g00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$widget = g00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ActionArrowButtonCommunicationsViewHolder$updateTrailText$1(this.this$0, this.$widget, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ActionArrowButtonCommunicationsViewHolder$updateTrailText$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ActionArrowButtonCommunicationsViewHolder$updateTrailText$1 actionArrowButtonCommunicationsViewHolder$updateTrailText$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.widget.c cVar = this.this$0.k0;
            FormattedText formattedText = (FormattedText) this.$widget.d.getValue();
            this.label = 1;
            actionArrowButtonCommunicationsViewHolder$updateTrailText$1 = this;
            obj = ru.yandex.taxi.widget.c.e(cVar, formattedText, null, false, actionArrowButtonCommunicationsViewHolder$updateTrailText$1, 30);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            actionArrowButtonCommunicationsViewHolder$updateTrailText$1 = this;
        }
        actionArrowButtonCommunicationsViewHolder$updateTrailText$1.this$0.j0.setTrailCompanionText((CharSequence) obj);
        actionArrowButtonCommunicationsViewHolder$updateTrailText$1.this$0.j0.invalidateComponent();
        return zy11.a;
    }
}
