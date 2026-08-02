package com.yandex.go.taxi.order.analytics;

import defpackage.bvf0;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.mux;
import defpackage.tje;
import defpackage.tls;
import defpackage.w53;
import defpackage.x4e;
import defpackage.yxx0;
import defpackage.zf;
import java.util.HashMap;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class a {
    public final mux a;
    public final yxx0 b;
    public final zf c;
    public final w53 d = new w53();
    public final ike e = bvf0.b();
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    public a(mux muxVar, yxx0 yxx0Var, zf zfVar) {
        this.a = muxVar;
        this.b = yxx0Var;
        this.c = zfVar;
    }

    public final void a(tls tlsVar) {
        tje.N(this.e, null, null, new OrderStatusAnalytics$doIfEnabled$1(this, tlsVar, null), 3);
    }

    public final void b(String str, DriveState driveState) {
        a(new OrderStatusAnalytics$illegalDriveState$1(this, str, driveState, null));
    }

    public final void c() {
        x4e.B(this.c.a, "OrderPolling.MissingComponent", new HashMap(), 1);
    }

    public final void d(int i, String str) {
        a(new OrderStatusAnalytics$startUpdate$1(this, str, i, null));
    }

    public final void e(String str, String str2) {
        a(new OrderStatusAnalytics$stopMonitoring$1(this, str, str2, null));
    }

    public final void f(String str) {
        a(new OrderStatusAnalytics$stopService$1(this, str, null));
    }

    public final void g(int i, String str) {
        a(new OrderStatusAnalytics$stopUpdate$1(this, str, i, null));
    }

    public final void h(String str, String str2) {
        a(new OrderStatusAnalytics$updateNow$1(this, str, str2, null));
    }
}
