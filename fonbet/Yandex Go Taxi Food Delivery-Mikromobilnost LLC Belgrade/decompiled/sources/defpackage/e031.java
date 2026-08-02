package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e031 implements f031 {
    public final y6o a;

    public e031(y6o y6oVar) {
        this.a = y6oVar;
    }

    public final y6o a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e031) && jl40.l(this.a, ((e031) obj).a);
    }

    public final int hashCode() {
        y6o y6oVar = this.a;
        if (y6oVar == null) {
            return 0;
        }
        return y6oVar.hashCode();
    }

    public final String toString() {
        return "TechnicalError(dialog=" + this.a + Extension.C_BRAKE;
    }

    public /* synthetic */ e031(int i) {
        this((y6o) null);
    }

    public e031() {
        this((y6o) null);
    }
}
