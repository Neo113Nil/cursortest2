package xsna;

import android.webkit.JavascriptInterface;
import com.vk.core.apps.BuildInfo;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.Responses$ReasonAccessDenied;
import com.vk.superapp.base.js.bridge.Responses$ReasonAlreadyInProgress;
import com.vk.superapp.base.js.bridge.Responses$ReasonInvalidParams;
import com.vk.superapp.health.js.bridge.api.events.AskWorkoutsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetHealthConnectInfo$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetSteps$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetStepsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetWorkouts$Parameters;
import com.vk.superapp.health.js.bridge.api.events.GetWorkoutsPermissions$Parameters;
import com.vk.superapp.health.js.bridge.api.events.StopStepsPermissions$Parameters;
import com.vk.superapp.vksteps.VkStepsBridgeDelegatesFactory;
import com.vk.superapp.vkworkout.VkWorkoutBridgeDelegatesFactory;
import java.util.List;
import xsna.m4y;
import xsna.p2y;

/* compiled from: JsHealthBridgeImpl.kt */
/* loaded from: classes6.dex */
public final class l4y implements m4y {
    public final ayu0 b;
    public final VkStepsBridgeDelegatesFactory c;
    public final VkWorkoutBridgeDelegatesFactory d;
    public final com.vk.superapp.base.js.bridge.b e;
    public xwv0 f;
    public final bfm g;
    public final bpn0 h = new bpn0(new wzh(this, 16));
    public final bpn0 i = new bpn0(new foi(this, 15));
    public final bpn0 j = new bpn0(new n1i(this, 19));
    public final bpn0 k = new bpn0(new sbg(this, 28));
    public final bpn0 l = new bpn0(new tbg(this, 25));
    public final bpn0 m = new bpn0(new m3g(this, 25));
    public final bpn0 n = new bpn0(new bfm(this, 12));
    public final bpn0 o = new bpn0(new l1i(this, 9));
    public final bpn0 p = new bpn0(new ecm(this, 16));
    public final bpn0 q = new bpn0(new m1i(this, 21));
    public final bpn0 r = new bpn0(new l9h(this, 24));
    public final bpn0 s = new bpn0(new fgm(this, 18));
    public final bpn0 t = new bpn0(new maj(this, 26));

