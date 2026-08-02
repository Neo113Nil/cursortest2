package com.yandex.go.taxi_order.ws;

import com.adjust.sdk.Constants;
import defpackage.ak41;
import defpackage.ck41;
import defpackage.d5j0;
import defpackage.ek41;
import defpackage.g8e;
import defpackage.h3y;
import defpackage.hst;
import defpackage.jst;
import defpackage.jwu;
import defpackage.kvj0;
import defpackage.kwu;
import defpackage.t4j0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.ydi0;
import defpackage.zj41;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes14.dex */
public final class a extends ek41 {
    public final h3y a;
    public final d b;
    public ydi0 c;

    public a(h3y h3yVar, d dVar) {
        this.a = h3yVar;
        this.b = dVar;
    }

    @Override // defpackage.ek41
    public final void b(ydi0 ydi0Var, int i, String str) {
        jst.e.getClass();
        this.b.f(i != 4400 ? i != 4401 ? WebSocketClient$CloseReason.CLIENT_DISCONNECTED : WebSocketClient$CloseReason.UNAUTHORIZED : WebSocketClient$CloseReason.BAD_REQUEST);
    }

    @Override // defpackage.ek41
    public final void d(ydi0 ydi0Var, Exception exc, kvj0 kvj0Var) {
        jst.e.h("ws-taxiroute", "WebSocket is disconnected due to error", exc);
        this.b.f(WebSocketClient$CloseReason.CONNECTION_ERROR);
    }

    @Override // defpackage.ek41
    public final void e(zj41 zj41Var, String str) {
        d dVar = this.b;
        tse tseVar = dVar.h;
        dVar.i.getClass();
        tje.N(tseVar, uyj.a, null, new WebSocketRepositoryImpl$onMessage$1(dVar, str, null), 2);
    }

    @Override // defpackage.ek41
    public final void g(kvj0 kvj0Var) {
        hst hstVar = jst.e;
        this.b.g();
    }

    public final void h(ak41 ak41Var, ck41 ck41Var) {
        jwu jwuVar = new jwu();
        jwuVar.o(Constants.SCHEME);
        jwuVar.h(ck41Var.a);
        jwuVar.c("v2/subscribe/websocket", false);
        jwuVar.d(io.appmetrica.analytics.rtm.internal.Constants.KEY_SERVICE, ck41Var.b);
        jwuVar.d("user", String.valueOf(ak41Var.a));
        jwuVar.d("client", TariffOrderFlow.ORDER_FLOW_TAXI_KEY);
        jwuVar.d("session", ak41Var.b);
        kwu e = jwuVar.e();
        t4j0 t4j0Var = new t4j0();
        t4j0Var.c.g("Authorization", g8e.o("OAuth ", ak41Var.c));
        t4j0Var.a = e;
        this.c = ((OkHttpClient) this.a.get()).c(new d5j0(t4j0Var), this);
    }

    public final void i() {
        ydi0 ydi0Var = this.c;
        if (ydi0Var != null) {
            ydi0Var.c(1001, null);
        }
        this.c = null;
    }
}
