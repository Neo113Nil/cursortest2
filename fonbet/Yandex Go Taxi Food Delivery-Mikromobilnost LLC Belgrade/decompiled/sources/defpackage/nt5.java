package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class nt5 {
    public static final mt5 Companion = new mt5();
    public final String a;
    public final vi8 b;

    public /* synthetic */ nt5(int i, String str, vi8 vi8Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, lt5.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = vi8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt5)) {
            return false;
        }
        nt5 nt5Var = (nt5) obj;
        return jl40.l(this.a, nt5Var.a) && jl40.l(this.b, nt5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BinInfoResponseDto(id=" + this.a + ", result=" + this.b + Extension.C_BRAKE;
    }
}
