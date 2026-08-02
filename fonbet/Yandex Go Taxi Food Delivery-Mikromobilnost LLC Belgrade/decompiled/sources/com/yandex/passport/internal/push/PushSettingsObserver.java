package com.yandex.passport.internal.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yandex.passport.common.logger.LogLevel;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/yandex/passport/internal/push/PushSettingsObserver;", "Landroid/content/BroadcastReceiver;", "Lcom/yandex/passport/internal/push/k0;", "scheduler", "<init>", "(Lcom/yandex/passport/internal/push/k0;)V", "Landroid/content/Context;", "context", "Lzy11;", "subscribe", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "intent", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/yandex/passport/internal/push/k0;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PushSettingsObserver extends BroadcastReceiver {
    public static final int $stable = 8;
    private final k0 scheduler;

    public PushSettingsObserver(k0 k0Var) {
        this.scheduler = k0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (jl40.l(intent.getAction(), "android.app.action.APP_BLOCK_STATE_CHANGED")) {
            boolean booleanExtra = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                LogLevel logLevel = LogLevel.INFO;
                StringBuilder sb = new StringBuilder("Notification state global: ");
                sb.append(!booleanExtra);
                com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
            }
            this.scheduler.b(null);
            return;
        }
        if (!jl40.l(intent.getAction(), "android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED")) {
            if (jl40.l(intent.getAction(), "android.app.action.INTERRUPTION_FILTER_CHANGED") || jl40.l(intent.getAction(), "android.app.action.NOTIFICATION_POLICY_CHANGED")) {
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "Notification dnd mode changed", 8);
                }
                this.scheduler.b(null);
                return;
            }
            return;
        }
        String stringExtra = intent.getStringExtra("android.app.extra.NOTIFICATION_CHANNEL_GROUP_ID");
        if (jl40.l(stringExtra, "passport_channel_group_id")) {
            boolean booleanExtra2 = intent.getBooleanExtra("android.app.extra.BLOCKED_STATE", false);
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                LogLevel logLevel2 = LogLevel.INFO;
                StringBuilder x = unr0.x("Notification state group \"", stringExtra, "\": ");
                x.append(!booleanExtra2);
                com.yandex.passport.common.logger.a.c(logLevel2, null, x.toString(), 8);
            }
            this.scheduler.b(null);
        }
    }

    public final void subscribe(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.app.action.NOTIFICATION_POLICY_ACCESS_GRANTED_CHANGED");
        intentFilter.addAction("android.app.action.APP_BLOCK_STATE_CHANGED");
        intentFilter.addAction("android.app.action.NOTIFICATION_CHANNEL_GROUP_BLOCK_STATE_CHANGED");
        intentFilter.addAction("android.app.action.INTERRUPTION_FILTER_CHANGED");
        intentFilter.addAction("android.app.action.NOTIFICATION_POLICY_CHANGED");
        context.registerReceiver(this, intentFilter);
    }
}
