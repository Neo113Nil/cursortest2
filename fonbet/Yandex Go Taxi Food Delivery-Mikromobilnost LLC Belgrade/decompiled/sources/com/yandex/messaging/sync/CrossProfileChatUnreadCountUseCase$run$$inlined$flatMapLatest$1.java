package com.yandex.messaging.sync;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.unreadcount.d;
import com.yandex.messaging.internal.authorized.sync.SyncSource;
import com.yandex.messaging.internal.authorized.sync.i;
import defpackage.at2;
import defpackage.g6u;
import defpackage.kse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p8g;
import defpackage.t4t;
import defpackage.tpr;
import defpackage.v320;
import defpackage.vpr;
import defpackage.z8g;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.sync.CrossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1", f = "CrossProfileChatUnreadCountUseCase.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class CrossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ ChatRequest $params$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1(ChatRequest chatRequest, Continuation continuation) {
        super(3, continuation);
        this.$params$inlined = chatRequest;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CrossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1 crossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1 = new CrossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1(this.$params$inlined, (Continuation) obj3);
        crossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        crossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1.L$1 = obj2;
        return crossProfileChatUnreadCountUseCase$run$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            p8g p8gVar = (p8g) ((v320) this.L$1);
            z8g z8gVar = p8gVar.b;
            kse kseVar = (kse) z8gVar.f.get();
            t4t t4tVar = new t4t((com.yandex.messaging.internal.authorized.chat.b) p8gVar.C.get(), (at2) p8gVar.z.get(), (kse) z8gVar.f.get());
            d g = p8gVar.g();
            i iVar = (i) p8gVar.K0.get();
            g6u g6uVar = kseVar.b;
            ChatRequest chatRequest = this.$params$inlined;
            tpr F = e.F(i.a(iVar, new m0(t4tVar.a(chatRequest), d.d(g, null, chatRequest, 1), new ProfileChatUnreadCountUseCase$run$flow$1(chatRequest, null)), SyncSource.UnreadCountApi, chatRequest), g6uVar);
            this.label = 1;
            if (e.u(F, vprVar, this) == coroutineSingletons) {
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
