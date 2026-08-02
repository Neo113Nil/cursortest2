package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class duk0 implements kuk0 {
    public final String a;

    public duk0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof duk0) && jl40.l(this.a, ((duk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DiscountUrlClicked(url=", this.a, Extension.C_BRAKE);
    }
}
