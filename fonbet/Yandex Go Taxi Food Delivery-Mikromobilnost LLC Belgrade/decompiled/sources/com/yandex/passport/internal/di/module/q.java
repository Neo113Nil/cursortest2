package com.yandex.passport.internal.di.module;

import android.content.ClipboardManager;
import android.content.Context;
import com.yandex.passport.internal.analytics.c0;
import com.yandex.passport.internal.analytics.t;
import defpackage.v7p;
import defpackage.yvf0;
import io.appmetrica.analytics.IReporterYandex;

/* loaded from: classes8.dex */
public final class q implements v7p {
    public final /* synthetic */ int a;
    public final n b;
    public final yvf0 c;

    public /* synthetic */ q(n nVar, yvf0 yvf0Var, int i) {
        this.a = i;
        this.b = nVar;
        this.c = yvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        yvf0 yvf0Var = this.c;
        n nVar = this.b;
        switch (i) {
            case 0:
                IReporterYandex iReporterYandex = (IReporterYandex) yvf0Var.get();
                nVar.getClass();
                return new t(iReporterYandex);
            case 1:
                Context context = (Context) yvf0Var.get();
                nVar.getClass();
                return (ClipboardManager) context.getSystemService(ClipboardManager.class);
            case 2:
                t tVar = (t) yvf0Var.get();
                nVar.getClass();
                return new c0(tVar);
            case 3:
                Context context2 = (Context) yvf0Var.get();
                nVar.getClass();
                return new com.yandex.passport.internal.flags.experiments.b(context2.getSharedPreferences("experiments_current_session", 0));
            case 4:
                Context context3 = (Context) yvf0Var.get();
                nVar.getClass();
                return new com.yandex.passport.internal.flags.experiments.d(context3.getPackageName());
            case 5:
                Context context4 = (Context) yvf0Var.get();
                nVar.getClass();
                return new com.yandex.passport.common.permission.c(context4);
            case 6:
                com.yandex.passport.internal.sloth.m mVar = (com.yandex.passport.internal.sloth.m) yvf0Var.get();
                nVar.getClass();
                return mVar;
            default:
                nVar.getClass();
                return null;
        }
    }
}
