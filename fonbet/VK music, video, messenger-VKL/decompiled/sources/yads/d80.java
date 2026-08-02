package yads;

import xsna.epx;
import xsna.ss9;

/* loaded from: classes10.dex */
public final class d80 {
    public final String a;
    public final String b;

    public d80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return epx.f(this.a, d80Var.a) && epx.f(this.b, d80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return ss9.a("DebugPanelMediationAdapterParameterData(name=", this.a, ", value=", this.b, ")");
    }
}
