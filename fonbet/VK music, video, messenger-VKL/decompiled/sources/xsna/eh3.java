package xsna;

/* compiled from: ArchiveChannelsViewAction.kt */
/* loaded from: classes15.dex */
public abstract class eh3 implements kj50 {

    /* compiled from: ArchiveChannelsViewAction.kt */
    public static final class a extends eh3 {
        public static final a b = new a();
    }

    /* compiled from: ArchiveChannelsViewAction.kt */
    public static final class b extends eh3 {
        public static final b b = new b();
    }

    /* compiled from: ArchiveChannelsViewAction.kt */
    public static final class c extends eh3 {
        public static final c b = new c();
    }

    /* compiled from: ArchiveChannelsViewAction.kt */
    public static final class d extends eh3 {
        public final long b;
        public final u8m c;

        public d(long j, u8m u8mVar) {
            this.b = j;
            this.c = u8mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "OnSelectedChannelAction(channelId=" + this.b + ", action=" + this.c + ')';
        }
    }

    /* compiled from: ArchiveChannelsViewAction.kt */
    public static final class e extends eh3 {
        public final long b;

        public e(long j) {
            this.b = j;
        }
    }

    /* compiled from: ArchiveChannelsViewAction.kt */
    public static final class f extends eh3 {
        public final long b;

        public f(long j) {
            this.b = j;
        }
    }

    /* compiled from: ArchiveChannelsViewAction.kt */
    public static final class g extends eh3 {
    }

    /* compiled from: ArchiveChannelsViewAction.kt */
    public static final class h extends eh3 {
        public final long b;

        public h(long j) {
            this.b = j;
        }
    }
}
