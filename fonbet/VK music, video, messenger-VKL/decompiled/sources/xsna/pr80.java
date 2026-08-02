package xsna;

import android.view.View;

/* compiled from: OpenMessagesHistorySpanExtra.kt */
/* loaded from: classes2.dex */
public final class pr80 {
    public final View a;
    public final int b;
    public final int c;

    public pr80(int i, int i2, View view) {
        this.a = view;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr80)) {
            return false;
        }
        pr80 pr80Var = (pr80) obj;
        return epx.f(this.a, pr80Var.a) && this.b == pr80Var.b && this.c == pr80Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenMessagesHistorySpanExtra(view=");
        sb.append(this.a);
        sb.append(", renderedMessagesCount=");
        sb.append(this.b);
        sb.append(", adapterMessagesCount=");
        return vu5.b(sb, this.c, ')');
    }
}
