package xsna;

import android.view.View;
import android.widget.ImageView;

/* compiled from: ReviewEvent.kt */
/* loaded from: classes18.dex */
public interface bhg0 {

    /* compiled from: ReviewEvent.kt */
    public static final class a implements bhg0 {
        public final View a;

        public a(ImageView imageView) {
            this.a = imageView;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return br.b(new StringBuilder("OnActionButtonClick(requireView="), this.a, ')');
        }
    }

    /* compiled from: ReviewEvent.kt */
    public static final class b implements bhg0 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnGalleryImageClick(imagePosition="), this.a, ')');
        }
    }

    /* compiled from: ReviewEvent.kt */
    public static final class c implements bhg0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1387581293;
        }

        public final String toString() {
            return "OnPaginationErrorRetryButtonClick";
        }
    }

    /* compiled from: ReviewEvent.kt */
    public static final class d implements bhg0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -71272919;
        }

        public final String toString() {
            return "OnPinReviewTooltipClick";
        }
    }

    /* compiled from: ReviewEvent.kt */
    public static final class e implements bhg0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2096111076;
        }

        public final String toString() {
            return "OnPinReviewTooltipDisposed";
        }
    }

    /* compiled from: ReviewEvent.kt */
    public static final class f implements bhg0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1105482713;
        }

        public final String toString() {
            return "OnReplyClick";
        }
    }

    /* compiled from: ReviewEvent.kt */
    public static final class g implements bhg0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1399632352;
        }

        public final String toString() {
            return "OnReviewTextExpandClick";
        }
    }

    /* compiled from: ReviewEvent.kt */
    public static final class h implements bhg0 {
        public final int a;
        public final long b;

        public h(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && this.b == hVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnShowAllReviewReplies(reviewId=");
            sb.append(this.a);
            sb.append(", productId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: ReviewEvent.kt */
    public static final class i implements bhg0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 850515956;
        }

        public final String toString() {
            return "OnUserClick";
        }
    }
}
