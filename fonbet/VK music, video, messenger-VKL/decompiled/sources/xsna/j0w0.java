package xsna;

import android.os.SystemClock;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.toggle.features.VideoFeatures;
import kotlin.LazyThreadSafetyMode;
import kotlin.time.DurationUnit;
import xsna.ky6;
import xsna.zno;

/* compiled from: VkVideoPromoManagerImpl.kt */
/* loaded from: classes3.dex */
public final class j0w0 implements h0w0 {
    public final hos0 b;
    public final Object c;
    public final Object d;
    public long e;
    public long f;
    public long g;

    public j0w0(hos0 hos0Var) {
        this.b = hos0Var;
        akd0 akd0Var = new akd0(this, 29);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, akd0Var);
        this.d = msy.a(lazyThreadSafetyMode, new gzr0(5));
        zno.a aVar = zno.c;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
    }

    @Override // xsna.h0w0
    public final void a() {
        long i = zno.i(this.g, zno.d(this.e, 0L) ? 0L : zno.h(eoo.f(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS), this.e));
        this.g = i;
        DurationUnit durationUnit = DurationUnit.SECONDS;
        if (zno.c(i, eoo.e(1, durationUnit)) >= 0) {
            long l = zno.l(this.g, durationUnit);
            this.f = zno.i(this.f, eoo.f(l, durationUnit));
            this.g = zno.h(this.g, eoo.f(l, durationUnit));
        }
        this.e = eoo.f(SystemClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
    }

    @Override // xsna.h0w0
    public final void b() {
        zno.a aVar = zno.c;
        this.e = 0L;
        this.f = 0L;
        this.g = 0L;
    }

    @Override // xsna.h0w0
    public final boolean c(boolean z) {
        return h(VideoFeatures.VK_VIDEO_RIGHT_PROMO_FULLSCREEN, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h0w0
    public final k0w0 d() {
        return (k0w0) this.c.getValue();
    }

    @Override // xsna.h0w0
    public final void e() {
        long currentTimeMillis = System.currentTimeMillis();
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putLong("vk_video_promo_last_shown_time5", currentTimeMillis);
        aVar.a();
    }

    @Override // xsna.h0w0
    public final void f() {
        zno.a aVar = zno.c;
        this.e = 0L;
    }

    @Override // xsna.h0w0
    public final boolean g(boolean z) {
        return h(VideoFeatures.VK_VIDEO_BOTTOM_PROMO_FULLSCREEN, z);
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean h(VideoFeatures videoFeatures, boolean z) {
        f0w0 f0w0Var;
        if (BuildInfo.s()) {
            videoFeatures.getClass();
            if (com.vk.toggle.b.A.a(videoFeatures) && (f0w0Var = (f0w0) this.d.getValue()) != null) {
                zno.a aVar = zno.c;
                boolean z2 = zno.l(eoo.f(System.currentTimeMillis() - Preference.j().getLong("vk_video_promo_last_shown_time5", 0L), DurationUnit.MILLISECONDS), DurationUnit.DAYS) >= f0w0Var.b;
                boolean z3 = zno.l(this.f, DurationUnit.SECONDS) >= f0w0Var.a;
                if (z2 && (z3 || z)) {
                    return true;
                }
            }
        }
        return false;
    }
}
