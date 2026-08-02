package xsna;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ConfigResolver.java */
/* loaded from: classes13.dex */
public final class txi {
    public static final ra2 d = ra2.d();
    public static volatile txi e;
    public final RemoteConfigManager a = RemoteConfigManager.getInstance();
    public cow b = new cow();
    public final v5m c = v5m.b();

    public static synchronized txi e() {
        txi txiVar;
        synchronized (txi.class) {
            try {
                if (e == null) {
                    e = new txi();
                }
                txiVar = e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return txiVar;
    }

    public static boolean l(long j) {
        return j >= 0;
    }

    public static boolean m(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("20.3.0")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean n(long j) {
        return j >= 0;
    }

    public static boolean p(float f) {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= f && f <= 1.0f;
    }

    public final kt80<Boolean> a(czi cziVar) {
        v5m v5mVar = this.c;
        String g = cziVar.g();
        if (g == null) {
            v5mVar.getClass();
            v5m.c.a();
            return new kt80<>();
        }
        if (v5mVar.a == null) {
            v5mVar.c(v5m.a());
            if (v5mVar.a == null) {
                return new kt80<>();
            }
        }
        if (!v5mVar.a.contains(g)) {
            return new kt80<>();
        }
        try {
            return new kt80<>(Boolean.valueOf(v5mVar.a.getBoolean(g, false)));
        } catch (ClassCastException e2) {
            v5m.c.b("Key %s from sharedPreferences has type other than long: %s", g, e2.getMessage());
            return new kt80<>();
        }
    }

    public final kt80<Float> b(czi cziVar) {
        v5m v5mVar = this.c;
        String g = cziVar.g();
        if (g == null) {
            v5mVar.getClass();
            v5m.c.a();
            return new kt80<>();
        }
        if (v5mVar.a == null) {
            v5mVar.c(v5m.a());
            if (v5mVar.a == null) {
                return new kt80<>();
            }
        }
        if (!v5mVar.a.contains(g)) {
            return new kt80<>();
        }
        try {
            return new kt80<>(Float.valueOf(v5mVar.a.getFloat(g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
        } catch (ClassCastException e2) {
            v5m.c.b("Key %s from sharedPreferences has type other than float: %s", g, e2.getMessage());
            return new kt80<>();
        }
    }

    public final kt80<Long> c(czi cziVar) {
        v5m v5mVar = this.c;
        String g = cziVar.g();
        if (g == null) {
            v5mVar.getClass();
            v5m.c.a();
            return new kt80<>();
        }
        if (v5mVar.a == null) {
            v5mVar.c(v5m.a());
            if (v5mVar.a == null) {
                return new kt80<>();
            }
        }
        if (!v5mVar.a.contains(g)) {
            return new kt80<>();
        }
        try {
            return new kt80<>(Long.valueOf(v5mVar.a.getLong(g, 0L)));
        } catch (ClassCastException e2) {
            v5m.c.b("Key %s from sharedPreferences has type other than long: %s", g, e2.getMessage());
            return new kt80<>();
        }
    }

    public final kt80<String> d(czi cziVar) {
        v5m v5mVar = this.c;
        String g = cziVar.g();
        if (g == null) {
            v5mVar.getClass();
            v5m.c.a();
            return new kt80<>();
        }
        if (v5mVar.a == null) {
            v5mVar.c(v5m.a());
            if (v5mVar.a == null) {
                return new kt80<>();
            }
        }
        if (!v5mVar.a.contains(g)) {
            return new kt80<>();
        }
        try {
            return new kt80<>(v5mVar.a.getString(g, ""));
        } catch (ClassCastException e2) {
            v5m.c.b("Key %s from sharedPreferences has type other than String: %s", g, e2.getMessage());
            return new kt80<>();
        }
    }

    public final boolean f() {
        kyi r = kyi.r();
        kt80<Boolean> h = h(r);
        if (h.b()) {
            return h.a().booleanValue();
        }
        kt80<Boolean> kt80Var = this.a.getBoolean("fpr_experiment_app_start_ttid");
        if (kt80Var.b()) {
            this.c.g("com.google.firebase.perf.ExperimentTTID", kt80Var.a().booleanValue());
            return kt80Var.a().booleanValue();
        }
        kt80<Boolean> a = a(r);
        if (a.b()) {
            return a.a().booleanValue();
        }
        return false;
    }

    @Nullable
    public final Boolean g() {
        iyi iyiVar;
        jyi jyiVar;
        synchronized (iyi.class) {
            try {
                if (iyi.c == null) {
                    iyi.c = new iyi(0);
                }
                iyiVar = iyi.c;
            } finally {
            }
        }
        kt80<Boolean> h = h(iyiVar);
        if ((h.b() ? h.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (jyi.class) {
            try {
                if (jyi.c == null) {
                    jyi.c = new jyi(0);
                }
                jyiVar = jyi.c;
            } finally {
            }
        }
        kt80<Boolean> a = a(jyiVar);
        if (a.b()) {
            return a.a();
        }
        kt80<Boolean> h2 = h(jyiVar);
        if (h2.b()) {
            return h2.a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kt80<Boolean> h(czi cziVar) {
        boolean z;
        cow cowVar = this.b;
        String h = cziVar.h();
        if (h == null) {
            cowVar.getClass();
        } else if (cowVar.a.containsKey(h)) {
            z = true;
            if (z) {
                return new kt80<>();
            }
            try {
                Boolean bool = (Boolean) cowVar.a.get(h);
                return bool == null ? new kt80<>() : new kt80<>(bool);
            } catch (ClassCastException e2) {
                cow.b.b("Metadata key %s contains type other than boolean: %s", h, e2.getMessage());
                return new kt80<>();
            }
        }
        z = false;
        if (z) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kt80<Float> i(czi cziVar) {
        boolean z;
        cow cowVar = this.b;
        String h = cziVar.h();
        if (h == null) {
            cowVar.getClass();
        } else if (cowVar.a.containsKey(h)) {
            z = true;
            if (z) {
                return new kt80<>();
            }
            try {
                Float f = (Float) cowVar.a.get(h);
                return f == null ? new kt80<>() : new kt80<>(f);
            } catch (ClassCastException e2) {
                cow.b.b("Metadata key %s contains type other than float: %s", h, e2.getMessage());
                return new kt80<>();
            }
        }
        z = false;
        if (z) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13, types: [xsna.kt80] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [xsna.kt80] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [xsna.kt80] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kt80<Long> j(czi cziVar) {
        boolean z;
        cow cowVar = this.b;
        ?? h = cziVar.h();
        if (h == 0) {
            cowVar.getClass();
        } else if (cowVar.a.containsKey(h)) {
            z = true;
            if (z) {
                h = new kt80();
            } else {
                try {
                    Integer num = (Integer) cowVar.a.get(h);
                    h = num == null ? new kt80() : new kt80(num);
                } catch (ClassCastException e2) {
                    cow.b.b("Metadata key %s contains type other than int: %s", h, e2.getMessage());
                    h = new kt80();
                }
            }
            return !h.b() ? new kt80<>(Long.valueOf(((Integer) h.a()).intValue())) : new kt80<>();
        }
        z = false;
        if (z) {
        }
        if (!h.b()) {
        }
    }

    public final long k() {
        qyi qyiVar;
        synchronized (qyi.class) {
            try {
                if (qyi.c == null) {
                    qyi.c = new qyi(0);
                }
                qyiVar = qyi.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        RemoteConfigManager remoteConfigManager = this.a;
        qyiVar.getClass();
        kt80<Long> kt80Var = remoteConfigManager.getLong("fpr_rl_time_limit_sec");
        if (kt80Var.b() && kt80Var.a().longValue() > 0) {
            this.c.e(kt80Var.a().longValue(), "com.google.firebase.perf.TimeLimitSec");
            return kt80Var.a().longValue();
        }
        kt80<Long> c = c(qyiVar);
        if (!c.b() || c.a().longValue() <= 0) {
            return 600L;
        }
        return c.a().longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        syi syiVar;
        boolean booleanValue;
        boolean z;
        ryi ryiVar;
        boolean m;
        Boolean g = g();
        if (g == null || g.booleanValue()) {
            synchronized (syi.class) {
                try {
                    if (syi.c == null) {
                        syi.c = new syi(0);
                    }
                    syiVar = syi.c;
                } finally {
                }
            }
            RemoteConfigManager remoteConfigManager = this.a;
            syiVar.getClass();
            kt80<Boolean> kt80Var = remoteConfigManager.getBoolean("fpr_enabled");
            if (!kt80Var.b()) {
                kt80<Boolean> a = a(syiVar);
                booleanValue = a.b() ? a.a().booleanValue() : true;
            } else if (this.a.isLastFetchFailed()) {
                booleanValue = false;
            } else {
                this.c.g("com.google.firebase.perf.SdkEnabled", kt80Var.a().booleanValue());
                booleanValue = kt80Var.a().booleanValue();
            }
            if (booleanValue) {
                synchronized (ryi.class) {
                    try {
                        if (ryi.c == null) {
                            ryi.c = new ryi(0);
                        }
                        ryiVar = ryi.c;
                    } finally {
                    }
                }
                RemoteConfigManager remoteConfigManager2 = this.a;
                ryiVar.getClass();
                kt80<String> string = remoteConfigManager2.getString("fpr_disabled_android_versions");
                if (string.b()) {
                    this.c.f("com.google.firebase.perf.SdkDisabledVersions", string.a());
                    m = m(string.a());
                } else {
                    kt80<String> d2 = d(ryiVar);
                    m = d2.b() ? m(d2.a()) : m("");
                }
                if (!m) {
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    public final void q(Context context) {
        d.b = i3r0.a(context);
        this.c.c(context);
    }

    public final void r(Context context) {
        q(context.getApplicationContext());
    }

    public final void s(cow cowVar) {
        this.b = cowVar;
    }
}
