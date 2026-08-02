package xsna;

import com.vk.ecomm.storefrontservices.impl.presentation.feature.ServicesSort;

/* compiled from: StorefrontServicesState.kt */
/* loaded from: classes18.dex */
public final class ggr {
    public final boolean a;
    public final ServicesSort b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final String g;

    public ggr() {
        this(null, null, null, null, null, 127);
    }

    public static ggr a(ggr ggrVar, boolean z, String str, String str2, int i) {
        if ((i & 1) != 0) {
            z = ggrVar.a;
        }
        boolean z2 = z;
        ServicesSort servicesSort = ggrVar.b;
        Integer num = ggrVar.c;
        Integer num2 = ggrVar.d;
        if ((i & 16) != 0) {
            str = ggrVar.e;
        }
        String str3 = str;
        String str4 = ggrVar.f;
        if ((i & 64) != 0) {
            str2 = ggrVar.g;
        }
        ggrVar.getClass();
        return new ggr(z2, servicesSort, num, num2, str3, str4, str2);
    }

    public final boolean b() {
        return (this.b == ServicesSort.DEFAULT && this.c == null && this.d == null && this.e.length() <= 0 && this.f == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggr)) {
            return false;
        }
        ggr ggrVar = (ggr) obj;
        return this.a == ggrVar.a && this.b == ggrVar.b && epx.f(this.c, ggrVar.c) && epx.f(this.d, ggrVar.d) && epx.f(this.e, ggrVar.e) && epx.f(this.f, ggrVar.f) && epx.f(this.g, ggrVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int a = urd0.a((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int hashCode3 = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FiltersState(shouldShow=");
        sb.append(this.a);
        sb.append(", sort=");
        sb.append(this.b);
        sb.append(", fromPrice=");
        sb.append(this.c);
        sb.append(", toPrice=");
        sb.append(this.d);
        sb.append(", query=");
        sb.append(this.e);
        sb.append(", sectionId=");
        sb.append(this.f);
        sb.append(", currency=");
        return ho8.a(sb, this.g, ')');
    }

    public ggr(boolean z, ServicesSort servicesSort, Integer num, Integer num2, String str, String str2, String str3) {
        this.a = z;
        this.b = servicesSort;
        this.c = num;
        this.d = num2;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public /* synthetic */ ggr(ServicesSort servicesSort, Integer num, Integer num2, String str, String str2, int i) {
        this(false, (i & 2) != 0 ? ServicesSort.DEFAULT : servicesSort, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? null : str2, null);
    }
}
