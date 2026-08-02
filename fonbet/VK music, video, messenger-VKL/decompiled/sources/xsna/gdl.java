package xsna;

import android.net.Uri;
import android.os.SystemClock;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.dash.e;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.b;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import xsna.bq10;
import xsna.co8;

/* compiled from: DefaultDashChunkSourceFork.java */
/* loaded from: classes8.dex */
public class gdl implements androidx.media3.exoplayer.dash.b {
    public final grz a;
    public final wp6 b;
    public final int[] c;
    public final int d;
    public final androidx.media3.datasource.a e;
    public final long f;
    public final qo10 g;

    @Nullable
    public final e.c h;
    public final a[] i;
    public d7q j;
    public rsk k;
    public int l;

    @Nullable
    public BehindLiveWindowException m;
    public boolean n;

    /* compiled from: DefaultDashChunkSourceFork.java */
    public static final class a {

        @Nullable
        public final dcc a;
        public final e7g0 b;
        public final tp6 c;

        @Nullable
        public final btk d;
        public final long e;
        public final long f;

        public a(long j, e7g0 e7g0Var, tp6 tp6Var, @Nullable dcc dccVar, long j2, @Nullable btk btkVar) {
            this.e = j;
            this.b = e7g0Var;
            this.c = tp6Var;
            this.f = j2;
            this.a = dccVar;
            this.d = btkVar;
        }

        @CheckResult
        public final a a(long j, e7g0 e7g0Var) throws BehindLiveWindowException {
            long h;
            long h2;
            btk e = this.b.e();
            btk e2 = e7g0Var.e();
            if (e == null) {
                return new a(j, e7g0Var, this.c, this.a, this.f, e);
            }
            if (!e.d()) {
                return new a(j, e7g0Var, this.c, this.a, this.f, e2);
            }
            long i = e.i(j);
            if (i == 0) {
                return new a(j, e7g0Var, this.c, this.a, this.f, e2);
            }
            e2.getClass();
            long k = e.k();
            long timeUs = e.getTimeUs(k);
            long j2 = i + k;
            long j3 = j2 - 1;
            long a = e.a(j3, j) + e.getTimeUs(j3);
            long k2 = e2.k();
            long timeUs2 = e2.getTimeUs(k2);
            long j4 = this.f;
            if (a == timeUs2) {
                h = j2 - k2;
            } else {
                if (a < timeUs2) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs2 < timeUs) {
                    h2 = j4 - (e2.h(timeUs, j) - k);
                    return new a(j, e7g0Var, this.c, this.a, h2, e2);
                }
                h = e.h(timeUs2, j) - k2;
            }
            h2 = h + j4;
            return new a(j, e7g0Var, this.c, this.a, h2, e2);
        }

        public final long b(long j) {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.f(this.e, j) + this.f;
        }

        public final long c() {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.k() + this.f;
        }

        public final long d(long j) {
            long b = b(j);
            btk btkVar = this.d;
            btkVar.getClass();
            return (btkVar.n(this.e, j) + b) - 1;
        }

        public final long e() {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.i(this.e);
        }

        public final long f(long j) {
            long h = h(j);
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.a(j - this.f, this.e) + h;
        }

        public final long g(long j) {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.h(j, this.e) + this.f;
        }

        public final long h(long j) {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.getTimeUs(j - this.f);
        }

