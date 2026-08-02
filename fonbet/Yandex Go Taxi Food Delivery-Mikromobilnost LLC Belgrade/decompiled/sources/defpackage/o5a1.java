package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.g;

/* loaded from: classes.dex */
public final class o5a1 extends mha1 {
    public static final Pair T = new Pair("", 0L);
    public final lxj A;
    public String B;
    public boolean C;
    public long D;
    public final u4a1 E;
    public final g4a1 F;
    public final lxj G;
    public final ofa0 H;
    public final g4a1 I;
    public final u4a1 J;
    public final u4a1 K;
    public boolean L;
    public final g4a1 M;
    public final g4a1 N;
    public final u4a1 O;
    public final lxj P;
    public final lxj Q;
    public final u4a1 R;
    public final ofa0 S;
    public SharedPreferences w;
    public SharedPreferences x;
    public jcp y;
    public final u4a1 z;

    public o5a1(g gVar) {
        super(gVar);
        this.E = new u4a1(this, "session_timeout", 1800000L);
        this.F = new g4a1(this, "start_new_session", true);
        this.J = new u4a1(this, "last_pause_time", 0L);
        this.K = new u4a1(this, "session_id", 0L);
        this.G = new lxj(this, "non_personalized_ads");
        this.H = new ofa0(this, "last_received_uri_timestamps_by_source");
        this.I = new g4a1(this, "allow_remote_dynamite", false);
        this.z = new u4a1(this, "first_open_time", 0L);
        cvw.i("app_install_time");
        this.A = new lxj(this, "app_instance_id");
        this.M = new g4a1(this, "app_backgrounded", false);
        this.N = new g4a1(this, "deep_link_retrieval_complete", false);
        this.O = new u4a1(this, "deep_link_retrieval_attempts", 0L);
        this.P = new lxj(this, "firebase_feature_rollouts");
        this.Q = new lxj(this, "deferred_attribution_cache");
        this.R = new u4a1(this, "deferred_attribution_cache_timestamp", 0L);
        this.S = new ofa0(this, "default_event_parameters");
    }

    @Override // defpackage.mha1
    public final boolean Hg() {
        return true;
    }

    public final SharedPreferences Kg() {
        Gg();
        Ig();
        cvw.l(this.w);
        return this.w;
    }

    public final SharedPreferences Lg() {
        Gg();
        Ig();
        if (this.x == null) {
            g gVar = (g) this.b;
            String valueOf = String.valueOf(gVar.a.getPackageName());
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            l1a1 l1a1Var = y1a1Var.H;
            String concat = valueOf.concat("_preferences");
            l1a1Var.b(concat, "Default prefs file");
            this.x = gVar.a.getSharedPreferences(concat, 0);
        }
        return this.x;
    }

    public final SparseArray Mg() {
        Bundle D = this.H.D();
        int[] intArray = D.getIntArray("uriSources");
        long[] longArray = D.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.z.a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < intArray.length; i++) {
            sparseArray.put(intArray[i], Long.valueOf(longArray[i]));
        }
        return sparseArray;
    }

    public final wia1 Ng() {
        Gg();
        return wia1.c(Kg().getInt("consent_source", 100), Kg().getString("consent_settings", "G1"));
    }

    public final boolean Og(p8b1 p8b1Var) {
        Gg();
        String string = Kg().getString("stored_tcf_param", "");
        String a = p8b1Var.a();
        if (a.equals(string)) {
            return false;
        }
        SharedPreferences.Editor edit = Kg().edit();
        edit.putString("stored_tcf_param", a);
        edit.apply();
        return true;
    }

    public final void Pg(boolean z) {
        Gg();
        y1a1 y1a1Var = ((g) this.b).y;
        g.g(y1a1Var);
        y1a1Var.H.b(Boolean.valueOf(z), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = Kg().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final boolean Qg(long j) {
        return j - this.E.a() > this.J.a();
    }
}
