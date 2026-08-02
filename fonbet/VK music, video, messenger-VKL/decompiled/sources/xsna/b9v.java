package xsna;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: HlsChunkSource.java */
/* loaded from: classes12.dex */
public final class b9v {
    public final e9v a;
    public final androidx.media3.datasource.a b;
    public final androidx.media3.datasource.a c;
    public final e0a d;
    public final Uri[] e;
    public final androidx.media3.common.a[] f;
    public final HlsPlaylistTracker g;
    public final pfp0 h;

    @Nullable
    public final List<androidx.media3.common.a> i;
    public final x1b0 k;
    public boolean l;

    @Nullable
    public BehindLiveWindowException n;

    @Nullable
    public Uri o;

    @Nullable
    public Uri p;
    public boolean q;
    public d7q r;
    public final jws j = new jws();
    public byte[] m = y2r0.b;
    public long s = C.TIME_UNSET;

    /* compiled from: HlsChunkSource.java */
    public static final class a extends vtk {
        public byte[] l;
    }

    /* compiled from: HlsChunkSource.java */
    public static final class b {

        @Nullable
        public ccc a;
        public boolean b;

        @Nullable
        public Uri c;
    }

    /* compiled from: HlsChunkSource.java */
    public static final class c extends sg6 {
        public final List<b.f> e;
        public final long f;

        public c(long j, List list) {
            super(0L, list.size() - 1);
            this.f = j;
            this.e = list;
        }

        @Override // xsna.bq10
        public final long a() {
            c();
            return this.f + this.e.get((int) this.d).f;
        }

        @Override // xsna.bq10
        public final long b() {
            c();
            b.f fVar = this.e.get((int) this.d);
            return this.f + fVar.f + fVar.d;
        }
    }

    /* compiled from: HlsChunkSource.java */
    public static final class d extends lp6 {
        public int g;

