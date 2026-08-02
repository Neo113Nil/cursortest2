package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dvk0 implements fvk0 {
    public final String a;
    public final String b;

    public dvk0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvk0)) {
            return false;
        }
        dvk0 dvk0Var = (dvk0) obj;
        return jl40.l(this.a, dvk0Var.a) && this.b.equals(dvk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Deeplink(deeplink=", this.a, ", analyticsName=", this.b, Extension.C_BRAKE);
    }
}
