package xsna;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.hls.playlist.c;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import androidx.media3.exoplayer.upstream.c;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.dto.music.MusicTrack;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: DefaultHlsMusicTrackPlaylistTracker.java */
/* loaded from: classes3.dex */
public final class sfl implements HlsPlaylistTracker, Loader.a<androidx.media3.exoplayer.upstream.c<o9v>> {
    public final c9v b;
    public final p9v c;
    public final androidx.media3.exoplayer.upstream.b d;

    @Nullable
    public j.a g;

    @Nullable
    public Loader h;

    @Nullable
    public Handler i;

    @Nullable
    public HlsMediaSource j;

    @Nullable
    public androidx.media3.exoplayer.hls.playlist.c k;

    @Nullable
    public Uri l;

    @Nullable
    public androidx.media3.exoplayer.hls.playlist.b m;
    public boolean n;
    public final MusicTrack p;
    public final CopyOnWriteArrayList<HlsPlaylistTracker.b> f = new CopyOnWriteArrayList<>();
    public final HashMap<Uri, b> e = new HashMap<>();
    public long o = C.TIME_UNSET;

    /* compiled from: DefaultHlsMusicTrackPlaylistTracker.java */
    public class a implements HlsPlaylistTracker.b {
        public a() {
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
        public final void b() {
            sfl.this.f.remove(this);
        }

        @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker.b
        public final boolean d(Uri uri, b.c cVar, boolean z) {
            b bVar;
            sfl sflVar = sfl.this;
            HashMap<Uri, b> hashMap = sflVar.e;
            if (sflVar.m == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                androidx.media3.exoplayer.hls.playlist.c cVar2 = sflVar.k;
                String str = y2r0.a;
                List<c.b> list = cVar2.e;
                int i = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    b bVar2 = hashMap.get(list.get(i2).a);
                    if (bVar2 != null && elapsedRealtime < bVar2.i) {
                        i++;
                    }
                }
                b.C0065b a = sflVar.d.a(new b.a(1, 0, sflVar.k.e.size(), i), cVar);
                if (a != null && a.a == 2 && (bVar = hashMap.get(uri)) != null) {
                    b.a(bVar, a.b);
                }
            }
            return false;
        }
    }

    /* compiled from: DefaultHlsMusicTrackPlaylistTracker.java */
    public final class b implements Loader.a<androidx.media3.exoplayer.upstream.c<o9v>> {
        public final Uri b;
        public final Loader c = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final androidx.media3.datasource.a d;

        @Nullable
        public androidx.media3.exoplayer.hls.playlist.b e;
        public long f;
        public long g;
        public long h;
        public long i;
        public boolean j;

        @Nullable
        public IOException k;
        public boolean l;

        public b(Uri uri) {
            this.b = uri;
            this.d = sfl.this.b.createDataSource();
        }

        public static boolean a(b bVar, long j) {
            bVar.i = SystemClock.elapsedRealtime() + j;
            Uri uri = bVar.b;
            sfl sflVar = sfl.this;
            if (!uri.equals(sflVar.l)) {
                return false;
            }
            List<c.b> list = sflVar.k.e;
            int size = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            for (int i = 0; i < size; i++) {
                b bVar2 = sflVar.e.get(list.get(i).a);
                bVar2.getClass();
                if (elapsedRealtime > bVar2.i) {
                    Uri uri2 = bVar2.b;
                    sflVar.l = uri2;
                    bVar2.f(sflVar.a(uri2));
                    return false;
                }
            }
            return true;
        }

