package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nmq0 implements omq0 {
    public final fg31 a;
    public final Map b;
    public final boolean c;

    public nmq0(fg31 fg31Var, Map map, boolean z) {
        this.a = fg31Var;
        this.b = map;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmq0)) {
            return false;
        }
        nmq0 nmq0Var = (nmq0) obj;
        return jl40.l(this.a, nmq0Var.a) && jl40.l(this.b, nmq0Var.b) && this.c == nmq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleSelectorUiState(verticalSelectorUiState=");
        sb.append(this.a);
        sb.append(", verticalsTariffs=");
        sb.append(this.b);
        sb.append(", usePager=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
