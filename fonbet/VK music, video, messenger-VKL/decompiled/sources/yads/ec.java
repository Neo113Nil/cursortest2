package yads;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* loaded from: classes10.dex */
public final class ec extends to {
    public final im g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final s51 o;
    public final xv p;
    public float q;
    public int r;
    public int s;
    public long t;
    public jo u;

    public ec(l83 l83Var, int[] iArr, int i, im imVar, long j, long j2, long j3, int i2, int i3, float f, float f2, s51 s51Var, xv xvVar) {
        super(l83Var, iArr);
        long j4;
        if (j3 < j) {
            ji1.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j4 = j;
        } else {
            j4 = j3;
        }
        this.g = imVar;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j4 * 1000;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = s51.a((Collection) s51Var);
        this.p = xvVar;
        this.q = 1.0f;
        this.s = 0;
        this.t = C.TIME_UNSET;
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            o51 o51Var = (o51) arrayList.get(i);
            if (o51Var != null) {
                o51Var.a(new cc(j, jArr[i]));
            }
        }
    }

    @Override // yads.pp0
    public final int d() {
        return this.s;
    }

    @Override // yads.to, yads.pp0
    public final void disable() {
        this.u = null;
    }

    @Override // yads.pp0
    public final int e() {
        return this.r;
    }

    @Override // yads.pp0
    public final Object g() {
        return null;
    }

    public final int a(long j) {
        long j2;
        dc0 dc0Var = (dc0) this.g;
        synchronized (dc0Var) {
            j2 = dc0Var.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((cc) this.o.get(i)).a < j4) {
                i++;
            }
            cc ccVar = (cc) this.o.get(i - 1);
            cc ccVar2 = (cc) this.o.get(i);
            long j5 = ccVar.a;
            long j6 = ccVar.b;
            j4 = j6 + ((long) (((j4 - j5) / (ccVar2.a - j5)) * (ccVar2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !b(i3, j)) {
                if (a(i3).i <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    @Override // yads.to, yads.pp0
    public final void a() {
        this.t = C.TIME_UNSET;
        this.u = null;
    }

    @Override // yads.to, yads.pp0
    public final int a(long j, List list) {
        int i;
        int i2;
        ((j63) this.p).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != C.TIME_UNSET && elapsedRealtime - j2 < 1000 && (list.isEmpty() || ((jo) yd1.a(list)).equals(this.u))) {
            return list.size();
        }
        this.t = elapsedRealtime;
        this.u = list.isEmpty() ? null : (jo) yd1.a(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long j3 = ((jo) list.get(size - 1)).g - j;
        float f = this.q;
        int i3 = mc3.a;
        if (f != 1.0f) {
            j3 = Math.round(j3 / f);
        }
        long j4 = this.j;
        if (j3 >= j4) {
            if (!list.isEmpty()) {
                long j5 = ((jo) yd1.a(list)).g;
            }
            nx0 nx0Var = this.d[a(elapsedRealtime)];
            for (int i4 = 0; i4 < size; i4++) {
                jo joVar = (jo) list.get(i4);
                nx0 nx0Var2 = joVar.d;
                long j6 = joVar.g - j;
                float f2 = this.q;
                if (f2 != 1.0f) {
                    j6 = Math.round(j6 / f2);
                }
                if (j6 >= j4 && nx0Var2.i < nx0Var.i && (i = nx0Var2.s) != -1 && i <= this.l && (i2 = nx0Var2.r) != -1 && i2 <= this.k && i < nx0Var.s) {
                    return i4;
                }
            }
        }
        return size;
    }

    @Override // yads.to, yads.pp0
    public final void a(float f) {
        this.q = f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    @Override // yads.pp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(long j, long j2, long j3, List list, zk1[] zk1VarArr) {
        long j4;
        long a;
        long b;
        int i;
        long min;
        ((j63) this.p).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = this.r;
        if (i2 < zk1VarArr.length && zk1VarArr[i2].next()) {
            zk1 zk1Var = zk1VarArr[this.r];
            a = zk1Var.a();
            b = zk1Var.b();
        } else {
            for (zk1 zk1Var2 : zk1VarArr) {
                if (zk1Var2.next()) {
                    a = zk1Var2.a();
                    b = zk1Var2.b();
                }
            }
            if (!list.isEmpty()) {
                jo joVar = (jo) yd1.a(list);
                long j5 = joVar.g;
                if (j5 != C.TIME_UNSET) {
                    long j6 = joVar.h;
                    if (j6 != C.TIME_UNSET) {
                        j4 = j6 - j5;
                        i = this.s;
                        if (i == 0) {
                            this.s = 1;
                            this.r = a(elapsedRealtime);
                            return;
                        }
                        int i3 = this.r;
                        int a2 = list.isEmpty() ? -1 : a(((jo) yd1.a(list)).d);
                        if (a2 != -1) {
                            i = ((jo) yd1.a(list)).e;
                            i3 = a2;
                        }
                        int a3 = a(elapsedRealtime);
                        if (!b(i3, elapsedRealtime)) {
                            nx0[] nx0VarArr = this.d;
                            nx0 nx0Var = nx0VarArr[i3];
                            nx0 nx0Var2 = nx0VarArr[a3];
                            if (j3 == C.TIME_UNSET) {
                                min = this.h;
                            } else {
                                if (j4 != C.TIME_UNSET) {
                                    j3 -= j4;
                                }
                                min = Math.min((long) (j3 * this.n), this.h);
                            }
                            int i4 = nx0Var2.i;
                            int i5 = nx0Var.i;
                            if ((i4 > i5 && j2 < min) || (i4 < i5 && j2 >= this.i)) {
                                a3 = i3;
                            }
                        }
                        if (a3 != i3) {
                            i = 3;
                        }
                        this.s = i;
                        this.r = a3;
                        return;
                    }
                }
            }
            j4 = -9223372036854775807L;
            i = this.s;
            if (i == 0) {
            }
        }
        j4 = a - b;
        i = this.s;
        if (i == 0) {
        }
    }

    public static tn2 a(np0[] np0VarArr) {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= np0VarArr.length) {
                break;
            }
            np0 np0Var = np0VarArr[i3];
            if (np0Var != null && np0Var.b.length > 1) {
                o51 f = s51.f();
                f.a(new cc(0L, 0L));
                arrayList.add(f);
            } else {
                arrayList.add(null);
            }
            i3++;
        }
        int length = np0VarArr.length;
        long[][] jArr = new long[length][];
        for (int i4 = 0; i4 < np0VarArr.length; i4++) {
            np0 np0Var2 = np0VarArr[i4];
            if (np0Var2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[np0Var2.b.length];
                int i5 = 0;
                while (true) {
                    if (i5 >= np0Var2.b.length) {
                        break;
                    }
                    jArr[i4][i5] = np0Var2.a.e[r11[i5]].i;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr = new int[length];
        long[] jArr2 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr3 = jArr[i6];
            jArr2[i6] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        a(arrayList, jArr2);
        a92 a92Var = a92.b;
        a92Var.getClass();
        ty1 b = new oy1(a92Var).a().b();
        int i7 = 0;
        while (i7 < length) {
            long[] jArr4 = jArr[i7];
            if (jArr4.length > i) {
                int length2 = jArr4.length;
                double[] dArr = new double[length2];
                int i8 = i2;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    int length3 = jArr5.length;
                    double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
                    if (i8 >= length3) {
                        break;
                    }
                    long j = jArr5[i8];
                    if (j != -1) {
                        d = Math.log(j);
                    }
                    dArr[i8] = d;
                    i8++;
                }
                int i9 = length2 - 1;
                double d2 = dArr[i9] - dArr[i2];
                int i10 = i2;
                while (i10 < i9) {
                    double d3 = dArr[i10];
                    i10++;
                    b.a(Double.valueOf(d2 == ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? 1.0d : (((d3 + dArr[i10]) * 0.5d) - dArr[i2]) / d2), Integer.valueOf(i7));
                    i = i;
                    i2 = 0;
                }
            }
            i7++;
            i = i;
            i2 = 0;
        }
        d0 d0Var = b.d;
        if (d0Var == null) {
            d0Var = new d0(b);
            b.d = d0Var;
        }
        s51 a = s51.a((Collection) d0Var);
        for (int i11 = 0; i11 < a.size(); i11++) {
            int intValue = ((Integer) a.get(i11)).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr2[intValue] = jArr[intValue][i12];
            a(arrayList, jArr2);
        }
        for (int i13 = 0; i13 < np0VarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr2[i13] = jArr2[i13] * 2;
            }
        }
        a(arrayList, jArr2);
        o51 f2 = s51.f();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            o51 o51Var = (o51) arrayList.get(i14);
            f2.a((Object) (o51Var == null ? s51.g() : o51Var.a()));
        }
        return f2.a();
    }
}
