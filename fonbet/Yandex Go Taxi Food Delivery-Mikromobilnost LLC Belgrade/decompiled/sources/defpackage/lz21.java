package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lz21 {
    public final y6o a;

    public lz21(y6o y6oVar) {
        this.a = y6oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz21) && jl40.l(this.a, ((lz21) obj).a);
    }

    public final int hashCode() {
        y6o y6oVar = this.a;
        if (y6oVar == null) {
            return 0;
        }
        return y6oVar.hashCode();
    }

    public final String toString() {
        return "Failure(dialog=" + this.a + Extension.C_BRAKE;
    }
}
