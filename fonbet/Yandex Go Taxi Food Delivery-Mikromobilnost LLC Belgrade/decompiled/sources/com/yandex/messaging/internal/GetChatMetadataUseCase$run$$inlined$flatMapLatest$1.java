package com.yandex.messaging.internal;

import com.yandex.messaging.internal.authorized.chat.ChatMetadataController$flow$$inlined$disposableFlowWrapper$1;
import defpackage.fi9;
import defpackage.l5b;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s020;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.GetChatMetadataUseCase$run$$inlined$flatMapLatest$1", f = "GetChatMetadataUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GetChatMetadataUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetChatMetadataUseCase$run$$inlined$flatMapLatest$1 getChatMetadataUseCase$run$$inlined$flatMapLatest$1 = new GetChatMetadataUseCase$run$$inlined$flatMapLatest$1(3, (Continuation) obj3);
        getChatMetadataUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        getChatMetadataUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return getChatMetadataUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            l5b l5bVar = (l5b) ((m8g) ((s020) this.L$1)).p0.get();
            l5bVar.getClass();
            fi9 i2 = kotlinx.coroutines.flow.e.i(new ChatMetadataController$flow$$inlined$disposableFlowWrapper$1(null, l5bVar));
            this.label = 1;
            if (kotlinx.coroutines.flow.e.u(i2, vprVar, this) == coroutineSingletons) {
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
