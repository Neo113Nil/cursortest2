package xsna;

import android.util.ArraySet;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.engine.models.dialogs.DialogsCounters;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.events.OnCacheInvalidateEvent;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.users.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.v580;
import xsna.w580;

/* compiled from: LongPollChanges.java */
/* loaded from: classes2.dex */
public final class z300 {

    @Nullable
    public volatile ArraySet A;

    @Nullable
    public volatile ArraySet B;

    @Nullable
    public volatile ArrayList C;

    @Nullable
    public volatile ArraySet O;

    @Nullable
    public volatile HashMap P;

    @Nullable
    public volatile HashMap Q;

    @Nullable
    public volatile HashMap R;

    @Nullable
    public volatile HashSet S;

    @Nullable
    public volatile HashSet T;

    @Nullable
    public volatile HashMap U;

    @Nullable
    public volatile HashSet V;

    @Nullable
    public volatile HashSet W;

    @Nullable
    public volatile HashSet Y;
    public volatile Boolean a;
    public volatile Boolean b;
    public volatile Boolean c;
    public volatile Boolean d;

    @Nullable
    public volatile ArraySet f;

    @Nullable
    public volatile HashMap g;

    @Nullable
    public volatile HashMap h;

    @Nullable
    public volatile HashMap i;

    @Nullable
    public volatile HashMap j;

    @Nullable
    public volatile HashMap k;

    @Nullable
    public volatile HashMap l;

    @Nullable
    public volatile ArraySet m;

    @Nullable
    public volatile ArraySet n;

    @Nullable
    public volatile ArraySet o;

    @Nullable
    public volatile ArraySet p;

    @Nullable
    public volatile Boolean x;

    @Nullable
    public volatile HashMap y;

    @Nullable
    public volatile HashMap z;
    public final HashSet e = new HashSet();
    public final HashMap q = new HashMap();
    public final HashMap r = new HashMap();
    public final HashMap s = new HashMap();
    public final HashMap t = new HashMap();
    public final HashMap u = new HashMap();
    public final HashMap v = new HashMap();
    public final HashMap w = new HashMap();
    public boolean D = false;
    public boolean E = false;
    public final EnumMap<DialogsCounters.Type, Integer> F = new EnumMap<>(DialogsCounters.Type.class);
    public final ArraySet G = new ArraySet();
    public final ArrayList<spm> H = new ArrayList<>();
    public final ArrayList<Integer> I = new ArrayList<>();
    public final ArrayList<Integer> J = new ArrayList<>();
    public final ArrayList<e580> K = new ArrayList<>();
    public final ArrayList<Integer> L = new ArrayList<>();
    public boolean M = false;
    public boolean N = false;
    public boolean X = false;

    public final void a(long j) {
        if (this.S == null) {
            this.S = new HashSet();
        }
        this.S.add(Long.valueOf(j));
    }

    public final void b(int i, long j) {
        if (this.P == null) {
            this.P = new HashMap();
        }
        Collection collection = (Collection) this.P.get(Long.valueOf(j));
        if (collection == null) {
            collection = new ArraySet();
            this.P.put(Long.valueOf(j), collection);
        }
        collection.add(Integer.valueOf(i));
    }

    public final void c(long j) {
        if (this.O == null) {
            this.O = new ArraySet();
        }
        this.O.add(Long.valueOf(j));
    }

    public final void d(int i, long j) {
        if (this.j == null) {
            this.j = new HashMap();
        }
        Collection collection = (Collection) this.j.get(Long.valueOf(j));
        if (collection == null) {
            collection = new ArraySet();
            this.j.put(Long.valueOf(j), collection);
        }
        collection.add(Integer.valueOf(i));
    }

    public final void e(long j) {
        if (this.n == null) {
            this.n = new ArraySet();
        }
        this.n.add(Long.valueOf(j));
    }

