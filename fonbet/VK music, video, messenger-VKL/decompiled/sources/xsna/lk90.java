package xsna;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadRequest;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.a8s0;

/* compiled from: PartialDownloaderFactory.kt */
@ozl
/* loaded from: classes8.dex */
public final class lk90 extends androidx.media3.exoplayer.offline.b {
    public final a.b e;
    public final a8s0.b f;
    public final Executor g;
    public final long h;
    public final Long i;

    public lk90(a.b bVar, a8s0.b bVar2, Executor executor) {
        super(bVar, executor);
        this.e = bVar;
        this.f = bVar2;
        this.g = executor;
        this.h = 0L;
        this.i = null;
    }

    @Override // androidx.media3.exoplayer.offline.b, xsna.fco
    public final androidx.media3.exoplayer.offline.d a(DownloadRequest downloadRequest) {
        int J = y2r0.J(downloadRequest.c, downloadRequest.d);
        a8s0.b bVar = this.f;
        Long l = this.i;
        if (J == 0) {
            Uri uri = downloadRequest.c;
            List<StreamKey> list = downloadRequest.e;
            long j = this.h;
            return new kk90(uri, list, this.e, j, l != null ? l.longValue() : bVar.c + j, new wsk(), this.g);
        }
        if (J != 2) {
            return super.a(downloadRequest);
        }
        Uri uri2 = downloadRequest.c;
        List<StreamKey> list2 = downloadRequest.e;
        long j2 = this.h;
        return new nk90(uri2, list2, this.e, j2, l != null ? l.longValue() : bVar.c + j2, new tfl(), this.g);
    }
}
