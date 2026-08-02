package xsna;

import android.graphics.Bitmap;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameResult;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FrameLoaderStrategy.kt */
/* loaded from: classes12.dex */
public final class mfs implements ec7 {
    public final q1t a;
    public final cj2 b;
    public final kfs c;
    public final boolean d;
    public final String e;
    public final int f;
    public final int g;
    public jfs h;
    public final int i;
    public int j;
    public final lfs k;

    public mfs(String str, q1t q1tVar, cj2 cj2Var, kfs kfsVar, boolean z) {
        this.a = q1tVar;
        this.b = cj2Var;
        this.c = kfsVar;
        this.d = z;
        this.e = str == null ? String.valueOf(hashCode()) : str;
        this.f = q1tVar.width();
        this.g = q1tVar.height();
        long millis = TimeUnit.SECONDS.toMillis(1L) / (q1tVar.getLoopDurationMs() / q1tVar.getFrameCount());
        int i = (int) (millis >= 1 ? millis : 1L);
        this.i = i;
        this.j = i;
        this.k = new lfs(this);
    }

    @Override // xsna.ec7
    public final uvf<Bitmap> a(int i, int i2, int i3) {
        dgs e = e(i2, i3);
        jfs f = f();
        FrameResult c = f != null ? f.c(i, e.a, e.b) : null;
        if (c != null) {
            AtomicInteger atomicInteger = com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.a;
            ConcurrentHashMap<tqo, Integer> concurrentHashMap = com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.d;
            lfs lfsVar = this.k;
            if (!concurrentHashMap.contains(lfsVar)) {
                concurrentHashMap.put(lfsVar, Integer.valueOf((int) (lfsVar.a * 0.2f)));
            }
            int i4 = a.C0108a.$EnumSwitchMapping$0[c.b.ordinal()];
            if (i4 == 1) {
                com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.a.incrementAndGet();
            } else if (i4 == 2) {
                com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.b.incrementAndGet();
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.a.c.incrementAndGet();
            }
        }
        if (c != null) {
            return c.a;
        }
        return null;
    }

    @Override // xsna.ec7
    public final void b() {
        jfs f = f();
        if (f != null) {
            ConcurrentHashMap<String, x6q0> concurrentHashMap = kfs.d;
            kfs.d.put(this.e, new x6q0(f, new Date()));
        }
        this.h = null;
    }

    @Override // xsna.ec7
    public final void c(int i, int i2, com.vk.movika.sdk.base.model.b bVar) {
        if (i <= 0 || i2 <= 0 || this.f <= 0 || this.g <= 0) {
            return;
        }
        dgs e = e(i, i2);
        jfs f = f();
        if (f != null) {
            int i3 = e.a;
            gzs<s3q0> gzsVar = bVar;
            if (bVar == null) {
                gzsVar = new f4(18);
            }
            f.b(i3, i3, gzsVar);
        }
    }

    public final dgs e(int i, int i2) {
        boolean z = this.d;
        int i3 = this.g;
        int i4 = this.f;
        if (!z) {
            return new dgs(i4, i3);
        }
        if (i < i4 || i2 < i3) {
            double d = i4 / i3;
            if (i2 > i) {
                if (i2 > i3) {
                    i2 = i3;
                }
                i4 = (int) (i2 * d);
                i3 = i2;
            } else {
                if (i > i4) {
                    i = i4;
                }
                i3 = (int) (i / d);
                i4 = i;
            }
        }
        return new dgs(i4, i3);
    }

    public final jfs f() {
        jfs bVar;
        if (this.h == null) {
            kfs kfsVar = this.c;
            String str = this.e;
            cj2 cj2Var = this.b;
            q1t q1tVar = this.a;
            ConcurrentHashMap<String, x6q0> concurrentHashMap = kfs.d;
            synchronized (concurrentHashMap) {
                x6q0 x6q0Var = concurrentHashMap.get(str);
                if (x6q0Var != null) {
                    concurrentHashMap.remove(str);
                    bVar = x6q0Var.a;
                } else {
                    s3q0 s3q0Var = s3q0.a;
                    bVar = new com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.b(kfsVar.a, cj2Var, new has(kfsVar.b), q1tVar, kfsVar.c);
                }
            }
            this.h = bVar;
        }
        return this.h;
    }

    @Override // xsna.ec7
    public final void onStop() {
        f();
        b();
    }

    @Override // xsna.ec7
    public final void d(fc7 fc7Var, dc7 dc7Var, BitmapAnimationBackend bitmapAnimationBackend, int i, com.vk.movika.sdk.base.logic.processor.h hVar) {
    }
}
