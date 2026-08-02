package xsna;

import android.util.ArraySet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: CnvMsgAddBatchLpTask.kt */
/* loaded from: classes2.dex */
public final class hxf extends e500 {
    public final w2w c;
    public final fxf d;
    public final long e;
    public final SparseArray<? extends Msg> f;
    public final SparseIntArray g;
    public final SparseBooleanArray h;
    public final SparseBooleanArray i;
    public final Integer j;
    public List<? extends Msg> k;
    public SparseBooleanArray l;
    public boolean m;

    public hxf(w2w w2wVar, fxf fxfVar) {
        super("CnvMsgAddBatchLpTask");
        this.c = w2wVar;
        this.d = fxfVar;
        this.e = fxfVar.a.b;
        this.f = fxfVar.b;
        this.g = fxfVar.c;
        this.h = fxfVar.d;
        this.i = fxfVar.e;
        this.j = fxfVar.f;
        this.k = EmptyList.b;
        this.l = new SparseBooleanArray();
    }

    @Override // xsna.e500
    public final void a(c400 c400Var, f400 f400Var) {
        Peer from;
        Peer H0;
        LinkedHashMap linkedHashMap = c400Var.h;
        LinkedHashMap linkedHashMap2 = c400Var.d;
        final long j = this.e;
        boolean containsKey = linkedHashMap2.containsKey(Long.valueOf(j));
        w2w w2wVar = this.c;
        boolean z = true;
        p4g.a(Long.valueOf(j), f400Var.c, !(containsKey || ((Boolean) w2wVar.I0().c(new izs() { // from class: xsna.gxf
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                xgl0 xgl0Var = (xgl0) obj;
                int d = xgl0Var.system().d();
                hpm e = xgl0Var.b().e();
                long j2 = j;
                Integer S = e.S(j2);
                return Boolean.valueOf(S != null && S.intValue() == d && xgl0Var.b().e().K(Collections.singletonList(Long.valueOf(j2))).isEmpty());
            }
        })).booleanValue()));
        qs20 qs20Var = new qs20(w2wVar);
        SparseArray<? extends Msg> sparseArray = this.f;
        int size = sparseArray.size();
        int i = 0;
        while (i < size) {
            int keyAt = sparseArray.keyAt(i);
            vsx0 vsx0Var = (Msg) sparseArray.valueAt(i);
            boolean z2 = vsx0Var != null ? z : false;
            Map map = (Map) linkedHashMap.get(Long.valueOf(j));
            boolean containsKey2 = map != null ? map.containsKey(Integer.valueOf(keyAt)) : false;
            if (!z2 && !containsKey2) {
                f400Var.d(keyAt, j);
            }
            ltx0 ltx0Var = vsx0Var instanceof ltx0 ? (ltx0) vsx0Var : null;
            if (ltx0Var != null && (H0 = ltx0Var.H0()) != null) {
                qs20Var.a(H0, c400Var, f400Var);
            }
            if (vsx0Var != null && (from = vsx0Var.getFrom()) != null) {
                qs20Var.a(from, c400Var, f400Var);
            }
            i++;
            z = true;
        }
        d040 o = w2wVar.I0().o();
        SparseIntArray sparseIntArray = this.g;
        int size2 = sparseIntArray.size();
        for (int i2 = 0; i2 < size2; i2++) {
            int keyAt2 = sparseIntArray.keyAt(i2);
            boolean y0 = o.y0(sparseIntArray.valueAt(i2), j);
            Map map2 = (Map) linkedHashMap.get(Long.valueOf(j));
            boolean containsKey3 = map2 != null ? map2.containsKey(Integer.valueOf(keyAt2)) : false;
            if (!y0 && !containsKey3) {
                f400Var.d(keyAt2, j);
            }
        }
    }

    @Override // xsna.e500
    public final void b(z300 z300Var) {
        for (Msg msg : this.k) {
            long j = msg.getFrom().b;
            long j2 = this.e;
            HashMap hashMap = z300Var.w;
            Set set = (Set) z300Var.q.get(Long.valueOf(j2));
            if (set != null) {
                set.remove(Long.valueOf(j));
            }
            Set set2 = (Set) hashMap.get(Long.valueOf(j2));
            if (set2 == null) {
                set2 = new ArraySet();
                hashMap.put(Long.valueOf(j2), set2);
            }
            set2.add(Long.valueOf(j));
            if (this.l.get(msg.d)) {
                z300Var.j(msg.b, this.e);
            } else {
                long j3 = this.e;
                int i = msg.b;
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(i));
                if (z300Var.h == null) {
                    z300Var.h = new HashMap();
                }
                Collection collection = (Collection) z300Var.h.get(Long.valueOf(j3));
                if (collection == null) {
                    collection = new ArraySet();
                    z300Var.h.put(Long.valueOf(j3), collection);
                }
                collection.addAll(arrayList);
                if (this.h.get(msg.d)) {
                    int i2 = msg.b;
                    if (z300Var.m == null) {
                        z300Var.m = new ArraySet();
                    }
                    z300Var.m.add(Integer.valueOf(i2));
                }
            }
            if ((msg instanceof MsgFromUser) && com.vk.im.engine.models.messages.a.Q7((MsgFromUser) msg, new ygm0(13), false) != null) {
                z300Var.x = Boolean.TRUE;
            }
        }
        z300Var.g(this.e);
        if (this.m) {
            z300Var.D = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0072, code lost:
    
        if (r6 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.vk.im.engine.models.messages.Msg] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // xsna.e500
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(c400 c400Var) {
        long j;
        List<? extends Msg> list;
        int i;
        int i2;
        boolean z;
        int i3;
        Integer valueOf;
        Integer valueOf2;
        d040 o;
        Integer c;
        Msg t0;
        ?? r6;
        long j2;
        LinkedHashMap linkedHashMap = c400Var.h;
        SparseArray sparseArray = new SparseArray();
        SparseArray<? extends Msg> sparseArray2 = this.f;
        int size = sparseArray2.size();
        int i4 = 0;
        while (true) {
            j = this.e;
            if (i4 >= size) {
                break;
            }
            int keyAt = sparseArray2.keyAt(i4);
            Msg valueAt = sparseArray2.valueAt(i4);
            if (valueAt == null) {
                Map map = (Map) linkedHashMap.get(Long.valueOf(j));
                valueAt = map != null ? (Msg) map.get(Integer.valueOf(keyAt)) : null;
            }
            sparseArray.put(keyAt, valueAt);
            i4++;
        }
        w2w w2wVar = this.c;
        d040 o2 = w2wVar.I0().o();
        SparseIntArray sparseIntArray = this.g;
        int size2 = sparseIntArray.size();
        int i5 = 0;
        while (i5 < size2) {
            int keyAt2 = sparseIntArray.keyAt(i5);
            int valueAt2 = sparseIntArray.valueAt(i5);
            Map map2 = (Map) linkedHashMap.get(Long.valueOf(j));
            if (map2 != null) {
                Msg msg = (Msg) map2.get(Integer.valueOf(keyAt2));
                r6 = msg;
            }
            r6 = (Msg) sparseArray.get(keyAt2);
            boolean z2 = r6 instanceof com.vk.im.engine.models.messages.a;
            r6 = r6;
            if (z2) {
                com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) r6;
                j2 = j;
                Msg t02 = o2.t0(valueAt2, r6.c);
                if (t02 != null) {
                    aVar.q7().add(new NestedMsg(t02, NestedMsg.Type.REPLY));
                }
                sparseArray.put(keyAt2, r6);
                i5++;
                j = j2;
            }
            j2 = j;
            sparseArray.put(keyAt2, r6);
            i5++;
            j = j2;
        }
        long j3 = j;
        ArrayList g = zik0.g(sparseArray);
        Integer num = (Integer) j5g.o0(zik0.d(sparseArray));
        if (num != null) {
            int intValue = num.intValue();
            d040 o3 = w2wVar.I0().o();
            ArrayList arrayList = new ArrayList(c5g.u(g, 10));
            Iterator it = g.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((Msg) it.next()).d));
            }
            this.l = o3.s(j3, arrayList);
            Integer num2 = this.j;
            fxf fxfVar = this.d;
            if (num2 != null) {
                Iterator it2 = g.iterator();
                if (it2.hasNext()) {
                    valueOf = Integer.valueOf(((Msg) it2.next()).d);
                    while (it2.hasNext()) {
                        Integer valueOf3 = Integer.valueOf(((Msg) it2.next()).d);
                        if (valueOf.compareTo(valueOf3) > 0) {
                            valueOf = valueOf3;
                        }
                    }
                } else {
                    valueOf = null;
                }
                boolean z3 = valueOf == null || w2wVar.I0().o().t0(valueOf.intValue() - 1, j3) == null;
                if (z3 && (c = (o = w2wVar.I0().o()).c(j3)) != null && (t0 = o.t0(c.intValue(), j3)) != null && !t0.r) {
                    t0.r = true;
                    o.m(t0);
                }
                if (g.isEmpty()) {
                    list = EmptyList.b;
                } else {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    Peer b = Peer.a.b(j3);
                    Iterator it3 = g.iterator();
                    if (it3.hasNext()) {
                        valueOf2 = Integer.valueOf(((Msg) it3.next()).d);
                        while (it3.hasNext()) {
                            Integer valueOf4 = Integer.valueOf(((Msg) it3.next()).d);
                            if (valueOf2.compareTo(valueOf4) > 0) {
                                valueOf2 = valueOf4;
                            }
                        }
                    } else {
                        valueOf2 = null;
                    }
                    list = (List) new com.vk.im.engine.internal.merge.messages.b(b, valueOf2 != null ? valueOf2.intValue() : Integer.MAX_VALUE, (List) g, false, true, Boolean.valueOf(z3), 64).o(w2wVar);
                }
            } else {
                list = (List) new com.vk.im.engine.internal.merge.messages.b(fxfVar.a, intValue, (List) g, false, false, (Boolean) null, 56).o(w2wVar);
            }
            this.k = list;
            com.vk.im.engine.models.dialogs.a aVar2 = (com.vk.im.engine.models.dialogs.a) c400Var.d.get(Long.valueOf(j3));
            if (aVar2 != null) {
                new wfm(aVar2, null).o(w2wVar);
            } else {
                hpm c2 = sn.c(w2wVar);
                Peer a = mq9.a(w2wVar);
                ListIterator<? extends Msg> listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (listIterator.previous().Jb(a)) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i == -1) {
                    i2 = list.size();
                } else {
                    Msg msg2 = list.get(i);
                    List<? extends Msg> list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        i2 = 0;
                    } else {
                        int i6 = 0;
                        for (Msg msg3 : list2) {
                            if (msg3.d > msg2.d && msg3.i) {
                                i6++;
                                if (i6 < 0) {
                                    e43.s();
                                    throw null;
                                }
                            }
                        }
                        i2 = i6;
                    }
                }
                Msg msg4 = (Msg) j5g.i0(list);
                Integer valueOf5 = Integer.valueOf(i2);
                Integer valueOf6 = Integer.valueOf(msg4.d);
                Integer num3 = fxfVar.g;
                c2.c.a(Long.valueOf(j3), new dm(valueOf5, valueOf6, num3, 1), new cq3(8, num3, c2));
                ArrayList arrayList2 = new ArrayList();
                List<? extends Msg> list3 = list;
                for (Msg msg5 : list3) {
                    p4g.a(Integer.valueOf(msg5.d), arrayList2, this.i.get(msg5.d));
                }
                if (!arrayList2.isEmpty()) {
                    c2.m(j3, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Msg msg6 : list3) {
                    p4g.a(Integer.valueOf(msg6.d), arrayList3, msg6.Ib() && !msg6.D && msg6.i);
                }
                if (!arrayList3.isEmpty()) {
                    c2.j(j3, arrayList3);
                }
            }
            bru n = w2wVar.I0().n();
            Peer a2 = mq9.a(w2wVar);
            List<? extends Msg> list4 = list;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    if (((Msg) it4.next()).Jb(a2)) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            Peer b2 = Peer.a.b(j3);
            if (z) {
                b2.getClass();
                if (b2.Ab(Peer.Type.GROUP)) {
                    n.f(b2.d, true, true);
                }
            }
            hpm c3 = sn.c(w2wVar);
            frn0 system = w2wVar.I0().system();
            us r = w2wVar.I0().r();
            if (aVar2 != null) {
                i3 = aVar2.b;
            } else {
                com.vk.im.engine.models.dialogs.b c4 = c3.c(j3);
                i3 = c4 != null ? c4.c : -1;
            }
            int d = system.d();
            if (i3 == 1) {
                r.b(new oo8(true, d));
                this.m = true;
            }
        }
    }
}
