package com.yandex.passport.internal.usecase;

import android.accounts.Account;
import android.content.SharedPreferences;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.AccountRow;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.yd;
import defpackage.v4r0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;

/* loaded from: classes8.dex */
public final class z0 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.config.a b;
    public final com.yandex.passport.internal.core.accounts.j c;
    public final com.yandex.passport.internal.report.reporters.b d;

    public z0(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.config.a aVar2, com.yandex.passport.internal.core.accounts.j jVar, com.yandex.passport.internal.report.reporters.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        this.b = aVar2;
        this.c = jVar;
        this.d = bVar;
    }

    @Override // com.yandex.passport.common.domain.d
    public final Object b(Object obj, Continuation continuation) {
        Object failure;
        com.yandex.passport.internal.report.reporters.b bVar;
        Object obj2;
        com.yandex.passport.internal.core.accounts.j jVar = this.c;
        try {
            Set<String> stringSet = ((SharedPreferences) this.b.b.getValue()).getStringSet("blacklisted_apps", null);
            if (stringSet == null) {
                stringSet = EmptySet.a;
            }
            Iterator it = jVar.b().iterator();
            while (it.hasNext()) {
                AccountRow accountRow = (AccountRow) it.next();
                Account account = accountRow.toAccount();
                String str = accountRow.uidString;
                if (str != null) {
                    Set g = v4r0.g(jVar.f(account), stringSet);
                    Iterator it2 = g.iterator();
                    while (true) {
                        boolean hasNext = it2.hasNext();
                        bVar = this.d;
                        if (!hasNext) {
                            break;
                        }
                        String str2 = (String) it2.next();
                        boolean m = jVar.m(account, str2, true);
                        bVar.getClass();
                        bVar.f(com.yandex.passport.internal.report.n.w, new jd(str, 3), new com.yandex.passport.internal.report.a(str2, 2, false), new yd(m, 6));
                    }
                    int i = 2;
                    for (String str3 : stringSet) {
                        boolean m2 = jVar.m(account, str3, false);
                        bVar.getClass();
                        i = 2;
                        bVar.f(com.yandex.passport.internal.report.m.w, new jd(str, 3), new com.yandex.passport.internal.report.a(str3, i, false), new yd(m2, 6));
                    }
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        obj2 = null;
                        com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "applied visibility for account=" + account + " hidden=" + stringSet + " revealed=" + g, 8);
                    } else {
                        obj2 = null;
                    }
                }
            }
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
