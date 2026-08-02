package xsna;

import com.vk.channels.api.ChannelFilter;

/* compiled from: ChannelsHistoryDataSource.kt */
/* loaded from: classes.dex */
public interface rfb {

    /* compiled from: ChannelsHistoryDataSource.kt */
    /* loaded from: classes16.dex */
    public static abstract class a {

        /* compiled from: ChannelsHistoryDataSource.kt */
        /* renamed from: xsna.rfb$a$a, reason: collision with other inner class name */
        public static final class C3607a extends a {
            public final ChannelFilter a;
            public final int b = 10;

            public C3607a(ChannelFilter channelFilter) {
                this.a = channelFilter;
            }

            public final ChannelFilter a() {
                return this.a;
            }

            public final int b() {
                return this.b;
            }
        }

        /* compiled from: ChannelsHistoryDataSource.kt */
        public static final class b extends a {
            public final aeb a;
            public final ChannelFilter b;
            public final int c;

            public b(aeb aebVar, ChannelFilter channelFilter, int i) {
                this.a = aebVar;
                this.b = channelFilter;
                this.c = i;
            }

            public final ChannelFilter a() {
                return this.b;
            }

            public final int b() {
                return this.c;
            }

            public final aeb c() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Weight(weight=");
                sb.append(this.a);
                sb.append(", filter=");
                sb.append(this.b);
                sb.append(", limit=");
                return vu5.b(sb, this.c, ')');
            }
        }
    }

    sfb a(a aVar) throws Exception;

    void b(a.b bVar) throws Exception;
}
