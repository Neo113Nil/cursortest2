package xsna;

import com.vk.tabbar.core.api.domain.TabbarItem;
import com.vk.tabbar.core.api.domain.TabbarSuggestState;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SuggestInfo.kt */
/* loaded from: classes6.dex */
public final class d3n0 {
    public final TabbarSuggestState a;
    public final ArrayList b;
    public final List<TabbarItem> c;
    public final int d;
    public final int e;
    public final int f;
    public final String g;
    public final String h;
    public final ArrayList i;

    public d3n0(TabbarSuggestState tabbarSuggestState, ArrayList arrayList, List list, int i, int i2, int i3, String str, String str2, ArrayList arrayList2) {
        this.a = tabbarSuggestState;
        this.b = arrayList;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str;
        this.h = str2;
        this.i = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3n0)) {
            return false;
        }
        d3n0 d3n0Var = (d3n0) obj;
        return this.a == d3n0Var.a && this.b.equals(d3n0Var.b) && epx.f(this.c, d3n0Var.c) && this.d == d3n0Var.d && this.e == d3n0Var.e && this.f == d3n0Var.f && epx.f(this.g, d3n0Var.g) && this.h.equals(d3n0Var.h) && this.i.equals(d3n0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + urd0.a(urd0.a(shy.a(this.f, shy.a(this.e, shy.a(this.d, fw3.a(qr.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31), 31), 31), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestInfo(tabbarSuggestState=");
        sb.append(this.a);
        sb.append(", tabbarSuggestSaveItems=");
        sb.append(this.b);
        sb.append(", tabbarSuggestReceivedItems=");
        sb.append(this.c);
        sb.append(", currentTabIndex=");
        sb.append(this.d);
        sb.append(", recommendedTabIndex=");
        sb.append(this.e);
        sb.append(", replacementNameId=");
        sb.append(this.f);
        sb.append(", recommendedName=");
        sb.append(this.g);
        sb.append(", recommendedSubtitle=");
        sb.append(this.h);
        sb.append(", icons=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.i);
    }
}
