package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class jbx implements kbx {
    public static final ibx Companion = new ibx();
    public final String a;
    public final boolean b;

    public /* synthetic */ jbx(int i, String str, boolean z) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, hbx.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jbx) && jl40.l(this.a, ((jbx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PhotoResultSuccess(id=", this.a, Extension.C_BRAKE);
    }

    public jbx(String str) {
        this.a = str;
        this.b = true;
    }
}
