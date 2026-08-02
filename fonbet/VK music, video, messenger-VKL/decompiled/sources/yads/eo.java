package yads;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes10.dex */
public abstract class eo implements p30 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public u30 d;

    public eo(boolean z) {
        this.a = z;
    }

    @Override // yads.p30
    public final void a(v93 v93Var) {
        v93Var.getClass();
        if (this.b.contains(v93Var)) {
            return;
        }
        this.b.add(v93Var);
        this.c++;
    }

    public final void b(u30 u30Var) {
        this.d = u30Var;
        for (int i = 0; i < this.c; i++) {
            v93 v93Var = (v93) this.b.get(i);
            boolean z = this.a;
            dc0 dc0Var = (dc0) v93Var;
            synchronized (dc0Var) {
                try {
                    tn2 tn2Var = dc0.n;
                    if (z && (u30Var.i & 8) != 8) {
                        if (dc0Var.f == 0) {
                            ((j63) dc0Var.d).getClass();
                            dc0Var.g = SystemClock.elapsedRealtime();
                        }
                        dc0Var.f++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void c(int i) {
        u30 u30Var = this.d;
        int i2 = mc3.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            v93 v93Var = (v93) this.b.get(i3);
            boolean z = this.a;
            dc0 dc0Var = (dc0) v93Var;
            synchronized (dc0Var) {
                tn2 tn2Var = dc0.n;
                if (z && (u30Var.i & 8) != 8) {
                    dc0Var.h += i;
                }
            }
        }
    }

    public final void d() {
        int i;
        e23 e23Var;
        float f;
        long j;
        u30 u30Var = this.d;
        int i2 = mc3.a;
        int i3 = 0;
        int i4 = 0;
        while (i4 < this.c) {
            v93 v93Var = (v93) this.b.get(i4);
            boolean z = this.a;
            dc0 dc0Var = (dc0) v93Var;
            synchronized (dc0Var) {
                try {
                    tn2 tn2Var = dc0.n;
                    if (!z || (u30Var.i & 8) == 8) {
                        i = i4;
                    } else {
                        if (dc0Var.f <= 0) {
                            throw new IllegalStateException();
                        }
                        ((j63) dc0Var.d).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i5 = (int) (elapsedRealtime - dc0Var.g);
                        dc0Var.j += i5;
                        long j2 = dc0Var.k;
                        long j3 = dc0Var.h;
                        dc0Var.k = j2 + j3;
                        if (i5 > 0) {
                            float f2 = (j3 * 8000.0f) / i5;
                            f23 f23Var = dc0Var.c;
                            int sqrt = (int) Math.sqrt(j3);
                            if (f23Var.d != 1) {
                                Collections.sort(f23Var.b, f23.h);
                                f23Var.d = 1;
                            }
                            int i6 = f23Var.g;
                            if (i6 > 0) {
                                e23[] e23VarArr = f23Var.c;
                                int i7 = i6 - 1;
                                f23Var.g = i7;
                                e23Var = e23VarArr[i7];
                            } else {
                                e23Var = new e23();
                            }
                            int i8 = f23Var.e;
                            f23Var.e = i8 + 1;
                            e23Var.a = i8;
                            e23Var.b = sqrt;
                            e23Var.c = f2;
                            f23Var.b.add(e23Var);
                            f23Var.f += sqrt;
                            while (true) {
                                int i9 = f23Var.f;
                                int i10 = f23Var.a;
                                if (i9 <= i10) {
                                    break;
                                }
                                int i11 = i9 - i10;
                                e23 e23Var2 = (e23) f23Var.b.get(i3);
                                int i12 = e23Var2.b;
                                if (i12 <= i11) {
                                    f23Var.f -= i12;
                                    f23Var.b.remove(i3);
                                    int i13 = f23Var.g;
                                    if (i13 < 5) {
                                        e23[] e23VarArr2 = f23Var.c;
                                        f23Var.g = i13 + 1;
                                        e23VarArr2[i13] = e23Var2;
                                    }
                                } else {
                                    e23Var2.b = i12 - i11;
                                    f23Var.f -= i11;
                                }
                            }
                            if (dc0Var.j >= 2000 || dc0Var.k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                                f23 f23Var2 = dc0Var.c;
                                if (f23Var2.d != 0) {
                                    Collections.sort(f23Var2.b, f23.i);
                                    f23Var2.d = i3;
                                }
                                float f3 = 0.5f * f23Var2.f;
                                int i14 = i3;
                                int i15 = i14;
                                while (true) {
                                    if (i14 < f23Var2.b.size()) {
                                        e23 e23Var3 = (e23) f23Var2.b.get(i14);
                                        i15 += e23Var3.b;
                                        if (i15 >= f3) {
                                            f = e23Var3.c;
                                            break;
                                        }
                                        i14++;
                                    } else if (f23Var2.b.isEmpty()) {
                                        f = Float.NaN;
                                    } else {
                                        ArrayList arrayList = f23Var2.b;
                                        f = ((e23) arrayList.get(arrayList.size() - 1)).c;
                                    }
                                }
                                dc0Var.l = (long) f;
                            }
                            long j4 = dc0Var.h;
                            long j5 = dc0Var.l;
                            if (i5 == 0 && j4 == 0) {
                                i = i4;
                                if (j5 == dc0Var.m) {
                                    j = 0;
                                    dc0Var.g = elapsedRealtime;
                                    dc0Var.h = j;
                                }
                            } else {
                                i = i4;
                            }
                            dc0Var.m = j5;
                            j = 0;
                            dc0Var.b.a(i5, j4, j5);
                            dc0Var.g = elapsedRealtime;
                            dc0Var.h = j;
                        } else {
                            i = i4;
                        }
                        dc0Var.f--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i4 = i + 1;
            i3 = 0;
        }
        this.d = null;
    }

    public final void e() {
        for (int i = 0; i < this.c; i++) {
            ((v93) this.b.get(i)).getClass();
        }
    }
}
