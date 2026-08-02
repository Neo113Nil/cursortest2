package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import androidx.core.app.d1;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.push.k0;
import com.yandex.passport.internal.report.g6;
import com.yandex.passport.internal.report.i6;
import com.yandex.passport.internal.report.j6;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.k6;
import com.yandex.passport.internal.report.qb;
import com.yandex.passport.internal.report.reporters.DropPlace;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import com.yandex.passport.internal.report.reporters.b1;
import com.yandex.passport.internal.report.reporters.y0;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.stash.Stash;
import com.yandex.passport.internal.stash.StashCell;
import com.yandex.passport.internal.usecase.f1;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.sl41;
import defpackage.tcc;
import defpackage.uw51;
import defpackage.w53;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class g {
    public final j a;
    public final com.yandex.passport.internal.core.announcing.c b;
    public final c0 c;
    public final y0 d;
    public final b1 e;
    public final com.yandex.passport.internal.report.reporters.c f;
    public final com.yandex.passport.internal.properties.p g;
    public final DatabaseHelper h;
    public final com.yandex.passport.internal.report.reporters.t i;
    public final f1 j;
    public final com.yandex.passport.internal.account.b k;
    public final com.yandex.passport.internal.network.mappers.h l;

    public g(j jVar, com.yandex.passport.internal.core.announcing.c cVar, c0 c0Var, y0 y0Var, b1 b1Var, com.yandex.passport.internal.report.reporters.c cVar2, com.yandex.passport.internal.properties.p pVar, DatabaseHelper databaseHelper, com.yandex.passport.internal.report.reporters.t tVar, f1 f1Var, com.yandex.passport.internal.account.b bVar, com.yandex.passport.internal.network.mappers.h hVar) {
        this.a = jVar;
        this.b = cVar;
        this.c = c0Var;
        this.d = y0Var;
        this.e = b1Var;
        this.f = cVar2;
        this.g = pVar;
        this.h = databaseHelper;
        this.i = tVar;
        this.j = f1Var;
        this.k = bVar;
        this.l = hVar;
    }

    public static void i(g gVar, ModernAccount modernAccount, Pair[] pairArr) {
        gVar.getClass();
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        int length = pairArr2.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Pair pair = pairArr2[i];
            if (!jl40.l(modernAccount.getStash().get((StashCell) pair.c()), pair.f())) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            gVar.j(modernAccount, pairArr);
            com.yandex.passport.internal.core.announcing.c cVar = gVar.b;
            cVar.a(true);
            cVar.a.a(com.yandex.passport.internal.analytics.i.e);
        }
    }

    public final h a(ModernAccount modernAccount, com.yandex.passport.internal.analytics.m mVar, boolean z) {
        com.yandex.passport.internal.analytics.m mVar2;
        Uid uid;
        com.yandex.passport.internal.core.announcing.c cVar = this.b;
        com.yandex.passport.internal.core.announcing.g gVar = cVar.a;
        k0 k0Var = cVar.c;
        c0 c0Var = this.c;
        com.yandex.passport.internal.analytics.t tVar = c0Var.a;
        if (this.g.u) {
            throw new FailedToAddAccountException();
        }
        com.yandex.passport.internal.network.mappers.h hVar = this.l;
        AccountRow a = hVar.a(modernAccount);
        Uid uid2 = modernAccount.getUid();
        j jVar = this.a;
        h a2 = jVar.a(a);
        if (a2.b()) {
            k0Var.b(uid2);
            cVar.a(z);
            gVar.a(mVar);
            return a2;
        }
        g(modernAccount, mVar, z);
        String str = modernAccount.getAccount().name;
        Account[] c = jVar.c();
        int length = c.length;
        int i = 0;
        while (i < length) {
            int i2 = length;
            if (str.equals(c[i].name)) {
                long value = uid2.getValue();
                w53 w53Var = new w53();
                w53Var.put("uid", Long.toString(value));
                com.yandex.passport.internal.analytics.k kVar = com.yandex.passport.internal.analytics.k.b;
                tVar.a(a0.n(), w53Var);
                return a2;
            }
            i++;
            length = i2;
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Uid uid3 = modernAccount.getUid();
        jVar.k(modernAccount.getAccount(), modernAccount.getMasterToken().getValue(), new d1(countDownLatch, uid3, this, atomicReference, 1));
        try {
            countDownLatch.await();
            if (atomicReference.get() == null) {
                h a3 = jVar.a(a);
                if (a3.b()) {
                    long value2 = uid2.getValue();
                    w53 w53Var2 = new w53();
                    w53Var2.put("uid", Long.toString(value2));
                    com.yandex.passport.internal.analytics.k kVar2 = com.yandex.passport.internal.analytics.k.b;
                    tVar.a(a0.k(), w53Var2);
                    k0Var.b(uid2);
                    cVar.a(z);
                    gVar.a(mVar);
                    return a3;
                }
                mVar2 = mVar;
                uid = uid2;
                long value3 = uid.getValue();
                w53 w53Var3 = new w53();
                w53Var3.put("uid", Long.toString(value3));
                com.yandex.passport.internal.analytics.k kVar3 = com.yandex.passport.internal.analytics.k.b;
                tVar.a(a0.h(), w53Var3);
            } else {
                mVar2 = mVar;
                uid = uid2;
            }
        } catch (InterruptedException e) {
            mVar2 = mVar;
            uid = uid2;
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "removeAndRecreateAccount: remove uid=" + uid3 + ": timeout while waiting for account removal", 8);
            }
            c0Var.a(e, uid3.getValue());
        }
        h a4 = jVar.a(hVar.a(ModernAccount.copy$default(modernAccount, "user" + modernAccount.getUid().getValue(), null, null, null, null, null, 62, null)));
        if (!a4.b()) {
            long value4 = uid.getValue();
            w53 w53Var4 = new w53();
            w53Var4.put("uid", Long.toString(value4));
            com.yandex.passport.internal.analytics.k kVar4 = com.yandex.passport.internal.analytics.k.b;
            tVar.a(a0.g(), w53Var4);
            throw new FailedToAddAccountException();
        }
        long value5 = uid.getValue();
        w53 w53Var5 = new w53();
        w53Var5.put("uid", Long.toString(value5));
        com.yandex.passport.internal.analytics.k kVar5 = com.yandex.passport.internal.analytics.k.b;
        tVar.a(a0.f(), w53Var5);
        k0Var.b(uid);
        cVar.a(z);
        gVar.a(mVar2);
        return a4;
    }

    public final void b(Uid uid) {
        int deleteDelayedUid = this.h.deleteDelayedUid(uid);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "deleteLocalUidOnSuccess " + deleteDelayedUid, 8);
        }
        if (deleteDelayedUid > 0) {
            this.i.f(g6.w, new yd(uid));
        }
    }

    public final void c(ModernAccount modernAccount, boolean z, boolean z2, RevokePlace revokePlace, boolean z3) {
        try {
            int deleteDelayedUid = this.h.deleteDelayedUid(modernAccount.getUid());
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "removeAccount deleteLocalUidOnSuccess " + deleteDelayedUid, 8);
            }
            com.yandex.passport.internal.report.reporters.t tVar = this.i;
            Uid uid = modernAccount.getUid();
            if (deleteDelayedUid > 0) {
                tVar.f(g6.w, new yd(uid));
            }
        } catch (Throwable th) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "removeAccount deleteLocalUidOnFailed " + th.getMessage(), 8);
            }
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            sl41 sl41Var = new sl41(this, modernAccount, z, z2, revokePlace, z3, countDownLatch, atomicReference);
            j jVar = this.a;
            if (z3) {
                jVar.l(modernAccount.getAccount(), modernAccount.getMasterToken().getValue(), sl41Var);
            } else {
                jVar.k(modernAccount.getAccount(), modernAccount.getMasterToken().getValue(), sl41Var);
            }
            try {
                countDownLatch.await();
                if (atomicReference.get() != null) {
                    throw new PassportRuntimeUnknownException((Throwable) atomicReference.get());
                }
                this.b.b(modernAccount, z);
                this.k.a(modernAccount.getUid());
                if (z2) {
                    com.yandex.passport.common.util.a.g(new AccountsUpdater$removeAccount$3(this, modernAccount, revokePlace, null));
                }
            } catch (InterruptedException unused) {
                throw new PassportRuntimeUnknownException("timeout while waiting for account removal");
            }
        } catch (Exception e) {
            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.INFO, null, "removeAccount failed: " + e.getMessage(), 8);
            }
        }
    }

    public final void d(ModernAccount modernAccount, DropPlace dropPlace) {
        this.e.j(dropPlace, modernAccount.getUid(), null);
        if (this.a.p(this.l.a(modernAccount), "-")) {
            com.yandex.passport.internal.core.announcing.c.c(this.b, com.yandex.passport.internal.analytics.i.f);
        }
    }

    public final void e(AccountRow accountRow) {
        Object failure;
        try {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateLocalAccount", 8);
            }
            this.h.updateDelayedAccount(accountRow);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateLocalAccount failed " + a, 8);
            }
            this.i.f(k6.w, new jd(String.valueOf(accountRow.uidString), 3), new yd(a));
        }
    }

    public final void f(AccountRow accountRow, Uid uid) {
        Object failure;
        try {
            this.h.insertDelayedAccount(accountRow, uid);
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        boolean z = failure instanceof Result.Failure;
        com.yandex.passport.internal.report.reporters.t tVar = this.i;
        if (!z) {
            tVar.f(j6.w, new yd(uid));
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Failed for account " + accountRow.uidString, a);
            }
            tVar.f(i6.w, new yd(uid), new yd(a));
        }
        kotlin.b.b(failure);
    }

    public final void g(ModernAccount modernAccount, com.yandex.passport.internal.analytics.m mVar, boolean z) {
        if (this.g.u) {
            throw new FailedToAddAccountException();
        }
        Account account = modernAccount.getAccount();
        AccountRow a = this.l.a(modernAccount);
        j jVar = this.a;
        jVar.e();
        AccountManager accountManager = jVar.a;
        accountManager.setUserData(account, "uid", a.uidString);
        accountManager.setUserData(account, "user_info_body", a.userInfoBody);
        accountManager.setUserData(account, "user_info_meta", a.userInfoMeta);
        accountManager.setUserData(account, "affinity", a.legacyAffinity);
        accountManager.setUserData(account, "account_type", a.legacyAccountType);
        accountManager.setUserData(account, "extra_data", a.legacyExtraDataBody);
        accountManager.setUserData(account, "stash", a.stashBody);
        jVar.n(account, a.masterTokenValue);
        y0 y0Var = jVar.e;
        String str = a.uidString;
        String str2 = a.stashBody;
        y0Var.j(str2 != null ? Integer.valueOf(str2.length()) : null, str);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateAccount: account=" + account + " accountRow=" + a, 8);
        }
        com.yandex.passport.internal.core.announcing.c cVar2 = this.b;
        cVar2.c.b(null);
        cVar2.a(z);
        cVar2.a.a(mVar);
    }

    public final void h(ArrayList arrayList, StashCell stashCell, String str) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            j((ModernAccount) it.next(), new Pair[]{new Pair(stashCell, str)});
            z = true;
        }
        if (z) {
            com.yandex.passport.internal.core.announcing.c cVar = this.b;
            cVar.a(true);
            cVar.a.a(com.yandex.passport.internal.analytics.i.e);
        }
    }

    public final void j(ModernAccount modernAccount, Pair[] pairArr) {
        ArrayList arrayList = new ArrayList(pairArr.length);
        for (Pair pair : pairArr) {
            StashCell stashCell = (StashCell) pair.getFirst();
            String str = (String) pair.getSecond();
            arrayList.add((str == null || evu0.J(str)) ? new Pair(stashCell, null) : new Pair(stashCell, str));
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((StashCell) ((Pair) it.next()).c());
        }
        Stash stash = modernAccount.getStash();
        Iterator it2 = arrayList.iterator();
        Stash stash2 = stash;
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            stash2 = Stash.with$default(stash2, (StashCell) pair2.getFirst(), (String) pair2.getSecond(), false, 4, null);
        }
        String json2 = stash2.toJson();
        ModernAccount copy$default = ModernAccount.copy$default(modernAccount, modernAccount.getAccountName(), null, null, null, null, stash2, 30, null);
        boolean contains = arrayList2.contains(StashCell.DISK_PIN_CODE);
        j jVar = this.a;
        if (contains || arrayList2.contains(StashCell.MAIL_PIN_CODE)) {
            jVar.o(copy$default.getAccount(), copy$default.assembleLegacyExtraData().serialize());
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            uw51.w("updateStashImpl: stashBody=", json2, LogLevel.DEBUG, null, 8);
        }
        String valueOf = String.valueOf(copy$default.getUid().getValue());
        Integer valueOf2 = json2 != null ? Integer.valueOf(json2.length()) : null;
        y0 y0Var = this.d;
        y0Var.j(valueOf2, valueOf);
        Account account = copy$default.getAccount();
        jVar.e();
        jVar.a.setUserData(account, "stash", json2);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateStash: account=" + account + " stashBody=" + json2, 8);
        }
        e(AccountRow.copy$default(this.l.a(modernAccount), null, null, null, null, null, json2, null, null, null, 479, null));
        y0Var.f(qb.w, new jd(String.valueOf(copy$default.getUid().getValue()), 3), new com.yandex.passport.internal.report.i(stash2.keys()));
    }

    public final void k(ModernAccount modernAccount, com.yandex.passport.internal.analytics.m mVar) {
        AccountRow a = this.l.a(modernAccount);
        e(a);
        Account account = modernAccount.getAccount();
        j jVar = this.a;
        jVar.e();
        AccountManager accountManager = jVar.a;
        accountManager.setUserData(account, "uid", a.uidString);
        accountManager.setUserData(account, "user_info_body", a.userInfoBody);
        accountManager.setUserData(account, "user_info_meta", a.userInfoMeta);
        accountManager.setUserData(account, "affinity", a.legacyAffinity);
        accountManager.setUserData(account, "account_type", a.legacyAccountType);
        accountManager.setUserData(account, "extra_data", a.legacyExtraDataBody);
        accountManager.setUserData(account, "stash", a.stashBody);
        y0 y0Var = jVar.e;
        String str = a.uidString;
        String str2 = a.stashBody;
        y0Var.j(str2 != null ? Integer.valueOf(str2.length()) : null, str);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "updateUserInfo: account=" + account + " accountRow=" + a, 8);
        }
        com.yandex.passport.internal.core.announcing.c cVar2 = this.b;
        cVar2.a(true);
        cVar2.a.a(mVar);
    }
}
