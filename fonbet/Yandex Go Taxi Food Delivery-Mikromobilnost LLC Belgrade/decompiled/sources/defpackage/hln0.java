package defpackage;

/* loaded from: classes6.dex */
public final class hln0 {
    public final fln0 a;
    public final boolean b;

    public hln0(fln0 fln0Var, boolean z) {
        this.a = fln0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (hln0.class.equals(obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                ny61.t("null cannot be cast to non-null type ru.yandex.taxi.scooters.presentation.feedback.domain.model.ScootersFeedbackItemTreeNode.ScootersFeedbackItemTreeNodeInnerItem");
                return false;
            }
            if (this.a.equals(((hln0) obj).a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
