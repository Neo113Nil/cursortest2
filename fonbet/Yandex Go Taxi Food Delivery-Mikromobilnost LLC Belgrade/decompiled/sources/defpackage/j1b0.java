package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class j1b0 implements k1b0 {
    public final String a;

    public j1b0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1b0) && jl40.l(this.a, ((j1b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SharedPersistable(storageKey=", this.a, Extension.C_BRAKE);
    }
}
