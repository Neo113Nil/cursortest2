package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class b0m0 implements d0m0 {
    public final String a;

    public b0m0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0m0) && jl40.l(this.a, ((b0m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("RecommendationClicked(text=", this.a, Extension.C_BRAKE);
    }
}
