package xsna;

import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.PinReviewDetailsScreenResult;

/* compiled from: PinReviewManageServiceEvent.kt */
/* loaded from: classes18.dex */
public interface xma0 extends pk50 {

    /* compiled from: PinReviewManageServiceEvent.kt */
    public static final class a implements xma0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -136091908;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: PinReviewManageServiceEvent.kt */
    public static final class b implements xma0 {
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
            return ho8.a(new StringBuilder("OpenLink(url="), this.a, ')');
        }
    }

    /* compiled from: PinReviewManageServiceEvent.kt */
    public static final class c implements xma0 {
        public final PinReviewDetailsScreenResult a;

        public c(PinReviewDetailsScreenResult pinReviewDetailsScreenResult) {
            this.a = pinReviewDetailsScreenResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SetResult(result=" + this.a + ')';
        }
    }
}
