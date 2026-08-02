package xsna;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.a;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.a;
import androidx.media3.exoplayer.f;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import androidx.media3.exoplayer.hls.playlist.b;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.j;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.b9v;
import xsna.fi20;
import xsna.j9v;
import xsna.rgp0;

/* compiled from: HlsSampleStreamWrapper.java */
/* loaded from: classes12.dex */
public final class r9v implements Loader.a<ccc>, Loader.e, androidx.media3.exoplayer.source.q, rgq, p.c {
    public static final Set<Integer> Z = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    public a A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public int F;
    public androidx.media3.common.a G;

    @Nullable
    public androidx.media3.common.a H;
    public boolean I;
    public qfp0 J;
    public Set<pfp0> K;
    public int[] L;
    public int M;
    public boolean N;
    public boolean[] O;
    public boolean[] P;
    public long Q;
    public long R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public long W;

    @Nullable
    public DrmInitData X;

    @Nullable
    public h9v Y;
    public final String b;
    public final int c;
    public final j9v.a d;
    public final b9v e;
    public final xu1 f;

    @Nullable
    public final androidx.media3.common.a g;
    public final androidx.media3.exoplayer.drm.b h;
    public final a.C0054a i;
    public final androidx.media3.exoplayer.upstream.b j;
    public final Loader k;
    public final j.a l;
    public final int m;
    public final b9v.b n;
    public final ArrayList<h9v> o;
    public final List<h9v> p;
    public final yn2 q;
    public final g0 r;
    public final Handler s;
    public final ArrayList<q9v> t;
    public final Map<String, DrmInitData> u;

    @Nullable
    public ccc v;
    public b[] w;
    public int[] x;
    public final HashSet y;
    public final SparseIntArray z;

    /* compiled from: HlsSampleStreamWrapper.java */
    public static class a implements rgp0 {
        public static final androidx.media3.common.a f;
        public static final androidx.media3.common.a g;
        public final rgp0 a;
        public final androidx.media3.common.a b;
        public androidx.media3.common.a c;
        public byte[] d;
        public int e;

        static {
            a.C0043a c0043a = new a.C0043a();
            c0043a.m = io20.q(MimeTypes.APPLICATION_ID3);
            f = new androidx.media3.common.a(c0043a);
            a.C0043a c0043a2 = new a.C0043a();
            c0043a2.m = io20.q(MimeTypes.APPLICATION_EMSG);
            g = new androidx.media3.common.a(c0043a2);
        }

        public a(rgp0 rgp0Var, int i) {
            this.a = rgp0Var;
            if (i == 1) {
                this.b = f;
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(lhg.a(i, "Unknown metadataType: "));
                }
                this.b = g;
            }
            this.d = new byte[0];
            this.e = 0;
        }

