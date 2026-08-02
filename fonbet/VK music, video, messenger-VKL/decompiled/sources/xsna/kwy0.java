package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.common.util.concurrent.AtomicDouble;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import com.iab.omid.library.corpmailru.adsession.media.MediaEvents;
import com.iab.omid.library.corpmailru.adsession.media.PlayerState;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.text.DecimalFormat;
import java.util.Iterator;
import xsna.h8z0;
import xsna.thz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class kwy0 {
    public static final DecimalFormat n;
    public final h8z0.b a;
    public boolean b;
    public thz0 c;
    public b6z0 d;
    public e5z0 e;
    public giy0 f;
    public Context g;
    public String h;
    public String i;
    public sqk0 j;
    public float k;
    public a l = new a();
    public final wiy0 m;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final AtomicDouble a = new AtomicDouble();
        public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    static {
        DecimalFormat decimalFormat = new DecimalFormat();
        n = decimalFormat;
        decimalFormat.setMaximumFractionDigits(2);
    }

    public kwy0(lgz0 lgz0Var, thz0 thz0Var, Context context, h8z0.b bVar, wiy0 wiy0Var) {
        this.m = wiy0Var;
        this.c = thz0Var;
        this.a = bVar;
        if (context != null) {
            this.g = context.getApplicationContext();
        }
        if (lgz0Var == null) {
            return;
        }
        e5z0 e5z0Var = lgz0Var.a;
        this.e = e5z0Var;
        this.d = e5z0Var.m();
        this.h = lgz0Var.F;
        this.k = lgz0Var.D;
    }

    public static kwy0 a(lgz0 lgz0Var, thz0 thz0Var, h8z0.b bVar, Context context) {
        return new kwy0(lgz0Var, thz0Var, context, bVar, new wiy0(new Handler(Looper.getMainLooper())));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(float f, float f2) {
        int i;
        ihz0 ihz0Var;
        d8x d8xVar;
        thz0 thz0Var;
        long j;
        g();
        a aVar = this.l;
        aVar.getClass();
        float min = Math.min(f, f2);
        if (1 == b920.b(min, aVar.b)) {
            AtomicDouble atomicDouble = aVar.a;
            double d = min - aVar.b;
            do {
                j = atomicDouble.b.get();
            } while (!atomicDouble.b.compareAndSet(j, Double.doubleToRawLongBits(Double.longBitsToDouble(j) + d)));
        }
        aVar.b = min;
        if (e()) {
            return;
        }
        boolean z = this.b;
        int i2 = 0;
        h8z0.b bVar = this.a;
        if (!z) {
            h8z0.e(this.e, "playbackStarted", 1, bVar);
            giy0 giy0Var = this.f;
            if (giy0Var != null) {
                giy0Var.b(1, 3, AuthCode.StatusCode.CERT_FINGERPRINT_ERROR, this.i, null);
            }
            sqk0 sqk0Var = this.j;
            if (sqk0Var != null && (d8xVar = (ihz0Var = (ihz0) sqk0Var.c).g) != null && (thz0Var = ihz0Var.f) != null) {
                thz0Var.d(d8xVar.getView(), new thz0.b[0]);
                ihz0Var.f.h();
            }
            this.b = true;
        }
        if (!this.d.c.isEmpty()) {
            b6z0 a2 = this.d.a();
            Iterator it = this.d.c.iterator();
            while (it.hasNext()) {
                e9z0 e9z0Var = (e9z0) it.next();
                float f3 = e9z0Var.f;
                float f4 = e9z0Var.g;
                if (f3 == -1.0f && f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    e9z0Var.f = (f4 * f2) / 100.0f;
                    e9z0Var.g = -1.0f;
                }
                if (b920.b(e9z0Var.f, f) != 1) {
                    a2.c.add(e9z0Var);
                    it.remove();
                }
            }
            h8z0.h(a2, bVar);
        }
        thz0 thz0Var2 = this.c;
        if (thz0Var2 != null && thz0Var2.h != null) {
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                float f5 = f / f2;
                if (b920.b(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) != -1) {
                    if (b920.b(f5, 0.25f) != -1) {
                        i2 = b920.b(f5, 0.5f) == -1 ? 1 : b920.b(f5, 0.75f) == -1 ? 2 : b920.b(f5, 1.0f) == -1 ? 3 : 4;
                    }
                    i = thz0Var2.d;
                    if (i2 != i && i2 > i) {
                        if (thz0Var2.h != null) {
                            gu8.c(null, "OmTracker: sendQuartile() called with: quartile = [" + i2 + X3.j.e);
                            try {
                                if (i2 == 0) {
                                    thz0Var2.h.start(f2, thz0Var2.e);
                                } else if (i2 == 1) {
                                    thz0Var2.h.firstQuartile();
                                } else if (i2 == 2) {
                                    thz0Var2.h.midpoint();
                                } else if (i2 == 3) {
                                    thz0Var2.h.thirdQuartile();
                                } else if (i2 == 4) {
                                    thz0Var2.h.complete();
                                }
                            } catch (Throwable th) {
                                eb3.a(null, new StringBuilder("OmTracker: Unable to track quartiles: "), th);
                            }
                        }
                        thz0Var2.d = i2;
                    }
                }
            }
            i2 = -1;
            i = thz0Var2.d;
            if (i2 != i) {
                if (thz0Var2.h != null) {
                }
                thz0Var2.d = i2;
            }
        }
        if (this.k <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || TextUtils.isEmpty(this.h) || Math.abs(f2 - this.k) <= 1.5f) {
            return;
        }
        gu8.f("PlaybackTracker", "The diff between expected duration = " + this.k + " and the received duration = " + f2 + " from the player is more than duration error limit = 1.5");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(lgz0 lgz0Var) {
        xw1 xw1Var;
        wiy0 wiy0Var = this.m;
        synchronized (wiy0Var) {
            xw1Var = wiy0Var.b;
            synchronized (wiy0Var) {
                try {
                    xw1 xw1Var2 = wiy0Var.b;
                    if (xw1Var2 != null) {
                        wiy0Var.a.removeCallbacks(xw1Var2);
                        wiy0Var.b = null;
                    }
                } finally {
                }
            }
            if (lgz0Var == null) {
                if (lgz0Var.a != this.e) {
                    this.b = false;
                }
                synchronized (this) {
                    this.e = lgz0Var.a;
                    this.l = new a();
                }
                this.d = lgz0Var.a.m();
                this.f = lgz0Var.T;
                this.i = lgz0Var.v();
            } else {
                synchronized (this) {
                    this.e = null;
                    this.l = new a();
                }
                this.d = null;
                this.f = null;
                this.i = null;
            }
            this.h = null;
            this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (xw1Var != null) {
            wiy0Var.a.post(xw1Var);
        }
        if (lgz0Var == null) {
        }
        this.h = null;
        this.k = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void d(boolean z) {
        MediaEvents mediaEvents;
        if (e()) {
            return;
        }
        h8z0.e(this.e, z ? "fullscreenOn" : "fullscreenOff", 1, null);
        thz0 thz0Var = this.c;
        if (thz0Var == null || (mediaEvents = thz0Var.h) == null || z == thz0Var.i) {
            return;
        }
        thz0Var.i = z;
        try {
            mediaEvents.playerStateChange(z ? PlayerState.FULLSCREEN : PlayerState.NORMAL);
        } catch (Throwable th) {
            eb3.a(null, new StringBuilder("OmTracker: Unable to track media fullscreen: "), th);
        }
    }

    public final boolean e() {
        return this.g == null || this.e == null || this.d == null;
    }

    public final void f(boolean z) {
        if (e()) {
            return;
        }
        h8z0.e(this.e, z ? "volumeOn" : "volumeOff", 999, null);
        thz0 thz0Var = this.c;
        if (thz0Var != null) {
            thz0Var.b(z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    public final void g() {
        e5z0 e5z0Var;
        a aVar;
        synchronized (this) {
            e5z0Var = this.e;
            aVar = this.l;
        }
        if (e5z0Var != null) {
            wiy0 wiy0Var = this.m;
            gq4 gq4Var = new gq4(6, aVar, e5z0Var);
            synchronized (wiy0Var) {
                synchronized (wiy0Var) {
                    try {
                        xw1 xw1Var = wiy0Var.b;
                        if (xw1Var != null) {
                            wiy0Var.a.removeCallbacks(xw1Var);
                            wiy0Var.b = null;
                        }
                    } finally {
                    }
                }
            }
            xw1 xw1Var2 = new xw1(gq4Var, 19);
            wiy0Var.b = xw1Var2;
            wiy0Var.a.postDelayed(xw1Var2, 10000L);
        }
    }

    public final void h() {
        if (e()) {
            return;
        }
        this.d = this.e.m();
        this.b = false;
    }

    public final void i() {
        g();
        if (e()) {
            return;
        }
        h8z0.e(this.e, "playbackCompleted", 1, null);
    }

    public final void j() {
        g();
        if (e()) {
            return;
        }
        h8z0.e(this.e, "closedByUser", 999, null);
    }

    public final void k() {
        g();
        if (e()) {
            return;
        }
        h8z0.e(this.e, "playbackPaused", 1, null);
        thz0 thz0Var = this.c;
        if (thz0Var != null) {
            thz0Var.c(0);
        }
    }

    public final void l() {
        g();
        if (e()) {
            return;
        }
        h8z0.e(this.e, "error", 1, null);
        h8z0.e(this.e, "playbackError", 1, null);
        thz0 thz0Var = this.c;
        if (thz0Var != null) {
            thz0Var.c(3);
        }
    }

    public final void m() {
        g();
        if (e()) {
            return;
        }
        h8z0.e(this.e, "playbackTimeout", 1, null);
    }

    public final void n() {
        g();
        if (e()) {
            return;
        }
        h8z0.e(this.e, "playbackResumed", 1, null);
        thz0 thz0Var = this.c;
        if (thz0Var != null) {
            thz0Var.c(1);
        }
    }

    public final void o() {
        g();
        if (e()) {
            return;
        }
        h8z0.e(this.e, "playbackStopped", 1, null);
    }
}
