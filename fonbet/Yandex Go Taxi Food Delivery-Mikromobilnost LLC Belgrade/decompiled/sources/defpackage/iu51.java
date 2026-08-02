package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class iu51 {
    public static final iu51 c = new iu51("", null);
    public final String a;
    public final String b;

    public iu51(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu51)) {
            return false;
        }
        iu51 iu51Var = (iu51) obj;
        return jl40.l(this.a, iu51Var.a) && jl40.l(this.b, iu51Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("YbQrUiState(deeplink=", this.a, ", contentDescription=", this.b, Extension.C_BRAKE);
    }
}
