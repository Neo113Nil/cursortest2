package com.yandex.messaging.internal.authorized.sync;

import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.ChatRole;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.HistoryResponse;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.Message;
import defpackage.ci91;
import defpackage.h9b;
import defpackage.hcb;
import defpackage.hjt;
import defpackage.j73;
import defpackage.jse;
import defpackage.k020;
import defpackage.ks10;
import defpackage.l020;
import defpackage.n420;
import defpackage.ny61;
import defpackage.p2b;
import defpackage.pzt0;
import defpackage.qtq0;
import defpackage.tje;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class f {
    public final g a;
    public final qtq0 b;
    public final k020 c;
    public final jse d;
    public final h9b e;
    public final ks10 f;

    public f(g gVar, qtq0 qtq0Var, k020 k020Var, jse jseVar, h9b h9bVar, ks10 ks10Var) {
        this.a = gVar;
        this.b = qtq0Var;
        this.c = k020Var;
        this.d = jseVar;
        this.e = h9bVar;
        this.f = ks10Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3 A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:16:0x0079, B:19:0x007f, B:21:0x0087, B:23:0x00a3, B:24:0x00af, B:26:0x00b5, B:30:0x00bb, B:32:0x00c5, B:33:0x00ca, B:35:0x00ce, B:36:0x00dc), top: B:15:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5 A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:16:0x0079, B:19:0x007f, B:21:0x0087, B:23:0x00a3, B:24:0x00af, B:26:0x00b5, B:30:0x00bb, B:32:0x00c5, B:33:0x00ca, B:35:0x00ce, B:36:0x00dc), top: B:15:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce A[Catch: all -> 0x00ad, TryCatch #1 {all -> 0x00ad, blocks: (B:16:0x0079, B:19:0x007f, B:21:0x0087, B:23:0x00a3, B:24:0x00af, B:26:0x00b5, B:30:0x00bb, B:32:0x00c5, B:33:0x00ca, B:35:0x00ce, B:36:0x00dc), top: B:15:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(f fVar, ServerMessageRef serverMessageRef, ContinuationImpl continuationImpl) {
        ServerMessageLoader$executeRequest$1 serverMessageLoader$executeRequest$1;
        int i;
        ChatHistoryResponse[] chatHistoryResponseArr;
        ChatHistoryResponse chatHistoryResponse;
        l020 C;
        ServerMessage serverMessage;
        String str;
        ChatInfoFromTransport chatInfoFromTransport;
        ChatInfoFromTransport chatInfoFromTransport2;
        ChatRole chatRole;
        ChatHistoryResponse.OutMessage[] outMessageArr;
        ChatHistoryResponse.OutMessage outMessage;
        String str2;
        Message b;
        p2b p2bVar;
        f fVar2 = fVar;
        fVar2.getClass();
        if (continuationImpl instanceof ServerMessageLoader$executeRequest$1) {
            serverMessageLoader$executeRequest$1 = (ServerMessageLoader$executeRequest$1) continuationImpl;
            int i2 = serverMessageLoader$executeRequest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                serverMessageLoader$executeRequest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = serverMessageLoader$executeRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = serverMessageLoader$executeRequest$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String requiredChatId = serverMessageRef.getRequiredChatId();
                    HistoryRequest historyRequest = new HistoryRequest();
                    historyRequest.chatId = requiredChatId;
                    historyRequest.maxTimestamp = serverMessageRef.getTimestamp() + 1;
                    historyRequest.limit = 1L;
                    n420 n420Var = fVar2.a.a0;
                    jse jseVar = fVar2.d;
                    serverMessageLoader$executeRequest$1.L$0 = fVar2;
                    serverMessageLoader$executeRequest$1.label = 1;
                    obj = com.yandex.messaging.internal.suspend.extensions.b.a(historyRequest, n420Var, jseVar, serverMessageLoader$executeRequest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fVar2 = (f) serverMessageLoader$executeRequest$1.L$0;
                    kotlin.b.b(obj);
                }
                chatHistoryResponseArr = ((HistoryResponse) obj).chats;
                if (chatHistoryResponseArr != null && (chatHistoryResponse = (ChatHistoryResponse) j73.D(chatHistoryResponseArr)) != null) {
                    C = fVar2.c.C();
                    try {
                        serverMessage = chatHistoryResponse.threadParentMessage;
                        str = "";
                        if (serverMessage != null && (b = fVar2.f.b(serverMessage)) != null) {
                            p2bVar = (p2b) androidx.room.util.a.b(C.H.a, true, false, new hcb(C.B.g(b.a, ""), 11));
                            if (p2bVar != null) {
                                C.b0(ci91.g(p2bVar), b, false);
                            }
                        }
                        String str3 = chatHistoryResponse.chatId;
                        chatInfoFromTransport = chatHistoryResponse.chatInfo;
                        if (chatInfoFromTransport != null && (str2 = chatInfoFromTransport.name) != null) {
                            str = str2;
                        }
                        long g = C.B.g(str3, str);
                        chatInfoFromTransport2 = chatHistoryResponse.chatInfo;
                        if (chatInfoFromTransport2 != null) {
                            C.n0(g, chatInfoFromTransport2.participantsCount);
                        }
                        chatRole = chatHistoryResponse.myRole;
                        if (chatRole != null) {
                            C.A.c(chatHistoryResponse.chatId, g, chatRole.rights, chatRole.role, chatRole.version, false);
                        }
                        C.s();
                        C.close();
                        outMessageArr = chatHistoryResponse.messages;
                        if (outMessageArr != null && (outMessage = (ChatHistoryResponse.OutMessage) j73.D(outMessageArr)) != null) {
                            return outMessage.serverMessage;
                        }
                    } finally {
                    }
                }
                return null;
            }
        }
        serverMessageLoader$executeRequest$1 = new ServerMessageLoader$executeRequest$1(fVar2, continuationImpl);
        Object obj2 = serverMessageLoader$executeRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = serverMessageLoader$executeRequest$1.label;
        if (i != 0) {
        }
        chatHistoryResponseArr = ((HistoryResponse) obj2).chats;
        if (chatHistoryResponseArr != null) {
            C = fVar2.c.C();
            serverMessage = chatHistoryResponse.threadParentMessage;
            str = "";
            if (serverMessage != null) {
                p2bVar = (p2b) androidx.room.util.a.b(C.H.a, true, false, new hcb(C.B.g(b.a, ""), 11));
                if (p2bVar != null) {
                }
            }
            String str32 = chatHistoryResponse.chatId;
            chatInfoFromTransport = chatHistoryResponse.chatInfo;
            if (chatInfoFromTransport != null) {
                str = str2;
            }
            long g2 = C.B.g(str32, str);
            chatInfoFromTransport2 = chatHistoryResponse.chatInfo;
            if (chatInfoFromTransport2 != null) {
            }
            chatRole = chatHistoryResponse.myRole;
            if (chatRole != null) {
            }
            C.s();
            C.close();
            outMessageArr = chatHistoryResponse.messages;
            if (outMessageArr != null) {
                return outMessage.serverMessage;
            }
        }
        return null;
    }

    public static pzt0 c(f fVar, ServerMessageRef serverMessageRef, SyncSource syncSource) {
        if (fVar.c.h(serverMessageRef)) {
            return null;
        }
        return tje.N(hjt.a, null, null, new ServerMessageLoader$loadAsyncIfAbsent$1(fVar, serverMessageRef, syncSource, null, 10000L, null, null), 3);
    }

    public final Object b(ServerMessageRef serverMessageRef, SyncSource syncSource, String str, long j, ContinuationImpl continuationImpl) {
        return tje.k0(this.d, new ServerMessageLoader$load$2(this, syncSource, j, serverMessageRef, str, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ServerMessageRef serverMessageRef, SyncSource syncSource, ContinuationImpl continuationImpl) {
        ServerMessageLoader$loadIfAbsent$1 serverMessageLoader$loadIfAbsent$1;
        int i;
        if (continuationImpl instanceof ServerMessageLoader$loadIfAbsent$1) {
            serverMessageLoader$loadIfAbsent$1 = (ServerMessageLoader$loadIfAbsent$1) continuationImpl;
            int i2 = serverMessageLoader$loadIfAbsent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                serverMessageLoader$loadIfAbsent$1.label = i2 - Integer.MIN_VALUE;
                ServerMessageLoader$loadIfAbsent$1 serverMessageLoader$loadIfAbsent$12 = serverMessageLoader$loadIfAbsent$1;
                Object obj = serverMessageLoader$loadIfAbsent$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = serverMessageLoader$loadIfAbsent$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.c.h(serverMessageRef)) {
                        return Boolean.FALSE;
                    }
                    serverMessageLoader$loadIfAbsent$12.label = 1;
                    if (b(serverMessageRef, syncSource, null, 10000L, serverMessageLoader$loadIfAbsent$12) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return Boolean.TRUE;
            }
        }
        serverMessageLoader$loadIfAbsent$1 = new ServerMessageLoader$loadIfAbsent$1(this, continuationImpl);
        ServerMessageLoader$loadIfAbsent$1 serverMessageLoader$loadIfAbsent$122 = serverMessageLoader$loadIfAbsent$1;
        Object obj3 = serverMessageLoader$loadIfAbsent$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = serverMessageLoader$loadIfAbsent$122.label;
        if (i != 0) {
        }
        return Boolean.TRUE;
    }
}
