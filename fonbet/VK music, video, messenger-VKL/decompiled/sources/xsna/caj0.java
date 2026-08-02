package xsna;

import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.eyx;

/* compiled from: SharedFlow.kt */
/* loaded from: classes11.dex */
public class caj0<T> extends th<gaj0> implements sh50<T>, ksr, m0t<T> {
    public final int f;
    public final int g;
    public final BufferOverflow h;
    public Object[] i;
    public long j;
    public long k;
    public int l;
    public int m;

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes8.dex */
    public static final class a implements ogn {
        public final caj0<?> b;
        public final long c;
        public final Object d;
        public final lq9 e;

        public a(caj0 caj0Var, long j, Object obj, lq9 lq9Var) {
            this.b = caj0Var;
            this.c = j;
            this.d = obj;
            this.e = lq9Var;
        }

        @Override // xsna.ogn
        public final void dispose() {
            caj0<?> caj0Var = this.b;
            synchronized (caj0Var) {
                if (this.c < caj0Var.o()) {
                    return;
                }
                Object[] objArr = caj0Var.i;
                if (lyd.c(objArr, this.c) != this) {
                    return;
                }
                lyd.d(objArr, this.c, lyd.c);
                caj0Var.j();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    /* compiled from: SharedFlow.kt */
    /* loaded from: classes8.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public caj0(int i, int i2, BufferOverflow bufferOverflow) {
        this.f = i;
        this.g = i2;
        this.h = bufferOverflow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(3:(7:(1:(1:11)(2:46|47))(1:48)|12|13|14|15|(2:16|(3:38|39|(2:41|42)(2:43|37))(4:18|(3:23|24|25)|32|(1:34)(2:36|37)))|35)(4:49|50|51|52)|30|31)(5:58|59|60|(1:62)|65)|53|54|15|(3:16|(0)(0)|37)|35))|68|6|(0)(0)|53|54|15|(3:16|(0)(0)|37)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c1, code lost:
    
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0090, code lost:
    
        if (((xsna.wwm0) r9).a(r0) == r1) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static CoroutineSingletons k(caj0 caj0Var, lsr lsrVar, spj spjVar) {
        daj0 daj0Var;
        int i;
        caj0 caj0Var2;
        Throwable th;
        gaj0 gaj0Var;
        lsr lsrVar2;
        eyx eyxVar;
        lsr lsrVar3;
        Object s;
        eyx eyxVar2;
        lsr lsrVar4;
        if (spjVar instanceof daj0) {
            daj0Var = (daj0) spjVar;
            int i2 = daj0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                daj0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = daj0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = daj0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            eyxVar2 = (eyx) daj0Var.L$3;
                            gaj0Var = (gaj0) daj0Var.L$2;
                            lsrVar4 = (lsr) daj0Var.L$1;
                            caj0Var2 = (caj0) daj0Var.L$0;
                        } else {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            eyxVar2 = (eyx) daj0Var.L$3;
                            gaj0Var = (gaj0) daj0Var.L$2;
                            lsrVar4 = (lsr) daj0Var.L$1;
                            caj0Var2 = (caj0) daj0Var.L$0;
                        }
                        try {
                            kotlin.a.a(obj);
                            lsrVar3 = lsrVar4;
                            eyxVar = eyxVar2;
                            caj0Var = caj0Var2;
                            while (true) {
                                s = caj0Var.s(gaj0Var);
                                if (s == lyd.c) {
                                    daj0Var.L$0 = caj0Var;
                                    daj0Var.L$1 = lsrVar3;
                                    daj0Var.L$2 = gaj0Var;
                                    daj0Var.L$3 = eyxVar;
                                    daj0Var.label = 2;
                                    if (caj0Var.i(gaj0Var, daj0Var) == coroutineSingletons) {
                                        break;
                                    }
                                } else {
                                    if (eyxVar != null && !eyxVar.isActive()) {
                                        throw eyxVar.I();
                                    }
                                    daj0Var.L$0 = caj0Var;
                                    daj0Var.L$1 = lsrVar3;
                                    daj0Var.L$2 = gaj0Var;
                                    daj0Var.L$3 = eyxVar;
                                    daj0Var.label = 3;
                                    if (lsrVar3.emit(s, daj0Var) == coroutineSingletons) {
                                        break;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        gaj0Var = (gaj0) daj0Var.L$2;
                        lsr lsrVar5 = (lsr) daj0Var.L$1;
                        caj0 caj0Var3 = (caj0) daj0Var.L$0;
                        try {
                            kotlin.a.a(obj);
                            lsrVar2 = lsrVar5;
                            caj0Var = caj0Var3;
                        } catch (Throwable th3) {
                            th = th3;
                            caj0Var2 = caj0Var3;
                        }
                    }
                    caj0Var2.h(gaj0Var);
                    throw th;
                }
                kotlin.a.a(obj);
                gaj0 b2 = caj0Var.b();
                try {
                    if (lsrVar instanceof wwm0) {
                        daj0Var.L$0 = caj0Var;
                        daj0Var.L$1 = lsrVar;
                        daj0Var.L$2 = b2;
                        daj0Var.label = 1;
                    }
                    lsrVar2 = lsrVar;
                    gaj0Var = b2;
                } catch (Throwable th4) {
                    caj0Var2 = caj0Var;
                    th = th4;
                    gaj0Var = b2;
                }
                eyxVar = (eyx) daj0Var.getContext().get(eyx.a.b);
                lsrVar3 = lsrVar2;
                while (true) {
                    s = caj0Var.s(gaj0Var);
                    if (s == lyd.c) {
                    }
                }
                return coroutineSingletons;
            }
        }
        daj0Var = new daj0(caj0Var, spjVar);
        Object obj2 = daj0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = daj0Var.label;
        if (i == 0) {
        }
        eyxVar = (eyx) daj0Var.getContext().get(eyx.a.b);
        lsrVar3 = lsrVar2;
        while (true) {
            s = caj0Var.s(gaj0Var);
            if (s == lyd.c) {
            }
        }
        return coroutineSingletons2;
    }

    @Override // xsna.m0t
    public final ksr<T> a(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return lyd.e(this, dVar, i, bufferOverflow);
    }

    @Override // xsna.th
    public final gaj0 c() {
        return new gaj0();
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super T> lsrVar, spj<?> spjVar) {
        return k(this, lsrVar, spjVar);
    }

    @Override // xsna.sh50
    public final void d() {
        synchronized (this) {
            try {
                try {
                    t(o() + this.l, this.k, o() + this.l, o() + this.l + this.m);
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // xsna.sh50
    public final boolean e(T t) {
        int i;
        boolean z;
        spj<s3q0>[] spjVarArr = uh.a;
        synchronized (this) {
            if (q(t)) {
                spjVarArr = n(spjVarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (spj<s3q0> spjVar : spjVarArr) {
            if (spjVar != null) {
                spjVar.resumeWith(s3q0.a);
            }
        }
        return z;
    }

    @Override // xsna.sh50, xsna.lsr
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        Throwable th;
        spj<s3q0>[] n;
        a aVar;
        if (e(t)) {
            return s3q0.a;
        }
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        spj<s3q0>[] spjVarArr = uh.a;
        synchronized (this) {
            try {
                if (q(t)) {
                    try {
                        lq9Var.resumeWith(s3q0.a);
                        n = n(spjVarArr);
                        aVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        a aVar2 = new a(this, o() + this.l + this.m, t, lq9Var);
                        m(aVar2);
                        this.m++;
                        if (this.g == 0) {
                            spjVarArr = n(spjVarArr);
                        }
                        n = spjVarArr;
                        aVar = aVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (aVar != null) {
                    lq9Var.s(new xgn(aVar));
                }
                for (spj<s3q0> spjVar2 : n) {
                    if (spjVar2 != null) {
                        spjVar2.resumeWith(s3q0.a);
                    }
                }
                Object n2 = lq9Var.n();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (n2 != coroutineSingletons) {
                    n2 = s3q0.a;
                }
                return n2 == coroutineSingletons ? n2 : s3q0.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // xsna.th
    public final vh[] f() {
        return new gaj0[2];
    }

    public final Object i(gaj0 gaj0Var, daj0 daj0Var) {
        lq9 lq9Var = new lq9(1, s7s0.c(daj0Var));
        lq9Var.o();
        synchronized (this) {
            try {
                if (r(gaj0Var) < 0) {
                    gaj0Var.b = lq9Var;
                } else {
                    lq9Var.resumeWith(s3q0.a);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Object n = lq9Var.n();
        return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : s3q0.a;
    }

    public final void j() {
        if (this.g != 0 || this.m > 1) {
            Object[] objArr = this.i;
            while (this.m > 0 && lyd.c(objArr, (o() + (this.l + this.m)) - 1) == lyd.c) {
                this.m--;
                lyd.d(objArr, o() + this.l + this.m, null);
            }
        }
    }

    public final void l() {
        Object[] objArr;
        lyd.d(this.i, o(), null);
        this.l--;
        long o = o() + 1;
        if (this.j < o) {
            this.j = o;
        }
        if (this.k < o) {
            if (this.c != 0 && (objArr = this.b) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        gaj0 gaj0Var = (gaj0) obj;
                        long j = gaj0Var.a;
                        if (j >= 0 && j < o) {
                            gaj0Var.a = o;
                        }
                    }
                }
            }
            this.k = o;
        }
    }

    public final void m(Object obj) {
        int i = this.l + this.m;
        Object[] objArr = this.i;
        if (objArr == null) {
            objArr = p(0, 2, null);
        } else if (i >= objArr.length) {
            objArr = p(i, objArr.length * 2, objArr);
        }
        lyd.d(objArr, o() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final spj<s3q0>[] n(spj<s3q0>[] spjVarArr) {
        Object[] objArr;
        gaj0 gaj0Var;
        lq9 lq9Var;
        int length = spjVarArr.length;
        if (this.c != 0 && (objArr = this.b) != null) {
            int length2 = objArr.length;
            int i = 0;
            spjVarArr = spjVarArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (lq9Var = (gaj0Var = (gaj0) obj).b) != null && r(gaj0Var) >= 0) {
                    int length3 = spjVarArr.length;
                    spjVarArr = spjVarArr;
                    if (length >= length3) {
                        spjVarArr = Arrays.copyOf(spjVarArr, Math.max(2, spjVarArr.length * 2));
                    }
                    spjVarArr[length] = lq9Var;
                    gaj0Var.b = null;
                    length++;
                }
                i++;
                spjVarArr = spjVarArr;
            }
        }
        return spjVarArr;
    }

    public final long o() {
        return Math.min(this.k, this.j);
    }

    public final Object[] p(int i, int i2, Object[] objArr) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i2];
        this.i = objArr2;
        if (objArr != null) {
            long o = o();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + o;
                lyd.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    public final boolean q(T t) {
        int i = this.c;
        int i2 = this.f;
        if (i != 0) {
            int i3 = this.l;
            int i4 = this.g;
            if (i3 >= i4 && this.k <= this.j) {
                int i5 = b.$EnumSwitchMapping$0[this.h.ordinal()];
                if (i5 == 1) {
                    return false;
                }
                if (i5 != 2) {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            m(t);
            int i6 = this.l + 1;
            this.l = i6;
            if (i6 > i4) {
                l();
            }
            long o = o() + this.l;
            long j = this.j;
            if (((int) (o - j)) > i2) {
                t(1 + j, this.k, o() + this.l, o() + this.l + this.m);
            }
        } else if (i2 != 0) {
            m(t);
            int i7 = this.l + 1;
            this.l = i7;
            if (i7 > i2) {
                l();
            }
            this.k = o() + this.l;
            return true;
        }
        return true;
    }

    public final long r(gaj0 gaj0Var) {
        long j = gaj0Var.a;
        if (j < o() + this.l) {
            return j;
        }
        if (this.g <= 0 && j <= o() && this.m != 0) {
            return j;
        }
        return -1L;
    }

    public final Object s(gaj0 gaj0Var) {
        Object obj;
        spj<s3q0>[] spjVarArr = uh.a;
        synchronized (this) {
            try {
                long r = r(gaj0Var);
                if (r < 0) {
                    obj = lyd.c;
                } else {
                    long j = gaj0Var.a;
                    Object c = lyd.c(this.i, r);
                    if (c instanceof a) {
                        c = ((a) c).d;
                    }
                    gaj0Var.a = r + 1;
                    Object obj2 = c;
                    spjVarArr = u(j);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (spj<s3q0> spjVar : spjVarArr) {
            if (spjVar != null) {
                spjVar.resumeWith(s3q0.a);
            }
        }
        return obj;
    }

    public final void t(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long o = o(); o < min; o++) {
            lyd.d(this.i, o, null);
        }
        this.j = j;
        this.k = j2;
        this.l = (int) (j3 - min);
        this.m = (int) (j4 - j3);
    }

    public final spj<s3q0>[] u(long j) {
        long j2;
        long j3;
        long j4;
        spj<s3q0>[] spjVarArr;
        spj<s3q0>[] spjVarArr2;
        Object[] objArr;
        con0 con0Var = lyd.c;
        spj<s3q0>[] spjVarArr3 = uh.a;
        if (j <= this.k) {
            long o = o();
            long j5 = this.l + o;
            int i = this.g;
            if (i == 0 && this.m > 0) {
                j5++;
            }
            int i2 = 0;
            if (this.c != 0 && (objArr = this.b) != null) {
                for (Object obj : objArr) {
                    if (obj != null) {
                        long j6 = ((gaj0) obj).a;
                        if (j6 >= 0 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.k) {
                long o2 = o() + this.l;
                int min = this.c > 0 ? Math.min(this.m, i - ((int) (o2 - j5))) : this.m;
                long j7 = this.m + o2;
                if (min > 0) {
                    j4 = 1;
                    Object[] objArr2 = this.i;
                    j2 = o;
                    spj<s3q0>[] spjVarArr4 = new spj[min];
                    long j8 = o2;
                    while (true) {
                        if (o2 >= j7) {
                            spjVarArr2 = spjVarArr4;
                            j3 = j5;
                            break;
                        }
                        Object c = lyd.c(objArr2, o2);
                        if (c != con0Var) {
                            a aVar = (a) c;
                            spjVarArr2 = spjVarArr4;
                            int i3 = i2 + 1;
                            j3 = j5;
                            spjVarArr2[i2] = aVar.e;
                            lyd.d(objArr2, o2, con0Var);
                            lyd.d(objArr2, j8, aVar.d);
                            j8++;
                            if (i3 >= min) {
                                break;
                            }
                            i2 = i3;
                        } else {
                            spjVarArr2 = spjVarArr4;
                            j3 = j5;
                        }
                        o2++;
                        spjVarArr4 = spjVarArr2;
                        j5 = j3;
                    }
                    o2 = j8;
                    spjVarArr = spjVarArr2;
                } else {
                    j2 = o;
                    j3 = j5;
                    j4 = 1;
                    spjVarArr = spjVarArr3;
                }
                int i4 = (int) (o2 - j2);
                long j9 = this.c == 0 ? o2 : j3;
                long max = Math.max(this.j, o2 - Math.min(this.f, i4));
                if (i == 0 && max < j7 && epx.f(lyd.c(this.i, max), con0Var)) {
                    o2 += j4;
                    max += j4;
                }
                t(max, j9, o2, j7);
                j();
                return spjVarArr.length == 0 ? spjVarArr : n(spjVarArr);
            }
        }
        return spjVarArr3;
    }
}
