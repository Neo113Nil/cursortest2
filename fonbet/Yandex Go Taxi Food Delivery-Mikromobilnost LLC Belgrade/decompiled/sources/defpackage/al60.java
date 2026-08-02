package defpackage;

import com.yandex.div.state.db.StateEntry;
import java.util.HashMap;
import ru.yandex.taxi.statebar.controller.NotificatorReporter$MessageType;

/* loaded from: classes10.dex */
public final class al60 {
    public final rx2 a;

    public al60(rx2 rx2Var) {
        this.a = rx2Var;
    }

    public final void a(String str, NotificatorReporter$MessageType notificatorReporter$MessageType) {
        String value;
        if (notificatorReporter$MessageType == null || (value = notificatorReporter$MessageType.getValue()) == null) {
            value = NotificatorReporter$MessageType.NETWORK_ERROR.getValue();
        }
        rx2 rx2Var = this.a;
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        if (value != null) {
            hashMap.put("message_type", value);
        }
        hashMap.put("notificator", "TopBarFailureNotificator");
        if (str != null) {
            hashMap.put(StateEntry.COLUMN_PATH, str);
        }
        rx2Var.a.a("FailureNotificator.Shown", hashMap, 1, new HashMap());
    }
}
