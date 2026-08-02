package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class omf {
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public omf(long j, String str, String str2, int i, int i2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = i2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omf)) {
            return false;
        }
        omf omfVar = (omf) obj;
        return this.a == omfVar.a && jl40.l(this.b, omfVar.b) && jl40.l(this.c, omfVar.c) && this.d == omfVar.d && this.e == omfVar.e && jl40.l(this.f, omfVar.f);
    }

    public final int hashCode() {
        int b = oyr.b(this.e, oyr.b(this.d, unr0.b(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31);
        String str = this.f;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder k = x4e.k("CustomUserStatusEntity(id=", this.a, ", text=", this.b);
        k.append(", emoji=");
        k.append(this.c);
        k.append(", availability=");
        k.append(this.d);
        k.append(", notificationMode=");
        k.append(this.e);
        k.append(", iconName=");
        k.append(this.f);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
