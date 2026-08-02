package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oiz0 extends n351 {
    public final String c;
    public final String d;

    public oiz0(String str, String str2) {
        super("title-description", false, 14);
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oiz0)) {
            return false;
        }
        oiz0 oiz0Var = (oiz0) obj;
        return jl40.l(this.c, oiz0Var.c) && jl40.l(this.d, oiz0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("TitleDescriptionModel(title=", this.c, ", description=", this.d, Extension.C_BRAKE);
    }
}
