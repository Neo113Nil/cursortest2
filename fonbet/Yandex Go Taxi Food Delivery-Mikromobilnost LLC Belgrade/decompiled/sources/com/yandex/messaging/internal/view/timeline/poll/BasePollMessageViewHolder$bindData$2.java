package com.yandex.messaging.internal.view.timeline.poll;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isVoting", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.view.timeline.poll.BasePollMessageViewHolder$bindData$2", f = "BasePollMessageViewHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BasePollMessageViewHolder$bindData$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $isSingleChoice;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePollMessageViewHolder$bindData$2(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$isSingleChoice = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        BasePollMessageViewHolder$bindData$2 basePollMessageViewHolder$bindData$2 = new BasePollMessageViewHolder$bindData$2(this.this$0, this.$isSingleChoice, continuation);
        basePollMessageViewHolder$bindData$2.Z$0 = ((Boolean) obj).booleanValue();
        return basePollMessageViewHolder$bindData$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        BasePollMessageViewHolder$bindData$2 basePollMessageViewHolder$bindData$2 = (BasePollMessageViewHolder$bindData$2) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        basePollMessageViewHolder$bindData$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        boolean z = this.Z$0;
        com.yandex.messaging.internal.view.timeline.poll.options.b bVar = this.this$0.H2;
        bVar.y = z;
        bVar.notifyItemRangeChanged(0, bVar.w.size());
        boolean z2 = this.$isSingleChoice;
        a aVar = this.this$0;
        if (z2) {
            aVar.V2.q(false);
        } else {
            aVar.V2.q(z);
        }
        return zy11.a;
    }
}
