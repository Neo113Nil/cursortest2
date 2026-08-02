package androidx.recyclerview.widget;

import android.view.View;
import defpackage.unr0;

/* loaded from: classes.dex */
public final class u {
    public d0 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public u() {
        c();
    }

    public final void a() {
        boolean z = this.d;
        d0 d0Var = this.a;
        this.c = z ? d0Var.g() : d0Var.k();
    }

    public final void b(int i, View view) {
        int m = this.a.m();
        if (m >= 0) {
            boolean z = this.d;
            d0 d0Var = this.a;
            if (z) {
                this.c = this.a.m() + d0Var.b(view);
            } else {
                this.c = d0Var.e(view);
            }
            this.b = i;
            return;
        }
        this.b = i;
        boolean z2 = this.d;
        d0 d0Var2 = this.a;
        if (!z2) {
            int e = d0Var2.e(view);
            int k = e - this.a.k();
            this.c = e;
            if (k > 0) {
                int g = (this.a.g() - Math.min(0, (this.a.g() - m) - this.a.b(view))) - (this.a.c(view) + e);
                if (g < 0) {
                    this.c -= Math.min(k, -g);
                    return;
                }
                return;
            }
            return;
        }
        int g2 = (d0Var2.g() - m) - this.a.b(view);
        this.c = this.a.g() - g2;
        if (g2 > 0) {
            int c = this.c - this.a.c(view);
            int k2 = this.a.k();
            int min = c - (Math.min(this.a.e(view) - k2, 0) + k2);
            if (min < 0) {
                this.c = Math.min(g2, -min) + this.c;
            }
        }
    }

    public final void c() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
        sb.append(this.b);
        sb.append(", mCoordinate=");
        sb.append(this.c);
        sb.append(", mLayoutFromEnd=");
        sb.append(this.d);
        sb.append(", mValid=");
        return unr0.u(sb, this.e, '}');
    }
}
