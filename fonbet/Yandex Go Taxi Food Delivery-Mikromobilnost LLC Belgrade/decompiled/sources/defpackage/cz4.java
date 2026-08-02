package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class cz4 extends fz4 {
    public final String a;

    public cz4(String str) {
        this.a = str;
    }

    @Override // defpackage.fz4
    public final String a() {
        return g8e.o("HeaderItem-", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cz4) && jl40.l(this.a, ((cz4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("HeaderItem(text=", this.a, Extension.C_BRAKE);
    }
}
