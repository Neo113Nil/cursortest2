package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;

/* compiled from: CameraPosition.kt */
/* loaded from: classes18.dex */
public final class gk9 {
    public final Coordinates a;
    public final vm00 b;

    public gk9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk9)) {
            return false;
        }
        gk9 gk9Var = (gk9) obj;
        return epx.f(this.a, gk9Var.a) && epx.f(this.b, gk9Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CameraPosition(coordinates=" + this.a + ", zoom=" + this.b + ')';
    }

    public gk9(Coordinates coordinates, vm00 vm00Var) {
        this.a = coordinates;
        this.b = vm00Var;
    }

    public gk9(int i) {
        this(Coordinates.d, vm00.b);
    }
}
