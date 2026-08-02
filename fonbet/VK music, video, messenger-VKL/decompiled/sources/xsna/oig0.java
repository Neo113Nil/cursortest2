package xsna;

/* compiled from: ReviewsModalBottomSheetAction.kt */
/* loaded from: classes18.dex */
public interface oig0 {

    /* compiled from: ReviewsModalBottomSheetAction.kt */
    public static final class a implements oig0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -548178264;
        }

        public final String toString() {
            return "OnCloseButtonClick";
        }
    }

    /* compiled from: ReviewsModalBottomSheetAction.kt */
    public static final class b implements oig0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnFaqButtonClick(faqButtonLink="), this.a, ')');
        }
    }

    /* compiled from: ReviewsModalBottomSheetAction.kt */
    public static final class c implements oig0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1881756126;
        }

        public final String toString() {
            return "OnPrimaryButtonClick";
        }
    }

    /* compiled from: ReviewsModalBottomSheetAction.kt */
    public static final class d implements oig0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -664999764;
        }

        public final String toString() {
            return "OnSecondaryButtonClick";
        }
    }
}
