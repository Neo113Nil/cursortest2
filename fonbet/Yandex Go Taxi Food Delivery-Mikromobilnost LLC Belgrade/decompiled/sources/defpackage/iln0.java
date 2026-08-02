package defpackage;

import java.util.List;

/* loaded from: classes6.dex */
public final class iln0 {
    public final hln0 a;
    public final int b;
    public final List c;

    public iln0(hln0 hln0Var, int i, List list) {
        this.a = hln0Var;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (iln0.class.equals(obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                ny61.t("null cannot be cast to non-null type ru.yandex.taxi.scooters.presentation.feedback.domain.model.ScootersFeedbackItemTreeNode");
                return false;
            }
            iln0 iln0Var = (iln0) obj;
            if (jl40.l(this.a, iln0Var.a) && this.b == iln0Var.b && this.c.equals(iln0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer valueOf = Integer.valueOf(this.b);
        hln0 hln0Var = this.a;
        int hashCode = hln0Var != null ? hln0Var.hashCode() : 0;
        return this.c.hashCode() + ((valueOf.hashCode() + (hashCode * 31)) * 31);
    }
}
