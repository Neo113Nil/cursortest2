package xsna;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.a;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.exoplayer.dash.b;
import androidx.media3.exoplayer.dash.e;
import androidx.media3.exoplayer.upstream.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.gdl;

/* compiled from: OneVideoCachePriorityDashChunkSource.kt */
/* loaded from: classes8.dex */
public final class kk80 extends q6g0 {
    public final Cache o;
    public final xw8 p;
    public final rsk q;
    public final int r;
    public final d7q s;
    public final int t;
    public final androidx.media3.datasource.a u;
    public final long v;
    public final qo10 w;
    public final e.c x;
    public boolean y;

    /* compiled from: OneVideoCachePriorityDashChunkSource.kt */
    public static final class a implements b.a {
        public final Cache a;
        public final xw8 b;
        public final a.InterfaceC0045a c;
        public final qo10 d;

        public a(Cache cache, xw8 xw8Var, a.InterfaceC0045a interfaceC0045a, qo10 qo10Var) {
            this.a = cache;
            this.b = xw8Var;
            this.c = interfaceC0045a;
            this.d = qo10Var;
        }

        @Override // androidx.media3.exoplayer.dash.b.a
        public final androidx.media3.exoplayer.dash.b e(grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, long j, boolean z, ArrayList arrayList, e.c cVar, mjp0 mjp0Var, x1b0 x1b0Var) {
            androidx.media3.datasource.a createDataSource = this.c.createDataSource();
            if (mjp0Var != null) {
                createDataSource.addTransferListener(mjp0Var);
            }
            return new kk80(this.a, this.b, grzVar, rskVar, wp6Var, i, iArr, d7qVar, i2, createDataSource, j, this.d, z, arrayList, cVar, x1b0Var);
        }
    }

    public kk80(Cache cache, xw8 xw8Var, grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, androidx.media3.datasource.a aVar, long j, qo10 qo10Var, boolean z, ArrayList arrayList, e.c cVar, x1b0 x1b0Var) {
        super(grzVar, rskVar, wp6Var, i, iArr, d7qVar, i2, aVar, j, qo10Var, z, arrayList, cVar, x1b0Var);
        this.o = cache;
        this.p = xw8Var;
        this.q = rskVar;
        this.r = i;
        this.s = d7qVar;
        this.t = i2;
        this.u = aVar;
        this.v = j;
        this.w = qo10Var;
        this.x = cVar;
    }

