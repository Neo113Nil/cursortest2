package xsna;

import com.vk.dto.profile.Address;

/* compiled from: CommunityPlaceItemModel.kt */
/* loaded from: classes5.dex */
public final class uch extends s4h {
    public final String b;
    public final String c;
    public final Address d;
    public final String e;
    public final double f;
    public final double g;
    public final String h;
    public final int i;

    public uch(String str, String str2, Address address, String str3, double d, double d2, String str4, int i) {
        this.b = str;
        this.c = str2;
        this.d = address;
        this.e = str3;
        this.f = d;
        this.g = d2;
        this.h = str4;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uch)) {
            return false;
        }
        uch uchVar = (uch) obj;
        return epx.f(this.b, uchVar.b) && epx.f(this.c, uchVar.c) && epx.f(this.d, uchVar.d) && epx.f(this.e, uchVar.e) && Double.compare(this.f, uchVar.f) == 0 && Double.compare(this.g, uchVar.g) == 0 && epx.f(this.h, uchVar.h) && this.i == uchVar.i;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Address address = this.d;
        int hashCode3 = (hashCode2 + (address == null ? 0 : address.hashCode())) * 31;
        String str3 = this.e;
        int b = zjh0.b(this.g, zjh0.b(this.f, (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        String str4 = this.h;
        return Integer.hashCode(this.i) + ((b + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityPlaceItemModel(place=");
        sb.append(this.b);
        sb.append(", bigPhoto=");
        sb.append(this.c);
        sb.append(", address=");
        sb.append(this.d);
        sb.append(", city=");
        sb.append(this.e);
        sb.append(", lat=");
        sb.append(this.f);
        sb.append(", lon=");
        sb.append(this.g);
        sb.append(", fullName=");
        sb.append(this.h);
        sb.append(", addressesCount=");
        return vu5.b(sb, this.i, ')');
    }
}
