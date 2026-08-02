package ru.ok.tracer.lite.limits;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import com.vk.core.preference.Preference;
import ru.ok.tracer.base.limits.TracerFeatureLimits;
import ru.ok.tracer.lite.TracerLite;
import xsna.epx;
import xsna.zcl;
import xsna.zr;

/* compiled from: TracerLiteLimits.kt */
/* loaded from: classes11.dex */
public final class TracerLiteLimits implements TracerFeatureLimits {
    public static final Companion Companion = new Companion(null);
    private final Context context;
    private final String libraryPackageName;
    private boolean prefsRead;

    /* compiled from: TracerLiteLimits.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public final TracerLiteLimits get(TracerLite tracerLite) {
            return tracerLite.getLimits$tracer_lite_commons_release();
        }

        private Companion() {
        }
    }

    public TracerLiteLimits(Context context, String str) {
        this.context = context;
        this.libraryPackageName = str;
    }

    private final SharedPreferences getPrefs() {
        this.prefsRead = true;
        return Preference.h(this.context, 0, "tracer-" + this.libraryPackageName);
    }

    @Override // ru.ok.tracer.base.limits.TracerFeatureLimits
    public boolean isLimited(String str, String str2) {
        if (!this.prefsRead && epx.f(Looper.myLooper(), Looper.getMainLooper())) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < getPrefs().getLong("system.shutdown.until.ts", Long.MIN_VALUE)) {
            return true;
        }
        return str != null && currentTimeMillis < getPrefs().getLong(zr.a("system.", str, ".shutdown.until.ts"), Long.MIN_VALUE);
    }

    @Override // ru.ok.tracer.base.limits.TracerFeatureLimits
    public void setShutdownMs(Long l, String str, Long l2, String str2, Long l3) {
        boolean z;
        SharedPreferences.Editor edit = getPrefs().edit();
        boolean z2 = true;
        if (l == null || l.longValue() <= 0) {
            z = false;
        } else {
            edit.putLong("system.shutdown.until.ts", l.longValue() + System.currentTimeMillis());
            z = true;
        }
        if (str == null || l2 == null || l2.longValue() <= 0) {
            z2 = z;
        } else {
            edit.putLong(zr.a("system.", str, ".shutdown.until.ts"), l2.longValue() + System.currentTimeMillis());
        }
        if (z2) {
            edit.apply();
        }
    }
}
