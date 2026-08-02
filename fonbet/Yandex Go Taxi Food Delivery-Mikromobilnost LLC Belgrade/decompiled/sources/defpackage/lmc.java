package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lmc extends n351 {
    public final String c;

    public lmc(String str) {
        super("comment-key", false, 14);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lmc) && jl40.l(this.c, ((lmc) obj).c);
    }

    public final int hashCode() {
        String str = this.c;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("CommentModel(text=", this.c, Extension.C_BRAKE);
    }
}
