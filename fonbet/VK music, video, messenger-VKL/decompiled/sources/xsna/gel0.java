package xsna;

import com.vk.superapp.advertisement.api.dto.BannerSlotType;

/* compiled from: StickyBannerSlot.kt */
/* loaded from: classes6.dex */
public final class gel0 {
    public final int a;
    public final BannerSlotType b;
    public final String c;
    public final int d;

    public gel0(int i, BannerSlotType bannerSlotType, String str, int i2) {
        this.a = i;
        this.b = bannerSlotType;
        this.c = str;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gel0)) {
            return false;
        }
        gel0 gel0Var = (gel0) obj;
        return this.a == gel0Var.a && this.b == gel0Var.b && epx.f(this.c, gel0Var.c) && this.d == gel0Var.d;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return Integer.hashCode(this.d) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickyBannerSlot(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", tag=");
        sb.append(this.c);
        sb.append(", adConfigCode=");
        return vu5.b(sb, this.d, ')');
    }
}
