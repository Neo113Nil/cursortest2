package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class l1a implements p1a {
    public final cy9 a;

    public l1a(cy9 cy9Var) {
        this.a = cy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1a) && this.a.equals(((l1a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.m("Failed(chargersErrorDetails=", this.a, Extension.C_BRAKE);
    }
}
