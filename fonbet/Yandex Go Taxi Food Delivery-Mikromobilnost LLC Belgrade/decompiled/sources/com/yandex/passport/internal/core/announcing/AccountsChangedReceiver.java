package com.yandex.passport.internal.core.announcing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/passport/internal/core/announcing/AccountsChangedReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/yandex/passport/internal/config/a;", "accountSharingConfigStorage", "", "isTrusted", "(Landroid/content/Context;Lcom/yandex/passport/internal/config/a;)Z", "Landroid/content/Intent;", "intent", "Lzy11;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AccountsChangedReceiver extends BroadcastReceiver {
    public static final int $stable = 0;

    private final boolean isTrusted(Context context, com.yandex.passport.internal.config.a accountSharingConfigStorage) {
        try {
            return new com.yandex.passport.internal.sso.g(context, accountSharingConfigStorage, null).b(context.getPackageName());
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "onReceive: exception when checking signature", e);
            }
            com.yandex.passport.legacy.a.d(e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$7(AccountsChangedReceiver accountsChangedReceiver, Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        e eVar;
        try {
            PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
            g announcingHelper = a.getAnnouncingHelper();
            com.yandex.passport.internal.report.reporters.g announcementReporter = a.getAnnouncementReporter();
            com.yandex.passport.internal.core.accounts.b accountsBackuper = a.getAccountsBackuper();
            c accountsChangesAnnouncer = a.getAccountsChangesAnnouncer();
            if (!accountsChangedReceiver.isTrusted(context, a.getAccountSharingConfigStorage())) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: ignored because is not trusted application", 8);
                }
                return;
            }
            announcingHelper.b.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String action = intent.getAction();
            if (action == null) {
                eVar = null;
            } else {
                String stringExtra = intent.getStringExtra("com.yandex.passport.sender");
                String stringExtra2 = intent.getStringExtra("com.yandex.passport.sender_device_id");
                String stringExtra3 = intent.getStringExtra("com.yandex.passport.reason");
                long longExtra = intent.getLongExtra("com.yandex.passport.created", 0L);
                eVar = new e(action, stringExtra3, stringExtra, stringExtra2, longExtra, elapsedRealtime, longExtra > 0 ? elapsedRealtime - longExtra : 0L);
            }
            if (eVar == null) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: can't get announcement from intent", 8);
                }
                return;
            }
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: received " + eVar, 8);
            }
            announcementReporter.j(eVar);
            if (TextUtils.equals(eVar.c, context.getPackageName())) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: ignored because sent by me", 8);
                }
            } else {
                accountsBackuper.c("android.accounts.LOGIN_ACCOUNTS_CHANGED");
                accountsChangesAnnouncer.getClass();
                accountsChangesAnnouncer.a(true);
            }
        } catch (Exception e) {
            com.yandex.passport.legacy.a.d(e);
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, final Intent intent) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: received " + intent, 8);
        }
        if (intent == null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "onReceive: intent is null", 8);
                return;
            }
            return;
        }
        String action = intent.getAction();
        if (TextUtils.equals(action, "android.accounts.LOGIN_ACCOUNTS_CHANGED") || TextUtils.equals(action, "com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED")) {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            new Thread(new Runnable() { // from class: com.yandex.passport.internal.core.announcing.b
                @Override // java.lang.Runnable
                public final void run() {
                    AccountsChangedReceiver.onReceive$lambda$7(AccountsChangedReceiver.this, context, intent, goAsync);
                }
            }, "Passport-".concat("AccountsChanged")).start();
        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onReceive: ignored because wrong action", 8);
        }
    }
}
