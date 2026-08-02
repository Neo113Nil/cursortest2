package xsna;

import com.vk.donut.design.compose.banner.InfoBannerIcon;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class gvw {
    public final InfoBannerIcon a;
    public final String b;

    public gvw(InfoBannerIcon infoBannerIcon, String str) {
        this.a = infoBannerIcon;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvw)) {
            return false;
        }
        gvw gvwVar = (gvw) obj;
        return this.a == gvwVar.a && epx.f(this.b, gvwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InfoBanner(icon=");
        sb.append(this.a);
        sb.append(", subhead=");
        return ho8.a(sb, this.b, ')');
    }
}
