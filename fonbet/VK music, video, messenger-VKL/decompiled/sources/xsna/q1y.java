package xsna;

import android.webkit.JavascriptInterface;
import com.my.tracker.miniapps.MiniAppEventBuilder;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.analytics.js.bridge.api.events.TrackEvent$Error;
import com.vk.superapp.analytics.js.bridge.api.events.TrackEvent$Parameters;
import com.vk.superapp.analytics.js.bridge.api.events.TrackEvent$Response;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import kotlin.collections.builders.MapBuilder;
import xsna.p2y;
import xsna.pgn0;
import xsna.r1y;

/* compiled from: JsAnalyticsBridgeImpl.kt */
/* loaded from: classes6.dex */
public final class q1y implements r1y {
    public xwv0 b;
    public final com.vk.superapp.base.js.bridge.b c;
    public final bpn0 d = new bpn0(new z3i(this, 23));
    public final bpn0 e = new bpn0(new tju(this, 4));

    public q1y(com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var) {
        this.b = xwv0Var;
        this.c = bVar;
    }

    @Override // xsna.r1y, xsna.p1y
    @JavascriptInterface
    public void VKWebAppGetMyTrackerId(String str) {
        r1y.a.VKWebAppGetMyTrackerId(this, str);
    }

    @Override // xsna.r1y, xsna.p1y
    @JavascriptInterface
    public void VKWebAppTrackEvent(String str) {
        r1y.a.VKWebAppTrackEvent(this, str);
    }

    @Override // xsna.p1y
    public final void j(p2y<TrackEvent$Parameters> p2yVar) {
        this.c.k(new JsMethod("VKWebAppTrackEvent"), p2yVar.b());
        if (p2yVar.a instanceof p2y.a) {
            qvp qvpVar = (qvp) this.d.getValue();
            Responses$ClientError responses$ClientError = new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), p2yVar.b(), 1, null);
            com.vk.superapp.base.js.bridge.b.o(qvpVar.a, new JsMethod("VKWebAppTrackEvent"), new TrackEvent$Error(null, new TrackEvent$Error.Data(TrackEvent$Error.Data.Type.CLIENT_ERROR, responses$ClientError.c(), responses$ClientError), 1, null), p2yVar.b, null, 8);
        }
        TrackEvent$Parameters a = p2yVar.a();
        xwv0 xwv0Var = this.b;
        long j = xwv0Var != null ? xwv0Var.t().b : 0L;
        wdx0 wdx0Var = e370.f;
        if (wdx0Var == null) {
            wdx0Var = null;
        }
        int i = pgn0.a.a;
        UserId userId = wdx0Var.c().b;
        udx0 udx0Var = e370.i;
        if (udx0Var == null) {
            udx0Var = null;
        }
        if (epx.f(a.e(), "registration")) {
            String d = a.d();
            udx0Var.getClass();
            uc00 uc00Var = uc00.a;
            MiniAppEventBuilder.UserEventBuilder registrationEvent = MiniAppEventBuilder.newEventBuilder(String.valueOf(j), String.valueOf(userId.b)).registrationEvent();
            if (d != null) {
                registrationEvent = registrationEvent.withCustomUserId(d);
            }
            uc00.n(new tc00(registrationEvent.build()));
        } else if (epx.f(a.e(), "login")) {
            String d2 = a.d();
            udx0Var.getClass();
            uc00 uc00Var2 = uc00.a;
            MiniAppEventBuilder.UserEventBuilder loginEvent = MiniAppEventBuilder.newEventBuilder(String.valueOf(j), String.valueOf(userId.b)).loginEvent();
            if (d2 != null) {
                loginEvent = loginEvent.withCustomUserId(d2);
            }
            uc00.n(new tc00(loginEvent.build()));
        } else {
            if (drm0.N(a.e())) {
                throw new IllegalStateException();
            }
            String d3 = a.d();
            String e = a.e();
            b9y f = a.f();
            MapBuilder a2 = f != null ? q9y.a(f) : null;
            udx0Var.getClass();
            uc00 uc00Var3 = uc00.a;
            MiniAppEventBuilder.CustomEventBuilder customEvent = MiniAppEventBuilder.newEventBuilder(String.valueOf(j), String.valueOf(userId.b)).customEvent(e);
            if (d3 != null) {
                customEvent = customEvent.withCustomUserId(d3);
            }
            if (a2 != null) {
                customEvent = customEvent.withEventParams(a2);
            }
            uc00.n(new tc00(customEvent.build()));
        }
        v1n0 v1n0Var = (v1n0) this.e.getValue();
        String g = a.g();
        com.vk.superapp.base.js.bridge.b.p(v1n0Var.a, new JsMethod("VKWebAppTrackEvent"), new TrackEvent$Response(null, new TrackEvent$Response.Data(true, g), g, 1, null), null, null, false, p2yVar.b, 28);
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.b = xwv0Var;
    }

    @Override // xsna.npf0
    public final void release() {
        this.b = null;
    }
}
