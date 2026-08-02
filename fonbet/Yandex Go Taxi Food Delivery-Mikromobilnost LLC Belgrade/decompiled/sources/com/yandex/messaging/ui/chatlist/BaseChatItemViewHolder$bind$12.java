package com.yandex.messaging.ui.chatlist;

import com.yandex.messaging.internal.gaps.UserGapWorkflow;
import defpackage.d4b;
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
@mvg(c = "com.yandex.messaging.ui.chatlist.BaseChatItemViewHolder$bind$12", f = "BaseChatItemViewHolder.kt", l = {177}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class BaseChatItemViewHolder$bind$12 extends SuspendLambda implements wls {
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseChatItemViewHolder$bind$12(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BaseChatItemViewHolder$bind$12(this.this$0, this.$userId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseChatItemViewHolder$bind$12) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.messaging.internal.team.gaps.a aVar = this.this$0.S;
            String str = this.$userId;
            this.label = 1;
            obj = aVar.a(str, this);
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
        UserGapWorkflow userGapWorkflow = (UserGapWorkflow) obj;
        zy11 zy11Var = zy11.a;
        if (userGapWorkflow == null) {
            return zy11Var;
        }
        d4b Z = this.this$0.Z();
        Z.c.setBorderColor(userGapWorkflow.a(Z.p));
        return zy11Var;
    }
}
