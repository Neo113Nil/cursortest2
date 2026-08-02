package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kcu implements lcu {
    public final CharSequence a;
    public final String b;

    public kcu(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcu)) {
            return false;
        }
        kcu kcuVar = (kcu) obj;
        return jl40.l(this.a, kcuVar.a) && this.b.equals(kcuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Ready(description=" + ((Object) this.a) + ", contentDescription=" + this.b + Extension.C_BRAKE;
    }
}
