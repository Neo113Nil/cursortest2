package xsna;

import com.ironsource.X3;
import com.vk.metrics.performance.images.ImageCacheSource;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ImageCacheStatsTrackerImpl.kt */
/* loaded from: classes.dex */
public final class jgw implements igw {
    public final hgw b;
    public final ggw c;
    public final ConcurrentHashMap<ImageCacheSource, a> d = new ConcurrentHashMap<>();

    /* compiled from: ImageCacheStatsTrackerImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        public final AtomicLong a = new AtomicLong();
        public final AtomicLong b = new AtomicLong();

        public final AtomicLong a() {
            return this.b;
        }

        public final AtomicLong b() {
            return this.a;
        }
    }

    public jgw(hgw hgwVar, ggw ggwVar) {
        this.b = hgwVar;
        this.c = ggwVar;
    }

    public static ImageCacheSource c(ww8 ww8Var) {
        ImageCacheSource imageCacheSource;
        int i = 0;
        if (brm0.B(ww8Var.a(), "vk-image-cache", false)) {
            return ImageCacheSource.IMAGES;
        }
        if (!brm0.B(ww8Var.a(), "[cachesource-", false)) {
            return ImageCacheSource.OTHER;
        }
        String a2 = ww8Var.a();
        try {
            String substring = a2.substring(13, drm0.K(0, 6, a2, X3.j.e, false));
            ImageCacheSource.Companion.getClass();
            ImageCacheSource[] values = ImageCacheSource.values();
            int length = values.length;
            while (true) {
                if (i >= length) {
                    imageCacheSource = null;
                    break;
                }
                imageCacheSource = values[i];
                if (epx.f(imageCacheSource.h(), substring)) {
                    break;
                }
                i++;
            }
            return imageCacheSource == null ? ImageCacheSource.OTHER : imageCacheSource;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalArgumentException("Can't get cache source from prefix ".concat(a2), th));
            return ImageCacheSource.OTHER;
        }
    }

    @Override // xsna.igw
    public final void a(ww8 ww8Var) {
        ImageCacheSource c = c(ww8Var);
        a b = b(c);
        this.c.b(ww8Var.a(), c);
        long incrementAndGet = b.a().incrementAndGet();
        this.b.b(c, b.b().incrementAndGet(), incrementAndGet);
    }

    public final a b(ImageCacheSource imageCacheSource) {
        a putIfAbsent;
        ConcurrentHashMap<ImageCacheSource, a> concurrentHashMap = this.d;
        a aVar = concurrentHashMap.get(imageCacheSource);
        if (aVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(imageCacheSource, (aVar = new a()))) != null) {
            aVar = putIfAbsent;
        }
        return aVar;
    }

    @Override // xsna.igw
    public final void e(ww8 ww8Var) {
        ImageCacheSource c = c(ww8Var);
        a b = b(c);
        this.c.b(ww8Var.a(), c);
        long incrementAndGet = b.a().incrementAndGet();
        this.b.b(c, b.b().incrementAndGet(), incrementAndGet);
    }

    @Override // xsna.igw
    public final void g(ww8 ww8Var) {
        ImageCacheSource c = c(ww8Var);
        a b = b(c);
        this.c.a(ww8Var.a(), c);
        long j = b.a().get();
        this.b.b(c, b.b().incrementAndGet(), j);
    }

    @Override // xsna.igw
    public final void h(ww8 ww8Var) {
        ImageCacheSource c = c(ww8Var);
        a b = b(c);
        this.c.a(ww8Var.a(), c);
        long decrementAndGet = b.a().decrementAndGet();
        this.b.b(c, b.b().get(), decrementAndGet);
    }

    @Override // xsna.igw
    public final void i(ww8 ww8Var) {
        ImageCacheSource c = c(ww8Var);
        a b = b(c);
        this.c.b(ww8Var.a(), c);
        long incrementAndGet = b.a().incrementAndGet();
        this.b.b(c, b.b().incrementAndGet(), incrementAndGet);
    }
}
