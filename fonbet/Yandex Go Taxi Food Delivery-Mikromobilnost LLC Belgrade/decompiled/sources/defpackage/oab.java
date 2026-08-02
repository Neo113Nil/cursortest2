package defpackage;

import android.os.Looper;
import com.yandex.messaging.analytics.msgsent.MessageSentReporter$Source;
import com.yandex.messaging.core.net.entities.proto.ChatHistoryResponse;
import com.yandex.messaging.core.net.entities.proto.ChatInfoFromTransport;
import com.yandex.messaging.core.net.entities.proto.ChatRole;
import com.yandex.messaging.core.net.entities.proto.PinnedMessageInfo;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.authorized.chat.notifications.a;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import com.yandex.messaging.internal.entities.MediaFileMessageData;
import com.yandex.messaging.internal.entities.Message;
import com.yandex.messaging.internal.entities.MessageTranslation;
import com.yandex.messaging.internal.entities.RemovedMessageData;
import com.yandex.messaging.internal.storage.MessagesRange$LoadingType;
import com.yandex.messaging.internal.translator.j;
import defpackage.iaz0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes15.dex */
public final class oab implements qb7 {
    public final qeb A;
    public final rln B;
    public final b5b C;
    public final w2c0 D;
    public final apq0 E;
    public final vv10 F;
    public final lbb G;
    public final ebb H;
    public final dbb I;
    public final m5b0 J;
    public final ks10 K;
    public final j L;
    public final kk60 M;
    public final x22 N;
    public final HashMap O = new HashMap();
    public final zq60 P = new zq60();
    public final a Q;
    public final ml21 a;
    public final o1b0 b;
    public final Looper c;
    public final k020 w;
    public final vcz0 x;
    public final et10 y;
    public final xy10 z;

    public oab(ml21 ml21Var, o1b0 o1b0Var, Looper looper, k020 k020Var, vcz0 vcz0Var, et10 et10Var, xy10 xy10Var, qeb qebVar, rln rlnVar, b5b b5bVar, w2c0 w2c0Var, apq0 apq0Var, vv10 vv10Var, h3y h3yVar, sb7 sb7Var, lbb lbbVar, ebb ebbVar, dbb dbbVar, m5b0 m5b0Var, cbb cbbVar, ks10 ks10Var, j jVar, kk60 kk60Var, x22 x22Var) {
        this.a = ml21Var;
        this.b = o1b0Var;
        this.c = looper;
        this.w = k020Var;
        this.x = vcz0Var;
        this.y = et10Var;
        this.z = xy10Var;
        this.A = qebVar;
        this.B = rlnVar;
        this.C = b5bVar;
        this.D = w2c0Var;
        this.E = apq0Var;
        this.F = vv10Var;
        this.G = lbbVar;
        this.H = ebbVar;
        this.I = dbbVar;
        this.J = m5b0Var;
        this.K = ks10Var;
        this.L = jVar;
        this.M = kk60Var;
        this.N = x22Var;
        this.Q = (a) h3yVar.get();
        z83.g(null, looper, Looper.myLooper());
        sb7Var.a(this);
        cbbVar.k = new e48(23, this);
    }

