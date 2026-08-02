package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class als {
    public final String a;
    public final String b;
    public final int c;

    public als(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof als)) {
            return false;
        }
        als alsVar = (als) obj;
        return jl40.l(this.a, alsVar.a) && jl40.l(this.b, alsVar.b) && this.c == alsVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.v("FloatingTrailButton(sendImageUrl=", this.a, ", loadingImageUrl=", this.b, ", backgroundColor="));
    }
}
