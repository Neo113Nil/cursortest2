package xsna;

import com.vk.games.model.GamesCatalogScreenTab;

/* compiled from: MapCatalogItemsToViewInfo.kt */
/* loaded from: classes17.dex */
public final class yj00 {
    public final boolean a;
    public final b7t b;
    public final xvy c;
    public final int d;
    public final rha e;
    public final GamesCatalogScreenTab f;

    public yj00(boolean z, b7t b7tVar, xvy xvyVar, int i, rha rhaVar, GamesCatalogScreenTab gamesCatalogScreenTab) {
        this.a = z;
        this.b = b7tVar;
        this.c = xvyVar;
        this.d = i;
        this.e = rhaVar;
        this.f = gamesCatalogScreenTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj00)) {
            return false;
        }
        yj00 yj00Var = (yj00) obj;
        return this.a == yj00Var.a && epx.f(this.b, yj00Var.b) && epx.f(this.c, yj00Var.c) && this.d == yj00Var.d && epx.f(this.e, yj00Var.e) && this.f == yj00Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + shy.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "MapCatalogItemsToViewInfo(isHighResolution=" + this.a + ", bannerSize=" + this.b + ", listState=" + this.c + ", index=" + this.d + ", catalogToggleData=" + this.e + ", tabName=" + this.f + ')';
    }
}
