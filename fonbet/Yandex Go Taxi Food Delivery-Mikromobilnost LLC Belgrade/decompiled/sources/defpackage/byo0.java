package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class byo0 implements cyo0 {
    public final String a;

    public /* synthetic */ byo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof byo0) {
            return jl40.l(this.a, ((byo0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(value=", this.a, Extension.C_BRAKE);
    }
}
