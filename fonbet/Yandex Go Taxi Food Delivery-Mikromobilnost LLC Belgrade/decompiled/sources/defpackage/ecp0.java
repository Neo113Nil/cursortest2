package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ecp0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final ArrayList f;

    public ecp0(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, ArrayList arrayList) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = charSequence4;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ecp0)) {
            return false;
        }
        ecp0 ecp0Var = (ecp0) obj;
        return jl40.l(this.a, ecp0Var.a) && jl40.l(this.b, ecp0Var.b) && jl40.l(this.c, ecp0Var.c) && jl40.l(this.d, ecp0Var.d) && jl40.l(this.e, ecp0Var.e) && this.f.equals(ecp0Var.f);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (b + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.e;
        return this.f.hashCode() + ((hashCode2 + (charSequence3 != null ? charSequence3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "ScreenContent(imageUrl=", this.a, ", title=", ", subtitle=");
        vfc.A(t, this.c, ", statusText=", this.d, ", eulaText=");
        t.append((Object) this.e);
        t.append(", buttons=");
        t.append(this.f);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
