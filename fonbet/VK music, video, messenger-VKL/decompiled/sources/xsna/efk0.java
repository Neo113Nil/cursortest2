package xsna;

import com.vk.ecomm.reviews.model.sort.ReviewsSort;

/* compiled from: SortMenuItem.kt */
/* loaded from: classes18.dex */
public final class efk0 implements hfz {
    public final ReviewsSort b;
    public final int c;
    public final boolean d;

    public efk0(ReviewsSort reviewsSort, int i, boolean z) {
        this.b = reviewsSort;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof efk0)) {
            return false;
        }
        efk0 efk0Var = (efk0) obj;
        return this.b == efk0Var.b && this.c == efk0Var.c && this.d == efk0Var.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SortMenuItem(sort=");
        sb.append(this.b);
        sb.append(", sortName=");
        sb.append(this.c);
        sb.append(", isSelected=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
