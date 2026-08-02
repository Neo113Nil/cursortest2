package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.yandex.passport.common.core.UserInfo;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.f0;
import com.yandex.passport.internal.report.reporters.DropPlace;
import defpackage.jl40;
import defpackage.tje;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes8.dex */
public final class a {
    public final j a;
    public final u b;
    public final k c;
    public final d d;
    public final f0 e;
    public final com.yandex.passport.internal.network.mappers.h f;
    public final String g;

    public a(Context context, j jVar, u uVar, k kVar, d dVar, f0 f0Var, com.yandex.passport.internal.network.mappers.h hVar) {
        this.a = jVar;
        this.b = uVar;
        this.c = kVar;
        this.d = dVar;
        this.e = f0Var;
        this.f = hVar;
        this.g = context.getPackageName();
    }

    public final boolean a(Account account, boolean z) {
        try {
            return b(account, z);
        } catch (Exception e) {
            f0 f0Var = this.e;
            f0Var.getClass();
            com.yandex.passport.internal.analytics.s sVar = com.yandex.passport.internal.analytics.s.b;
            f0Var.a(a0.K(), new Pair("error", Log.getStackTraceString(e)));
            throw e;
        }
    }

    public final boolean b(Account account, boolean z) {
        boolean z2;
        ModernAccount a;
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "synchronizeAccount: synchronizing " + account, 8);
        }
        AccountRow a2 = this.d.a().a(account);
        f0 f0Var = this.e;
        if (a2 == null) {
            f0Var.getClass();
            com.yandex.passport.internal.analytics.s sVar = com.yandex.passport.internal.analytics.s.b;
            f0Var.a(a0.j(), new Pair[0]);
            if (!com.yandex.passport.common.logger.a.a.isEnabled()) {
                return false;
            }
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "synchronizeAccount: can't get account row for account " + account, 8);
            return false;
        }
        ModernAccount b = this.f.b(a2);
        if (b != null) {
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "synchronizeAccount: processing as modern account " + account, 8);
            }
            String e = this.a.e();
            if (z || jl40.l(this.g, e)) {
                com.yandex.passport.internal.analytics.i iVar = com.yandex.passport.internal.analytics.i.d;
                u uVar = this.b;
                uVar.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "starting getAllUserInfo", 8);
                }
                long a3 = com.yandex.passport.common.a.a();
                UserInfo userInfo = b.getUserInfo();
                userInfo.getBody();
                String eTag = userInfo.getETag();
                z2 = false;
                long retrievalTime = userInfo.getRetrievalTime();
                String b2 = com.yandex.passport.common.ui.lang.a.b(((com.yandex.passport.internal.ui.lang.a) uVar.e).b());
                if (!z && jl40.r(a3, retrievalTime) >= 0) {
                    long j = a3 - retrievalTime;
                    if (jl40.r(j, uVar.a) < 0) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "refreshModernAccountIfNecessary: account " + b + " userInfoAge: " + ((Object) com.yandex.passport.common.time.a.f(j)) + " to small", 8);
                        }
                        a = null;
                        long value = b.getUid().getValue();
                        f0Var.getClass();
                        com.yandex.passport.internal.analytics.s sVar2 = com.yandex.passport.internal.analytics.s.b;
                        f0Var.a(a0.l(), new Pair("uid", String.valueOf(value)));
                    }
                }
                a = (ModernAccount) tje.Y(EmptyCoroutineContext.a, new ModernAccountRefresher$refreshModernAccount$3(uVar, b, b2, iVar, a3, eTag, null));
                long value2 = b.getUid().getValue();
                f0Var.getClass();
                com.yandex.passport.internal.analytics.s sVar22 = com.yandex.passport.internal.analytics.s.b;
                f0Var.a(a0.l(), new Pair("uid", String.valueOf(value2)));
            } else {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "synchronizeAccount: i'm not a master", 8);
                }
                a = null;
                z2 = false;
            }
        } else {
            z2 = false;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "synchronizeAccount: processing as corrupted account " + account, 8);
            }
            a = this.c.a(a2, com.yandex.passport.internal.analytics.i.d, DropPlace.REPAIR_CORRUPTED_SYNC);
            long value3 = a.getUid().getValue();
            f0Var.getClass();
            com.yandex.passport.internal.analytics.s sVar3 = com.yandex.passport.internal.analytics.s.b;
            f0Var.a(a0.m(), new Pair("uid", String.valueOf(value3)));
        }
        if (a == null) {
            return z2;
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "synchronizeAccount: synchronized " + account, 8);
        }
        return true;
    }
}
