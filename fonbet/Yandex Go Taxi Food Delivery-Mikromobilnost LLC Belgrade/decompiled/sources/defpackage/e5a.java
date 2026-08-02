package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class e5a implements g5a {
    public final String a;
    public final FormattedText b;
    public final String c;
    public final q3a d;
    public final String e;
    public final boolean f;

    public e5a(String str, FormattedText formattedText, String str2, q3a q3aVar, String str3, boolean z) {
        this.a = str;
        this.b = formattedText;
        this.c = str2;
        this.d = q3aVar;
        this.e = str3;
        this.f = z;
    }

    @Override // defpackage.g5a
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5a)) {
            return false;
        }
        e5a e5aVar = (e5a) obj;
        return jl40.l(this.a, e5aVar.a) && jl40.l(this.b, e5aVar.b) && jl40.l(this.c, e5aVar.c) && this.d.equals(e5aVar.d) && jl40.l(this.e, e5aVar.e) && this.f == e5aVar.f;
    }

    public final int hashCode() {
        String str = this.a;
        int c = unr0.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a);
        String str2 = this.c;
        return Boolean.hashCode(this.f) + unr0.b((this.d.hashCode() + ((c + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder q = xvz.q("Button(modeId=", this.a, ", title=", ", leadIconTag=", this.b);
        q.append(this.c);
        q.append(", action=");
        q.append(this.d);
        q.append(", backgroundColor=");
        return nnm.i(this.e, ", isEnabled=", Extension.C_BRAKE, q, this.f);
    }
}
