package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.MsgFromChannel;
import java.util.List;
import java.util.Map;

/* compiled from: ChannelsListLoader.kt */
/* loaded from: classes16.dex */
public interface ogb extends pgb<a, b> {

    /* compiled from: ChannelsListLoader.kt */
    public static final class a {
        public final List<Channel> a;
        public final Object b;
        public final ProfilesInfo c;
        public final List<dcf0> d;
        public final int e;
        public final boolean f;
        public final boolean g;

        public a(List<Channel> list, Map<Long, MsgFromChannel> map, ProfilesInfo profilesInfo, List<dcf0> list2, int i, boolean z, boolean z2) {
            this.a = list;
            this.b = map;
            this.c = profilesInfo;
            this.d = list2;
            this.e = i;
            this.f = z;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + qoy.b(shy.a(this.e, fw3.a(ur.b(this.c, vul0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelsState(channels=");
            sb.append(this.a);
            sb.append(", latestMessages=");
            sb.append(this.b);
            sb.append(", profiles=");
            sb.append(this.c);
            sb.append(", recommendations=");
            sb.append(this.d);
            sb.append(", recommendationsVersion=");
            sb.append(this.e);
            sb.append(", hasMore=");
            sb.append(this.f);
            sb.append(", updatingHistory=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: ChannelsListLoader.kt */
    public static abstract class b {

        /* compiled from: ChannelsListLoader.kt */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }
        }
    }
}
