package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ArchiveChannelsNavigationEvent.kt */
/* loaded from: classes15.dex */
public abstract class bh3 implements vl50 {

    /* compiled from: ArchiveChannelsNavigationEvent.kt */
    public static final class a extends bh3 {
        public final long a;

        public a(long j) {
            this.a = j;
        }
    }

    /* compiled from: ArchiveChannelsNavigationEvent.kt */
    public static final class b extends bh3 {
        public final long a;
        public final List<u8m> b;

        public b(long j, ListBuilder listBuilder) {
            this.a = j;
            this.b = listBuilder;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenChannelActions(channelId=");
            sb.append(this.a);
            sb.append(", actions=");
            return ms9.a(')', sb, this.b);
        }
    }
}
