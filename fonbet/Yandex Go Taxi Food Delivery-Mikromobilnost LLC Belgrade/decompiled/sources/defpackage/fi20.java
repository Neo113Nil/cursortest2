package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fi20 extends hi20 {
    public final String c;

    public fi20(String str) {
        this.c = str;
    }

    @Override // defpackage.n351
    public final String a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fi20) && jl40.l(this.c, ((fi20) obj).c);
    }

    public final int hashCode() {
        String str = this.c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Loading(id=", this.c, Extension.C_BRAKE);
    }

    public fi20() {
        this(null);
    }
}
