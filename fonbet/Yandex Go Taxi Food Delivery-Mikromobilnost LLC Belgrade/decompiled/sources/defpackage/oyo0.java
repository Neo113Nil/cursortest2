package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class oyo0 implements qyo0 {
    public final String a;

    public /* synthetic */ oyo0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oyo0) {
            return jl40.l(this.a, ((oyo0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Pending(purchaseId=", this.a, Extension.C_BRAKE);
    }
}
