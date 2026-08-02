package com.yandex.messaging.ui.neophonish;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import defpackage.b00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qm50;
import defpackage.t3z;
import defpackage.tm50;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.neophonish.NeophonishUpgradeViewModel$onCancelSending$1", f = "NeophonishUpgradeViewModel.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NeophonishUpgradeViewModel$onCancelSending$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ String $shownMessageId;
    int label;
    final /* synthetic */ tm50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeophonishUpgradeViewModel$onCancelSending$1(tm50 tm50Var, ChatRequest chatRequest, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tm50Var;
        this.$chatRequest = chatRequest;
        this.$shownMessageId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NeophonishUpgradeViewModel$onCancelSending$1(this.this$0, this.$chatRequest, this.$shownMessageId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NeophonishUpgradeViewModel$onCancelSending$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b00 b00Var = this.this$0.x;
            ChatRequest chatRequest = this.$chatRequest;
            t3z t3zVar = LocalMessageRef.Companion;
            String str = this.$shownMessageId;
            t3zVar.getClass();
            b00Var.b(chatRequest, t3z.b(str));
            tm50 tm50Var = this.this$0;
            this.label = 1;
            if (tm50Var.W(qm50.a, this) == coroutineSingletons) {
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
