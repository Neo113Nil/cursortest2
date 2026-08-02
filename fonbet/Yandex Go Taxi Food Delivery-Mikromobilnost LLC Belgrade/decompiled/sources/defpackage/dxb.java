package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dxb {
    public final int a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;

    public dxb(int i, CharSequence charSequence, CharSequence charSequence2, String str) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxb)) {
            return false;
        }
        dxb dxbVar = (dxb) obj;
        return this.a == dxbVar.a && jl40.l(this.b, dxbVar.b) && jl40.l(this.c, dxbVar.c) && jl40.l(this.d, dxbVar.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int hashCode3 = (hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CityTourItem(id=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", imageUrl=" + this.d + Extension.C_BRAKE;
    }
}
