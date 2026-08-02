package xsna;

import android.net.Uri;
import androidx.media3.exoplayer.upstream.c;
import java.io.IOException;

/* compiled from: SegmentDownloader.java */
/* loaded from: classes12.dex */
public final class d5i0 extends bsg0<uer<Object>, IOException> {
    public final /* synthetic */ androidx.media3.datasource.cache.a i;
    public final /* synthetic */ evk j;
    public final /* synthetic */ androidx.media3.exoplayer.offline.f k;

    public d5i0(androidx.media3.exoplayer.offline.f fVar, androidx.media3.datasource.cache.a aVar, evk evkVar) {
        this.k = fVar;
        this.i = aVar;
        this.j = evkVar;
    }

    @Override // xsna.bsg0
    public final uer<Object> c() throws Exception {
        c.a<M> aVar = this.k.d;
        vyk0 vyk0Var = new vyk0(this.i);
        bpz.g.getAndIncrement();
        vyk0Var.b = 0L;
        bvk bvkVar = new bvk(vyk0Var, this.j);
        try {
            bvkVar.b.open(bvkVar.c);
            bvkVar.e = true;
            Uri uri = vyk0Var.a.getUri();
            uri.getClass();
            Object a = aVar.a(uri, bvkVar);
            y2r0.h(bvkVar);
            a.getClass();
            return (uer) a;
        } catch (Throwable th) {
            y2r0.h(bvkVar);
            throw th;
        }
    }
}
