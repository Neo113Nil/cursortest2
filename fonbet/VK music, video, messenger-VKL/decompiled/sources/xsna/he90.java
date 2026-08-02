package xsna;

import com.vkontakte.android.R;

/* compiled from: PaginationReviewsErrorItem.kt */
/* loaded from: classes18.dex */
public final class he90 implements hfz {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he90)) {
            return false;
        }
        ((he90) obj).getClass();
        return true;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.liblists_retry) + (Integer.hashCode(R.string.liblists_err_text) * 31);
    }

    public final String toString() {
        return "PaginationReviewsErrorItem(errorText=2131958055, retryButtonText=2131958056)";
    }
}
