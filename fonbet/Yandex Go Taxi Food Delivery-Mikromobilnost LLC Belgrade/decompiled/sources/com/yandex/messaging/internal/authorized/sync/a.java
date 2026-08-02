package com.yandex.messaging.internal.authorized.sync;

import com.yandex.messaging.core.net.entities.GetChatInfoData;
import com.yandex.messaging.internal.net.AuthorizedApiCallsExtensionsKt$getChatsInfo$$inlined$makeCall$1;
import defpackage.fse;
import defpackage.kse;
import defpackage.ny61;
import defpackage.oyj0;
import defpackage.tje;
import defpackage.to3;
import java.io.Serializable;
import java.util.LinkedHashSet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a {
    public final to3 a;
    public final kse b;

    public a(to3 to3Var, kse kseVar) {
        this.a = to3Var;
        this.b = kseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.yandex.messaging.core.net.entities.ChatData[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(LinkedHashSet linkedHashSet, ContinuationImpl continuationImpl) {
        ChatsLoader$requestChats$1 chatsLoader$requestChats$1;
        int i;
        GetChatInfoData getChatInfoData;
        if (continuationImpl instanceof ChatsLoader$requestChats$1) {
            chatsLoader$requestChats$1 = (ChatsLoader$requestChats$1) continuationImpl;
            int i2 = chatsLoader$requestChats$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatsLoader$requestChats$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatsLoader$requestChats$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatsLoader$requestChats$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!linkedHashSet.isEmpty()) {
                        fse fseVar = this.b.e;
                        String[] strArr = (String[]) linkedHashSet.toArray(new String[0]);
                        chatsLoader$requestChats$1.label = 1;
                        if (fseVar == null) {
                            fseVar = chatsLoader$requestChats$1.get_context();
                        }
                        obj = tje.k0(fseVar, new AuthorizedApiCallsExtensionsKt$getChatsInfo$$inlined$makeCall$1(null, this.a, strArr), chatsLoader$requestChats$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                getChatInfoData = (GetChatInfoData) ((oyj0) obj).b();
                if (getChatInfoData != null) {
                    return getChatInfoData.chats;
                }
                return null;
            }
        }
        chatsLoader$requestChats$1 = new ChatsLoader$requestChats$1(this, continuationImpl);
        Object obj2 = chatsLoader$requestChats$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatsLoader$requestChats$1.label;
        if (i != 0) {
        }
        getChatInfoData = (GetChatInfoData) ((oyj0) obj2).b();
        if (getChatInfoData != null) {
        }
        return null;
    }
}
