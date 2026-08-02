package com.yandex.plus.pay.ui.core.internal.di;

import android.content.Context;
import com.yandex.plus.pay.common.api.model.PlusPayPlatform;
import defpackage.bdd0;
import defpackage.ga31;
import defpackage.i3y;
import defpackage.n0p;
import defpackage.ned0;
import defpackage.oho;
import defpackage.qje;
import defpackage.sls;
import defpackage.v7d0;
import defpackage.vng;
import defpackage.w490;
import defpackage.yho;
import kotlin.jvm.internal.PropertyReference0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class b {
    public final n0p a;
    public final i3y b;
    public final i3y c;

    public b(n0p n0pVar) {
        this.a = n0pVar;
        final int i = 0;
        i3y a = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.pay.ui.core.internal.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                b bVar = this.b;
                switch (i2) {
                    case 0:
                        n0p n0pVar2 = bVar.a;
                        bdd0 bdd0Var = n0pVar2.f;
                        String str = bdd0Var.a;
                        PlusPayPlatform b = ned0.b(PlusPayPlatform.Companion, bdd0Var.i);
                        bdd0 bdd0Var2 = n0pVar2.f;
                        return new oho(str, b, bdd0Var2.f, bdd0Var2.g, bdd0Var2.k.h, new AnalyticsModule$evgenAnalyticsFactory$2$1(0, n0pVar2.d, v7d0.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0), (com.yandex.plus.experiments.impl.providers.a) ((PropertyReference0) bdd0Var2.z).get(), bdd0Var2.j, bdd0Var2.y, bdd0Var2.x);
                    default:
                        n0p n0pVar3 = bVar.a;
                        Context context = n0pVar3.f.i;
                        PlusPayPlatform b2 = ned0.b(PlusPayPlatform.Companion, context);
                        w490.a.getClass();
                        String packageName = context.getPackageName();
                        ga31.a.getClass();
                        String x = vng.x(context);
                        bdd0 bdd0Var3 = n0pVar3.f;
                        r0 r0Var = bdd0Var3.k.h;
                        String str2 = bdd0Var3.a;
                        AnalyticsModule$evgenDiagnosticFactory$2$1 analyticsModule$evgenDiagnosticFactory$2$1 = new AnalyticsModule$evgenDiagnosticFactory$2$1(0, n0pVar3.d, v7d0.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0);
                        com.yandex.plus.experiments.impl.providers.a aVar = (com.yandex.plus.experiments.impl.providers.a) ((PropertyReference0) bdd0Var3.z).get();
                        return new yho(str2, b2, bdd0Var3.e, packageName, x, r0Var, analyticsModule$evgenDiagnosticFactory$2$1, aVar, bdd0Var3.j, bdd0Var3.l, bdd0Var3.p, new AnalyticsModule$evgenDiagnosticFactory$2$2(0, context, qje.class, "isStoreBuild", "isStoreBuild(Landroid/content/Context;)Z", 1), bdd0Var3.y, bdd0Var3.x);
                }
            }
        });
        final int i2 = 1;
        i3y a2 = kotlin.a.a(new sls(this) { // from class: com.yandex.plus.pay.ui.core.internal.di.a
            public final /* synthetic */ b b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                b bVar = this.b;
                switch (i22) {
                    case 0:
                        n0p n0pVar2 = bVar.a;
                        bdd0 bdd0Var = n0pVar2.f;
                        String str = bdd0Var.a;
                        PlusPayPlatform b = ned0.b(PlusPayPlatform.Companion, bdd0Var.i);
                        bdd0 bdd0Var2 = n0pVar2.f;
                        return new oho(str, b, bdd0Var2.f, bdd0Var2.g, bdd0Var2.k.h, new AnalyticsModule$evgenAnalyticsFactory$2$1(0, n0pVar2.d, v7d0.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0), (com.yandex.plus.experiments.impl.providers.a) ((PropertyReference0) bdd0Var2.z).get(), bdd0Var2.j, bdd0Var2.y, bdd0Var2.x);
                    default:
                        n0p n0pVar3 = bVar.a;
                        Context context = n0pVar3.f.i;
                        PlusPayPlatform b2 = ned0.b(PlusPayPlatform.Companion, context);
                        w490.a.getClass();
                        String packageName = context.getPackageName();
                        ga31.a.getClass();
                        String x = vng.x(context);
                        bdd0 bdd0Var3 = n0pVar3.f;
                        r0 r0Var = bdd0Var3.k.h;
                        String str2 = bdd0Var3.a;
                        AnalyticsModule$evgenDiagnosticFactory$2$1 analyticsModule$evgenDiagnosticFactory$2$1 = new AnalyticsModule$evgenDiagnosticFactory$2$1(0, n0pVar3.d, v7d0.class, "getSubscriptionStatus", "getSubscriptionStatus()Lcom/yandex/plus/core/user/SubscriptionStatus;", 0);
                        com.yandex.plus.experiments.impl.providers.a aVar = (com.yandex.plus.experiments.impl.providers.a) ((PropertyReference0) bdd0Var3.z).get();
                        return new yho(str2, b2, bdd0Var3.e, packageName, x, r0Var, analyticsModule$evgenDiagnosticFactory$2$1, aVar, bdd0Var3.j, bdd0Var3.l, bdd0Var3.p, new AnalyticsModule$evgenDiagnosticFactory$2$2(0, context, qje.class, "isStoreBuild", "isStoreBuild(Landroid/content/Context;)Z", 1), bdd0Var3.y, bdd0Var3.x);
                }
            }
        });
        this.b = kotlin.a.a(new AnalyticsModule$evgenAnalytics$2(0, (oho) a.getValue(), oho.class, "create", "create()LPayUIEvgenAnalytics;", 0));
        this.c = kotlin.a.a(new AnalyticsModule$evgenDiagnostic$2(0, (yho) a2.getValue(), yho.class, "create", "create()LPayUIEvgenDiagnostic;", 0));
    }
}
