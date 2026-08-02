package xsna;

import java.util.ArrayList;

/* compiled from: AdvertBannerState.kt */
/* loaded from: classes2.dex */
public final class l31 {
    public final g08 a;
    public final omk0 b;
    public final ArrayList c;
    public final String d;

    public l31(g08 g08Var, omk0 omk0Var, ArrayList arrayList, String str) {
        this.a = g08Var;
        this.b = omk0Var;
        this.c = arrayList;
        this.d = str;
    }

    public final omk0 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l31)) {
            return false;
        }
        l31 l31Var = (l31) obj;
        return epx.f(this.a, l31Var.a) && this.b.equals(l31Var.b) && this.c.equals(l31Var.c) && epx.f(this.d, l31Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qr.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdvertBannerState(bookmakerState=");
        sb.append(this.a);
        sb.append(", pixels=");
        sb.append(this.b);
        sb.append(", menuChoices=");
        sb.append(this.c);
        sb.append(", baseAdUrl=");
        return ho8.a(sb, this.d, ')');
    }
}
