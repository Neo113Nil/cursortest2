package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class l081 extends z681 {
    public final String a;
    public final Throwable b;

    public l081(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l081)) {
            return false;
        }
        l081 l081Var = (l081) obj;
        return jl40.l(this.a, l081Var.a) && jl40.l(this.b, l081Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Failure(missingAssetName=" + this.a + ", exception=" + this.b + Extension.C_BRAKE;
    }
}
