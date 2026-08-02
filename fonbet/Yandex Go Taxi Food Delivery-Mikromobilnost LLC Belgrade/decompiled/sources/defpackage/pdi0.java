package defpackage;

import android.view.View;

/* loaded from: classes10.dex */
public final class pdi0 implements su31 {
    public final View b;

    public pdi0(View view) {
        this.b = view;
    }

    public final View b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdi0) && jl40.l(this.b, ((pdi0) obj).b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "RealViewSizeResolver(view=" + this.b + ", subtractPadding=true)";
    }
}
