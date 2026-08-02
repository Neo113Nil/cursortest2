package com.yandex.messaging.chat;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.at2;
import defpackage.fse;
import defpackage.kse;
import defpackage.m8g;
import defpackage.mmn;
import defpackage.ny61;
import defpackage.s020;
import defpackage.tje;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a extends k {
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final ChatRequest c;

    public a(kse kseVar, ChatRequest chatRequest, com.yandex.messaging.internal.authorized.chat.b bVar) {
        super(kseVar.e);
        this.b = bVar;
        this.c = chatRequest;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004e, code lost:
    
        if (r10 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ServerMessageRef serverMessageRef, ContinuationImpl continuationImpl) {
        DeleteMessageUseCase$run$1 deleteMessageUseCase$run$1;
        int i;
        fse fseVar;
        if (continuationImpl instanceof DeleteMessageUseCase$run$1) {
            deleteMessageUseCase$run$1 = (DeleteMessageUseCase$run$1) continuationImpl;
            int i2 = deleteMessageUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deleteMessageUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deleteMessageUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deleteMessageUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    deleteMessageUseCase$run$1.L$0 = serverMessageRef;
                    deleteMessageUseCase$run$1.L$1 = this;
                    deleteMessageUseCase$run$1.label = 1;
                    obj = this.b.a(this.c, deleteMessageUseCase$run$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) deleteMessageUseCase$run$1.L$1;
                    serverMessageRef = (ServerMessageRef) deleteMessageUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                }
                m8g m8gVar = (m8g) ((s020) obj);
                mmn mmnVar = new mmn(m8gVar.f(), m8gVar.h(), m8gVar.d.e(), (at2) m8gVar.c.z.get());
                deleteMessageUseCase$run$1.L$0 = null;
                deleteMessageUseCase$run$1.L$1 = null;
                deleteMessageUseCase$run$1.label = 2;
                this.getClass();
                fseVar = deleteMessageUseCase$run$1.get_context();
                if (fseVar == null) {
                    fseVar = deleteMessageUseCase$run$1.get_context();
                }
                Object k0 = tje.k0(fseVar, new DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1(null, mmnVar, serverMessageRef), deleteMessageUseCase$run$1);
                return k0 != coroutineSingletons ? coroutineSingletons : k0;
            }
        }
        deleteMessageUseCase$run$1 = new DeleteMessageUseCase$run$1(this, continuationImpl);
        Object obj2 = deleteMessageUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deleteMessageUseCase$run$1.label;
        if (i != 0) {
        }
        m8g m8gVar2 = (m8g) ((s020) obj2);
        mmn mmnVar2 = new mmn(m8gVar2.f(), m8gVar2.h(), m8gVar2.d.e(), (at2) m8gVar2.c.z.get());
        deleteMessageUseCase$run$1.L$0 = null;
        deleteMessageUseCase$run$1.L$1 = null;
        deleteMessageUseCase$run$1.label = 2;
        this.getClass();
        fseVar = deleteMessageUseCase$run$1.get_context();
        if (fseVar == null) {
        }
        Object k02 = tje.k0(fseVar, new DeleteMessageUseCase$deleteMessage$$inlined$cancelableCoroutineWrapper$1(null, mmnVar2, serverMessageRef), deleteMessageUseCase$run$1);
        if (k02 != coroutineSingletons2) {
        }
    }
}
