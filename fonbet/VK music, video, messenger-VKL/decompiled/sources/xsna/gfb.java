package xsna;

import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.internal.merge.channels.ChannelsInfoMergeTask;
import com.vk.im.engine.internal.merge.messages.ChannelMsgHistoryFromServerMergeTask;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.users.UserStorageModel;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.efb;

/* compiled from: ChannelsGetByIdsCmd.kt */
/* loaded from: classes2.dex */
public final class gfb extends le6<wpp<Long, Channel>> {
    public final List<Peer> b;
    public final Source c;
    public final boolean d;
    public final Object e;

    /* compiled from: ChannelsGetByIdsCmd.kt */
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
            int[] iArr2 = new int[ChannelType.values().length];
            try {
                iArr2[ChannelType.COMMUNITY_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChannelType.PERSONAL_CHANNEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public /* synthetic */ gfb(List list, Source source, boolean z, int i) {
        this((List<? extends Peer>) list, source, (i & 4) != 0 ? false : z, (Object) null);
    }

    public static wpp f(List list, w2w w2wVar) {
        Long l;
        long j;
        Long l2;
        uib a2 = w2wVar.I0().a();
        bru n = w2wVar.I0().n();
        x1r0 d = w2wVar.I0().d();
        List<Peer> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((Peer) it.next()).b));
        }
        Map<Long, bdb> d2 = a2.d(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (bdb bdbVar : d2.values()) {
            Long l3 = bdbVar.w;
            if (l3 != null) {
                long longValue = l3.longValue();
                Serializer.c<Peer> cVar = Peer.CREATOR;
                long d3 = Peer.a.d(longValue);
                ChannelType channelType = bdbVar.v;
                int i = channelType == null ? -1 : a.$EnumSwitchMapping$1[channelType.ordinal()];
                if (i == 1) {
                    arrayList2.add(Long.valueOf(d3));
                } else if (i == 2) {
                    arrayList3.add(Long.valueOf(d3));
                }
            }
        }
        ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Long.valueOf(((Peer) it2.next()).d));
        }
        Map<Long, Group> c = n.c(j5g.u0(arrayList2, arrayList4));
        Map<Long, UserStorageModel> c2 = d.c(arrayList3);
        List t0 = j5g.t0(arrayList, d2.keySet());
        if (t0.isEmpty()) {
            t0 = null;
        }
        if (t0 != null) {
            L.F(new hn9(3, t0, arrayList));
        }
        wpp wppVar = new wpp();
        for (Peer peer : list2) {
            long j2 = peer.b;
            bdb bdbVar2 = d2.get(Long.valueOf(j2));
            if ((bdbVar2 != null ? bdbVar2.v : null) == ChannelType.PERSONAL_CHANNEL) {
                Long l4 = bdbVar2.w;
                if (l4 != null) {
                    long longValue2 = l4.longValue();
                    Serializer.c<Peer> cVar2 = Peer.CREATOR;
                    l = Long.valueOf(Peer.a.d(longValue2));
                } else {
                    l = null;
                }
                UserStorageModel userStorageModel = c2.get(l);
                if (userStorageModel != null) {
                    wppVar.p(Long.valueOf(j2), tua.b(bdbVar2, userStorageModel));
                }
            } else {
                if (bdbVar2 == null || (l2 = bdbVar2.w) == null) {
                    j = peer.d;
                } else {
                    long longValue3 = l2.longValue();
                    Serializer.c<Peer> cVar3 = Peer.CREATOR;
                    j = Peer.a.d(longValue3);
                }
                Group group = c.get(Long.valueOf(j));
                boolean z = (group != null ? group.v : null) != null;
                if (bdbVar2 == null || group == null) {
                    wppVar.a.add(Long.valueOf(j2));
                } else if (z) {
                    wppVar.b.add(Long.valueOf(j2));
                } else {
                    wppVar.p(Long.valueOf(j2), tua.a(bdbVar2, group));
                }
            }
        }
        return wppVar;
    }

    @Override // xsna.le6
    public final wpp<Long, Channel> e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.c.ordinal()];
        List<? extends Peer> list = this.b;
        if (i == 1) {
            return f(list, w2wVar);
        }
        if (i == 2) {
            return g(list, w2wVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        wpp<Long, Channel> f = f(list, w2wVar);
        if (!f.f()) {
            return f;
        }
        Collection<Long> a2 = f.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        Iterator<T> it = a2.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        f.o(g(arrayList, w2wVar));
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfb)) {
            return false;
        }
        gfb gfbVar = (gfb) obj;
        return epx.f(this.b, gfbVar.b) && this.c == gfbVar.c && this.d == gfbVar.d && epx.f(this.e, gfbVar.e);
    }

    public final wpp<Long, Channel> g(List<? extends Peer> list, w2w w2wVar) {
        efb.b bVar = (efb.b) fo50.v(new efb(list, this.d), w2wVar, "ChannelsGetByIdsCmd.ChannelsGetByIdApiCmd", 2);
        List<eeb> list2 = bVar.a;
        ProfilesSimpleInfo profilesSimpleInfo = bVar.b;
        Iterable iterable = (Iterable) new ChannelsInfoMergeTask(list2, null, false, null, null, 30).o(w2wVar);
        ArrayList arrayList = new ArrayList(c5g.u(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((bdb) it.next()).b));
        }
        if (profilesSimpleInfo.Gb()) {
            xuo0.a.getClass();
            new h1e0(profilesSimpleInfo, xuo0.a(), true).o(w2wVar);
        }
        List<eeb> list3 = list2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list3) {
            if (arrayList.contains(Long.valueOf(((eeb) obj).a.a))) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            eeb eebVar = (eeb) it2.next();
            Msg msg = eebVar.b;
            List singletonList = msg == null ? EmptyList.b : Collections.singletonList(msg);
            int i = msg != null ? msg.d : Integer.MAX_VALUE;
            boolean z = msg == null;
            long j = eebVar.a.a;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            new ChannelMsgHistoryFromServerMergeTask(Peer.a.b(j), i, singletonList, ChannelMsgHistoryFromServerMergeTask.HistorySource.API, false, z, true, 400).o(w2wVar);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list) {
            Peer peer = (Peer) obj2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    if (((eeb) it3.next()).a.a == peer.b) {
                        break;
                    }
                }
            }
            arrayList3.add(obj2);
        }
        if (arrayList3.isEmpty()) {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            L.F(new rp1(3, arrayList3, list));
        }
        return f(list, w2wVar);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetByIdsCmd(channelPeers=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return k73.c(sb, this.e, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gfb(List<? extends Peer> list, Source source, boolean z, Object obj) {
        this.b = list;
        this.c = source;
        this.d = z;
        this.e = obj;
    }
}
