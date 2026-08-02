package defpackage;

import com.yandex.go.scooters.analytics.ScootersCancelFeedbackAnalytics$Button;
import com.yandex.go.scooters.analytics.ScootersRideFeedbackAnalytics$Button;
import java.util.HashMap;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final class kmn0 {
    public final dln0 a;
    public final oso0 b;
    public final y3n0 c;

    public kmn0(dln0 dln0Var, oso0 oso0Var, y3n0 y3n0Var) {
        this.a = dln0Var;
        this.b = oso0Var;
        this.c = y3n0Var;
    }

    public final void a(FeedbackSettingsParams$Screen feedbackSettingsParams$Screen, ScootersRideFeedbackAnalytics$Button scootersRideFeedbackAnalytics$Button, Integer num, String str) {
        ScootersCancelFeedbackAnalytics$Button scootersCancelFeedbackAnalytics$Button;
        int i = jmn0.a[feedbackSettingsParams$Screen.ordinal()];
        if (i == 1) {
            oso0 oso0Var = this.b;
            oso0Var.getClass();
            HashMap hashMap = new HashMap();
            if (scootersRideFeedbackAnalytics$Button != null) {
                hashMap.put("button_name", scootersRideFeedbackAnalytics$Button.getEventValue());
            }
            if (num != null) {
                hashMap.put("newbie_progress", num);
            }
            if (str != null) {
                hashMap.put("help_item_id", str);
            }
            oso0Var.a.a("ScootersRideFeedback.Tapped", hashMap, 1, new HashMap());
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        int i2 = jmn0.b[scootersRideFeedbackAnalytics$Button.ordinal()];
        if (i2 == 1) {
            scootersCancelFeedbackAnalytics$Button = ScootersCancelFeedbackAnalytics$Button.Done;
        } else if (i2 == 2) {
            scootersCancelFeedbackAnalytics$Button = ScootersCancelFeedbackAnalytics$Button.Charity;
        } else if (i2 == 3) {
            scootersCancelFeedbackAnalytics$Button = ScootersCancelFeedbackAnalytics$Button.Dialog;
        } else {
            if (i2 != 4) {
                w511.b();
                return;
            }
            scootersCancelFeedbackAnalytics$Button = ScootersCancelFeedbackAnalytics$Button.NewbieHelpItem;
        }
        y3n0 y3n0Var = this.c;
        y3n0Var.getClass();
        HashMap hashMap2 = new HashMap();
        if (scootersCancelFeedbackAnalytics$Button != null) {
            hashMap2.put("button_name", scootersCancelFeedbackAnalytics$Button.getEventValue());
        }
        if (num != null) {
            hashMap2.put("newbie_progress", num);
        }
        if (str != null) {
            hashMap2.put("help_item_id", str);
        }
        y3n0Var.a.a("ScootersCancelFeedback.Tapped", hashMap2, 1, new HashMap());
    }
}