        @Override // xsna.rgp0
        public final void a(long j, int i, int i2, int i3, @Nullable rgp0.a aVar) {
            this.c.getClass();
            int i4 = this.e - i3;
            xi90 xi90Var = new xi90(Arrays.copyOfRange(this.d, i4 - i2, i4));
            byte[] bArr = this.d;
            System.arraycopy(bArr, i4, bArr, 0, i3);
            this.e = i3;
            String str = this.c.n;
            androidx.media3.common.a aVar2 = this.b;
            String str2 = aVar2.n;
            String str3 = aVar2.n;
            if (!Objects.equals(str, str2)) {
                if (!MimeTypes.APPLICATION_EMSG.equals(this.c.n)) {
                    ahn.F("Ignoring sample for unsupported format: " + this.c.n);
                    return;
                }
                g0q q = h0q.q(xi90Var);
                androidx.media3.common.a b = q.b();
                if (b == null || !Objects.equals(str3, b.n)) {
                    ahn.F("Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + q.b());
                    return;
                }
                byte[] a = q.a();
                a.getClass();
                xi90Var = new xi90(a);
            }
            int a2 = xi90Var.a();
            rgp0 rgp0Var = this.a;
            rgp0Var.d(a2, xi90Var);
            rgp0Var.a(j, i, a2, 0, aVar);
        }

        @Override // xsna.rgp0
        public final void b(xi90 xi90Var, int i, int i2) {
            int i3 = this.e + i;
            byte[] bArr = this.d;
            if (bArr.length < i3) {
                this.d = Arrays.copyOf(bArr, (i3 / 2) + i3);
            }
            xi90Var.n(this.d, this.e, i);
            this.e += i;
        }

        @Override // xsna.rgp0
        public final void c(androidx.media3.common.a aVar) {
            this.c = aVar;
            this.a.c(this.b);
        }

        @Override // xsna.rgp0
        public final int f(suk sukVar, int i, boolean z) throws IOException {
            int i2 = this.e + i;
            byte[] bArr = this.d;
            if (bArr.length < i2) {
                this.d = Arrays.copyOf(bArr, (i2 / 2) + i2);
            }
            int read = sukVar.read(this.d, this.e, i);
            if (read != -1) {
                this.e += read;
                return read;
            }
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
    }

    /* compiled from: HlsSampleStreamWrapper.java */
    public static final class b extends androidx.media3.exoplayer.source.p {
        public final Map<String, DrmInitData> H;

        @Nullable
        public DrmInitData I;

        public b() {
            throw null;
        }

        public b(xu1 xu1Var, androidx.media3.exoplayer.drm.b bVar, a.C0054a c0054a, Map map) {
            super(xu1Var, bVar, c0054a);
            this.H = map;
        }

        @Override // androidx.media3.exoplayer.source.p
        public final androidx.media3.common.a p(androidx.media3.common.a aVar) {
            DrmInitData drmInitData;
            DrmInitData drmInitData2 = this.I;
            if (drmInitData2 == null) {
                drmInitData2 = aVar.r;
            }
            if (drmInitData2 != null && (drmInitData = this.H.get(drmInitData2.d)) != null) {
                drmInitData2 = drmInitData;
            }
            fi20 fi20Var = aVar.l;
            fi20 fi20Var2 = null;
            if (fi20Var != null) {
                fi20.a[] aVarArr = fi20Var.a;
                int length = aVarArr.length;
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    fi20.a aVar2 = aVarArr[i2];
                    if ((aVar2 instanceof kcd0) && "com.apple.streaming.transportStreamTimestamp".equals(((kcd0) aVar2).b)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    if (length != 1) {
                        fi20.a[] aVarArr2 = new fi20.a[length - 1];
                        while (i < length) {
                            if (i != i2) {
                                aVarArr2[i < i2 ? i : i - 1] = aVarArr[i];
                            }
                            i++;
                        }
                        fi20Var2 = new fi20(aVarArr2);
                    }
                }
                if (drmInitData2 == aVar.r || fi20Var != aVar.l) {
                    a.C0043a a = aVar.a();
                    a.q = drmInitData2;
                    a.k = fi20Var;
                    aVar = new androidx.media3.common.a(a);
                }
                return super.p(aVar);
            }
            fi20Var = fi20Var2;
            if (drmInitData2 == aVar.r) {
            }
            a.C0043a a2 = aVar.a();
            a2.q = drmInitData2;
            a2.k = fi20Var;
            aVar = new androidx.media3.common.a(a2);
            return super.p(aVar);
        }
    }

    public r9v(String str, int i, j9v.a aVar, b9v b9vVar, Map map, xu1 xu1Var, long j, @Nullable androidx.media3.common.a aVar2, androidx.media3.exoplayer.drm.b bVar, a.C0054a c0054a, androidx.media3.exoplayer.upstream.b bVar2, j.a aVar3, int i2, @Nullable gtf0 gtf0Var) {
        this.b = str;
        this.c = i;
        this.d = aVar;
        this.e = b9vVar;
        this.u = map;
        this.f = xu1Var;
        this.g = aVar2;
        this.h = bVar;
        this.i = c0054a;
        this.j = bVar2;
        this.l = aVar3;
        this.m = i2;
        this.k = gtf0Var != null ? new Loader(gtf0Var) : new Loader("Loader:HlsSampleStreamWrapper");
        b9v.b bVar3 = new b9v.b();
        bVar3.a = null;
        bVar3.b = false;
        bVar3.c = null;
        this.n = bVar3;
        this.x = new int[0];
        Set<Integer> set = Z;
        this.y = new HashSet(set.size());
        this.z = new SparseIntArray(set.size());
        this.w = new b[0];
        this.P = new boolean[0];
        this.O = new boolean[0];
        ArrayList<h9v> arrayList = new ArrayList<>();
        this.o = arrayList;
        this.p = Collections.unmodifiableList(arrayList);
        this.t = new ArrayList<>();
        this.q = new yn2(this, 7);
        this.r = new g0(this, 13);
        this.s = y2r0.o(null);
        this.Q = j;
        this.R = j;
    }

    public static k0n n(int i, int i2) {
        ahn.F("Unmapped track with id " + i + " of type " + i2);
        return new k0n();
    }

    public static androidx.media3.common.a p(@Nullable androidx.media3.common.a aVar, androidx.media3.common.a aVar2, boolean z) {
        String c;
        if (aVar == null) {
            return aVar2;
        }
        String str = aVar.k;
        String str2 = aVar2.n;
        int i = io20.i(str2);
        if (y2r0.v(i, str) == 1) {
            c = y2r0.w(str, i);
            str2 = io20.e(c);
        } else {
            c = io20.c(str, str2);
        }
        a.C0043a a2 = aVar2.a();
        a2.a = aVar.a;
        a2.b = aVar.b;
        a2.c = ImmutableList.m(aVar.c);
        a2.d = aVar.d;
        a2.e = aVar.e;
        a2.f = aVar.f;
        a2.h = z ? aVar.h : -1;
        a2.i = z ? aVar.i : -1;
        a2.j = c;
        if (i == 2) {
            a2.t = aVar.u;
            a2.u = aVar.v;
            a2.x = aVar.y;
        }
        if (str2 != null) {
            a2.q(str2);
        }
        int i2 = aVar.F;
        if (i2 != -1 && i == 1) {
            a2.E = i2;
        }
        fi20 fi20Var = aVar.l;
        if (fi20Var != null) {
            fi20 fi20Var2 = aVar2.l;
            if (fi20Var2 != null) {
                fi20Var = fi20Var2.b(fi20Var);
            }
            a2.k = fi20Var;
        }
        return new androidx.media3.common.a(a2);
    }

    public static int s(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // androidx.media3.exoplayer.source.p.c
    public final void b() {
        this.s.post(this.q);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void d(ccc cccVar, long j, long j2) {
        ccc cccVar2 = cccVar;
        this.v = null;
        if (cccVar2 instanceof b9v.a) {
            b9v.a aVar = (b9v.a) cccVar2;
            byte[] bArr = aVar.j;
            b9v b9vVar = this.e;
            b9vVar.m = bArr;
            jws jwsVar = b9vVar.j;
            Uri uri = aVar.b.a;
            byte[] bArr2 = aVar.l;
            bArr2.getClass();
            iws iwsVar = jwsVar.a;
            uri.getClass();
            iwsVar.put(uri, bArr2);
        }
        long j3 = cccVar2.a;
        evk evkVar = cccVar2.b;
        vyk0 vyk0Var = cccVar2.i;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        this.j.getClass();
        this.l.f(bpzVar, cccVar2.c, this.c, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h);
        if (this.E) {
            this.d.d(this);
            return;
        }
        f.a aVar2 = new f.a();
        aVar2.a = this.Q;
        k(new androidx.media3.exoplayer.f(aVar2));
    }

    @Override // xsna.rgq
    public final void endTracks() {
        this.V = true;
        this.s.post(this.r);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final Loader.b g(ccc cccVar, long j, long j2, IOException iOException, int i) {
        boolean z;
        Loader.b bVar;
        int i2;
        ccc cccVar2 = cccVar;
        boolean z2 = cccVar2 instanceof h9v;
        if (z2 && !((h9v) cccVar2).g() && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i2 = ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode) == 410 || i2 == 404)) {
            return Loader.d;
        }
        long j3 = cccVar2.i.b;
        evk evkVar = cccVar2.b;
        vyk0 vyk0Var = cccVar2.i;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, j3);
        y2r0.j0(cccVar2.g);
        y2r0.j0(cccVar2.h);
        b.c cVar = new b.c(iOException, i);
        b9v b9vVar = this.e;
        b.a b2 = bhp0.b(b9vVar.r);
        androidx.media3.exoplayer.upstream.b bVar2 = this.j;
        b.C0065b a2 = bVar2.a(b2, cVar);
        if (a2 == null || a2.a != 2) {
            z = false;
        } else {
            long j4 = a2.b;
            d7q d7qVar = b9vVar.r;
            z = d7qVar.d(d7qVar.indexOf(b9vVar.h.a(cccVar2.d)), j4);
        }
        if (z) {
            if (z2 && j3 == 0) {
                ArrayList<h9v> arrayList = this.o;
                fxc0.z(arrayList.remove(arrayList.size() - 1) == cccVar2);
                if (arrayList.isEmpty()) {
                    this.R = this.Q;
                } else {
                    ((h9v) sd9.k(arrayList)).J = true;
                }
            }
            bVar = Loader.e;
        } else {
            long b3 = bVar2.b(cVar);
            bVar = b3 != C.TIME_UNSET ? new Loader.b(0, b3) : Loader.f;
        }
        Loader.b bVar3 = bVar;
        boolean a3 = bVar3.a();
        this.l.g(bpzVar, cccVar2.c, this.c, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h, iOException, !a3);
        if (!a3) {
            this.v = null;
        }
        if (z) {
            if (!this.E) {
                f.a aVar = new f.a();
                aVar.a = this.Q;
                k(new androidx.media3.exoplayer.f(aVar));
                return bVar3;
            }
            this.d.d(this);
        }
        return bVar3;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        if (this.U) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.R;
        }
        long j = this.Q;
        h9v r = r();
        if (!r.H) {
            ArrayList<h9v> arrayList = this.o;
            r = arrayList.size() > 1 ? (h9v) xy9.b(2, arrayList) : null;
        }
        if (r != null) {
            j = Math.max(j, r.h);
        }
        if (this.D) {
            for (b bVar : this.w) {
                j = Math.max(j, bVar.q());
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        if (t()) {
            return this.R;
        }
        if (this.U) {
            return Long.MIN_VALUE;
        }
        return r().h;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void i(ccc cccVar, long j, long j2, int i) {
        bpz bpzVar;
        ccc cccVar2 = cccVar;
        if (i == 0) {
            long j3 = cccVar2.a;
            bpzVar = new bpz(j, cccVar2.b);
        } else {
            long j4 = cccVar2.a;
            evk evkVar = cccVar2.b;
            vyk0 vyk0Var = cccVar2.i;
            bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        }
        this.l.j(bpzVar, cccVar2.c, this.c, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h, i);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        return this.k.c();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.a
    public final void j(ccc cccVar, long j, long j2, boolean z) {
        ccc cccVar2 = cccVar;
        this.v = null;
        long j3 = cccVar2.a;
        evk evkVar = cccVar2.b;
        vyk0 vyk0Var = cccVar2.i;
        bpz bpzVar = new bpz(evkVar, vyk0Var.c, vyk0Var.d, j, j2, vyk0Var.b);
        this.j.getClass();
        this.l.d(bpzVar, cccVar2.c, this.c, cccVar2.d, cccVar2.e, cccVar2.f, cccVar2.g, cccVar2.h);
        if (z) {
            return;
        }
        if (t() || this.F == 0) {
            x();
        }
        if (this.F > 0) {
            this.d.d(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d0  */
    @Override // androidx.media3.exoplayer.source.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        long max;
        long j;
        List<h9v> list;
        b9v.b bVar;
        long j2;
        long j3;
        long C;
        b9v.b bVar2;
        long j4;
        h9v h9vVar;
        androidx.media3.exoplayer.hls.playlist.b bVar3;
        Uri uri;
        b9v b9vVar;
        b9v.e d;
        long j5;
        boolean z;
        List<androidx.media3.common.a> list2;
        boolean z2;
        jws jwsVar;
        byte[] bArr;
        Loader loader;
        boolean z3;
        byte[] bArr2;
        androidx.media3.datasource.a aVar;
        b.e eVar;
        b9v.b bVar4;
        x1b0 x1b0Var;
        evk evkVar;
        androidx.media3.datasource.a aVar2;
        boolean z4;
        zrv zrvVar;
        xi90 xi90Var;
        i9v i9vVar;
        txo0 txo0Var;
        byte[] bArr3;
        androidx.media3.datasource.a aVar3;
        String str;
        if (!this.U) {
            Loader loader2 = this.k;
            if (!loader2.c() && !loader2.b()) {
                if (t()) {
                    List<h9v> list3 = Collections.EMPTY_LIST;
                    max = this.R;
                    for (b bVar5 : this.w) {
                        bVar5.t = this.R;
                    }
                    list = list3;
                    j = max;
                } else {
                    h9v r = r();
                    boolean z5 = r.H;
                    long j6 = r.g;
                    if (z5 && r.g()) {
                        long j7 = r.K;
                        max = j7 != C.TIME_UNSET ? j6 + j7 : -9223372036854775807L;
                    } else {
                        max = Math.max(this.Q, j6);
                    }
                    long j8 = this.Q;
                    boolean z6 = this.D;
                    List<h9v> list4 = this.p;
                    if (z6) {
                        for (b bVar6 : this.w) {
                            j8 = Math.max(j8, bVar6.r());
                        }
                    }
                    j = j8;
                    list = list4;
                }
                b9v.b bVar7 = this.n;
                bVar7.a = null;
                bVar7.b = false;
                bVar7.c = null;
                boolean z7 = this.E || !list.isEmpty();
                b9v b9vVar2 = this.e;
                jws jwsVar2 = b9vVar2.j;
                Uri[] uriArr = b9vVar2.e;
                HlsPlaylistTracker hlsPlaylistTracker = b9vVar2.g;
                h9v h9vVar2 = list.isEmpty() ? null : (h9v) sd9.k(list);
                int a2 = h9vVar2 == null ? -1 : b9vVar2.h.a(h9vVar2.d);
                long j9 = fVar.a;
                long j10 = max - j9;
                long j11 = b9vVar2.s;
                long j12 = j11 != C.TIME_UNSET ? j11 - j9 : -9223372036854775807L;
                if (h9vVar2 == null || b9vVar2.q) {
                    bVar = bVar7;
                    j2 = j9;
                } else {
                    long a3 = h9vVar2.a();
                    bVar = bVar7;
                    j2 = j9;
                    j10 = Math.max(0L, j10 - a3);
                    if (j12 != C.TIME_UNSET) {
                        j12 = Math.max(0L, j12 - a3);
                    }
                }
                long j13 = max;
                h9v h9vVar3 = h9vVar2;
                b9vVar2.r.g(j2, j10, j12, list, b9vVar2.a(h9vVar2, max));
                int selectedIndexInTrackGroup = b9vVar2.r.getSelectedIndexInTrackGroup();
                int i = a2;
                boolean z8 = a2 != selectedIndexInTrackGroup;
                Uri uri2 = uriArr[selectedIndexInTrackGroup];
                if (hlsPlaylistTracker.H(uri2)) {
                    b9v.b bVar8 = bVar;
                    androidx.media3.exoplayer.hls.playlist.b B = hlsPlaylistTracker.B(uri2, true);
                    B.getClass();
                    long j14 = B.h;
                    b9vVar2.q = B.c;
                    if (B.o) {
                        j3 = j13;
                        C = -9223372036854775807L;
                    } else {
                        j3 = j13;
                        C = (B.u + j14) - hlsPlaylistTracker.C();
                    }
                    b9vVar2.s = C;
                    long C2 = j14 - hlsPlaylistTracker.C();
                    bVar2 = bVar8;
                    long j15 = j3;
                    Pair<Long, Integer> c = b9vVar2.c(h9vVar3, z8, B, C2, j15);
                    long longValue = ((Long) c.first).longValue();
                    int intValue = ((Integer) c.second).intValue();
                    if (z8 && h9vVar3 != null) {
                        j4 = C2;
                        if (longValue < B.k || ((d = b9v.d(B, longValue, intValue)) != null && j4 + d.a.f < j)) {
                            Uri uri3 = uriArr[i];
                            androidx.media3.exoplayer.hls.playlist.b B2 = hlsPlaylistTracker.B(uri3, true);
                            B2.getClass();
                            long C3 = B2.h - hlsPlaylistTracker.C();
                            Pair<Long, Integer> c2 = b9vVar2.c(h9vVar3, false, B2, C3, j15);
                            h9vVar = h9vVar3;
                            long longValue2 = ((Long) c2.first).longValue();
                            j4 = C3;
                            selectedIndexInTrackGroup = i;
                            bVar3 = B2;
                            uri = uri3;
                            intValue = ((Integer) c2.second).intValue();
                            b9vVar = b9vVar2;
                            longValue = longValue2;
                            String str2 = bVar3.a;
                            boolean z9 = bVar3.c;
                            j5 = bVar3.k;
                            ImmutableList immutableList = bVar3.r;
                            if (selectedIndexInTrackGroup != i && i != -1) {
                                hlsPlaylistTracker.y(uriArr[i]);
                            }
                            if (longValue >= j5) {
                                b9vVar.n = new BehindLiveWindowException();
                            } else {
                                b9v.e d2 = b9v.d(bVar3, longValue, intValue);
                                if (d2 == null) {
                                    if (!bVar3.o) {
                                        bVar2.c = uri;
                                        b9vVar.p = uri;
                                    } else if (z7 || immutableList.isEmpty()) {
                                        bVar2.b = true;
                                    } else {
                                        d2 = new b9v.e((b.f) sd9.k(immutableList), (j5 + immutableList.size()) - 1, -1);
                                    }
                                }
                                boolean z10 = d2.d;
                                b.f fVar2 = d2.a;
                                b9vVar.p = null;
                                SystemClock.elapsedRealtime();
                                b.e eVar2 = fVar2.c;
                                long j16 = fVar2.f;
                                Uri d3 = (eVar2 == null || (str = eVar2.h) == null) ? null : neq0.d(str2, str);
                                b9v.a e = b9vVar.e(selectedIndexInTrackGroup, d3, true);
                                bVar2.a = e;
                                if (e == null) {
                                    String str3 = fVar2.h;
                                    Uri d4 = str3 == null ? null : neq0.d(str2, str3);
                                    b9v.a e2 = b9vVar.e(selectedIndexInTrackGroup, d4, false);
                                    bVar2.a = e2;
                                    if (e2 == null) {
                                        boolean z11 = fVar2 instanceof b.c ? ((b.c) fVar2).m || (d2.c == 0 && z9) : z9;
                                        if (h9vVar == null) {
                                            AtomicInteger atomicInteger = h9v.M;
                                        } else if (!uri.equals(h9vVar.m) || !h9vVar.H) {
                                            long j17 = j4 + j16;
                                            if (!z11 || j17 < j15) {
                                                z = true;
                                                if (z || !z10) {
                                                    e9v e9vVar = b9vVar.a;
                                                    androidx.media3.datasource.a aVar4 = b9vVar.b;
                                                    androidx.media3.common.a aVar5 = b9vVar.f[selectedIndexInTrackGroup];
                                                    List<androidx.media3.common.a> list5 = b9vVar.i;
                                                    int selectionReason = b9vVar.r.getSelectionReason();
                                                    Object selectionData = b9vVar.r.getSelectionData();
                                                    boolean z12 = b9vVar.l;
                                                    e0a e0aVar = b9vVar.d;
                                                    if (d4 != null) {
                                                        jwsVar2.getClass();
                                                        list2 = list5;
                                                        z2 = z12;
                                                        jwsVar = jwsVar2;
                                                        bArr = null;
                                                    } else {
                                                        list2 = list5;
                                                        z2 = z12;
                                                        jwsVar = jwsVar2;
                                                        bArr = jwsVar.a.get(d4);
                                                    }
                                                    byte[] bArr4 = d3 != null ? null : jwsVar.a.get(d3);
                                                    x1b0 x1b0Var2 = b9vVar.k;
                                                    AtomicInteger atomicInteger2 = h9v.M;
                                                    Map map = Collections.EMPTY_MAP;
                                                    Uri d5 = neq0.d(str2, fVar2.b);
                                                    loader = loader2;
                                                    long j18 = fVar2.j;
                                                    long j19 = fVar2.k;
                                                    int i2 = !z10 ? 8 : 0;
                                                    fxc0.t(d5, "The uri must be set.");
                                                    evk evkVar2 = new evk(d5, 0L, 1, null, map, j18, j19, null, i2, null);
                                                    z3 = bArr == null;
                                                    if (z3) {
                                                        bArr2 = null;
                                                    } else {
                                                        String str4 = fVar2.i;
                                                        str4.getClass();
                                                        bArr2 = h9v.e(str4);
                                                    }
                                                    if (bArr == null) {
                                                        bArr2.getClass();
                                                        aVar = new e51(aVar4, bArr, bArr2);
                                                    } else {
                                                        aVar = aVar4;
                                                    }
                                                    eVar = fVar2.c;
                                                    if (eVar == null) {
                                                        boolean z13 = bArr4 != null;
                                                        if (z13) {
                                                            String str5 = eVar.i;
                                                            str5.getClass();
                                                            bArr3 = h9v.e(str5);
                                                        } else {
                                                            bArr3 = null;
                                                        }
                                                        boolean z14 = z13;
                                                        Uri d6 = neq0.d(str2, eVar.b);
                                                        bVar4 = bVar2;
                                                        x1b0Var = x1b0Var2;
                                                        long j20 = eVar.j;
                                                        long j21 = eVar.k;
                                                        fxc0.t(d6, "The uri must be set.");
                                                        evk evkVar3 = new evk(d6, 0L, 1, null, map, j20, j21, null, 0, null);
                                                        if (bArr4 != null) {
                                                            bArr3.getClass();
                                                            aVar3 = new e51(aVar4, bArr4, bArr3);
                                                        } else {
                                                            aVar3 = aVar4;
                                                        }
                                                        z4 = z14;
                                                        aVar2 = aVar3;
                                                        evkVar = evkVar3;
                                                    } else {
                                                        bVar4 = bVar2;
                                                        x1b0Var = x1b0Var2;
                                                        evkVar = null;
                                                        aVar2 = null;
                                                        z4 = false;
                                                    }
                                                    long j22 = j4 + j16;
                                                    long j23 = j22 + fVar2.d;
                                                    int i3 = bVar3.j + fVar2.e;
                                                    if (h9vVar == null) {
                                                        evk evkVar4 = h9vVar.q;
                                                        boolean z15 = evkVar == evkVar4 || (evkVar != null && evkVar4 != null && evkVar.a.equals(evkVar4.a) && evkVar.g == evkVar4.g);
                                                        boolean z16 = uri.equals(h9vVar.m) && h9vVar.H;
                                                        zrvVar = h9vVar.y;
                                                        xi90Var = h9vVar.z;
                                                        i9vVar = (z15 && z16 && !h9vVar.J && h9vVar.l == i3) ? h9vVar.C : null;
                                                    } else {
                                                        zrvVar = new zrv(null);
                                                        xi90Var = new xi90(10);
                                                        i9vVar = null;
                                                    }
                                                    zrv zrvVar2 = zrvVar;
                                                    xi90 xi90Var2 = xi90Var;
                                                    long j24 = d2.b;
                                                    int i4 = d2.c;
                                                    boolean z17 = !z10;
                                                    boolean z18 = fVar2.l;
                                                    SparseArray sparseArray = (SparseArray) e0aVar.b;
                                                    txo0Var = (txo0) sparseArray.get(i3);
                                                    if (txo0Var == null) {
                                                        txo0Var = new txo0(9223372036854775806L);
                                                        sparseArray.put(i3, txo0Var);
                                                    }
                                                    bVar2 = bVar4;
                                                    bVar2.a = new h9v(e9vVar, aVar, evkVar2, aVar5, z3, aVar2, evkVar, z4, uri, list2, selectionReason, selectionData, j22, j23, j24, i4, z17, i3, z18, z2, txo0Var, fVar2.g, i9vVar, zrvVar2, xi90Var2, z, z11, x1b0Var);
                                                }
                                            }
                                        }
                                        z = false;
                                        if (z) {
                                        }
                                        e9v e9vVar2 = b9vVar.a;
                                        androidx.media3.datasource.a aVar42 = b9vVar.b;
                                        androidx.media3.common.a aVar52 = b9vVar.f[selectedIndexInTrackGroup];
                                        List<androidx.media3.common.a> list52 = b9vVar.i;
                                        int selectionReason2 = b9vVar.r.getSelectionReason();
                                        Object selectionData2 = b9vVar.r.getSelectionData();
                                        boolean z122 = b9vVar.l;
                                        e0a e0aVar2 = b9vVar.d;
                                        if (d4 != null) {
                                        }
                                        if (d3 != null) {
                                        }
                                        x1b0 x1b0Var22 = b9vVar.k;
                                        AtomicInteger atomicInteger22 = h9v.M;
                                        Map map2 = Collections.EMPTY_MAP;
                                        Uri d52 = neq0.d(str2, fVar2.b);
                                        loader = loader2;
                                        long j182 = fVar2.j;
                                        long j192 = fVar2.k;
                                        if (!z10) {
                                        }
                                        fxc0.t(d52, "The uri must be set.");
                                        evk evkVar22 = new evk(d52, 0L, 1, null, map2, j182, j192, null, i2, null);
                                        if (bArr == null) {
                                        }
                                        if (z3) {
                                        }
                                        if (bArr == null) {
                                        }
                                        eVar = fVar2.c;
                                        if (eVar == null) {
                                        }
                                        long j222 = j4 + j16;
                                        long j232 = j222 + fVar2.d;
                                        int i32 = bVar3.j + fVar2.e;
                                        if (h9vVar == null) {
                                        }
                                        zrv zrvVar22 = zrvVar;
                                        xi90 xi90Var22 = xi90Var;
                                        long j242 = d2.b;
                                        int i42 = d2.c;
                                        boolean z172 = !z10;
                                        boolean z182 = fVar2.l;
                                        SparseArray sparseArray2 = (SparseArray) e0aVar2.b;
                                        txo0Var = (txo0) sparseArray2.get(i32);
                                        if (txo0Var == null) {
                                        }
                                        bVar2 = bVar4;
                                        bVar2.a = new h9v(e9vVar2, aVar, evkVar22, aVar52, z3, aVar2, evkVar, z4, uri, list2, selectionReason2, selectionData2, j222, j232, j242, i42, z172, i32, z182, z2, txo0Var, fVar2.g, i9vVar, zrvVar22, xi90Var22, z, z11, x1b0Var);
                                    }
                                }
                            }
                            loader = loader2;
                        }
                    } else {
                        j4 = C2;
                    }
                    h9vVar = h9vVar3;
                    b9vVar = b9vVar2;
                    bVar3 = B;
                    uri = uri2;
                    String str22 = bVar3.a;
                    boolean z92 = bVar3.c;
                    j5 = bVar3.k;
                    ImmutableList immutableList2 = bVar3.r;
                    if (selectedIndexInTrackGroup != i) {
                        hlsPlaylistTracker.y(uriArr[i]);
                    }
                    if (longValue >= j5) {
                    }
                    loader = loader2;
                } else {
                    b9v.b bVar9 = bVar;
                    bVar9.c = uri2;
                    b9vVar2.p = uri2;
                    loader = loader2;
                    bVar2 = bVar9;
                }
                boolean z19 = bVar2.b;
                ccc cccVar = bVar2.a;
                Uri uri4 = bVar2.c;
                if (z19) {
                    this.R = C.TIME_UNSET;
                    this.U = true;
                    return true;
                }
                if (cccVar == null) {
                    if (uri4 == null) {
                        return false;
                    }
                    j9v.this.c.G(uri4);
                    return false;
                }
                if (cccVar instanceof h9v) {
                    h9v h9vVar4 = (h9v) cccVar;
                    ArrayList<h9v> arrayList = this.o;
                    if (!arrayList.isEmpty()) {
                        if (!r().g()) {
                            q(arrayList.size() - 1);
                        }
                        if (h9vVar4.n && h9vVar4.L) {
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size < 0) {
                                    break;
                                }
                                long j25 = arrayList.get(size).g;
                                long j26 = h9vVar4.g;
                                if (j25 < j26) {
                                    break;
                                }
                                if (j25 == j26 && m(size)) {
                                    q(size);
                                    h9vVar4.L = false;
                                    break;
                                }
                                size--;
                            }
                        }
                    }
                    this.Y = h9vVar4;
                    this.G = h9vVar4.d;
                    this.R = C.TIME_UNSET;
                    arrayList.add(h9vVar4);
                    ImmutableList.b bVar10 = ImmutableList.c;
                    ImmutableList.a aVar6 = new ImmutableList.a();
                    for (b bVar11 : this.w) {
                        aVar6.c(Integer.valueOf(bVar11.q + bVar11.p));
                    }
                    com.google.common.collect.g g = aVar6.g();
                    h9vVar4.D = this;
                    h9vVar4.I = g;
                    for (b bVar12 : this.w) {
                        bVar12.getClass();
                        bVar12.C = h9vVar4.k;
                        if (h9vVar4.L) {
                            bVar12.G = true;
                        }
                    }
                }
                this.v = cccVar;
                loader.e(cccVar, this, this.j.c(cccVar.c));
                return true;
            }
        }
        return false;
    }

    public final void l() {
        fxc0.z(this.E);
        this.J.getClass();
        this.K.getClass();
    }

    public final boolean m(int i) {
        int i2 = i;
        while (true) {
            ArrayList<h9v> arrayList = this.o;
            if (i2 >= arrayList.size()) {
                h9v h9vVar = arrayList.get(i);
                for (int i3 = 0; i3 < this.w.length; i3++) {
                    if (this.w[i3].t() > h9vVar.f(i3)) {
                        return false;
                    }
                }
                return true;
            }
            if (arrayList.get(i2).L) {
                return false;
            }
            i2++;
        }
    }

    public final qfp0 o(pfp0[] pfp0VarArr) {
        for (int i = 0; i < pfp0VarArr.length; i++) {
            pfp0 pfp0Var = pfp0VarArr[i];
            androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[pfp0Var.a];
            for (int i2 = 0; i2 < pfp0Var.a; i2++) {
                androidx.media3.common.a aVar = pfp0Var.d[i2];
                int a2 = this.h.a(aVar);
                a.C0043a a3 = aVar.a();
                a3.N = a2;
                aVarArr[i2] = new androidx.media3.common.a(a3);
            }
            pfp0VarArr[i] = new pfp0(pfp0Var.b, aVarArr);
        }
        return new qfp0(pfp0VarArr);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void onLoaderReleased() {
        for (b bVar : this.w) {
            bVar.D(true);
            DrmSession drmSession = bVar.h;
            if (drmSession != null) {
                drmSession.b(bVar.e);
                bVar.h = null;
                bVar.g = null;
            }
        }
    }

    public final void q(int i) {
        ArrayList<h9v> arrayList;
        fxc0.z(!this.k.c());
        while (true) {
            arrayList = this.o;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (m(i)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        long j = r().h;
        h9v h9vVar = arrayList.get(i);
        y2r0.a0(arrayList, i, arrayList.size());
        for (int i2 = 0; i2 < this.w.length; i2++) {
            this.w[i2].n(h9vVar.f(i2));
        }
        if (arrayList.isEmpty()) {
            this.R = this.Q;
        } else {
            ((h9v) sd9.k(arrayList)).J = true;
        }
        this.U = false;
        this.l.k(this.B, h9vVar.g, j);
    }

    public final h9v r() {
        return (h9v) xy9.b(1, this.o);
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        Loader loader = this.k;
        if (loader.b() || t()) {
            return;
        }
        boolean c = loader.c();
        b9v b9vVar = this.e;
        List<h9v> list = this.p;
        if (c) {
            this.v.getClass();
            if (b9vVar.n != null ? false : b9vVar.r.h(j, this.v, list)) {
                loader.a();
                return;
            }
            return;
        }
        int size = list.size();
        while (size > 0 && b9vVar.b(list.get(size - 1)) == 2) {
            size--;
        }
        if (size < list.size()) {
            q(size);
        }
        int size2 = (b9vVar.n != null || b9vVar.r.length() < 2) ? list.size() : b9vVar.r.evaluateQueueSize(j, list);
        if (size2 < this.o.size()) {
            q(size2);
        }
    }

    public final boolean t() {
        return this.R != C.TIME_UNSET;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [xsna.r9v$b[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [xsna.r9v$b[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [xsna.rgp0] */
    /* JADX WARN: Type inference failed for: r5v4, types: [androidx.media3.exoplayer.source.p, xsna.r9v$b] */
    /* JADX WARN: Type inference failed for: r5v6, types: [xsna.k0n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // xsna.rgq
    public final rgp0 track(int i, int i2) {
        Integer valueOf = Integer.valueOf(i2);
        Set<Integer> set = Z;
        boolean contains = set.contains(valueOf);
        HashSet hashSet = this.y;
        SparseIntArray sparseIntArray = this.z;
        ?? r5 = 0;
        r5 = 0;
        if (contains) {
            fxc0.p(set.contains(Integer.valueOf(i2)));
            int i3 = sparseIntArray.get(i2, -1);
            if (i3 != -1) {
                if (hashSet.add(Integer.valueOf(i2))) {
                    this.x[i3] = i;
                }
                r5 = this.x[i3] == i ? this.w[i3] : n(i, i2);
            }
        } else {
            int i4 = 0;
            while (true) {
                ?? r1 = this.w;
                if (i4 >= r1.length) {
                    break;
                }
                if (this.x[i4] == i) {
                    r5 = r1[i4];
                    break;
                }
                i4++;
            }
        }
        if (r5 == 0) {
            if (this.V) {
                return n(i, i2);
            }
            int length = this.w.length;
            boolean z = i2 == 1 || i2 == 2;
            r5 = new b(this.f, this.h, this.i, this.u);
            r5.t = this.Q;
            if (z) {
                r5.I = this.X;
                r5.z = true;
            }
            long j = this.W;
            if (r5.F != j) {
                r5.F = j;
                r5.z = true;
            }
            if (this.Y != null) {
                r5.C = r6.k;
            }
            r5.f = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.x, i5);
            this.x = copyOf;
            copyOf[length] = i;
            b[] bVarArr = this.w;
            String str = y2r0.a;
            ?? copyOf2 = Arrays.copyOf(bVarArr, bVarArr.length + 1);
            copyOf2[bVarArr.length] = r5;
            this.w = (b[]) copyOf2;
            boolean[] copyOf3 = Arrays.copyOf(this.P, i5);
            this.P = copyOf3;
            copyOf3[length] = z;
            this.N |= z;
            hashSet.add(Integer.valueOf(i2));
            sparseIntArray.append(i2, length);
            if (s(i2) > s(this.B)) {
                this.C = length;
                this.B = i2;
            }
            this.O = Arrays.copyOf(this.O, i5);
        }
        if (i2 != 5) {
            return r5;
        }
        if (this.A == null) {
            this.A = new a(r5, this.m);
        }
        return this.A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u() {
        int i;
        if (!this.I && this.L == null && this.D) {
            int i2 = 0;
            for (b bVar : this.w) {
                if (bVar.w() == null) {
                    return;
                }
            }
            qfp0 qfp0Var = this.J;
            if (qfp0Var != null) {
                int i3 = qfp0Var.a;
                int[] iArr = new int[i3];
                this.L = iArr;
                Arrays.fill(iArr, -1);
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = 0;
                    while (true) {
                        b[] bVarArr = this.w;
                        if (i5 < bVarArr.length) {
                            androidx.media3.common.a w = bVarArr[i5].w();
                            w.getClass();
                            androidx.media3.common.a aVar = this.J.a(i4).d[0];
                            String str = w.n;
                            String str2 = aVar.n;
                            int i6 = io20.i(str);
                            if (i6 == 3) {
                                if (Objects.equals(str, str2)) {
                                    if ((!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) || w.K == aVar.K) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                                i5++;
                            } else if (i6 == io20.i(str2)) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    this.L[i4] = i5;
                }
                Iterator<q9v> it = this.t.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                return;
            }
            int length = this.w.length;
            int i7 = 0;
            int i8 = -1;
            int i9 = -2;
            while (true) {
                int i10 = 1;
                if (i7 >= length) {
                    break;
                }
                androidx.media3.common.a w2 = this.w[i7].w();
                w2.getClass();
                String str3 = w2.n;
                if (io20.p(str3)) {
                    i10 = 2;
                } else if (!io20.l(str3)) {
                    i10 = io20.o(str3) ? 3 : -2;
                }
                if (s(i10) > s(i9)) {
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i8 != -1) {
                    i8 = -1;
                }
                i7++;
            }
            pfp0 pfp0Var = this.e.h;
            int i11 = pfp0Var.a;
            this.M = -1;
            this.L = new int[length];
            for (int i12 = 0; i12 < length; i12++) {
                this.L[i12] = i12;
            }
            pfp0[] pfp0VarArr = new pfp0[length];
            int i13 = 0;
            while (i13 < length) {
                androidx.media3.common.a w3 = this.w[i13].w();
                w3.getClass();
                String str4 = this.b;
                androidx.media3.common.a aVar2 = this.g;
                if (i13 == i8) {
                    androidx.media3.common.a[] aVarArr = new androidx.media3.common.a[i11];
                    for (int i14 = i2; i14 < i11; i14++) {
                        androidx.media3.common.a aVar3 = pfp0Var.d[i14];
                        if (i9 == 1 && aVar2 != null) {
                            aVar3 = aVar3.e(aVar2);
                        }
                        aVarArr[i14] = i11 == 1 ? w3.e(aVar3) : p(aVar3, w3, true);
                    }
                    pfp0VarArr[i13] = new pfp0(str4, aVarArr);
                    this.M = i13;
                    i = 0;
                } else {
                    if (i9 != 2 || !io20.l(w3.n)) {
                        aVar2 = null;
                    }
                    StringBuilder b2 = ho8.b(str4, ":muxed:");
                    b2.append(i13 < i8 ? i13 : i13 - 1);
                    i = 0;
                    pfp0VarArr[i13] = new pfp0(b2.toString(), p(aVar2, w3, false));
                }
                i13++;
                i2 = i;
            }
            int i15 = i2;
            this.J = o(pfp0VarArr);
            fxc0.z(this.K == null ? 1 : i15);
            this.K = Collections.EMPTY_SET;
            this.E = true;
            this.d.a();
        }
    }

    public final void v() throws IOException {
        this.k.maybeThrowError();
        b9v b9vVar = this.e;
        BehindLiveWindowException behindLiveWindowException = b9vVar.n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = b9vVar.o;
        if (uri == null || !uri.equals(b9vVar.p)) {
            return;
        }
        b9vVar.g.F(b9vVar.o);
    }

    public final void w(pfp0[] pfp0VarArr, int... iArr) {
        this.J = o(pfp0VarArr);
        this.K = new HashSet();
        for (int i : iArr) {
            this.K.add(this.J.a(i));
        }
        this.M = 0;
        this.s.post(new oh(this.d, 5));
        this.E = true;
    }

    public final void x() {
        for (b bVar : this.w) {
            bVar.D(this.S);
        }
        this.S = false;
    }

    public final boolean y(long j, boolean z) {
        h9v h9vVar;
        boolean z2;
        boolean F;
        this.Q = j;
        if (t()) {
            this.R = j;
            return true;
        }
        boolean z3 = this.e.q;
        ArrayList<h9v> arrayList = this.o;
        if (z3) {
            for (int i = 0; i < arrayList.size(); i++) {
                h9vVar = arrayList.get(i);
                if (h9vVar.g == j) {
                    break;
                }
            }
        }
        h9vVar = null;
        if (this.D && !z && !arrayList.isEmpty()) {
            int length = this.w.length;
            for (int i2 = 0; i2 < length; i2++) {
                b bVar = this.w[i2];
                if (h9vVar != null) {
                    F = bVar.E(h9vVar.f(i2));
                } else {
                    long nextLoadPositionUs = getNextLoadPositionUs();
                    F = bVar.F(j, nextLoadPositionUs == Long.MIN_VALUE || j < nextLoadPositionUs);
                }
                if (!F && (this.P[i2] || !this.N)) {
                    z2 = false;
                    break;
                }
            }
            z2 = true;
            if (z2) {
                return false;
            }
        }
        this.R = j;
        this.U = false;
        arrayList.clear();
        Loader loader = this.k;
        if (!loader.c()) {
            loader.c = null;
            x();
            return true;
        }
        if (this.D) {
            for (b bVar2 : this.w) {
                bVar2.k();
            }
        }
        loader.a();
        return true;
    }

    @Override // xsna.rgq
    public final void f(n3i0 n3i0Var) {
    }
}
