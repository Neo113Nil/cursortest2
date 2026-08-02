package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ctu0 implements spl {
    public final String a;

    public ctu0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctu0) && jl40.l(this.a, ((ctu0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("StringDivViewType(viewType=", this.a, Extension.C_BRAKE);
    }
}
