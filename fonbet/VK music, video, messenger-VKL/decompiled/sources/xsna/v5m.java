package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import java.util.concurrent.ExecutorService;

/* compiled from: DeviceCacheManager.java */
/* loaded from: classes13.dex */
public final class v5m {
    public static final ra2 c = ra2.d();
    public static v5m d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public v5m(ExecutorService executorService) {
        this.b = executorService;
    }

    @Nullable
    public static Context a() {
        try {
            vhr.d();
            vhr d2 = vhr.d();
            d2.a();
            return d2.a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public static synchronized v5m b() {
        v5m v5mVar;
        synchronized (v5m.class) {
            try {
                if (d == null) {
                    d = new v5m(asu0.C());
                }
                v5mVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return v5mVar;
    }

    public final synchronized void c(Context context) {
        if (this.a == null && context != null) {
            this.b.execute(new ls2(3, this, context));
        }
    }

    public final void d(float f, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putFloat(str, f).apply();
    }

    public final void e(long j, String str) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        this.a.edit().putLong(str, j).apply();
    }

    public final void f(String str, String str2) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.a.edit().remove(str).apply();
        } else {
            this.a.edit().putString(str, str2).apply();
        }
    }

    public final void g(String str, boolean z) {
        if (this.a == null) {
            c(a());
            if (this.a == null) {
                return;
            }
        }
        tdj.b(this.a, str, z);
    }
}
