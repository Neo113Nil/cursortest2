package com.yandex.passport.internal.core.announcing;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.yandex.passport.internal.a0;
import com.yandex.passport.internal.analytics.m;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.n0;
import defpackage.h73;
import defpackage.scc;
import defpackage.yw01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class g {
    public final Context a;
    public final com.yandex.passport.common.a b;
    public final com.yandex.passport.internal.report.reporters.g c;
    public final com.yandex.passport.common.analytics.d d;
    public final com.yandex.passport.internal.sso.g e;

    public g(Context context, com.yandex.passport.common.a aVar, com.yandex.passport.internal.report.reporters.g gVar, com.yandex.passport.common.analytics.d dVar, com.yandex.passport.internal.config.a aVar2) {
        this.a = context;
        this.b = aVar;
        this.c = gVar;
        this.d = dVar;
        this.e = new com.yandex.passport.internal.sso.g(context, aVar2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(m mVar) {
        String str = mVar.a;
        Context context = this.a;
        String packageName = context.getPackageName();
        String str2 = this.d.b().a;
        if (str2 == null) {
            str2 = null;
        }
        this.b.getClass();
        e d = a0.d(SystemClock.elapsedRealtime(), str, packageName, str2);
        Intent f = d.f();
        f.setFlags(32);
        Object[] objArr = 0;
        List s = kotlin.sequences.b.s(kotlin.sequences.b.g(new yw01(new h73(1, context.getPackageManager().queryBroadcastReceivers(new Intent("com.yandex.accounts.LOGIN_ACCOUNTS_CHANGED"), 512)), new f(0)), new com.yandex.passport.internal.analytics.a0(2, this)));
        com.yandex.passport.internal.report.reporters.g gVar = this.c;
        gVar.getClass();
        ArrayList i = scc.i(new com.yandex.passport.internal.report.a(d.a(), 0, 0 == true ? 1 : 0), new md(s));
        String c = d.c();
        if (c != null) {
            i.add(new md(c, 18, false));
        }
        String d2 = d.d();
        if (d2 != null) {
            i.add(new com.yandex.passport.internal.report.a(d2, 20, objArr == true ? 1 : 0));
        }
        String b = d.b();
        if (b != null) {
            i.add(new md(b, 12, false));
        }
        gVar.e(n0.w, i);
        Iterator it = s.iterator();
        while (it.hasNext()) {
            f.setPackage((String) it.next());
            context.sendBroadcast(f);
        }
    }
}
