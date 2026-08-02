package xsna;

import android.util.ArraySet;
import android.util.Pair;
import com.ironsource.X3;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.lp_events.ReactionsLpEventSubType;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgReaction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Triple;
import kotlin.collections.EmptyList;
import kotlin.random.Random;

/* compiled from: ReactionsLpTask.kt */
/* loaded from: classes2.dex */
public final class t5f0 extends e500 {
    public final w2w c;
    public final long d;
    public final int e;
    public final Integer f;
    public final boolean g;
    public final ArrayList h;
    public final ReactionsLpEventSubType i;
    public Msg j;
    public Integer k;

    /* compiled from: ReactionsLpTask.kt */
    public static final class a extends Exception {
    }

    public t5f0(w2w w2wVar, long j, int i, Integer num, boolean z, ArrayList arrayList, ReactionsLpEventSubType reactionsLpEventSubType) {
        super("ReactionsLpTask");
        this.c = w2wVar;
        this.d = j;
        this.e = i;
        this.f = num;
        this.g = z;
        this.h = arrayList;
        this.i = reactionsLpEventSubType;
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        List<MsgReaction> K;
        MsgReaction msgReaction;
        if (this.j != null) {
            return;
        }
        LinkedHashMap linkedHashMap = c400Var.h;
        long j = this.d;
        Map map = (Map) linkedHashMap.get(Long.valueOf(j));
        int i = this.e;
        Integer num = null;
        Msg msg = map != null ? (Msg) map.get(Integer.valueOf(i)) : null;
        ReactionsLpEventSubType reactionsLpEventSubType = this.i;
        if (msg == null) {
            if (!c400Var.o) {
                f400Var.d(i, j);
                return;
            }
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            StringBuilder a2 = eq0.a(i, "Missed message, dialogId=", ", cnvMsgId=", j);
            a2.append(", myReaction=");
            a2.append(this.f);
            a2.append(", myReactionChanged=");
            a2.append(this.g);
            a2.append(", subType=");
            a2.append(reactionsLpEventSubType.h());
            a2.append(", reactions=");
            a2.append(j5g.g0(this.h, ", ", X3.j.d, X3.j.e, 0, new jz30(10), 24));
            bVar.a(new a(a2.toString()));
            return;
        }
        this.j = msg;
        boolean z = msg.i;
        Msg msg2 = msg;
        if (z) {
            msg2 = null;
        }
        if (msg2 != null) {
            Object obj = msg2;
            if (reactionsLpEventSubType != ReactionsLpEventSubType.SOMEBODY_ADDED_REACTION) {
                obj = null;
            }
            if (obj != null) {
                aux0 aux0Var = obj instanceof aux0 ? (aux0) obj : null;
                if (aux0Var != null && (K = aux0Var.K()) != null && (msgReaction = (MsgReaction) j5g.x0(K, Random.b)) != null) {
                    num = Integer.valueOf(msgReaction.getId());
                }
            }
        }
        this.k = num;
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        Msg msg = this.j;
        if (msg != null) {
            z300Var.j(msg.b, this.d);
            Integer num = this.k;
            if (num != null) {
                int intValue = num.intValue();
                long j = this.d;
                int i = msg.b;
                if (z300Var.k == null) {
                    z300Var.k = new HashMap();
                }
                Collection collection = (Collection) z300Var.k.get(Long.valueOf(j));
                if (collection == null) {
                    collection = new ArraySet();
                    z300Var.k.put(Long.valueOf(j), collection);
                }
                collection.add(new Pair(Integer.valueOf(i), Integer.valueOf(intValue)));
                return;
            }
            long j2 = this.d;
            int i2 = this.e;
            Integer num2 = this.f;
            ArrayList arrayList = this.h;
            if (z300Var.l == null) {
                z300Var.l = new HashMap();
            }
            Collection collection2 = (Collection) z300Var.l.get(Long.valueOf(j2));
            if (collection2 == null) {
                collection2 = new ArraySet();
                z300Var.l.put(Long.valueOf(j2), collection2);
            }
            collection2.add(new Triple(Integer.valueOf(i2), num2, arrayList));
        }
    }

    @Override // xsna.e500
    public final void c() {
        Object obj;
        Msg t0 = this.c.I0().o().t0(this.e, this.d);
        if (t0 == null) {
            return;
        }
        this.j = t0;
        boolean z = t0.i;
        Integer num = null;
        Msg msg = t0;
        if (z) {
            msg = null;
        }
        if (msg != null) {
            Object obj2 = msg;
            if (this.i != ReactionsLpEventSubType.SOMEBODY_ADDED_REACTION) {
                obj2 = null;
            }
            if (obj2 != null) {
                aux0 aux0Var = obj2 instanceof aux0 ? (aux0) obj2 : null;
                List<MsgReaction> K = aux0Var != null ? aux0Var.K() : null;
                if (K == null) {
                    K = EmptyList.b;
                }
                Iterator it = this.h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    MsgReaction msgReaction = (MsgReaction) it.next();
                    Iterator<T> it2 = K.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it2.next();
                            if (((MsgReaction) obj).getId() == msgReaction.getId()) {
                                break;
                            }
                        }
                    }
                    MsgReaction msgReaction2 = (MsgReaction) obj;
                    if (msgReaction2 == null) {
                        num = Integer.valueOf(msgReaction.getId());
                        break;
                    } else if (msgReaction.getCount() > msgReaction2.getCount()) {
                        num = Integer.valueOf(msgReaction.getId());
                        break;
                    }
                }
            }
        }
        this.k = num;
    }

    @Override // xsna.e500
    public final void e(c400 c400Var) {
        Msg msg;
        if (this.j != null) {
            LinkedHashMap linkedHashMap = c400Var.h;
            long j = this.d;
            Map map = (Map) linkedHashMap.get(Long.valueOf(j));
            w2w w2wVar = this.c;
            int i = this.e;
            if (map != null && (msg = (Msg) map.get(Integer.valueOf(i))) != null) {
                long j2 = msg.c;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                new com.vk.im.engine.internal.merge.messages.b(Peer.a.b(j2), msg, false, false, 48).o(w2wVar);
            }
            if (this.g) {
                w2wVar.I0().o().d(j, i, this.f);
            }
            w2wVar.I0().o().c0(i, j, this.h);
        }
    }
}
