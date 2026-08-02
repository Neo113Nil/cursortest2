package xsna;

import java.util.List;

/* compiled from: CallListViewState.kt */
/* loaded from: classes7.dex */
public final class m59 {
    public final List<l59> a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public m59(List<? extends l59> list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m59)) {
            return false;
        }
        m59 m59Var = (m59) obj;
        return epx.f(this.a, m59Var.a) && this.b == m59Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallListViewState(items=");
        sb.append(this.a);
        sb.append(", reloadingInBackground=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
