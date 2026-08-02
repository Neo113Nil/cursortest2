package xsna;

/* compiled from: RelatedUserPinInputAction.kt */
/* loaded from: classes6.dex */
public interface msf0 extends kj50 {

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class a implements msf0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1094097689;
        }

        public final String toString() {
            return "CancelRestorePinCode";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class b implements msf0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1410884514;
        }

        public final String toString() {
            return "CheckPinError";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class c implements msf0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1767844965;
        }

        public final String toString() {
            return "CheckPinStarted";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class d implements msf0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -145815232;
        }

        public final String toString() {
            return "CheckPinSuccessful";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class e implements msf0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -655926503;
        }

        public final String toString() {
            return "CheckPinUnsuccessful";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class f implements msf0 {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1019220691;
        }

        public final String toString() {
            return "CheckTooManyTriesError";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class g implements msf0 {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -808896821;
        }

        public final String toString() {
            return "ClearUserInput";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class h implements msf0 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1077776895;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class i implements msf0 {
        public final String b;

        public i(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("CompleteInputUser(pinText="), this.b, ')');
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class j implements msf0 {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1765307691;
        }

        public final String toString() {
            return "DontRememberUserPinClick";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class k implements msf0 {
        public final String b;

        public k(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("IncompleteInputUser(pinText="), this.b, ')');
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class l implements msf0 {
        public static final l b = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 727684137;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class m implements msf0 {
        public final String b;

        public m(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("NetworkError(message="), this.b, ')');
        }
    }

    /* compiled from: RelatedUserPinInputAction.kt */
    public static final class n implements msf0 {
        public final String b;

        public n(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenRestorePinCodeScenario(flowService="), this.b, ')');
        }
    }
}
