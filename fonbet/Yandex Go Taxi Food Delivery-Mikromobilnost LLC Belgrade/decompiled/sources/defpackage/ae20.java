package defpackage;

import android.graphics.PointF;
import java.util.AbstractList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ae20 implements yd20 {
    public final List a;
    public final PointF b;
    public final PointF c;

    public ae20(AbstractList abstractList, PointF pointF, PointF pointF2) {
        this.a = abstractList;
        this.b = pointF;
        this.c = pointF2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae20)) {
            return false;
        }
        ae20 ae20Var = (ae20) obj;
        return jl40.l(this.a, ae20Var.a) && this.b.equals(ae20Var.b) && this.c.equals(ae20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Linear(colors=" + this.a + ", startPoint=" + this.b + ", endPoint=" + this.c + Extension.C_BRAKE;
    }
}
