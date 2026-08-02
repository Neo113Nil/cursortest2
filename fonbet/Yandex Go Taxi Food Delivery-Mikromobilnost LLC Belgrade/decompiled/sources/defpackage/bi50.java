package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bi50 {
    public static final bi50 c = new bi50(0);
    public final boolean a;
    public final String b;

    public bi50(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi50)) {
            return false;
        }
        bi50 bi50Var = (bi50) obj;
        return this.a == bi50Var.a && jl40.l(this.b, bi50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("NddDoneButtonState(isActive=", this.a, ", title=", this.b, Extension.C_BRAKE);
    }

    public bi50() {
        this(0);
    }

    public /* synthetic */ bi50(int i) {
        this(false, "");
    }
}
