package xsna;

import com.vk.im.engine.models.channels.ChannelType;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CacheEngineChannelsProvider.kt */
/* loaded from: classes2.dex */
public final class lw8 {
    public final w2w a;

    /* compiled from: CacheEngineChannelsProvider.kt */
    public static final class a {
        public final List<bdb> a;
        public final boolean b;
        public final boolean c;

        public a(List<bdb> list, boolean z, boolean z2) {
            this.a = list;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelsHistoryRaw(history=");
            sb.append(this.a);
            sb.append(", hasBeforeInCache=");
            sb.append(this.b);
            sb.append(", hasAfterInCache=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: CacheEngineChannelsProvider.kt */
    public static final class b {
        public final List<bdb> a;
        public final Object b;
        public final Set<Long> c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public b(List<bdb> list, Map<Long, ? extends Msg> map, Set<Long> set, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = list;
            this.b = map;
            this.c = set;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + qoy.b(qoy.b(qoy.b(fw3.b(vul0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChannelsHistoryStructure(history=");
            sb.append(this.a);
            sb.append(", latestMessages=");
            sb.append(this.b);
            sb.append(", expiredChannelIds=");
            sb.append(this.c);
            sb.append(", hasHistoryAfter=");
            sb.append(this.d);
            sb.append(", hasHistoryAfterCached=");
            sb.append(this.e);
            sb.append(", hasHistoryBefore=");
            sb.append(this.f);
            sb.append(", hasHistoryBeforeCached=");
            return defpackage.q0.a(sb, this.g, ')');
        }
    }

    /* compiled from: CacheEngineChannelsProvider.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChannelType.values().length];
            try {
                iArr[ChannelType.PERSONAL_CHANNEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public lw8(w2w w2wVar) {
        this.a = w2wVar;
    }
}
