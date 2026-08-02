package defpackage;

import java.util.List;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;

/* loaded from: classes6.dex */
public final class jwo0 {
    public static final /* synthetic */ int d = 0;
    public final iln0 a;
    public final FeedbackAttachments b;
    public final List c;

    static {
        rrq rrqVar = FeedbackAttachments.Companion;
    }

    public jwo0(iln0 iln0Var, FeedbackAttachments feedbackAttachments, List list) {
        this.a = iln0Var;
        this.b = feedbackAttachments;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jwo0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            jwo0 jwo0Var = (jwo0) obj;
            return jl40.l(this.a, jwo0Var.a) && jl40.l(this.b, jwo0Var.b) && jl40.l(this.c, jwo0Var.c);
        }
        ny61.t("null cannot be cast to non-null type ru.yandex.taxi.scooters.presentation.feedback.domain.model.ScootersSpecifiedFeedbackSettings");
        return false;
    }

    public final int hashCode() {
        iln0 iln0Var = this.a;
        int hashCode = (iln0Var != null ? iln0Var.hashCode() : 0) * 31;
        FeedbackAttachments feedbackAttachments = this.b;
        int hashCode2 = (hashCode + (feedbackAttachments != null ? feedbackAttachments.hashCode() : 0)) * 31;
        List list = this.c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }
}
