package defpackage;

import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ms8 implements rs8 {
    public final qs8 a;
    public final boolean b;
    public final int c;
    public final List d;
    public final String e;
    public final float f;

    public ms8(qs8 qs8Var, boolean z, int i, List list) {
        this.a = qs8Var;
        this.b = z;
        this.c = i;
        this.d = list;
        ns8 ns8Var = (ns8) a.S(i, list);
        this.e = ns8Var != null ? ns8Var.b : "1x";
        ns8 ns8Var2 = (ns8) a.S(i, list);
        this.f = ns8Var2 != null ? ns8Var2.a : 1.0f;
    }

    public static ms8 b(ms8 ms8Var, boolean z, int i, List list, int i2) {
        qs8 qs8Var = ms8Var.a;
        if ((i2 & 2) != 0) {
            z = ms8Var.b;
        }
        if ((i2 & 4) != 0) {
            i = ms8Var.c;
        }
        if ((i2 & 8) != 0) {
            list = ms8Var.d;
        }
        return new ms8(qs8Var, z, i, list);
    }

    @Override // defpackage.rs8
    public final qs8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms8)) {
            return false;
        }
        ms8 ms8Var = (ms8) obj;
        return this.a.equals(ms8Var.a) && this.b == ms8Var.b && this.c == ms8Var.c && jl40.l(this.d, ms8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, unr0.e(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Active(step=" + this.a + ", isFlashOn=" + this.b + ", selectedLensIndex=" + this.c + ", availableLenses=" + this.d + Extension.C_BRAKE;
    }
}