    public final void f(@NonNull DialogsCounters.Type type, int i) {
        EnumMap<DialogsCounters.Type, Integer> enumMap = this.F;
        Integer num = enumMap.get(type);
        enumMap.put((EnumMap<DialogsCounters.Type, Integer>) type, (DialogsCounters.Type) Integer.valueOf((num != null ? num.intValue() : 0) + i));
    }

    public final void g(long j) {
        if (this.f == null) {
            this.f = new ArraySet();
        }
        this.f.add(Long.valueOf(j));
    }

    public final void h(b5w b5wVar) {
        if (this.Y == null) {
            this.Y = new HashSet();
        }
        this.Y.add(b5wVar);
    }

    public final void i(int i, long j) {
        if (this.i == null) {
            this.i = new HashMap();
        }
        Collection collection = (Collection) this.i.get(Long.valueOf(j));
        if (collection == null) {
            collection = new ArraySet();
            this.i.put(Long.valueOf(j), collection);
        }
        collection.add(Integer.valueOf(i));
    }

    public final void j(int i, long j) {
        if (this.g == null) {
            this.g = new HashMap();
        }
        Collection collection = (Collection) this.g.get(Long.valueOf(j));
        if (collection == null) {
            collection = new ArraySet();
            this.g.put(Long.valueOf(j), collection);
        }
        collection.add(Integer.valueOf(i));
    }

    public final void k(long j) {
        if (this.o == null) {
            this.o = new ArraySet();
        }
        this.o.add(Long.valueOf(j));
    }

    public final wpp l(w2w w2wVar, ArraySet arraySet, Source source) throws Exception {
        ArrayList arrayList = new ArrayList(c5g.u(arraySet, 10));
        Iterator it = arraySet.iterator();
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        return (wpp) w2wVar.L0(this, new b1r0(arrayList, source));
    }

    public final void m(Map map, long j, LinkedHashSet linkedHashSet) {
        if (((Set) map.get(Long.valueOf(j))) == null) {
            map.put(Long.valueOf(j), linkedHashSet);
        }
        Set set = (Set) this.w.get(Long.valueOf(j));
        if (set != null) {
            set.removeAll(linkedHashSet);
        }
    }

