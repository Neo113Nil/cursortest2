package xsna;

import com.vk.ecomm.reviews.model.sort.ReviewsSort;

/* compiled from: ReviewEvent.kt */
/* loaded from: classes18.dex */
public final class dhg0 implements bhg0 {
    public final ReviewsSort a;

    public dhg0(ReviewsSort reviewsSort) {
        this.a = reviewsSort;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dhg0) && this.a == ((dhg0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSortItemClick(sort=" + this.a + ')';
    }
}
