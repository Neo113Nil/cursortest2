package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class e9k0 implements ibk0 {
    public final String a;

    public e9k0(String str) {
        this.a = str;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "change_additional_payment";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9k0) && jl40.l(this.a, ((e9k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ChangePrice(price=", this.a, Extension.C_BRAKE);
    }
}
