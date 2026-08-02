package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoGrowthButtonControllerImpl.kt */
/* loaded from: classes6.dex */
public final class eos0 implements dos0 {
    public static final long k;
    public static final long l;
    public final hos0 a;
    public final hit0 b;
    public final bos0 c;
    public final VideoGrowthType d;
    public final sos0 e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final long i;
    public final long j;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        k = timeUnit.toMillis(30L);
        l = timeUnit.toMillis(30L);
    }

    public eos0(hos0 hos0Var, hit0 hit0Var, bos0 bos0Var, VideoGrowthType videoGrowthType, sos0 sos0Var) {
        this.a = hos0Var;
        this.b = hit0Var;
        this.c = bos0Var;
        this.d = videoGrowthType;
        this.e = sos0Var;
        xv0 xv0Var = new xv0(28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, xv0Var);
        Lazy a = msy.a(lazyThreadSafetyMode, new x9l0(this, 9));
        this.g = a;
        this.h = msy.a(lazyThreadSafetyMode, new f880(this, 29));
        kos0 kos0Var = (kos0) a.getValue();
        this.i = kos0Var != null ? kos0Var.a.longValue() : k;
        kos0 kos0Var2 = (kos0) a.getValue();
        this.j = kos0Var2 != null ? kos0Var2.b.longValue() : l;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dos0
    public final boolean a() {
        if (!BuildInfo.s()) {
            return false;
        }
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        if (!bVar.a(VideoFeatures.VIDEO_SUPERAPP_DISCOVER_TRAPS) || !bVar.a(VideoFeatures.VIDEO_OPEN_STANDALONE_BTN) || this.c.a()) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ?? r2 = this.f;
        if (((SharedPreferences) r2.getValue()).getLong("pref_key_last_open_vk_video_at_discovery_btn_show_after_close", 0L) == 0) {
            if (((SharedPreferences) r2.getValue()).getLong("pref_key_last_open_vk_video_at_discovery_btn_show", 0L) != 0 && currentTimeMillis < ((SharedPreferences) r2.getValue()).getLong("pref_key_last_open_vk_video_at_discovery_btn_show", 0L) + this.i) {
                return false;
            }
            ((SharedPreferences) r2.getValue()).edit().putLong("pref_key_last_open_vk_video_at_discovery_btn_show", currentTimeMillis).apply();
            return true;
        }
        if (currentTimeMillis < ((SharedPreferences) r2.getValue()).getLong("pref_key_last_open_vk_video_at_discovery_btn_show_after_close", 0L) + this.j) {
            return false;
        }
        ((SharedPreferences) r2.getValue()).edit().putLong("pref_key_last_open_vk_video_at_discovery_btn_show", currentTimeMillis).apply();
        ((SharedPreferences) r2.getValue()).edit().putLong("pref_key_last_open_vk_video_at_discovery_btn_show_after_close", 0L).apply();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dos0
    public final void b() {
        String str;
        zos0 zos0Var = (zos0) this.h.getValue();
        if (zos0Var != null && (str = zos0Var.b) != null) {
            this.e.d(str);
        }
        ((SharedPreferences) this.f.getValue()).edit().putLong("pref_key_last_open_vk_video_at_discovery_btn_show_after_close", System.currentTimeMillis()).apply();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dos0
    public final void c(Context context, VideoGrowthVideoParams videoGrowthVideoParams) {
        zos0 zos0Var = (zos0) this.h.getValue();
        if (zos0Var != null) {
            this.e.a(zos0Var.b);
            this.b.b(context, zos0Var.b, zos0Var.a, videoGrowthVideoParams, null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.dos0
    public final void d() {
        String str;
        zos0 zos0Var = (zos0) this.h.getValue();
        if (zos0Var == null || (str = zos0Var.b) == null) {
            return;
        }
        this.e.show(str);
    }
}
