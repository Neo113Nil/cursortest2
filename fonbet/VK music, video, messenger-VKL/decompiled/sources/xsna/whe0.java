package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import java.util.concurrent.TimeUnit;

/* compiled from: PushFallbackEngine.kt */
/* loaded from: classes.dex */
public final class whe0 implements yjq {
    public static final long f = TimeUnit.MINUTES.toMillis(10);
    public volatile boolean a;
    public final rll b;
    public final bpn0 d;
    public final SharedPreferences c = Preference.f("push_fallback_engine");
    public final oyx e = new oyx(new xa40(this, 3));

    public whe0(Context context) {
        this.b = new rll(context, 2);
        this.d = new bpn0(new tb8(context, 6));
    }

    @Override // xsna.yjq
    public final boolean a() {
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences sharedPreferences = this.c;
        long longValue = currentTimeMillis <= f + Long.valueOf(sharedPreferences.getLong("push_fallback_failures_ts", 0L)).longValue() ? 1 + Long.valueOf(sharedPreferences.getLong("push_fallback_failures_count", 0L)).longValue() : 1L;
        qaj0.c(sharedPreferences, "push_fallback_failures_ts", Long.valueOf(currentTimeMillis));
        qaj0.c(sharedPreferences, "push_fallback_failures_count", Long.valueOf(longValue));
        L.e(efz.b(longValue, " failures", new StringBuilder("Fallback Engine tracked ")));
        return longValue > 10;
    }

    @Override // xsna.yjq
    public final void b(akq akqVar) {
        i0q0.f(new fia(1, this, akqVar));
    }

    @Override // xsna.yjq
    public final void c() {
        ((awx0) this.d.getValue()).b();
    }
}
