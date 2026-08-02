package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.HistoryRequest;
import com.yandex.messaging.core.net.entities.proto.ReducedChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ReducedHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ReducedServerMessage;
import com.yandex.messaging.internal.entities.MessageReactions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class cw10 extends pmi0 {
    public final /* synthetic */ HistoryRequest a;
    public final /* synthetic */ fw10 b;

    public cw10(HistoryRequest historyRequest, fw10 fw10Var) {
        this.a = historyRequest;
        this.b = fw10Var;
    }

    @Override // defpackage.pmi0
    public final void b(ReducedHistoryResponse reducedHistoryResponse) {
        w3c w3cVar;
        boolean z;
        int i;
        int i2;
        w3c w3cVar2;
        fw10 fw10Var = this.b;
        z83.g(null, fw10Var.k.getLooper(), Looper.myLooper());
        w3c w3cVar3 = fw10Var.g;
        w3cVar3.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        w3cVar3.getClass();
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        fw10Var.p = null;
        ArrayList arrayList = new ArrayList();
        ReducedChatHistoryResponse[] reducedChatHistoryResponseArr = reducedHistoryResponse.chats;
        ReducedChatHistoryResponse reducedChatHistoryResponse = reducedChatHistoryResponseArr != null ? (ReducedChatHistoryResponse) j73.G(0, reducedChatHistoryResponseArr) : null;
        if (reducedChatHistoryResponse == null || !jl40.l(reducedChatHistoryResponse.chatId, fw10Var.a.a.b)) {
            w3cVar = w3cVar3;
            z = true;
        } else {
            l020 C = fw10Var.c.C();
            try {
                ReducedChatHistoryResponse.ReducedOutMessage[] reducedOutMessageArr = reducedChatHistoryResponse.messages;
                if (reducedOutMessageArr == null) {
                    reducedOutMessageArr = new ReducedChatHistoryResponse.ReducedOutMessage[0];
                }
                ReducedChatHistoryResponse.ReducedOutMessage[] reducedOutMessageArr2 = reducedOutMessageArr;
                int length = reducedOutMessageArr2.length;
                int i3 = 0;
                z = true;
                while (i3 < length) {
                    ReducedChatHistoryResponse.ReducedOutMessage reducedOutMessage = reducedOutMessageArr2[i3];
                    if (reducedOutMessage != null) {
                        ReducedServerMessage reducedServerMessage = reducedOutMessage.serverMessage;
                        long j = reducedServerMessage.serverMessageInfo.timestamp;
                        fw10 fw10Var2 = fw10Var;
                        l020 l020Var = C;
                        try {
                            long j2 = reducedServerMessage.reactionsVersion;
                            MessageReactions a = MessageReactions.a(reducedServerMessage.reactions, reducedServerMessage.recentUserReactions);
                            if (j != 0) {
                                C = l020Var;
                                fw10Var = fw10Var2;
                                w3cVar2 = w3cVar3;
                                i = length;
                                i2 = i3;
                                fw10Var.d(C, j, j2, a);
                                arrayList.add(Long.valueOf(j));
                                fw10Var.e(C, j, reducedOutMessage.serverMessage.serverMessageInfo.threadState);
                                fw10.a(fw10Var, C, reducedOutMessage.serverMessage);
                                z = false;
                                i3 = i2 + 1;
                                length = i;
                                w3cVar3 = w3cVar2;
                            } else {
                                C = l020Var;
                                fw10Var = fw10Var2;
                            }
                        } catch (Throwable th) {
                            th = th;
                            C = l020Var;
                            Throwable th2 = th;
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                ooc.g(C, th2);
                                throw th3;
                            }
                        }
                    }
                    i = length;
                    i2 = i3;
                    w3cVar2 = w3cVar3;
                    i3 = i2 + 1;
                    length = i;
                    w3cVar3 = w3cVar2;
                }
                w3cVar = w3cVar3;
                C.s();
                C.close();
            } catch (Throwable th4) {
                th = th4;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            fw10Var.n.h(((Number) it.next()).longValue(), Long.valueOf(micros));
        }
        fw10Var.b(!z);
        x22 x22Var = fw10Var.h;
        w3cVar.getClass();
        x22Var.c("tech end reactions update request", "time_diff", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    @Override // defpackage.pmi0, defpackage.o5t0
    /* renamed from: f */
    public final HistoryRequest c(int i, int i2) {
        CommonRequestFields commonRequestFields = new CommonRequestFields(i2 > 0, i);
        HistoryRequest historyRequest = this.a;
        historyRequest.commonFields = commonRequestFields;
        return historyRequest;
    }
}