    public l4y(ayu0 ayu0Var, VkStepsBridgeDelegatesFactory vkStepsBridgeDelegatesFactory, VkWorkoutBridgeDelegatesFactory vkWorkoutBridgeDelegatesFactory, com.vk.superapp.base.js.bridge.b bVar, xwv0 xwv0Var, bfm bfmVar) {
        this.b = ayu0Var;
        this.c = vkStepsBridgeDelegatesFactory;
        this.d = vkWorkoutBridgeDelegatesFactory;
        this.e = bVar;
        this.f = xwv0Var;
        this.g = bfmVar;
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppAskWorkoutsPermissions(String str) {
        m4y.b.VKWebAppAskWorkoutsPermissions(this, str);
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppGetHealthConnectInfo(String str) {
        m4y.b.VKWebAppGetHealthConnectInfo(this, str);
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppGetSteps(String str) {
        m4y.b.VKWebAppGetSteps(this, str);
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppGetStepsPermissions(String str) {
        m4y.b.VKWebAppGetStepsPermissions(this, str);
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppGetWorkouts(String str) {
        m4y.b.VKWebAppGetWorkouts(this, str);
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppGetWorkoutsPermissions(String str) {
        m4y.b.VKWebAppGetWorkoutsPermissions(this, str);
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppStepsSyncCompleted(String str) {
        m4y.b.VKWebAppStepsSyncCompleted(this, str);
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppStopStepsPermissions(String str) {
        m4y.b.VKWebAppStopStepsPermissions(this, str);
    }

    @Override // xsna.m4y, xsna.k4y
    @JavascriptInterface
    public void VKWebAppWorkoutsSyncCompleted(String str) {
        m4y.b.VKWebAppWorkoutsSyncCompleted(this, str);
    }

    @Override // xsna.k4y
    public final void c(p2y<GetSteps$Parameters> p2yVar) {
        String b = p2yVar.b();
        JsMethod jsMethod = new JsMethod("VKWebAppGetSteps");
        com.vk.superapp.base.js.bridge.b bVar = this.e;
        if (bVar.j(jsMethod)) {
            p().c(b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ALREADY_IN_PROGRESS, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAlreadyInProgress(0, null, 3, null), 65532, null), b, 1, null));
            return;
        }
        sf3.b("VKWebAppGetSteps", bVar, b);
        if (p2yVar.a instanceof p2y.a) {
            p().c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        GetSteps$Parameters a = p2yVar.a();
        guq<?> guqVar = (e370.s == null || !epx.f(a.d(), Boolean.TRUE)) ? (guq) this.i.getValue() : (guq) this.j.getValue();
        if (s(guqVar)) {
            guqVar.k1(a);
        } else {
            p().c(null, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
        }
    }

    @Override // xsna.k4y
    public final void d(p2y<GetStepsPermissions$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppGetStepsPermissions", this.e, b);
        if (p2yVar.a instanceof p2y.a) {
            p().d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        GetStepsPermissions$Parameters a = p2yVar.a();
        guq<?> guqVar = (e370.s == null || !epx.f(a.c(), Boolean.TRUE)) ? (guq) this.l.getValue() : (guq) this.m.getValue();
        if (s(guqVar)) {
            guqVar.k1(a);
        } else {
            p().d(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
        }
    }

    @Override // xsna.k4y
    public final void h(p2y<AskWorkoutsPermissions$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppAskWorkoutsPermissions", this.e, b);
        if (p2yVar.a instanceof p2y.a) {
            p().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        AskWorkoutsPermissions$Parameters a = p2yVar.a();
        guq<?> guqVar = epx.f(a.c(), Boolean.TRUE) ? (guq) this.r.getValue() : (guq) this.q.getValue();
        if (s(guqVar)) {
            guqVar.k1(a);
        } else {
            p().a(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
        }
    }

    @Override // xsna.k4y
    public final void j(p2y<GetWorkoutsPermissions$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppGetWorkoutsPermissions", this.e, b);
        if (p2yVar.a instanceof p2y.a) {
            p().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        guq<?> guqVar = epx.f(p2yVar.a().c(), Boolean.TRUE) ? (guq) this.p.getValue() : (guq) this.o.getValue();
        if (s(guqVar)) {
            guqVar.k1(p2yVar.a());
        } else {
            p().f(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
        }
    }

    @Override // xsna.k4y
    public final void k(p2y<GetHealthConnectInfo$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppGetHealthConnectInfo", this.e, b);
        if (p2yVar.a instanceof p2y.a) {
            p().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        bpn0 bpn0Var = this.k;
        if (s((guq) bpn0Var.getValue())) {
            ((guq) bpn0Var.getValue()).k1(p2yVar.a());
        } else {
            p().b(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
        }
    }

    @Override // xsna.k4y
    public final void l(p2y<GetWorkouts$Parameters> p2yVar) {
        String b = p2yVar.b();
        sf3.b("VKWebAppGetWorkouts", this.e, b);
        if (p2yVar.a instanceof p2y.a) {
            p().e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        GetWorkouts$Parameters a = p2yVar.a();
        guq<?> guqVar = epx.f(a.d(), Boolean.TRUE) ? (guq) this.t.getValue() : (guq) this.s.getValue();
        if (s(guqVar)) {
            guqVar.k1(a);
        } else {
            p().e(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
        }
    }

    @Override // xsna.k4y
    public final void m(p2y<StopStepsPermissions$Parameters> p2yVar) {
        String b = p2yVar.b();
        this.e.k(new JsMethod("VKWebAppStopStepsPermissions"), b);
        StopStepsPermissions$Parameters a = p2yVar.a();
        if (p2yVar.a instanceof p2y.a) {
            p().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_INVALID_PARAMS, null, null, null, null, null, new Responses$ReasonInvalidParams(0, null, 3, null), null, null, null, null, null, null, null, null, null, null, 131004, null), b, 1, null));
            return;
        }
        bpn0 bpn0Var = this.n;
        if (s((guq) bpn0Var.getValue())) {
            ((guq) bpn0Var.getValue()).k1(a);
        } else {
            p().g(new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_ACCESS_DENIED, null, null, null, null, null, null, null, null, null, null, null, new Responses$ReasonAccessDenied(0, null, 3, null), null, null, null, null, 126974, null), b, 1, null));
        }
    }

    public final <T extends ad6> guq<T> n(VkStepsBridgeDelegatesFactory.DelegateType delegateType) {
        return this.c.a(delegateType, this.e, this.f, this.g);
    }

    public final <T extends ad6> guq<T> o(VkWorkoutBridgeDelegatesFactory.DelegateType delegateType) {
        return this.d.a(delegateType, this.e, this.f, this.g);
    }

    public final wvp p() {
        return (wvp) this.h.getValue();
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
        this.f = xwv0Var;
        ((guq) this.j.getValue()).r(xwv0Var);
        ((guq) this.i.getValue()).r(xwv0Var);
        ((guq) this.k.getValue()).r(xwv0Var);
        ((guq) this.l.getValue()).r(xwv0Var);
        ((guq) this.m.getValue()).r(xwv0Var);
        ((guq) this.n.getValue()).r(xwv0Var);
        ((guq) this.o.getValue()).r(xwv0Var);
        ((guq) this.p.getValue()).r(xwv0Var);
        ((guq) this.q.getValue()).r(xwv0Var);
        ((guq) this.r.getValue()).r(xwv0Var);
        ((guq) this.s.getValue()).r(xwv0Var);
        ((guq) this.t.getValue()).r(xwv0Var);
    }

    @Override // xsna.npf0
    public final void release() {
        this.f = null;
        ((guq) this.j.getValue()).release();
    }

    public final boolean s(guq<?> guqVar) {
        if (BuildInfo.h()) {
            return true;
        }
        List<Long> a1 = guqVar.a1();
        xwv0 xwv0Var = this.f;
        return j5g.P(a1, xwv0Var != null ? Long.valueOf(xwv0Var.getAppId()) : null);
    }
}
