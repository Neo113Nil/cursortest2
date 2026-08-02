package xsna;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: FrescoRequestErrorListener.kt */
/* loaded from: classes2.dex */
public final class ihs implements v7g0 {
    public static final io.reactivex.rxjava3.subjects.d<Boolean> b = io.reactivex.rxjava3.subjects.d.O0(Boolean.FALSE);
    public final ConcurrentHashMap<String, ImageRequest> a = new ConcurrentHashMap<>();

    /* compiled from: FrescoRequestErrorListener.kt */
    public static final class a extends Throwable {
    }

    @Override // xsna.v7g0
    public final void c(String str, String str2, boolean z) {
        if (str != null) {
            this.a.remove(str);
        }
    }

    @Override // xsna.v7g0
    public final void f(String str, String str2, Throwable th, Map<String, String> map) {
        if (th instanceof FileNotFoundException) {
            b.onNext(Boolean.TRUE);
        }
        boolean c = t5m.c();
        ConcurrentHashMap<String, ImageRequest> concurrentHashMap = this.a;
        if (c && gz80.a(33) && str != null && concurrentHashMap.containsKey(str)) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            String valueOf = String.valueOf(concurrentHashMap.get(str));
            if (th == null) {
                th = new Throwable("null throwable!");
            }
            bVar.a(new a(valueOf, th));
        }
        if (str != null) {
            concurrentHashMap.remove(str);
        }
    }

    @Override // xsna.v7g0
    public final void i(ImageRequest imageRequest, Object obj, String str, boolean z) {
        if (str != null) {
            this.a.put(str, imageRequest);
        }
    }

    @Override // xsna.v7g0
    public final boolean j(String str) {
        return false;
    }

    @Override // xsna.v7g0
    public final void d(String str) {
    }

    @Override // xsna.v7g0
    public final void h(String str) {
    }

    @Override // xsna.v7g0
    public final void a(String str, String str2) {
    }

    @Override // xsna.v7g0
    public final void g(String str, String str2) {
    }

    @Override // xsna.v7g0
    public final void b(String str, String str2, Map<String, String> map) {
    }

    @Override // xsna.v7g0
    public final void e(ImageRequest imageRequest, String str, boolean z) {
    }

    @Override // xsna.v7g0
    public final void k(ImageRequest imageRequest, String str, Throwable th, boolean z) {
    }
}
