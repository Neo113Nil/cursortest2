package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class mto0 {
    public final String a;
    public final String b;

    public mto0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mto0)) {
            return false;
        }
        mto0 mto0Var = (mto0) obj;
        return this.a.equals(mto0Var.a) && this.b.equals(mto0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ScootersRootAcceptItemModel(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
