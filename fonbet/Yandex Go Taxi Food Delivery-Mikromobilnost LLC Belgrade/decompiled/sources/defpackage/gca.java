package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class gca implements kca {
    public final FormattedText a;
    public final boolean b;
    public final String c;
    public final hba d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;

    public gca(FormattedText formattedText, boolean z, String str, hba hbaVar, String str2, boolean z2, boolean z3, String str3) {
        this.a = formattedText;
        this.b = z;
        this.c = str;
        this.d = hbaVar;
        this.e = str2;
        this.f = z2;
        this.g = z3;
        this.h = str3;
    }

    @Override // defpackage.kca
    public final String a() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gca)) {
            return false;
        }
        gca gcaVar = (gca) obj;
        return this.a.equals(gcaVar.a) && this.b == gcaVar.b && jl40.l(this.c, gcaVar.c) && this.d.equals(gcaVar.d) && jl40.l(this.e, gcaVar.e) && this.f == gcaVar.f && this.g == gcaVar.g && jl40.l(this.h, gcaVar.h);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(unr0.b((this.d.hashCode() + unr0.b(unr0.e(this.a.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return e + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Button(title=");
        sb.append(this.a);
        sb.append(", showTimer=");
        sb.append(this.b);
        sb.append(", leadIconTag=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", backgroundColor=");
        tse0.y(this.e, ", isEnabled=", ", isSquare=", sb, this.f);
        return n.m(", modeId=", this.h, Extension.C_BRAKE, sb, this.g);
    }
}
