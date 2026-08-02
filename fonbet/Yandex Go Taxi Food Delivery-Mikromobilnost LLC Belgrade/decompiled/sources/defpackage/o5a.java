package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class o5a implements n5a {
    public final CharSequence a;
    public final kdc b;

    public o5a(CharSequence charSequence, kdc kdcVar) {
        this.a = charSequence;
        this.b = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5a)) {
            return false;
        }
        o5a o5aVar = (o5a) obj;
        return jl40.l(this.a, o5aVar.a) && this.b.equals(o5aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderLabelUiState(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
