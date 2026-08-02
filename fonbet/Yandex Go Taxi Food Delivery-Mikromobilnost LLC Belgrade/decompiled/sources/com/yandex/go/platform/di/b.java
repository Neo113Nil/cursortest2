package com.yandex.go.platform.di;

import android.app.Application;
import android.os.Build;
import com.yandex.go.platform.sdk.models.PlatformEnvironment;
import defpackage.ak;
import defpackage.bg1;
import defpackage.boj0;
import defpackage.c1h;
import defpackage.i32;
import defpackage.i3y;
import defpackage.ike;
import defpackage.ivc0;
import defpackage.lb20;
import defpackage.oa1;
import defpackage.sls;
import defpackage.ss2;
import defpackage.x3h;
import defpackage.zch;
import java.util.List;

/* loaded from: classes13.dex */
public final class b {
    public final Application a;
    public final ike b;
    public final boj0 c;
    public final PlatformEnvironment d;
    public final zch e;
    public final lb20 f;
    public final com.yandex.taxi.go_platform.delegates.c g;
    public final com.yandex.go.platform.sdk.models.a h;
    public final ivc0 i;
    public final bg1 j;
    public final ss2 k;
    public final i3y l;
    public final i3y m;
    public final i3y n;
    public final ak o;
    public final i32 p;

    public b(Application application, ike ikeVar, boj0 boj0Var, PlatformEnvironment platformEnvironment, zch zchVar, lb20 lb20Var, oa1 oa1Var, com.yandex.taxi.go_platform.delegates.c cVar, com.yandex.go.platform.sdk.models.a aVar, ivc0 ivc0Var) {
        this.a = application;
        this.b = ikeVar;
        this.c = boj0Var;
        this.d = platformEnvironment;
        this.e = zchVar;
        this.f = lb20Var;
        this.g = cVar;
        this.h = aVar;
        this.i = ivc0Var;
        String str = (String) boj0Var.w;
        String str2 = (String) boj0Var.z;
        String str3 = (String) boj0Var.x;
        String str4 = (String) boj0Var.y;
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        bg1 bg1Var = new bg1(str, str2, str3, str4);
        this.j = bg1Var;
        this.k = new ss2((String) boj0Var.b, bg1Var);
        this.l = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.PlatformComponent$deeplinkHandlerAnalytics$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return new c1h(b.this.f);
            }
        });
        this.m = kotlin.a.a(PlatformComponent$deeplinkStorage$2.w);
        this.n = kotlin.a.a(new sls() { // from class: com.yandex.go.platform.di.PlatformComponent$deeplinkValidator$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                b bVar = b.this;
                return new x3h((List) bVar.c.c, (c1h) bVar.l.getValue());
            }
        });
        this.o = new ak();
        this.p = new i32(lb20Var, oa1Var);
    }
}
