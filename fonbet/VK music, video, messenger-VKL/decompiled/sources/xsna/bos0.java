package xsna;

import android.content.SharedPreferences;
import com.vk.core.apps.BuildInfo;
import com.vk.toggle.features.VideoFeatures;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;

/* compiled from: VideoGrowthBombingControllerImpl.kt */
/* loaded from: classes6.dex */
public final class bos0 {
    public final hos0 a;
    public final gbu0 b;
    public final Object c;
    public final Object d;
    public final int e;
    public final int f;
    public final Object g;

    public bos0(hos0 hos0Var, gbu0 gbu0Var) {
        this.a = hos0Var;
        this.b = gbu0Var;
        rjg0 rjg0Var = new rjg0(6);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, rjg0Var);
        Lazy a = msy.a(lazyThreadSafetyMode, new zqf0(9));
        this.d = a;
        cos0 cos0Var = (cos0) a.getValue();
        this.e = cos0Var != null ? cos0Var.d.equals(Boolean.TRUE) ? 20 : cos0Var.b * 3600 : 86400;
        cos0 cos0Var2 = (cos0) a.getValue();
        this.f = cos0Var2 != null ? cos0Var2.d.equals(Boolean.TRUE) ? 120 : cos0Var2.c * 86400 : 2592000;
        this.g = msy.a(lazyThreadSafetyMode, new w2j0(this, 17));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean a() {
        if (BuildInfo.s() && com.vk.toggle.b.A.a(VideoFeatures.VIDEO_SUPERAPP_BOMBING_TRAPS)) {
            return !((sk3) this.g.getValue()).isEmpty() || ((long) pvo0.a()) - ((SharedPreferences) this.c.getValue()).getLong("pref_key_bomb_trap_last_show_time", 0L) >= ((long) this.f);
        }
        return false;
    }
}
