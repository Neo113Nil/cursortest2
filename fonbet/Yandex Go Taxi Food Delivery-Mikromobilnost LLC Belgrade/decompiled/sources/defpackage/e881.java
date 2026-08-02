package defpackage;

import java.util.AbstractList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class e881 {
    public final e881 a;
    public final sr71 b;
    public final boolean c;
    public final List d;

    public e881(e881 e881Var, sr71 sr71Var, boolean z, List list) {
        this.a = e881Var;
        this.b = sr71Var;
        this.c = z;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public static e881 a(e881 e881Var, e881 e881Var2, sr71 sr71Var, boolean z, AbstractList abstractList, int i) {
        if ((i & 1) != 0) {
            e881Var2 = e881Var.a;
        }
        if ((i & 2) != 0) {
            sr71Var = e881Var.b;
        }
        if ((i & 4) != 0) {
            z = e881Var.c;
        }
        AbstractList abstractList2 = abstractList;
        if ((i & 8) != 0) {
            abstractList2 = e881Var.d;
        }
        e881Var.getClass();
        return new e881(e881Var2, sr71Var, z, abstractList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e881)) {
            return false;
        }
        e881 e881Var = (e881) obj;
        return jl40.l(this.a, e881Var.a) && jl40.l(this.b, e881Var.b) && this.c == e881Var.c && jl40.l(this.d, e881Var.d);
    }

    public final int hashCode() {
        e881 e881Var = this.a;
        return this.d.hashCode() + unr0.e((this.b.hashCode() + ((e881Var == null ? 0 : e881Var.hashCode()) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.a + ", destination=" + this.b + ", isLoading=" + this.c + ", uiData=" + this.d + Extension.C_BRAKE;
    }
}
