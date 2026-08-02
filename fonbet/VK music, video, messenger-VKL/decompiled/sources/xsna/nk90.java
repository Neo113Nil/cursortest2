package xsna;

import android.net.Uri;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.offline.f;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.kr10;

/* compiled from: PartialHlsDownloader.java */
@Deprecated
/* loaded from: classes8.dex */
public final class nk90 extends androidx.media3.exoplayer.offline.f<o9v> {
    public final long n;
    public final long o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nk90(Uri uri, List list, a.b bVar, long j, long j2, tfl tflVar, Executor executor) {
        super(new kr10("", new kr10.c(r1), uri != null ? new kr10.f(uri, null, null, (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list)), null, r9, C.TIME_UNSET) : null, new kr10.e(r2), vr10.B, kr10.g.a), new HlsPlaylistParser(), bVar, executor, 0L, C.TIME_UNSET);
        kr10.b.a aVar = new kr10.b.a();
        new kr10.d.a();
        List list2 = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        this.n = j;
        this.o = j2;
    }

    public static void i(androidx.media3.exoplayer.hls.playlist.b bVar, b.e eVar, HashSet hashSet, ArrayList arrayList) {
        String str = bVar.a;
        long j = bVar.h + eVar.f;
        String str2 = eVar.h;
        if (str2 != null) {
            Uri d = neq0.d(str, str2);
            if (hashSet.add(d)) {
                arrayList.add(new f.c(j, androidx.media3.exoplayer.offline.f.d(d)));
            }
        }
        Uri d2 = neq0.d(str, eVar.b);
        Map map = Collections.EMPTY_MAP;
        long j2 = eVar.j;
        long j3 = eVar.k;
        fxc0.t(d2, "The uri must be set.");
        arrayList.add(new f.c(j, new evk(d2, 0L, 1, null, map, j2, j3, null, 0, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.offline.f
    public final List e(androidx.media3.datasource.cache.a aVar, uer uerVar, boolean z) throws IOException, InterruptedException {
        int i;
        int i2;
        o9v o9vVar = (o9v) uerVar;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (o9vVar instanceof androidx.media3.exoplayer.hls.playlist.c) {
            List<Uri> list = ((androidx.media3.exoplayer.hls.playlist.c) o9vVar).d;
            for (int i4 = 0; i4 < list.size(); i4++) {
                arrayList.add(androidx.media3.exoplayer.offline.f.d(list.get(i4)));
            }
        } else {
            arrayList.add(androidx.media3.exoplayer.offline.f.d(Uri.parse(o9vVar.a)));
        }
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            evk evkVar = (evk) it.next();
            arrayList2.add(new f.c(0L, evkVar));
            try {
                androidx.media3.exoplayer.hls.playlist.b bVar = (androidx.media3.exoplayer.hls.playlist.b) ((uer) c(new c5i0(this, aVar, evkVar), false));
                ImmutableList immutableList = bVar.r;
                b.e eVar = null;
                for (int i5 = 0; i5 < immutableList.size(); i5++) {
                    b.e eVar2 = (b.e) immutableList.get(i5);
                    b.e eVar3 = eVar2.c;
                    if (eVar3 != null && eVar3 != eVar) {
                        i(bVar, eVar3, hashSet, arrayList2);
                        eVar = eVar3;
                    }
                    i(bVar, eVar2, hashSet, arrayList2);
                }
            } catch (IOException | InterruptedException e) {
                if (!z) {
                    throw e;
                }
            }
        }
        int size = arrayList2.size() - 1;
        if (z) {
            i2 = arrayList2.size() - 1;
        } else {
            int size2 = arrayList2.size() - 1;
            while (true) {
                int i6 = size2;
                i = size;
                size = i6;
                if (size <= 0) {
                    break;
                }
                if (this.n >= ((f.c) arrayList2.get(size)).b) {
                    break;
                }
                size2 = size - 1;
            }
            int i7 = -1;
            while (i3 < arrayList2.size() && ((f.c) arrayList2.get(i3)).b <= this.o) {
                int i8 = i3;
                i3++;
                i7 = i8;
            }
            i2 = i7;
            size = i;
        }
        return i2 > 0 ? arrayList2.subList(size, i2) : arrayList2;
    }
}
