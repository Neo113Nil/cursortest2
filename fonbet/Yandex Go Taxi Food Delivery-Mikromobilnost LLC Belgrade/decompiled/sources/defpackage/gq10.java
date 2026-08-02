package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gq10 {
    public final u8j0 a;
    public final u8j0 b;
    public final List c;
    public final String d;

    public gq10(u8j0 u8j0Var, u8j0 u8j0Var2, List list, String str) {
        this.a = u8j0Var;
        this.b = u8j0Var2;
        this.c = list;
        this.d = str;
    }

    public static gq10 a(gq10 gq10Var, u8j0 u8j0Var, u8j0 u8j0Var2, List list, String str, int i) {
        if ((i & 1) != 0) {
            u8j0Var = gq10Var.a;
        }
        if ((i & 2) != 0) {
            u8j0Var2 = gq10Var.b;
        }
        if ((i & 4) != 0) {
            list = gq10Var.c;
        }
        if ((i & 8) != 0) {
            str = gq10Var.d;
        }
        gq10Var.getClass();
        return new gq10(u8j0Var, u8j0Var2, list, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq10)) {
            return false;
        }
        gq10 gq10Var = (gq10) obj;
        return jl40.l(this.a, gq10Var.a) && jl40.l(this.b, gq10Var.b) && jl40.l(this.c, gq10Var.c) && jl40.l(this.d, gq10Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        u8j0 u8j0Var = this.b;
        int c = unr0.c((hashCode + (u8j0Var == null ? 0 : u8j0Var.hashCode())) * 31, 31, this.c);
        String str = this.d;
        return c + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MerchantOffersSearchState(requestSuggests=");
        sb.append(this.a);
        sb.append(", requestOffersInit=");
        sb.append(this.b);
        sb.append(", requestOffersNext=");
        return n.l(", query=", this.d, Extension.C_BRAKE, sb, this.c);
    }

    public gq10() {
        this(0);
    }

    public /* synthetic */ gq10(int i) {
        this(new t8j0(), null, EmptyList.a, null);
    }
}
