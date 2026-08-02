package xsna;

import com.vk.core.preference.Preference;
import java.util.concurrent.TimeUnit;
import xsna.ky6;
import xsna.yzv0;

/* compiled from: VkVideoFeedButtonPromoDelegate.kt */
/* loaded from: classes3.dex */
public final class vzv0 {
    public static final long e;
    public static final long f;
    public final long a = Preference.j().getLong("pref_key_last_open_vk_video_popup_show", 0);
    public final long b = Preference.j().getLong("pref_key_last_open_vk_video_popup_show_after_close", 0);
    public final long c;
    public final long d;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        e = timeUnit.toMillis(30L);
        f = timeUnit.toMillis(30L);
    }

    public vzv0(yzv0.a aVar) {
        kos0 kos0Var = (kos0) aVar.get();
        this.c = kos0Var != null ? kos0Var.a.longValue() : e;
        kos0 kos0Var2 = (kos0) aVar.get();
        this.d = kos0Var2 != null ? kos0Var2.b.longValue() : f;
    }

    public static void a(long j) {
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putLong("pref_key_last_open_vk_video_popup_show", j);
        aVar.a();
    }
}
