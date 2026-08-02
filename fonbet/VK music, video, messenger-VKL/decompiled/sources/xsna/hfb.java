package xsna;

import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.g1e0;

/* compiled from: ChannelsGetByIdsExtCmd.kt */
/* loaded from: classes2.dex */
public final class hfb extends xl6<yeb> {
    public final List<Peer> b;
    public final Source c;
    public final boolean d = true;
    public final String e = "ChannelMsgPushInfoLoader";

    public hfb(List list, Source source) {
        this.b = list;
        this.c = source;
    }

    @Override // xsna.m2w
    public final String a() {
        if (this.c == Source.CACHE) {
            return null;
        }
        return "im-channels-load-from-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        ProfilesInfo profilesInfo;
        List<Peer> list = this.b;
        Source source = this.c;
        boolean z = this.d;
        String str = this.e;
        wpp wppVar = (wpp) w2wVar.L0(this, new gfb(list, source, z, str));
        Collection values = wppVar.c.values();
        f1e0 f1e0Var = new f1e0();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            long j = ((Channel) it.next()).b;
            Serializer.c<Peer> cVar = Peer.CREATOR;
            f1e0Var.a(Peer.a.d(j), Peer.a.f(j));
        }
        if (!f1e0Var.g()) {
            f1e0Var = null;
        }
        if (f1e0Var != null) {
            g1e0.a aVar = new g1e0.a();
            aVar.a.e(f1e0Var);
            if (source == Source.NETWORK) {
                source = Source.ACTUAL;
            }
            aVar.b = source;
            aVar.c = z;
            aVar.d = str;
            g1e0 g1e0Var = new g1e0(aVar);
            g1e0 g1e0Var2 = g1e0Var.a.g() ? g1e0Var : null;
            profilesInfo = g1e0Var2 == null ? new ProfilesInfo() : (ProfilesInfo) w2wVar.L0(this, new d1e0(g1e0Var2));
        } else {
            profilesInfo = new ProfilesInfo();
        }
        return new yeb(wppVar, profilesInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hfb)) {
            return false;
        }
        hfb hfbVar = (hfb) obj;
        return epx.f(this.b, hfbVar.b) && this.c == hfbVar.c && this.d == hfbVar.d && epx.f(this.e, hfbVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsGetByIdsExtCmd(channelPeers=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return tq.f(sb, this.e, ')');
    }
}
