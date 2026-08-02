package yads;

import java.lang.ref.WeakReference;
import xsna.epx;

/* loaded from: classes10.dex */
public final class n83 {
    public final WeakReference a;
    public final g93 b;
    public final vc3 c;

    public n83(WeakReference weakReference, g93 g93Var, vc3 vc3Var) {
        this.a = weakReference;
        this.b = g93Var;
        this.c = vc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n83)) {
            return false;
        }
        n83 n83Var = (n83) obj;
        return epx.f(this.a, n83Var.a) && epx.f(this.b, n83Var.b) && epx.f(this.c, n83Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TrackNoticeObject(manager=" + this.a + ", notice=" + this.b + ", validationResult=" + this.c + ")";
    }
}
