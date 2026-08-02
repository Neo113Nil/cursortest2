package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class avk0 implements nqs0 {
    public final String a;

    public avk0(String str) {
        this.a = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "open_url";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avk0) && jl40.l(this.a, ((avk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("OpenUrl(url=", this.a, Extension.C_BRAKE);
    }
}
