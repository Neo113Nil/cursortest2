package com.yandex.plus.pay.internal;

import android.content.Context;
import com.yandex.plus.adapter.auth.api.PlusAuthAdapter$Environment;
import com.yandex.plus.core.analytics.logging.PlusLogTag;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import com.yandex.plus.metrica.utils.e;
import com.yandex.plus.pay.internal.a;
import com.yandex.plus.pay.internal.b;
import defpackage.ads0;
import defpackage.bvf0;
import defpackage.cu90;
import defpackage.cvw;
import defpackage.e1d0;
import defpackage.e5o;
import defpackage.gwk0;
import defpackage.h4j0;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jx81;
import defpackage.kbs;
import defpackage.ku2;
import defpackage.nad0;
import defpackage.oa20;
import defpackage.pad0;
import defpackage.qda0;
import defpackage.qdd0;
import defpackage.qoi0;
import defpackage.scc;
import defpackage.seo;
import defpackage.skd0;
import defpackage.tl5;
import defpackage.tls;
import defpackage.v7d0;
import defpackage.veo;
import defpackage.vg10;
import defpackage.w511;
import defpackage.wyj;
import defpackage.xyj;
import defpackage.yci0;
import defpackage.yyj;
import defpackage.z5d0;
import java.util.List;
import kotlin.Pair;
import kotlin.time.DurationUnit;
import okhttp3.OkHttpClient;

/* loaded from: classes8.dex */
public final class a extends nad0 {
    public final qda0 n;

    public a() {
        this.i = PlusSdkBrandType.YANDEX;
        this.n = new qda0(11);
    }

