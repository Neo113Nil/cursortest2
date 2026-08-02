package defpackage;

import com.yandex.go.taxi.summary.api.map.model.PointsVisiblePriority;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class iyb {
    public final Float a;
    public final PointsVisiblePriority b;
    public final g0c0 c;
    public final g0c0 d;
    public final boolean e;

    public iyb(Float f, PointsVisiblePriority pointsVisiblePriority, g0c0 g0c0Var, g0c0 g0c0Var2, boolean z) {
        this.a = f;
        this.b = pointsVisiblePriority;
        this.c = g0c0Var;
        this.d = g0c0Var2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyb)) {
            return false;
        }
        iyb iybVar = (iyb) obj;
        return jl40.l(this.a, iybVar.a) && this.b == iybVar.b && jl40.l(this.c, iybVar.c) && jl40.l(this.d, iybVar.d) && this.e == iybVar.e;
    }

    public final int hashCode() {
        Float f = this.a;
        int hashCode = (this.b.hashCode() + ((f == null ? 0 : f.hashCode()) * 31)) * 31;
        g0c0 g0c0Var = this.c;
        int hashCode2 = (hashCode + (g0c0Var == null ? 0 : g0c0Var.hashCode())) * 31;
        g0c0 g0c0Var2 = this.d;
        return Boolean.hashCode(this.e) + ((hashCode2 + (g0c0Var2 != null ? g0c0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClarifyPointConfig(minVisibleZoom=");
        sb.append(this.a);
        sb.append(", visiblePriority=");
        sb.append(this.b);
        sb.append(", sourceState=");
        sb.append(this.c);
        sb.append(", destinationState=");
        sb.append(this.d);
        sb.append(", isDestinationHidden=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public iyb() {
        this(null, PointsVisiblePriority.BOTH, null, null, false);
    }
}
