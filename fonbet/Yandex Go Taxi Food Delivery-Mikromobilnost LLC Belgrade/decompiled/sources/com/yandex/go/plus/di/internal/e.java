package com.yandex.go.plus.di.internal;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.core.strings.PlusSdkBrandType;
import defpackage.am2;
import defpackage.au50;
import defpackage.b5d0;
import defpackage.c0d0;
import defpackage.c2d0;
import defpackage.d9;
import defpackage.eqh;
import defpackage.exf0;
import defpackage.ga1;
import defpackage.gci0;
import defpackage.i3y;
import defpackage.ij41;
import defpackage.kgz;
import defpackage.l2z;
import defpackage.lb7;
import defpackage.lzc0;
import defpackage.mdh;
import defpackage.n4u0;
import defpackage.ngd0;
import defpackage.ny61;
import defpackage.oay0;
import defpackage.ofa0;
import defpackage.oo2;
import defpackage.p4d0;
import defpackage.qgd0;
import defpackage.r66;
import defpackage.ru2;
import defpackage.sjh;
import defpackage.t3d0;
import defpackage.t9a0;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.v7d0;
import defpackage.v7p;
import defpackage.vog;
import defpackage.w511;
import defpackage.wbd0;
import defpackage.x2d0;
import defpackage.xvf0;
import defpackage.y3d0;
import defpackage.yzc0;
import defpackage.z3d0;
import defpackage.zhd0;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.cashback.sdk.t;

/* loaded from: classes8.dex */
public final class e implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public e(xvf0 xvf0Var, eqh eqhVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4) {
        this.a = xvf0Var;
        this.b = eqhVar;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        PlusSdkBrandType plusSdkBrandType;
        x2d0 x2d0Var = (x2d0) this.a.get();
        c2d0 c2d0Var = (c2d0) this.b.get();
        t tVar = (t) this.c.get();
        tt2 tt2Var = (tt2) this.d.get();
        kgz kgzVar = (kgz) this.e.get();
        wbd0 wbd0Var = new wbd0(c2d0Var, 0);
        com.yandex.plus.pay.internal.a aVar = new com.yandex.plus.pay.internal.a();
        wbd0Var.invoke(aVar);
        v7d0 a = aVar.a();
        qgd0 r = ngd0.r(new ga1(20, a, x2d0Var.j, x2d0Var.g));
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        c0d0 c0d0Var = (c0d0) ((i3y) new ofa0(a, r, mdh.b).w).getValue();
        Environment environment = c2d0Var.d == ru.yandex.taxi.plus.sdk.Environment.PRODUCTION ? Environment.PRODUCTION : Environment.TESTING;
        int i = ij41.a[c2d0Var.z.ordinal()];
        if (i == 1) {
            plusSdkBrandType = PlusSdkBrandType.YANDEX;
        } else if (i == 2) {
            plusSdkBrandType = PlusSdkBrandType.YANGO;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            plusSdkBrandType = PlusSdkBrandType.YANDEX;
        }
        PlusSdkBrandType plusSdkBrandType2 = plusSdkBrandType;
        Context context = c2d0Var.a;
        String str = c2d0Var.k;
        ru.yandex.taxi.plus.sdk.micro_widget.websdk.a aVar2 = c2d0Var.y;
        com.yandex.plus.metrica.api.a aVar3 = c2d0Var.x;
        gci0 gci0Var = tVar.e;
        oay0 oay0Var = new oay0(16, tVar);
        OkHttpClient.a aVar4 = c2d0Var.q;
        aVar4.getClass();
        new OkHttpClient(aVar4);
        ru2 ru2Var = new ru2(context, str, aVar2, aVar3, environment, plusSdkBrandType2, oay0Var);
        try {
            Context applicationContext = c2d0Var.a.getApplicationContext();
            String str2 = c2d0Var.k;
            String str3 = c2d0Var.v;
            n4u0 n4u0Var = x2d0Var.g;
            ru.yandex.taxi.plus.sdk.micro_widget.websdk.a aVar5 = c2d0Var.y;
            b5d0 b5d0Var = x2d0Var.j;
            lb7 lb7Var = new lb7(24, new oay0(17, a), new WebPlusSdkModule$Companion$providePlusHomeSdk$2(r, null));
            yzc0 yzc0Var = new yzc0(new oo2(ru2Var), c0d0Var, x2d0Var.j);
            am2 am2Var = new am2();
            am2Var.a = yzc0Var;
            am2Var.b = kotlin.a.a(new r66(8));
            am2Var.c = kotlin.a.a(new d9(26, am2Var));
            am2 am2Var2 = new am2();
            am2Var2.a = am2Var;
            am2Var2.b = c0d0Var;
            am2Var2.c = kotlin.a.a(new t9a0(16, am2Var2));
            z3d0 a2 = com.yandex.plus.home.a.a(new y3d0(applicationContext, environment, str2, str3, n4u0Var, aVar5, b5d0Var, lb7Var, am2Var2, c2d0Var.x), new wbd0(c2d0Var, 1));
            exf0 exf0Var = new exf0(kotlin.a.a(new l2z(21, new au50(28, a2), new vog(new lzc0((p4d0) a2, new zhd0())))));
            t3d0 t3d0Var = (t3d0) a2;
            synchronized (t3d0Var) {
                if (t3d0Var.getPlugin() != null) {
                    return a2;
                }
                t3d0Var.a(exf0Var);
                return a2;
            }
        } catch (RuntimeException e) {
            kgzVar.b(e, "Failed to create PlusSdk");
            ny61.h("Failed to create PlusSdk", e);
            return null;
        }
    }
}
