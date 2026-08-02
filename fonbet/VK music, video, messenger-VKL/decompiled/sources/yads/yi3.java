package yads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import xsna.fe60;

/* loaded from: classes10.dex */
public final class yi3 {
    public final lv0 a = new lv0();
    public final ui3 b;
    public final xi3 c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public yi3(Context context) {
        ui3 a = a(context);
        this.b = a;
        this.c = a != null ? xi3.a() : null;
        this.k = C.TIME_UNSET;
        this.l = C.TIME_UNSET;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static ui3 a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        wi3 a = mc3.a >= 17 ? wi3.a(applicationContext) : null;
        if (a != null) {
            return a;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null) {
            return new vi3(windowManager);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        float f;
        float f2;
        if (mc3.a < 30 || this.e == null) {
            return;
        }
        if (this.a.a.a()) {
            lv0 lv0Var = this.a;
            if (lv0Var.a.a()) {
                f = (float) (1.0E9d / (lv0Var.a.e != 0 ? r0.f / r3 : 0L));
            } else {
                f = -1.0f;
            }
        } else {
            f = this.f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (this.a.a.a()) {
                lv0 lv0Var2 = this.a;
                if ((lv0Var2.a.a() ? lv0Var2.a.f : C.TIME_UNSET) >= 5000000000L) {
                    f2 = 0.02f;
                    if (Math.abs(f - this.g) < f2) {
                        return;
                    }
                }
            }
            f2 = 1.0f;
            if (Math.abs(f - this.g) < f2) {
            }
        } else if (f == -1.0f && this.a.e < 30) {
            return;
        }
        this.g = f;
        a(false);
    }

    public final void a() {
        this.d = true;
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
        if (this.b != null) {
            xi3 xi3Var = this.c;
            xi3Var.getClass();
            xi3Var.c.sendEmptyMessage(1);
            this.b.a(new fe60(this, 19));
        }
        a(false);
    }

    public final void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.k = refreshRate;
            this.l = (refreshRate * 80) / 100;
        } else {
            ji1.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.k = C.TIME_UNSET;
            this.l = C.TIME_UNSET;
        }
    }

    public final void a(boolean z) {
        Surface surface;
        float f;
        if (mc3.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        if (this.d) {
            float f2 = this.g;
            if (f2 != -1.0f) {
                f = f2 * this.i;
                if (z && this.h == f) {
                    return;
                }
                this.h = f;
                si3.a(surface, f);
            }
        }
        f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (z) {
        }
        this.h = f;
        si3.a(surface, f);
    }
}
