package xsna;

import xsna.tlo0;

/* compiled from: CommunityReviewsEmptyStateViewModel.kt */
/* loaded from: classes18.dex */
public final class uyh {
    public final tlo0.f a;
    public final tlo0 b;
    public final boolean c;
    public final boolean d;

    public uyh(tlo0.f fVar, tlo0.f fVar2, boolean z, boolean z2) {
        this.a = fVar;
        this.b = fVar2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyh)) {
            return false;
        }
        uyh uyhVar = (uyh) obj;
        return this.a.equals(uyhVar.a) && epx.f(this.b, uyhVar.b) && this.c == uyhVar.c && this.d == uyhVar.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        tlo0 tlo0Var = this.b;
        return Boolean.hashCode(this.d) + qoy.b((hashCode + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityReviewsEmptyStateViewModel(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", isActionButtonVisible=");
        sb.append(this.c);
        sb.append(", isFaqShow=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
