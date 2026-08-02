package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.analytics.b;
import java.util.LinkedHashSet;
import kotlin.Pair;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.notifications.tips.TipsNotificationAnalytics$NotificationState;

/* loaded from: classes9.dex */
public final class egz0 {
    public final b a;
    public final LinkedHashSet b = new LinkedHashSet();

    public egz0(b bVar) {
        this.a = bVar;
    }

    public static NotificationShareData.a a(n280 n280Var, TipsNotificationAnalytics$NotificationState tipsNotificationAnalytics$NotificationState, String str) {
        String str2;
        NotificationShareData.a builder = NotificationShareData.INSTANCE.builder();
        builder.g("local:taxi_order:tips:" + n280Var.h());
        builder.d(str);
        Pair pair = new Pair("order_id", n280Var.j());
        int i = dgz0.a[tipsNotificationAnalytics$NotificationState.ordinal()];
        if (i == 1) {
            str2 = "heads_up";
        } else if (i == 2) {
            str2 = Constants.SMALL;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            str2 = "big";
        }
        builder.f(kotlin.collections.b.h(pair, new Pair("notification_state", str2)));
        builder.e(n280Var.h());
        return builder;
    }
}
