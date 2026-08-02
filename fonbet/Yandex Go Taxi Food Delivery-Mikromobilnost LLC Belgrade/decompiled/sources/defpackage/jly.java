package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class jly {
    public final String a;
    public final String b;
    public final int c;
    public final String d;

    public jly(String str, String str2, int i, String str3) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jly)) {
            return false;
        }
        jly jlyVar = (jly) obj;
        return this.a.equals(jlyVar.a) && this.b.equals(jlyVar.b) && this.c == jlyVar.c && this.d.equals(jlyVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return xvz.h(this.c, ", method=", this.d, Extension.C_BRAKE, b64.v("LinkedCardInfo(cardSuffix=", this.a, ", cardSystem=", this.b, ", cvvDigitsCount="));
    }
}
