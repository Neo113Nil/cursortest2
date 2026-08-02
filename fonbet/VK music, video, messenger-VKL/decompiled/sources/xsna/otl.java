package xsna;

import android.net.Uri;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;
import xsna.kr10;

/* compiled from: DelegateDownloaderFactory.kt */
/* loaded from: classes3.dex */
public final class otl extends androidx.media3.exoplayer.offline.b {
    public final a.b e;
    public final wzs<DownloadRequest, a.b, androidx.media3.exoplayer.offline.d> f;

    /* JADX WARN: Multi-variable type inference failed */
    public otl(a.b bVar, wzs<? super DownloadRequest, ? super a.b, ? extends androidx.media3.exoplayer.offline.d> wzsVar) {
        super(bVar, new ddk());
        this.e = bVar;
        this.f = wzsVar;
    }

    @Override // androidx.media3.exoplayer.offline.b, xsna.fco
    public final androidx.media3.exoplayer.offline.d a(DownloadRequest downloadRequest) {
        androidx.media3.exoplayer.offline.d dVar;
        a.b bVar = this.e;
        wzs<DownloadRequest, a.b, androidx.media3.exoplayer.offline.d> wzsVar = this.f;
        if (wzsVar != null) {
            dVar = wzsVar.invoke(downloadRequest, bVar);
            if (dVar == null) {
                dVar = super.a(downloadRequest);
            }
        } else {
            dVar = null;
        }
        if (dVar == null) {
            dVar = super.a(downloadRequest);
        }
        if (!(dVar instanceof androidx.media3.exoplayer.offline.e)) {
            return dVar;
        }
        kr10.b.a aVar = new kr10.b.a();
        com.google.common.collect.h hVar = com.google.common.collect.h.h;
        ImmutableList.b bVar2 = ImmutableList.c;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        List list = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        kr10.g gVar3 = kr10.g.a;
        Uri uri = downloadRequest.c;
        return new pmr(new kr10("", new kr10.c(aVar), uri != null ? new kr10.f(uri, null, null, list, downloadRequest.g, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar2), vr10.B, gVar3), bVar);
    }
}
