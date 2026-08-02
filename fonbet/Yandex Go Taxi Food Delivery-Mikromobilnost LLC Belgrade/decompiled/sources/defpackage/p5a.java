package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class p5a implements t5a {
    public final CharSequence a;
    public final String b;
    public final q3a c;
    public final kdc d;
    public final boolean e;

    public p5a(CharSequence charSequence, String str, q3a q3aVar, kdc kdcVar, boolean z) {
        this.a = charSequence;
        this.b = str;
        this.c = q3aVar;
        this.d = kdcVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5a)) {
            return false;
        }
        p5a p5aVar = (p5a) obj;
        return jl40.l(this.a, p5aVar.a) && jl40.l(this.b, p5aVar.b) && this.c.equals(p5aVar.c) && this.d.equals(p5aVar.d) && this.e == p5aVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.e) + smw0.d(this.d, (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append((Object) this.a);
        sb.append(", leadIconUrl=");
        sb.append(this.b);
        sb.append(", action=");
        sb.append(this.c);
        sb.append(", backgroundColor=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
