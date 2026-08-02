package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bbk0 implements ebk0 {
    public final String a;

    public bbk0(String str) {
        this.a = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "select_preferred_tips";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbk0) && jl40.l(this.a, ((bbk0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SelectPreferred(value=", this.a, Extension.C_BRAKE);
    }
}
