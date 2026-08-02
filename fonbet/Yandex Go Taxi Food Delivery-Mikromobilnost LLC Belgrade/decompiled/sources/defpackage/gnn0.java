package defpackage;

import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final class gnn0 {
    public final n5o0 a;

    public gnn0(n5o0 n5o0Var) {
        this.a = n5o0Var;
    }

    public static String a(FeedbackSettingsParams$Screen feedbackSettingsParams$Screen) {
        String str;
        int i = fnn0.a[feedbackSettingsParams$Screen.ordinal()];
        if (i == 1) {
            str = "finish";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "cancel";
        }
        return "Perf.ScootersFinishInfoRouter.Launch#".concat(str);
    }
}
