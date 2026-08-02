package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.state.DashboardPromoBannerType;

/* loaded from: classes14.dex */
public final class khw {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final DashboardPromoBannerType e;
    public final String f;
    public final faw g;
    public final String h;

    public khw(String str, String str2, String str3, String str4, DashboardPromoBannerType dashboardPromoBannerType, String str5, faw fawVar, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = dashboardPromoBannerType;
        this.f = str5;
        this.g = fawVar;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khw)) {
            return false;
        }
        khw khwVar = (khw) obj;
        return jl40.l(this.a, khwVar.a) && jl40.l(this.b, khwVar.b) && this.c.equals(khwVar.c) && this.d.equals(khwVar.d) && this.e == khwVar.e && jl40.l(this.f, khwVar.f) && this.g.equals(khwVar.g) && jl40.l(this.h, khwVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        int hashCode2 = (this.g.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.h;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
