package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class euj extends svj {
    public final String b;

    public euj(String str) {
        super(str);
        this.b = str;
    }

    @Override // defpackage.svj
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof euj) && jl40.l(this.b, ((euj) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("Custom(sourceStr=", this.b, Extension.C_BRAKE);
    }
}
