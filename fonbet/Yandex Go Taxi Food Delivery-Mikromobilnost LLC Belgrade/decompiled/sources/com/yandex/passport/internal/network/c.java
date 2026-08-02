package com.yandex.passport.internal.network;

import com.yandex.passport.data.network.core.DataEvents;
import com.yandex.passport.internal.report.a2;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.w1;
import com.yandex.passport.internal.report.x1;
import com.yandex.passport.internal.report.y1;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.report.z1;
import defpackage.d5j0;
import defpackage.fd20;
import defpackage.kwu;
import defpackage.w511;
import kotlin.Result;

/* loaded from: classes8.dex */
public final class c {
    public final com.yandex.passport.internal.report.reporters.k a;

    public c(com.yandex.passport.internal.report.reporters.k kVar) {
        this.a = kVar;
    }

    public final void a(com.yandex.passport.common.network.j jVar, d5j0 d5j0Var) {
        com.yandex.passport.internal.report.reporters.k kVar = this.a;
        kVar.getClass();
        try {
            if (jVar instanceof com.yandex.passport.common.network.g) {
                com.yandex.passport.common.network.d a = ((com.yandex.passport.common.network.g) jVar).a.a();
                y1 y1Var = y1.w;
                String c = a.c();
                String str = "";
                if (c == null) {
                    c = "";
                }
                boolean z = false;
                md mdVar = new md(c, 15, z);
                com.yandex.passport.internal.report.a aVar = new com.yandex.passport.internal.report.a(a.b(), 26, z);
                String a2 = a.a();
                if (a2 != null) {
                    str = a2;
                }
                md mdVar2 = new md(str, 12, z);
                kwu kwuVar = d5j0Var.a;
                kVar.f(y1Var, mdVar, aVar, mdVar2, new com.yandex.passport.internal.report.a(kwuVar.d, 5, z), new yd(kwuVar.b(), 20, z));
            }
        } catch (Throwable unused) {
        }
    }

    public final void b(Object obj, DataEvents dataEvents) {
        fd20 fd20Var;
        int i = b.a[dataEvents.ordinal()];
        if (i == 1) {
            fd20Var = w1.w;
        } else if (i == 2) {
            fd20Var = x1.w;
        } else if (i == 3) {
            fd20Var = a2.w;
        } else {
            if (i != 4) {
                w511.b();
                return;
            }
            fd20Var = z1.w;
        }
        boolean z = obj instanceof Result.Failure;
        com.yandex.passport.internal.report.reporters.k kVar = this.a;
        if (z) {
            kVar.getClass();
        } else {
            kVar.h(fd20Var);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            kVar.f(fd20Var, new yd(a));
        }
    }
}
