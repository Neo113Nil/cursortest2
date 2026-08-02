package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SnapshotIdSet.kt */
/* loaded from: classes.dex */
public final class kak0 implements Iterable<Long>, gcy {
    public static final kak0 f = new kak0(null, 0, 0, 0);
    public final long b;
    public final long c;
    public final long d;
    public final long[] e;

    /* compiled from: SnapshotIdSet.kt */
    @b6l(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend", v = 1)
    /* loaded from: classes11.dex */
    public static final class a extends RestrictedSuspendLambda implements wzs<ali0<? super Long>, spj<? super s3q0>, Object> {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = kak0.this.new a(spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(ali0<? super Long> ali0Var, spj<? super s3q0> spjVar) {
            return ((a) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
        
            if (r13.a(r9, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        
            if (r15.a(r9, r20) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x00c6 -> B:8:0x00e4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00e2 -> B:7:0x00e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0094 -> B:22:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ab -> B:22:0x00ae). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0075 -> B:33:0x0079). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ali0 ali0Var;
            ali0 ali0Var2;
            int length;
            long[] jArr;
            int i;
            long j;
            ali0 ali0Var3;
            int i2;
            ali0 ali0Var4;
            int i3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i4 = this.label;
            if (i4 == 0) {
                kotlin.a.a(obj);
                ali0Var = (ali0) this.L$0;
                long[] jArr2 = kak0.this.e;
                if (jArr2 != null) {
                    ali0Var2 = ali0Var;
                    length = jArr2.length;
                    jArr = jArr2;
                    i = 0;
                    if (i < length) {
                    }
                }
                j = 1;
                if (kak0.this.c != 0) {
                }
                if (kak0.this.b != 0) {
                }
                return s3q0.a;
            }
            if (i4 == 1) {
                length = this.I$1;
                i = this.I$0;
                jArr = (long[]) this.L$1;
                ali0Var2 = (ali0) this.L$0;
                kotlin.a.a(obj);
                i++;
                if (i < length) {
                    ali0Var = ali0Var2;
                    j = 1;
                    if (kak0.this.c != 0) {
                        ali0Var3 = ali0Var;
                        i2 = 0;
                        if (i2 < 64) {
                        }
                    }
                    if (kak0.this.b != 0) {
                    }
                    return s3q0.a;
                }
                Long l = new Long(jArr[i]);
                this.L$0 = ali0Var2;
                this.L$1 = jArr;
                this.I$0 = i;
                this.I$1 = length;
                this.label = 1;
            } else {
                if (i4 != 2) {
                    if (i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = this.I$0;
                    ali0Var4 = (ali0) this.L$0;
                    kotlin.a.a(obj);
                    j = 1;
                    i3 = i5;
                    i3++;
                    if (i3 < 64) {
                        kak0 kak0Var = kak0.this;
                        if ((kak0Var.b & (j << i3)) != 0) {
                            Long l2 = new Long(kak0Var.d + i3 + 64);
                            this.L$0 = ali0Var4;
                            this.L$1 = null;
                            this.I$0 = i3;
                            this.label = 3;
                            if (ali0Var4.a(l2, this) != coroutineSingletons) {
                                i5 = i3;
                                i3 = i5;
                            }
                            return coroutineSingletons;
                        }
                        i3++;
                        if (i3 < 64) {
                        }
                    }
                    return s3q0.a;
                }
                i2 = this.I$0;
                ali0Var3 = (ali0) this.L$0;
                kotlin.a.a(obj);
                j = 1;
                i2++;
                if (i2 < 64) {
                    kak0 kak0Var2 = kak0.this;
                    if ((kak0Var2.c & (j << i2)) != 0) {
                        Long l3 = new Long(kak0Var2.d + i2);
                        this.L$0 = ali0Var3;
                        this.L$1 = null;
                        this.I$0 = i2;
                        this.label = 2;
                    }
                    i2++;
                    if (i2 < 64) {
                        ali0Var = ali0Var3;
                        if (kak0.this.b != 0) {
                            ali0Var4 = ali0Var;
                            i3 = 0;
                            if (i3 < 64) {
                            }
                        }
                        return s3q0.a;
                    }
                }
            }
        }
    }

    public kak0(long[] jArr, long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = jArr;
    }

    public final kak0 a(kak0 kak0Var) {
        kak0 kak0Var2;
        long j;
        long[] jArr;
        kak0 kak0Var3 = f;
        if (kak0Var == kak0Var3) {
            return this;
        }
        if (this == kak0Var3) {
            return kak0Var3;
        }
        long j2 = kak0Var.d;
        long j3 = kak0Var.d;
        long[] jArr2 = kak0Var.e;
        long j4 = kak0Var.c;
        long j5 = kak0Var.b;
        long j6 = this.d;
        if (j2 == j6 && jArr2 == (jArr = this.e)) {
            return new kak0(jArr, this.b & (~j5), this.c & (~j4), j6);
        }
        if (jArr2 != null) {
            kak0Var2 = this;
            for (long j7 : jArr2) {
                kak0Var2 = kak0Var2.b(j7);
            }
        } else {
            kak0Var2 = this;
        }
        long j8 = 0;
        if (j4 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j4) != j8) {
                    j = j8;
                    kak0Var2 = kak0Var2.b(i + j3);
                } else {
                    j = j8;
                }
                i++;
                j8 = j;
            }
        }
        long j9 = j8;
        if (j5 != j9) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != j9) {
                    kak0Var2 = kak0Var2.b(i2 + j3 + 64);
                }
            }
        }
        return kak0Var2;
    }

    public final kak0 b(long j) {
        long[] jArr;
        int e;
        long[] jArr2;
        long j2 = j - this.d;
        long j3 = 0;
        if (epx.h(j2, j3) >= 0 && epx.h(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.c;
            if ((j5 & j4) != 0) {
                return new kak0(this.e, this.b, j5 & (~j4), this.d);
            }
        } else if (epx.h(j2, 64) >= 0 && epx.h(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.b;
            if ((j7 & j6) != 0) {
                return new kak0(this.e, j7 & (~j6), this.c, this.d);
            }
        } else if (epx.h(j2, j3) < 0 && (jArr = this.e) != null && (e = ey2.e(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                jArr2 = new long[i];
                if (e > 0) {
                    jw5.g(jArr, jArr2, 0, 0, e);
                }
                if (e < i) {
                    jw5.g(jArr, jArr2, e, e + 1, length);
                }
            }
            return new kak0(jArr2, this.b, this.c, this.d);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.d;
        long j3 = 0;
        return (epx.h(j2, j3) < 0 || epx.h(j2, (long) 64) >= 0) ? (epx.h(j2, (long) 64) < 0 || epx.h(j2, (long) 128) >= 0) ? epx.h(j2, j3) <= 0 && (jArr = this.e) != null && ey2.e(jArr, j) >= 0 : ((1 << (((int) j2) - 64)) & this.b) != 0 : ((1 << ((int) j2)) & this.c) != 0;
    }

    public final kak0 d(kak0 kak0Var) {
        kak0 kak0Var2;
        kak0 kak0Var3;
        long[] jArr;
        kak0 kak0Var4 = f;
        if (kak0Var == kak0Var4) {
            return this;
        }
        if (this == kak0Var4) {
            return kak0Var;
        }
        long j = kak0Var.d;
        long j2 = kak0Var.d;
        long[] jArr2 = kak0Var.e;
        long j3 = kak0Var.c;
        long j4 = kak0Var.b;
        long j5 = this.d;
        long j6 = this.c;
        long j7 = this.b;
        if (j == j5 && jArr2 == (jArr = this.e)) {
            return new kak0(jArr, j7 | j4, j6 | j3, j5);
        }
        long j8 = 1;
        int i = 0;
        long[] jArr3 = this.e;
        if (jArr3 == null) {
            if (jArr3 != null) {
                kak0Var3 = kak0Var;
                for (long j9 : jArr3) {
                    kak0Var3 = kak0Var3.e(j9);
                }
            } else {
                kak0Var3 = kak0Var;
            }
            long j10 = this.d;
            if (j6 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j6) != 0) {
                        kak0Var3 = kak0Var3.e(i2 + j10);
                    }
                }
            }
            if (j7 != 0) {
                while (i < 64) {
                    if (((1 << i) & j7) != 0) {
                        kak0Var3 = kak0Var3.e(i + j10 + 64);
                    }
                    i++;
                }
            }
            return kak0Var3;
        }
        if (jArr2 != null) {
            int length = jArr2.length;
            kak0Var2 = this;
            int i3 = 0;
            while (i3 < length) {
                kak0Var2 = kak0Var2.e(jArr2[i3]);
                i3++;
                j8 = j8;
            }
        } else {
            kak0Var2 = this;
        }
        long j11 = j8;
        if (j3 != 0) {
            for (int i4 = 0; i4 < 64; i4++) {
                if (((j11 << i4) & j3) != 0) {
                    kak0Var2 = kak0Var2.e(i4 + j2);
                }
            }
        }
        if (j4 != 0) {
            while (i < 64) {
                if (((j11 << i) & j4) != 0) {
                    kak0Var2 = kak0Var2.e(i + j2 + 64);
                }
                i++;
            }
        }
        return kak0Var2;
    }

    public final kak0 e(long j) {
        long j2;
        long j3;
        long[] o;
        long j4 = this.d;
        long j5 = j - j4;
        long j6 = 0;
        int h = epx.h(j5, j6);
        long j7 = this.c;
        if (h < 0 || epx.h(j5, 64) >= 0) {
            long j8 = 64;
            int h2 = epx.h(j5, j8);
            long j9 = this.b;
            if (h2 < 0 || epx.h(j5, 128) >= 0) {
                long j10 = 128;
                int h3 = epx.h(j5, j10);
                long[] jArr = this.e;
                if (h3 >= 0) {
                    if (!c(j)) {
                        long j11 = 1;
                        long j12 = ((j + j11) / j8) * j8;
                        if (epx.h(j12, j6) < 0) {
                            j12 = (Long.MAX_VALUE - j10) + j11;
                        }
                        h3g0 h3g0Var = null;
                        long j13 = j4;
                        long j14 = j9;
                        while (true) {
                            if (epx.h(j13, j12) >= 0) {
                                j2 = j13;
                                j3 = j7;
                                break;
                            }
                            if (j7 != 0) {
                                if (h3g0Var == null) {
                                    h3g0Var = new h3g0(jArr);
                                }
                                int i = 0;
                                while (i < 64) {
                                    long j15 = j12;
                                    if ((j7 & (1 << i)) != 0) {
                                        h3g0Var.h(i + j13);
                                    }
                                    i++;
                                    j12 = j15;
                                }
                            }
                            long j16 = j12;
                            if (j14 == 0) {
                                j3 = 0;
                                j2 = j16;
                                break;
                            }
                            j13 += j8;
                            j12 = j16;
                            j7 = j14;
                            j14 = 0;
                        }
                        return new kak0((h3g0Var == null || (o = h3g0Var.o()) == null) ? jArr : o, j14, j3, j2).e(j);
                    }
                } else {
                    if (jArr == null) {
                        return new kak0(new long[]{j}, this.b, this.c, this.d);
                    }
                    int e = ey2.e(jArr, j);
                    if (e < 0) {
                        int i2 = -(e + 1);
                        int length = jArr.length;
                        long[] jArr2 = new long[length + 1];
                        jw5.g(jArr, jArr2, 0, 0, i2);
                        jw5.g(jArr, jArr2, i2 + 1, i2, length);
                        jArr2[i2] = j;
                        return new kak0(jArr2, this.b, this.c, this.d);
                    }
                }
            } else {
                long j17 = 1 << (((int) j5) - 64);
                if ((j9 & j17) == 0) {
                    return new kak0(this.e, j9 | j17, this.c, this.d);
                }
            }
        } else {
            long j18 = 1 << ((int) j5);
            if ((j7 & j18) == 0) {
                return new kak0(this.e, this.b, j7 | j18, this.d);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new bli0(new a(null)).iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(c5g.u(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb.append(l370.w(arrayList));
        sb.append(']');
        return sb.toString();
    }
}
