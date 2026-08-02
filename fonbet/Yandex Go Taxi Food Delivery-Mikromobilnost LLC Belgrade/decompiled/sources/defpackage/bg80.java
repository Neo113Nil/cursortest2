package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bg80 extends lg80 {
    public final String b;

    public bg80(String str) {
        super(str);
        this.b = str;
    }

    @Override // defpackage.lg80
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bg80) && jl40.l(this.b, ((bg80) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return oyr.p("Custom(mode=", this.b, Extension.C_BRAKE);
    }
}
