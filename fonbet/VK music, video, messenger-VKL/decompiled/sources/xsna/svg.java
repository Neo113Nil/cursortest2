package xsna;

import com.vk.ecomm.checklist.impl.domain.model.CommunityCheckListTip;
import java.util.List;

/* compiled from: CommunityCheckListCategory.kt */
/* loaded from: classes18.dex */
public final class svg {
    public final String a;
    public final String b;
    public final List<CommunityCheckListTip> c;
    public final int d;
    public final int e;

    public svg(String str, String str2, List<CommunityCheckListTip> list, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof svg)) {
            return false;
        }
        svg svgVar = (svg) obj;
        return epx.f(this.a, svgVar.a) && epx.f(this.b, svgVar.b) && epx.f(this.c, svgVar.c) && this.d == svgVar.d && this.e == svgVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + shy.a(this.d, fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCheckListCategory(name=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", tips=");
        sb.append(this.c);
        sb.append(", completedTipsCount=");
        sb.append(this.d);
        sb.append(", totalTipsCount=");
        return vu5.b(sb, this.e, ')');
    }
}
