package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class f8t0 {
    public static final f8t0 c = new f8t0("", "");
    public final String a;
    public final String b;

    public f8t0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8t0)) {
            return false;
        }
        f8t0 f8t0Var = (f8t0) obj;
        return this.a.equals(f8t0Var.a) && jl40.l(this.b, f8t0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("SomethingWrongOnboardingScreenUiState(screenTitle=", this.a, ", imageTag=", this.b, Extension.C_BRAKE);
    }
}
