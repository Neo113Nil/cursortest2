package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.Map;

/* compiled from: ChannelsSearchResult.kt */
/* loaded from: classes2.dex */
public final class mib {
    public final Map<Long, Channel> a;
    public final Map<Long, Msg> b;
    public final ProfilesSimpleInfo c;
    public final int d;

    public mib() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mib)) {
            return false;
        }
        mib mibVar = (mib) obj;
        return epx.f(this.a, mibVar.a) && epx.f(this.b, mibVar.b) && epx.f(this.c, mibVar.c) && this.d == mibVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + io.reactivex.rxjava3.subjects.c.a(this.c, v11.a(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelsSearchResult(channels=");
        sb.append(this.a);
        sb.append(", msgs=");
        sb.append(this.b);
        sb.append(", profiles=");
        sb.append(this.c);
        sb.append(", totalCount=");
        return vu5.b(sb, this.d, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public mib(Map<Long, Channel> map, Map<Long, ? extends Msg> map2, ProfilesSimpleInfo profilesSimpleInfo, int i) {
        this.a = map;
        this.b = map2;
        this.c = profilesSimpleInfo;
        this.d = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ mib(int i) {
        this(r1, r1, r3, 0);
        ProfilesSimpleInfo profilesSimpleInfo = new ProfilesSimpleInfo();
        jgp jgpVar = jgp.b;
    }
}
