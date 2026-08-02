package xsna;

import android.util.SparseArray;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.k2b;

/* compiled from: ChannelMessagesGetByIdCmd.kt */
/* loaded from: classes2.dex */
public final class n2b extends le6<wpp<Integer, Msg>> {
    public final long b;
    public final Collection<Integer> c;
    public final MsgIdType d;
    public final Source e;
    public final boolean f;
    public final boolean g;

    /* compiled from: ChannelMessagesGetByIdCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Source.NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Source.ACTUAL.ordinal()] = 3;
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

    public n2b(long j, Collection<Integer> collection, MsgIdType msgIdType, Source source, boolean z, boolean z2) {
        this.b = j;
        this.c = collection;
        this.d = msgIdType;
        this.e = source;
        this.f = z;
        this.g = z2;
    }

    @Override // xsna.le6
    public final wpp<Integer, Msg> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.e.ordinal()];
        if (i == 1) {
            return f(w2wVar, this.b, this.c, this.d);
        }
        if (i == 2) {
            return g(w2wVar, this.b, this.c, this.d, this.f);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        long j = this.b;
        Collection<Integer> collection = this.c;
        MsgIdType msgIdType = this.d;
        wpp<Integer, Msg> f = f(w2wVar, j, collection, msgIdType);
        if (!f.f()) {
            return f;
        }
        f.m(g(w2wVar, j, f.a(), msgIdType, this.f));
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2b)) {
            return false;
        }
        n2b n2bVar = (n2b) obj;
        return this.b == n2bVar.b && epx.f(this.c, n2bVar.c) && this.d == n2bVar.d && this.e == n2bVar.e && this.f == n2bVar.f && this.g == n2bVar.g;
    }

    public final wpp<Integer, Msg> f(w2w w2wVar, long j, Collection<Integer> collection, MsgIdType msgIdType) {
        SparseArray<Msg> T;
        xgl0 I0 = w2wVar.I0();
        int r = ad0.B(I0.a().B(j)) ? I0.system().r(j) : I0.system().j();
        int i = a.$EnumSwitchMapping$1[msgIdType.ordinal()];
        boolean z = this.g;
        if (i == 1) {
            xgl0 I02 = w2wVar.I0();
            T = (z ? I02.e() : I02.y()).T(collection);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Not supported msgIdType = " + msgIdType);
            }
            xgl0 I03 = w2wVar.I0();
            T = (z ? I03.e() : I03.y()).i(j, collection);
        }
        wpp<Integer, Msg> wppVar = new wpp<>();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            Msg msg = T.get(intValue);
            if (msg == null) {
                wppVar.a.add(Integer.valueOf(intValue));
            } else {
                wppVar.p(Integer.valueOf(intValue), msg);
                if (msg.u != r) {
                    wppVar.b.add(Integer.valueOf(intValue));
                }
            }
        }
        return wppVar;
    }

    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, java.util.Map] */
    public final wpp<Integer, Msg> g(w2w w2wVar, long j, Collection<Integer> collection, MsgIdType msgIdType, boolean z) {
        int i = a.$EnumSwitchMapping$1[msgIdType.ordinal()];
        boolean z2 = this.g;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalArgumentException("Not supported msgIdType = " + msgIdType);
            }
            Serializer.c<Peer> cVar = Peer.CREATOR;
            k2b.a aVar = (k2b.a) fo50.v(new k2b(Peer.a.b(j), collection, z, false), w2wVar, "ChannelMessagesGetByIdCmd.ChannelMessagesGetByIdApiCmd", 2);
            List list = (List) new v3b(j, aVar.a.values(), z2).o(w2wVar);
            ProfilesSimpleInfo profilesSimpleInfo = aVar.b;
            if (profilesSimpleInfo.Gb()) {
                new h1e0(profilesSimpleInfo, w2wVar.f1(), true).o(w2wVar);
            }
            List list2 = list;
            SparseArray sparseArray = new SparseArray(list2.size());
            for (Object obj : list2) {
                sparseArray.put(((Msg) obj).d, obj);
            }
            return new wpp<>(zik0.f(sparseArray));
        }
        xgl0 I0 = w2wVar.I0();
        ArrayList g = zik0.g((z2 ? I0.e() : I0.y()).T(collection));
        ArrayList arrayList = new ArrayList();
        Iterator it = g.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Msg) next).H6()) {
                arrayList.add(next);
            }
        }
        List A = rli0.A(new ulp0(rli0.j(new i5g(g), new com.vk.movika.sdk.base.observable.s(13)), new p60(12)));
        Serializer.c<Peer> cVar2 = Peer.CREATOR;
        k2b.a aVar2 = (k2b.a) fo50.v(new k2b(Peer.a.b(j), A, z, false), w2wVar, "ChannelMessagesGetByIdCmd.ChannelMessagesGetByIdApiCmd", 2);
        List list3 = (List) new v3b(j, aVar2.a.values(), z2).o(w2wVar);
        ProfilesSimpleInfo profilesSimpleInfo2 = aVar2.b;
        if (profilesSimpleInfo2.Gb()) {
            new h1e0(profilesSimpleInfo2, w2wVar.f1(), true).o(w2wVar);
        }
        SparseArray sparseArray2 = new SparseArray(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            sparseArray2.put(((Msg) next2).b, next2);
        }
        List list4 = list3;
        SparseArray sparseArray3 = new SparseArray(list4.size());
        for (Object obj2 : list4) {
            sparseArray3.put(((Msg) obj2).b, obj2);
        }
        SparseArray sparseArray4 = new SparseArray(sparseArray3.size() + sparseArray2.size());
        zik0.e(sparseArray4, sparseArray2);
        zik0.e(sparseArray4, sparseArray3);
        return new wpp<>(zik0.f(sparseArray4));
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c((this.d.hashCode() + s3j0.a(Long.hashCode(this.b) * 31, this.c, 31)) * 31, 31, this.e), 31, this.f);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMessagesGetByIdCmd(channelId=");
        sb.append(this.b);
        sb.append(", messagesIds=");
        sb.append(this.c);
        sb.append(", msgIdType=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=");
        sb.append(this.f);
        sb.append(", isPostponed=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
