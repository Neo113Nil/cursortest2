package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class hlz {
    public final List a;
    public final int b;
    public final boolean c;
    public final cfj d;

    public hlz(List list, int i, boolean z, cfj cfjVar) {
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = cfjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlz)) {
            return false;
        }
        hlz hlzVar = (hlz) obj;
        return jl40.l(this.a, hlzVar.a) && this.b == hlzVar.b && this.c == hlzVar.c && jl40.l(this.d, hlzVar.d);
    }

    public final int hashCode() {
        int e = unr0.e(oyr.b(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        cfj cfjVar = this.d;
        return e + (cfjVar == null ? 0 : cfjVar.hashCode());
    }

    public final String toString() {
        return "LogsScreenUiState(logs=" + this.a + ", targetIndex=" + this.b + ", isMatchButtonsEnabled=" + this.c + ", dialogState=" + this.d + ')';
    }
}
