package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;

/* compiled from: ViewPagerAnalyticsData.kt */
/* loaded from: classes16.dex */
public final class kzt0 {
    public final UIBlock a;
    public final UIBlock b;
    public final boolean c;
    public final int d;

    public kzt0(UIBlock uIBlock, UIBlock uIBlock2, boolean z, int i) {
        this.a = uIBlock;
        this.b = uIBlock2;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzt0)) {
            return false;
        }
        kzt0 kzt0Var = (kzt0) obj;
        return this.a.equals(kzt0Var.a) && this.b.equals(kzt0Var.b) && this.c == kzt0Var.c && this.d == kzt0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewPagerAnalyticsData(previousBlock=");
        sb.append(this.a);
        sb.append(", currentBlock=");
        sb.append(this.b);
        sb.append(", isSwitchToSection=");
        sb.append(this.c);
        sb.append(", tabPosition=");
        return vu5.b(sb, this.d, ')');
    }
}
