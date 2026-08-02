package com.yandex.messaging.internal.authorized.chat.refresher;

import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.MessageDataFilter;
import com.yandex.messaging.core.net.entities.proto.ReducedChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ReducedHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ReducedServerMessage;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.entities.ReducedMessage;
import defpackage.fbb;
import defpackage.g6u;
import defpackage.imz;
import defpackage.j73;
import defpackage.kse;
import defpackage.n5t0;
import defpackage.naz0;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class c {
    public final naz0 a;
    public final n5t0 b;
    public final kse c;
    public final fbb d;

    public c(naz0 naz0Var, n5t0 n5t0Var, kse kseVar, fbb fbbVar) {
        this.a = naz0Var;
        this.b = n5t0Var;
        this.c = kseVar;
        this.d = fbbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(imz imzVar, String str, ContinuationImpl continuationImpl) {
        ReducedMessageLoader$loadMessages$1 reducedMessageLoader$loadMessages$1;
        int i;
        ReducedChatHistoryResponse[] reducedChatHistoryResponseArr;
        Iterator it;
        ArrayList arrayList;
        ?? r4;
        ArrayList arrayList2;
        ReducedMessage reducedMessage;
        if (continuationImpl instanceof ReducedMessageLoader$loadMessages$1) {
            reducedMessageLoader$loadMessages$1 = (ReducedMessageLoader$loadMessages$1) continuationImpl;
            int i2 = reducedMessageLoader$loadMessages$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                reducedMessageLoader$loadMessages$1.label = i2 - Integer.MIN_VALUE;
                Object obj = reducedMessageLoader$loadMessages$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = reducedMessageLoader$loadMessages$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str2 = str == null ? this.a.a.b : str;
                    HistoryRequest historyRequest = new HistoryRequest();
                    historyRequest.chatId = str2;
                    historyRequest.maxTimestamp = imzVar.b + 1;
                    historyRequest.minTimestamp = imzVar.a;
                    historyRequest.limit = this.d.a;
                    historyRequest.offset = 0L;
                    historyRequest.dropPersonalFields = true;
                    MessageDataFilter messageDataFilter = new MessageDataFilter();
                    messageDataFilter.dropPayload = true;
                    historyRequest.messageDataFilter = messageDataFilter;
                    g6u g6uVar = this.c.e;
                    ReducedMessageLoader$loadMessages$response$1 reducedMessageLoader$loadMessages$response$1 = new ReducedMessageLoader$loadMessages$response$1(historyRequest, this, null);
                    reducedMessageLoader$loadMessages$1.label = 1;
                    obj = tje.k0(g6uVar, reducedMessageLoader$loadMessages$response$1, reducedMessageLoader$loadMessages$1);
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
                reducedChatHistoryResponseArr = ((ReducedHistoryResponse) obj).chats;
                int i3 = 0;
                if (reducedChatHistoryResponseArr == null) {
                    reducedChatHistoryResponseArr = new ReducedChatHistoryResponse[0];
                }
                List A = j73.A(reducedChatHistoryResponseArr);
                ArrayList arrayList3 = new ArrayList(tcc.n(A, 10));
                it = A.iterator();
                while (it.hasNext()) {
                    ReducedChatHistoryResponse.ReducedOutMessage[] reducedOutMessageArr = ((ReducedChatHistoryResponse) it.next()).messages;
                    if (reducedOutMessageArr != null) {
                        r4 = new ArrayList();
                        int length = reducedOutMessageArr.length;
                        int i4 = i3;
                        while (i4 < length) {
                            ReducedServerMessage reducedServerMessage = reducedOutMessageArr[i4].serverMessage;
                            ReducedChatHistoryResponse.ReducedPlainMessage reducedPlainMessage = reducedServerMessage.clientMessage.plain;
                            if (reducedPlainMessage != null) {
                                ReducedChatHistoryResponse.ReducedServerMessageInfo reducedServerMessageInfo = reducedServerMessage.serverMessageInfo;
                                boolean b = ChatNamespaces.b(reducedPlainMessage.chatId);
                                arrayList2 = arrayList3;
                                reducedMessage = new ReducedMessage(reducedPlainMessage.chatId, reducedServerMessageInfo.timestamp, b ? Math.max(1L, reducedServerMessageInfo.views) : 0L, b ? reducedServerMessageInfo.forwardCount : 0L);
                            } else {
                                arrayList2 = arrayList3;
                                reducedMessage = null;
                            }
                            if (reducedMessage != null) {
                                r4.add(reducedMessage);
                            }
                            i4++;
                            arrayList3 = arrayList2;
                        }
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        r4 = EmptyList.a;
                    }
                    arrayList3 = arrayList;
                    arrayList3.add(kotlin.collections.a.J0((Iterable) r4));
                    i3 = 0;
                }
                return tcc.o(arrayList3);
            }
        }
        reducedMessageLoader$loadMessages$1 = new ReducedMessageLoader$loadMessages$1(this, continuationImpl);
        Object obj2 = reducedMessageLoader$loadMessages$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = reducedMessageLoader$loadMessages$1.label;
        if (i != 0) {
        }
        reducedChatHistoryResponseArr = ((ReducedHistoryResponse) obj2).chats;
        int i32 = 0;
        if (reducedChatHistoryResponseArr == null) {
        }
        List A2 = j73.A(reducedChatHistoryResponseArr);
        ArrayList arrayList32 = new ArrayList(tcc.n(A2, 10));
        it = A2.iterator();
        while (it.hasNext()) {
        }
        return tcc.o(arrayList32);
    }
}
