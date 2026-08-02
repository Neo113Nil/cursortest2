package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n3z0 implements q3z0 {
    public final String a;

    public n3z0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n3z0) && jl40.l(this.a, ((n3z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("LinkClicked(deeplink=", this.a, Extension.C_BRAKE);
    }
}
