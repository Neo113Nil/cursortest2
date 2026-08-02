package xsna;

import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.f;
import androidx.media3.exoplayer.upstream.c;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: DashDownloader.java */
/* loaded from: classes12.dex */
public final class osk extends androidx.media3.exoplayer.offline.f<rsk> {
    public final wp6 n;

    /* compiled from: DashDownloader.java */
    public static final class a extends f.a<rsk> {
        public a(a.b bVar) {
            super(bVar, new wsk());
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
            return new osk(kr10Var, this.b, this.a, this.c, this.d, this.e);
        }

        @Override // xsna.e5i0
        public final e5i0 d(Executor executor) {
            this.c = executor;
            return this;
        }
    }

    public osk(kr10 kr10Var, c.a aVar, a.b bVar, Executor executor, long j, long j2) {
        super(kr10Var, aVar, bVar, executor, j, j2);
        this.n = new wp6();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x018d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c A[SYNTHETIC] */
    @Override // androidx.media3.exoplayer.offline.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List e(final androidx.media3.datasource.cache.a aVar, uer uerVar, boolean z) throws IOException, InterruptedException {
        rsk rskVar;
        cj0 cj0Var;
        int i;
        long j;
        long j2;
        btk htkVar;
        int i2;
        long j3;
        final osk oskVar = this;
        boolean z2 = z;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        for (rsk rskVar2 = (rsk) uerVar; i3 < rskVar2.m.size(); rskVar2 = rskVar) {
            jx90 b = rskVar2.b(i3);
            long S = y2r0.S(b.b);
            long d = rskVar2.d(i3);
            long j4 = oskVar.a;
            if (d == C.TIME_UNSET || S + d > j4) {
                long j5 = oskVar.b;
                if (j5 != C.TIME_UNSET && S >= j4 + j5) {
                    break;
                }
                List<cj0> list = b.c;
                rskVar = rskVar2;
                int i4 = 0;
                while (i4 < list.size()) {
                    int i5 = i4;
                    cj0 cj0Var2 = list.get(i4);
                    List<cj0> list2 = list;
                    int i6 = 0;
                    while (i6 < cj0Var2.c.size()) {
                        final e7g0 e7g0Var = cj0Var2.c.get(i6);
                        int i7 = i6;
                        try {
                            final int i8 = cj0Var2.b;
                            btk e = e7g0Var.e();
                            if (e != null) {
                                cj0Var = cj0Var2;
                                htkVar = e;
                                i = i3;
                                j2 = j5;
                            } else {
                                cj0Var = cj0Var2;
                                try {
                                    i = i3;
                                } catch (IOException e2) {
                                    e = e2;
                                    i = i3;
                                    j = S;
                                    j2 = j5;
                                    if (z) {
                                    }
                                }
                                try {
                                    fcc fccVar = (fcc) oskVar.c(new zhn0(oskVar) { // from class: xsna.msk
                                        @Override // xsna.zhn0
                                        public final Object get() {
                                            return new nsk(aVar, i8, e7g0Var);
                                        }
                                    }, z2);
                                    if (fccVar == null) {
                                        htkVar = null;
                                        j2 = j5;
                                    } else {
                                        j2 = j5;
                                        try {
                                            htkVar = new htk(fccVar, e7g0Var.d);
                                        } catch (IOException e3) {
                                            e = e3;
                                            j = S;
                                            if (z) {
                                                throw e;
                                            }
                                            oskVar = this;
                                            z2 = z;
                                            i6 = i7 + 1;
                                            cj0Var2 = cj0Var;
                                            i3 = i;
                                            j5 = j2;
                                            S = j;
                                        }
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    j = S;
                                    j2 = j5;
                                    if (z) {
                                    }
                                }
                            }
                        } catch (IOException e5) {
                            e = e5;
                            cj0Var = cj0Var2;
                        }
                        if (htkVar != null) {
                            long i9 = htkVar.i(d);
                            if (i9 == -1) {
                                throw new DownloadException("Unbounded segment index");
                            }
                            tp6 e6 = oskVar.n.e(e7g0Var.c);
                            String str = y2r0.a;
                            String str2 = e6.a;
                            rwe0 rwe0Var = e7g0Var.h;
                            if (rwe0Var != null) {
                                i2 = 0;
                                arrayList.add(new f.c(S, ctk.a(e7g0Var, str2, rwe0Var, 0, com.google.common.collect.h.h)));
                            } else {
                                i2 = 0;
                            }
                            rwe0 g = e7g0Var.g();
                            if (g != null) {
                                arrayList.add(new f.c(S, ctk.a(e7g0Var, str2, g, i2, com.google.common.collect.h.h)));
                            }
                            long j6 = j4 - S;
                            if (j5 != C.TIME_UNSET) {
                                j = S;
                                j3 = j6 + j2;
                            } else {
                                j = S;
                                j3 = -9223372036854775807L;
                            }
                            long k = (z || j6 <= 0) ? htkVar.k() : htkVar.h(j6, d);
                            long k2 = (j3 == C.TIME_UNSET || z || j3 >= j + d) ? (htkVar.k() + i9) - 1 : htkVar.h(j3, d);
                            while (k <= k2) {
                                arrayList.add(new f.c(htkVar.getTimeUs(k) + j, ctk.a(e7g0Var, str2, htkVar.l(k), 0, com.google.common.collect.h.h)));
                                k++;
                                htkVar = htkVar;
                            }
                            oskVar = this;
                            z2 = z;
                            i6 = i7 + 1;
                            cj0Var2 = cj0Var;
                            i3 = i;
                            j5 = j2;
                            S = j;
                        } else {
                            j = S;
                            try {
                                throw new DownloadException("Missing segment index");
                            } catch (IOException e7) {
                                e = e7;
                                if (z) {
                                }
                            }
                        }
                    }
                    i4 = i5 + 1;
                    oskVar = this;
                    z2 = z;
                    list = list2;
                }
            } else {
                rskVar = rskVar2;
            }
            i3++;
            oskVar = this;
            z2 = z;
        }
        return arrayList;
    }
}
