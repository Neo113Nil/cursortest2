package xsna;

/* compiled from: BirthdaysListClickAction.kt */
/* loaded from: classes15.dex */
public interface ka7 {

    /* compiled from: BirthdaysListClickAction.kt */
    public static final class a implements ka7 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1392302692;
        }

        public final String toString() {
            return "OpenProfile";
        }
    }

    /* compiled from: BirthdaysListClickAction.kt */
    public static final class b implements ka7 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 245333098;
        }

        public final String toString() {
            return "OpenWishlist";
        }
    }

    /* compiled from: BirthdaysListClickAction.kt */
    public static final class c implements ka7 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1320541037;
        }

        public final String toString() {
            return "SendGift";
        }
    }

    /* compiled from: BirthdaysListClickAction.kt */
    public static final class d implements ka7 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1704958524;
        }

        public final String toString() {
            return "SendMessage";
        }
    }

    /* compiled from: BirthdaysListClickAction.kt */
    public static final class e implements ka7 {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("SendScheduledGift(scheduledDate="), this.a, ')');
        }
    }
}
