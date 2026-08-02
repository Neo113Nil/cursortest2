package xsna;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.d7q;

/* compiled from: AdaptiveTrackSelection.java */
/* loaded from: classes12.dex */
public final class gk0 extends lp6 {
    public final p06 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final ImmutableList<a> o;
    public final ypn0 p;
    public float q;
    public int r;
    public int s;
    public long t;

    @Nullable
    public aq10 u;

    /* compiled from: AdaptiveTrackSelection.java */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (((int) this.a) * 31) + ((int) this.b);
        }
    }

    /* compiled from: AdaptiveTrackSelection.java */
    public static class b implements d7q.b {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.d7q.b
        public final d7q[] a(d7q.a[] aVarArr, p06 p06Var) {
            long j;
            d7q gk0Var;
            int i;
            long j2;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (d7q.a aVar : aVarArr) {
                if (aVar == null || aVar.b.length <= 1) {
                    arrayList.add(null);
                } else {
                    ImmutableList.b bVar = ImmutableList.c;
                    ImmutableList.a aVar2 = new ImmutableList.a();
                    aVar2.c(new a(0L, 0L));
                    arrayList.add(aVar2);
                }
            }
            int length = aVarArr.length;
            long[][] jArr = new long[length][];
            int i3 = 0;
            while (true) {
                j = -1;
                if (i3 >= aVarArr.length) {
                    break;
                }
                d7q.a aVar3 = aVarArr[i3];
                if (aVar3 == null) {
                    jArr[i3] = new long[0];
                } else {
                    int[] iArr = aVar3.b;
                    jArr[i3] = new long[iArr.length];
                    for (int i4 = 0; i4 < iArr.length; i4++) {
                        long j3 = aVar3.a.d[iArr[i4]].j;
                        long[] jArr2 = jArr[i3];
                        if (j3 == -1) {
                            j3 = 0;
                        }
                        jArr2[i4] = j3;
                    }
                    Arrays.sort(jArr[i3]);
                }
                i3++;
            }
            int[] iArr2 = new int[length];
            long[] jArr3 = new long[length];
            for (int i5 = 0; i5 < length; i5++) {
                long[] jArr4 = jArr[i5];
                jArr3[i5] = jArr4.length == 0 ? 0L : jArr4[0];
            }
            gk0.i(arrayList, jArr3);
            hw50 hw50Var = hw50.b;
            hw50Var.getClass();
            k15.h(2, "expectedValuesPerKey");
            TreeMap treeMap = new TreeMap(hw50Var);
            g740 g740Var = new g740();
            h740 h740Var = new h740(treeMap);
            h740Var.g = g740Var;
            int i6 = 0;
            while (i6 < length) {
                long[] jArr5 = jArr[i6];
                if (jArr5.length <= 1) {
                    i = i2;
                    j2 = j;
                } else {
                    int length2 = jArr5.length;
                    double[] dArr = new double[length2];
                    int i7 = i2;
                    while (true) {
                        long[] jArr6 = jArr[i6];
                        i = i2;
                        int length3 = jArr6.length;
                        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        if (i7 >= length3) {
                            break;
                        }
                        long j4 = j;
                        long j5 = jArr6[i7];
                        if (j5 != j4) {
                            d = Math.log(j5);
                        }
                        dArr[i7] = d;
                        i7++;
                        i2 = i;
                        j = j4;
                    }
                    j2 = j;
                    int i8 = length2 - 1;
                    double d2 = dArr[i8] - dArr[i];
                    int i9 = i;
                    while (i9 < i8) {
                        double d3 = dArr[i9];
                        i9++;
                        h740Var.m(Double.valueOf(d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? 1.0d : (((d3 + dArr[i9]) * 0.5d) - dArr[i]) / d2), Integer.valueOf(i6));
                    }
                }
                i6++;
                i2 = i;
                j = j2;
            }
            int i10 = i2;
            ImmutableList m = ImmutableList.m(h740Var.l());
            for (int i11 = i10; i11 < m.size(); i11++) {
                int intValue = ((Integer) m.get(i11)).intValue();
                int i12 = iArr2[intValue] + 1;
                iArr2[intValue] = i12;
                jArr3[intValue] = jArr[intValue][i12];
                gk0.i(arrayList, jArr3);
            }
            for (int i13 = i10; i13 < aVarArr.length; i13++) {
                if (arrayList.get(i13) != null) {
                    jArr3[i13] = jArr3[i13] * 2;
                }
            }
            gk0.i(arrayList, jArr3);
            ImmutableList.a aVar4 = new ImmutableList.a();
            for (int i14 = i10; i14 < arrayList.size(); i14++) {
                ImmutableList.a aVar5 = (ImmutableList.a) arrayList.get(i14);
                aVar4.c(aVar5 == null ? com.google.common.collect.g.f : aVar5.g());
            }
            com.google.common.collect.g g = aVar4.g();
            d7q[] d7qVarArr = new d7q[aVarArr.length];
            for (int i15 = i10; i15 < aVarArr.length; i15++) {
                d7q.a aVar6 = aVarArr[i15];
                if (aVar6 != null) {
                    int[] iArr3 = aVar6.b;
                    if (iArr3.length != 0) {
                        if (iArr3.length == 1) {
                            gk0Var = new knr(aVar6.a, iArr3[i10]);
                        } else {
                            long j6 = 25000;
                            gk0Var = new gk0(aVar6.a, iArr3, p06Var, 10000, j6, j6, (ImmutableList) g.get(i15));
                        }
                        d7qVarArr[i15] = gk0Var;
                    }
                }
            }
            return d7qVarArr;
        }
    }

    public gk0(pfp0 pfp0Var, int[] iArr, p06 p06Var, long j, long j2, long j3, ImmutableList immutableList) {
        super(0, pfp0Var, iArr);
        if (j3 < j) {
            ahn.F("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = p06Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = ImmutableList.m(immutableList);
        this.p = dvf.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = C.TIME_UNSET;
    }

    public static void i(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ImmutableList.a aVar = (ImmutableList.a) arrayList.get(i);
            if (aVar != null) {
                aVar.c(new a(j, jArr[i]));
            }
        }
    }

    public static long k(List list) {
        if (!list.isEmpty()) {
            aq10 aq10Var = (aq10) sd9.k(list);
            long j = aq10Var.g;
            if (j != C.TIME_UNSET) {
                long j2 = aq10Var.h;
                if (j2 != C.TIME_UNSET) {
                    return j2 - j;
                }
            }
        }
        return C.TIME_UNSET;
    }

    @Override // xsna.lp6, xsna.d7q
    public final void disable() {
        this.u = null;
    }

    @Override // xsna.lp6, xsna.d7q
    public final void enable() {
        this.t = C.TIME_UNSET;
        this.u = null;
    }

    @Override // xsna.lp6, xsna.d7q
    public final int evaluateQueueSize(long j, List<? extends aq10> list) {
        int i;
        int i2;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != C.TIME_UNSET && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((aq10) sd9.k(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (aq10) sd9.k(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long G = y2r0.G(list.get(size - 1).g - j, this.q);
        long j3 = this.j;
        if (G >= j3) {
            androidx.media3.common.a aVar = this.d[j(elapsedRealtime, k(list))];
            for (int i3 = 0; i3 < size; i3++) {
                aq10 aq10Var = list.get(i3);
                androidx.media3.common.a aVar2 = aq10Var.d;
                if (y2r0.G(aq10Var.g - j, this.q) >= j3 && aVar2.j < aVar.j && (i = aVar2.v) != -1 && i <= this.l && (i2 = aVar2.u) != -1 && i2 <= this.k && i < aVar.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // xsna.d7q
    public final void g(long j, long j2, long j3, List<? extends aq10> list, bq10[] bq10VarArr) {
        long k;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        if (i >= bq10VarArr.length || !bq10VarArr[i].next()) {
            int length = bq10VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    k = k(list);
                    break;
                }
                bq10 bq10Var = bq10VarArr[i2];
                if (bq10Var.next()) {
                    k = bq10Var.b() - bq10Var.a();
                    break;
                }
                i2++;
            }
        } else {
            bq10 bq10Var2 = bq10VarArr[this.r];
            k = bq10Var2.b() - bq10Var2.a();
        }
        int i3 = this.s;
        if (i3 == 0) {
            this.s = 1;
            this.r = j(elapsedRealtime, k);
            return;
        }
        int i4 = this.r;
        int b2 = list.isEmpty() ? -1 : b(((aq10) sd9.k(list)).d);
        if (b2 != -1) {
            i3 = ((aq10) sd9.k(list)).e;
            i4 = b2;
        }
        int j4 = j(elapsedRealtime, k);
        if (j4 != i4 && !a(i4, elapsedRealtime)) {
            androidx.media3.common.a[] aVarArr = this.d;
            androidx.media3.common.a aVar = aVarArr[i4];
            androidx.media3.common.a aVar2 = aVarArr[j4];
            long j5 = this.h;
            if (j3 != C.TIME_UNSET) {
                j5 = Math.min((long) ((k != C.TIME_UNSET ? j3 - k : j3) * this.n), j5);
            }
            int i5 = aVar2.j;
            int i6 = aVar.j;
            if ((i5 > i6 && j2 < j5) || (i5 < i6 && j2 >= this.i)) {
                j4 = i4;
            }
        }
        if (j4 != i4) {
            i3 = 3;
        }
        this.s = i3;
        this.r = j4;
    }

    @Override // xsna.d7q
    public final int getSelectedIndex() {
        return this.r;
    }

    @Override // xsna.d7q
    @Nullable
    public final Object getSelectionData() {
        return null;
    }

    @Override // xsna.d7q
    public final int getSelectionReason() {
        return this.s;
    }

    public final int j(long j, long j2) {
        long j3;
        p06 p06Var = this.g;
        long bitrateEstimate = (long) (p06Var.getBitrateEstimate() * this.m);
        long a2 = p06Var.a();
        if (a2 == C.TIME_UNSET || j2 == C.TIME_UNSET) {
            j3 = (long) (bitrateEstimate / this.q);
        } else {
            float f = j2;
            j3 = (long) ((bitrateEstimate * Math.max((f / this.q) - a2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) / f);
        }
        ImmutableList<a> immutableList = this.o;
        if (!immutableList.isEmpty()) {
            int i = 1;
            while (i < immutableList.size() - 1 && immutableList.get(i).a < j3) {
                i++;
            }
            a aVar = immutableList.get(i - 1);
            a aVar2 = immutableList.get(i);
            long j4 = aVar.a;
            long j5 = aVar.b;
            j3 = ((long) (((j3 - j4) / (aVar2.a - j4)) * (aVar2.b - j5))) + j5;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= j3) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // xsna.lp6, xsna.d7q
    public final void onPlaybackSpeed(float f) {
        this.q = f;
    }
}
