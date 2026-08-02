package xsna;

import java.util.ArrayList;

/* compiled from: ViewState.kt */
/* loaded from: classes7.dex */
public final class s39 {
    public final ArrayList a;
    public final boolean b;

    public s39() {
        throw null;
    }

    public s39(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s39)) {
            return false;
        }
        s39 s39Var = (s39) obj;
        return epx.f(this.a, s39Var.a) && this.b == s39Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallFromSelectionViewState(items=");
        sb.append(this.a);
        sb.append(", showButtons=");
        return n23.b(sb, this.b, ", hasError=false)");
    }
}