    public final void b(Message message) {
        apq0 apq0Var = this.E;
        o1b0 o1b0Var = this.b;
        z83.g(null, this.c, Looper.myLooper());
        MessageTranslation messageTranslation = message.q;
        if (messageTranslation != null) {
            this.L.a(messageTranslation);
        }
        k020 k020Var = this.w;
        l020 C = k020Var.C();
        try {
            long b0 = C.b0(o1b0Var, message, false);
            String str = o1b0Var.b;
            if (jl40.l(message.g, this.a.a) || jl40.l(message.g, k020Var.k(o1b0Var.a).s)) {
                C.O0(o1b0Var.a, message.b, message.d);
            }
            zoq0 n = apq0Var.b.n(b0);
            if (n != null) {
                vv10 vv10Var = this.F;
                String str2 = "thread";
                if (!ChatId.Companion.f(str)) {
                    if (o1b0Var.e) {
                        str2 = "saved messages";
                    } else if (o1b0Var.f) {
                        str2 = "bot";
                    } else if (o1b0Var.d) {
                        str2 = "personal";
                    } else if (!ChatId.Companion.f(str)) {
                        str2 = ChatNamespaces.b(str) ? "channel" : "group";
                    }
                }
                vv10Var.a(n, str2, o1b0Var.m, MessageSentReporter$Source.MIRROR);
                ((LinkedHashMap) apq0Var.b.c).remove(Long.valueOf(b0));
            }
            if (this.z.a) {
                boolean z = ChatId.Companion.a(message.a) instanceof ChatId.ThreadId;
                long j = message.b;
                if (z) {
                    C.k(j);
                } else {
                    C.e(j);
                }
            }
            C.s();
            C.close();
        } finally {
        }
    }

    @Override // defpackage.qb7
    public final void d(long j) {
        z83.g(null, this.c, Looper.myLooper());
        if (j != this.b.a) {
            return;
        }
        if (ydz.a.a()) {
            ydz.a();
        }
        this.M.a.getClass();
        this.Q.b(new jk60(null, false));
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, lab] */
    public final void f(Message message) {
        String str = message.a;
        if (!message.w || message.c <= 0 || (message.h instanceof RemovedMessageData)) {
            b(message);
            return;
        }
        ServerMessageRef serverMessageRef = new ServerMessageRef(str, message.c);
        Pair pair = new Pair("prevTimestamp", Long.valueOf(message.c));
        Pair pair2 = new Pair("chatId", str);
        String str2 = message.f;
        if (str2 == null) {
            str2 = "";
        }
        LinkedHashMap l = b.l(pair, pair2, new Pair("payload", str2));
        if (this.w.h(serverMessageRef)) {
            l.put("real message loaded", Boolean.TRUE);
            b(message);
        } else {
            l.put("real message loaded", Boolean.FALSE);
            p1b p1bVar = new p1b(this, message);
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = m(new tis0(6, ref$ObjectRef, p1bVar), serverMessageRef);
        }
        this.N.reportEvent("tech_ephemeral_handle", l);
    }

    public final long g(Message[] messageArr) {
        z83.h(null, !(messageArr.length == 0));
        l020 C = this.w.C();
        try {
            long j = -1;
            for (Message message : messageArr) {
                C.b0(this.b, message, true);
                long j2 = message.j;
                if (j < j2) {
                    j = j2;
                }
            }
            C.s();
            C.close();
            return j;
        } finally {
        }
    }

