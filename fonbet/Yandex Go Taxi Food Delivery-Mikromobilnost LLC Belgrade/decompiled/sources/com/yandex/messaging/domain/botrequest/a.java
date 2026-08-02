package com.yandex.messaging.domain.botrequest;

import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.k;
import defpackage.fse;
import defpackage.i720;
import defpackage.kse;
import defpackage.ny61;
import defpackage.q6b;
import defpackage.s020;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a extends k {
    public final q6b b;
    public final com.yandex.messaging.internal.authorized.chat.b c;
    public final i720 d;
    public final Moshi e;

    public a(kse kseVar, q6b q6bVar, com.yandex.messaging.internal.authorized.chat.b bVar, i720 i720Var, Moshi moshi) {
        super(kseVar.e);
        this.b = q6bVar;
        this.c = bVar;
        this.d = i720Var;
        this.e = moshi;
    }

    @Override // com.yandex.messaging.domain.k
    public final /* bridge */ /* synthetic */ Object b(Object obj, Continuation continuation) {
        return c((ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (defpackage.tje.k0(r2, r5, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        ChatOpenBotRequestUseCase$run$1 chatOpenBotRequestUseCase$run$1;
        int i;
        fse fseVar;
        if (continuationImpl instanceof ChatOpenBotRequestUseCase$run$1) {
            chatOpenBotRequestUseCase$run$1 = (ChatOpenBotRequestUseCase$run$1) continuationImpl;
            int i2 = chatOpenBotRequestUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatOpenBotRequestUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatOpenBotRequestUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatOpenBotRequestUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ChatRequest chatRequest = this.b.b;
                    chatOpenBotRequestUseCase$run$1.L$0 = this;
                    chatOpenBotRequestUseCase$run$1.label = 1;
                    obj = this.c.a(chatRequest, chatOpenBotRequestUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return zy11.a;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) chatOpenBotRequestUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                s020 s020Var = (s020) obj;
                fseVar = chatOpenBotRequestUseCase$run$1.get_context();
                if (fseVar == null) {
                    fseVar = chatOpenBotRequestUseCase$run$1.get_context();
                }
                ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1 chatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1 = new ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1(null, s020Var, this);
                chatOpenBotRequestUseCase$run$1.L$0 = null;
                chatOpenBotRequestUseCase$run$1.label = 2;
            }
        }
        chatOpenBotRequestUseCase$run$1 = new ChatOpenBotRequestUseCase$run$1(this, continuationImpl);
        Object obj2 = chatOpenBotRequestUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatOpenBotRequestUseCase$run$1.label;
        if (i != 0) {
        }
        s020 s020Var2 = (s020) obj2;
        fseVar = chatOpenBotRequestUseCase$run$1.get_context();
        if (fseVar == null) {
        }
        ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1 chatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$12 = new ChatOpenBotRequestUseCase$run$$inlined$cancelableCoroutineWrapper$1(null, s020Var2, this);
        chatOpenBotRequestUseCase$run$1.L$0 = null;
        chatOpenBotRequestUseCase$run$1.label = 2;
    }
}
