package xsna;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Objects;
import xsna.oay0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class qnk {
    public boolean a = false;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public oay0.a d = oay0.f;

    public final String a(String str) {
        String str2;
        synchronized (this) {
            str2 = (String) this.b.get(str);
        }
        return str2;
    }

    public final void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this) {
            try {
                if ("exb".equals(str)) {
                    oay0.e.getClass();
                    this.d = TextUtils.isEmpty(str2) ? oay0.f : new oay0.a(str2);
                }
                if (str2 == null) {
                    c(str);
                } else {
                    this.b.put(str, str2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(String str) {
        synchronized (this) {
            try {
                if (!this.b.containsKey(str)) {
                    return false;
                }
                this.b.remove(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int d() {
        String a = a("ea");
        if (a == null) {
            return 0;
        }
        try {
            return Integer.parseInt(a);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final int e() {
        String a = a("eg");
        if (a == null) {
            return -1;
        }
        try {
            return Integer.parseInt(a);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final void f(int i) {
        if (i < 0) {
            gu8.c(null, "CustomParams: Age param removed");
            c("ea");
        } else {
            gu8.c(null, "CustomParams: Age param set to " + i);
            b("ea", String.valueOf(i));
        }
    }

    public final void g(@NonNull String str, @Nullable String str2) {
        if ("stories_playhead_v2".equals(str)) {
            if (Objects.equals(str2, "1")) {
                gu8.c(null, "CustomParams: STORIES_PLAYHEAD_V2 feature flag enabled");
                this.a = true;
            } else {
                gu8.c(null, "CustomParams: STORIES_PLAYHEAD_V2 feature flag disabled");
                this.a = false;
            }
        }
        b(str, str2);
        synchronized (this) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str2 == null) {
                this.c.remove(str);
            } else {
                this.c.put(str, str2);
            }
        }
    }

    public final void h(int i) {
        if (i != 0 && i != 1 && i != 2) {
            c("eg");
            gu8.c(null, "CustomParams: Gender param removed");
        } else {
            gu8.c(null, "CustomParams: Gender param is set to " + i);
            b("eg", String.valueOf(i));
        }
    }

    public final void i(@Nullable String str) {
        b("vk_id", str);
    }
}