    public final void h(ChatHistoryResponse chatHistoryResponse) {
        ArrayList arrayList;
        dbb dbbVar = this.I;
        dbbVar.a.b(dbbVar.b.uniqueRequestId(), true);
        ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse.messages;
        if (outMessageArr != null) {
            arrayList = new ArrayList();
            for (ChatHistoryResponse.OutMessage outMessage : outMessageArr) {
                Message b = this.K.b(outMessage.serverMessage);
                if (b != null) {
                    arrayList.add(b);
                }
            }
        } else {
            arrayList = null;
        }
        l020 C = this.w.C();
        o1b0 o1b0Var = this.b;
        if (arrayList != null) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C.b0(o1b0Var, (Message) it.next(), true);
                }
            } finally {
            }
        }
        ChatInfoFromTransport chatInfoFromTransport = chatHistoryResponse.chatInfo;
        if (chatInfoFromTransport != null) {
            C.n0(o1b0Var.a, chatInfoFromTransport.participantsCount);
        }
        ChatRole chatRole = chatHistoryResponse.myRole;
        if (chatRole != null) {
            C.A.c(o1b0Var.b, o1b0Var.a, chatRole.rights, chatRole.role, chatRole.version, false);
        }
        C.s();
        C.close();
    }

    public final void i(ChatHistoryResponse chatHistoryResponse) {
        z83.g(null, this.c, Looper.myLooper());
        l020 C = this.w.C();
        try {
            j(C, chatHistoryResponse, false);
            C.s();
            C.close();
        } finally {
        }
    }

    public final void j(l020 l020Var, ChatHistoryResponse chatHistoryResponse, boolean z) {
        o1b0 o1b0Var;
        long j;
        Long l;
        Message b;
        ChatHistoryResponse.OutMessage[] outMessageArr = chatHistoryResponse.messages;
        ks10 ks10Var = this.K;
        Message[] g = ks10Var.g(outMessageArr);
        long j2 = chatHistoryResponse.minMessageTimestamp;
        Long valueOf = Long.valueOf(j2);
        if (j2 <= 0) {
            valueOf = null;
        }
        o1b0 o1b0Var2 = this.b;
        if (valueOf != null) {
            l020Var.a(o1b0Var2.a, valueOf.longValue());
        }
        long j3 = o1b0Var2.a;
        long j4 = o1b0Var2.a;
        long j5 = chatHistoryResponse.ownerSeenMarker;
        long j6 = chatHistoryResponse.ownerLastSeenSequenceNumber;
        Long l2 = chatHistoryResponse.lastSeenByMeVersion;
        if (l2 != null) {
            o1b0Var = o1b0Var2;
            j = l2.longValue();
        } else {
            o1b0Var = o1b0Var2;
            j = 0;
        }
        l020Var.L0(j3, j5, j6, j);
        l020Var.k0(j4, chatHistoryResponse.otherSeenMarker);
        if (g != null) {
            for (Message message : g) {
                if (message != null) {
                    l020Var.b0(o1b0Var, message, true);
                    MessageTranslation messageTranslation = message.q;
                    if (messageTranslation != null) {
                        this.L.a(messageTranslation);
                    }
                }
            }
        }
        ServerMessage serverMessage = chatHistoryResponse.threadParentMessage;
        if (serverMessage != null && (b = ks10Var.b(serverMessage)) != null) {
            p2b p2bVar = (p2b) androidx.room.util.a.b(l020Var.H.a, true, false, new hcb(l020Var.B.g(b.a, ""), 11));
            if (p2bVar != null) {
                l020Var.b0(ci91.g(p2bVar), b, false);
            }
        }
        if (g == null || g.length == 0) {
            l = null;
        } else {
            Message message2 = g[0];
            Long valueOf2 = Long.valueOf(message2 != null ? message2.b : 0L);
            int length = g.length - 1;
            if (1 <= length) {
                int i = 1;
                while (true) {
                    Message message3 = g[i];
                    Long valueOf3 = Long.valueOf(message3 != null ? message3.b : 0L);
                    if (valueOf2.compareTo(valueOf3) < 0) {
                        valueOf2 = valueOf3;
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            l = valueOf2;
        }
        if (l != null && z) {
            l020Var.a0(j4, l.longValue());
        }
        long j7 = chatHistoryResponse.lastEditTimestamp;
        rln rlnVar = this.B;
        at2 at2Var = rlnVar.d;
        ikw0 startTransaction = at2Var.startTransaction();
        try {
            long j8 = rlnVar.a.a.a;
            Long l3 = (Long) androidx.room.util.a.b(at2Var.w().a, true, false, new cs0(j8, 16));
            if (l3 == null) {
                k2b w = at2Var.w();
                ((Number) androidx.room.util.a.b(w.a, false, true, new cs8(24, w, new l2b(j8, j7, j7)))).longValue();
            } else if (j7 > l3.longValue()) {
                startTransaction.a(rlnVar);
                ((Number) androidx.room.util.a.b(at2Var.w().a, false, true, new j2b(1, j7, j8))).intValue();
            }
            startTransaction.s();
            startTransaction.close();
            PinnedMessageInfo pinnedMessageInfo = chatHistoryResponse.pinnedMessageInfo;
            if (pinnedMessageInfo != null) {
                this.D.a(pinnedMessageInfo.timestamp, pinnedMessageInfo.lastActionTs);
            }
            ChatInfoFromTransport chatInfoFromTransport = chatHistoryResponse.chatInfo;
            if (chatInfoFromTransport != null) {
                l020Var.n0(j4, chatInfoFromTransport.participantsCount);
            }
            ChatRole chatRole = chatHistoryResponse.myRole;
            if (chatRole != null) {
                l020Var.A.c(o1b0Var.b, o1b0Var.a, chatRole.rights, chatRole.role, chatRole.version, false);
                long j9 = chatRole.version;
                if (this.A.a) {
                    l020Var.n(j9);
                }
            }
            l020Var.B(o1b0Var.b, chatHistoryResponse.approvedByMe);
        } finally {
        }
    }

    public final lab l(kab kabVar) {
        z83.g(null, this.c, Looper.myLooper());
        r3z a = this.x.a();
        if (a != null) {
            kabVar.v(a);
        }
        return new lab(this, null, new a7b(5, this, kabVar));
    }

    public final lab m(kab kabVar, ServerMessageRef serverMessageRef) {
        r3z c;
        bbb bbbVar = null;
        z83.g(null, this.c, Looper.myLooper());
        lbb lbbVar = this.G;
        if (lbbVar.b.c(serverMessageRef) == null) {
            cbb cbbVar = lbbVar.a;
            long timestamp = serverMessageRef.getTimestamp();
            bbbVar = cbbVar.a(new ry10(timestamp, timestamp, MessagesRange$LoadingType.FromNewest));
        }
        if (bbbVar == null && (c = this.x.c(serverMessageRef)) != null) {
            kabVar.v(c);
        }
        return new lab(this, bbbVar, new f89(5, this, serverMessageRef, kabVar));
    }

    @Override // defpackage.qb7
    public final void n(long j, Collection collection) {
        boolean z;
        o1b0 o1b0Var = this.b;
        Long l = o1b0Var.i;
        if (l == null || j != l.longValue() || !kotlin.collections.a.G(collection, o1b0Var.j)) {
            return;
        }
        iaz0 iaz0Var = new iaz0();
        iaz0Var.a(new iaz0.a());
        zq60 zq60Var = this.P;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z2 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((jab) arrayList.get(i)).c(iaz0Var);
                i++;
            }
        }
    }

    public final void o(long j, MediaFileMessageData mediaFileMessageData) {
        String str = mediaFileMessageData.fileId;
        if (str == null) {
            return;
        }
        l020 C = this.w.C();
        try {
            long j2 = this.b.a;
            ph9 ph9Var = C.z;
            ndz0 ndz0Var = C.D;
            Boolean bool = (Boolean) skb1.a(alb1.i(ndz0Var.c, ndz0Var.h, j2, j), new ec1(str, ndz0Var, j2, 12));
            if (bool != null ? bool.booleanValue() : false) {
                ph9Var.a(j2);
                ph9Var.e(j2, j);
            }
            C.s();
            C.close();
        } finally {
        }
    }

    @Override // defpackage.qb7
    public final void w(long j, baz0 baz0Var, boolean z) {
        boolean z2;
        z83.g(null, this.c, Looper.myLooper());
        if (j != this.b.a) {
            return;
        }
        iaz0 iaz0Var = baz0Var != null ? baz0Var.a : null;
        zq60 zq60Var = this.P;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z3 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z2 = true;
            } else {
                if (!z3) {
                    zq60.a(zq60Var);
                    z3 = true;
                }
                z2 = false;
            }
            if (!z2) {
                if (z) {
                    return;
                }
                this.M.a.getClass();
                this.Q.l(new jk60(null, false));
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z3) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            }
            ((jab) arrayList.get(i)).c(iaz0Var);
            i++;
        }
    }
}
