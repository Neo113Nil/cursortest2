package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class esm0 {
    public final String a;
    public final CharSequence b;

    public esm0(CharSequence charSequence, String str) {
        this.a = str;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esm0)) {
            return false;
        }
        esm0 esm0Var = (esm0) obj;
        return jl40.l(this.a, esm0Var.a) && jl40.l(this.b, esm0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "Item(imageTag=" + this.a + ", text=" + ((Object) this.b) + Extension.C_BRAKE;
    }
}
