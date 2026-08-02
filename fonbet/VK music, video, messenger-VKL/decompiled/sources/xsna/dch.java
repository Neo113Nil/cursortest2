package xsna;

import com.vk.dto.common.Image;

/* compiled from: CommunityPartnerBannerItem.kt */
/* loaded from: classes18.dex */
public final class dch implements hfz {
    public final String b;
    public final String c;
    public final Image d;
    public final String e;
    public final String f;

    public dch(String str, String str2, String str3, String str4, Image image) {
        this.b = str;
        this.c = str2;
        this.d = image;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dch)) {
            return false;
        }
        dch dchVar = (dch) obj;
        return epx.f(this.b, dchVar.b) && epx.f(this.c, dchVar.c) && epx.f(this.d, dchVar.d) && epx.f(this.e, dchVar.e) && epx.f(this.f, dchVar.f);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.d;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        String str3 = this.e;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        return hashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityPartnerBannerItem(header=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", image=");
        sb.append(this.d);
        sb.append(", url=");
        sb.append(this.e);
        sb.append(", trackCode=");
        return ho8.a(sb, this.f, ')');
    }
}
