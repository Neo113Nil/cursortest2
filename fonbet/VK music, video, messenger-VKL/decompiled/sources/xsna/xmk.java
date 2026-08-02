package xsna;

import android.net.Uri;
import androidx.media3.datasource.cache.a;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.f;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import xsna.kr10;

/* compiled from: CustomDashDownloader.java */
/* loaded from: classes3.dex */
public final class xmk extends androidx.media3.exoplayer.offline.f<rsk> {
    public final long n;
    public final double o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xmk(Uri uri, List list, a.b bVar, long j, efr efrVar) {
        super(new kr10("", new kr10.c(r1), uri != null ? new kr10.f(uri, null, null, (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list)), null, r9, C.TIME_UNSET) : null, new kr10.e(r2), vr10.B, kr10.g.a), efrVar, bVar, new ddk(), 0L, C.TIME_UNSET);
        kr10.b.a aVar = new kr10.b.a();
        new kr10.d.a();
        List list2 = Collections.EMPTY_LIST;
        com.google.common.collect.g gVar = com.google.common.collect.g.f;
        kr10.e.a aVar2 = new kr10.e.a();
        this.n = j;
        this.o = 0.1d;
    }

    public static void i(long j, String str, rwe0 rwe0Var, ArrayList<f.c> arrayList) {
        arrayList.add(new f.c(j, new evk(neq0.d(str, rwe0Var.c), rwe0Var.a, rwe0Var.b, 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126 A[SYNTHETIC] */
    @Override // androidx.media3.exoplayer.offline.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List e(androidx.media3.datasource.cache.a aVar, uer uerVar, boolean z) throws IOException, InterruptedException {
        rsk rskVar;
        int i;
        long j;
        long j2;
        List<cj0> list;
        int i2;
        int i3;
        btk e;
        fcc b;
        btk htkVar;
        xmk xmkVar = this;
        rsk rskVar2 = (rsk) uerVar;
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (i4 < rskVar2.m.size()) {
            jx90 b2 = rskVar2.b(i4);
            long j3 = b2.b;
            UUID uuid = tu8.a;
            long S = y2r0.S(j3);
            long d = rskVar2.d(i4);
            List<cj0> list2 = b2.c;
            int i5 = 0;
            while (i5 < list2.size()) {
                long millis = TimeUnit.MILLISECONDS.toMillis(rskVar2.b);
                cj0 cj0Var = list2.get(i5);
                int i6 = 0;
                while (i6 < cj0Var.c.size()) {
                    e7g0 e7g0Var = cj0Var.c.get(i6);
                    try {
                        i3 = cj0Var.b;
                        e = e7g0Var.e();
                    } catch (IOException e2) {
                        e = e2;
                        rskVar = rskVar2;
                    }
                    if (e != null) {
                        rskVar = rskVar2;
                    } else {
                        rskVar = rskVar2;
                        try {
                            b = ctk.b(aVar, i3, e7g0Var);
                        } catch (IOException e3) {
                            e = e3;
                            i = i4;
                            j = S;
                            j2 = d;
                            list = list2;
                            i2 = i5;
                            if (!z) {
                                throw e;
                            }
                            i6++;
                            xmkVar = this;
                            list2 = list;
                            rskVar2 = rskVar;
                            i5 = i2;
                            i4 = i;
                            d = j2;
                            S = j;
                        }
                        if (b == null) {
                            e = null;
                        } else {
                            list = list2;
                            i2 = i5;
                            try {
                                htkVar = new htk(b, e7g0Var.d);
                            } catch (IOException e4) {
                                e = e4;
                                i = i4;
                                j = S;
                                j2 = d;
                                if (!z) {
                                }
                            }
                            if (htkVar == null) {
                                long i7 = htkVar.i(d);
                                if (i7 == -1) {
                                    throw new DownloadException("Unbounded segment index");
                                }
                                i = i4;
                                long j4 = xmkVar.n;
                                double d2 = xmkVar.o;
                                boolean z2 = S <= j4 || ((double) S) <= ((double) millis) * d2;
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
                                long j5 = (i7 + k) - 1;
                                while (k <= j5) {
                                    long j6 = S;
                                    long timeUs = htkVar.getTimeUs(k) + j6;
                                    long j7 = d;
                                    if (timeUs <= j4 || timeUs <= millis * d2) {
                                        i(timeUs, str, htkVar.l(k), arrayList);
                                    }
                                    k++;
                                    d = j7;
                                    S = j6;
                                }
                                j = S;
                                j2 = d;
                                i6++;
                                xmkVar = this;
                                list2 = list;
                                rskVar2 = rskVar;
                                i5 = i2;
                                i4 = i;
                                d = j2;
                                S = j;
                            } else {
                                i = i4;
                                j = S;
                                j2 = d;
                                try {
                                    throw new DownloadException("Missing segment index");
                                } catch (IOException e5) {
                                    e = e5;
                                    if (!z) {
                                    }
                                }
                            }
                        }
                    }
                    i2 = i5;
                    htkVar = e;
                    list = list2;
                    if (htkVar == null) {
                    }
                }
                i5++;
                xmkVar = this;
            }
            i4++;
            xmkVar = this;
        }
        return arrayList;
    }
}
