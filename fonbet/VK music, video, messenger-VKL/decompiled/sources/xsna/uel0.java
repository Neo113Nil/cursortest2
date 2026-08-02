package xsna;

import android.view.View;

/* compiled from: StickyDateListController.kt */
/* loaded from: classes2.dex */
public final class uel0 {
    public final View a;
    public final int b;

    public uel0(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uel0)) {
            return false;
        }
        uel0 uel0Var = (uel0) obj;
        return epx.f(this.a, uel0Var.a) && this.b == uel0Var.b;
    }

    public final int hashCode() {
        View view = this.a;
        return Integer.hashCode(this.b) + ((view == null ? 0 : view.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickyDateData(view=");
        sb.append(this.a);
        sb.append(", position=");
        return vu5.b(sb, this.b, ')');
    }
}
