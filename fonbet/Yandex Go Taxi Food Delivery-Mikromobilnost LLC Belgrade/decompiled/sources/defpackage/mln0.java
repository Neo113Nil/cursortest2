package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.scooters.presentation.feedback.ScootersFeedbackItemsSelectionComponent;

/* loaded from: classes6.dex */
public final /* synthetic */ class mln0 implements j0o0, jms {
    public final /* synthetic */ ScootersFeedbackItemsSelectionComponent a;

    public mln0(ScootersFeedbackItemsSelectionComponent scootersFeedbackItemsSelectionComponent) {
        this.a = scootersFeedbackItemsSelectionComponent;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof j0o0) && (obj instanceof jms)) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(2, this.a, ScootersFeedbackItemsSelectionComponent.class, "onItemSelect", "onItemSelect(Lru/yandex/taxi/scooters/presentation/feedback/domain/model/ScootersFeedbackItemTreeNode;Z)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
