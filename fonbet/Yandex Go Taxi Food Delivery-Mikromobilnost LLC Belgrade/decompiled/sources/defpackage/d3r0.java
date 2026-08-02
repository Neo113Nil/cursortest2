package defpackage;

import kotlinx.serialization.json.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes.dex */
public final class d3r0 extends kr {
    public static final c3r0 Companion = new c3r0();
    public final a a;
    public final boolean b;

    public /* synthetic */ d3r0(int i, a aVar, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, b3r0.a.getDescriptor());
            throw null;
        }
        this.a = aVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3r0)) {
            return false;
        }
        d3r0 d3r0Var = (d3r0) obj;
        return jl40.l(this.a, d3r0Var.a) && this.b == d3r0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetGlobalDivVariablesAction(variables=" + this.a + ", replaceExisting=" + this.b + Extension.C_BRAKE;
    }
}
