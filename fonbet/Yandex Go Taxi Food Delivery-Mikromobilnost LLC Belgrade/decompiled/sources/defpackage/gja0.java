package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gja0 {
    public final String a;

    public gja0(int i) {
        this.a = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gja0) && jl40.l(this.a, ((gja0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PaymentSdkState(value=", this.a, Extension.C_BRAKE);
    }

    public gja0() {
        this(0);
    }
}
