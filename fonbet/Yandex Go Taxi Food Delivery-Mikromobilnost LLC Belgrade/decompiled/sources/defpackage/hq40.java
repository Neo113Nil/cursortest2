package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hq40 {
    public final boolean a;
    public final String b;

    public hq40(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq40)) {
            return false;
        }
        hq40 hq40Var = (hq40) obj;
        return this.a == hq40Var.a && jl40.l(this.b, hq40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("MulticlassTariffDisabledInfo(isDisabled=", this.a, ", description=", this.b, Extension.C_BRAKE);
    }

    public /* synthetic */ hq40() {
        this(false, "");
    }
}
