package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bo8 {
    public final u8j0 a;
    public final String b;

    public /* synthetic */ bo8(String str, int i) {
        this(new t8j0(), (i & 2) != 0 ? null : str);
    }

    public static bo8 a(bo8 bo8Var, u8j0 u8j0Var) {
        String str = bo8Var.b;
        bo8Var.getClass();
        return new bo8(u8j0Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo8)) {
            return false;
        }
        bo8 bo8Var = (bo8) obj;
        return jl40.l(this.a, bo8Var.a) && jl40.l(this.b, bo8Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CardSetStatusProcessingState(requestStatus=" + this.a + ", processingText=" + this.b + Extension.C_BRAKE;
    }

    public bo8(u8j0 u8j0Var, String str) {
        this.a = u8j0Var;
        this.b = str;
    }

    public bo8() {
        this((String) null, 3);
    }
}
