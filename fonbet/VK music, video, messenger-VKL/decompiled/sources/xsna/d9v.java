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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: HlsDownloader.java */
/* loaded from: classes12.dex */
public final class d9v extends androidx.media3.exoplayer.offline.f<o9v> {

    /* compiled from: HlsDownloader.java */
    public static final class a extends f.a<o9v> {
        public a(a.b bVar) {
            super(bVar, new HlsPlaylistParser());
        }

        @Override // xsna.e5i0
        public final e5i0 a(long j) {
            this.d = j;
            return this;
        }

        @Override // xsna.e5i0
        public final e5i0 b(long j) {
            this.e = j;
            return this;
        }

        @Override // xsna.e5i0
        public final androidx.media3.exoplayer.offline.f c(kr10 kr10Var) {
            return new d9v(kr10Var, this.b, this.a, this.c, this.d, this.e);
        }

        @Override // xsna.e5i0
        public final e5i0 d(Executor executor) {
            this.c = executor;
            return this;
        }
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
        arrayList.add(new f.c(j, new evk(neq0.d(str, eVar.b), eVar.j, eVar.k, 0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.offline.f
    public final List e(androidx.media3.datasource.cache.a aVar, uer uerVar, boolean z) throws IOException, InterruptedException {
        d9v d9vVar = this;
        boolean z2 = z;
        o9v o9vVar = (o9v) uerVar;
        ArrayList arrayList = new ArrayList();
        if (o9vVar instanceof androidx.media3.exoplayer.hls.playlist.c) {
            List<Uri> list = ((androidx.media3.exoplayer.hls.playlist.c) o9vVar).d;
            for (int i = 0; i < list.size(); i++) {
                arrayList.add(androidx.media3.exoplayer.offline.f.d(list.get(i)));
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
            } catch (IOException e) {
                e = e;
            }
            try {
                androidx.media3.exoplayer.hls.playlist.b bVar = (androidx.media3.exoplayer.hls.playlist.b) ((uer) d9vVar.c(new c5i0(d9vVar, aVar, evkVar), z2));
                ImmutableList immutableList = bVar.r;
                long j = z2 ? 0L : d9vVar.a;
                long j2 = z2 ? C.TIME_UNSET : d9vVar.b;
                b.e eVar = null;
                for (int i2 = 0; i2 < immutableList.size(); i2++) {
                    b.e eVar2 = (b.e) immutableList.get(i2);
                    long j3 = bVar.h + eVar2.f;
                    if (j3 + eVar2.d > j) {
                        if (j2 == C.TIME_UNSET || j3 < j + j2) {
                            b.e eVar3 = eVar2.c;
                            if (eVar3 != null && eVar3 != eVar) {
                                i(bVar, eVar3, hashSet, arrayList2);
                                eVar = eVar3;
                            }
                            i(bVar, eVar2, hashSet, arrayList2);
                        }
                    }
                }
            } catch (IOException e2) {
                e = e2;
                if (!z) {
                    throw e;
                }
                d9vVar = this;
                z2 = z;
            }
            d9vVar = this;
            z2 = z;
        }
        return arrayList2;
    }
}
