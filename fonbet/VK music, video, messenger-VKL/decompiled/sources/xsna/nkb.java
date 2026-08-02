package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* compiled from: ChannelsSuggestedListLoader.kt */
/* loaded from: classes.dex */
public final class nkb {
    public final List<Channel> a;
    public final Map<Long, MsgFromChannel> b;
    public final ProfilesInfo c;
    public final int d;
    public final int e;

    public nkb() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkb)) {
            return false;
        }
        nkb nkbVar = (nkb) obj;
        return epx.f(this.a, nkbVar.a) && epx.f(this.b, nkbVar.b) && epx.f(this.c, nkbVar.c) && this.d == nkbVar.d && this.e == nkbVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, ur.b(this.c, v11.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(channels=");
        sb.append(this.a);
        sb.append(", latestMessages=");
        sb.append(this.b);
        sb.append(", profiles=");
        sb.append(this.c);
        sb.append(", visibleSize=");
        sb.append(this.d);
        sb.append(", totalSize=");
        return vu5.b(sb, this.e, ')');
    }

    public nkb(List<Channel> list, Map<Long, MsgFromChannel> map, ProfilesInfo profilesInfo, int i, int i2) {
        this.a = list;
        this.b = map;
        this.c = profilesInfo;
        this.d = i;
        this.e = i2;
    }

    public nkb(int i) {
        this(EmptyList.b, jgp.b, new ProfilesInfo(), 0, 0);
    }
}
