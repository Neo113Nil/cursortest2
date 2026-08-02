package xsna;

import xsna.tlo0;

/* compiled from: ReviewsHeaderRatingData.kt */
/* loaded from: classes18.dex */
public final class mig0 {
    public final tlo0.h a;
    public final String b;
    public final float c;
    public final int d;
    public final boolean e;

    public mig0(tlo0.h hVar, String str, float f, int i, boolean z) {
        this.a = hVar;
        this.b = str;
        this.c = f;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mig0)) {
            return false;
        }
        mig0 mig0Var = (mig0) obj;
        return this.a.equals(mig0Var.a) && epx.f(this.b, mig0Var.b) && Float.compare(this.c, mig0Var.c) == 0 && this.d == mig0Var.d && this.e == mig0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(shy.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, urd0.a(this.a.a.hashCode() * 31, 31, this.b), 31), 31), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewsHeaderRatingData(title=");
        sb.append(this.a);
        sb.append(", descriptionText=");
        sb.append(this.b);
        sb.append(", rating=");
        sb.append(this.c);
        sb.append(", reviewCount=");
        sb.append(this.d);
        sb.append(", isReviewCountVisible=true, showAdminDescription=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
