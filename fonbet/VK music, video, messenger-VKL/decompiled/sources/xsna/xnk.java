package xsna;

import android.net.Uri;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import java.io.IOException;

/* compiled from: CustomSegmentDownloader.java */
/* loaded from: classes3.dex */
public final class xnk extends bsg0<uer<Object>, IOException> {
    public final /* synthetic */ androidx.media3.datasource.cache.a i;
    public final /* synthetic */ evk j;
    public final /* synthetic */ ynk k;

    public xnk(ynk ynkVar, androidx.media3.datasource.cache.a aVar, evk evkVar) {
        this.k = ynkVar;
        this.i = aVar;
        this.j = evkVar;
    }

    @Override // xsna.bsg0
    public final uer<Object> c() throws Exception {
        HlsPlaylistParser hlsPlaylistParser = this.k.b;
        vyk0 vyk0Var = new vyk0(this.i);
        bpz.g.getAndIncrement();
        vyk0Var.b = 0L;
        bvk bvkVar = new bvk(vyk0Var, this.j);
        try {
            bvkVar.b.open(bvkVar.c);
            bvkVar.e = true;
            Uri uri = vyk0Var.a.getUri();
            uri.getClass();
            Object a = hlsPlaylistParser.a(uri, bvkVar);
            y2r0.h(bvkVar);
            a.getClass();
            return (uer) a;
        } catch (Throwable th) {
            y2r0.h(bvkVar);
            throw th;
        }
    }
}
