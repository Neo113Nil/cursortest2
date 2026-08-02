package xsna;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.d7q;
import xsna.yn80;

/* compiled from: AdaptiveTrackSelectionFork.java */
/* loaded from: classes8.dex */
public class ik0 extends lp6 {
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

    /* compiled from: AdaptiveTrackSelectionFork.java */
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

    /* compiled from: AdaptiveTrackSelectionFork.java */
    public static class b implements d7q.b {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // xsna.d7q.b
        public final d7q[] a(d7q.a[] aVarArr, p06 p06Var) {
            int i;
            long j;
            int[] iArr;
            d7q yn80Var;
            Object obj;
            int i2;
            long j2;
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = 1;
                if (i4 >= aVarArr.length) {
                    break;
                }
                d7q.a aVar = aVarArr[i4];
                if (aVar == null || aVar.b.length <= 1) {
                    arrayList.add(null);
                } else {
                    ImmutableList.b bVar = ImmutableList.c;
                    ImmutableList.a aVar2 = new ImmutableList.a();
                    aVar2.c(new a(0L, 0L));
                    arrayList.add(aVar2);
                }
                i4++;
            }
            int length = aVarArr.length;
            long[][] jArr = new long[length][];
            int i5 = 0;
            while (true) {
                j = -1;
                if (i5 >= aVarArr.length) {
                    break;
                }
                d7q.a aVar3 = aVarArr[i5];
                if (aVar3 == null) {
                    jArr[i5] = new long[0];
                } else {
                    int[] iArr2 = aVar3.b;
                    jArr[i5] = new long[iArr2.length];
                    for (int i6 = 0; i6 < iArr2.length; i6++) {
                        long j3 = aVar3.a.d[iArr2[i6]].j;
                        long[] jArr2 = jArr[i5];
                        if (j3 == -1) {
                            j3 = 0;
                        }
                        jArr2[i6] = j3;
                    }
                    Arrays.sort(jArr[i5]);
                }
                i5++;
            }
            int[] iArr3 = new int[length];
            long[] jArr3 = new long[length];
            for (int i7 = 0; i7 < length; i7++) {
                long[] jArr4 = jArr[i7];
                jArr3[i7] = jArr4.length == 0 ? 0L : jArr4[0];
            }
            ik0.i(arrayList, jArr3);
            hw50 hw50Var = hw50.b;
            hw50Var.getClass();
            k15.h(2, "expectedValuesPerKey");
            TreeMap treeMap = new TreeMap(hw50Var);
            g740 g740Var = new g740();
            h740 h740Var = new h740(treeMap);
            h740Var.g = g740Var;
            int i8 = 0;
            while (i8 < length) {
                long[] jArr5 = jArr[i8];
                if (jArr5.length <= 1) {
                    i2 = i3;
                    j2 = j;
                } else {
                    int length2 = jArr5.length;
                    double[] dArr = new double[length2];
                    i2 = i3;
                    while (true) {
                        long[] jArr6 = jArr[i8];
                        j2 = j;
                        int length3 = jArr6.length;
                        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                        if (i3 >= length3) {
                            break;
                        }
                        long j4 = jArr6[i3];
                        if (j4 != j2) {
                            d = Math.log(j4);
                        }
                        dArr[i3] = d;
                        i3++;
                        j = j2;
                    }
                    int i9 = length2 - 1;
                    double d2 = dArr[i9] - dArr[i2];
                    int i10 = i2;
                    while (i10 < i9) {
                        double d3 = dArr[i10];
                        i10++;
                        h740Var.m(Double.valueOf(d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? 1.0d : (((d3 + dArr[i10]) * 0.5d) - dArr[i2]) / d2), Integer.valueOf(i8));
                    }
                }
                i8++;
                i3 = i2;
                j = j2;
            }
            int i11 = i3;
            ImmutableList m = ImmutableList.m(h740Var.l());
            for (int i12 = i11; i12 < m.size(); i12++) {
                int intValue = ((Integer) m.get(i12)).intValue();
                int i13 = iArr3[intValue] + 1;
                iArr3[intValue] = i13;
                jArr3[intValue] = jArr[intValue][i13];
                ik0.i(arrayList, jArr3);
            }
            for (int i14 = i11; i14 < aVarArr.length; i14++) {
                if (arrayList.get(i14) != null) {
                    jArr3[i14] = jArr3[i14] * 2;
                }
            }
            ik0.i(arrayList, jArr3);
            ImmutableList.a aVar4 = new ImmutableList.a();
            for (int i15 = i11; i15 < arrayList.size(); i15++) {
                ImmutableList.a aVar5 = (ImmutableList.a) arrayList.get(i15);
                aVar4.c(aVar5 == null ? com.google.common.collect.g.f : aVar5.g());
            }
            com.google.common.collect.g g = aVar4.g();
            d7q[] d7qVarArr = new d7q[aVarArr.length];
            int i16 = i11;
            while (i16 < aVarArr.length) {
                d7q.a aVar6 = aVarArr[i16];
                if (aVar6 != null) {
                    pfp0 pfp0Var = aVar6.a;
                    int[] iArr4 = aVar6.b;
                    if (iArr4.length != 0) {
                        if (iArr4.length == i) {
                            yn80Var = new knr(pfp0Var, iArr4[i11]);
                        } else {
                            ImmutableList immutableList = (ImmutableList) g.get(i16);
                            yn80.a aVar7 = (yn80.a) this;
                            androidx.media3.common.a[] aVarArr2 = pfp0Var.d;
                            if (pfp0Var.c == 2 && wn80.m) {
                                ArrayList arrayList2 = new ArrayList(iArr4.length);
                                int length4 = iArr4.length;
                                for (int i17 = i11; i17 < length4; i17++) {
                                    arrayList2.add(aVarArr2[iArr4[i17]].n);
                                }
                                Iterator it = arrayList2.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it.next();
                                    if (((String) obj) != null) {
                                        break;
                                    }
                                }
                                String str = (String) obj;
                                ArrayList arrayList3 = new ArrayList(iArr4.length);
                                int length5 = iArr4.length;
                                for (int i18 = i11; i18 < length5; i18++) {
                                    arrayList3.add(aVarArr2[iArr4[i18]]);
                                }
                                if (!arrayList3.isEmpty()) {
                                    Iterator it2 = arrayList3.iterator();
                                    while (it2.hasNext() && epx.f(((androidx.media3.common.a) it2.next()).n, str)) {
                                    }
                                }
                                int i19 = pfp0Var.a;
                                int[] iArr5 = new int[i19];
                                for (int i20 = i11; i20 < i19; i20++) {
                                    iArr5[i20] = i20;
                                }
                                ArrayList arrayList4 = new ArrayList();
                                for (int i21 = i11; i21 < i19; i21++) {
                                    int i22 = iArr5[i21];
                                    if (epx.f(aVarArr2[i22].n, str)) {
                                        arrayList4.add(Integer.valueOf(i22));
                                    }
                                }
                                iArr = j5g.N0(arrayList4);
                            } else {
                                iArr = iArr4;
                            }
                            yn80Var = new yn80(pfp0Var, iArr, p06Var, immutableList, aVar7.a, aVar7.b, aVar7.c, aVar7.d, iArr4, aVar7.e, aVar7.f, aVar7.g);
                        }
                        d7qVarArr[i16] = yn80Var;
                        i16++;
                        i = 1;
                    }
                }
                i16++;
                i = 1;
            }
            return d7qVarArr;
        }
    }

    public ik0(pfp0 pfp0Var, int[] iArr, p06 p06Var, long j, long j2, long j3, int i, int i2, float f, float f2, List list) {
        super(0, pfp0Var, iArr);
        if (j3 < j) {
            ahn.F("Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = p06Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = i;
        this.l = i2;
        this.m = f;
        this.n = f2;
        this.o = ImmutableList.m(list);
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

    public static long l(List list) {
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
    public int evaluateQueueSize(long j, List<? extends aq10> list) {
        if (list.isEmpty()) {
            return 0;
        }
        return k(j, list, n(((aq10) ji.a(1, list)).a()), this.l, this.k);
    }

    @Override // xsna.d7q
    public void g(long j, long j2, long j3, List<? extends aq10> list, bq10[] bq10VarArr) {
        long min;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long o = o(bq10VarArr, list);
        int i = this.s;
        if (i == 0) {
            this.s = 1;
            this.r = j(elapsedRealtime, o);
            return;
        }
        int i2 = this.r;
        int b2 = list.isEmpty() ? -1 : b(((aq10) sd9.k(list)).d);
        if (b2 != -1) {
            i = ((aq10) sd9.k(list)).e;
            i2 = b2;
        }
        int j4 = j(elapsedRealtime, o);
        if (j4 != i2 && !a(i2, elapsedRealtime)) {
            androidx.media3.common.a[] aVarArr = this.d;
            androidx.media3.common.a aVar = aVarArr[i2];
            androidx.media3.common.a aVar2 = aVarArr[j4];
            if (j3 == C.TIME_UNSET) {
                min = m(o);
            } else {
                if (o != C.TIME_UNSET) {
                    j3 -= o;
                }
                min = Math.min((long) (j3 * this.n), m(o));
            }
            int i3 = aVar2.j;
            int i4 = aVar.j;
            if ((i3 > i4 && j2 < min) || (i3 < i4 && j2 >= this.i)) {
                j4 = i2;
            }
        }
        if (j4 != i2) {
            i = 3;
        }
        this.s = i;
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

    public int j(long j, long j2) {
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

    public final int k(long j, List<? extends aq10> list, long j2, int i, int i2) {
        int i3;
        int i4;
        this.p.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.t;
        if (j3 != C.TIME_UNSET && elapsedRealtime - j3 < 1000 && (list.isEmpty() || ((aq10) sd9.k(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (aq10) sd9.k(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        if (y2r0.G(list.get(size - 1).g - j, this.q) >= j2) {
            androidx.media3.common.a aVar = this.d[j(elapsedRealtime, l(list))];
            for (int i5 = 0; i5 < size; i5++) {
                aq10 aq10Var = list.get(i5);
                androidx.media3.common.a aVar2 = aq10Var.d;
                if (y2r0.G(aq10Var.g - j, this.q) >= j2 && aVar2.j < aVar.j && (i3 = aVar2.v) != -1 && i3 <= i && (i4 = aVar2.u) != -1 && i4 <= i2 && i3 < aVar.v) {
                    return i5;
                }
            }
        }
        return size;
    }

    public long m(long j) {
        throw null;
    }

    public long n(long j) {
        throw null;
    }

    public final long o(bq10[] bq10VarArr, List<? extends aq10> list) {
        int i = this.r;
        if (i < bq10VarArr.length && bq10VarArr[i].next()) {
            bq10 bq10Var = bq10VarArr[this.r];
            return bq10Var.b() - bq10Var.a();
        }
        for (bq10 bq10Var2 : bq10VarArr) {
            if (bq10Var2.next()) {
                return bq10Var2.b() - bq10Var2.a();
            }
        }
        return l(list);
    }

    @Override // xsna.lp6, xsna.d7q
    public final void onPlaybackSpeed(float f) {
        this.q = f;
    }
}
