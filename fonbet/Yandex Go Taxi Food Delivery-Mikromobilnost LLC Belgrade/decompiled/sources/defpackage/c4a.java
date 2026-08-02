package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes.dex */
public final class c4a {
    public final FormattedText a;
    public final boolean b;
    public final String c;
    public final q3a d;

    public c4a(FormattedText formattedText, boolean z, String str, q3a q3aVar) {
        this.a = formattedText;
        this.b = z;
        this.c = str;
        this.d = q3aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4a)) {
            return false;
        }
        c4a c4aVar = (c4a) obj;
        return jl40.l(this.a, c4aVar.a) && this.b == c4aVar.b && jl40.l(this.c, c4aVar.c) && this.d.equals(c4aVar.d);
    }

    public final int hashCode() {
        int e = unr0.e(this.a.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((e + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ChargersMultiOrderHeaderButton(title=" + this.a + ", isEnabled=" + this.b + ", leadIconTag=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
