package xsna;

import android.util.SparseArray;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;

/* compiled from: MsgHistoryCacheInfo.kt */
/* loaded from: classes2.dex */
public final class ij30 {
    public final yj30 a;
    public final List<lj30> b;
    public final lj30 c;
    public final lj30 d;
    public final gkx0 e;
    public final SparseArray<Msg> f;
    public final int g;

    public ij30(yj30 yj30Var, List<lj30> list, lj30 lj30Var, lj30 lj30Var2, gkx0 gkx0Var, SparseArray<Msg> sparseArray, int i) {
        this.a = yj30Var;
        this.b = list;
        this.c = lj30Var;
        this.d = lj30Var2;
        this.e = gkx0Var;
        this.f = sparseArray;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij30)) {
            return false;
        }
        ij30 ij30Var = (ij30) obj;
        return epx.f(this.a, ij30Var.a) && epx.f(this.b, ij30Var.b) && epx.f(this.c, ij30Var.c) && epx.f(this.d, ij30Var.d) && epx.f(this.e, ij30Var.e) && epx.f(this.f, ij30Var.f) && this.g == ij30Var.g;
    }

    public final int hashCode() {
        yj30 yj30Var = this.a;
        int a = fw3.a((yj30Var == null ? 0 : yj30Var.hashCode()) * 31, 31, this.b);
        lj30 lj30Var = this.c;
        int hashCode = (a + (lj30Var == null ? 0 : lj30Var.hashCode())) * 31;
        lj30 lj30Var2 = this.d;
        return Integer.hashCode(this.g) + ((this.f.hashCode() + bh10.a((hashCode + (lj30Var2 != null ? lj30Var2.hashCode() : 0)) * 31, 31, this.e.b)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgHistoryCacheInfo(\nserverIsEmpty=");
        sb.append(this.a);
        sb.append(", \n history=");
        sb.append(j5g.g0(this.b, "\n", null, null, 0, null, 62));
        sb.append("\n historyEntryBefore=");
        sb.append(this.c);
        sb.append(",\n historyEntryAfter=");
        sb.append(this.d);
        sb.append(",\n historyAnchor=");
        sb.append(this.e);
        sb.append(",\n phase=");
        return h5s.c(this.g, ")\n", sb);
    }
}
