package xsna;

import java.util.ArrayList;

/* compiled from: AuthorHeaderPicturePager.kt */
/* loaded from: classes5.dex */
public final class d85 {
    public final mc90 a;
    public final bc90 b;
    public final ArrayList c;
    public final la5 d;
    public final ka5 e;
    public final fb5 f;

    public d85(mc90 mc90Var, bc90 bc90Var, ArrayList arrayList, la5 la5Var, ka5 ka5Var, fb5 fb5Var) {
        this.a = mc90Var;
        this.b = bc90Var;
        this.c = arrayList;
        this.d = la5Var;
        this.e = ka5Var;
        this.f = fb5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d85)) {
            return false;
        }
        d85 d85Var = (d85) obj;
        return epx.f(this.a, d85Var.a) && this.b.equals(d85Var.b) && this.c.equals(d85Var.c) && epx.f(this.d, d85Var.d) && epx.f(this.e, d85Var.e) && this.f.equals(d85Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qr.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorHeaderCarouselParams(pagerState=");
        sb.append(this.a);
        sb.append(", pagerSettings=");
        sb.append(this.b);
        sb.append(", mediaItems=");
        kr.d(this.c, sb, ", paginationState=");
        sb.append(this.d);
        sb.append(", paginationCallbacks=");
        sb.append(this.e);
        sb.append(", presentation=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
