package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class as90 {
    public final String a;
    public final String b;

    public as90(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as90)) {
            return false;
        }
        as90 as90Var = (as90) obj;
        return this.a.equals(as90Var.a) && this.b.equals(as90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Paths(workingDirectoryPath=", this.a, ", temporaryDirectoryPath=", this.b, Extension.C_BRAKE);
    }
}
