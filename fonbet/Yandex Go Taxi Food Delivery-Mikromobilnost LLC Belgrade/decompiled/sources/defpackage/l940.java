package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class l940 implements m940 {
    public final String a;

    public l940(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l940) && jl40.l(this.a, ((l940) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Loading(toolbarTitle=", this.a, Extension.C_BRAKE);
    }

    public l940() {
        this(null);
    }
}
