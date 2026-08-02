package com.yandex.passport.internal.push;

import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.Toast;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/push/NotificationCodeCopyReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "com/yandex/passport/internal/push/d", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NotificationCodeCopyReceiver extends BroadcastReceiver {
    public static final int $stable = 0;
    public static final String COPY_CODE = "com.yandex.passport.NOTIFICATION_CODE_COPY";
    public static final d Companion = new d();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive()", 8);
        }
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        String stringExtra = intent.getStringExtra(AuthSdkActivity.RESPONSE_TYPE_CODE);
        if (stringExtra == null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "onReceive: ignored because code is null", 8);
            }
        } else {
            ClipData newPlainText = ClipData.newPlainText("", stringExtra);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(newPlainText);
            }
            if (Build.VERSION.SDK_INT <= 32) {
                Toast.makeText(context, context.getString(R.string.passport_code_copied, stringExtra), 0).show();
            }
        }
    }
}
