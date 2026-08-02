package xsna;

/* compiled from: ChannelMonetizationPatch.kt */
/* loaded from: classes16.dex */
public interface f4b extends xl50 {

    /* compiled from: ChannelMonetizationPatch.kt */
    public static final class a implements f4b {
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final g4b e;

        public a(boolean z, boolean z2, boolean z3, g4b g4bVar) {
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = g4bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            return "Init(isDonutEnabled=" + this.b + ", isEditDonutAvailable=" + this.c + ", isOneTimePaymentsEnabled=" + this.d + ", payoutType=" + this.e + ')';
        }
    }

    /* compiled from: ChannelMonetizationPatch.kt */
    public static final class b implements f4b {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1726682927;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ChannelMonetizationPatch.kt */
    public static final class c implements f4b {
        public final boolean b;
        public final boolean c;

        public c(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaidReactionToggled(isPaidReactionEnabled=");
            sb.append(this.b);
            sb.append(", isOneTimePaymentsEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ChannelMonetizationPatch.kt */
    public static final class d implements f4b {
        public final boolean b;
        public final int c;

        public d(boolean z, int i) {
            this.b = z;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PaidReactionUpdated(isEnabled=");
            sb.append(this.b);
            sb.append(", cost=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
