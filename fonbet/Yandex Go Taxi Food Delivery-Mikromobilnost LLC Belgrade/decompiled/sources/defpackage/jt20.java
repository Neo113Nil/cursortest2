package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jt20 {
    public final u8j0 a;
    public final u8j0 b;
    public final it20 c;
    public final String d;
    public final u8j0 e;
    public final u8j0 f;
    public final boolean g;

    public jt20(u8j0 u8j0Var, u8j0 u8j0Var2, it20 it20Var, String str, u8j0 u8j0Var3, u8j0 u8j0Var4) {
        this.a = u8j0Var;
        this.b = u8j0Var2;
        this.c = it20Var;
        this.d = str;
        this.e = u8j0Var3;
        this.f = u8j0Var4;
        this.g = (u8j0Var instanceof t8j0) || (u8j0Var2 instanceof t8j0) || (u8j0Var3 instanceof t8j0) || (u8j0Var4 instanceof t8j0);
    }

    public static jt20 a(jt20 jt20Var, u8j0 u8j0Var, u8j0 u8j0Var2, it20 it20Var, String str, u8j0 u8j0Var3, u8j0 u8j0Var4, int i) {
        if ((i & 1) != 0) {
            u8j0Var = jt20Var.a;
        }
        u8j0 u8j0Var5 = u8j0Var;
        if ((i & 2) != 0) {
            u8j0Var2 = jt20Var.b;
        }
        u8j0 u8j0Var6 = u8j0Var2;
        if ((i & 4) != 0) {
            it20Var = jt20Var.c;
        }
        it20 it20Var2 = it20Var;
        if ((i & 8) != 0) {
            str = jt20Var.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            u8j0Var3 = jt20Var.e;
        }
        u8j0 u8j0Var7 = u8j0Var3;
        if ((i & 32) != 0) {
            u8j0Var4 = jt20Var.f;
        }
        jt20Var.getClass();
        return new jt20(u8j0Var5, u8j0Var6, it20Var2, str2, u8j0Var7, u8j0Var4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jt20)) {
            return false;
        }
        jt20 jt20Var = (jt20) obj;
        return jl40.l(this.a, jt20Var.a) && jl40.l(this.b, jt20Var.b) && jl40.l(this.c, jt20Var.c) && jl40.l(this.d, jt20Var.d) && jl40.l(this.e, jt20Var.e) && jl40.l(this.f, jt20Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        it20 it20Var = this.c;
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b((hashCode + (it20Var == null ? 0 : it20Var.hashCode())) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        return "MobilePaymentSelectContactState(contacts=" + this.a + ", lastPayments=" + this.b + ", selectedContact=" + this.c + ", filterText=" + this.d + ", copiedNumber=" + this.e + ", myselfNumber=" + this.f + Extension.C_BRAKE;
    }

    public jt20() {
        this(0);
    }

    public /* synthetic */ jt20(int i) {
        this(new t8j0(), new t8j0(), null, "", new t8j0(), new t8j0());
    }
}