    @Override // xsna.gdl, xsna.kcc
    public final boolean b(ccc cccVar, boolean z, b.c cVar, androidx.media3.exoplayer.upstream.b bVar) {
        IOException iOException = cVar.a;
        if (!this.q.d && (cccVar instanceof aq10)) {
            HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = iOException instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) iOException : null;
            if (httpDataSource$InvalidResponseCodeException != null && httpDataSource$InvalidResponseCodeException.responseCode == 404) {
                gdl.a aVar = this.i[this.s.b(cccVar.d)];
                Long valueOf = aVar != null ? Long.valueOf(aVar.e()) : null;
                if (valueOf != null) {
                    long longValue = valueOf.longValue();
                    if (longValue != -1 && longValue != 0) {
                        if (((aq10) cccVar).b() > (aVar.c() + longValue) - 1) {
                            this.y = true;
                            return true;
                        }
                    }
                }
            }
        }
        return super.b(cccVar, z, cVar, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x025d  */
    @Override // xsna.gdl, xsna.kcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(androidx.media3.exoplayer.f fVar, long j, List<? extends aq10> list, ecc eccVar) {
        long j2;
        androidx.media3.common.a aVar;
        ecc eccVar2;
        izw izwVar;
        e7g0 e7g0Var;
        d7q d7qVar = this.s;
        npl nplVar = d7qVar instanceof npl ? (npl) d7qVar : null;
        if ((nplVar != null ? nplVar.a() : null) == null) {
            long j3 = this.v;
            long j4 = 0;
            long S = y2r0.S(j3 != 0 ? SystemClock.elapsedRealtime() + j3 : System.currentTimeMillis());
            rsk rskVar = this.q;
            long S2 = y2r0.S(rskVar.a);
            int i = this.r;
            long S3 = y2r0.S(rskVar.b(i).b) + S2 + j;
            e.c cVar = this.x;
            if (cVar == null || !cVar.h(S3)) {
                Iterator it = rl3.m0(this.i, new fzr(1)).iterator();
                gdl.a aVar2 = null;
                while (true) {
                    if (!it.hasNext()) {
                        j2 = j4;
                        break;
                    }
                    gdl.a aVar3 = (gdl.a) it.next();
                    j2 = j4;
                    String k = this.p.k(new evk(Uri.parse((aVar3 == null || (e7g0Var = aVar3.b) == null) ? null : e7g0Var.c.get(0).a)));
                    if (this.o.isCached(k, 0L, 0L)) {
                        if ((aVar3 != null ? aVar3.d : null) != null && aVar3.d.i(j) > j2) {
                            rwe0 l = aVar3.d.l(aVar3.g(j));
                            long j5 = l.b;
                            if (j5 >= j2 && this.o.isCached(k, l.a, j5)) {
                                aVar2 = aVar3;
                                break;
                            }
                        } else {
                            if (aVar2 != null) {
                                if ((aVar3 != null ? aVar3.b : null) != null) {
                                    if (aVar3.b.b.j <= aVar2.b.b.j) {
                                    }
                                }
                            }
                            aVar2 = aVar3;
                        }
                    }
                    j4 = j2;
                }
                if (aVar2 != null) {
                    e7g0 e7g0Var2 = aVar2.b;
                    androidx.media3.common.a aVar4 = e7g0Var2.b;
                    int i2 = d7qVar.getTrackGroup().a;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= i2) {
                            aVar = null;
                            break;
                        }
                        androidx.media3.common.a format = d7qVar.getFormat(i3);
                        if (format.equals(aVar4)) {
                            aVar = format;
                            break;
                        }
                        i3++;
                    }
                    if (aVar != null) {
                        dcc dccVar = aVar2.a;
                        if (dccVar != null) {
                            rwe0 rwe0Var = dccVar.d() == null ? e7g0Var2.h : null;
                            rwe0 g = aVar2.d == null ? e7g0Var2.g() : null;
                            if (rwe0Var != null || g != null) {
                                try {
                                    izwVar = gdl.i(aVar2, this.u, aVar, 2, new Object(), rwe0Var, g);
                                } catch (Exception unused) {
                                    izwVar = null;
                                }
                                ecc eccVar3 = new ecc();
                                eccVar3.a = izwVar;
                                eccVar2 = eccVar3;
                                if (eccVar2 != null) {
                                    super.g(fVar, j, list, eccVar);
                                    return;
                                } else {
                                    eccVar.a = eccVar2.a;
                                    eccVar.b = eccVar2.b;
                                    return;
                                }
                            }
                        }
                        if (aVar2.e() == j2) {
                            eccVar2 = new ecc();
                            eccVar2.b = true;
                        } else {
                            long b = aVar2.b(S);
                            long d = aVar2.d(S);
                            aq10 aq10Var = (aq10) j5g.k0(list);
                            long b2 = aq10Var != null ? aq10Var.b() : y2r0.k(aVar2.g(j), b, d);
                            boolean isEmpty = list.isEmpty();
                            long j6 = C.TIME_UNSET;
                            long j7 = isEmpty ? j : -9223372036854775807L;
                            long d2 = rskVar.d(0);
                            boolean z = d2 != C.TIME_UNSET;
                            if (b2 > d || (this.y && b2 >= d)) {
                                eccVar2 = new ecc();
                                eccVar2.b = z;
                            } else if (!z || aVar2.h(b2) < d2) {
                                long j8 = rskVar.a;
                                if (j8 != C.TIME_UNSET) {
                                    j6 = S - y2r0.S(j8 + rskVar.b(i).b);
                                }
                                long j9 = j6;
                                int min = Math.min(this.w.f(y2r0.j0(fVar.a), y2r0.j0(j), y2r0.j0(aVar2.f(b2) - aVar2.h(b2)), fr10.b(d7qVar.getTrackGroup().c, e7g0Var2.b)), (int) ((d - b2) + 1));
                                if (d2 != C.TIME_UNSET) {
                                    while (min > 1 && aVar2.h((min + b2) - 1) >= d2) {
                                        min--;
                                    }
                                }
                                rg6 j10 = gdl.j(aVar2, this.u, this.t, aVar, d7qVar.getSelectionReason(), new Object(), b2, min, j7, j9);
                                eccVar2 = new ecc();
                                eccVar2.a = j10;
                            } else {
                                eccVar2 = new ecc();
                                eccVar2.b = true;
                            }
                            if (eccVar2 != null) {
                            }
                        }
                        if (eccVar2 != null) {
                        }
                    }
                }
            }
        }
        eccVar2 = null;
        if (eccVar2 != null) {
        }
    }
}
