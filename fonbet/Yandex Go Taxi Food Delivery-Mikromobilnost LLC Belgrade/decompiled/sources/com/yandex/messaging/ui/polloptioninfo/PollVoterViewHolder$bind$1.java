package com.yandex.messaging.ui.polloptioninfo;

import com.yandex.images.FadingDrawable;
import com.yandex.messaging.core.net.entities.proto.message.ReducedUserInfo;
import defpackage.ad7;
import defpackage.cyd0;
import defpackage.g020;
import defpackage.hb4;
import defpackage.kjs0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.polloptioninfo.PollVoterViewHolder$bind$1", f = "PollVoterViewHolder.kt", l = {HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PollVoterViewHolder$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $name;
    final /* synthetic */ ReducedUserInfo $userInfo;
    int label;
    final /* synthetic */ cyd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollVoterViewHolder$bind$1(ReducedUserInfo reducedUserInfo, String str, cyd0 cyd0Var, Continuation continuation) {
        super(2, continuation);
        this.$userInfo = reducedUserInfo;
        this.$name = str;
        this.this$0 = cyd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PollVoterViewHolder$bind$1(this.$userInfo, this.$name, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PollVoterViewHolder$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$userInfo.avatarId;
            g020 g020Var = new g020(com.yandex.messaging.internal.images.b.f(str), kjs0.b(42), this.$name, this.$userInfo.userId, hb4.a);
            com.yandex.messaging.internal.avatar.a aVar = this.this$0.N;
            this.label = 1;
            obj = aVar.b(g020Var, this);
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
        ad7 ad7Var = (ad7) obj;
        FadingDrawable.setBitmap(this.this$0.Q, ad7Var.a, false, ad7Var.d);
        return zy11.a;
    }
}
