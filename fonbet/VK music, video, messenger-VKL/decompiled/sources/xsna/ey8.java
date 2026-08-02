package xsna;

import java.util.ArrayList;

/* compiled from: CachedCatalogState.kt */
/* loaded from: classes17.dex */
public final class ey8 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final boolean d;

    public ey8(int i, int i2, ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey8)) {
            return false;
        }
        ey8 ey8Var = (ey8) obj;
        return this.a.equals(ey8Var.a) && this.b == ey8Var.b && this.c == ey8Var.c && this.d == ey8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CachedCatalogState(sections=");
        sb.append(this.a);
        sb.append(", loadedCount=");
        sb.append(this.b);
        sb.append(", allCount=");
        sb.append(this.c);
        sb.append(", hasNotifications=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
