package com.yandex.messaging.sync;

import com.yandex.messaging.ChatRequest;
import defpackage.idb;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.x221;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "messagesCount", "Lx221;", "unread", "Lidb;", "<anonymous>", "(JLx221;)Lidb;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.sync.ProfileChatUnreadCountUseCase$run$flow$1", f = "CrossProfileChatUnreadCountUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class ProfileChatUnreadCountUseCase$run$flow$1 extends SuspendLambda implements zls {
    final /* synthetic */ ChatRequest $chatRequest;
    /* synthetic */ long J$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileChatUnreadCountUseCase$run$flow$1(ChatRequest chatRequest, Continuation continuation) {
        super(3, continuation);
        this.$chatRequest = chatRequest;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj).longValue();
        ProfileChatUnreadCountUseCase$run$flow$1 profileChatUnreadCountUseCase$run$flow$1 = new ProfileChatUnreadCountUseCase$run$flow$1(this.$chatRequest, (Continuation) obj3);
        profileChatUnreadCountUseCase$run$flow$1.J$0 = longValue;
        profileChatUnreadCountUseCase$run$flow$1.L$0 = (x221) obj2;
        return profileChatUnreadCountUseCase$run$flow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        return new idb(this.$chatRequest, ((x221) this.L$0).c, this.J$0);
    }
}
