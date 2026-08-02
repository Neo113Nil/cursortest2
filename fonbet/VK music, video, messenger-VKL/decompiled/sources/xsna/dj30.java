package xsna;

import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ge20;
import xsna.hfr;

/* compiled from: MsgGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class dj30 extends le6<wpp<Integer, Msg>> {
    public final MsgIdType b;
    public final Collection<Integer> c;
    public final Peer d;
    public final Source e;
    public final boolean f;
    public final Object g;

    /* compiled from: MsgGetByIdCmd.kt */
    public static final class a {
        public final SparseArray<Msg> a;
        public final int b;

        public a(SparseArray<Msg> sparseArray, int i) {
            this.a = sparseArray;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CacheRawResult(msgs=");
            sb.append(this.a);
            sb.append(", phase=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: MsgGetByIdCmd.kt */
    public static final class b {
        public final wpp<Integer, Msg> a;
        public final wpp<Integer, Msg> b;

        public b(wpp<Integer, Msg> wppVar, wpp<Integer, Msg> wppVar2) {
            this.a = wppVar;
            this.b = wppVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Result(msgs=" + this.a + ", changes=" + this.b + ')';
        }
    }

    /* compiled from: MsgGetByIdCmd.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MsgIdType.values().length];
            try {
                iArr2[MsgIdType.LOCAL_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MsgIdType.CNV_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dj30(MsgIdType msgIdType, Collection collection, Peer peer, Source source, boolean z, String str, int i) {
        this(msgIdType, collection, peer, (i & 8) != 0 ? Source.CACHE : source, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str);
        if ((i & 4) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
    }

    @Override // xsna.le6
    public final wpp<Integer, Msg> e(w2w w2wVar) {
        b f;
        Collection<Integer> collection = this.c;
        if (collection.isEmpty()) {
            return new wpp<>();
        }
        int i = c.$EnumSwitchMapping$0[this.e.ordinal()];
        MsgIdType msgIdType = this.b;
        if (i != 1) {
            boolean z = this.f;
            if (i == 2) {
                b f2 = f(w2wVar, msgIdType, collection);
                b bVar = new b(new wpp(), new wpp());
                wpp<Integer, Msg> wppVar = f2.a;
                if (wppVar.f()) {
                    bVar = g(w2wVar, msgIdType, j5g.O0(wppVar.a()), z);
                }
                wppVar.m(bVar.a);
                f = new b(wppVar, bVar.b);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f = g(w2wVar, msgIdType, collection, z);
            }
        } else {
            f = f(w2wVar, msgIdType, collection);
        }
        wpp<Integer, Msg> wppVar2 = f.b;
        if (!wppVar2.i()) {
            w2wVar.S0().c(this.g, wppVar2);
        }
        return f.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj30)) {
            return false;
        }
        dj30 dj30Var = (dj30) obj;
        return this.b == dj30Var.b && epx.f(this.c, dj30Var.c) && epx.f(this.d, dj30Var.d) && this.e == dj30Var.e && this.f == dj30Var.f && epx.f(this.g, dj30Var.g);
    }

    public final b f(w2w w2wVar, MsgIdType msgIdType, Collection<Integer> collection) {
        a aVar = (a) w2wVar.I0().c(new apg(msgIdType, collection, this, 2));
        wpp wppVar = new wpp();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Msg msg = aVar.a.get(intValue);
            if (msg == null) {
                wppVar.a.add(Integer.valueOf(intValue));
            } else {
                wppVar.p(Integer.valueOf(intValue), msg);
                if (msg.u != aVar.b) {
                    wppVar.b.add(Integer.valueOf(intValue));
                }
            }
        }
        return new b(wppVar, new wpp());
    }

    public final b g(w2w w2wVar, MsgIdType msgIdType, Collection<Integer> collection, boolean z) {
        int[] iArr = c.$EnumSwitchMapping$1;
        int i = iArr[msgIdType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            MsgIdType msgIdType2 = MsgIdType.CNV_ID;
            List list = (List) new f140(((ge20.a) fo50.v(new ge20(collection, msgIdType2, z, w2wVar.c(), this.d, w2wVar.Q0()), w2wVar, "MsgGetByIdCmd.loadByNetwork.MessagesGetByIdApiCmd", 2)).a.values()).o(w2wVar);
            if (iArr[msgIdType2.ordinal()] != 2) {
                throw new IllegalArgumentException("idType = " + msgIdType2.name() + " not supported for loadByNetwork ");
            }
            List list2 = list;
            SparseArray sparseArray = new SparseArray(list2.size());
            List list3 = list2;
            for (Object obj : list3) {
                sparseArray.put(((Msg) obj).d, obj);
            }
            SparseArray sparseArray2 = new SparseArray(list2.size());
            for (Object obj2 : list3) {
                sparseArray2.put(((Msg) obj2).d, obj2);
            }
            return new b(new wpp(zik0.f(sparseArray)), new wpp(zik0.f(sparseArray2)));
        }
        ArrayList g = zik0.g(w2wVar.I0().o().T(collection));
        ArrayList arrayList = new ArrayList();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Msg) next).H6()) {
                arrayList.add(next);
            }
        }
        hfr j = rli0.j(new i5g(g), new v4v(15));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        hfr.a aVar = new hfr.a(j);
        while (aVar.hasNext()) {
            Msg msg = (Msg) aVar.next();
            Long valueOf = Long.valueOf(msg.c);
            Object obj3 = linkedHashMap.get(valueOf);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(valueOf, obj3);
            }
            ((List) obj3).add(Integer.valueOf(msg.d));
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List list4 = (List) entry.getValue();
            MsgIdType msgIdType3 = MsgIdType.CNV_ID;
            String c2 = w2wVar.c();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList2.add(new ge20(list4, msgIdType3, z, c2, Peer.a.b(longValue), w2wVar.Q0()));
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ge20.a) fo50.v((ge20) it2.next(), w2wVar, "MsgGetByIdCmd.loadByNetworkByLocalId.MessagesGetByIdApiCmd", 2)).a.values());
        }
        List list5 = (List) new f140(c5g.v(arrayList3)).o(w2wVar);
        SparseArray sparseArray3 = new SparseArray(arrayList.size());
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            sparseArray3.put(((Msg) next2).b, next2);
        }
        List list6 = list5;
        SparseArray sparseArray4 = new SparseArray(list6.size());
        List list7 = list6;
        for (Object obj4 : list7) {
            sparseArray4.put(((Msg) obj4).b, obj4);
        }
        SparseArray sparseArray5 = new SparseArray(sparseArray4.size() + sparseArray3.size());
        zik0.e(sparseArray5, sparseArray3);
        zik0.e(sparseArray5, sparseArray4);
        SparseArray sparseArray6 = new SparseArray(list6.size());
        for (Object obj5 : list7) {
            sparseArray6.put(((Msg) obj5).b, obj5);
        }
        return new b(new wpp(zik0.f(sparseArray5)), new wpp(zik0.f(sparseArray6)));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b2 = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(bh10.a(s3j0.a(this.b.hashCode() * 31, this.c, 31), 31, this.d.b), 31, this.e), 31, this.f);
        Object obj = this.g;
        return b2 + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgGetByIdCmd(type=");
        sb.append(this.b);
        sb.append(", msgIds=");
        sb.append(this.c);
        sb.append(", peer=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=");
        sb.append(this.f);
        sb.append(", changerTag=");
        return k73.c(sb, this.g, ')');
    }

    public dj30(MsgIdType msgIdType, Collection<Integer> collection, Peer peer, Source source, boolean z, Object obj) {
        this.b = msgIdType;
        this.c = collection;
        this.d = peer;
        this.e = source;
        this.f = z;
        this.g = obj;
        if (msgIdType == MsgIdType.CNV_ID && peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalArgumentException("peer is not specified");
        }
    }

    public /* synthetic */ dj30(MsgIdType msgIdType, int i, Source source) {
        this(msgIdType, i, source, false, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dj30(MsgIdType msgIdType, int i, Source source, boolean z, Object obj) {
        this(msgIdType, r2, Peer.Unknown.e, source, z, obj);
        List singletonList = Collections.singletonList(Integer.valueOf(i));
        Serializer.c<Peer> cVar = Peer.CREATOR;
    }
}
