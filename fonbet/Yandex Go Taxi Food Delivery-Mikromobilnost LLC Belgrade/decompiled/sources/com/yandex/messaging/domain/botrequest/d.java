package com.yandex.messaging.domain.botrequest;

import com.yandex.messaging.internal.i;
import defpackage.g6u;
import defpackage.h3y;
import defpackage.kse;
import defpackage.ny61;
import defpackage.p4t;
import defpackage.q6b;
import defpackage.tje;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class d {
    public static final LinkedHashMap j = new LinkedHashMap();
    public final q6b a;
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final i c;
    public final a d;
    public final p4t e;
    public final com.yandex.messaging.domain.chat.a f;
    public final h3y g;
    public final kse h;
    public boolean i;

    public d(q6b q6bVar, com.yandex.messaging.internal.authorized.chat.b bVar, i iVar, a aVar, p4t p4tVar, com.yandex.messaging.domain.chat.a aVar2, h3y h3yVar, kse kseVar) {
        this.a = q6bVar;
        this.b = bVar;
        this.c = iVar;
        this.d = aVar;
        this.e = p4tVar;
        this.f = aVar2;
        this.g = h3yVar;
        this.h = kseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        ConnectedChatOpenBotRequestUseCase$execute$1 connectedChatOpenBotRequestUseCase$execute$1;
        int i;
        if (continuation instanceof ConnectedChatOpenBotRequestUseCase$execute$1) {
            connectedChatOpenBotRequestUseCase$execute$1 = (ConnectedChatOpenBotRequestUseCase$execute$1) continuation;
            int i2 = connectedChatOpenBotRequestUseCase$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                connectedChatOpenBotRequestUseCase$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj = connectedChatOpenBotRequestUseCase$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = connectedChatOpenBotRequestUseCase$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    g6u g6uVar = this.h.e;
                    ConnectedChatOpenBotRequestUseCase$execute$2 connectedChatOpenBotRequestUseCase$execute$2 = new ConnectedChatOpenBotRequestUseCase$execute$2(this, null);
                    connectedChatOpenBotRequestUseCase$execute$1.label = 1;
                    if (tje.k0(g6uVar, connectedChatOpenBotRequestUseCase$execute$2, connectedChatOpenBotRequestUseCase$execute$1) == coroutineSingletons) {
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
        connectedChatOpenBotRequestUseCase$execute$1 = new ConnectedChatOpenBotRequestUseCase$execute$1(this, (ContinuationImpl) continuation);
        Object obj2 = connectedChatOpenBotRequestUseCase$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = connectedChatOpenBotRequestUseCase$execute$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
