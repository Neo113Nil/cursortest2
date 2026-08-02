package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bca implements e6v {
    public final CharSequence a;
    public final String b;

    public bca(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bca) && jl40.l(this.a, ((bca) obj).a);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Header(title=", Extension.C_BRAKE);
    }
}