    public final ArrayList n(w2w w2wVar, Object obj, LongPollType longPollType) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            arrayList.add(new i480(obj, (gkx0) it.next(), 1));
        }
        Collection collection = this.m == null ? Collections.EMPTY_LIST : this.m;
        if (this.h != null && !this.h.isEmpty()) {
            for (Map.Entry entry : this.h.entrySet()) {
                arrayList.add(new e980(obj, ((Long) entry.getKey()).longValue(), (Collection) entry.getValue(), collection, longPollType));
            }
        }
        if (this.j != null && this.j.size() > 0) {
            for (Map.Entry entry2 : this.j.entrySet()) {
                arrayList.add(new f980(obj, ((Long) entry2.getKey()).longValue(), (Collection) entry2.getValue()));
            }
        }
        if (this.i != null && this.i.size() > 0) {
            for (Map.Entry entry3 : this.i.entrySet()) {
                long longValue = ((Long) entry3.getKey()).longValue();
                Iterator it2 = ((Collection) entry3.getValue()).iterator();
                while (it2.hasNext()) {
                    arrayList.add(new g980(obj, longValue, ((Integer) it2.next()).intValue()));
                }
            }
        }
        if (this.y != null) {
            for (Map.Entry entry4 : this.y.entrySet()) {
                arrayList.add(new b380(((Long) entry4.getKey()).longValue(), obj, true, ((Integer) entry4.getValue()).intValue()));
            }
        }
        if (this.z != null) {
            for (Map.Entry entry5 : this.z.entrySet()) {
                arrayList.add(new b380(((Long) entry5.getKey()).longValue(), obj, false, ((Integer) entry5.getValue()).intValue()));
            }
        }
        if (this.f != null && !this.f.isEmpty()) {
            ArraySet arraySet = this.f;
            ArrayList arrayList2 = new ArrayList(c5g.u(arraySet, 10));
            Iterator it3 = arraySet.iterator();
            while (it3.hasNext()) {
                long longValue2 = ((Long) it3.next()).longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                arrayList2.add(Peer.a.b(longValue2));
            }
            arrayList.add(new r480(obj, (wpp) w2wVar.b1(this, new tqm(new sqm(arrayList2, null, false, null, 0, 30)))));
        }
        if (this.Y != null && !this.Y.isEmpty()) {
            arrayList.add(new r680(obj, this.Y));
        }
        if (this.g != null && this.g.size() != 0) {
            arrayList.add(new p980(obj, this.g));
        }
        if (this.k != null && this.k.size() != 0) {
            arrayList.add(new q980(this.k, obj));
        }
        if (this.l != null && this.l.size() != 0) {
            arrayList.add(new n980(this.l, obj));
        }
        if (this.Q != null && !this.Q.isEmpty()) {
            for (Map.Entry entry6 : this.Q.entrySet()) {
                arrayList.add(new i280(obj, ((Long) entry6.getKey()).longValue(), (Collection) entry6.getValue()));
            }
        }
        if (this.R != null && this.R.size() > 0) {
            for (Map.Entry entry7 : this.R.entrySet()) {
                arrayList.add(new j280(obj, ((Long) entry7.getKey()).longValue(), (Collection) entry7.getValue()));
            }
        }
        if (this.P != null && !this.P.isEmpty()) {
            arrayList.add(new o280(obj, this.P));
        }
        if (this.T != null && !this.T.isEmpty()) {
            arrayList.add(new w280(obj, this.T));
        }
        if (this.U != null) {
            for (Map.Entry entry8 : this.U.entrySet()) {
                arrayList.add(new m280(obj, ((Long) entry8.getKey()).longValue(), ((Integer) entry8.getValue()).intValue()));
            }
        }
        if (this.O != null && !this.O.isEmpty()) {
            ArraySet arraySet2 = this.O;
            ArrayList arrayList3 = new ArrayList(c5g.u(arraySet2, 10));
            Iterator it4 = arraySet2.iterator();
            while (it4.hasNext()) {
                long longValue3 = ((Long) it4.next()).longValue();
                Serializer.c<Peer> cVar2 = Peer.CREATOR;
                arrayList3.add(Peer.a.b(longValue3));
            }
            arrayList.add(new r280(obj, (wpp) w2wVar.L0(this, new gfb((List<? extends Peer>) arrayList3, Source.CACHE, false, (Object) null))));
        }
        if (this.X) {
            arrayList.add(new v280(obj));
        }
        if (this.S != null) {
            Iterator it5 = this.S.iterator();
            while (it5.hasNext()) {
                long longValue4 = ((Long) it5.next()).longValue();
                arrayList.add(new o8b(longValue4, (List) w2wVar.L0(this, new oza(longValue4, Source.CACHE, false)), obj));
            }
        }
        if (this.n != null && !this.n.isEmpty()) {
            wpp wppVar = (wpp) w2wVar.L0(this, new abj(this.n, Source.CACHE, false, obj));
            arrayList.add(m380.b);
            arrayList.add(new ka80(obj, new wpp(), wppVar, null, null, 24));
        }
        if (this.o != null && !this.o.isEmpty()) {
            arrayList.add(new ka80(obj, (wpp<Long, User>) l(w2wVar, this.o, Source.CACHE)));
        }
        if (this.p != null && !this.p.isEmpty()) {
            arrayList.add(new ka80(obj, (wpp<Long, User>) l(w2wVar, this.p, Source.NETWORK)));
        }
        if (Boolean.TRUE.equals(this.x)) {
            arrayList.add(new h680(obj));
        }
        if (this.D) {
            DialogsFilter dialogsFilter = DialogsFilter.BUSINESS_NOTIFY;
            arrayList.add(new v480(obj, dialogsFilter, (xpp) w2wVar.L0(this, new qpm(dialogsFilter, Source.CACHE, false, obj))));
        }
        if (this.E) {
            arrayList.add(new s480(obj));
        }
        if (this.A != null) {
            Iterator it6 = this.A.iterator();
            while (it6.hasNext()) {
                arrayList.add(new k980(obj, ((Long) it6.next()).longValue()));
            }
        }
        if (this.C != null && this.C != null) {
            for (int i = 0; i < this.C.size(); i++) {
                Pair pair = (Pair) this.C.get(i);
                arrayList.add(new g480(obj, ((Long) pair.first).longValue(), ((Long) pair.second).longValue()));
            }
        }
        if (this.F.size() > 0) {
            ArrayList arrayList4 = new ArrayList();
            com.vk.im.engine.internal.storage.delegates.dialogs.b a = w2wVar.I0().b().a();
            for (Map.Entry<DialogsCounters.Type, Integer> entry9 : this.F.entrySet()) {
                DialogsCounters.Type key = entry9.getKey();
                Integer value = entry9.getValue();
                if (!this.G.contains(key) && value != null) {
                    int intValue = value.intValue();
                    com.vk.im.engine.models.dialogs.d b = a.b(key);
                    if (b != null) {
                        intValue = b.b + value.intValue();
                    }
                    if (key == DialogsCounters.Type.REQUESTS) {
                        ArraySet arraySet3 = new ArraySet();
                        if (this.A != null) {
                            arraySet3.addAll((Collection) this.A);
                        }
                        if (this.B != null) {
                            arraySet3.removeAll((Collection<?>) this.B);
                        }
                        int size = arraySet3.size() + intValue;
                        arraySet3.clear();
                        if (this.B != null) {
                            arraySet3.addAll((Collection) this.B);
                        }
                        if (this.A != null) {
                            arraySet3.removeAll((Collection<?>) this.A);
                        }
                        intValue = size - arraySet3.size();
                    }
                    arrayList4.add(new com.vk.im.engine.models.dialogs.d(key, Math.max(0, intValue), b.c));
                }
            }
            if (arrayList4.size() > 0) {
                this.a = Boolean.TRUE;
                a.h(arrayList4);
            }
        }
        if (!this.H.isEmpty()) {
            arrayList.add(g580.b);
        }
        Iterator<Integer> it7 = this.J.iterator();
        while (it7.hasNext()) {
            arrayList.add(new w480(it7.next().intValue()));
        }
        Iterator<Integer> it8 = this.I.iterator();
        while (it8.hasNext()) {
            arrayList.add(new b580(it8.next().intValue()));
        }
        Iterator<Integer> it9 = this.L.iterator();
        while (it9.hasNext()) {
            arrayList.add(new f580(it9.next().intValue()));
        }
        if (this.M) {
            arrayList.add(k580.b);
        }
        arrayList.addAll(this.K);
        if (this.N) {
            arrayList.add(l580.b);
        }
        if (this.V != null && !this.V.isEmpty()) {
            arrayList.add(new w580.a(new ArrayList(this.V)));
        }
        if (this.W != null && !this.W.isEmpty()) {
            arrayList.add(new v580.a(new ArrayList(this.W)));
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.b)) {
            arrayList.add(new OnChannelsCacheInvalidateEvent(obj, OnChannelsCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
        }
        if (bool.equals(this.c)) {
            arrayList.add(new OnChannelsCacheInvalidateEvent(obj, OnChannelsCacheInvalidateEvent.Reason.SUGGESTS_UPDATED));
        }
        if (bool.equals(this.a)) {
            arrayList.add(new OnCacheInvalidateEvent(obj, OnCacheInvalidateEvent.Reason.COMPLICATED_DB_CHANGE));
        }
        if (bool.equals(this.d)) {
            arrayList.add(new q680(obj));
        }
        return arrayList;
    }
}
