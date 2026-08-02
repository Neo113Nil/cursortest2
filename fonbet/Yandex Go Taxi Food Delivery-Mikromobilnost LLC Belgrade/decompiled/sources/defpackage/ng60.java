package defpackage;

import android.content.Intent;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import com.yandex.go.notifications.acknowledge.domain.a;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes9.dex */
public final class ng60 {
    public final lx4 a;
    public final yqg b;
    public final p1g0 c;
    public final p0g0 d;
    public final mg60 e;

    public ng60(lx4 lx4Var, yqg yqgVar, p1g0 p1g0Var, p0g0 p0g0Var, mg60 mg60Var) {
        this.a = lx4Var;
        this.b = yqgVar;
        this.c = p1g0Var;
        this.d = p0g0Var;
        this.e = mg60Var;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            return;
        }
        q5z.Y(intent);
        String stringExtra = intent.getStringExtra("ru.yandex.taxi.notifications.REPORT_EVENT");
        if (stringExtra != null && stringExtra.length() != 0) {
            boolean equals = stringExtra.equals("Notification.ActionCall");
            mg60 mg60Var = this.e;
            if (equals) {
                mg60Var.getClass();
                mg60Var.a.a("Notification.ActionCall", new HashMap(), 1, new HashMap());
            } else if (stringExtra.equals("Notification.OpenChat")) {
                mg60Var.getClass();
                mg60Var.a.a("Notification.OpenChat", new HashMap(), 1, new HashMap());
            } else {
                ((j) this.a).n(stringExtra);
            }
        }
        NotificationShareData notificationShareData = (NotificationShareData) ffx.P(intent, "notification_share_data_extra", NotificationShareData.class);
        if (notificationShareData == null) {
            return;
        }
        String buttonId = notificationShareData.getButtonId();
        p0g0 p0g0Var = this.d;
        p1g0 p1g0Var = this.c;
        if (buttonId != null) {
            String pushId = notificationShareData.getPushId();
            if (pushId != null) {
                ((a) p1g0Var.a.get()).b(pushId, PushAckStatus.BUTTON_TAPPED);
            }
            Map<String, Object> allParams = notificationShareData.getAllParams();
            p0g0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.putAll(allParams);
            p0g0Var.a.a("Push.ButtonTapped", hashMap, 1, b.f());
            return;
        }
        String pushId2 = notificationShareData.getPushId();
        if (pushId2 != null) {
            ((a) p1g0Var.a.get()).b(pushId2, PushAckStatus.TAPPED);
        }
        String valueOf = String.valueOf(notificationShareData.getId());
        String pushId3 = notificationShareData.getPushId();
        String transitId = notificationShareData.getTransitId();
        String type = notificationShareData.getType();
        p0g0Var.getClass();
        HashMap hashMap2 = new HashMap();
        if (valueOf != null) {
            hashMap2.put("id", valueOf);
        }
        if (pushId3 != null) {
            hashMap2.put("push_id", pushId3);
        }
        if (transitId != null) {
            hashMap2.put("transit_id", transitId);
        }
        if (type != null) {
            hashMap2.put("type", type);
        }
        p0g0Var.a.a("Push.Tapped", hashMap2, 1, new HashMap());
    }

    public final void b(NotificationShareData notificationShareData) {
        if (notificationShareData == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(notificationShareData.getAllParams());
        p0g0 p0g0Var = this.d;
        p0g0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.putAll(linkedHashMap);
        p0g0Var.a.a("Push.Blocked", hashMap, 1, new HashMap());
        String pushId = notificationShareData.getPushId();
        if (pushId != null) {
            ((a) this.c.a.get()).b(pushId, PushAckStatus.BLOCKED);
        }
    }
}