        @Override // xsna.d7q
        public final void g(long j, long j2, long j3, List<? extends aq10> list, bq10[] bq10VarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.g, elapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!a(i, elapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // xsna.d7q
        public final int getSelectedIndex() {
            return this.g;
        }

        @Override // xsna.d7q
        @Nullable
        public final Object getSelectionData() {
            return null;
        }

        @Override // xsna.d7q
        public final int getSelectionReason() {
            return 0;
        }
    }

    /* compiled from: HlsChunkSource.java */
    public static final class e {
        public final b.f a;
        public final long b;
        public final int c;
        public final boolean d;

        public e(b.f fVar, long j, int i) {
            this.a = fVar;
            this.b = j;
            this.c = i;
            this.d = (fVar instanceof b.c) && ((b.c) fVar).n;
        }
    }

    public b9v(e9v e9vVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, androidx.media3.common.a[] aVarArr, c9v c9vVar, @Nullable mjp0 mjp0Var, e0a e0aVar, @Nullable List list, x1b0 x1b0Var) {
        this.a = e9vVar;
        this.g = hlsPlaylistTracker;
        this.e = uriArr;
        this.f = aVarArr;
        this.d = e0aVar;
        this.i = list;
        this.k = x1b0Var;
        androidx.media3.datasource.a createDataSource = c9vVar.createDataSource();
        this.b = createDataSource;
        if (mjp0Var != null) {
            createDataSource.addTransferListener(mjp0Var);
        }
        this.c = c9vVar.createDataSource();
        this.h = new pfp0("", aVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((aVarArr[i].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        pfp0 pfp0Var = this.h;
        int[] x = ipx.x(arrayList);
        d dVar = new d(0, pfp0Var, x);
        dVar.g = dVar.b(pfp0Var.d[x[0]]);
        this.r = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static e d(androidx.media3.exoplayer.hls.playlist.b bVar, long j, int i) {
        long j2 = bVar.k;
        ImmutableList immutableList = bVar.s;
        int i2 = (int) (j - j2);
        ImmutableList immutableList2 = bVar.r;
        if (i2 == immutableList2.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i < immutableList.size()) {
                return new e((b.f) immutableList.get(i), j, i);
            }
            return null;
        }
        b.e eVar = (b.e) immutableList2.get(i2);
        if (i == -1) {
            return new e(eVar, j, -1);
        }
        if (i < eVar.n.size()) {
            return new e((b.f) eVar.n.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < immutableList2.size()) {
            return new e((b.f) immutableList2.get(i3), j + 1, -1);
        }
        if (immutableList.isEmpty()) {
            return null;
        }
        return new e((b.f) immutableList.get(0), j + 1, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final bq10[] a(@Nullable h9v h9vVar, long j) {
        List list;
        b9v b9vVar = this;
        h9v h9vVar2 = h9vVar;
        int a2 = h9vVar2 == null ? -1 : b9vVar.h.a(h9vVar2.d);
        int length = b9vVar.r.length();
        bq10[] bq10VarArr = new bq10[length];
        boolean z = false;
        int i = 0;
        while (i < length) {
            int indexInTrackGroup = b9vVar.r.getIndexInTrackGroup(i);
            Uri uri = b9vVar.e[indexInTrackGroup];
            HlsPlaylistTracker hlsPlaylistTracker = b9vVar.g;
            if (hlsPlaylistTracker.H(uri)) {
                androidx.media3.exoplayer.hls.playlist.b B = hlsPlaylistTracker.B(uri, z);
                B.getClass();
                long C = B.h - hlsPlaylistTracker.C();
                Pair<Long, Integer> c2 = b9vVar.c(h9vVar2, indexInTrackGroup != a2 ? true : z, B, C, j);
                long longValue = ((Long) c2.first).longValue();
                int intValue = ((Integer) c2.second).intValue();
                long j2 = B.k;
                ImmutableList immutableList = B.s;
                ImmutableList immutableList2 = B.r;
                int i2 = (int) (longValue - j2);
                if (i2 < 0 || immutableList2.size() < i2) {
                    ImmutableList.b bVar = ImmutableList.c;
                    list = com.google.common.collect.g.f;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (i2 < immutableList2.size()) {
                        if (intValue != -1) {
                            b.e eVar = (b.e) immutableList2.get(i2);
                            if (intValue == 0) {
                                arrayList.add(eVar);
                            } else if (intValue < eVar.n.size()) {
                                ImmutableList immutableList3 = eVar.n;
                                arrayList.addAll(immutableList3.subList(intValue, immutableList3.size()));
                            }
                            i2++;
                        }
                        arrayList.addAll(immutableList2.subList(i2, immutableList2.size()));
                        intValue = 0;
                    }
                    if (B.n != C.TIME_UNSET) {
                        if (intValue == -1) {
                            intValue = 0;
                        }
                        if (intValue < immutableList.size()) {
                            arrayList.addAll(immutableList.subList(intValue, immutableList.size()));
                        }
                    }
                    list = Collections.unmodifiableList(arrayList);
                }
                bq10VarArr[i] = new c(C, list);
            } else {
                bq10VarArr[i] = bq10.a;
            }
            i++;
            b9vVar = this;
            h9vVar2 = h9vVar;
            z = false;
        }
        return bq10VarArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int b(h9v h9vVar) {
        int i = h9vVar.o;
        if (i == -1) {
            return 1;
        }
        androidx.media3.exoplayer.hls.playlist.b B = this.g.B(this.e[this.h.a(h9vVar.d)], false);
        B.getClass();
        ImmutableList immutableList = B.r;
        int i2 = (int) (h9vVar.j - B.k);
        if (i2 < 0) {
            return 1;
        }
        ImmutableList immutableList2 = i2 < immutableList.size() ? ((b.e) immutableList.get(i2)).n : B.s;
        if (i >= immutableList2.size()) {
            return 2;
        }
        b.c cVar = (b.c) immutableList2.get(i);
        if (cVar.n) {
            return 0;
        }
        return Objects.equals(Uri.parse(neq0.c(B.a, cVar.b)), h9vVar.b.a) ? 1 : 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de A[EDGE_INSN: B:58:0x00de->B:60:0x00de BREAK  A[LOOP:0: B:44:0x00b2->B:48:0x00db], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair<Long, Integer> c(@Nullable h9v h9vVar, boolean z, androidx.media3.exoplayer.hls.playlist.b bVar, long j, long j2) {
        ImmutableList immutableList;
        int i;
        boolean z2 = true;
        if (h9vVar != null) {
            long j3 = h9vVar.j;
            int i2 = h9vVar.o;
            if (!z) {
                if (!h9vVar.H) {
                    return new Pair<>(Long.valueOf(j3), Integer.valueOf(i2));
                }
                if (i2 == -1) {
                    j3 = h9vVar.b();
                }
                return new Pair<>(Long.valueOf(j3), Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
            }
        }
        long j4 = bVar.u;
        long j5 = bVar.k;
        ImmutableList immutableList2 = bVar.s;
        ImmutableList immutableList3 = bVar.r;
        long j6 = j + j4;
        long j7 = (h9vVar == null || this.q) ? j2 : h9vVar.g;
        if (!bVar.o && j7 >= j6) {
            return new Pair<>(Long.valueOf(j5 + immutableList3.size()), -1);
        }
        long j8 = j7 - j;
        Long valueOf = Long.valueOf(j8);
        HlsPlaylistTracker hlsPlaylistTracker = this.g;
        if (hlsPlaylistTracker.v() && h9vVar != null) {
            z2 = false;
        }
        int c2 = y2r0.c(immutableList3, valueOf, z2);
        long j9 = c2 + j5;
        if (!hlsPlaylistTracker.v()) {
            return new Pair<>(Long.valueOf(j9), -1);
        }
        if (c2 >= 0) {
            if (!immutableList3.isEmpty()) {
                b.e eVar = (b.e) immutableList3.get(c2);
                if (j8 < eVar.f + eVar.d) {
                    immutableList = eVar.n;
                    i = 0;
                    while (true) {
                        if (i < immutableList.size()) {
                            break;
                        }
                        b.c cVar = (b.c) immutableList.get(i);
                        if (j8 >= cVar.f + cVar.d) {
                            i++;
                        } else if (cVar.m) {
                            j9 += (immutableList != immutableList2 || immutableList3.isEmpty()) ? 0L : 1L;
                            r3 = i;
                        }
                    }
                }
            }
            immutableList = immutableList2;
            i = 0;
            while (true) {
                if (i < immutableList.size()) {
                }
                i++;
            }
        }
        return new Pair<>(Long.valueOf(j9), Integer.valueOf(r3));
    }

    @Nullable
    public final a e(int i, @Nullable Uri uri, boolean z) {
        if (uri == null) {
            return null;
        }
        jws jwsVar = this.j;
        byte[] remove = jwsVar.a.remove(uri);
        if (remove != null) {
            jwsVar.a.put(uri, remove);
            return null;
        }
        evk evkVar = new evk(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 1, null);
        androidx.media3.common.a aVar = this.f[i];
        int selectionReason = this.r.getSelectionReason();
        Object selectionData = this.r.getSelectionData();
        byte[] bArr = this.m;
        a aVar2 = new a(this.c, evkVar, 3, aVar, selectionReason, selectionData, C.TIME_UNSET, C.TIME_UNSET);
        if (bArr == null) {
            bArr = y2r0.b;
        }
        aVar2.j = bArr;
        return aVar2;
    }
}
