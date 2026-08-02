package com.yandex.plus.home;

import android.content.Context;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Environment;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.home.internal.di.g;
import com.yandex.plus.home.internal.di.i;
import com.yandex.plus.metrica.utils.e;
import defpackage.b4d0;
import defpackage.b5d0;
import defpackage.bvf0;
import defpackage.c4d0;
import defpackage.cop0;
import defpackage.cvw;
import defpackage.cxq0;
import defpackage.d4d0;
import defpackage.e1d0;
import defpackage.e3n;
import defpackage.e4d0;
import defpackage.gwk0;
import defpackage.h4j0;
import defpackage.hl21;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.kp50;
import defpackage.kqd0;
import defpackage.l2z;
import defpackage.l8p;
import defpackage.lb7;
import defpackage.mdh;
import defpackage.mid0;
import defpackage.mkd0;
import defpackage.mld0;
import defpackage.n4u0;
import defpackage.nkd0;
import defpackage.nw31;
import defpackage.o370;
import defpackage.o430;
import defpackage.oa20;
import defpackage.ol5;
import defpackage.ow31;
import defpackage.p5z;
import defpackage.qda0;
import defpackage.qhw0;
import defpackage.rkd0;
import defpackage.scc;
import defpackage.seo;
import defpackage.sgy0;
import defpackage.skd0;
import defpackage.t9a0;
import defpackage.tkd0;
import defpackage.tl5;
import defpackage.tls;
import defpackage.tyq0;
import defpackage.v6f0;
import defpackage.veo;
import defpackage.vng;
import defpackage.vpu;
import defpackage.w3m;
import defpackage.w511;
import defpackage.wbd0;
import defpackage.wog;
import defpackage.wyj;
import defpackage.x3m;
import defpackage.x75;
import defpackage.xyj;
import defpackage.y3d0;
import defpackage.yci0;
import defpackage.z3d0;
import defpackage.z5d0;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.time.DurationUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class a {
    public static z3d0 a(y3d0 y3d0Var, wbd0 wbd0Var) {
        vpu sgy0Var;
        String str;
        e4d0 e4d0Var = new e4d0();
        qda0 qda0Var = new qda0(7);
        wbd0Var.invoke(e4d0Var);
        Context applicationContext = y3d0Var.a.getApplicationContext();
        i3y i3yVar = skd0.a;
        rkd0 a = skd0.a(PlusLogTag.SDK);
        nkd0.c.getClass();
        nkd0 nkd0Var = (nkd0) mkd0.c.getValue();
        t9a0 t9a0Var = new t9a0(20, nkd0Var);
        Environment environment = y3d0Var.b;
        String str2 = y3d0Var.c;
        String str3 = y3d0Var.d;
        n4u0 n4u0Var = y3d0Var.e;
        e1d0 e1d0Var = y3d0Var.f;
        b5d0 b5d0Var = y3d0Var.g;
        lb7 lb7Var = y3d0Var.h;
        com.yandex.plus.metrica.api.a aVar = y3d0Var.j;
        n4u0 n4u0Var2 = e4d0Var.a;
        o370 o370Var = e4d0Var.b;
        OkHttpClient.a aVar2 = e4d0Var.c;
        Map f = kotlin.collections.b.f();
        int i = d4d0.a[y3d0Var.b.ordinal()];
        if (i == 1) {
            sgy0Var = new sgy0(e4d0Var.d, t9a0Var, a);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            sgy0Var = new v6f0(e4d0Var.d, t9a0Var, a);
        }
        n4u0 n4u0Var3 = e4d0Var.e;
        if (n4u0Var3 == null) {
            n4u0Var3 = bvf0.c(Boolean.FALSE);
        }
        mld0.W3.getClass();
        p5z p5zVar = e4d0Var.f;
        if (p5zVar == null) {
            p5zVar = new b4d0(0);
        }
        kqd0 kqd0Var = e4d0Var.g;
        ow31.a.getClass();
        l8p l8pVar = nw31.b;
        String packageName = applicationContext.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        String x = vng.x(applicationContext);
        o430 o430Var = e3n.b;
        DurationUnit durationUnit = DurationUnit.HOURS;
        long U = kp50.U(2, durationUnit);
        long U2 = kp50.U(12, durationUnit);
        yci0 yci0Var = new yci0();
        wyj wyjVar = xyj.a;
        n4u0 n4u0Var4 = n4u0Var3;
        vpu vpuVar = sgy0Var;
        final cop0 cop0Var = new cop0(applicationContext, environment, str2, str3, n4u0Var, e1d0Var, b5d0Var, lb7Var, aVar, n4u0Var2, o370Var, aVar2, qda0Var, f, vpuVar, n4u0Var4, p5zVar, kqd0Var, nkd0Var, l8pVar, packageName, x, U, U2, yci0Var, wyjVar, a, y3d0Var.i);
        w3m w3mVar = new w3m(cop0Var, 3);
        PlusHomeSdkBuilderImpl$build$isBenchmarksNeeded$1 plusHomeSdkBuilderImpl$build$isBenchmarksNeeded$1 = new PlusHomeSdkBuilderImpl$build$isBenchmarksNeeded$1(0, tl5.a, tl5.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0);
        int i2 = tkd0.a[environment.ordinal()];
        if (i2 == 1) {
            str = "efc3d9ed-dd0d-44a1-a61a-3dac9b777047";
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            str = "2ca89da6-ea92-4997-80c4-6f78e0b7c571";
        }
        final z5d0 z5d0Var = new z5d0(applicationContext, (oa20) com.yandex.plus.metrica.api.a.b.getValue(), str, "PLUSSDKA", "com.yandex.plus.home", "plus_hq_mobile", environment, w3mVar, plusHomeSdkBuilderImpl$build$isBenchmarksNeeded$1);
        final com.yandex.plus.home.benchmark.b bVar = new com.yandex.plus.home.benchmark.b(plusHomeSdkBuilderImpl$build$isBenchmarksNeeded$1, scc.g(new Pair(new mid0(), z5d0Var.a()), new Pair(new seo("PlusSDK"), new veo(new PlusHomeSdkBuilderImpl$build$benchmarker$1(0, z5d0Var.a(), h4j0.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0)))), yci0Var, wyjVar);
        return (z3d0) jx81.L(bVar, "Initialization", new tls() { // from class: com.yandex.plus.home.b
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                String str4;
                String str5;
                qhw0 a2 = jl40.a();
                cop0 cop0Var2 = cop0.this;
                ((wyj) cop0Var2.z).getClass();
                mdh mdhVar = wyj.e;
                ike a3 = bvf0.a(cvw.U(a2, mdhVar));
                z5d0 z5d0Var2 = z5d0Var;
                x75 x75Var = (x75) z5d0Var2.b.getValue();
                e a4 = z5d0Var2.a();
                e a5 = z5d0Var2.a();
                e a6 = z5d0Var2.a();
                ReentrantLock reentrantLock = i.a;
                i.c(new PlusHomeSdkBuilderImpl$Companion$buildInternal$1(0, a5, tyq0.class, "getSessionController", "getSessionController()Lcom/yandex/plus/core/analytics/SessionController;", 0), wyj.d, mdhVar);
                e1d0 e1d0Var2 = cop0Var2.f;
                Environment environment2 = cop0Var2.b;
                PlusAuthAdapter$Environment f2 = gwk0.f(environment2);
                int[] iArr = c4d0.a;
                int i3 = iArr[environment2.ordinal()];
                if (i3 == 1) {
                    str4 = "jE22HNiRv5rbWsO6hy3X/0pdVzdr6Kd9gzOOGv29+3Yub1E8xzcrYLgPm3WZalQD";
                } else {
                    if (i3 != 2) {
                        w511.b();
                        return null;
                    }
                    str4 = "2ki1HdmQtMrWD8m4hy/fqhJR1ZTAzlUoo2dEu9SUU+1zL9QrUy47pcnLvL6ELcie";
                }
                int i4 = iArr[environment2.ordinal()];
                if (i4 == 1) {
                    str5 = "3hu1EYKUsp/TW5Xshynb+uwwALF5y1D9aPutP+8KT7qGdUnNaBIh1U3lq7MU7885";
                } else {
                    if (i4 != 2) {
                        w511.b();
                        return null;
                    }
                    str5 = "3h2+EdOU5c3XW5Tph3/cqcaVjYscnu2oLbIpqMSXdeVvXFYjTOfE8Xmjf8Wnffcy";
                }
                com.yandex.plus.domain.auth.impl.a aVar3 = new com.yandex.plus.domain.auth.impl.a(e1d0Var2, f2, str4, str5, cop0Var2.A, a3, wyj.c, wyj.f, "home_sdk");
                ol5 ol5Var = new ol5(bVar);
                com.yandex.plus.home.internal.di.b bVar2 = new com.yandex.plus.home.internal.di.b(cop0Var2, aVar3, new PlusHomeSdkBuilderImpl$Companion$buildInternal$analyticsModule$1(0, a4, hl21.class, "getUserConsumer", "getUserConsumer()Lcom/yandex/plus/core/analytics/UserConsumer;", 0), new l2z(15, cop0Var2, a6));
                cxq0 cxq0Var = new cxq0(cop0Var2);
                g gVar = new g(cop0Var2, bVar2, aVar3, x75Var);
                wog wogVar = new wog(x75Var, cop0Var2, bVar2, ol5Var, gVar, cxq0Var, aVar3, a3);
                return new c(cop0Var2, ol5Var, bVar2, gVar, wogVar, new x3m(cop0Var2, wogVar, ol5Var, a3), aVar3, a3);
            }
        });
    }
}
