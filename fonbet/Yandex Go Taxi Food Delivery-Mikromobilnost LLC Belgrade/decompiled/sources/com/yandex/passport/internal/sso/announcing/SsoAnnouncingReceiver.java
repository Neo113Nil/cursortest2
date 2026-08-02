package com.yandex.passport.internal.sso.announcing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/passport/internal/sso/announcing/SsoAnnouncingReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Companion", "com/yandex/passport/internal/sso/announcing/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SsoAnnouncingReceiver extends BroadcastReceiver {
    public static final int $stable = 0;
    public static final String ACTION_SSO_ANNOUNCEMENT = "com.yandex.passport.ACTION_SSO_ANNOUNCEMENT";
    public static final e Companion = new e();
    public static final String EXTRAS_SSO_SOURCE_PACKAGE_NAME = "com.yandex.passport.SOURCE_PACKAGE_NAME";

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$7(String str, BroadcastReceiver.PendingResult pendingResult) {
        try {
            com.yandex.passport.internal.di.a.a().getSsoAccountsSyncHelper().b(str, SsoAccountsSyncHelper$Source.RECEIVER);
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
                return;
            }
            return;
        }
        if (!ACTION_SSO_ANNOUNCEMENT.equals(intent.getAction())) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: ignored because wrong action", 8);
                return;
            }
            return;
        }
        if (intent.getComponent() == null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: ignored because component is null", 8);
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra(EXTRAS_SSO_SOURCE_PACKAGE_NAME);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, unr0.l('\'', "onReceive: remotePackageName: '", stringExtra), 8);
        }
        if (jl40.l(stringExtra, context.getPackageName())) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: ignored broadcast from self", 8);
            }
        } else if (stringExtra != null) {
            new Thread(new com.yandex.passport.internal.interaction.a(4, stringExtra, goAsync())).start();
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: ignored because remotePackageName is null", 8);
        }
    }
}
