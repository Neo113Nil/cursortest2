package com.yandex.messaging.audio;

import defpackage.act;
import defpackage.az31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tyc0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lact;", "it", "Lzy11;", "<anonymous>", "(Lact;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.audio.PlayerHolder$subscribeToVoiceMessageChanges$1", f = "PlayerHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PlayerHolder$subscribeToVoiceMessageChanges$1 extends SuspendLambda implements wls {
    final /* synthetic */ az31 $track;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tyc0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerHolder$subscribeToVoiceMessageChanges$1(tyc0 tyc0Var, az31 az31Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tyc0Var;
        this.$track = az31Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlayerHolder$subscribeToVoiceMessageChanges$1 playerHolder$subscribeToVoiceMessageChanges$1 = new PlayerHolder$subscribeToVoiceMessageChanges$1(this.this$0, this.$track, continuation);
        playerHolder$subscribeToVoiceMessageChanges$1.L$0 = obj;
        return playerHolder$subscribeToVoiceMessageChanges$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PlayerHolder$subscribeToVoiceMessageChanges$1 playerHolder$subscribeToVoiceMessageChanges$1 = (PlayerHolder$subscribeToVoiceMessageChanges$1) create((act) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        playerHolder$subscribeToVoiceMessageChanges$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (((act) this.L$0) == null) {
            this.this$0.a();
        }
        return zy11.a;
    }
}
