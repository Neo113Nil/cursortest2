package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class n9j {
    public final String a;
    public final bpl0 b;

    public n9j(String str, bpl0 bpl0Var) {
        this.a = str;
        this.b = bpl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n9j)) {
            return false;
        }
        n9j n9jVar = (n9j) obj;
        return this.a.equals(n9jVar.a) && this.b.equals(n9jVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DetailsUiState(title=" + this.a + ", requirements=" + this.b + Extension.C_BRAKE;
    }
}
