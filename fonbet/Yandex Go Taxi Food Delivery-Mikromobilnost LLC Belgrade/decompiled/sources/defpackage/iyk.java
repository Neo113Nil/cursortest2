package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class iyk {
    public final boolean a;
    public final int b;
    public final int c;

    public iyk(boolean z, int i, int i2) {
        this.a = z;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iyk)) {
            return false;
        }
        iyk iykVar = (iyk) obj;
        return this.a == iykVar.a && this.b == iykVar.b && this.c == iykVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, xvz.p("DivKitSnippetCacheParams(isEnabled=", this.b, ", maxTypeCount=", ", maxViewCountBySize=", this.a));
    }
}
