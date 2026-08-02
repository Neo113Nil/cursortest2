package com.yandex.passport.internal.core.accounts;

import android.accounts.Account;
import android.os.Build;
import android.text.TextUtils;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.database.DatabaseHelper;
import defpackage.b64;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.kgx;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.uo2;
import defpackage.w53;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class b {
    public final j a;
    public final l b;
    public final DatabaseHelper c;
    public final com.yandex.passport.internal.core.sync.a d;
    public final h3y e;
    public final com.yandex.passport.internal.storage.i f;
    public final c0 g;
    public final com.yandex.passport.internal.properties.p h;
    public final com.yandex.passport.internal.flags.j i;
    public final Object j = new Object();
    public final Object k = new Object();

    public b(j jVar, l lVar, DatabaseHelper databaseHelper, com.yandex.passport.internal.core.sync.a aVar, h3y h3yVar, com.yandex.passport.internal.storage.i iVar, c0 c0Var, com.yandex.passport.internal.properties.p pVar, com.yandex.passport.internal.flags.j jVar2) {
        this.a = jVar;
        this.b = lVar;
        this.c = databaseHelper;
        this.d = aVar;
        this.e = h3yVar;
        this.f = iVar;
        this.g = c0Var;
        this.h = pVar;
        this.i = jVar2;
    }

    public final com.yandex.passport.internal.a a() {
        com.yandex.passport.internal.a n;
        synchronized (this.j) {
            ArrayList b = this.a.b();
            n = com.yandex.passport.internal.ui.c.n(kotlin.collections.a.m0(this.b.a(b), b), this.c.getAccountRows());
            this.c.mergeAccountRows(n);
            Iterator it = b.iterator();
            while (it.hasNext()) {
                this.d.a(((AccountRow) it.next()).toAccount());
            }
        }
        return n;
    }

    public final boolean b() {
        String e = this.a.e();
        com.yandex.passport.internal.storage.i iVar = this.f;
        String str = (String) iVar.e.getValue(iVar, com.yandex.passport.internal.storage.i.m[3]);
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, b64.l("isAuthenticatorChanged: current=", e, " last=", str), 8);
        }
        return !TextUtils.equals(e, str);
    }

    public final void c(String str) {
        com.yandex.passport.internal.storage.i iVar = this.f;
        j jVar = this.a;
        Account[] c = jVar.c();
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "restore: systemAccounts.length=" + c.length + " from=" + str, 8);
        }
        if (c.length == 0) {
            List<AccountRow> accountRows = this.c.getAccountRows();
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "restore: localAccountRows.size()=" + accountRows.size() + " from=" + str, 8);
            }
            if (!accountRows.isEmpty()) {
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "restore: restoreAccountRows: from=".concat(str), 8);
                }
                synchronized (this.k) {
                    d(str, accountRows);
                }
            }
        }
        if ("android.accounts.LOGIN_ACCOUNTS_CHANGED".equals(str)) {
            String e = jVar.e();
            uo2 uo2Var = iVar.e;
            kgx[] kgxVarArr = com.yandex.passport.internal.storage.i.m;
            if (e.equals((String) uo2Var.getValue(iVar, kgxVarArr[3]))) {
                return;
            }
            this.g.f(iVar.a(), jVar.c().length, e, "backuper");
            iVar.l.setValue(iVar, kgxVarArr[11], Integer.valueOf(jVar.c().length));
            iVar.e.setValue(iVar, kgxVarArr[3], e);
        }
    }

    public final void d(String str, List list) {
        String str2;
        int D;
        Environment environment;
        boolean b = b();
        c0 c0Var = this.g;
        j jVar = this.a;
        if (!b) {
            com.yandex.passport.internal.flags.m mVar = com.yandex.passport.internal.flags.q.s0;
            com.yandex.passport.internal.flags.j jVar2 = this.i;
            if (!((List) jVar2.b(mVar)).contains(Build.MODEL)) {
                boolean z = ((Boolean) jVar2.b(com.yandex.passport.internal.flags.q.y0)).booleanValue() && this.f.a() != 0 && jVar.c().length == 0;
                if (z) {
                    com.yandex.passport.internal.analytics.t tVar = c0Var.a;
                    com.yandex.passport.internal.analytics.k kVar = com.yandex.passport.internal.analytics.k.b;
                    tVar.a(a0.B(), kotlin.collections.b.f());
                }
                if (!z) {
                    return;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (true) {
            Uid uid = null;
            if (!it.hasNext()) {
                break;
            }
            AccountRow accountRow = (AccountRow) it.next();
            h hVar = this.h.u ? new h(new Account("SaveLocal", "type"), false) : jVar.a(accountRow);
            if (hVar.b()) {
                this.d.a(hVar.a());
            } else {
                String str3 = accountRow.uidString;
                if (str3 != null && (D = evu0.D(str3, ':', 0, false)) >= 1 && D != str3.length() - 1) {
                    String substring = str3.substring(0, D);
                    try {
                        long parseLong = Long.parseLong(str3.substring(D + 1));
                        if (parseLong > 0) {
                            try {
                                com.yandex.passport.common.core.a aVar = Environment.Companion;
                                int parseInt = Integer.parseInt(substring);
                                aVar.getClass();
                                environment = com.yandex.passport.common.core.a.a(parseInt);
                            } catch (Exception unused) {
                                environment = Environment.PRODUCTION;
                            }
                            uid = a0.b(environment, parseLong);
                        }
                    } catch (NumberFormatException unused2) {
                    }
                }
                if (uid == null || (str2 = Long.valueOf(uid.getValue()).toString()) == null) {
                    str2 = accountRow.uidString;
                }
                hashSet.add(str2);
            }
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            LogLevel logLevel = LogLevel.DEBUG;
            StringBuilder x = unr0.x("restoreAccountRows: from=", str, " accounts.size()=");
            x.append(list.size());
            x.append(" failed: ");
            x.append(hashSet);
            com.yandex.passport.common.logger.a.c(logLevel, null, x.toString(), 8);
        }
        int size = list.size();
        c0Var.getClass();
        com.yandex.passport.internal.analytics.t tVar2 = c0Var.a;
        w53 w53Var = new w53();
        w53Var.put("from", str);
        w53Var.put("accounts_num", String.valueOf(size));
        w53Var.put("restoration_failed_uids", hashSet.isEmpty() ? "none" : TextUtils.join(Extension.FIX_SPACE, hashSet));
        tVar2.a(com.yandex.passport.internal.analytics.i.n, w53Var);
        int size2 = list.size();
        int length = jVar.c().length;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, oyr.h(length, size2, "reportRestoredAccounts: systemAccountsSize=", " localAccountSize="), 8);
        }
        if (size2 != length) {
            w53 w53Var2 = new w53();
            w53Var2.put("accounts_num", String.valueOf(size2));
            w53Var2.put("system_accounts_num", String.valueOf(length));
            tVar2.a(com.yandex.passport.internal.analytics.i.o, w53Var2);
        }
        com.yandex.passport.internal.core.announcing.c cVar2 = (com.yandex.passport.internal.core.announcing.c) this.e.get();
        cVar2.getClass();
        cVar2.a(true);
        cVar2.a.a(com.yandex.passport.internal.analytics.i.j);
    }
}
