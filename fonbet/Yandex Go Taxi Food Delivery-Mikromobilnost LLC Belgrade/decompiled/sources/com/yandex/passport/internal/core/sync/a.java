package com.yandex.passport.internal.core.sync;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.PeriodicSync;
import android.os.Bundle;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import defpackage.qke;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class a {
    public final Context a;
    public final String b;
    public final long c;

    public a(Context context, String str, long j, com.yandex.passport.common.a aVar) {
        this.a = context;
        this.b = str;
        this.c = j;
    }

    public final void a(Account account) {
        long j;
        boolean z;
        Context context = this.a;
        if (qke.h(context, "android.permission.READ_SYNC_SETTINGS") != 0) {
            c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "enableSync: permission READ_SYNC_SETTINGS is denied", 8);
                return;
            }
            return;
        }
        if (qke.h(context, "android.permission.WRITE_SYNC_SETTINGS") != 0) {
            c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "enableSync: permission WRITE_SYNC_SETTINGS is denied", 8);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("account='");
        sb.append(account);
        sb.append("' authority='");
        String str = this.b;
        sb.append(str);
        sb.append('\'');
        String sb2 = sb.toString();
        if (ContentResolver.getSyncAutomatically(account, str)) {
            c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "enableSync: automatic is enabled already. ".concat(sb2), 8);
            }
        } else {
            ContentResolver.setSyncAutomatically(account, str, true);
            c cVar4 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "enableSync: enable automatic. ".concat(sb2), 8);
            }
        }
        List<PeriodicSync> periodicSyncs = ContentResolver.getPeriodicSyncs(account, str);
        Iterator<T> it = periodicSyncs.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            j = this.c;
            if (!hasNext) {
                z = !periodicSyncs.isEmpty();
                break;
            } else if (((PeriodicSync) it.next()).period != j / 1000) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        ContentResolver.addPeriodicSync(account, str, new Bundle(), j / 1000);
        c cVar5 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "enableSync: enable periodic. ".concat(sb2), 8);
        }
    }
}
