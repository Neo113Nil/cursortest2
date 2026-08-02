package defpackage;

import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class f6w {
    public static final f6w e = new f6w(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public f6w(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final long a() {
        return (((b() / 2) + this.b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (((d() / 2) + this.a) << 32);
    }

    public final int b() {
        return this.d - this.b;
    }

    public final long c() {
        return (this.a << 32) | (this.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public final int d() {
        return this.c - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6w)) {
            return false;
        }
        f6w f6wVar = (f6w) obj;
        return this.a == f6wVar.a && this.b == f6wVar.b && this.c == f6wVar.c && this.d == f6wVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRect.fromLTRB(");
        sb.append(this.a);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.c);
        sb.append(Extension.FIX_SPACE);
        return oyr.s(sb, this.d, ')');
    }
}
