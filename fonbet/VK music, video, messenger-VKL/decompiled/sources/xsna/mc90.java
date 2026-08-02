package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cuy;
import xsna.dak0;

/* compiled from: PagerState.kt */
/* loaded from: classes11.dex */
public abstract class mc90 implements khh0 {
    public final wh50<s3q0> A;
    public final wh50<s3q0> B;
    public final wh50 C;
    public final wh50 D;
    public final wh50<Boolean> E;
    public final wh50<Boolean> F;
    public boolean a;
    public tb90 b;
    public final wh50 c;
    public final zb90 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final bml k;
    public final boolean l;
    public final wh50<tb90> m;
    public azl n;
    public int o;
    public final tg50 p;
    public final rg50 q;
    public final rg50 r;
    public final f1m s;
    public final cuy t;
    public final xa90 u;
    public final qsy v;
    public final cu5 w;
    public final wh50 x;
    public final kc90 y;
    public final buy z;

    /* compiled from: PagerState.kt */
    @b6l(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {691, 696}, m = "scroll$suspendImpl", v = 1)
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(spj<? super a> spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return mc90.v(mc90.this, null, null, this);
        }
    }

    /* compiled from: PagerState.kt */
    @b6l(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", l = {551}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<ggh0, spj<? super s3q0>, Object> {
        final /* synthetic */ int $page;
        final /* synthetic */ float $pageOffsetFraction;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, int i, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$pageOffsetFraction = f;
            this.$page = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return mc90.this.new b(this.$pageOffsetFraction, this.$page, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(ggh0 ggh0Var, spj<? super s3q0> spjVar) {
            return ((b) create(ggh0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                mc90 mc90Var = mc90.this;
                this.label = 1;
                if (mc90Var.i(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            float f = this.$pageOffsetFraction;
            double d = f;
            if (-0.5d > d || d > 0.5d) {
                xzw.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
            }
            mc90.this.x(this.$pageOffsetFraction, mc90.this.j(this.$page), true);
            return s3q0.a;
        }
    }

    public mc90(float f, int i, int i2) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            xzw.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = androidx.compose.runtime.k.b(new ov70(0L));
        this.d = new zb90(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new bml(new e2s(this, 22));
        this.l = true;
        this.m = androidx.compose.runtime.k.a(rc90.c, w65.e);
        this.n = rc90.b;
        this.p = new tg50();
        this.q = androidx.compose.runtime.i.a(-1);
        this.r = androidx.compose.runtime.i.a(i);
        k0x k0xVar = k0x.c;
        int i3 = 11;
        c950 c950Var = new c950(this, i3);
        jbk0<m9x> jbk0Var = bbk0.a;
        this.s = new f1m(c950Var, k0xVar);
        new f1m(new nef(this, 29), k0xVar);
        cuy cuyVar = new cuy(null, new bk30(this, i3));
        this.t = cuyVar;
        this.u = new xa90(new vt5(this), cuyVar, new tu80(this, 1));
        this.v = new qsy();
        this.w = new cu5();
        this.x = androidx.compose.runtime.k.b(null);
        this.y = new kc90(this);
        s6j.b(0, 0, 0, 0, 15);
        this.z = new buy();
        this.A = zq70.n();
        this.B = zq70.n();
        Boolean bool = Boolean.FALSE;
        this.C = androidx.compose.runtime.k.b(bool);
        this.D = androidx.compose.runtime.k.b(bool);
        this.E = androidx.compose.runtime.k.b(bool);
        this.F = androidx.compose.runtime.k.b(bool);
    }

    public static /* synthetic */ Object g(mc90 mc90Var, int i, dtp0 dtp0Var, spj spjVar, int i2) {
        iq2 iq2Var = dtp0Var;
        if ((i2 & 4) != 0) {
            iq2Var = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        }
        return mc90Var.f(i, iq2Var, spjVar);
    }

    public static void u(mc90 mc90Var, int i) {
        if (mc90Var.k.a()) {
            myc0.h(((tb90) ((zak0) mc90Var.m).getValue()).s, null, null, new lc90(mc90Var, null), 3);
        }
        mc90Var.x(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
    
        if (r8.b(r6, r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r5.i(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object v(mc90 mc90Var, MutatePriority mutatePriority, wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    aVar.L$0 = mc90Var;
                    aVar.L$1 = mutatePriority;
                    aVar.L$2 = wzsVar;
                    aVar.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mc90Var = (mc90) aVar.L$0;
                        kotlin.a.a(obj);
                        ((wak0) mc90Var.q).C(-1);
                        return s3q0.a;
                    }
                    wzsVar = (wzs) aVar.L$2;
                    mutatePriority = (MutatePriority) aVar.L$1;
                    mc90Var = (mc90) aVar.L$0;
                    kotlin.a.a(obj);
                }
                if (!mc90Var.k.a()) {
                    ((wak0) mc90Var.r).C(mc90Var.k());
                }
                bml bmlVar = mc90Var.k;
                aVar.L$0 = mc90Var;
                aVar.L$1 = null;
                aVar.L$2 = null;
                aVar.label = 2;
            }
        }
        aVar = mc90Var.new a(spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        if (!mc90Var.k.a()) {
        }
        bml bmlVar2 = mc90Var.k;
        aVar.L$0 = mc90Var;
        aVar.L$1 = null;
        aVar.L$2 = null;
        aVar.label = 2;
    }

    @Override // xsna.khh0
    public final boolean a() {
        return this.k.a();
    }

    @Override // xsna.khh0
    public final Object b(MutatePriority mutatePriority, wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> wzsVar, spj<? super s3q0> spjVar) {
        return v(this, mutatePriority, wzsVar, spjVar);
    }

    @Override // xsna.khh0
    public final boolean c() {
        return ((Boolean) ((zak0) this.C).getValue()).booleanValue();
    }

    @Override // xsna.khh0
    public final float d(float f) {
        return this.k.d(f);
    }

    @Override // xsna.khh0
    public final boolean e() {
        return ((Boolean) ((zak0) this.D).getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
    
        if (b(androidx.compose.foundation.MutatePriority.Default, r4, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, iq2 iq2Var, spj spjVar) {
        ic90 ic90Var;
        int i2;
        iq2 iq2Var2;
        int i3;
        float f;
        double d;
        if (spjVar instanceof ic90) {
            ic90Var = (ic90) spjVar;
            int i4 = ic90Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ic90Var.label = i4 - Integer.MIN_VALUE;
                Object obj = ic90Var.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = ic90Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    if ((i == k() && l() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || o() == 0) {
                        return s3q0.a;
                    }
                    ic90Var.L$0 = iq2Var;
                    ic90Var.I$0 = i;
                    ic90Var.F$0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    ic90Var.label = 1;
                    if (i(ic90Var) == obj2) {
                        return obj2;
                    }
                    iq2Var2 = iq2Var;
                    i3 = i;
                    f = 0.0f;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    f = ic90Var.F$0;
                    i3 = ic90Var.I$0;
                    iq2 iq2Var3 = (iq2) ic90Var.L$0;
                    kotlin.a.a(obj);
                    iq2Var2 = iq2Var3;
                }
                d = f;
                if (-0.5d <= d || d > 0.5d) {
                    xzw.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
                }
                wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> jc90Var = new jc90(this, j(i3), f * q(), iq2Var2, null);
                ic90Var.L$0 = null;
                ic90Var.label = 2;
            }
        }
        ic90Var = new ic90(this, spjVar);
        Object obj3 = ic90Var.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = ic90Var.label;
        if (i2 != 0) {
        }
        d = f;
        if (-0.5d <= d) {
        }
        xzw.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        wzs<? super ggh0, ? super spj<? super s3q0>, ? extends Object> jc90Var2 = new jc90(this, j(i3), f * q(), iq2Var2, null);
        ic90Var.L$0 = null;
        ic90Var.label = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0325 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0384 A[Catch: all -> 0x03c6, TRY_LEAVE, TryCatch #0 {all -> 0x03c6, blocks: (B:41:0x0325, B:44:0x032e, B:47:0x033b, B:49:0x0349, B:54:0x0384, B:56:0x0379, B:60:0x0361), top: B:40:0x0325 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02eb  */
    /* JADX WARN: Type inference failed for: r5v27, types: [int] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(tb90 tb90Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Object obj;
        boolean z7;
        boolean z8;
        iy8 b2;
        List<cuy.b> i2;
        ?? r5;
        long g;
        long j;
        List<kp10> list = tb90Var.a;
        int i3 = tb90Var.l;
        kp10 kp10Var = tb90Var.i;
        kp10 kp10Var2 = tb90Var.j;
        float f = tb90Var.k;
        this.t.f = list.size();
        int i4 = tb90Var.b;
        this.o = tb90Var.c + i4;
        if (!z && this.a) {
            this.b = tb90Var;
            return;
        }
        boolean z9 = true;
        if (z) {
            this.a = true;
        }
        xa90 xa90Var = this.u;
        boolean z10 = this.l;
        zb90 zb90Var = this.d;
        if (z2) {
            ((vak0) ((kg50) zb90Var.d)).g(f);
        } else {
            zb90Var.getClass();
            zb90Var.e = kp10Var2 != null ? kp10Var2.d : null;
            if (zb90Var.a || !list.isEmpty()) {
                zb90Var.a = true;
                int i5 = kp10Var2 != null ? kp10Var2.a : 0;
                ((wak0) ((rg50) zb90Var.c)).C(i5);
                ((tty) zb90Var.f).c(i5);
                ((vak0) ((kg50) zb90Var.d)).g(f);
            }
            if (z10) {
                boolean z11 = z10;
                ya90 ya90Var = xa90Var.o;
                pg50<iy8> pg50Var = xa90Var.e;
                ya90Var.b = tb90Var;
                ya90Var.c = xa90Var.n;
                vt5 vt5Var = xa90Var.a;
                int i6 = xa90Var.g;
                int i7 = -1;
                float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (i6 != -1 && i6 != ya90Var.h()) {
                    xa90Var.l = true;
                    if (ya90Var.d()) {
                        int i8 = xa90Var.h;
                        if (i8 < 0) {
                            i8 = 0;
                        }
                        xa90Var.h = i8;
                        tb90 tb90Var2 = ya90Var.b;
                        if (tb90Var2 == null) {
                            tb90Var2 = null;
                        }
                        int h = tb90Var2.a.isEmpty() ? -1 : ya90Var.h() - 1;
                        if (h != -1) {
                            int i9 = xa90Var.i;
                            if (i9 <= h) {
                                h = i9;
                            }
                            xa90Var.i = h;
                        }
                        if (xa90Var.f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                            xa90Var.e(ya90Var.e(), xa90Var.m - 1);
                        } else {
                            xa90Var.e(0, ya90Var.c());
                        }
                    }
                }
                xa90Var.m = ya90Var.h();
                if (ya90Var.d()) {
                    tb90 tb90Var3 = ya90Var.b;
                    if (tb90Var3 == null) {
                        tb90Var3 = null;
                    }
                    int size = tb90Var3.q.size();
                    tb90 tb90Var4 = ya90Var.b;
                    if (tb90Var4 == null) {
                        tb90Var4 = null;
                    }
                    int size2 = tb90Var4.a.size() + size;
                    tb90 tb90Var5 = ya90Var.b;
                    if (tb90Var5 == null) {
                        tb90Var5 = null;
                    }
                    int size3 = tb90Var5.r.size() + size2;
                    int i10 = 0;
                    while (i10 < size3) {
                        tb90 tb90Var6 = ya90Var.b;
                        if (tb90Var6 == null) {
                            tb90Var6 = null;
                        }
                        int size4 = tb90Var6.q.size();
                        float f3 = f2;
                        tb90 tb90Var7 = ya90Var.b;
                        if (tb90Var7 == null) {
                            tb90Var7 = null;
                        }
                        int size5 = tb90Var7.a.size();
                        if (i10 < size4) {
                            tb90 tb90Var8 = ya90Var.b;
                            if (tb90Var8 == null) {
                                tb90Var8 = null;
                            }
                            i = tb90Var8.q.get(i10).a;
                        } else if (i10 >= size4 && i10 < size4 + size5) {
                            tb90 tb90Var9 = ya90Var.b;
                            if (tb90Var9 == null) {
                                tb90Var9 = null;
                            }
                            i = tb90Var9.a.get(i10 - size4).a;
                        } else if (i10 >= size4 + size5) {
                            tb90 tb90Var10 = ya90Var.b;
                            if (tb90Var10 == null) {
                                tb90Var10 = null;
                            }
                            i = tb90Var10.r.get((i10 - size4) - size5).a;
                        } else {
                            i = i7;
                        }
                        tb90 tb90Var11 = ya90Var.b;
                        if (tb90Var11 == null) {
                            tb90Var11 = null;
                        }
                        int size6 = tb90Var11.q.size();
                        tb90 tb90Var12 = ya90Var.b;
                        if (tb90Var12 == null) {
                            tb90Var12 = null;
                        }
                        int size7 = tb90Var12.a.size();
                        if (i10 < size6) {
                            tb90 tb90Var13 = ya90Var.b;
                            if (tb90Var13 == null) {
                                tb90Var13 = null;
                            }
                            obj = tb90Var13.q.get(i10).d;
                        } else if (i10 >= size6 && i10 < size6 + size7) {
                            tb90 tb90Var14 = ya90Var.b;
                            if (tb90Var14 == null) {
                                tb90Var14 = null;
                            }
                            obj = tb90Var14.a.get(i10 - size6).d;
                        } else if (i10 >= size6 + size7) {
                            tb90 tb90Var15 = ya90Var.b;
                            if (tb90Var15 == null) {
                                tb90Var15 = null;
                            }
                            obj = tb90Var15.r.get((i10 - size6) - size7).d;
                        } else {
                            obj = iy8.c;
                        }
                        tb90 tb90Var16 = ya90Var.b;
                        if (tb90Var16 == null) {
                            tb90Var16 = null;
                        }
                        int i11 = tb90Var16.b;
                        if (i != -1) {
                            if (pg50Var.a(i)) {
                                int i12 = pg50Var.b(i).b;
                                z7 = z11;
                                Object obj2 = pg50Var.b(i).a;
                                if (i12 != i11 || !epx.f(obj2, obj)) {
                                    z8 = true;
                                    xa90Var.l = true;
                                    b2 = pg50Var.b(i);
                                    if (b2 == null) {
                                        b2.b = i11;
                                        b2.a = obj;
                                    } else {
                                        b2 = new iy8();
                                        b2.a = obj;
                                        b2.b = i11;
                                    }
                                    pg50Var.k(i, b2);
                                    xa90Var.h = Math.min(xa90Var.h, i);
                                    xa90Var.i = Math.max(xa90Var.i, i);
                                    i2 = xa90Var.b.i(i);
                                    if (i2 == null) {
                                        int size8 = i2.size();
                                        for (int i13 = 0; i13 < size8; i13++) {
                                            i2.get(i13).cancel();
                                        }
                                    }
                                }
                            } else {
                                z7 = z11;
                            }
                            z8 = true;
                            b2 = pg50Var.b(i);
                            if (b2 == null) {
                            }
                            pg50Var.k(i, b2);
                            xa90Var.h = Math.min(xa90Var.h, i);
                            xa90Var.i = Math.max(xa90Var.i, i);
                            i2 = xa90Var.b.i(i);
                            if (i2 == null) {
                            }
                        } else {
                            z7 = z11;
                            z8 = true;
                        }
                        i10++;
                        f2 = f3;
                        z9 = z8;
                        z11 = z7;
                        i7 = -1;
                    }
                    z3 = z11;
                    z4 = z9;
                    float f4 = f2;
                    if (xa90Var.l) {
                        boolean z12 = xa90Var.f <= f4 ? z4 : false;
                        if (ya90Var.d()) {
                            tb90 tb90Var17 = ya90Var.b;
                            if (tb90Var17 == null) {
                                tb90Var17 = null;
                            }
                            egi.n(tb90Var17);
                            tb90 tb90Var18 = ya90Var.b;
                            if (tb90Var18 == null) {
                                tb90Var18 = null;
                            }
                            int i14 = tb90Var18.t != null ? ((mc90) vt5Var.b).o : 0;
                            z6 = false;
                            xa90Var.d(ya90Var, ya90Var.c(), ya90Var.e(), i14, ya90Var.f(), ya90Var.g(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z12);
                        } else {
                            z6 = false;
                        }
                        xa90Var.l = z6;
                        z5 = z6;
                    } else {
                        z5 = false;
                    }
                } else {
                    z3 = z11;
                    z4 = true;
                    z5 = false;
                    xa90Var.f();
                }
                xa90Var.g = ya90Var.h();
                r5 = z5;
                ((zak0) this.m).setValue(tb90Var);
                ((zak0) this.C).setValue(Boolean.valueOf(tb90Var.m));
                ((zak0) this.D).setValue(Boolean.valueOf(((kp10Var == null ? kp10Var.a : r5) == 0 || i3 != 0) ? z4 : r5));
                if (kp10Var != null) {
                    this.e = kp10Var.a;
                }
                this.f = i3;
                dak0 a2 = dak0.a.a();
                izs<Object, s3q0> e = a2 != null ? a2.e() : null;
                dak0 b3 = dak0.a.b(a2);
                if (z3) {
                    try {
                        if (tb90Var.h < o() && Math.abs(this.j) > 0.5f) {
                            float f5 = this.j;
                            if (n().getOrientation() == Orientation.Vertical) {
                                if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (s() & 4294967295L)))) {
                                    if (!z4) {
                                        xa90Var.h(this.j, tb90Var);
                                        s3q0 s3q0Var = s3q0.a;
                                    }
                                }
                                if (t()) {
                                    z4 = r5;
                                }
                                if (!z4) {
                                }
                            } else {
                                if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (s() >> 32)))) {
                                    if (!z4) {
                                    }
                                }
                                if (t()) {
                                }
                                if (!z4) {
                                }
                            }
                        }
                    } finally {
                        dak0.a.d(a2, b3, e);
                    }
                }
                this.g = rc90.a(tb90Var, o());
                o();
                int a3 = (int) (tb90Var.e != Orientation.Horizontal ? tb90Var.a() >> 32 : tb90Var.a() & 4294967295L);
                g = swe0.g(tb90Var.n.d(a3, i4, -tb90Var.f, tb90Var.d), r5, a3);
                j = this.g;
                if (g > j) {
                    g = j;
                }
                this.h = g;
            }
        }
        z4 = true;
        z3 = z10;
        r5 = 0;
        ((zak0) this.m).setValue(tb90Var);
        ((zak0) this.C).setValue(Boolean.valueOf(tb90Var.m));
        ((zak0) this.D).setValue(Boolean.valueOf(((kp10Var == null ? kp10Var.a : r5) == 0 || i3 != 0) ? z4 : r5));
        if (kp10Var != null) {
        }
        this.f = i3;
        dak0 a22 = dak0.a.a();
        izs<Object, s3q0> e2 = a22 != null ? a22.e() : null;
        dak0 b32 = dak0.a.b(a22);
        if (z3) {
        }
        this.g = rc90.a(tb90Var, o());
        o();
        int a32 = (int) (tb90Var.e != Orientation.Horizontal ? tb90Var.a() >> 32 : tb90Var.a() & 4294967295L);
        g = swe0.g(tb90Var.n.d(a32, i4, -tb90Var.f, tb90Var.d), r5, a32);
        j = this.g;
        if (g > j) {
        }
        this.h = g;
    }

    public final Object i(ContinuationImpl continuationImpl) {
        if (((zak0) this.m).getValue() != rc90.c) {
            return s3q0.a;
        }
        Object t = this.w.t(continuationImpl);
        return t == CoroutineSingletons.COROUTINE_SUSPENDED ? t : s3q0.a;
    }

    public final int j(int i) {
        if (o() > 0) {
            return swe0.g(i, 0, o() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((wak0) ((rg50) this.d.c)).getIntValue();
    }

    public final float l() {
        return ((vak0) ((kg50) this.d.d)).getFloatValue();
    }

    public final boolean m() {
        return ((Boolean) ((zak0) this.E).getValue()).booleanValue();
    }

    public final ob90 n() {
        return (ob90) ((zak0) this.m).getValue();
    }

    public abstract int o();

    public final int p() {
        return ((tb90) ((zak0) this.m).getValue()).b;
    }

    public final int q() {
        return ((tb90) ((zak0) this.m).getValue()).c + p();
    }

    public final int r() {
        return ((Number) this.s.getValue()).intValue();
    }

    public final long s() {
        return ((ov70) ((zak0) this.c).getValue()).a;
    }

    public final boolean t() {
        return ((int) Float.intBitsToFloat((int) (s() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (s() & 4294967295L))) == 0;
    }

    public final Object w(int i, float f, spj<? super s3q0> spjVar) {
        Object b2 = b(MutatePriority.Default, new b(f, i, null), spjVar);
        return b2 == CoroutineSingletons.COROUTINE_SUSPENDED ? b2 : s3q0.a;
    }

    public final void x(float f, int i, boolean z) {
        zb90 zb90Var = this.d;
        rg50 rg50Var = (rg50) zb90Var.c;
        kg50 kg50Var = (kg50) zb90Var.d;
        if (((wak0) rg50Var).getIntValue() != i || ((vak0) kg50Var).getFloatValue() != f) {
            this.u.f();
        }
        ((wak0) ((rg50) zb90Var.c)).C(i);
        ((tty) zb90Var.f).c(i);
        ((vak0) kg50Var).g(f);
        zb90Var.e = null;
        if (!z) {
            zq70.A(this.B);
            return;
        }
        stf0 stf0Var = (stf0) ((zak0) this.x).getValue();
        if (stf0Var != null) {
            stf0Var.k();
        }
    }

    public mc90() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
    }
}
