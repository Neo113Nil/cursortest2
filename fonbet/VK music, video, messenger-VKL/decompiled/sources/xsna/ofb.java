package xsna;

import com.vk.channels.api.ChannelActionInProgress;
import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.im.ImageList;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.lfb;

/* compiled from: ChannelsGetRecommendationsCmd.kt */
/* loaded from: classes2.dex */
public final class ofb extends le6<scf0> {
    public final Source b;
    public final String c;
    public final boolean d;

    /* compiled from: ChannelsGetRecommendationsCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public /* synthetic */ ofb(Source source) {
        this(source, null);
    }

    public static scf0 f(w2w w2wVar) {
        HashMap hashMap;
        Map h;
        int P = w2wVar.I0().a().P();
        if (BuildInfo.t()) {
            hashMap = w2wVar.I0().a().W();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(w2wVar.I0().a().W());
            for (bdb bdbVar : w2wVar.I0().a().d(linkedHashMap.keySet()).values()) {
                if (bdbVar.t != ChannelActionInProgress.NONE || bdbVar.m) {
                    linkedHashMap.remove(Long.valueOf(bdbVar.b));
                }
            }
            hashMap = linkedHashMap;
        }
        if (BuildInfo.t()) {
            h = jgp.b;
        } else {
            HashMap hashMap2 = (HashMap) w2wVar.I0().y().t(hashMap.keySet());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(hashMap2.size()));
            for (Map.Entry entry : hashMap2.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap2.put(key, value instanceof MsgFromChannel ? (MsgFromChannel) value : null);
            }
            h = p4g.h(linkedHashMap2);
        }
        Collection<gbb> values = hashMap.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        for (gbb gbbVar : values) {
            Long l = gbbVar.d;
            long longValue = l != null ? l.longValue() : gbbVar.b;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Long.valueOf(Peer.a.d(longValue)));
        }
        Map<Long, Group> c = w2wVar.I0().n().c(arrayList);
        wpp wppVar = new wpp();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            long longValue2 = ((Number) entry2.getKey()).longValue();
            gbb gbbVar2 = (gbb) entry2.getValue();
            Long l2 = gbbVar2.d;
            String str = gbbVar2.g;
            long longValue3 = l2 != null ? l2.longValue() : gbbVar2.b;
            String str2 = gbbVar2.f;
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            Group group = c.get(Long.valueOf(Peer.a.d(longValue3)));
            MsgFromChannel msgFromChannel = (MsgFromChannel) h.get(Long.valueOf(longValue2));
            long j = gbbVar2.c + 86400000;
            xuo0.a.getClass();
            if (j < xuo0.a()) {
                wppVar.b.add(Long.valueOf(longValue2));
            } else if (group != null) {
                Long valueOf = Long.valueOf(longValue2);
                long j2 = gbbVar2.b;
                Serializer.c<ImageList> cVar3 = ImageList.CREATOR;
                wppVar.p(valueOf, new dcf0(j2, ImageList.a.a(str2), str, group.m, group.g, msgFromChannel, gbbVar2.e));
            } else {
                Long valueOf2 = Long.valueOf(longValue2);
                long j3 = gbbVar2.b;
                Serializer.c<ImageList> cVar4 = ImageList.CREATOR;
                wppVar.p(valueOf2, new dcf0(j3, ImageList.a.a(str2), str, 0, false, msgFromChannel, gbbVar2.e));
            }
        }
        return new scf0(P, wppVar);
    }

    @Override // xsna.le6
    public final scf0 e(w2w w2wVar) {
        int i = a.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            return f(w2wVar);
        }
        if (i == 2) {
            return g(w2wVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        scf0 f = f(w2wVar);
        wpp<Long, dcf0> wppVar = f.b;
        return (wppVar.i() || wppVar.f()) ? g(w2wVar) : f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofb)) {
            return false;
        }
        ofb ofbVar = (ofb) obj;
        return this.b == ofbVar.b && epx.f(this.c, ofbVar.c) && this.d == ofbVar.d;
    }

    public final scf0 g(w2w w2wVar) {
        lfb.b bVar = (lfb.b) fo50.v(new lfb(this.d, this.c, UUID.randomUUID().toString()), w2wVar, "ChannelsGetByIdApiCmd", 2);
        List<eeb> list = bVar.a;
        long f1 = w2wVar.f1();
        List<eeb> list2 = list;
        int e = on00.e(c5g.u(list2, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (eeb eebVar : list2) {
            Long valueOf = Long.valueOf(eebVar.a.a);
            yta ytaVar = eebVar.a;
            Pair pair = new Pair(valueOf, new gbb(ytaVar.a, f1, ytaVar.g, ytaVar.l, ytaVar.b, ytaVar.c));
            linkedHashMap.put(pair.i(), pair.j());
        }
        w2wVar.I0().u(new nfb(bVar.b, linkedHashMap));
        if (!BuildInfo.t()) {
            w2wVar.I0().u(new g84(3, bVar, w2wVar));
        }
        return f(w2wVar);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetRecommendationsCmd(source=");
        sb.append(this.b);
        sb.append(", recomSource=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public ofb(Source source, String str) {
        this.b = source;
        this.c = str;
        this.d = true;
    }
}
