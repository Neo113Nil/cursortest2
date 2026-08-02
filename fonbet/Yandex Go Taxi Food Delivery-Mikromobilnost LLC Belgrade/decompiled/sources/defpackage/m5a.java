package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class m5a implements n5a {
    public final CharSequence a;
    public final boolean b;
    public final String c;
    public final q3a d;

    public m5a(CharSequence charSequence, boolean z, String str, q3a q3aVar) {
        this.a = charSequence;
        this.b = z;
        this.c = str;
        this.d = q3aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5a)) {
            return false;
        }
        m5a m5aVar = (m5a) obj;
        return jl40.l(this.a, m5aVar.a) && this.b == m5aVar.b && jl40.l(this.c, m5aVar.c) && this.d.equals(m5aVar.d);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "HeaderButtonUiState(text=" + ((Object) this.a) + ", isEnabled=" + this.b + ", leadIconUrl=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
