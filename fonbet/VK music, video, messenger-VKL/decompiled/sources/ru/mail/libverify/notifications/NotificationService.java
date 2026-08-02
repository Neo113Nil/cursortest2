package ru.mail.libverify.notifications;

import android.app.Service;
import android.content.Intent;
import ru.mail.libverify.n0.b;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.IntentProcessService;

/* loaded from: classes9.dex */
public final class NotificationService extends IntentProcessService {
    @Override // ru.mail.verify.core.utils.IntentProcessService, android.app.IntentService
    public final void onHandleIntent(Intent intent) {
        String stringExtra;
        super.onHandleIntent(intent);
        if ((intent != null ? intent.getAction() : null) == null || intent.getExtras() == null || (stringExtra = intent.getStringExtra("notification_id")) == null) {
            return;
        }
        FileLog.v("NotificationService", "received extra %s from notification %s", intent.getAction(), stringExtra);
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode != -964594249) {
                if (hashCode != 1064330403) {
                    ru.mail.libverify.d0.a.a((Service) this, e.a(ru.mail.libverify.p0.a.SERVICE_NOTIFICATION_CANCEL, stringExtra));
                    return;
                } else {
                    ru.mail.libverify.d0.a.a((Service) this, e.a(ru.mail.libverify.p0.a.SERVICE_NOTIFICATION_CANCEL, stringExtra));
                    return;
                }
            }
            if (action.equals("action_confirm")) {
                ru.mail.libverify.d0.a.a((Service) this, e.a(ru.mail.libverify.p0.a.SERVICE_NOTIFICATION_CONFIRM, stringExtra));
                return;
            }
        }
        b.a("NotificationService", "wrong action type", new IllegalArgumentException("Wrong action type " + intent.getAction() + " for NotificationService detected"));
    }
}
