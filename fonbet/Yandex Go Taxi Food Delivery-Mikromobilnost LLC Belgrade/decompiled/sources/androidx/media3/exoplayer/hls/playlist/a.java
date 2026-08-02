package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import com.google.common.collect.ImmutableList;
import defpackage.cou;
import defpackage.eab1;
import defpackage.gg90;
import defpackage.h0n;
import defpackage.hg90;
import defpackage.ipg;
import defpackage.kpg;
import defpackage.mch;
import defpackage.mpg;
import defpackage.npg;
import defpackage.oyy;
import defpackage.pnu;
import defpackage.pyy;
import defpackage.rnu;
import defpackage.swy;
import defpackage.tnu;
import defpackage.tw21;
import defpackage.twy;
import defpackage.unu;
import defpackage.uwy;
import defpackage.x7u0;
import defpackage.xf10;
import defpackage.xnu;
import defpackage.znu;
import defpackage.zvg;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes10.dex */
public final class a implements oyy {
    public long A;
    public boolean B;
    public IOException C;
    public boolean D;
    public final /* synthetic */ mch E;
    public final Uri a;
    public final androidx.media3.exoplayer.upstream.a b = new androidx.media3.exoplayer.upstream.a("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final kpg c;
    public unu w;
    public long x;
    public long y;
    public long z;

    public a(mch mchVar, Uri uri) {
        this.E = mchVar;
        this.a = uri;
        this.c = ((ipg) mchVar.a.a).createDataSource();
    }

    public static boolean a(a aVar, long j) {
        aVar.A = SystemClock.elapsedRealtime() + j;
        Uri uri = aVar.a;
        mch mchVar = aVar.E;
        if (!uri.equals(mchVar.D)) {
            return false;
        }
        List list = mchVar.C.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            a aVar2 = (a) mchVar.w.get(((xnu) list.get(i)).a);
            aVar2.getClass();
            if (elapsedRealtime > aVar2.A) {
                Uri uri2 = aVar2.a;
                mchVar.D = uri2;
                aVar2.f(mchVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        unu unuVar = this.w;
        Uri uri = this.a;
        if (unuVar != null) {
            tnu tnuVar = unuVar.v;
            if (tnuVar.a != -9223372036854775807L || tnuVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                unu unuVar2 = this.w;
                if (unuVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(unuVar2.k + unuVar2.r.size()));
                    unu unuVar3 = this.w;
                    if (unuVar3.n != -9223372036854775807L) {
                        ImmutableList immutableList = unuVar3.s;
                        int size = immutableList.size();
                        if (!immutableList.isEmpty() && ((pnu) eab1.c(immutableList)).F) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                tnu tnuVar2 = this.w.v;
                if (tnuVar2.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", tnuVar2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        f(z ? b() : this.a);
    }

    @Override // defpackage.oyy
    public final void d(pyy pyyVar, long j, long j2, boolean z) {
        hg90 hg90Var = (hg90) pyyVar;
        long j3 = hg90Var.a;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        mch mchVar = this.E;
        mchVar.c.onLoadTaskConcluded(j3);
        mchVar.y.c(uwyVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        mch mchVar = this.E;
        gg90 createPlaylistParser = mchVar.b.createPlaylistParser(mchVar.C, this.w);
        mpg mpgVar = new mpg();
        mpgVar.a = uri;
        mpgVar.i = 1;
        hg90 hg90Var = new hg90(this.c, mpgVar.a(), 4, createPlaylistParser);
        this.b.g(hg90Var, this, mchVar.c.getMinimumLoadableRetryCount(hg90Var.c));
    }

    public final void f(Uri uri) {
        this.A = 0L;
        if (this.B) {
            return;
        }
        androidx.media3.exoplayer.upstream.a aVar = this.b;
        if (aVar.d() || aVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.z;
        if (elapsedRealtime >= j) {
            e(uri);
        } else {
            this.B = true;
            this.E.A.postDelayed(new zvg(6, this, uri), j - elapsedRealtime);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(unu unuVar, uwy uwyVar) {
        boolean z;
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z2;
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        ImmutableList immutableList;
        unu unuVar2;
        IOException iOException;
        IOException iOException2;
        boolean z3;
        unu unuVar3;
        int size;
        int size2;
        int size3;
        unu unuVar4 = this.w;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.x = elapsedRealtime;
        mch mchVar = this.E;
        CopyOnWriteArrayList copyOnWriteArrayList2 = mchVar.x;
        if (unuVar4 != null) {
            long j5 = unuVar.k;
            long j6 = unuVar4.k;
            if (j5 <= j6 && (j5 < j6 || ((size = unuVar.r.size() - unuVar4.r.size()) == 0 ? !((size2 = unuVar.s.size()) > (size3 = unuVar4.s.size()) || (size2 == size3 && unuVar.o && !unuVar4.o)) : size <= 0))) {
                z = false;
                long j7 = unuVar.k;
                ImmutableList immutableList2 = unuVar.r;
                long j8 = 0;
                if (z) {
                    if (!unuVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        z2 = true;
                        unuVar2 = unuVar4;
                    } else if (unuVar4.o) {
                        unuVar2 = unuVar4;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        iOException = null;
                        z2 = true;
                    } else {
                        z2 = true;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        unuVar2 = new unu(unuVar4.d, unuVar4.a, unuVar4.b, unuVar4.e, unuVar4.g, unuVar4.h, unuVar4.i, unuVar4.j, unuVar4.k, unuVar4.l, unuVar4.m, unuVar4.n, unuVar4.c, true, unuVar4.p, unuVar4.q, unuVar4.r, unuVar4.s, unuVar4.v, unuVar4.t, unuVar4.w);
                    }
                    iOException = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    z2 = true;
                    if (unuVar.p) {
                        j3 = unuVar.h;
                    } else {
                        unu unuVar5 = mchVar.E;
                        long j9 = unuVar5 != null ? unuVar5.h : 0L;
                        if (unuVar4 == null) {
                            j = j9;
                        } else {
                            long j10 = unuVar4.h;
                            long j11 = unuVar4.k;
                            ImmutableList immutableList3 = unuVar4.r;
                            j = j9;
                            int size4 = immutableList3.size();
                            int i2 = (int) (j7 - j11);
                            rnu rnuVar = i2 < immutableList3.size() ? (rnu) immutableList3.get(i2) : null;
                            if (rnuVar != null) {
                                j2 = rnuVar.x;
                            } else if (size4 == j7 - j11) {
                                j2 = unuVar4.u;
                            }
                            j3 = j10 + j2;
                        }
                        j4 = j;
                        if (unuVar.i) {
                            unu unuVar6 = mchVar.E;
                            int i3 = unuVar6 != null ? unuVar6.j : 0;
                            if (unuVar4 != null) {
                                int i4 = (int) (j7 - unuVar4.k);
                                ImmutableList immutableList4 = unuVar4.r;
                                rnu rnuVar2 = i4 < immutableList4.size() ? (rnu) immutableList4.get(i4) : null;
                                if (rnuVar2 != null) {
                                    i3 = (unuVar4.j + rnuVar2.w) - ((rnu) immutableList2.get(0)).w;
                                    i = i3;
                                    immutableList = immutableList2;
                                }
                            }
                            i = i3;
                            immutableList = immutableList2;
                        } else {
                            i = unuVar.j;
                            immutableList = immutableList2;
                        }
                        iOException = null;
                        unuVar2 = new unu(unuVar.d, unuVar.a, unuVar.b, unuVar.e, unuVar.g, j4, true, i, unuVar.k, unuVar.l, unuVar.m, unuVar.n, unuVar.c, unuVar.o, unuVar.p, unuVar.q, immutableList, unuVar.s, unuVar.v, unuVar.t, unuVar.w);
                    }
                    j4 = j3;
                    if (unuVar.i) {
                    }
                    iOException = null;
                    unuVar2 = new unu(unuVar.d, unuVar.a, unuVar.b, unuVar.e, unuVar.g, j4, true, i, unuVar.k, unuVar.l, unuVar.m, unuVar.n, unuVar.c, unuVar.o, unuVar.p, unuVar.q, immutableList, unuVar.s, unuVar.v, unuVar.t, unuVar.w);
                }
                this.w = unuVar2;
                final Uri uri = this.a;
                if (unuVar2 == unuVar4) {
                    this.C = iOException;
                    this.y = elapsedRealtime;
                    if (uri.equals(mchVar.D)) {
                        if (mchVar.E == null) {
                            mchVar.F = !unuVar2.o;
                            mchVar.G = unuVar2.h;
                        }
                        mchVar.E = unuVar2;
                        mchVar.B.i(unuVar2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((cou) it.next()).b();
                    }
                } else if (!unuVar2.o) {
                    long size5 = unuVar.k + unuVar.r.size();
                    unu unuVar7 = this.w;
                    if (size5 < unuVar7.k) {
                        iOException2 = new IOException(uri) { // from class: androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException
                            public final Uri url;

                            {
                                this.url = uri;
                            }
                        };
                        z3 = z2;
                    } else {
                        iOException2 = ((double) (elapsedRealtime - this.y)) > ((double) tw21.l0(unuVar7.m)) * 3.5d ? new IOException(uri) { // from class: androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException
                            public final Uri url;

                            {
                                this.url = uri;
                            }
                        } : iOException;
                        z3 = false;
                    }
                    if (iOException2 != null) {
                        this.C = iOException2;
                        swy swyVar = new swy(iOException2, z2 ? 1 : 0);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((cou) it2.next()).a(uri, swyVar, z3);
                        }
                    }
                }
                unuVar3 = this.w;
                if (!unuVar3.v.e) {
                    long j12 = unuVar3.m;
                    if (unuVar3 == unuVar4) {
                        j12 /= 2;
                    }
                    j8 = j12;
                }
                this.z = (tw21.l0(j8) + elapsedRealtime) - uwyVar.d;
                if (this.w.o) {
                    if (uri.equals(mchVar.D) || this.D) {
                        f(b());
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            unuVar.getClass();
        }
        z = true;
        long j72 = unuVar.k;
        ImmutableList immutableList22 = unuVar.r;
        long j82 = 0;
        if (z) {
        }
        this.w = unuVar2;
        final Uri uri2 = this.a;
        if (unuVar2 == unuVar4) {
        }
        unuVar3 = this.w;
        if (!unuVar3.v.e) {
        }
        this.z = (tw21.l0(j82) + elapsedRealtime) - uwyVar.d;
        if (this.w.o) {
        }
    }

    @Override // defpackage.oyy
    public final void m(pyy pyyVar, long j, long j2) {
        hg90 hg90Var = (hg90) pyyVar;
        znu znuVar = (znu) hg90Var.y;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        uwy uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        if (znuVar instanceof unu) {
            g((unu) znuVar, uwyVar);
            this.E.y.d(uwyVar, 4);
        } else {
            ParserException b = ParserException.b(null, "Loaded playlist has unexpected type.");
            this.C = b;
            this.E.y.g(uwyVar, 4, b, true);
        }
        this.E.c.onLoadTaskConcluded(hg90Var.a);
    }

    @Override // defpackage.oyy
    public final void o(pyy pyyVar, long j, long j2, int i) {
        uwy uwyVar;
        hg90 hg90Var = (hg90) pyyVar;
        if (i == 0) {
            long j3 = hg90Var.a;
            uwyVar = new uwy(hg90Var.b);
        } else {
            long j4 = hg90Var.a;
            npg npgVar = hg90Var.b;
            x7u0 x7u0Var = hg90Var.w;
            uwyVar = new uwy(npgVar, x7u0Var.c, x7u0Var.w, j2, x7u0Var.b);
        }
        this.E.y.h(uwyVar, hg90Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.oyy
    public final h0n p(pyy pyyVar, long j, long j2, IOException iOException, int i) {
        hg90 hg90Var = (hg90) pyyVar;
        long j3 = hg90Var.a;
        int i2 = hg90Var.c;
        npg npgVar = hg90Var.b;
        x7u0 x7u0Var = hg90Var.w;
        Uri uri = x7u0Var.c;
        uwy uwyVar = new uwy(npgVar, uri, x7u0Var.w, j2, x7u0Var.b);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
        h0n h0nVar = androidx.media3.exoplayer.upstream.a.e;
        mch mchVar = this.E;
        if (z || z2) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.z = SystemClock.elapsedRealtime();
                c(false);
                xf10 xf10Var = mchVar.y;
                int i4 = tw21.a;
                xf10Var.g(uwyVar, i2, iOException, true);
                return h0nVar;
            }
        }
        swy swyVar = new swy(iOException, i);
        Iterator it = mchVar.x.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((cou) it.next()).a(this.a, swyVar, false);
        }
        twy twyVar = mchVar.c;
        if (z3) {
            long retryDelayMsFor = twyVar.getRetryDelayMsFor(swyVar);
            h0nVar = retryDelayMsFor != -9223372036854775807L ? new h0n(false, 0, retryDelayMsFor) : androidx.media3.exoplayer.upstream.a.f;
        }
        boolean b = h0nVar.b();
        mchVar.y.g(uwyVar, i2, iOException, !b);
        if (!b) {
            twyVar.onLoadTaskConcluded(hg90Var.a);
        }
        return h0nVar;
    }
}
