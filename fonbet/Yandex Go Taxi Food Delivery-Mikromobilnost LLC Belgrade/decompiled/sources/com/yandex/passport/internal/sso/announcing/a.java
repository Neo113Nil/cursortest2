package com.yandex.passport.internal.sso.announcing;

import android.os.Bundle;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.core.accounts.n;
import com.yandex.passport.internal.core.accounts.z;
import com.yandex.passport.internal.network.mappers.h;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.sso.AccountAction$LastAction;
import com.yandex.passport.internal.sso.SsoContentProvider;
import com.yandex.passport.internal.sso.SsoDisabledException;
import com.yandex.passport.internal.sso.j;
import com.yandex.passport.internal.sso.l;
import defpackage.oyr;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w53;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.passport.internal.core.accounts.e a;
    public final z b;
    public final n c;
    public final com.yandex.passport.internal.helper.a d;
    public final j e;
    public final l f;
    public final c0 g;
    public final h h;

    public a(com.yandex.passport.internal.core.accounts.e eVar, z zVar, n nVar, com.yandex.passport.internal.helper.a aVar, j jVar, l lVar, c0 c0Var, h hVar) {
        this.a = eVar;
        this.b = zVar;
        this.c = nVar;
        this.d = aVar;
        this.e = jVar;
        this.f = lVar;
        this.g = c0Var;
        this.h = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.yandex.passport.internal.sso.a, java.lang.Object] */
    public final ArrayList a() {
        if (this.f.a()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Sso disabled", 8);
            }
            throw new SsoDisabledException();
        }
        ArrayList f = this.c.b(true).f();
        com.yandex.passport.internal.helper.a aVar = this.d;
        List<com.yandex.passport.internal.sso.a> accountsLastActions = aVar.a.getAccountsLastActions();
        ArrayList arrayList = new ArrayList(tcc.n(accountsLastActions, 10));
        for (com.yandex.passport.internal.sso.a aVar2 : accountsLastActions) {
            arrayList.add(new Pair(aVar2.d(), aVar2));
        }
        Map s = kotlin.collections.b.s(arrayList);
        ArrayList arrayList2 = new ArrayList(tcc.n(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            ModernAccount modernAccount = (ModernAccount) it.next();
            ?? r8 = s.get(modernAccount.getUid());
            if (r8 == 0) {
                r8 = aVar.a(modernAccount);
                com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "getAccounts(): account found in system but not in actions table, updating: " + r8, 8);
                }
                long value = r8.d().getValue();
                c0 c0Var = this.g;
                c0Var.getClass();
                w53 w53Var = new w53();
                w53Var.put("uid", Long.toString(value));
                c0Var.a.a(p.o, w53Var);
            }
            arrayList2.add(new com.yandex.passport.internal.sso.b((com.yandex.passport.internal.sso.a) r8, this.h.a(modernAccount)));
        }
        Collection values = s.values();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : values) {
            if (((com.yandex.passport.internal.sso.a) obj).a() == AccountAction$LastAction.DELETE) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(new com.yandex.passport.internal.sso.b((com.yandex.passport.internal.sso.a) it2.next(), null));
        }
        ArrayList m0 = kotlin.collections.a.m0(arrayList4, arrayList2);
        com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            LogLevel logLevel = LogLevel.DEBUG;
            StringBuilder sb = new StringBuilder("getAccounts(): accountList=");
            ArrayList arrayList5 = new ArrayList(tcc.n(m0, 10));
            Iterator it3 = m0.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((com.yandex.passport.internal.sso.b) it3.next()).a());
            }
            sb.append(arrayList5);
            com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
        }
        return m0;
    }

    public final void b(String str, SsoAccountsSyncHelper$Source ssoAccountsSyncHelper$Source) {
        List list;
        if (this.f.a()) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "SSO is turned off in experiments, skipping sync accounts", 8);
                return;
            }
            return;
        }
        j jVar = this.e;
        c0 c0Var = jVar.b;
        c0Var.getClass();
        c0Var.i(str, p.j);
        if (jVar.c.b(str)) {
            Bundle a = jVar.a(str, SsoContentProvider.Method.GetAccounts, Bundle.EMPTY);
            if (a == null) {
                throw new Exception(oyr.p("Unable to getAccounts from ", str, " : bundle null"));
            }
            u.G(a);
            Set set = com.yandex.passport.internal.sso.b.c;
            ArrayList D = u.D(a);
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            list = D;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                LogLevel logLevel = LogLevel.DEBUG;
                StringBuilder sb = new StringBuilder("getAccounts(): ");
                ArrayList arrayList = new ArrayList(tcc.n(D, 10));
                Iterator it = D.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.yandex.passport.internal.sso.b) it.next()).a());
                }
                sb.append(arrayList);
                com.yandex.passport.common.logger.a.c(logLevel, null, sb.toString(), 8);
                list = D;
            }
        } else {
            list = EmptyList.a;
        }
        c(list, str, ssoAccountsSyncHelper$Source);
    }

    public final synchronized void c(List list, String str, SsoAccountsSyncHelper$Source ssoAccountsSyncHelper$Source) {
        try {
            if (this.f.a()) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "SSO is turned off in experiments, skipping sync accounts", 8);
                }
                throw new SsoDisabledException();
            }
            ArrayList a = a();
            ArrayList arrayList = new ArrayList(tcc.n(a, 10));
            Iterator it = a.iterator();
            while (it.hasNext()) {
                com.yandex.passport.internal.sso.b bVar = (com.yandex.passport.internal.sso.b) it.next();
                arrayList.add(new Pair(bVar.a().d(), bVar.a()));
            }
            Map s = kotlin.collections.b.s(arrayList);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.yandex.passport.internal.sso.b bVar2 = (com.yandex.passport.internal.sso.b) it2.next();
                com.yandex.passport.internal.sso.a aVar = (com.yandex.passport.internal.sso.a) s.get(bVar2.a().d());
                AccountRow b = bVar2.b();
                ModernAccount b2 = b != null ? this.h.b(b) : null;
                com.yandex.passport.internal.sso.a a2 = bVar2.a();
                if (aVar == null) {
                    if (a2.a() == AccountAction$LastAction.DELETE) {
                        this.d.b(a2);
                        tje.X(new SsoAccountsSyncHelper$forceRemoveAccount$1(this, a2.d(), null));
                        linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.LOCAL_EMPTY_REMOTE_DELETED);
                    } else if (b2 == null) {
                        linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.LOCAL_EMPTY_REMOTE_ACCOUNT_EMPTY);
                    } else {
                        this.d.b(a2);
                        com.yandex.passport.internal.core.accounts.e eVar = this.a;
                        com.yandex.passport.internal.analytics.n nVar = com.yandex.passport.internal.analytics.n.b;
                        eVar.a(b2, a0.J(), false);
                        linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.LOCAL_EMPTY_REMOTE_ADDED);
                    }
                } else if (aVar.c() > a2.c()) {
                    com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "Local action newer then remote:\nlocal=" + aVar + "\nremoteAction=" + a2, 8);
                    }
                    linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.LOCAL_TIMESTAMP_NEWER);
                } else {
                    AccountAction$LastAction a3 = bVar2.a().a();
                    AccountAction$LastAction accountAction$LastAction = AccountAction$LastAction.DELETE;
                    if (a3 == accountAction$LastAction) {
                        if (aVar.b() > a2.b()) {
                            com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "ERROR: localAction.localTimestamp > remoteAction.localTimestamp", 8);
                            }
                            linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.REMOTE_DELETED_LOCAL_LOCAL_TIMESTAMP_NEWER);
                        } else if (aVar.a() != accountAction$LastAction) {
                            try {
                                this.d.b(a2);
                                tje.X(new SsoAccountsSyncHelper$forceRemoveAccount$1(this, a2.d(), null));
                                linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.REMOTE_DELETED_LOCAL_REMOVE_SUCCESS);
                            } catch (PassportAccountNotFoundException unused) {
                                com.yandex.passport.common.logger.c cVar4 = com.yandex.passport.common.logger.a.a;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Remove account failed: account with uid " + a2.d() + " not found", 8);
                                }
                                linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.REMOTE_DELETED_LOCAL_ACCOUNT_NOT_FOUND);
                            }
                        } else {
                            linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.REMOTE_DELETED_LOCAL_DELETED);
                        }
                    } else if (b2 == null) {
                        linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.REMOTE_ACCOUNT_EMPTY);
                    } else if (aVar.c() < a2.c()) {
                        this.d.b(a2);
                        com.yandex.passport.internal.core.accounts.e eVar2 = this.a;
                        com.yandex.passport.internal.analytics.n nVar2 = com.yandex.passport.internal.analytics.n.b;
                        eVar2.a(b2, a0.J(), false);
                        linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.LOCAL_TIMESTAMP_OLDER_UPGRADE);
                    } else if (aVar.b() == a2.b()) {
                        linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.LOCAL_LOCAL_TIMESTAMP_SAME);
                    } else if (aVar.b() > a2.b()) {
                        com.yandex.passport.common.logger.c cVar5 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "ERROR: localAction.localTimestamp > remoteAction.localTimestamp", 8);
                        }
                        linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.LOCAL_LOCAL_TIMESTAMP_NEWER);
                    } else {
                        this.d.b(a2);
                        com.yandex.passport.internal.core.accounts.e eVar3 = this.a;
                        com.yandex.passport.internal.analytics.n nVar3 = com.yandex.passport.internal.analytics.n.b;
                        eVar3.a(b2, a0.J(), false);
                        linkedHashMap.put(Long.valueOf(a2.d().getValue()), SsoAccountsSyncHelper$MergeResult.LOCAL_LOCAL_TIMESTAMP_OLDER);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList2.add(new Pair(String.valueOf(((Number) entry.getKey()).longValue()), ((SsoAccountsSyncHelper$MergeResult) entry.getValue()).toString()));
            }
            Map s2 = kotlin.collections.b.s(arrayList2);
            c0 c0Var = this.g;
            String name = ssoAccountsSyncHelper$Source.name();
            c0Var.getClass();
            w53 w53Var = new w53();
            w53Var.put("remote_package_name", str);
            w53Var.put("source", name);
            w53Var.putAll(s2);
            c0Var.a.a(p.h, w53Var);
        } catch (Throwable th) {
            throw th;
        }
    }
}
