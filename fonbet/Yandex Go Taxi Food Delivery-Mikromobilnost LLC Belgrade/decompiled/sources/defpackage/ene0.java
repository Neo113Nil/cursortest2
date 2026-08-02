package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* loaded from: classes10.dex */
public final class ene0 {
    public final Rect a;
    public final Size b;
    public final Size c;

    public ene0(Rect rect, Size size, Size size2) {
        this.a = rect;
        this.b = size;
        this.c = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ene0)) {
            return false;
        }
        ene0 ene0Var = (ene0) obj;
        return this.a.equals(ene0Var.a) && jl40.l(this.b, ene0Var.b) && jl40.l(this.c, ene0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}
