package xsna;

import android.content.Context;
import com.ironsource.X3;
import com.vk.api.sdk.exceptions.RefreshFailCause;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.toggle.anonymous.SakFeatures;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.MusicFeatures;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.vx2;

/* compiled from: AppVKApiCallback.kt */
/* loaded from: classes11.dex */
public final class dc3 implements vx2.a {
    public final mui0 b;
    public final sxi0 c;
    public final h360 d;
    public final oge0 e;

    /* compiled from: AppVKApiCallback.kt */
    public static final class a implements j7r0 {
        public final bpn0 a = new bpn0(new xb3(0));

        public static void c(String str, UserId userId, Throwable th, JSONObject jSONObject, gzs gzsVar) {
            if ("account.unregisterDevice".equals(str) || "account.managePushDeviceMulti".equals(str)) {
                return;
            }
            boolean h = SakFeatures.Type.SAK_HANDLE_BAN_REASON.h();
            c63 c63Var = c63.a;
            if (c63.b() != null && c63.f && o25.a().b() && ((Boolean) gzsVar.invoke()).booleanValue()) {
                return;
            }
            String str2 = (jSONObject == null || !h) ? th instanceof RefreshFailCause.EmptyTokenLoggedUser ? "empty_refresh_token" : th instanceof RefreshFailCause.InvalidToken ? "invalid_refresh_token" : "api_error" : "banned";
            asu0.a.getClass();
            asu0.l().execute(new ac3(userId, str2, str));
        }

        @Override // xsna.j7r0
        public final void a(String str, JSONObject jSONObject, UserId userId, Throwable th) {
            c(str, userId, th, jSONObject, new yb3(jSONObject, userId, this, 0));
        }

        @Override // xsna.j7r0
        public final void b(UserId userId, String str) {
            c(str, userId, null, null, new xk(2, userId, this));
        }
    }

    public dc3(mui0 mui0Var, sxi0 sxi0Var, h360 h360Var, oge0 oge0Var) {
        this.b = mui0Var;
        this.c = sxi0Var;
        this.d = h360Var;
        this.e = oge0Var;
    }

    @Override // xsna.z230.a
    public final ArrayList a(JSONObject jSONObject) throws JSONException {
        return ied0.b(jSONObject);
    }

    @Override // xsna.z230.a
    public final float b() {
        return iah0.f().density;
    }

    @Override // xsna.z230.a
    @ozl
    public final UserId c() {
        return o25.a().c();
    }

    @Override // xsna.vx2.a
    public final String d() {
        String string;
        o2l.a.getClass();
        return (!BuildInfo.h() || (string = Preference.i().getString(X3.s, "5.285")) == null) ? "5.285" : string;
    }

    @Override // xsna.vx2.a
    public final boolean e() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        HashSet hashSet = iah0.a;
        return fnj.b(context);
    }

    @Override // xsna.vx2.a
    public final void f(HashMap hashMap) {
        this.e.e(hashMap, null);
    }

    @Override // xsna.vx2.a
    public final boolean g() {
        return com.vk.core.apps.a.b();
    }

    @Override // xsna.z230.a
    public final Context getContext() {
        Context context = e43.a;
        if (context != null) {
            return context;
        }
        return null;
    }

    @Override // xsna.vx2.a
    public final String getDeviceId() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return b6m.b(context);
    }

    @Override // xsna.vx2.a
    public final String h() {
        o2l.a.getClass();
        String a2 = o2l.a();
        return epx.f(a2, a0a.d) ? "" : a2;
    }

    @Override // xsna.vx2.a
    public final boolean i() {
        return o25.a().E().b;
    }

    @Override // xsna.vx2.a
    public final Long j() {
        return Long.valueOf(this.d.g().b);
    }

    @Override // xsna.vx2.a
    public final Long k() {
        return Long.valueOf(this.d.g().e);
    }

    @Override // xsna.vx2.a
    public final String l() {
        o2l.a.getClass();
        return o2l.a();
    }

    @Override // xsna.vx2.a
    public final io.reactivex.rxjava3.core.w m() {
        asu0.a.getClass();
        return asu0.r();
    }

    @Override // xsna.vx2.a
    public final boolean n() {
        return o25.a().i().d && h().length() > 0 && !epx.f(h(), "api.".concat(a0a.d));
    }

    @Override // xsna.vx2.a
    public final boolean o() {
        boolean j;
        if (BuildInfo.u()) {
            j = BuildInfo.j() || BuildInfo.k() || (BuildInfo.n() && MusicFeatures.AUDIO_RUSTORE_SUBSCRIPTION.h());
        } else {
            j = BuildInfo.j();
        }
        return j && !BuildInfo.e();
    }

    @Override // xsna.vx2.a
    public final void p(xz2 xz2Var) {
        Long n;
        if (xz2Var instanceof hqu) {
            o1e0.a.a(new wzd0(fkq0.e(((hqu) xz2Var).F0()), false));
            return;
        }
        if (xz2Var instanceof gqu) {
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView = jt50.a;
            jt50.a(SingleEvent.COMMUNITY_JOIN);
            o1e0.a.a(new wzd0(fkq0.e(((gqu) xz2Var).H0()), true));
        } else if (xz2Var instanceof j0y) {
            o1e0.a.a(new wzd0(fkq0.e(((j0y) xz2Var).F0()), true));
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView2 = jt50.a;
            jt50.a(SingleEvent.COMMUNITY_JOIN);
        } else if (epx.f(xz2Var.b, "groups.join")) {
            ConcurrentHashMap.KeySetView<Object, Boolean> keySetView3 = jt50.a;
            jt50.a(SingleEvent.COMMUNITY_JOIN);
            String str = xz2Var.j.get("group_id");
            if (str == null || (n = arm0.n(str)) == null) {
                return;
            }
            o1e0.a.a(new wzd0(fkq0.e(new UserId(n.longValue())), true));
        }
    }

    @Override // xsna.vx2.a
    public final String q() {
        return ply.a();
    }

    @Override // xsna.vx2.a
    public final io.reactivex.rxjava3.core.w r() {
        CoreFeatures coreFeatures = CoreFeatures.API_RESULT_ON_COMPUTATION;
        coreFeatures.getClass();
        if (!com.vk.toggle.b.A.a(coreFeatures)) {
            return asu0.a.c();
        }
        asu0.a.getClass();
        return asu0.i();
    }

    @Override // xsna.vx2.a
    public final Long s() {
        return Long.valueOf(this.d.g().a);
    }

    @Override // xsna.z230.a
    public final int t() {
        return iah0.a(130.0f);
    }

    @Override // xsna.vx2.a
    public final boolean u() {
        o2l.a.getClass();
        return o2l.b("__dbg_api", false);
    }

    @ozl
    public final String v() {
        return o25.a().h();
    }

    public final List<h7r0> w() {
        return an00.c(this.b.e());
    }
}
