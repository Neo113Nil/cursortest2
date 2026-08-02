package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class pl21 {
    public static final pl21 c;
    public static final pl21 d;
    public final boolean a;
    public final mug b;

    static {
        mug mugVar = mug.k;
        c = new pl21(false, mugVar);
        d = new pl21(true, mugVar);
    }

    public pl21(boolean z, mug mugVar) {
        this.a = z;
        this.b = mugVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl21)) {
            return false;
        }
        pl21 pl21Var = (pl21) obj;
        return this.a == pl21Var.a && jl40.l(this.b, pl21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "UserDebtsState(isLoaded=" + this.a + ", debtsInfo=" + this.b + Extension.C_BRAKE;
    }
}
