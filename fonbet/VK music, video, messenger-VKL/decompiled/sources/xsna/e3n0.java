package xsna;

import com.vk.tabbar.core.api.domain.TabbarSuggestState;
import java.util.ArrayList;

/* compiled from: SuggestInfoUi.kt */
/* loaded from: classes6.dex */
public final class e3n0 {
    public final TabbarSuggestState a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final ArrayList g;

    public e3n0(TabbarSuggestState tabbarSuggestState, int i, int i2, int i3, String str, String str2, ArrayList arrayList) {
        this.a = tabbarSuggestState;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3n0)) {
            return false;
        }
        e3n0 e3n0Var = (e3n0) obj;
        return this.a == e3n0Var.a && this.b == e3n0Var.b && this.c == e3n0Var.c && this.d == e3n0Var.d && epx.f(this.e, e3n0Var.e) && this.f.equals(e3n0Var.f) && this.g.equals(e3n0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + urd0.a(urd0.a(shy.a(this.d, shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestInfoUi(tabbarSuggestState=");
        sb.append(this.a);
        sb.append(", currentTabIndex=");
        sb.append(this.b);
        sb.append(", recommendedTabIndex=");
        sb.append(this.c);
        sb.append(", replacementNameId=");
        sb.append(this.d);
        sb.append(", recommendedName=");
        sb.append(this.e);
        sb.append(", recommendedSubtitle=");
        sb.append(this.f);
        sb.append(", icons=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.g);
    }
}
