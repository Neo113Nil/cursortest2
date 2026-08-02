package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class phu0 {
    public final khu0 a;
    public final boolean b;

    public /* synthetic */ phu0(int i) {
        this(new khu0(0), false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phu0)) {
            return false;
        }
        phu0 phu0Var = (phu0) obj;
        return jl40.l(this.a, phu0Var.a) && this.b == phu0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StopSelectorState(data=" + this.a + ", expandIntermediateStops=" + this.b + Extension.C_BRAKE;
    }

    public phu0(khu0 khu0Var, boolean z) {
        this.a = khu0Var;
        this.b = z;
    }

    public phu0() {
        this(0);
    }
}
