package defpackage;

import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class kln0 {
    public final int a;
    public final ArrayList b;

    public kln0(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (kln0.class.equals(obj != null ? obj.getClass() : null)) {
            if (obj == null) {
                ny61.t("null cannot be cast to non-null type ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackItemsSelectionComponent.FeedbackItemTreeNodeListWithLevel");
                return false;
            }
            kln0 kln0Var = (kln0) obj;
            if (this.a == kln0Var.a && this.b.equals(kln0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.valueOf(this.a).hashCode() * 31);
    }
}
