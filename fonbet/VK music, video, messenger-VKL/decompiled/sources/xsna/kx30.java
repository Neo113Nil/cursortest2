package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.SearchMode;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.search.SearchEntrypoint;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.czh0;
import xsna.dw30;
import xsna.g1e0;

/* compiled from: MsgSearchExtCmd.kt */
/* loaded from: classes2.dex */
public final class kx30 extends le6<a> {
    public final String b;
    public final Source c;
    public final SearchMode d;
    public final int e;
    public final int f;
    public final Long g;
    public final Peer h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final SearchEntrypoint m;
    public final Source n;

    /* compiled from: MsgSearchExtCmd.kt */
    public static final class a {
        public final List<zpp<Dialog>> a;
        public final List<Msg> b;
        public final Map<Long, Dialog> c;
        public final ProfilesSimpleInfo d;
        public final boolean e;
        public final boolean f;
        public final long g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<zpp<Dialog>> list, List<? extends Msg> list2, Map<Long, Dialog> map, ProfilesSimpleInfo profilesSimpleInfo, boolean z, boolean z2, long j) {
            this.a = list;
            this.b = list2;
            this.c = map;
            this.d = profilesSimpleInfo;
            this.e = z;
            this.f = z2;
            this.g = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Long.hashCode(this.g) + qoy.b(qoy.b(io.reactivex.rxjava3.subjects.c.a(this.d, v11.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(peers=");
            sb.append(this.a);
            sb.append(", msgs=");
            sb.append(this.b);
            sb.append(", dialogs=");
            sb.append(this.c);
            sb.append(", profiles=");
            sb.append(this.d);
            sb.append(", fullResultForMsgs=");
            sb.append(this.e);
            sb.append(", fullResultForPeers=");
            sb.append(this.f);
            sb.append(", executionTimeMillis=");
            return vu5.a(')', this.g, sb);
        }
    }

    /* compiled from: MsgSearchExtCmd.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.CACHE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kx30(String str, Source source, SearchMode searchMode, int i, int i2, Long l, Peer peer, boolean z, boolean z2, String str2, SearchEntrypoint searchEntrypoint, int i3) {
        searchMode = (i3 & 4) != 0 ? SearchMode.PEERS : searchMode;
        i = (i3 & 8) != 0 ? 20 : i;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        l = (i3 & 32) != 0 ? null : l;
        if ((i3 & 64) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        z = (i3 & 128) != 0 ? false : z;
        z2 = (i3 & 256) != 0 ? false : z2;
        boolean z3 = (i3 & 512) == 0;
        str2 = (i3 & 1024) != 0 ? null : str2;
        searchEntrypoint = (i3 & 2048) != 0 ? null : searchEntrypoint;
        this.b = str;
        this.c = source;
        this.d = searchMode;
        this.e = i;
        this.f = i2;
        this.g = l;
        this.h = peer;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str2;
        this.m = searchEntrypoint;
        Source source2 = Source.CACHE;
        this.n = source != source2 ? Source.ACTUAL : source2;
    }

    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.le6
    public final a e(w2w w2wVar) {
        ProfilesSimpleInfo Ob;
        Dialog dialog;
        qtd0 Ab;
        String str = this.b;
        if (drm0.N(str)) {
            EmptyList emptyList = EmptyList.b;
            return new a(emptyList, emptyList, jgp.b, new ProfilesSimpleInfo(), true, true, 0L);
        }
        int i = b.$EnumSwitchMapping$0[this.c.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i == 2) {
            return f(w2wVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        long currentTimeMillis = System.currentTimeMillis();
        czh0 v = w2wVar.I0().v();
        e2p0 y = emi.y(str);
        ArrayList arrayList = y.b;
        ArrayList arrayList2 = y.a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterable<Peer> iterable = EmptyList.b;
        SearchMode searchMode = SearchMode.PEERS;
        int i2 = this.e;
        SearchMode searchMode2 = this.d;
        if (searchMode2 == searchMode) {
            iterable = v.e(arrayList2, arrayList, new czh0.a(this.k), i2 + 1);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(Long.valueOf(((Peer) it.next()).b));
            }
        }
        List arrayList3 = new ArrayList();
        if (searchMode2 == SearchMode.MESSAGES) {
            arrayList3 = v.i(arrayList2, arrayList, Long.valueOf(this.h.b), this.f, i2 + 1);
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(Long.valueOf(((Msg) it2.next()).c));
            }
        }
        f1e0 f1e0Var = new f1e0();
        Iterator it3 = linkedHashSet.iterator();
        while (it3.hasNext()) {
            long longValue = ((Number) it3.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            if (Peer.a.f(longValue) != Peer.Type.CHAT) {
                f1e0Var.c(Peer.a.b(longValue));
            }
        }
        List list = arrayList3;
        f1e0 f1e0Var2 = new f1e0();
        if ((list instanceof List) && (list instanceof RandomAccess)) {
            List list2 = list;
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                lv30.b((Msg) list2.get(i3), f1e0Var2);
            }
        } else {
            Iterator it4 = list.iterator();
            while (it4.hasNext()) {
                lv30.b((Msg) it4.next(), f1e0Var2);
            }
        }
        f1e0 f1e0Var3 = new f1e0();
        f1e0Var3.e(f1e0Var2);
        f1e0Var3.e(f1e0Var);
        if (f1e0Var3.f()) {
            Ob = new ProfilesSimpleInfo();
        } else {
            g1e0.a aVar = new g1e0.a();
            aVar.c = this.i;
            aVar.b = this.n;
            aVar.a.e(f1e0Var3);
            Ob = ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)))).Ob();
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(linkedHashSet, 10));
        Iterator it5 = linkedHashSet.iterator();
        while (it5.hasNext()) {
            long longValue2 = ((Number) it5.next()).longValue();
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            arrayList4.add(Peer.a.b(longValue2));
        }
        wpp wppVar = (wpp) k9q0.f(w2wVar, this, new tqm(new sqm(arrayList4, Source.CACHE, false, null, 0, 28)));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Peer peer : iterable) {
            Peer.Type type = peer.c;
            long j = peer.b;
            if (type == Peer.Type.CHAT) {
                dialog = (Dialog) wppVar.c.get(Long.valueOf(j));
            } else {
                Object obj = ((Map) Ob.g.get(type)).get(Long.valueOf(peer.d));
                dialog = null;
                if (obj != null && (Ab = Ob.Ab(Long.valueOf(j))) != null && (!this.j || Ab.v5() != null)) {
                    Contact contact = Ab instanceof Contact ? (Contact) Ab : null;
                    if ((contact != null ? contact.j : null) != null) {
                        Ab = Ob.Ab(contact.j);
                    }
                    if (Ab != null) {
                        long G3 = Ab.G3();
                        Dialog dialog2 = (Dialog) wppVar.c.get(Long.valueOf(G3));
                        if (dialog2 == null) {
                            dialog2 = new Dialog();
                            dialog2.setId(G3);
                        }
                        dialog = dialog2;
                    }
                }
            }
            if (dialog != null) {
                linkedHashSet2.add(dialog);
            }
        }
        ArrayList arrayList5 = new ArrayList(j5g.D0(new crt(1), linkedHashSet2));
        g5g.D(arrayList3, true, new fa00(wppVar, 5));
        long currentTimeMillis2 = System.currentTimeMillis();
        ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            arrayList6.add(new zpp((Dialog) it6.next(), ""));
        }
        return new a(arrayList6, arrayList3, wppVar.c, Ob, arrayList3.size() < i2 + 1, true, currentTimeMillis2 - currentTimeMillis);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx30)) {
            return false;
        }
        kx30 kx30Var = (kx30) obj;
        return epx.f(this.b, kx30Var.b) && this.c == kx30Var.c && this.d == kx30Var.d && this.e == kx30Var.e && this.f == kx30Var.f && epx.f(this.g, kx30Var.g) && epx.f(this.h, kx30Var.h) && this.i == kx30Var.i && this.j == kx30Var.j && this.k == kx30Var.k && epx.f(this.l, kx30Var.l) && this.m == kx30Var.m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    public final a f(w2w w2wVar) {
        List list;
        ?? r8;
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        wmm.b.a(w2wVar, Source.NETWORK, w2wVar.getConfig().n);
        Pair pair = (Pair) ((ccq) bz2.c(new dw30(this.b, this.d, this.e, this.f, this.g, this.h, w2wVar.Q0(), this.k, this.i, w2wVar.c(), this.l, this.m), "MsgSearchExtCmd.MsgSearchApiCmd")).a(w2wVar, new com.vk.libvideo.design.view.video.a(21, this, w2wVar));
        dw30.a aVar = (dw30.a) pair.d();
        ipm ipmVar = (ipm) pair.g();
        boolean z2 = aVar instanceof dw30.a.C2765a;
        if (z2) {
            list = EmptyList.b;
        } else {
            if (!(aVar instanceof dw30.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            List<Msg> list2 = ((dw30.a.b) aVar).c;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (obj instanceof MsgFromUser) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        wpp<Long, Dialog> wppVar = ipmVar.a;
        ProfilesInfo profilesInfo = ipmVar.b;
        HashMap hashMap = wppVar.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            Dialog dialog = (Dialog) entry.getValue();
            if (!this.k || dialog.Pb()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (z2) {
            List<zpp<com.vk.im.engine.models.dialogs.a>> list3 = ((dw30.a.C2765a) aVar).a;
            wpp<Long, Dialog> wppVar2 = ipmVar.a;
            r8 = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                zpp zppVar = (zpp) it.next();
                com.vk.im.engine.models.dialogs.a aVar2 = (com.vk.im.engine.models.dialogs.a) zppVar.a;
                qtd0 Cb = profilesInfo.Cb(Long.valueOf(aVar2.a));
                Contact contact = Cb instanceof Contact ? (Contact) Cb : null;
                Dialog dialog2 = this.j ? (Cb != null ? Cb.v5() : null) == null ? null : (contact != null ? contact.j : null) == null ? (Dialog) wppVar2.c.get(Long.valueOf(Cb.G3())) : (Dialog) wppVar2.c.get(contact.j) : (Dialog) wppVar2.c.get(Long.valueOf(aVar2.a));
                zpp zppVar2 = dialog2 != null ? new zpp(dialog2, zppVar.b) : null;
                if (zppVar2 != null) {
                    r8.add(zppVar2);
                }
            }
        } else {
            if (!(aVar instanceof dw30.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            r8 = EmptyList.b;
        }
        List list4 = r8;
        if (z2) {
            z = ((dw30.a.C2765a) aVar).c;
        } else {
            if (!(aVar instanceof dw30.a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            z = ((dw30.a.b) aVar).d;
        }
        boolean z3 = z;
        return new a(list4, list, linkedHashMap, profilesInfo.Ob(), z3, z3, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int a2 = shy.a(this.f, shy.a(this.e, (this.d.hashCode() + io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c)) * 31, 31), 31);
        Long l = this.g;
        int b2 = qoy.b(qoy.b(qoy.b(bh10.a((a2 + (l == null ? 0 : l.hashCode())) * 31, 31, this.h.b), 31, this.i), 31, this.j), 31, this.k);
        String str = this.l;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        SearchEntrypoint searchEntrypoint = this.m;
        return hashCode + (searchEntrypoint != null ? searchEntrypoint.hashCode() : 0);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "MsgSearchExtCmd(query=" + this.b + ", source=" + this.c + ", searchMode=" + this.d + ", limit=" + this.e + ", msgsOffset=" + this.f + ", beforeDate=" + this.g + ", peer=" + this.h + ", awaitNetwork=" + this.i + ", onlyInContacts=" + this.j + ", onlyNonEmptyDialogs=" + this.k + ", searchQuid=" + this.l + ", searchScreenRef=" + this.m + ')';
    }
}
