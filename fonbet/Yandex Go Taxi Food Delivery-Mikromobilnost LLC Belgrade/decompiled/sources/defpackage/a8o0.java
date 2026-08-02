package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class a8o0 implements c8o0 {
    public final String a;

    public /* synthetic */ a8o0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a8o0) {
            return jl40.l(this.a, ((a8o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SelectPackage(packageId=", this.a, Extension.C_BRAKE);
    }
}
