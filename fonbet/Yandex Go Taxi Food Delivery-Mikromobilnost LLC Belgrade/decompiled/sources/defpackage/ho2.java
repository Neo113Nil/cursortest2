package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class ho2 extends io2 {
    public final Object a;
    public final fo2 b;

    public ho2(Object obj, fo2 fo2Var) {
        this.a = obj;
        this.b = fo2Var;
    }

    @Override // defpackage.io2
    public final fo2 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho2)) {
            return false;
        }
        ho2 ho2Var = (ho2) obj;
        return jl40.l(this.a, ho2Var.a) && this.b.equals(ho2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(value=" + this.a + ", extras=" + this.b + Extension.C_BRAKE;
    }
}
