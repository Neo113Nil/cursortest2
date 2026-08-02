package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cm21 {
    public final String a;
    public final Set b;
    public final String c;

    public cm21(String str, Set set, String str2) {
        this.a = str;
        this.b = set;
        this.c = str2;
    }

    public static cm21 a(cm21 cm21Var, String str, Set set, String str2, int i) {
        if ((i & 1) != 0) {
            str = cm21Var.a;
        }
        if ((i & 2) != 0) {
            set = cm21Var.b;
        }
        if ((i & 4) != 0) {
            str2 = cm21Var.c;
        }
        cm21Var.getClass();
        return new cm21(str, set, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm21)) {
            return false;
        }
        cm21 cm21Var = (cm21) obj;
        return jl40.l(this.a, cm21Var.a) && jl40.l(this.b, cm21Var.b) && jl40.l(this.c, cm21Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int e = g8e.e(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserFeedback(selectedItemId=");
        sb.append(this.a);
        sb.append(", selectedOptionsIds=");
        sb.append(this.b);
        sb.append(", comment=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }

    public cm21() {
        this(0);
    }

    public /* synthetic */ cm21(int i) {
        this(null, EmptySet.a, null);
    }
}
