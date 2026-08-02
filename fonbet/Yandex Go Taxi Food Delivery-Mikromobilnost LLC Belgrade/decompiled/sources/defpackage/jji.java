package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jji extends kji {
    public final n7v a;

    public jji(n7v n7vVar) {
        this.a = n7vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jji) && jl40.l(this.a, ((jji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + Extension.C_BRAKE;
    }
}
