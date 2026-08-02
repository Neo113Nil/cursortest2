package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.Surface;
import defpackage.her;
import defpackage.lk91;
import defpackage.tw21;

/* loaded from: classes10.dex */
public final class c {
    public final her a = new her();
    public final VideoFrameReleaseHelper$DisplayHelper b;
    public final VideoFrameReleaseHelper$VSyncSampler c;
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

    public c(Context context) {
        DisplayManager displayManager;
        VideoFrameReleaseHelper$DisplayHelper videoFrameReleaseHelper$DisplayHelper = (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) ? null : new VideoFrameReleaseHelper$DisplayHelper(this, displayManager);
        this.b = videoFrameReleaseHelper$DisplayHelper;
        this.c = videoFrameReleaseHelper$DisplayHelper != null ? VideoFrameReleaseHelper$VSyncSampler.getInstance() : null;
        this.k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public static void a(c cVar, Display display) {
        cVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            cVar.k = refreshRate;
            cVar.l = (refreshRate * 80) / 100;
        } else {
            lk91.j("Unable to query display refresh rate");
            cVar.k = -9223372036854775807L;
            cVar.l = -9223372036854775807L;
        }
    }

    public final void b() {
        Surface surface;
        if (tw21.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f) {
            return;
        }
        this.h = 0.0f;
        try {
            surface.setFrameRate(0.0f, 0);
        } catch (IllegalStateException e) {
            lk91.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        float f;
        float f2;
        if (tw21.a < 30 || this.e == null) {
            return;
        }
        her herVar = this.a;
        if (!herVar.a.a()) {
            f = this.f;
        } else if (herVar.a.a()) {
            f = (float) (1.0E9d / (herVar.a.e != 0 ? r2.f / r4 : 0L));
        } else {
            f = -1.0f;
        }
        float f3 = this.g;
        if (f == f3) {
            return;
        }
        if (f != -1.0f && f3 != -1.0f) {
            if (herVar.a.a()) {
                if ((herVar.a.a() ? herVar.a.f : -9223372036854775807L) >= 5000000000L) {
                    f2 = 0.02f;
                    if (Math.abs(f - this.g) < f2) {
                        return;
                    }
                }
            }
            f2 = 1.0f;
            if (Math.abs(f - this.g) < f2) {
            }
        } else if (f == -1.0f && herVar.e < 30) {
            return;
        }
        this.g = f;
        d(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z) {
        Surface surface;
        float f;
        if (tw21.a < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE) {
            return;
        }
        try {
            if (this.d) {
                float f2 = this.g;
                if (f2 != -1.0f) {
                    f = f2 * this.i;
                    if (z && this.h == f) {
                        return;
                    }
                    this.h = f;
                    surface.setFrameRate(f, f != 0.0f ? 0 : 1);
                    return;
                }
            }
            surface.setFrameRate(f, f != 0.0f ? 0 : 1);
            return;
        } catch (IllegalStateException e) {
            lk91.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            return;
        }
        f = 0.0f;
        if (z) {
        }
        this.h = f;
    }
}