        public final boolean i(long j, long j2) {
            btk btkVar = this.d;
            btkVar.getClass();
            return btkVar.d() || j2 == C.TIME_UNSET || f(j) <= j2;
        }
    }

    /* compiled from: DefaultDashChunkSourceFork.java */
    public static final class b extends sg6 {
        public final a e;

        public b(a aVar, long j, long j2) {
            super(j, j2);
            this.e = aVar;
        }

        @Override // xsna.bq10
        public final long a() {
            c();
            return this.e.h(this.d);
        }

        @Override // xsna.bq10
        public final long b() {
            c();
            return this.e.f(this.d);
        }
    }

    public gdl(co8.b bVar, grz grzVar, rsk rskVar, wp6 wp6Var, int i, int[] iArr, d7q d7qVar, int i2, androidx.media3.datasource.a aVar, long j, qo10 qo10Var, boolean z, ArrayList arrayList, @Nullable e.c cVar, x1b0 x1b0Var) {
        this.a = grzVar;
        this.k = rskVar;
        this.b = wp6Var;
        this.c = iArr;
        this.j = d7qVar;
        int i3 = i2;
        this.d = i3;
        this.e = aVar;
        this.l = i;
        this.f = j;
        this.g = qo10Var;
        e.c cVar2 = cVar;
        this.h = cVar2;
        long d = rskVar.d(i);
        ArrayList<e7g0> h = h();
        this.i = new a[d7qVar.length()];
        int i4 = 0;
        while (i4 < this.i.length) {
            e7g0 e7g0Var = h.get(d7qVar.getIndexInTrackGroup(i4));
            tp6 e = wp6Var.e(e7g0Var.c);
            a[] aVarArr = this.i;
            tp6 tp6Var = e == null ? e7g0Var.c.get(0) : e;
            co8 a2 = bVar.a(i3, e7g0Var.b, z, arrayList, cVar2);
            long j2 = d;
            aVarArr[i4] = new a(j2, e7g0Var, tp6Var, a2, 0L, e7g0Var.e());
            i4++;
            cVar2 = cVar;
            d = j2;
            i3 = i2;
        }
    }

    public static izw i(a aVar, androidx.media3.datasource.a aVar2, androidx.media3.common.a aVar3, int i, @Nullable Object obj, @Nullable rwe0 rwe0Var, @Nullable rwe0 rwe0Var2) {
        rwe0 rwe0Var3 = rwe0Var;
        e7g0 e7g0Var = aVar.b;
        tp6 tp6Var = aVar.c;
        if (rwe0Var3 != null) {
            rwe0 a2 = rwe0Var3.a(rwe0Var2, tp6Var.a);
            if (a2 != null) {
                rwe0Var3 = a2;
            }
        } else {
            rwe0Var2.getClass();
            rwe0Var3 = rwe0Var2;
        }
        return new izw(aVar2, ctk.a(e7g0Var, tp6Var.a, rwe0Var3, 0, com.google.common.collect.h.h), aVar3, i, obj, aVar.a);
    }

    public static rg6 j(a aVar, androidx.media3.datasource.a aVar2, int i, androidx.media3.common.a aVar3, int i2, @Nullable Object obj, long j, int i3, long j2, long j3) {
        long j4;
        e7g0 e7g0Var = aVar.b;
        tp6 tp6Var = aVar.c;
        long h = aVar.h(j);
        btk btkVar = aVar.d;
        btkVar.getClass();
        long j5 = aVar.f;
        rwe0 l = btkVar.l(j - j5);
        if (aVar.a == null) {
            long f = aVar.f(j);
            int i4 = aVar.i(j, j3) ? 0 : 8;
            Map map = Collections.EMPTY_MAP;
            Uri d = neq0.d(tp6Var.a, l.c);
            long j6 = l.a;
            long j7 = l.b;
            String c = ctk.c(e7g0Var, l);
            com.google.common.collect.h hVar = com.google.common.collect.h.h;
            Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
            fxc0.t(d, "The uri must be set.");
            return new vvj0(aVar2, new evk(d, 0L, 1, null, hVar, j6, j7, c, i4, valueOf), aVar3, i2, obj, h, f, j, i, aVar3);
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            j4 = h;
            if (i5 >= i3) {
                break;
            }
            btkVar.getClass();
            rwe0 a2 = l.a(btkVar.l((j + i5) - j5), tp6Var.a);
            if (a2 == null) {
                break;
            }
            i6++;
            i5++;
            l = a2;
            h = j4;
        }
        long j8 = (j + i6) - 1;
        long f2 = aVar.f(j8);
        long j9 = aVar.e;
        if (j9 == C.TIME_UNSET || j9 > f2) {
            j9 = -9223372036854775807L;
        }
        int i7 = aVar.i(j8, j3) ? 0 : 8;
        Map map2 = Collections.EMPTY_MAP;
        Uri d2 = neq0.d(tp6Var.a, l.c);
        long j10 = l.a;
        long j11 = l.b;
        String c2 = ctk.c(e7g0Var, l);
        com.google.common.collect.h hVar2 = com.google.common.collect.h.h;
        Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime());
        fxc0.t(d2, "The uri must be set.");
        evk evkVar = new evk(d2, 0L, 1, null, hVar2, j10, j11, c2, i7, valueOf2);
        long j12 = -e7g0Var.d;
        if (io20.n(aVar3.n)) {
            j12 += j4;
        }
        return new zej(aVar2, evkVar, aVar3, i2, obj, j4, f2, j2, j9, j, i6, j12, aVar.a);
    }

    @Override // xsna.kcc
    public final long a(long j, o3i0 o3i0Var) {
        long j2 = j;
        a[] aVarArr = this.i;
        int length = aVarArr.length;
        int i = 0;
        while (i < length) {
            a aVar = aVarArr[i];
            if (aVar.d != null) {
                long e = aVar.e();
                if (e != 0) {
                    long g = aVar.g(j2);
                    long h = aVar.h(g);
                    return o3i0Var.a(j2, h, (h >= j2 || (e != -1 && g >= (aVar.c() + e) - 1)) ? h : aVar.h(g + 1));
                }
            }
            i++;
            j2 = j;
        }
        return j;
    }

    @Override // xsna.kcc
    public boolean b(ccc cccVar, boolean z, b.c cVar, androidx.media3.exoplayer.upstream.b bVar) {
        b.C0065b a2;
        long j;
        if (z) {
            e.c cVar2 = this.h;
            if (cVar2 == null || !cVar2.i(cccVar)) {
                boolean z2 = this.k.d;
                a[] aVarArr = this.i;
                if (!z2 && (cccVar instanceof aq10)) {
                    IOException iOException = cVar.a;
                    if ((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
                        a aVar = aVarArr[this.j.b(cccVar.d)];
                        long e = aVar.e();
                        if (e != -1 && e != 0) {
                            if (((aq10) cccVar).b() > (aVar.c() + e) - 1) {
                                this.n = true;
                                return true;
                            }
                        }
                    }
                }
                a aVar2 = aVarArr[this.j.b(cccVar.d)];
                e7g0 e7g0Var = aVar2.b;
                tp6 tp6Var = aVar2.c;
                ImmutableList<tp6> immutableList = e7g0Var.c;
                wp6 wp6Var = this.b;
                tp6 e2 = wp6Var.e(immutableList);
                if (e2 == null || tp6Var.equals(e2)) {
                    d7q d7qVar = this.j;
                    ImmutableList<tp6> immutableList2 = aVar2.b.c;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int length = d7qVar.length();
                    int i = 0;
                    for (int i2 = 0; i2 < length; i2++) {
                        if (d7qVar.a(i2, elapsedRealtime)) {
                            i++;
                        }
                    }
                    int b2 = wp6.b(immutableList2);
                    b.a aVar3 = new b.a(b2, b2 - wp6Var.c(immutableList2), length, i);
                    if ((aVar3.a(2) || aVar3.a(1)) && (a2 = bVar.a(aVar3, cVar)) != null) {
                        long j2 = a2.b;
                        int i3 = a2.a;
                        if (aVar3.a(i3)) {
                            if (i3 == 2) {
                                d7q d7qVar2 = this.j;
                                return d7qVar2.d(d7qVar2.b(cccVar.d), j2);
                            }
                            if (i3 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j2;
                                String str = tp6Var.b;
                                HashMap hashMap = wp6Var.a;
                                if (hashMap.containsKey(str)) {
                                    Long l = (Long) hashMap.get(str);
                                    String str2 = y2r0.a;
                                    j = Math.max(elapsedRealtime2, l.longValue());
                                } else {
                                    j = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j));
                                int i4 = tp6Var.c;
                                if (i4 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i4);
                                    HashMap hashMap2 = wp6Var.b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l2 = (Long) hashMap2.get(valueOf);
                                        String str3 = y2r0.a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l2.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.kcc
    public final boolean c(long j, ccc cccVar, List<? extends aq10> list) {
        if (this.m != null) {
            return false;
        }
        return this.j.h(j, cccVar, list);
    }

    @Override // androidx.media3.exoplayer.dash.b
    public final void d(d7q d7qVar) {
        this.j = d7qVar;
    }

    @Override // androidx.media3.exoplayer.dash.b
    public final void f(rsk rskVar, int i) {
        a[] aVarArr = this.i;
        try {
            this.k = rskVar;
            this.l = i;
            long d = rskVar.d(i);
            ArrayList<e7g0> h = h();
            for (int i2 = 0; i2 < aVarArr.length; i2++) {
                aVarArr[i2] = aVarArr[i2].a(d, h.get(this.j.getIndexInTrackGroup(i2)));
            }
        } catch (BehindLiveWindowException e) {
            this.m = e;
        }
    }

    @Override // xsna.kcc
    public void g(androidx.media3.exoplayer.f fVar, long j, List<? extends aq10> list, ecc eccVar) {
        List<? extends aq10> list2;
        aq10 aq10Var;
        a[] aVarArr;
        long j2;
        long j3;
        long j4;
        long j5;
        long k;
        long S;
        if (this.m != null) {
            return;
        }
        long j6 = fVar.a;
        long j7 = j - j6;
        long S2 = y2r0.S(this.k.b(this.l).b) + y2r0.S(this.k.a) + j;
        e.c cVar = this.h;
        if (cVar == null || !cVar.h(S2)) {
            long S3 = y2r0.S(y2r0.E(this.f));
            rsk rskVar = this.k;
            long j8 = rskVar.a;
            long j9 = C.TIME_UNSET;
            long S4 = j8 == C.TIME_UNSET ? -9223372036854775807L : S3 - y2r0.S(j8 + rskVar.b(this.l).b);
            if (list.isEmpty()) {
                list2 = list;
                aq10Var = null;
            } else {
                list2 = list;
                aq10Var = (aq10) ji.a(1, list2);
            }
            int length = this.j.length();
            bq10[] bq10VarArr = new bq10[length];
            int i = 0;
            while (true) {
                aVarArr = this.i;
                if (i >= length) {
                    break;
                }
                a aVar = aVarArr[i];
                long j10 = j9;
                btk btkVar = aVar.d;
                bq10.a aVar2 = bq10.a;
                if (btkVar == null) {
                    bq10VarArr[i] = aVar2;
                } else {
                    long b2 = aVar.b(S3);
                    long d = aVar.d(S3);
                    long b3 = aq10Var != null ? aq10Var.b() : y2r0.k(aVar.g(j), b2, d);
                    if (b3 < b2) {
                        bq10VarArr[i] = aVar2;
                    } else {
                        bq10VarArr[i] = new b(k(i), b3, d);
                    }
                }
                i++;
                j9 = j10;
            }
            long j11 = j9;
            if (!this.k.d || aVarArr[0].e() == 0) {
                j2 = j6;
                j3 = j11;
            } else {
                long f = aVarArr[0].f(aVarArr[0].d(S3));
                rsk rskVar2 = this.k;
                long j12 = rskVar2.a;
                if (j12 == j11) {
                    j2 = j6;
                    S = j11;
                } else {
                    j2 = j6;
                    S = S3 - y2r0.S(j12 + rskVar2.b(this.l).b);
                }
                j3 = Math.max(0L, Math.min(S, f) - j2);
            }
            this.j.g(j2, j7, j3, list2, bq10VarArr);
            int selectedIndex = this.j.getSelectedIndex();
            SystemClock.elapsedRealtime();
            a k2 = k(selectedIndex);
            e7g0 e7g0Var = k2.b;
            dcc dccVar = k2.a;
            androidx.media3.datasource.a aVar3 = this.e;
            if (dccVar != null) {
                rwe0 rwe0Var = dccVar.d() == null ? e7g0Var.h : null;
                rwe0 g = k2.d == null ? e7g0Var.g() : null;
                if (rwe0Var != null || g != null) {
                    eccVar.a = i(k2, aVar3, this.j.getSelectedFormat(), this.j.getSelectionReason(), this.j.getSelectionData(), rwe0Var, g);
                    return;
                }
            }
            long j13 = k2.e;
            rsk rskVar3 = this.k;
            boolean z = rskVar3.d && this.l == rskVar3.m.size() - 1;
            boolean z2 = (z && j13 == j11) ? false : true;
            if (k2.e() == 0) {
                eccVar.b = z2;
                return;
            }
            long b4 = k2.b(S3);
            long d2 = k2.d(S3);
            if (z) {
                long f2 = k2.f(d2);
                z2 &= (f2 - k2.h(d2)) + f2 >= j13;
            }
            if (aq10Var != null) {
                j5 = d2;
                k = aq10Var.b();
                j4 = j;
            } else {
                j4 = j;
                j5 = d2;
                k = y2r0.k(k2.g(j4), b4, j5);
            }
            if (k < b4) {
                this.m = new BehindLiveWindowException();
                return;
            }
            if (k > j5 || (this.n && k >= j5)) {
                eccVar.b = z2;
                return;
            }
            if (z2 && k2.h(k) >= j13) {
                eccVar.b = true;
                return;
            }
            int min = (int) Math.min(this.g.f(y2r0.j0(r5), y2r0.j0(j4), y2r0.j0(k2.f(k) - k2.h(k)), fr10.b(this.j.getTrackGroup().c, e7g0Var.b)), (j5 - k) + 1);
            if (j13 != j11) {
                while (min > 1 && k2.h((min + k) - 1) >= j13) {
                    min--;
                }
            }
            eccVar.a = j(k2, aVar3, this.d, this.j.getSelectedFormat(), this.j.getSelectionReason(), this.j.getSelectionData(), k, min, list.isEmpty() ? j4 : j11, S4);
        }
    }

    @Override // xsna.kcc
    public final int getPreferredQueueSize(long j, List<? extends aq10> list) {
        return (this.m != null || this.j.length() < 2) ? list.size() : this.j.evaluateQueueSize(j, list);
    }

    public final ArrayList<e7g0> h() {
        List<cj0> list = this.k.b(this.l).c;
        ArrayList<e7g0> arrayList = new ArrayList<>();
        for (int i : this.c) {
            arrayList.addAll(list.get(i).c);
        }
        return arrayList;
    }

    public final a k(int i) {
        a[] aVarArr = this.i;
        a aVar = aVarArr[i];
        tp6 e = this.b.e(aVar.b.c);
        if (e == null || e.equals(aVar.c)) {
            return aVar;
        }
        a aVar2 = new a(aVar.e, aVar.b, e, aVar.a, aVar.f, aVar.d);
        aVarArr[i] = aVar2;
        return aVar2;
    }

    @Override // xsna.kcc
    public final void maybeThrowError() throws IOException {
        BehindLiveWindowException behindLiveWindowException = this.m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        this.a.maybeThrowError();
    }

    @Override // xsna.kcc
    public final void release() {
        for (a aVar : this.i) {
            dcc dccVar = aVar.a;
            if (dccVar != null) {
                dccVar.release();
            }
        }
    }
}
