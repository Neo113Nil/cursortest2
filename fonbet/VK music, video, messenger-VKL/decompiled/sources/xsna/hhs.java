package xsna;

import com.facebook.imagepipeline.request.ImageRequest;
import com.vk.imageloader.fresco.Quality;
import java.util.Map;

/* compiled from: FrescoQualityCallback.kt */
/* loaded from: classes2.dex */
public final class hhs implements v7g0 {
    public final Quality a;
    public final gzs<ma80> b;

    /* JADX WARN: Multi-variable type inference failed */
    public hhs(Quality quality, gzs<? extends ma80> gzsVar) {
        this.a = quality;
        this.b = gzsVar;
    }

    @Override // xsna.v7g0
    public final void c(String str, String str2, boolean z) {
        ma80 invoke;
        if (!z || (invoke = this.b.invoke()) == null) {
            return;
        }
        invoke.a(this.a);
    }

    @Override // xsna.v7g0
    public final boolean j(String str) {
        return false;
    }

    @Override // xsna.v7g0
    public void d(String str) {
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
    public final void b(String str, String str2, Map map) {
    }

    @Override // xsna.v7g0
    public void e(ImageRequest imageRequest, String str, boolean z) {
    }

    @Override // xsna.v7g0
    public final void f(String str, String str2, Throwable th, Map map) {
    }

    @Override // xsna.v7g0
    public void i(ImageRequest imageRequest, Object obj, String str, boolean z) {
    }

    @Override // xsna.v7g0
    public void k(ImageRequest imageRequest, String str, Throwable th, boolean z) {
    }
}
