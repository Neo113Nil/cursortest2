package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fjz0 extends gc5 {
    public final String c;

    public fjz0(String str) {
        super((String) null, 3);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjz0) && jl40.l(this.c, ((fjz0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("TitleViewItem(title=", this.c, Extension.C_BRAKE);
    }
}
