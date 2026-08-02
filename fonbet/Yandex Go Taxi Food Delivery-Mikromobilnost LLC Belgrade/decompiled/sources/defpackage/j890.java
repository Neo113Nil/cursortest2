package defpackage;

import com.yandex.div.core.view2.divs.widgets.DivPagerIndicatorView;

/* loaded from: classes.dex */
public final class j890 {
    public final DivPagerIndicatorView a;
    public final t1l b;

    public j890(DivPagerIndicatorView divPagerIndicatorView, t1l t1lVar) {
        this.a = divPagerIndicatorView;
        this.b = t1lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j890) {
            j890 j890Var = (j890) obj;
            return jl40.l(this.a, j890Var.a) && this.b == j890Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IndicatorData(indicator=" + this.a + ", pagerDiv=" + this.b + ')';
    }
}
