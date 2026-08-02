package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class o0n0 {
    public final d0n0 a;
    public final eci0 b;
    public final List c;
    public final k6x d;

    public o0n0(d0n0 d0n0Var, eci0 eci0Var, List list, k6x k6xVar) {
        this.a = d0n0Var;
        this.b = eci0Var;
        this.c = list;
        this.d = k6xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0n0) {
            o0n0 o0n0Var = (o0n0) obj;
            if (!jl40.l(this.a, o0n0Var.a) || this.b != o0n0Var.b) {
                return false;
            }
            EmptyList emptyList = EmptyList.a;
            if (emptyList.equals(emptyList) && jl40.l(this.c, o0n0Var.c) && jl40.l(this.d, o0n0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int c = unr0.c((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + 1) * 31, 31, this.c);
        k6x k6xVar = this.d;
        return c + (k6xVar == null ? 0 : k6xVar.hashCode());
    }

    public final String toString() {
        return "ScootersBduiScreenConfig(content=" + this.a + ", reloadRequests=" + this.b + ", customSections=" + EmptyList.a + ", actionDescriptors=" + this.c + ", jasonStateStore=" + this.d + Extension.C_BRAKE;
    }
}
