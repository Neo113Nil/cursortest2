package com.yandex.passport.internal.sso.announcing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.sso.SsoContentProvider;
import com.yandex.passport.internal.sso.g;
import com.yandex.passport.internal.sso.j;
import com.yandex.passport.internal.sso.l;
import com.yandex.passport.legacy.lx.m;
import defpackage.bsq0;
import defpackage.h3y;
import defpackage.kbs;
import defpackage.oyr;
import defpackage.w511;
import defpackage.w53;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes8.dex */
public final class c {
    public final Context a;
    public final g b;
    public final l c;
    public final c0 d;
    public final j e;
    public final h3y f;

    public c(Context context, g gVar, l lVar, c0 c0Var, j jVar, h3y h3yVar) {
        this.a = context;
        this.b = gVar;
        this.c = lVar;
        this.d = c0Var;
        this.e = jVar;
        this.f = h3yVar;
    }

    public final void a(com.yandex.passport.internal.sso.c cVar, SsoAnnouncer$Source ssoAnnouncer$Source, ArrayList arrayList) {
        int i = b.a[ssoAnnouncer$Source.ordinal()];
        c0 c0Var = this.d;
        if (i == 1) {
            String a = cVar.a();
            c0Var.getClass();
            c0Var.i(a, p.f);
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            String a2 = cVar.a();
            c0Var.getClass();
            c0Var.i(a2, p.g);
        }
        String a3 = cVar.a();
        j jVar = this.e;
        jVar.getClass();
        Set set = com.yandex.passport.internal.sso.b.c;
        Bundle a4 = jVar.a(a3, SsoContentProvider.Method.InsertAccounts, u.E(arrayList));
        if (a4 != null) {
            u.G(a4);
        } else {
            kbs.g(oyr.p("Unable insert accounts to ", a3, " : result null"));
        }
    }

    public final void b(SsoAnnouncer$Source ssoAnnouncer$Source) {
        if (!this.c.a()) {
            m.d(new bsq0(8, this, ssoAnnouncer$Source));
            return;
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "SSO is turned off in experiments, skipping announces", 8);
        }
    }

    public final void c(SsoAnnouncer$Source ssoAnnouncer$Source, ArrayList arrayList) {
        Iterator it = this.b.a().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((com.yandex.passport.internal.sso.m) it.next()).a().iterator();
            while (true) {
                if (it2.hasNext()) {
                    com.yandex.passport.internal.sso.c cVar = (com.yandex.passport.internal.sso.c) it2.next();
                    try {
                        a(cVar, ssoAnnouncer$Source, arrayList);
                        com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "insertAccounts to " + cVar.a() + " success", 8);
                        }
                    } catch (Exception e) {
                        com.yandex.passport.common.logger.c cVar3 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Unable to insert accounts to " + cVar.a(), 8);
                        }
                        String a = cVar.a();
                        c0 c0Var = this.d;
                        c0Var.getClass();
                        w53 w53Var = new w53();
                        w53Var.put("remote_package_name", a);
                        w53Var.put("error", Log.getStackTraceString(e));
                        c0Var.a.a(p.l, w53Var);
                        int i = b.a[ssoAnnouncer$Source.ordinal()];
                        if (i == 1) {
                            c0Var.i(cVar.a(), p.d);
                        } else {
                            if (i != 2) {
                                w511.b();
                                return;
                            }
                            c0Var.i(cVar.a(), p.e);
                        }
                        Intent intent = new Intent(SsoAnnouncingReceiver.ACTION_SSO_ANNOUNCEMENT);
                        intent.setPackage(cVar.a());
                        Context context = this.a;
                        intent.putExtra(SsoAnnouncingReceiver.EXTRAS_SSO_SOURCE_PACKAGE_NAME, context.getPackageName());
                        context.sendBroadcast(intent);
                    }
                }
            }
        }
    }
}
