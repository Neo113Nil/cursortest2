package com.yandex.passport.internal.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFormatException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/push/NotificationDismissedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "com/yandex/passport/internal/push/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationDismissedReceiver extends BroadcastReceiver {
    public static final int $stable = 0;
    public static final e Companion = new e();
    public static final String NOTIFICATION_DISMISS = "com.yandex.passport.NOTIFICATION_DISMISS";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$3(Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        try {
            String stringExtra = intent.getStringExtra("notification_message");
            Bundle bundle = (Bundle) intent.getParcelableExtra("uid");
            bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
            Uid uid = (Uid) bundle.getParcelable("passport-uid");
            if (uid == null) {
                throw new ParcelFormatException("Invalid parcelable Uid in the bundle");
            }
            String stringExtra2 = intent.getStringExtra(CommonUrlParts.APP_ID);
            com.yandex.passport.internal.di.a.a().getPushReporter().k(uid, intent.getStringExtra(MetaDataField.DEVICE_ID_FIELD), stringExtra2, stringExtra, intent.getStringExtra("push_id"), intent.getStringExtra("track_id"), intent.getStringExtra("push_platform"));
            pendingResult.finish();
        } catch (Throwable unused) {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive()", 8);
        }
        if (intent == null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "onReceive: ignored because intent is null", 8);
            }
        } else if (NOTIFICATION_DISMISS.equals(intent.getAction())) {
            new Thread(new com.yandex.passport.internal.interaction.a(3, intent, goAsync())).start();
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: ignored because wrong action", 8);
        }
    }
}
