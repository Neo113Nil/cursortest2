package xsna;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.offline.DownloadRequest;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import xsna.bx8;
import xsna.d9v;
import xsna.kr10;
import xsna.osk;

/* compiled from: DownloaderFactory.kt */
/* loaded from: classes8.dex */
public final class eco extends androidx.media3.exoplayer.offline.b {
    public final a.b e;
    public final Executor f;
    public final bx8.a g;

    public eco(a.b bVar, Executor executor, bx8.a aVar) {
        super(bVar, executor);
        this.e = bVar;
        this.f = executor;
        this.g = aVar;
    }

    @Override // androidx.media3.exoplayer.offline.b, xsna.fco
    public final androidx.media3.exoplayer.offline.d a(DownloadRequest downloadRequest) {
        bx8.a aVar = this.g;
        if (aVar == null) {
            throw new NoWhenBranchMatchedException();
        }
        Uri uri = downloadRequest.c;
        List<StreamKey> list = downloadRequest.e;
        int J = y2r0.J(uri, downloadRequest.d);
        Executor executor = this.f;
        a.b bVar = this.e;
        if (J == 0) {
            osk.a aVar2 = new osk.a(bVar);
            aVar2.b = new wsk();
            aVar2.c = executor;
            long j = aVar.b;
            aVar2.d = j;
            aVar2.e = aVar.c - j;
            kr10.b.a aVar3 = new kr10.b.a();
            new kr10.d.a();
            List list2 = Collections.EMPTY_LIST;
            com.google.common.collect.g gVar = com.google.common.collect.g.f;
            kr10.e.a aVar4 = new kr10.e.a();
            return new osk(new kr10("", new kr10.c(aVar3), uri != null ? new kr10.f(uri, null, null, (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list)), null, gVar, C.TIME_UNSET) : null, new kr10.e(aVar4), vr10.B, kr10.g.a), aVar2.b, aVar2.a, aVar2.c, aVar2.d, aVar2.e);
        }
        if (J != 2) {
            return super.a(downloadRequest);
        }
        d9v.a aVar5 = new d9v.a(bVar);
        aVar5.b = new HlsPlaylistParser();
        aVar5.c = executor;
        long j2 = aVar.b;
        aVar5.d = j2;
        aVar5.e = aVar.c - j2;
        kr10.b.a aVar6 = new kr10.b.a();
        new kr10.d.a();
        List list3 = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar2 = com.google.common.collect.g.f;
        kr10.e.a aVar7 = new kr10.e.a();
        return new d9v(new kr10("", new kr10.c(aVar6), uri != null ? new kr10.f(uri, null, null, (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list)), null, gVar2, C.TIME_UNSET) : null, new kr10.e(aVar7), vr10.B, kr10.g.a), aVar5.b, aVar5.a, aVar5.c, aVar5.d, aVar5.e);
    }
}
