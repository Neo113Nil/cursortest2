package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gfr0 {
    public final List a;
    public final boolean b;
    public final kao c;

    public gfr0(List list, boolean z, kao kaoVar) {
        this.a = list;
        this.b = z;
        this.c = kaoVar;
    }

    public final kao a() {
        return this.c;
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfr0)) {
            return false;
        }
        gfr0 gfr0Var = (gfr0) obj;
        return jl40.l(this.a, gfr0Var.a) && this.b == gfr0Var.b && jl40.l(this.c, gfr0Var.c);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        kao kaoVar = this.c;
        return e + (kaoVar == null ? 0 : kaoVar.hashCode());
    }

    public final String toString() {
        return "SettingsViewState(recyclerItems=" + this.a + ", isLoading=" + this.b + ", errorState=" + this.c + Extension.C_BRAKE;
    }
}
