package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fe {
    public final String a;
    public final boolean b;
    public final jf c;

    public fe(String str, boolean z, jf jfVar) {
        this.a = str;
        this.b = z;
        this.c = jfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        return jl40.l(this.a, feVar.a) && this.b == feVar.b && this.c.equals(feVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("ButtonUiState(title=", this.a, ", isMainButton=", ", action=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
