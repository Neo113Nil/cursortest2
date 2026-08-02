package xsna;

/* compiled from: PinReviewManageServiceAction.kt */
/* loaded from: classes18.dex */
public interface rma0 extends lj50 {

    /* compiled from: PinReviewManageServiceAction.kt */
    public static final class a implements rma0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1081454184;
        }

        public final String toString() {
            return "OnBackButtonClick";
        }
    }

    /* compiled from: PinReviewManageServiceAction.kt */
    public static final class b implements rma0 {
        public final String b;

        public b(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("OnLinkClick(link="), this.b, ')');
        }
    }

    /* compiled from: PinReviewManageServiceAction.kt */
    public static final class c implements rma0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1122329871;
        }

        public final String toString() {
            return "OnResumeSubscription";
        }
    }

    /* compiled from: PinReviewManageServiceAction.kt */
    public static final class d implements rma0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1231798389;
        }

        public final String toString() {
            return "OnRetryButtonClick";
        }
    }

    /* compiled from: PinReviewManageServiceAction.kt */
    public static final class e implements rma0 {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1515516754;
        }

        public final String toString() {
            return "OnSuspendSubscription";
        }
    }
}
