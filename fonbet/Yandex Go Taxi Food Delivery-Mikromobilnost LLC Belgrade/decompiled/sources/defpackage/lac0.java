package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lac0 {
    public final r5x a;
    public final j5x b;
    public final s6x c;

    public lac0(r5x r5xVar, j5x j5xVar, s6x s6xVar) {
        this.a = r5xVar;
        this.b = j5xVar;
        this.c = s6xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lac0)) {
            return false;
        }
        lac0 lac0Var = (lac0) obj;
        return this.a.equals(lac0Var.a) && this.b.equals(lac0Var.b) && this.c.equals(lac0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PlacesJasonState(path=" + this.a + ", node=" + this.b + ", tags=" + this.c + Extension.C_BRAKE;
    }
}
