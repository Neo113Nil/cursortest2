package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.internal.merge.messages.MessagesMergerInput;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.reporters.api.msg.MessagesEmptyHistoryMergeReporter;
import com.vk.im.reporters.api.msg.MessagesHistoryMergeReporter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CnvServerMessagesToCacheMerger.kt */
/* loaded from: classes2.dex */
public final class iyf {
    public final xgl0 a;
    public final b2a0 b;
    public final mf20 c;
    public final lf20 d;
    public final bu90 e;
    public final izs<MessagesMergerInput, MessagesEmptyHistoryMergeReporter> f;
    public final izs<MessagesMergerInput, MessagesHistoryMergeReporter> g;
    public final wzs<xgl0, MessagesMergerInput, Boolean> h;

    public iyf(xgl0 xgl0Var, b2a0 b2a0Var, mf20 mf20Var, lf20 lf20Var, bu90 bu90Var, wwf0 wwf0Var, izs izsVar, izs izsVar2, wzs wzsVar) {
        this.a = xgl0Var;
        this.b = b2a0Var;
        this.c = mf20Var;
        this.d = lf20Var;
        this.e = bu90Var;
        this.f = izsVar;
        this.g = izsVar2;
        this.h = wzsVar;
    }

    public final List<Msg> a(final MessagesMergerInput messagesMergerInput) {
        int i = messagesMergerInput.b;
        List<Msg> list = messagesMergerInput.c;
        Peer peer = messagesMergerInput.a;
        if (peer.d <= 0) {
            throw new IllegalArgumentException(yq.b(peer, "Illegal peer value: "));
        }
        if (i < 0) {
            throw new IllegalArgumentException(lhg.a(i, "Illegal anchorMsgCnvId value: "));
        }
        List<Msg> list2 = list;
        boolean z = list2 instanceof Collection;
        if (!z || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (((Msg) it.next()).H6()) {
                    throw new IllegalArgumentException(go9.c("Illegal msgList value (contains local messages): ", list));
                }
            }
        }
        if (!z || !list2.isEmpty()) {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((Msg) it2.next()).c != peer.b) {
                    throw new IllegalArgumentException(go9.c("Illegal msgList value (contains messages from different channels): ", list));
                }
            }
        }
        boolean isEmpty = list.isEmpty();
        xgl0 xgl0Var = this.a;
        if (isEmpty) {
            final MessagesEmptyHistoryMergeReporter invoke = this.f.invoke(messagesMergerInput);
            final mdz mdzVar = new mdz(0L, MessagesEmptyHistoryMergeReporter.Span.ROOT, null);
            invoke.c(mdzVar);
            final Peer peer2 = messagesMergerInput.a;
            final int i2 = messagesMergerInput.b;
            final boolean z2 = messagesMergerInput.d;
            final boolean z3 = messagesMergerInput.e;
            xgl0Var.u(new izs() { // from class: xsna.gyf
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    gkx0 gkx0Var;
                    iyf iyfVar = iyf.this;
                    b2a0 b2a0Var = iyfVar.b;
                    bu90 bu90Var = iyfVar.e;
                    int a = b2a0Var.a();
                    MessagesEmptyHistoryMergeReporter.Span span = MessagesEmptyHistoryMergeReporter.Span.FINDING_NEAREST_MESSAGES;
                    mdz mdzVar2 = mdzVar;
                    mdz a2 = mdzVar2.a(span);
                    MessagesEmptyHistoryMergeReporter messagesEmptyHistoryMergeReporter = invoke;
                    messagesEmptyHistoryMergeReporter.c(a2);
                    mf20 mf20Var = iyfVar.c;
                    int i3 = i2;
                    Peer peer3 = peer2;
                    lj30 y = mf20Var.y(i3, peer3);
                    uz50 C0 = mf20Var.C0(i3, peer3);
                    messagesEmptyHistoryMergeReporter.f(a2, null);
                    boolean z4 = z2;
                    gkx0 gkx0Var2 = gkx0.e;
                    gkx0 gkx0Var3 = gkx0.d;
                    if (z4) {
                        mdz a3 = mdzVar2.a(MessagesEmptyHistoryMergeReporter.Span.TRIMMING_HISTORY_BEFORE);
                        messagesEmptyHistoryMergeReporter.c(a3);
                        if (y != null) {
                            gkx0Var = y.h;
                        } else {
                            lj30 lj30Var = (lj30) C0.b;
                            gkx0Var = lj30Var != null ? lj30Var.h : gkx0Var2;
                        }
                        iyfVar.c(peer3, gkx0Var3, gkx0Var);
                        iyfVar.b(1, i3, peer3);
                        s3q0 s3q0Var = s3q0.a;
                        messagesEmptyHistoryMergeReporter.f(a3, null);
                    }
                    boolean z5 = z3;
                    if (z5) {
                        mdz a4 = mdzVar2.a(MessagesEmptyHistoryMergeReporter.Span.TRIMMING_HISTORY_AFTER);
                        messagesEmptyHistoryMergeReporter.c(a4);
                        if (y != null || (y = (lj30) C0.a) != null) {
                            gkx0Var3 = y.h;
                        }
                        iyfVar.c(peer3, gkx0Var3, gkx0Var2);
                        iyfVar.b(i3, Integer.MAX_VALUE, peer3);
                        s3q0 s3q0Var2 = s3q0.a;
                        messagesEmptyHistoryMergeReporter.f(a4, null);
                    }
                    mdz a5 = mdzVar2.a(MessagesEmptyHistoryMergeReporter.Span.SAVING_PEER_IS_EMPTY);
                    messagesEmptyHistoryMergeReporter.c(a5);
                    mf20Var.g0(a, peer3, z4 && z5);
                    s3q0 s3q0Var3 = s3q0.a;
                    messagesEmptyHistoryMergeReporter.f(a5, null);
                    mdz a6 = mdzVar2.a(MessagesEmptyHistoryMergeReporter.Span.UPDATING_PEER);
                    messagesEmptyHistoryMergeReporter.c(a6);
                    bu90Var.a(peer3);
                    messagesEmptyHistoryMergeReporter.f(a6, null);
                    messagesEmptyHistoryMergeReporter.f(mdzVar2, null);
                    return s3q0.a;
                }
            });
            return EmptyList.b;
        }
        final MessagesHistoryMergeReporter invoke2 = this.g.invoke(messagesMergerInput);
        final mdz mdzVar2 = new mdz(0L, MessagesHistoryMergeReporter.Span.ROOT, null);
        invoke2.c(mdzVar2);
        final Peer peer3 = messagesMergerInput.a;
        final boolean z4 = messagesMergerInput.d;
        final boolean z5 = messagesMergerInput.e;
        final Boolean bool = messagesMergerInput.f;
        final Boolean bool2 = messagesMergerInput.g;
        final List D0 = j5g.D0(new hyf(), list);
        return (List) xgl0Var.u(new izs() { // from class: xsna.fyf
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                List<Msg> d;
                Peer peer4;
                List<Msg> b;
                int i3;
                Object obj2;
                ArrayList c;
                iyf iyfVar = iyf.this;
                wzs<xgl0, MessagesMergerInput, Boolean> wzsVar = iyfVar.h;
                bu90 bu90Var = iyfVar.e;
                mf20 mf20Var = iyfVar.c;
                lf20 lf20Var = iyfVar.d;
                if (wzsVar.invoke(iyfVar.a, messagesMergerInput).booleanValue()) {
                    return EmptyList.b;
                }
                int a = iyfVar.b.a();
                MessagesHistoryMergeReporter.Span span = MessagesHistoryMergeReporter.Span.MESSAGES_PROCESSING;
                mdz mdzVar3 = mdzVar2;
                mdz a2 = mdzVar3.a(span);
                MessagesHistoryMergeReporter messagesHistoryMergeReporter = invoke2;
                Peer peer5 = peer3;
                List list3 = D0;
                if (messagesHistoryMergeReporter != null) {
                    messagesHistoryMergeReporter.c(a2);
                    d = lf20Var.d(lf20Var.a(peer5, list3, a, false));
                    messagesHistoryMergeReporter.f(a2, null);
                } else {
                    d = lf20Var.d(lf20Var.a(peer5, list3, a, false));
                }
                mdz a3 = mdzVar3.a(MessagesHistoryMergeReporter.Span.SPACES_CALCULATING);
                boolean z6 = z4;
                boolean z7 = z5;
                List<Msg> list4 = d;
                Boolean bool3 = bool;
                Boolean bool4 = bool2;
                if (messagesHistoryMergeReporter != null) {
                    messagesHistoryMergeReporter.c(a3);
                    peer4 = peer5;
                    b = lf20Var.b(peer4, list4, bool3, bool4, z6, z7);
                    messagesHistoryMergeReporter.f(a3, null);
                } else {
                    peer4 = peer5;
                    b = lf20Var.b(peer4, list4, bool3, bool4, z6, z7);
                }
                gkx0 gkx0Var = ((Msg) j5g.Y(b)).p;
                gkx0 gkx0Var2 = ((Msg) j5g.i0(b)).p;
                int i4 = ((Msg) j5g.Y(b)).d;
                int i5 = ((Msg) j5g.i0(b)).d;
                if (b.size() > 1) {
                    mdz a4 = mdzVar3.a(MessagesHistoryMergeReporter.Span.RESETTING_CHUNK_IN_CACHE);
                    if (messagesHistoryMergeReporter != null) {
                        messagesHistoryMergeReporter.c(a4);
                        iyfVar.c(peer4, gkx0Var, gkx0Var2);
                        iyfVar.b(i4, i5, peer4);
                        s3q0 s3q0Var = s3q0.a;
                        i3 = 1;
                        messagesHistoryMergeReporter.f(a4, null);
                    } else {
                        i3 = 1;
                        iyfVar.c(peer4, gkx0Var, gkx0Var2);
                        iyfVar.b(i4, i5, peer4);
                    }
                } else {
                    i3 = 1;
                }
                if (z6) {
                    mdz a5 = mdzVar3.a(MessagesHistoryMergeReporter.Span.TRIMMING_HISTORY_BEFORE);
                    gkx0 gkx0Var3 = gkx0.d;
                    if (messagesHistoryMergeReporter != null) {
                        messagesHistoryMergeReporter.c(a5);
                        iyfVar.c(peer4, gkx0Var3, gkx0Var);
                        iyfVar.b(i3, i4 - 1, peer4);
                        s3q0 s3q0Var2 = s3q0.a;
                        messagesHistoryMergeReporter.f(a5, null);
                    } else {
                        int i6 = i3;
                        iyfVar.c(peer4, gkx0Var3, gkx0Var);
                        iyfVar.b(i6, i4 - i6, peer4);
                    }
                }
                if (z7) {
                    mdz a6 = mdzVar3.a(MessagesHistoryMergeReporter.Span.TRIMMING_HISTORY_AFTER);
                    gkx0 gkx0Var4 = gkx0.e;
                    if (messagesHistoryMergeReporter != null) {
                        messagesHistoryMergeReporter.c(a6);
                        iyfVar.c(peer4, gkx0Var2, gkx0Var4);
                        iyfVar.b(i5 + 1, Integer.MAX_VALUE, peer4);
                        s3q0 s3q0Var3 = s3q0.a;
                        messagesHistoryMergeReporter.f(a6, null);
                    } else {
                        iyfVar.c(peer4, gkx0Var2, gkx0Var4);
                        iyfVar.b(i5 + 1, Integer.MAX_VALUE, peer4);
                    }
                }
                mdz a7 = mdzVar3.a(MessagesHistoryMergeReporter.Span.CROSS_LINKING_WITH_EDGE_CACHED_MESSAGES);
                if (messagesHistoryMergeReporter != null) {
                    messagesHistoryMergeReporter.c(a7);
                    c = lf20Var.c(peer4, b);
                    obj2 = null;
                    messagesHistoryMergeReporter.f(a7, null);
                } else {
                    obj2 = null;
                    c = lf20Var.c(peer4, b);
                }
                mdz a8 = mdzVar3.a(MessagesHistoryMergeReporter.Span.SAVING_MESSAGES_HISTORY);
                if (messagesHistoryMergeReporter != null) {
                    messagesHistoryMergeReporter.c(a8);
                    mf20Var.H0(c);
                    s3q0 s3q0Var4 = s3q0.a;
                    messagesHistoryMergeReporter.f(a8, obj2);
                } else {
                    mf20Var.H0(c);
                }
                mdz a9 = mdzVar3.a(MessagesHistoryMergeReporter.Span.SAVING_PEER_IS_EMPTY);
                if (messagesHistoryMergeReporter != null) {
                    messagesHistoryMergeReporter.c(a9);
                    mf20Var.g0(a, peer4, false);
                    s3q0 s3q0Var5 = s3q0.a;
                    messagesHistoryMergeReporter.f(a9, obj2);
                } else {
                    mf20Var.g0(a, peer4, false);
                }
                mdz a10 = mdzVar3.a(MessagesHistoryMergeReporter.Span.UPDATING_PEER);
                if (messagesHistoryMergeReporter != null) {
                    messagesHistoryMergeReporter.c(a10);
                    bu90Var.a(peer4);
                    s3q0 s3q0Var6 = s3q0.a;
                    messagesHistoryMergeReporter.f(a10, obj2);
                } else {
                    bu90Var.a(peer4);
                }
                int e = on00.e(c5g.u(c, 10));
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (Object obj3 : c) {
                    linkedHashMap.put(Integer.valueOf(((Msg) obj3).d), obj3);
                }
                List<Msg> list5 = b;
                ArrayList arrayList = new ArrayList(c5g.u(list5, 10));
                for (Msg msg : list5) {
                    Msg msg2 = (Msg) linkedHashMap.get(Integer.valueOf(msg.d));
                    if (msg2 != null) {
                        msg = msg2;
                    }
                    arrayList.add(msg);
                }
                messagesHistoryMergeReporter.f(mdzVar3, null);
                return arrayList;
            }
        });
    }

    public final void b(int i, int i2, Peer peer) {
        this.c.B0(i, i2, peer);
    }

    public final void c(Peer peer, gkx0 gkx0Var, gkx0 gkx0Var2) {
        this.c.J0(peer, gkx0Var, gkx0Var2, 0);
    }
}
