package defpackage;

import android.content.Context;
import com.yandex.go.taxi.summary.ui.TariffPopupModalView;
import com.yandex.go.zone.dto.objects.Notification;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes6.dex */
public final class blx0 {
    public static TariffPopupModalView a(Context context, Notification notification, String str) {
        CharSequence charSequence;
        if (notification == null) {
            jst.e.k(new IllegalArgumentException(), String.format("Missing Notification for action '%s'", Arrays.copyOf(new Object[]{str}, 1)));
            return null;
        }
        Notification.Type type = notification.a;
        if (type != Notification.Type.TARIFF_POPUP) {
            jst.e.k(new IllegalArgumentException(), String.format("Notification is not supported '%s'", Arrays.copyOf(new Object[]{type}, 1)));
            return null;
        }
        Map map = notification.d;
        CharSequence charSequence2 = (CharSequence) map.get("title");
        if ((charSequence2 != null && charSequence2.length() != 0) || ((charSequence = (CharSequence) map.get("text")) != null && charSequence.length() != 0)) {
            return new TariffPopupModalView(context, map, "antisurge_clarification".equals(str) ? b1h0.ic_anisurge_onboarding : 0, null);
        }
        jst.e.k(new IllegalArgumentException("No translations"), String.format("Missed required translations for notification [%s] with action [%s]", Arrays.copyOf(new Object[]{type, str}, 2)));
        return null;
    }
}
