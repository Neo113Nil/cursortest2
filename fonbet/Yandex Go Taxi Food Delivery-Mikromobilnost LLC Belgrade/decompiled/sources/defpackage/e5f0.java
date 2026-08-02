package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e5f0 extends r5a1 {
    public final String a;

    public e5f0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5f0) && jl40.l(this.a, ((e5f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenWithDeeplink(deeplink=", this.a, Extension.C_BRAKE);
    }
}