        public final Uri b() {
            androidx.media3.exoplayer.hls.playlist.b bVar = this.e;
            Uri uri = this.b;
            if (bVar != null) {
                b.g gVar = bVar.v;
                if (gVar.a != C.TIME_UNSET || gVar.e) {
                    Uri.Builder buildUpon = uri.buildUpon();
                    androidx.media3.exoplayer.hls.playlist.b bVar2 = this.e;
                    if (bVar2.v.e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bVar2.k + bVar2.r.size()));
                        androidx.media3.exoplayer.hls.playlist.b bVar3 = this.e;
                        if (bVar3.n != C.TIME_UNSET) {
                            ImmutableList immutableList = bVar3.s;
                            int size = immutableList.size();
                            if (!immutableList.isEmpty() && ((b.c) sd9.k(immutableList)).n) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    b.g gVar2 = this.e.v;
                    if (gVar2.a != C.TIME_UNSET) {
                        buildUpon.appendQueryParameter("_HLS_skip", gVar2.b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return uri;
        }

        public final void c(boolean z) {
            f(z ? b() : this.b);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void d(androidx.media3.exoplayer.upstream.c<o9v> cVar, long j, long j2) {
            androidx.media3.exoplayer.upstream.c<o9v> cVar2 = cVar;
            o9v o9vVar = cVar2.f;
            evk evkVar = cVar2.b;
            vyk0 vyk0Var = cVar2.d;
            bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
            if (o9vVar instanceof androidx.media3.exoplayer.hls.playlist.b) {
                h((androidx.media3.exoplayer.hls.playlist.b) o9vVar, bpzVar);
                sfl.this.g.e(bpzVar, 4);
            } else {
                ParserException b = ParserException.b(null, "Loaded playlist has unexpected type.");
                this.k = b;
                sfl.this.g.h(bpzVar, 4, b, true);
            }
            sfl.this.d.getClass();
        }

        public final void e(Uri uri) {
            sfl sflVar = sfl.this;
            c.a<o9v> b = sflVar.c.b(sflVar.k, this.e);
            Map map = Collections.EMPTY_MAP;
            String Fb = sflVar.p.Fb();
            fxc0.t(uri, "The uri must be set.");
            androidx.media3.exoplayer.upstream.c cVar = new androidx.media3.exoplayer.upstream.c(this.d, new evk(uri, 0L, 1, null, map, 0L, -1L, null, 1, Fb), 4, b);
            androidx.media3.exoplayer.upstream.b bVar = sflVar.d;
            int i = cVar.c;
            sflVar.g.i(new bpz(this.c.e(cVar, this, bVar.c(i)), cVar.b), i, 0);
        }

        public final void f(Uri uri) {
            this.i = 0L;
            if (this.j) {
                return;
            }
            Loader loader = this.c;
            if (loader.c() || loader.b()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.h;
            if (elapsedRealtime >= j) {
                e(uri);
            } else {
                this.j = true;
                sfl.this.i.postDelayed(new yr2(2, this, uri), j - elapsedRealtime);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final Loader.b g(androidx.media3.exoplayer.upstream.c<o9v> cVar, long j, long j2, IOException iOException, int i) {
            androidx.media3.exoplayer.upstream.c<o9v> cVar2 = cVar;
            long j3 = cVar2.a;
            int i2 = cVar2.c;
            evk evkVar = cVar2.b;
            vyk0 vyk0Var = cVar2.d;
            Uri uri = vyk0Var.c;
            bpz bpzVar = new bpz(evkVar, uri, vyk0Var.d, j, j2, vyk0Var.b);
            boolean z = uri.getQueryParameter("_HLS_msn") != null;
            boolean z2 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            Loader.b bVar = Loader.e;
            sfl sflVar = sfl.this;
            if (z || z2) {
                int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode : Integer.MAX_VALUE;
                if (z2 || i3 == 400 || i3 == 503) {
                    this.h = SystemClock.elapsedRealtime();
                    c(false);
                    j.a aVar = sflVar.g;
                    String str = y2r0.a;
                    aVar.h(bpzVar, i2, iOException, true);
                    return bVar;
                }
            }
            b.c cVar3 = new b.c(iOException, i);
            Iterator<HlsPlaylistTracker.b> it = sflVar.f.iterator();
            boolean z3 = false;
            while (it.hasNext()) {
                z3 |= !it.next().d(this.b, cVar3, false);
            }
            androidx.media3.exoplayer.upstream.b bVar2 = sflVar.d;
            if (z3) {
                long b = bVar2.b(cVar3);
                bVar = b != C.TIME_UNSET ? new Loader.b(0, b) : Loader.f;
            }
            boolean a = bVar.a();
            sflVar.g.h(bpzVar, i2, iOException, !a);
            if (!a) {
                bVar2.getClass();
            }
            return bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:26:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x007d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(androidx.media3.exoplayer.hls.playlist.b bVar, bpz bpzVar) {
            long j;
            ImmutableList immutableList;
            CopyOnWriteArrayList<HlsPlaylistTracker.b> copyOnWriteArrayList;
            long j2;
            int i;
            ImmutableList immutableList2;
            boolean z;
            androidx.media3.exoplayer.hls.playlist.b a;
            IOException playlistStuckException;
            boolean z2;
            long j3;
            androidx.media3.exoplayer.hls.playlist.b bVar2 = this.e;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f = elapsedRealtime;
            sfl sflVar = sfl.this;
            CopyOnWriteArrayList<HlsPlaylistTracker.b> copyOnWriteArrayList2 = sflVar.f;
            boolean c = bVar.c(bVar2);
            ImmutableList immutableList3 = bVar.r;
            long j4 = bVar.k;
            if (c) {
                if (bVar.p) {
                    j = bVar.h;
                } else {
                    androidx.media3.exoplayer.hls.playlist.b bVar3 = sflVar.m;
                    j = bVar3 != null ? bVar3.h : 0L;
                    if (bVar2 != null) {
                        long j5 = bVar2.h;
                        immutableList = immutableList3;
                        long j6 = bVar2.k;
                        ImmutableList immutableList4 = bVar2.r;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        int size = immutableList4.size();
                        int i2 = (int) (j4 - j6);
                        b.e eVar = i2 < immutableList4.size() ? (b.e) immutableList4.get(i2) : null;
                        if (eVar != null) {
                            j2 = eVar.f;
                        } else {
                            if (size == j4 - j6) {
                                j2 = bVar2.u;
                            }
                            if (bVar.i) {
                                i = bVar.j;
                            } else {
                                androidx.media3.exoplayer.hls.playlist.b bVar4 = sflVar.m;
                                i = bVar4 != null ? bVar4.j : 0;
                                if (bVar2 != null) {
                                    int i3 = (int) (j4 - bVar2.k);
                                    ImmutableList immutableList5 = bVar2.r;
                                    b.e eVar2 = i3 < immutableList5.size() ? (b.e) immutableList5.get(i3) : null;
                                    if (eVar2 != null) {
                                        int i4 = bVar2.j + eVar2.e;
                                        immutableList2 = immutableList;
                                        z = false;
                                        i = i4 - ((b.e) immutableList2.get(0)).e;
                                        a = bVar.a(i, j);
                                    }
                                }
                            }
                            immutableList2 = immutableList;
                            z = false;
                            a = bVar.a(i, j);
                        }
                        j = j5 + j2;
                        if (bVar.i) {
                        }
                        immutableList2 = immutableList;
                        z = false;
                        a = bVar.a(i, j);
                    }
                }
                copyOnWriteArrayList = copyOnWriteArrayList2;
                immutableList = immutableList3;
                if (bVar.i) {
                }
                immutableList2 = immutableList;
                z = false;
                a = bVar.a(i, j);
            } else {
                a = bVar.o ? bVar2.b() : bVar2;
                copyOnWriteArrayList = copyOnWriteArrayList2;
                immutableList2 = immutableList3;
                z = false;
            }
            this.e = a;
            Uri uri = this.b;
            if (a != bVar2) {
                this.k = null;
                this.g = elapsedRealtime;
                if (uri.equals(sflVar.l)) {
                    if (sflVar.m == null) {
                        sflVar.n = true ^ a.o;
                        sflVar.o = a.h;
                    }
                    sflVar.m = a;
                    sflVar.j.v(a);
                }
                Iterator<HlsPlaylistTracker.b> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().b();
                }
            } else if (!a.o) {
                long size2 = j4 + immutableList2.size();
                androidx.media3.exoplayer.hls.playlist.b bVar5 = this.e;
                if (size2 < bVar5.k) {
                    playlistStuckException = new HlsPlaylistTracker.PlaylistResetException(uri);
                    z2 = true;
                } else {
                    double d = elapsedRealtime - this.g;
                    long j7 = bVar5.m;
                    UUID uuid = tu8.a;
                    playlistStuckException = d > ((double) y2r0.j0(j7)) * 3.5d ? new HlsPlaylistTracker.PlaylistStuckException(uri) : null;
                    z2 = z;
                }
                if (playlistStuckException != null) {
                    this.k = playlistStuckException;
                    b.c cVar = new b.c(playlistStuckException, 1);
                    Iterator<HlsPlaylistTracker.b> it2 = copyOnWriteArrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().d(uri, cVar, z2);
                    }
                }
            }
            androidx.media3.exoplayer.hls.playlist.b bVar6 = this.e;
            b.g gVar = bVar6.v;
            long j8 = bVar6.m;
            if (gVar.e) {
                if (bVar6 == bVar2) {
                    long j9 = bVar6.n;
                    if (j9 != C.TIME_UNSET) {
                        j3 = j9 / 2;
                    } else {
                        j8 /= 2;
                    }
                } else {
                    j3 = 0;
                }
                this.h = (y2r0.j0(j3) + elapsedRealtime) - bpzVar.e;
                if (this.e.o) {
                    if (uri.equals(sflVar.l) || this.l) {
                        f(b());
                        return;
                    }
                    return;
                }
                return;
            }
            if (bVar6 == bVar2) {
                j8 /= 2;
            }
            j3 = j8;
            this.h = (y2r0.j0(j3) + elapsedRealtime) - bpzVar.e;
            if (this.e.o) {
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void i(androidx.media3.exoplayer.upstream.c<o9v> cVar, long j, long j2, int i) {
            bpz bpzVar;
            androidx.media3.exoplayer.upstream.c<o9v> cVar2 = cVar;
            if (i == 0) {
                long j3 = cVar2.a;
                bpzVar = new bpz(j, cVar2.b);
            } else {
                long j4 = cVar2.a;
                evk evkVar = cVar2.b;
                vyk0 vyk0Var = cVar2.d;
                bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
            }
            sfl.this.g.i(bpzVar, cVar2.c, i);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.a
        public final void j(androidx.media3.exoplayer.upstream.c<o9v> cVar, long j, long j2, boolean z) {
            androidx.media3.exoplayer.upstream.c<o9v> cVar2 = cVar;
            long j3 = cVar2.a;
            evk evkVar = cVar2.b;
            vyk0 vyk0Var = cVar2.d;
            bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
            sfl sflVar = sfl.this;
            sflVar.d.getClass();
            sflVar.g.c(bpzVar, 4);
        }
    }

    public sfl(MusicTrack musicTrack, c9v c9vVar, androidx.media3.exoplayer.upstream.b bVar, p9v p9vVar) {
        this.p = musicTrack;
        this.b = c9vVar;
        this.c = p9vVar;
        this.d = bVar;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void A() throws IOException {
        Loader loader = this.h;
        if (loader != null) {
            loader.maybeThrowError();
        }
        Uri uri = this.l;
        if (uri != null) {
            F(uri);
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    @Nullable
    public final androidx.media3.exoplayer.hls.playlist.b B(Uri uri, boolean z) {
        HashMap<Uri, b> hashMap = this.e;
        androidx.media3.exoplayer.hls.playlist.b bVar = hashMap.get(uri).e;
        if (bVar != null && z) {
            if (!uri.equals(this.l)) {
                List<c.b> list = this.k.e;
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    if (uri.equals(list.get(i).a)) {
                        androidx.media3.exoplayer.hls.playlist.b bVar2 = this.m;
                        if (bVar2 == null || !bVar2.o) {
                            this.l = uri;
                            b bVar3 = hashMap.get(uri);
                            androidx.media3.exoplayer.hls.playlist.b bVar4 = bVar3.e;
                            if (bVar4 == null || !bVar4.o) {
                                bVar3.f(a(uri));
                            } else {
                                this.m = bVar4;
                                this.j.v(bVar4);
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
            b bVar5 = hashMap.get(uri);
            androidx.media3.exoplayer.hls.playlist.b bVar6 = bVar5.e;
            if (!bVar5.l) {
                bVar5.l = true;
                if (bVar6 != null && !bVar6.o) {
                    bVar5.c(true);
                }
            }
        }
        return bVar;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final long C() {
        return this.o;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean D(long j, Uri uri) {
        if (this.e.get(uri) != null) {
            return !b.a(r4, j);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void E(j9v j9vVar) {
        this.f.add(j9vVar);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void F(Uri uri) throws IOException {
        b bVar = this.e.get(uri);
        bVar.c.maybeThrowError();
        IOException iOException = bVar.k;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void G(Uri uri) {
        this.e.get(uri).c(true);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean H(Uri uri) {
        int i;
        b bVar = this.e.get(uri);
        if (bVar.e == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = bVar.e.u;
        UUID uuid = tu8.a;
        long max = Math.max(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS, y2r0.j0(j));
        androidx.media3.exoplayer.hls.playlist.b bVar2 = bVar.e;
        return bVar2.o || (i = bVar2.d) == 2 || i == 1 || bVar.f + max > elapsedRealtime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Uri a(Uri uri) {
        b.d dVar;
        androidx.media3.exoplayer.hls.playlist.b bVar = this.m;
        if (bVar == null || !bVar.v.e || (dVar = (b.d) bVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(dVar.b));
        int i = dVar.c;
        if (i != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return buildUpon.build();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void d(androidx.media3.exoplayer.upstream.c<o9v> cVar, long j, long j2) {
        androidx.media3.exoplayer.hls.playlist.c cVar2;
        androidx.media3.exoplayer.upstream.c<o9v> cVar3 = cVar;
        o9v o9vVar = cVar3.f;
        boolean z = o9vVar instanceof androidx.media3.exoplayer.hls.playlist.b;
        if (z) {
            String str = o9vVar.a;
            androidx.media3.exoplayer.hls.playlist.c cVar4 = androidx.media3.exoplayer.hls.playlist.c.n;
            List singletonList = Collections.singletonList(c.b.b(Uri.parse(str)));
            List list = Collections.EMPTY_LIST;
            cVar2 = new androidx.media3.exoplayer.hls.playlist.c("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            cVar2 = (androidx.media3.exoplayer.hls.playlist.c) o9vVar;
        }
        this.k = cVar2;
        this.l = cVar2.e.get(0).a;
        this.f.add(new a());
        List<Uri> list2 = cVar2.d;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list2.get(i);
            this.e.put(uri, new b(uri));
        }
        evk evkVar = cVar3.b;
        vyk0 vyk0Var = cVar3.d;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        b bVar = this.e.get(this.l);
        if (z) {
            bVar.h((androidx.media3.exoplayer.hls.playlist.b) o9vVar, bpzVar);
        } else {
            bVar.c(false);
        }
        this.d.getClass();
        this.g.e(bpzVar, 4);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b g(androidx.media3.exoplayer.upstream.c<o9v> cVar, long j, long j2, IOException iOException, int i) {
        androidx.media3.exoplayer.upstream.c<o9v> cVar2 = cVar;
        long j3 = cVar2.a;
        evk evkVar = cVar2.b;
        vyk0 vyk0Var = cVar2.d;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        int i2 = cVar2.c;
        long b2 = this.d.b(new b.c(iOException, i));
        boolean z = b2 == C.TIME_UNSET;
        this.g.h(bpzVar, i2, iOException, z);
        return z ? Loader.f : new Loader.b(0, b2);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void i(androidx.media3.exoplayer.upstream.c<o9v> cVar, long j, long j2, int i) {
        bpz bpzVar;
        androidx.media3.exoplayer.upstream.c<o9v> cVar2 = cVar;
        if (i == 0) {
            long j3 = cVar2.a;
            bpzVar = new bpz(j, cVar2.b);
        } else {
            long j4 = cVar2.a;
            evk evkVar = cVar2.b;
            vyk0 vyk0Var = cVar2.d;
            bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        }
        this.g.i(bpzVar, cVar2.c, i);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void j(androidx.media3.exoplayer.upstream.c<o9v> cVar, long j, long j2, boolean z) {
        androidx.media3.exoplayer.upstream.c<o9v> cVar2 = cVar;
        long j3 = cVar2.a;
        evk evkVar = cVar2.b;
        vyk0 vyk0Var = cVar2.d;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        this.d.getClass();
        this.g.c(bpzVar, 4);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void stop() {
        this.l = null;
        this.m = null;
        this.k = null;
        this.o = C.TIME_UNSET;
        this.h.d(null);
        this.h = null;
        HashMap<Uri, b> hashMap = this.e;
        Iterator<b> it = hashMap.values().iterator();
        while (it.hasNext()) {
            it.next().c.d(null);
        }
        this.i.removeCallbacksAndMessages(null);
        this.i = null;
        hashMap.clear();
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final boolean v() {
        return this.n;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void w(Uri uri, j.a aVar, HlsMediaSource hlsMediaSource) {
        this.i = y2r0.o(null);
        this.g = aVar;
        this.j = hlsMediaSource;
        androidx.media3.datasource.a createDataSource = this.b.createDataSource();
        Map map = Collections.EMPTY_MAP;
        String Fb = this.p.Fb();
        fxc0.t(uri, "The uri must be set.");
        androidx.media3.exoplayer.upstream.c cVar = new androidx.media3.exoplayer.upstream.c(createDataSource, new evk(uri, 0L, 1, null, map, 0L, -1L, null, 1, Fb), 4, this.c.a());
        fxc0.z(this.h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.h = loader;
        androidx.media3.exoplayer.upstream.b bVar = this.d;
        int i = cVar.c;
        aVar.i(new bpz(loader.e(cVar, this, bVar.c(i)), cVar.b), i, 0);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void x(j9v j9vVar) {
        this.f.remove(j9vVar);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    public final void y(Uri uri) {
        b bVar = this.e.get(uri);
        if (bVar != null) {
            bVar.l = false;
        }
    }

    @Override // androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker
    @Nullable
    public final androidx.media3.exoplayer.hls.playlist.c z() {
        return this.k;
    }
}
