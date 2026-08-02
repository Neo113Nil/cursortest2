package xsna;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class x901 extends dd01 {

    @VisibleForTesting
    public static final Pair A = new Pair("", 0L);
    public SharedPreferences f;
    public v901 g;
    public final u901 h;
    public final w901 i;
    public String j;
    public boolean k;
    public long l;
    public final u901 m;
    public final s901 n;
    public final w901 o;
    public final s901 p;
    public final u901 q;
    public final u901 r;
    public boolean s;
    public final s901 t;
    public final s901 u;
    public final u901 v;
    public final w901 w;
    public final w901 x;
    public final u901 y;
    public final t901 z;

    public x901(mb01 mb01Var) {
        super(mb01Var);
        this.m = new u901(this, "session_timeout", 1800000L);
        this.n = new s901(this, "start_new_session", true);
        this.q = new u901(this, "last_pause_time", 0L);
        this.r = new u901(this, "session_id", 0L);
        this.o = new w901(this, "non_personalized_ads");
        this.p = new s901(this, "allow_remote_dynamite", false);
        this.h = new u901(this, "first_open_time", 0L);
        exc0.f("app_install_time");
        this.i = new w901(this, "app_instance_id");
        this.t = new s901(this, "app_backgrounded", false);
        this.u = new s901(this, "deep_link_retrieval_complete", false);
        this.v = new u901(this, "deep_link_retrieval_attempts", 0L);
        this.w = new w901(this, "firebase_feature_rollouts");
        this.x = new w901(this, "deferred_attribution_cache");
        this.y = new u901(this, "deferred_attribution_cache_timestamp", 0L);
        this.z = new t901(this);
    }

    @Override // xsna.dd01
    public final boolean l() {
        return true;
    }

    @VisibleForTesting
    public final SharedPreferences o() {
        k();
        m();
        exc0.i(this.f);
        return this.f;
    }

    public final xwz0 p() {
        k();
        return xwz0.b(o().getString("consent_settings", "G1"));
    }

    public final void q(boolean z) {
        k();
        k901 k901Var = ((mb01) this.b).j;
        mb01.k(k901Var);
        k901Var.q.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = o().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean r(long j) {
        return j - this.m.a() > this.q.a();
    }

    public final boolean s(int i) {
        int i2 = o().getInt("consent_source", 100);
        xwz0 xwz0Var = xwz0.b;
        return i <= i2;
    }
}
