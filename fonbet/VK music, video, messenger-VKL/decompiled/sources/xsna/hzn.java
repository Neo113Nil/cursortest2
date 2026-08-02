package xsna;

import com.vk.donut.design.compose.banner.DonutContentType;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public final class hzn {
    public final DonutContentType a;
    public final String b;

    public hzn(DonutContentType donutContentType, String str) {
        this.a = donutContentType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hzn)) {
            return false;
        }
        hzn hznVar = (hzn) obj;
        return this.a == hznVar.a && epx.f(this.b, hznVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutContentItem(type=");
        sb.append(this.a);
        sb.append(", text=");
        return ho8.a(sb, this.b, ')');
    }
}
