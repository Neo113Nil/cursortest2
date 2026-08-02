package com.yandex.passport.internal.core.announcing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.yandex.passport.internal.n;

/* loaded from: classes15.dex */
public class PackageRemovedReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$onReceive$0(BroadcastReceiver.PendingResult pendingResult) {
        try {
            com.yandex.passport.internal.di.a.a().getAccountsBackuper().c("android.intent.action.PACKAGE_FULLY_REMOVED");
            com.yandex.passport.internal.di.a.a().getAccountTracker().a();
        } catch (Exception e) {
            com.yandex.passport.legacy.a.d(e);
        } finally {
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.yandex.passport.legacy.a.a("onReceive: received " + intent);
        if (intent == null) {
            com.yandex.passport.legacy.a.b("onReceive: intent is null");
        } else if (!TextUtils.equals(intent.getAction(), "android.intent.action.PACKAGE_FULLY_REMOVED")) {
            com.yandex.passport.legacy.a.a("onReceive: ignored because wrong action");
        } else {
            new Thread(new n(2, goAsync()), "Passport-".concat("PackageRemoved")).start();
        }
    }
}
