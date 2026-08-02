package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jcu implements lcu {
    public final CharSequence a;
    public final String b;

    public jcu(CharSequence charSequence, String str) {
        this.a = charSequence;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcu)) {
            return false;
        }
        jcu jcuVar = (jcu) obj;
        return jl40.l(this.a, jcuVar.a) && this.b.equals(jcuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loading(previousDescription=" + ((Object) this.a) + ", contentDescription=" + this.b + Extension.C_BRAKE;
    }
}
