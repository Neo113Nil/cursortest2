package defpackage;

import android.view.View;

/* loaded from: classes14.dex */
public final class m9k0 {
    public final View a;
    public final int b;
    public final int c;

    public m9k0(View view, int i, int i2) {
        this.a = view;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9k0)) {
            return false;
        }
        m9k0 m9k0Var = (m9k0) obj;
        return jl40.l(this.a, m9k0Var.a) && this.b == m9k0Var.b && this.c == m9k0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(8388661) + oyr.b(this.c, oyr.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopupShowParams(fromView=");
        sb.append(this.a);
        sb.append(", offsetX=");
        sb.append(this.b);
        sb.append(", offsetY=");
        return oyr.m(this.c, ", gravity=8388661)", sb);
    }
}
