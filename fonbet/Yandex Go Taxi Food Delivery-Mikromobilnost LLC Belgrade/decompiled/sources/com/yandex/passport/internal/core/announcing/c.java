package com.yandex.passport.internal.core.announcing;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.i;
import com.yandex.passport.internal.analytics.m;
import com.yandex.passport.internal.push.k0;
import com.yandex.passport.internal.push.p0;
import com.yandex.passport.internal.sso.announcing.SsoAnnouncer$Source;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
public final class c {
    public final g a;
    public final com.yandex.passport.internal.core.accounts.b b;
    public final k0 c;
    public final d d;
    public final com.yandex.passport.internal.sso.announcing.c e;
    public final com.yandex.passport.internal.helper.a f;
    public final Object g = new Object();

    public c(g gVar, com.yandex.passport.internal.core.accounts.b bVar, k0 k0Var, d dVar, com.yandex.passport.internal.sso.announcing.c cVar, com.yandex.passport.internal.helper.a aVar) {
        this.a = gVar;
        this.b = bVar;
        this.c = k0Var;
        this.d = dVar;
        this.e = cVar;
        this.f = aVar;
    }

    public static void c(c cVar, m mVar) {
        cVar.c.b(null);
        cVar.a(true);
        cVar.a.a(mVar);
    }

    public final void a(boolean z) {
        synchronized (this.g) {
            com.yandex.passport.internal.a a = this.b.a();
            ArrayList c = a.c(a);
            d dVar = this.d;
            dVar.getClass();
            Iterator it = c.iterator();
            while (it.hasNext()) {
                dVar.a((a) it.next());
            }
            if (a.e() && z) {
                this.f.c(a);
                this.e.b(SsoAnnouncer$Source.BACKUP);
            }
        }
    }

    public final void b(ModernAccount modernAccount, boolean z) {
        Uid uid = modernAccount.getUid();
        k0 k0Var = this.c;
        k0Var.e.a(k0Var.a(), new p0(k0Var.a, uid));
        this.d.a(a.b(uid, "com.yandex.passport.client.ACCOUNT_REMOVED"));
        this.a.a(i.i);
        a(z);
    }
}
