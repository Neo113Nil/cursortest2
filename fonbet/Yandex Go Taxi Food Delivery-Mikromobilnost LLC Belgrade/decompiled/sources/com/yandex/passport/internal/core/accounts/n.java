package com.yandex.passport.internal.core.accounts;

import com.yandex.passport.common.exception.InvalidTokenException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.data.exceptions.FailedResponseException;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.database.DatabaseHelper;
import com.yandex.passport.internal.report.reporters.DropPlace;
import defpackage.w53;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONException;

/* loaded from: classes8.dex */
public final class n {
    public static final Long[] j = {500L, 1000L, 3000L, 10000L};
    public final j a;
    public final l b;
    public final DatabaseHelper c;
    public final b d;
    public final k e;
    public final c0 f;
    public final com.yandex.passport.common.a g;
    public final com.yandex.passport.internal.network.mappers.h h;
    public final com.yandex.passport.internal.storage.i i;

    public n(j jVar, l lVar, DatabaseHelper databaseHelper, b bVar, k kVar, c0 c0Var, com.yandex.passport.common.a aVar, com.yandex.passport.internal.network.mappers.h hVar, com.yandex.passport.internal.storage.i iVar) {
        this.a = jVar;
        this.b = lVar;
        this.c = databaseHelper;
        this.d = bVar;
        this.e = kVar;
        this.f = c0Var;
        this.g = aVar;
        this.h = hVar;
        this.i = iVar;
    }

    public final boolean a(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            AccountRow accountRow = (AccountRow) it.next();
            if (this.h.b(accountRow) == null) {
                try {
                    this.e.a(accountRow, com.yandex.passport.internal.analytics.i.m, DropPlace.REPAIR_CORRUPTED_RETRIEVE);
                    z = true;
                } catch (InvalidTokenException e) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "repairCorruptedAccounts", e);
                    }
                } catch (FailedResponseException e2) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "repairCorruptedAccounts", e2);
                    }
                } catch (IOException e3) {
                    com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "repairCorruptedAccounts", e3);
                    }
                } catch (JSONException e4) {
                    com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "repairCorruptedAccounts", e4);
                    }
                }
            }
        }
        return z;
    }

    public final com.yandex.passport.internal.b b(boolean z) {
        com.yandex.passport.internal.storage.i iVar = this.i;
        c0 c0Var = this.f;
        b bVar = this.d;
        List<AccountRow> accountRows = this.c.getAccountRows();
        j jVar = this.a;
        ArrayList b = jVar.b();
        if (b.size() < accountRows.size() && !b.isEmpty() && bVar.b()) {
            c0Var.f(iVar.a(), jVar.c().length, jVar.e(), "retriever");
            Long[] lArr = j;
            for (int i = 0; i < 4; i++) {
                long longValue = lArr[i].longValue();
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Error retrieve accounts: localAccountRows.size=" + accountRows.size() + ", systemAccountRows.size=" + b.size(), 8);
                }
                int size = accountRows.size();
                int size2 = b.size();
                w53 w53Var = new w53();
                w53Var.put("accounts_num", String.valueOf(size));
                w53Var.put("system_accounts_num", String.valueOf(size2));
                w53Var.put("timeout", String.valueOf(longValue));
                c0Var.a.a(com.yandex.passport.internal.analytics.i.p, w53Var);
                this.g.getClass();
                try {
                    Thread.sleep(longValue);
                } catch (InterruptedException e) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(LogLevel.DEBUG, null, "call: timeout", e);
                    }
                }
                b = jVar.b();
                if (b.size() == accountRows.size() || b.isEmpty()) {
                    break;
                }
            }
        }
        if (!b.isEmpty()) {
            if (a(b)) {
                b = jVar.b();
            }
            bVar.a();
        } else if (!accountRows.isEmpty()) {
            synchronized (bVar.k) {
                bVar.d("AccountsRetriever.retrieve()", accountRows);
            }
            b = jVar.b();
            if (a(b)) {
                b = jVar.b();
            }
        }
        List a = z ? EmptyList.a : this.b.a(b);
        com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Accounts count = " + b.size() + ", delayed " + a.size(), 8);
        }
        iVar.l.setValue(iVar, com.yandex.passport.internal.storage.i.m[11], Integer.valueOf(jVar.c().length));
        return new com.yandex.passport.internal.b(kotlin.collections.a.m0(a, b), this.h);
    }
}
