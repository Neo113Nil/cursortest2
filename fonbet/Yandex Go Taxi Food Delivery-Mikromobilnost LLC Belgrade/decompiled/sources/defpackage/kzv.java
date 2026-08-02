package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kzv implements rzv {
    public final v2u a;
    public final k7z b;
    public final boolean c;

    public kzv(v2u v2uVar, k7z k7zVar, boolean z) {
        this.a = v2uVar;
        this.b = k7zVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzv)) {
            return false;
        }
        kzv kzvVar = (kzv) obj;
        return jl40.l(this.a, kzvVar.a) && jl40.l(this.b, kzvVar.b) && this.c == kzvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Accept(key=");
        sb.append(this.a);
        sb.append(", location=");
        sb.append(this.b);
        sb.append(", referenceChecked=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
