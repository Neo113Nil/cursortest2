package xsna;

/* compiled from: LinkVKBidPatch.kt */
/* loaded from: classes18.dex */
public interface qbz extends xl50 {

    /* compiled from: LinkVKBidPatch.kt */
    public static final class a implements qbz {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -957334545;
        }

        public final String toString() {
            return "ButtonLoad";
        }
    }

    /* compiled from: LinkVKBidPatch.kt */
    public static final class b implements qbz {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 4281379;
        }

        public final String toString() {
            return "DisableButton";
        }
    }

    /* compiled from: LinkVKBidPatch.kt */
    public static final class c implements qbz {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 155241624;
        }

        public final String toString() {
            return "FullScreenLoad";
        }
    }

    /* compiled from: LinkVKBidPatch.kt */
    public static final class d implements qbz {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectVkBidProfile(index="), this.b, ')');
        }
    }

    /* compiled from: LinkVKBidPatch.kt */
    public static final class e implements qbz {
        public final Exception b;

        public e(Exception exc) {
            this.b = exc;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b.equals(((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetFailure(exception=" + this.b + ')';
        }
    }

    /* compiled from: LinkVKBidPatch.kt */
    public static final class f implements qbz {
        public final afu0 b;
        public final boolean c;

        public f(afu0 afu0Var, boolean z) {
            this.b = afu0Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && this.c == fVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetVkBidUserData(data=");
            sb.append(this.b);
            sb.append(", isLinkButtonEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: LinkVKBidPatch.kt */
    public static final class g implements qbz {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 230729372;
        }

        public final String toString() {
            return "WaitingForUpdate";
        }
    }
}
