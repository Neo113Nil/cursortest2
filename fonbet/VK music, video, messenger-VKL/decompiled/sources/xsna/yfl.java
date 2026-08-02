package xsna;

import com.vk.metrics.performance.images.ImageCacheSource;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultImageCacheHitsDistributionReporter.kt */
/* loaded from: classes.dex */
public final class yfl implements ggw {
    public static final bpn0 d = new bpn0(new wfl(0));
    public volatile boolean a;
    public final io.reactivex.rxjava3.subjects.f<s3q0> b;
    public final bpn0 c;

    public yfl() {
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        new io.reactivex.rxjava3.internal.operators.observable.t2(fVar, 5000L, timeUnit, fb20.b(timeUnit, "unit is null", "scheduler is null"), true).a0(io.reactivex.rxjava3.schedulers.a.b()).subscribe(new xfl(new kal(this, 1), 0));
        this.b = fVar;
        this.c = new bpn0(new y45(1));
    }

    @Override // xsna.ggw
    public final void a(String str, ImageCacheSource imageCacheSource) {
        if (this.a) {
            Map map = (Map) ((Map) this.c.getValue()).get(imageCacheSource);
            if (map != null) {
            }
            this.b.onNext(s3q0.a);
        }
    }

    @Override // xsna.ggw
    public final void b(String str, ImageCacheSource imageCacheSource) {
        if (this.a) {
            Map map = (Map) ((Map) this.c.getValue()).get(imageCacheSource);
            if (map != null) {
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new AtomicInteger();
                    map.put(str, obj);
                }
                ((AtomicInteger) obj).incrementAndGet();
            }
            this.b.onNext(s3q0.a);
        }
    }
}
