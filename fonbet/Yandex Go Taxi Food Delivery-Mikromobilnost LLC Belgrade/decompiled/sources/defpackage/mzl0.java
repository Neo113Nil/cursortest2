package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mzl0 {
    public final boolean a;
    public final String b;

    public mzl0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzl0)) {
            return false;
        }
        mzl0 mzl0Var = (mzl0) obj;
        return this.a == mzl0Var.a && this.b.equals(mzl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("SaveAutoFundInfo(enabled=", this.a, ", amount=", this.b, Extension.C_BRAKE);
    }
}
