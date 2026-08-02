package xsna;

import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import xsna.iib;

/* compiled from: ChannelsSearchCmd.kt */
/* loaded from: classes2.dex */
public final class kib extends le6<a> {
    public final String b;
    public final int c;
    public final int d = 25;
    public final boolean e = true;

    /* compiled from: ChannelsSearchCmd.kt */
    public static final class a {
        public final LinkedHashMap a;
        public final LinkedHashMap b;
        public final ProfilesSimpleInfo c;
        public final int d;

        public a(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ProfilesSimpleInfo profilesSimpleInfo, int i) {
            this.a = linkedHashMap;
            this.b = linkedHashMap2;
            this.c = profilesSimpleInfo;
            this.d = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + io.reactivex.rxjava3.subjects.c.a(this.c, uf3.b(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(channels=");
            sb.append(this.a);
            sb.append(", msgs=");
            sb.append(this.b);
            sb.append(", profiles=");
            sb.append(this.c);
            sb.append(", totalCount=");
            return vu5.b(sb, this.d, ')');
        }
    }

    public kib(String str, int i) {
        this.b = str;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[SYNTHETIC] */
    @Override // xsna.le6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a e(w2w w2wVar) {
        long d;
        Group group;
        iib.b bVar = (iib.b) fo50.v(new iib(this.c, this.b, UUID.randomUUID().toString(), this.d, this.e), w2wVar, "ChannelsSearchApiCmd", 2);
        List<eeb> list = bVar.a;
        ProfilesSimpleInfo profilesSimpleInfo = bVar.b;
        LinkedHashMap linkedHashMap = profilesSimpleInfo.e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (eeb eebVar : list) {
            ChannelType.a aVar = ChannelType.Companion;
            yta ytaVar = eebVar.a;
            String str = ytaVar.f;
            aVar.getClass();
            ChannelType a2 = ChannelType.a.a(str);
            Long l = ytaVar.g;
            if (l != null) {
                if (a2 != ChannelType.COMMUNITY_CHANNEL) {
                    l = null;
                }
                if (l != null) {
                    long longValue = l.longValue();
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    d = Peer.a.d(longValue);
                    group = (Group) linkedHashMap.get(Long.valueOf(d));
                    if (group == null) {
                        Channel c = tua.c(eebVar, group);
                        long j = c.b;
                        Msg msg = eebVar.b;
                        if (msg != null) {
                            linkedHashMap2.put(Long.valueOf(j), msg);
                        }
                        linkedHashMap3.put(Long.valueOf(j), c);
                    }
                }
            }
            long j2 = ytaVar.a;
            Serializer.c<Peer> cVar2 = Peer.CREATOR;
            d = Peer.a.d(j2);
            group = (Group) linkedHashMap.get(Long.valueOf(d));
            if (group == null) {
            }
        }
        return new a(linkedHashMap3, linkedHashMap2, profilesSimpleInfo, bVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kib)) {
            return false;
        }
        kib kibVar = (kib) obj;
        return epx.f(this.b, kibVar.b) && this.c == kibVar.c && this.d == kibVar.d && this.e == kibVar.e;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.e) + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsSearchCmd(query=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        sb.append(", count=");
        sb.append(this.d);
        sb.append(", awaitNetwork=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
