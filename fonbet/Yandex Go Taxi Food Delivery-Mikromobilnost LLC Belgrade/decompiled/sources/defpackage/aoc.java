package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class aoc {
    public final String a;
    public final j57 b;

    public aoc(String str, j57 j57Var) {
        this.a = str;
        this.b = j57Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoc)) {
            return false;
        }
        aoc aocVar = (aoc) obj;
        return jl40.l(this.a, aocVar.a) && jl40.l(this.b, aocVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j57 j57Var = this.b;
        return hashCode + (j57Var == null ? 0 : j57Var.hashCode());
    }

    public final String toString() {
        return "CommonDocumentEntity(url=" + this.a + ", buttonsGroup=" + this.b + Extension.C_BRAKE;
    }
}
