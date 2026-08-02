package xsna;

import com.vk.core.preference.Preference;
import com.vk.rlottie.RLottieDrawable;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.utils.Logger;

/* compiled from: RLottieController.kt */
/* loaded from: classes5.dex */
public final class yse0 {
    public static final bpn0 a = new bpn0(new uv0(29));
    public static final a b = new a();
    public static final s8l0 c = s8l0.a;

    /* compiled from: RLottieController.kt */
    public static final class a {
    }

    public static void a() {
        c.getClass();
        if (s8l0.b) {
            return;
        }
        s8l0.b = true;
        asu0.a.getClass();
        asu0.o().schedule(new r8l0(0), 20L, TimeUnit.SECONDS);
    }

    public static void b() {
        if (d().a == null || RLottieDrawable.t.get() <= 0) {
            String str = d().a;
            if (str == null) {
                str = "";
            }
            nbr.l(new File(str));
        }
    }

    public static Pair c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new Pair(Integer.valueOf(jSONObject.optInt(Logger.METHOD_W)), Integer.valueOf(jSONObject.optInt("h")));
        } catch (JSONException unused) {
            return new Pair(0, 0);
        }
    }

    public static zse0 d() {
        return (zse0) a.getValue();
    }

    public static String e() {
        if (d().a != null) {
            return d().a;
        }
        return null;
    }

    public static void f(int i) {
        c.getClass();
        long m = Preference.m(-1L, "stickers", "animated_stickers_avg_dropped_frames");
        if (i > 0) {
            Preference.F((m < 0 ? Integer.valueOf(i) : Long.valueOf((m + i) / 2)).longValue(), "stickers", "animated_stickers_avg_dropped_frames");
        }
    }
}
