package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class f24 implements qas0 {
    public final String a;

    public f24(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f24) && jl40.l(this.a, ((f24) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SetFragmentResult(autoTopupIdPaymentMethodId=", this.a, Extension.C_BRAKE);
    }
}
