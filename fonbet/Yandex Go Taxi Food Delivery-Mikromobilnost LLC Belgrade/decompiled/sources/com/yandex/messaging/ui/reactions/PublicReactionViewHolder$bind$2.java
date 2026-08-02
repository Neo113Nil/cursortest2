package com.yandex.messaging.ui.reactions;

import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.reactions.PublicReactionViewHolder$bind$2", f = "PublicReactionViewHolder.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PublicReactionViewHolder$bind$2 extends SuspendLambda implements wls {
    final /* synthetic */ ReducedUserInfo $userInfo;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicReactionViewHolder$bind$2(b bVar, ReducedUserInfo reducedUserInfo, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$userInfo = reducedUserInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PublicReactionViewHolder$bind$2(this.this$0, this.$userInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PublicReactionViewHolder$bind$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            ReducedUserInfo reducedUserInfo = this.$userInfo;
            this.label = 1;
            if (b.W(bVar, reducedUserInfo, this) == coroutineSingletons) {
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
