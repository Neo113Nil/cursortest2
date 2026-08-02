package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hks {
    public static final hks c = new hks(0);
    public final String a;
    public final boolean b;

    public hks(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hks)) {
            return false;
        }
        hks hksVar = (hks) obj;
        return jl40.l(this.a, hksVar.a) && this.b == hksVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("FullscreenSuggestsNextButtonState(text=", this.a, ", isVisible=", this.b, Extension.C_BRAKE);
    }

    public hks() {
        this(0);
    }

    public /* synthetic */ hks(int i) {
        this("", false);
    }
}
