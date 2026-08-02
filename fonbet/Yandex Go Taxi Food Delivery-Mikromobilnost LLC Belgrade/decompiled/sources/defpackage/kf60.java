package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kf60 {
    public static final kf60 c = new kf60(0);
    public final boolean a;
    public final String b;

    public kf60(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kf60)) {
            return false;
        }
        kf60 kf60Var = (kf60) obj;
        return this.a == kf60Var.a && jl40.l(this.b, kf60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xvz.m("NotAllowedSourceState(showPopup=", this.a, ", textPopup=", this.b, Extension.C_BRAKE);
    }

    public kf60() {
        this(0);
    }

    public /* synthetic */ kf60(int i) {
        this(false, "");
    }
}
