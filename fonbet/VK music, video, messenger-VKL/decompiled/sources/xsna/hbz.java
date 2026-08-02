package xsna;

/* compiled from: LinkVKBidAction.kt */
/* loaded from: classes18.dex */
public interface hbz extends kj50 {

    /* compiled from: LinkVKBidAction.kt */
    public static final class a implements hbz {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1629752479;
        }

        public final String toString() {
            return "CreateProfileClicked";
        }
    }

    /* compiled from: LinkVKBidAction.kt */
    public static final class b implements hbz {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1050027031;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: LinkVKBidAction.kt */
    public static final class c implements hbz {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1385528417;
        }

        public final String toString() {
            return "LinkProfileClicked";
        }
    }

    /* compiled from: LinkVKBidAction.kt */
    public static final class d implements hbz {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 797631162;
        }

        public final String toString() {
            return "OnBackClicked";
        }
    }

    /* compiled from: LinkVKBidAction.kt */
    public static final class e implements hbz {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1200783987;
        }

        public final String toString() {
            return "OnResume";
        }
    }

    /* compiled from: LinkVKBidAction.kt */
    public static final class f implements hbz {
        public final int b;

        public f(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.b == ((f) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnVkBidProfileClicked(index="), this.b, ')');
        }
    }
}
