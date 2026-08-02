package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.storage.CachedVideoViewedSegments;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoViewedSegmentsStorage.kt */
/* loaded from: classes3.dex */
public final class irt0 {
    public static final bpn0 d = new bpn0(new ta50(20));
    public final LinkedHashMap a = new LinkedHashMap();
    public final io.reactivex.rxjava3.subjects.f<a> b;
    public boolean c;

    /* compiled from: VideoViewedSegmentsStorage.kt */
    public static final class a {
        public final List<CachedVideoViewedSegments> a;
        public final boolean b;

        public a(List<CachedVideoViewedSegments> list, boolean z) {
            this.a = list;
            this.b = z;
        }
    }

    /* compiled from: VideoViewedSegmentsStorage.kt */
    public static final class b {
        public static irt0 a() {
            return (irt0) irt0.d.getValue();
        }
    }

    /* compiled from: VideoViewedSegmentsStorage.kt */
    public static final class c {
        public static final irt0 a = new irt0();
    }

    public irt0() {
        io.reactivex.rxjava3.subjects.f<a> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        bVar.b(hg1.h(wmi0.a.e("video_viewed_segments"), new lzl0(this, 11)));
        io.reactivex.rxjava3.core.q X = io.reactivex.rxjava3.core.q.X(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar.v0(15000L, TimeUnit.MILLISECONDS), new x310(new hxm0(10), 20)), new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, new r2v(new epj0(12), 23)));
        asu0.a.getClass();
        bVar.b(X.r0(asu0.i()).U(new or20(new d7l0(14), 21)).subscribe(new hrt0(new p6e0(20), 0)));
    }

    public final CachedVideoViewedSegments a(qg90<UserId, Integer> qg90Var) {
        return (CachedVideoViewedSegments) this.a.get(qg90Var);
    }

    public final List<CachedVideoViewedSegments> b() {
        return j5g.O0(this.a.values());
    }

    public final boolean c() {
        return this.c;
    }

    public final void d(qg90<UserId, Integer> qg90Var) {
        this.a.remove(qg90Var);
        this.b.onNext(new a(b(), true));
    }

    public final void e(CachedVideoViewedSegments cachedVideoViewedSegments) {
        this.a.put(new qg90(cachedVideoViewedSegments.b, Integer.valueOf(cachedVideoViewedSegments.c)), cachedVideoViewedSegments);
        this.b.onNext(new a(b(), false));
    }
}
