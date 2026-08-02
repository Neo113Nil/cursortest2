package xsna;

import com.vk.toggle.features.ComFeatures;

/* compiled from: StorefrontServicesViewState.kt */
/* loaded from: classes18.dex */
public final class sol0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final String e;
    public final tlo0 f;
    public final ogr g;
    public final boolean h;

    public sol0(boolean z, boolean z2, boolean z3, int i, String str, tlo0 tlo0Var, ogr ogrVar) {
        ComFeatures comFeatures = ComFeatures.COM_SERVICES_SHOWCASE_SETTINGS;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = str;
        this.f = tlo0Var;
        this.g = ogrVar;
        this.h = a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sol0)) {
            return false;
        }
        sol0 sol0Var = (sol0) obj;
        return this.a == sol0Var.a && this.b == sol0Var.b && this.c == sol0Var.c && this.d == sol0Var.d && epx.f(this.e, sol0Var.e) && epx.f(this.f, sol0Var.f) && epx.f(this.g, sol0Var.g) && this.h == sol0Var.h;
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.d, qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        tlo0 tlo0Var = this.f;
        int hashCode = (a + (tlo0Var == null ? 0 : tlo0Var.hashCode())) * 31;
        ogr ogrVar = this.g;
        return Boolean.hashCode(this.h) + ((hashCode + (ogrVar != null ? ogrVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorefrontServicesTopBarState(isAdmin=");
        sb.append(this.a);
        sb.append(", isSearchAvailable=");
        sb.append(this.b);
        sb.append(", isBookmarkAvailable=");
        sb.append(this.c);
        sb.append(", bookmarksCount=");
        sb.append(this.d);
        sb.append(", query=");
        sb.append(this.e);
        sb.append(", title=");
        sb.append(this.f);
        sb.append(", filtersState=");
        sb.append(this.g);
        sb.append(", isServiceSettingToggleEnabled=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
