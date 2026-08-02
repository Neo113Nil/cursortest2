package xsna;

import java.util.List;

/* compiled from: BottomActionItem.kt */
/* loaded from: classes6.dex */
public final class q38 {
    public final List<sh00> a;
    public final r38 b;

    public q38(List list, r38 r38Var) {
        this.a = list;
        this.b = r38Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q38)) {
            return false;
        }
        q38 q38Var = (q38) obj;
        return epx.f(this.a, q38Var.a) && this.b.equals(q38Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BottomActionItemGroups(groups=" + this.a + ", clickAction=" + this.b + ')';
    }
}
