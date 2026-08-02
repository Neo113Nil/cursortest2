package xsna;

/* compiled from: ObtainVerificationAction.kt */
/* loaded from: classes18.dex */
public interface mr70 extends kj50 {

    /* compiled from: ObtainVerificationAction.kt */
    public static final class a implements mr70 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1593252290;
        }

        public final String toString() {
            return "DismissModal";
        }
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class b implements mr70 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 204085259;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class c implements mr70 {
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class d implements mr70 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -2085084858;
        }

        public final String toString() {
            return "OnBackClicked";
        }
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class e implements mr70 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1510327199;
        }

        public final String toString() {
            return "OnInfoClicked";
        }
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class f implements mr70 {
        public final String b;
        public final String c;

        public f(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnLinkClicked(url=");
            sb.append(this.b);
            sb.append(", conditionName=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class g implements mr70 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -133315117;
        }

        public final String toString() {
            return "OnProceedClicked";
        }
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class h implements mr70 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1776645862;
        }

        public final String toString() {
            return "OnUnlinkClicked";
        }
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class i implements mr70 {
        public static final i b = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 625614282;
        }

        public final String toString() {
            return "RefreshData";
        }
    }

    /* compiled from: ObtainVerificationAction.kt */
    public static final class j implements mr70 {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 2047531785;
        }

        public final String toString() {
            return "ShowBidProfileModal";
        }
    }
}
