package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oex0 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public oex0(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oex0)) {
            return false;
        }
        oex0 oex0Var = (oex0) obj;
        return jl40.l(this.a, oex0Var.a) && this.b == oex0Var.b && this.c == oex0Var.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(oo31.l("TariffData(tariffClassName=", this.a, ", isDeliveryFlow=", ", hasRequirements=", this.b), this.c, Extension.C_BRAKE);
    }

    public /* synthetic */ oex0(int i) {
        this(null, false, false);
    }

    public oex0() {
        this(0);
    }
}