    public final v7d0 a() {
        String str;
        String str2;
        String str3;
        final Context context = this.e;
        if (context == null) {
            kbs.j("Parameter context is required for ", qoi0.a(a.class), 33);
            return null;
        }
        final String str4 = this.a;
        if (str4 == null) {
            kbs.j("Parameter serviceName is required for ", qoi0.a(a.class), 33);
            return null;
        }
        final com.yandex.plus.metrica.api.a aVar = this.k;
        if (aVar == null) {
            kbs.j("Parameter metricaProvider is required for ", qoi0.a(a.class), 33);
            return null;
        }
        e5o e5oVar = this.d;
        if (e5oVar == null) {
            e5oVar = new vg10(26);
        }
        final e5o e5oVar2 = e5oVar;
        Environment environment = e5oVar2.getEnvironment();
        final ku2 ku2Var = new ku2(context.getApplicationContext(), 15);
        final PlusPayBuilderInternal$build$isBenchmarksNeeded$1 plusPayBuilderInternal$build$isBenchmarksNeeded$1 = new PlusPayBuilderInternal$build$isBenchmarksNeeded$1(0, tl5.a, tl5.class, "isBenchmarksNeeded", "isBenchmarksNeeded()Z", 0);
        int i = qdd0.a[environment.ordinal()];
        if (i == 1) {
            str = "2c129634-4c21-414a-9acd-1890762ce8cf";
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            str = "a99f48c7-c89c-497e-89b3-ee0e697a16d4";
        }
        final z5d0 z5d0Var = new z5d0(context, (oa20) com.yandex.plus.metrica.api.a.b.getValue(), str, "PLUSPAYSDKA", "com.yandex.plus.pay", "plus_hq_Payment-SDK", environment, ku2Var, plusPayBuilderInternal$build$isBenchmarksNeeded$1);
        List g = scc.g(new Pair(new cu90(), z5d0Var.a()), new Pair(new seo("PaySDK"), new veo(new PlusPayBuilderInternal$build$benchmarker$1(0, z5d0Var.a(), h4j0.class, "getStatboxReporter", "getStatboxReporter()Lcom/yandex/plus/core/analytics/StatboxReporter;", 0))));
        yci0 yci0Var = new yci0();
        yyj.a.getClass();
        final wyj wyjVar = xyj.a;
        final ads0 ads0Var = new ads0(plusPayBuilderInternal$build$isBenchmarksNeeded$1, g, yci0Var, wyjVar);
        final ike a = bvf0.a(cvw.U(jl40.a(), wyj.e));
        e1d0 e1d0Var = this.l;
        if (e1d0Var == null) {
            kbs.j("Parameter authAdapter is required for ", qoi0.a(a.class), 33);
            return null;
        }
        PlusAuthAdapter$Environment f = gwk0.f(environment);
        int[] iArr = pad0.a;
        int i2 = iArr[environment.ordinal()];
        if (i2 == 1) {
            str2 = "ihzgHoWQs5rWDMLphyyNrKZz3klJyP18NVDw2HGoHlfSU9axEw7KVsrYmQ+VK6pV";
        } else {
            if (i2 != 2) {
                w511.b();
                return null;
            }
            str2 = "3Ri+ENGXtMqAXsG+h3+M+/mTC8VZfuXV5CfcnQpBL9EbTxbLtAIJW1bl4a/8NeSh";
        }
        String str5 = str2;
        int i3 = iArr[environment.ordinal()];
        if (i3 == 1) {
            str3 = "0B+zGYCdsp2BCJO7hyjZ+gafClC6lVjqBIY0KjJXvyK0+qpw7XuUHIJMwoubyPv8";
        } else {
            if (i3 != 2) {
                w511.b();
                return null;
            }
            str3 = "3R2/EdiRsMnaW8W9hy3Zr8hD9cu98OBokrOkmJdHqhGGFn625OMnoOSSje4evCMs";
        }
        String str6 = str3;
        i3y i3yVar = skd0.a;
        final com.yandex.plus.domain.auth.impl.a aVar2 = new com.yandex.plus.domain.auth.impl.a(e1d0Var, f, str5, str6, skd0.a(PlusLogTag.SDK), a, wyj.c, wyj.f, "pay_sdk");
        return (v7d0) jx81.L(ads0Var, "Initialization", new tls() { // from class: oad0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                a aVar3 = a.this;
                String str7 = aVar3.c;
                if (str7 == null) {
                    kbs.j("Parameter clientSubSource is required for ", qoi0.a(a.class), 33);
                    return null;
                }
                sls slsVar = (sls) plusPayBuilderInternal$build$isBenchmarksNeeded$1;
                o430 o430Var = e3n.b;
                long U = kp50.U(12, DurationUnit.HOURS);
                xyj xyjVar = wyjVar;
                ((wyj) xyjVar).getClass();
                ses0 ses0Var = new ses0(wyj.e);
                z5d0 z5d0Var2 = z5d0Var;
                asd asdVar = new asd(z5d0Var2.a(), new j4j0(ses0Var));
                String str8 = aVar3.j;
                Context context2 = context;
                if (str8 == null) {
                    ga31.a.getClass();
                    str8 = vng.x(context2);
                }
                String str9 = str8;
                String str10 = aVar3.b;
                PlusSdkBrandType plusSdkBrandType = aVar3.i;
                p5z p5zVar = aVar3.f;
                if (p5zVar == null) {
                    p5zVar = new b4d0(1);
                }
                p5z p5zVar2 = p5zVar;
                OkHttpClient.a aVar4 = aVar3.g;
                qda0 qda0Var = aVar3.n;
                p5h p5hVar = new p5h(context2);
                qc20 qc20Var = new qc20(aVar3.h);
                s400 s400Var = aVar3.m;
                x75 x75Var = (x75) z5d0Var2.b.getValue();
                e a2 = z5d0Var2.a();
                e a3 = z5d0Var2.a();
                String str11 = str4;
                return new b(str11, str10, str11, str7, p5zVar2, e5oVar2, context2, aVar4, qda0Var, p5hVar, qc20Var, s400Var, plusSdkBrandType, str9, aVar, x75Var, a2, a3, asdVar, aVar2, ku2Var, slsVar, ads0Var, a, xyjVar, U);
            }
        });
    }
}
