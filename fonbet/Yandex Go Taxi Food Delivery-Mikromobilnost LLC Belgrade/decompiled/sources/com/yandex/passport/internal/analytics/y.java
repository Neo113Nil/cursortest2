package com.yandex.passport.internal.analytics;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.yandex.passport.api.PassportAccountType;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.credentials.ClientCredentials;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.entities.ClientToken;
import defpackage.w53;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class y {
    public final Context a;
    public final com.yandex.passport.internal.storage.i b;
    public final com.yandex.passport.internal.account.a c;
    public final DatabaseHelper d;
    public final c0 e;
    public final com.yandex.passport.internal.properties.p f;
    public final com.yandex.passport.common.a g;

    public y(Context context, com.yandex.passport.internal.storage.i iVar, com.yandex.passport.internal.account.a aVar, DatabaseHelper databaseHelper, c0 c0Var, com.yandex.passport.internal.properties.p pVar, com.yandex.passport.common.a aVar2) {
        this.a = context;
        this.b = iVar;
        this.c = aVar;
        this.d = databaseHelper;
        this.e = c0Var;
        this.f = pVar;
        this.g = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.yandex.passport.internal.b bVar) {
        ClientToken clientToken;
        boolean z;
        CurrentAccountAnalyticsHelper$CurrentAccountState currentAccountAnalyticsHelper$CurrentAccountState;
        ActivityManager activityManager;
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ComponentName componentName;
        boolean equals;
        PassportAccountType accountType;
        this.g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        com.yandex.passport.internal.storage.i iVar = this.b;
        long longValue = ((Number) iVar.k.getValue(iVar, com.yandex.passport.internal.storage.i.m[10])).longValue();
        if (longValue != 0 && elapsedRealtime - longValue <= 86400000 && (elapsedRealtime >= 86400000 || elapsedRealtime >= longValue)) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "core.activation already sent", 8);
                return;
            }
            return;
        }
        ArrayList f = bVar.f();
        DatabaseHelper databaseHelper = this.d;
        long countClientTokens = databaseHelper.countClientTokens();
        ModernAccount b = this.c.b(bVar);
        if (b == null) {
            currentAccountAnalyticsHelper$CurrentAccountState = CurrentAccountAnalyticsHelper$CurrentAccountState.noCurrentAccount;
        } else {
            if (b.getMasterToken().getValue() != null) {
                CurrentAccountAnalyticsHelper$CurrentAccountState currentAccountAnalyticsHelper$CurrentAccountState2 = CurrentAccountAnalyticsHelper$CurrentAccountState.ok;
                ClientCredentials r = this.f.r(b.getUid().getEnvironment());
                z = (r == null || (clientToken = databaseHelper.getClientToken(b.getUid(), r.getDecryptedId())) == null || com.yandex.passport.common.util.a.e(clientToken.getValue()) == null) ? false : true;
                currentAccountAnalyticsHelper$CurrentAccountState = currentAccountAnalyticsHelper$CurrentAccountState2;
                Context context = this.a;
                activityManager = (ActivityManager) context.getSystemService("activity");
                if (activityManager != null) {
                    try {
                        runningTasks = activityManager.getRunningTasks(1);
                    } catch (SecurityException unused) {
                    }
                    if (runningTasks != null && runningTasks.size() != 0 && (componentName = runningTasks.get(0).topActivity) != null) {
                        equals = TextUtils.equals(componentName.getPackageName(), context.getPackageName());
                        int size = f.size();
                        String name = currentAccountAnalyticsHelper$CurrentAccountState.name();
                        accountType = b != null ? b.getAccountType() : null;
                        c0 c0Var = this.e;
                        c0Var.getClass();
                        w53 w53Var = new w53();
                        w53Var.put("accounts_num", String.valueOf(size));
                        w53Var.put("hasCurrentAccount", String.valueOf(countClientTokens > 0));
                        w53Var.put("hasMasterToken", name);
                        w53Var.put("hasClientAndMasterToken", String.valueOf(z));
                        w53Var.put("isForeground", String.valueOf(equals));
                        if (accountType != null) {
                            w53Var.put("accountType", accountType.toString());
                        }
                        c0Var.a.d(i.c, w53Var);
                        iVar.k.setValue(iVar, com.yandex.passport.internal.storage.i.m[10], Long.valueOf(SystemClock.elapsedRealtime()));
                    }
                }
                equals = false;
                int size2 = f.size();
                String name2 = currentAccountAnalyticsHelper$CurrentAccountState.name();
                if (b != null) {
                }
                c0 c0Var2 = this.e;
                c0Var2.getClass();
                w53 w53Var2 = new w53();
                w53Var2.put("accounts_num", String.valueOf(size2));
                w53Var2.put("hasCurrentAccount", String.valueOf(countClientTokens > 0));
                w53Var2.put("hasMasterToken", name2);
                w53Var2.put("hasClientAndMasterToken", String.valueOf(z));
                w53Var2.put("isForeground", String.valueOf(equals));
                if (accountType != null) {
                }
                c0Var2.a.d(i.c, w53Var2);
                iVar.k.setValue(iVar, com.yandex.passport.internal.storage.i.m[10], Long.valueOf(SystemClock.elapsedRealtime()));
            }
            currentAccountAnalyticsHelper$CurrentAccountState = CurrentAccountAnalyticsHelper$CurrentAccountState.noMasterToken;
        }
        z = false;
        Context context2 = this.a;
        activityManager = (ActivityManager) context2.getSystemService("activity");
        if (activityManager != null) {
        }
        equals = false;
        int size22 = f.size();
        String name22 = currentAccountAnalyticsHelper$CurrentAccountState.name();
        if (b != null) {
        }
        c0 c0Var22 = this.e;
        c0Var22.getClass();
        w53 w53Var22 = new w53();
        w53Var22.put("accounts_num", String.valueOf(size22));
        w53Var22.put("hasCurrentAccount", String.valueOf(countClientTokens > 0));
        w53Var22.put("hasMasterToken", name22);
        w53Var22.put("hasClientAndMasterToken", String.valueOf(z));
        w53Var22.put("isForeground", String.valueOf(equals));
        if (accountType != null) {
        }
        c0Var22.a.d(i.c, w53Var22);
        iVar.k.setValue(iVar, com.yandex.passport.internal.storage.i.m[10], Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
