package com.yandex.messaging.domain.botrequest;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.k;
import defpackage.fse;
import defpackage.goq0;
import defpackage.kse;
import defpackage.ny61;
import defpackage.s020;
import defpackage.tje;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class e extends k {
    public final com.yandex.messaging.internal.authorized.chat.b b;

    public e(kse kseVar, com.yandex.messaging.internal.authorized.chat.b bVar) {
        super(kseVar.e);
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(goq0 goq0Var, ContinuationImpl continuationImpl) {
        SendBotRequestUseCase$run$1 sendBotRequestUseCase$run$1;
        int i;
        if (continuationImpl instanceof SendBotRequestUseCase$run$1) {
            sendBotRequestUseCase$run$1 = (SendBotRequestUseCase$run$1) continuationImpl;
            int i2 = sendBotRequestUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sendBotRequestUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sendBotRequestUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sendBotRequestUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ChatRequest chatRequest = goq0Var.a;
                    sendBotRequestUseCase$run$1.L$0 = goq0Var;
                    sendBotRequestUseCase$run$1.label = 1;
                    obj = this.b.a(chatRequest, sendBotRequestUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    goq0Var = (goq0) sendBotRequestUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                fse fseVar = sendBotRequestUseCase$run$1.get_context();
                SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1 sendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1 = new SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1(null, (s020) obj, goq0Var);
                sendBotRequestUseCase$run$1.L$0 = null;
                sendBotRequestUseCase$run$1.label = 2;
                Object k0 = tje.k0(fseVar, sendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1, sendBotRequestUseCase$run$1);
                return k0 != coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        sendBotRequestUseCase$run$1 = new SendBotRequestUseCase$run$1(this, continuationImpl);
        Object obj2 = sendBotRequestUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sendBotRequestUseCase$run$1.label;
        if (i != 0) {
        }
        fse fseVar2 = sendBotRequestUseCase$run$1.get_context();
        SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1 sendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$12 = new SendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$1(null, (s020) obj2, goq0Var);
        sendBotRequestUseCase$run$1.L$0 = null;
        sendBotRequestUseCase$run$1.label = 2;
        Object k02 = tje.k0(fseVar2, sendBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$default$12, sendBotRequestUseCase$run$1);
        if (k02 != coroutineSingletons2) {
        }
    }
}
