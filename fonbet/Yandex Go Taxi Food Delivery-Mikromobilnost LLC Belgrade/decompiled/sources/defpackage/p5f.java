package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class p5f implements l5f {
    public final String a;

    public p5f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p5f) && jl40.l(this.a, ((p5f) obj).a);
    }

    @Override // defpackage.q5f
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SavedMessagesChatItem(id=", this.a, Extension.C_BRAKE);
    }
}
