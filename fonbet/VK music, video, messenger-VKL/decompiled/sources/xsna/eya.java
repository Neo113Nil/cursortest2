package xsna;

/* compiled from: ChannelDonutSupportPatch.kt */
/* loaded from: classes16.dex */
public interface eya extends xl50 {

    /* compiled from: ChannelDonutSupportPatch.kt */
    public static final class a implements eya {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1799679111;
        }

        public final String toString() {
            return "ConnectSuccess";
        }
    }

    /* compiled from: ChannelDonutSupportPatch.kt */
    public static final class b implements eya {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: ChannelDonutSupportPatch.kt */
    public static final class c implements eya {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1105474165;
        }

        public final String toString() {
            return "GlobalLoading";
        }
    }

    /* compiled from: ChannelDonutSupportPatch.kt */
    public static final class d implements eya {
        public final f0o b;

        public d(f0o f0oVar) {
            this.b = f0oVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            f0o f0oVar = this.b;
            if (f0oVar == null) {
                return 0;
            }
            return f0oVar.hashCode();
        }

        public final String toString() {
            return "Init(levelLimit=" + this.b + ')';
        }
    }

    /* compiled from: ChannelDonutSupportPatch.kt */
    public static final class e implements eya {
        public final String b;

        public e(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NameChanged(name="), this.b, ')');
        }
    }

    /* compiled from: ChannelDonutSupportPatch.kt */
    public static final class f implements eya {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1573603599;
        }

        public final String toString() {
            return "NameValidationFailed";
        }
    }

    /* compiled from: ChannelDonutSupportPatch.kt */
    public static final class g implements eya {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1557045027;
        }

        public final String toString() {
            return "OperationLoading";
        }
    }

    /* compiled from: ChannelDonutSupportPatch.kt */
    public static final class h implements eya {
        public final String b;

        public h(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("PriceChanged(price="), this.b, ')');
        }
    }
}
