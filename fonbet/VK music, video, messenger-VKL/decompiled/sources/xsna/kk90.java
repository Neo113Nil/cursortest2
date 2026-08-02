package xsna;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.f;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import xsna.kr10;

/* compiled from: PartialDashDownloader.java */
@Deprecated
/* loaded from: classes8.dex */
public final class kk90 extends androidx.media3.exoplayer.offline.f<rsk> {
    public final long n;
    public final long o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kk90(Uri uri, List<StreamKey> list, a.b bVar, long j, long j2, wsk wskVar, Executor executor) {
        super(new kr10("", new kr10.c(r1), uri != null ? new kr10.f(uri, null, null, (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list)), null, r9, C.TIME_UNSET) : null, new kr10.e(r2), vr10.B, kr10.g.a), wskVar, bVar, executor, 0L, C.TIME_UNSET);
        kr10.b.a aVar = new kr10.b.a();
        new kr10.d.a();
        List list2 = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        this.n = j;
        this.o = j2;
    }

    public static void i(long j, String str, rwe0 rwe0Var, ArrayList<f.c> arrayList) {
        Map map = Collections.EMPTY_MAP;
        Uri d = neq0.d(str, rwe0Var.c);
        long j2 = rwe0Var.a;
        long j3 = rwe0Var.b;
        fxc0.t(d, "The uri must be set.");
        arrayList.add(new f.c(j, new evk(d, 0L, 1, null, map, j2, j3, null, 0, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x013a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012a A[SYNTHETIC] */
    @Override // androidx.media3.exoplayer.offline.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List e(androidx.media3.datasource.cache.a aVar, uer uerVar, boolean z) throws IOException, InterruptedException {
        rsk rskVar;
        int i;
        long j;
        List<cj0> list;
        int i2;
        btk htkVar;
        long j2;
        kk90 kk90Var = this;
        rsk rskVar2 = (rsk) uerVar;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < rskVar2.m.size()) {
            jx90 b = rskVar2.b(i3);
            long S = y2r0.S(b.b);
            long d = rskVar2.d(i3);
            List<cj0> list2 = b.c;
            int i4 = 0;
            while (i4 < list2.size()) {
                cj0 cj0Var = list2.get(i4);
                int i5 = 0;
                while (i5 < cj0Var.c.size()) {
                    e7g0 e7g0Var = cj0Var.c.get(i5);
                    try {
                        int i6 = cj0Var.b;
                        btk e = e7g0Var.e();
                        if (e != null) {
                            list = list2;
                            i2 = i4;
                            htkVar = e;
                        } else {
                            try {
                                fcc b2 = ctk.b(aVar, i6, e7g0Var);
                                if (b2 == null) {
                                    htkVar = null;
                                    list = list2;
                                    i2 = i4;
                                } else {
                                    list = list2;
                                    i2 = i4;
                                    try {
                                        htkVar = new htk(b2, e7g0Var.d);
                                    } catch (IOException e2) {
                                        e = e2;
                                        rskVar = rskVar2;
                                        i = i3;
                                        j = S;
                                        if (!z) {
                                        }
                                    }
                                }
                            } catch (IOException e3) {
                                e = e3;
                                rskVar = rskVar2;
                                i = i3;
                                j = S;
                                list = list2;
                                i2 = i4;
                                if (!z) {
                                    throw e;
                                }
                                i5++;
                                kk90Var = this;
                                list2 = list;
                                i4 = i2;
                                i3 = i;
                                rskVar2 = rskVar;
                                S = j;
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                    }
                    if (htkVar != null) {
                        long i7 = htkVar.i(d);
                        if (i7 == -1) {
                            throw new DownloadException("Unbounded segment index");
                        }
                        i = i3;
                        long j3 = kk90Var.o;
                        boolean z2 = S <= j3 || z;
                        rskVar = rskVar2;
                        String str = e7g0Var.c.get(0).a;
                        rwe0 rwe0Var = e7g0Var.h;
                        if (rwe0Var != null && z2) {
                            i(S, str, rwe0Var, arrayList);
                        }
                        rwe0 g = e7g0Var.g();
                        if (g != null && z2) {
                            i(S, str, g, arrayList);
                        }
                        long k = htkVar.k();
                        long j4 = (k + i7) - 1;
                        long j5 = j4;
                        while (true) {
                            if (j5 <= k) {
                                break;
                            }
                            long j6 = j5;
                            if (htkVar.getTimeUs(j5) + S <= kk90Var.n) {
                                k = j6;
                                break;
                            }
                            j5 = j6 - 1;
                        }
                        long j7 = k;
                        while (j7 <= j4) {
                            long timeUs = htkVar.getTimeUs(j7) + S;
                            if (timeUs <= j3 || z) {
                                j2 = S;
                                i(timeUs, str, htkVar.l(j7), arrayList);
                            } else {
                                j2 = S;
                            }
                            j7++;
                            S = j2;
                        }
                        j = S;
                        i5++;
                        kk90Var = this;
                        list2 = list;
                        i4 = i2;
                        i3 = i;
                        rskVar2 = rskVar;
                        S = j;
                    } else {
                        rskVar = rskVar2;
                        i = i3;
                        j = S;
                        try {
                            throw new DownloadException("Missing segment index");
                        } catch (IOException e5) {
                            e = e5;
                            if (!z) {
                            }
                        }
                    }
                }
                i4++;
                kk90Var = this;
            }
            i3++;
            kk90Var = this;
        }
        return arrayList;
    }
}
