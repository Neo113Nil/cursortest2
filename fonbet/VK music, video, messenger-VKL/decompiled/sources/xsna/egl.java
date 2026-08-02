package xsna;

import com.vk.core.preference.Preference;
import com.vk.metrics.performance.images.ImageCacheSource;
import com.vk.stat.model.builders.imagecache.ImageCacheStatEventBuilder;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.io.File;
import java.util.AbstractMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: DefaultImageCacheStatsReporter.kt */
/* loaded from: classes.dex */
public final class egl implements hgw {
    public static final bpn0 f = new bpn0(new zfl(0));
    public volatile boolean a;
    public final ConcurrentHashMap<ImageCacheSource, c> b = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<ImageCacheSource, c> c = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, a> d = new ConcurrentHashMap<>();
    public final io.reactivex.rxjava3.subjects.f<s3q0> e;

    /* compiled from: DefaultImageCacheStatsReporter.kt */
    public static final class a {
        public final String a;
        public final long b;

        public a(String str, long j) {
            this.a = str;
            this.b = j;
        }
    }

    /* compiled from: DefaultImageCacheStatsReporter.kt */
    /* loaded from: classes3.dex */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final int c() {
            return this.c;
        }
    }

    /* compiled from: DefaultImageCacheStatsReporter.kt */
    /* loaded from: classes3.dex */
    public static final class c {
        public final AtomicLong a = new AtomicLong();
        public final AtomicLong b = new AtomicLong();

        public final AtomicLong a() {
            return this.b;
        }

        public final AtomicLong b() {
            return this.a;
        }
    }

    public egl() {
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        io.reactivex.rxjava3.internal.operators.observable.t2 t2Var = new io.reactivex.rxjava3.internal.operators.observable.t2(fVar, 5000L, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), true);
        final agl aglVar = new agl(this);
        t2Var.U(new io.reactivex.rxjava3.functions.l() { // from class: xsna.bgl
            @Override // io.reactivex.rxjava3.functions.l
            public final Object apply(Object obj) {
                return (Map) agl.this.invoke(obj);
            }
        }).a0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new dgl(new cgl(this), 0));
        this.e = fVar;
    }

    public static int c(AbstractMap abstractMap) {
        long j = 0;
        long j2 = 0;
        for (c cVar : abstractMap.values()) {
            j += cVar.b().get();
            j2 += cVar.a().get();
        }
        return d(j, j2);
    }

    public static int d(long j, long j2) {
        if (j == 0) {
            return 0;
        }
        int i = (int) ((j2 / j) * 1000);
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static long e(File file) {
        try {
            if (!file.isDirectory()) {
                return file.length();
            }
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return 0L;
            }
            long j = 0;
            for (File file2 : listFiles) {
                j += e(file2);
            }
            return j;
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("Can't get dir size of " + file.getAbsolutePath(), th));
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(LinkedHashMap linkedHashMap, ImageCacheStatEventBuilder.HitEventType hitEventType, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        ImageCacheStatEventBuilder.HitEventType hitEventType2;
        String s;
        List b0;
        b bVar;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            if (intValue != 0) {
                if (hitEventType != ImageCacheStatEventBuilder.HitEventType.SCREEN) {
                    s = Preference.s("image_cache_load_stat_v1", str, new String());
                    if (s.length() != 0) {
                        try {
                            b0 = drm0.b0(s, new char[]{':'}, 0, 6);
                        } catch (Throwable th) {
                            com.vk.metrics.eventtracking.b.a.q(th);
                        }
                        if (b0.size() < 3) {
                            throw new IllegalArgumentException("Invalid CacheLoadDescriptor format.");
                        }
                        bVar = new b(Integer.parseInt((String) b0.get(0)), Integer.parseInt((String) b0.get(1)), Integer.parseInt((String) b0.get(2)));
                        ImageCacheStatEventBuilder imageCacheStatEventBuilder = new ImageCacheStatEventBuilder();
                        String name = mobileOfficialAppsCoreNavStat$EventScreen == null ? mobileOfficialAppsCoreNavStat$EventScreen.name() : null;
                        Integer valueOf = bVar == null ? Integer.valueOf(bVar.b()) : null;
                        Integer valueOf2 = bVar == null ? Integer.valueOf(bVar.a()) : null;
                        Integer valueOf3 = bVar != null ? Integer.valueOf(bVar.c()) : null;
                        hitEventType2 = hitEventType;
                        imageCacheStatEventBuilder.v(hitEventType2, str, intValue, name, valueOf, valueOf2, valueOf3);
                        imageCacheStatEventBuilder.q();
                    }
                }
                bVar = null;
                ImageCacheStatEventBuilder imageCacheStatEventBuilder2 = new ImageCacheStatEventBuilder();
                if (mobileOfficialAppsCoreNavStat$EventScreen == null) {
                }
                if (bVar == null) {
                }
                if (bVar == null) {
                }
                if (bVar != null) {
                }
                hitEventType2 = hitEventType;
                imageCacheStatEventBuilder2.v(hitEventType2, str, intValue, name, valueOf, valueOf2, valueOf3);
                imageCacheStatEventBuilder2.q();
            } else {
                hitEventType2 = hitEventType;
            }
            hitEventType = hitEventType2;
        }
    }

    @Override // xsna.hgw
    public final void a(ImageCacheSource imageCacheSource, String str, long j) {
        this.d.put(imageCacheSource.h(), new a(str, j));
    }

    @Override // xsna.hgw
    public final void b(ImageCacheSource imageCacheSource, long j, long j2) {
        c putIfAbsent;
        if (this.a) {
            ConcurrentHashMap<ImageCacheSource, c> concurrentHashMap = this.b;
            c cVar = concurrentHashMap.get(imageCacheSource);
            if (cVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(imageCacheSource, (cVar = new c()))) != null) {
                cVar = putIfAbsent;
            }
            c cVar2 = cVar;
            cVar2.b().set(j);
            cVar2.a().set(j2);
            this.e.onNext(s3q0.a);
        }
    }
}
