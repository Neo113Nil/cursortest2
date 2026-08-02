package androidx.compose.foundation.pager;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.h;
import androidx.compose.foundation.pager.d;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.LayoutNode;
import defpackage.a5y;
import defpackage.a990;
import defpackage.ac4;
import defpackage.ay40;
import defpackage.b6y;
import defpackage.c6y;
import defpackage.ck11;
import defpackage.da10;
import defpackage.dub1;
import defpackage.fwi;
import defpackage.h6u0;
import defpackage.h890;
import defpackage.i2t0;
import defpackage.jj2;
import defpackage.jl40;
import defpackage.lxv;
import defpackage.n4y;
import defpackage.ngd0;
import defpackage.no6;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.ny8;
import defpackage.oz40;
import defpackage.p370;
import defpackage.p8e;
import defpackage.qd7;
import defpackage.qxi;
import defpackage.s890;
import defpackage.sb2;
import defpackage.tje;
import defpackage.tls;
import defpackage.tx40;
import defpackage.w5y;
import defpackage.wkp0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.wx40;
import defpackage.x4c;
import defpackage.xti0;
import defpackage.y6i0;
import defpackage.yx40;
import defpackage.z5y;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public abstract class d implements wkp0 {
    public final oz40 A;
    public final oz40 B;
    public final oz40 C;
    public final oz40 D;
    public final oz40 E;
    public final oz40 F;
    public boolean a;
    public s890 b;
    public final oz40 c;
    public final no6 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final h k;
    public final boolean l;
    public final oz40 m;
    public fwi n;
    public int o;
    public final ay40 p;
    public final yx40 q;
    public final yx40 r;
    public final qxi s;
    public final c6y t;
    public final h890 u;
    public final a5y v;
    public final ac4 w;
    public final oz40 x;
    public final n4y y;
    public final z5y z;

    public d(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            lxv.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = f.j(new wu60(0L));
        this.d = new no6(i, f, this);
        this.e = i;
        this.g = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        final int i2 = 0;
        this.k = new h(new tls(this) { // from class: x890
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            @Override // defpackage.tls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                s890 s890Var;
                int i3 = i2;
                zy11 zy11Var = zy11.a;
                s890 s890Var2 = null;
                d dVar = this.b;
                switch (i3) {
                    case 0:
                        ?? r15 = (Float) obj;
                        float floatValue = r15.floatValue();
                        long b = hg21.b(dVar);
                        float f2 = dVar.i + floatValue;
                        long c = m810.c(f2);
                        dVar.i = f2 - c;
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j = b + c;
                            long f3 = y6i0.f(j, dVar.h, dVar.g);
                            ?? r0 = j != f3;
                            long j2 = f3 - b;
                            float f4 = j2;
                            dVar.j = f4;
                            if (Math.abs(j2) != 0) {
                                dVar.E.setValue(Boolean.valueOf(f4 > 0.0f));
                                dVar.F.setValue(Boolean.valueOf(f4 < 0.0f));
                            }
                            int i4 = (int) j2;
                            int i5 = -i4;
                            s890 d2 = ((s890) dVar.m.getValue()).d(i5);
                            if (d2 != null && (s890Var = dVar.b) != null) {
                                s890 d3 = s890Var.d(i5);
                                if (d3 != null) {
                                    dVar.b = d3;
                                }
                                if (s890Var2 == null) {
                                    dVar.h(s890Var2, dVar.a, true);
                                    dVar.A.setValue(zy11Var);
                                } else {
                                    no6 no6Var = dVar.d;
                                    d dVar2 = (d) no6Var.b;
                                    tx40 tx40Var = (tx40) no6Var.w;
                                    tx40Var.setFloatValue(tx40Var.getFloatValue() + (dVar2.q() != 0 ? i4 / dVar2.q() : 0.0f));
                                    xti0 xti0Var = (xti0) dVar.x.getValue();
                                    if (xti0Var != null) {
                                        ((LayoutNode) xti0Var).h();
                                    }
                                }
                                if (r0 != false) {
                                    r15 = Long.valueOf(j2);
                                }
                                floatValue = r15.floatValue();
                            }
                            s890Var2 = d2;
                            if (s890Var2 == null) {
                            }
                            if (r0 != false) {
                            }
                            floatValue = r15.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        a6y a6yVar = (a6y) obj;
                        i2t0 D = tje.D();
                        tls e = D != null ? D.e() : null;
                        i2t0 O = tje.O(D);
                        try {
                            a6yVar.a(dVar.e);
                            return zy11Var;
                        } finally {
                            tje.W(D, O, e);
                        }
                }
            }
        });
        final int i3 = 1;
        this.l = true;
        this.m = f.i(a990.b, x4c.Q);
        this.n = a990.a;
        this.p = new ay40();
        this.q = f.g(-1);
        this.r = f.g(i);
        ngd0 ngd0Var = ngd0.F;
        f.e(new ny8(this, 6), ngd0Var);
        int i4 = 7;
        this.s = f.e(new ny8(this, i4), ngd0Var);
        c6y c6yVar = new c6y(new tls(this) { // from class: x890
            public final /* synthetic */ d b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00e8  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00b6  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            @Override // defpackage.tls
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                s890 s890Var;
                int i32 = i3;
                zy11 zy11Var = zy11.a;
                s890 s890Var2 = null;
                d dVar = this.b;
                switch (i32) {
                    case 0:
                        ?? r15 = (Float) obj;
                        float floatValue = r15.floatValue();
                        long b = hg21.b(dVar);
                        float f2 = dVar.i + floatValue;
                        long c = m810.c(f2);
                        dVar.i = f2 - c;
                        if (Math.abs(floatValue) >= 1.0E-4f) {
                            long j = b + c;
                            long f3 = y6i0.f(j, dVar.h, dVar.g);
                            ?? r0 = j != f3;
                            long j2 = f3 - b;
                            float f4 = j2;
                            dVar.j = f4;
                            if (Math.abs(j2) != 0) {
                                dVar.E.setValue(Boolean.valueOf(f4 > 0.0f));
                                dVar.F.setValue(Boolean.valueOf(f4 < 0.0f));
                            }
                            int i42 = (int) j2;
                            int i5 = -i42;
                            s890 d2 = ((s890) dVar.m.getValue()).d(i5);
                            if (d2 != null && (s890Var = dVar.b) != null) {
                                s890 d3 = s890Var.d(i5);
                                if (d3 != null) {
                                    dVar.b = d3;
                                }
                                if (s890Var2 == null) {
                                    dVar.h(s890Var2, dVar.a, true);
                                    dVar.A.setValue(zy11Var);
                                } else {
                                    no6 no6Var = dVar.d;
                                    d dVar2 = (d) no6Var.b;
                                    tx40 tx40Var = (tx40) no6Var.w;
                                    tx40Var.setFloatValue(tx40Var.getFloatValue() + (dVar2.q() != 0 ? i42 / dVar2.q() : 0.0f));
                                    xti0 xti0Var = (xti0) dVar.x.getValue();
                                    if (xti0Var != null) {
                                        ((LayoutNode) xti0Var).h();
                                    }
                                }
                                if (r0 != false) {
                                    r15 = Long.valueOf(j2);
                                }
                                floatValue = r15.floatValue();
                            }
                            s890Var2 = d2;
                            if (s890Var2 == null) {
                            }
                            if (r0 != false) {
                            }
                            floatValue = r15.floatValue();
                        }
                        return Float.valueOf(floatValue);
                    default:
                        a6y a6yVar = (a6y) obj;
                        i2t0 D = tje.D();
                        tls e = D != null ? D.e() : null;
                        i2t0 O = tje.O(D);
                        try {
                            a6yVar.a(dVar.e);
                            return zy11Var;
                        } finally {
                            tje.W(D, O, e);
                        }
                }
            }
        });
        this.t = c6yVar;
        this.u = new h890(new nw70(i4, this), c6yVar, new ny8(this, 8));
        this.v = new a5y();
        this.w = new ac4();
        this.x = f.j(null);
        this.y = new n4y(this, 2);
        p8e.b(0, 0, 0, 0, 15);
        this.z = new z5y();
        this.A = dub1.c();
        this.B = dub1.c();
        Boolean bool = Boolean.FALSE;
        this.C = f.j(bool);
        this.D = f.j(bool);
        this.E = f.j(bool);
        this.F = f.j(bool);
    }

    public static /* synthetic */ Object g(d dVar, int i, ck11 ck11Var, SuspendLambda suspendLambda, int i2) {
        jj2 jj2Var = ck11Var;
        if ((i2 & 4) != 0) {
            jj2Var = sb2.G(0.0f, 0.0f, 7, null);
        }
        return dVar.f(i, jj2Var, suspendLambda);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r9.d(r7, r8, r0) != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        if (r6.i(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object t(d dVar, MutatePriority mutatePriority, wls wlsVar, Continuation continuation) {
        PagerState$scroll$1 pagerState$scroll$1;
        int i;
        if (continuation instanceof PagerState$scroll$1) {
            pagerState$scroll$1 = (PagerState$scroll$1) continuation;
            int i2 = pagerState$scroll$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pagerState$scroll$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pagerState$scroll$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pagerState$scroll$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pagerState$scroll$1.L$0 = dVar;
                    pagerState$scroll$1.L$1 = mutatePriority;
                    pagerState$scroll$1.L$2 = wlsVar;
                    pagerState$scroll$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dVar = (d) pagerState$scroll$1.L$0;
                        kotlin.b.b(obj);
                        dVar.q.setIntValue(-1);
                        return zy11.a;
                    }
                    wlsVar = (wls) pagerState$scroll$1.L$2;
                    mutatePriority = (MutatePriority) pagerState$scroll$1.L$1;
                    dVar = (d) pagerState$scroll$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!dVar.k.a()) {
                    dVar.r.setIntValue(dVar.k());
                }
                h hVar = dVar.k;
                pagerState$scroll$1.L$0 = dVar;
                pagerState$scroll$1.L$1 = null;
                pagerState$scroll$1.L$2 = null;
                pagerState$scroll$1.label = 2;
            }
        }
        pagerState$scroll$1 = new PagerState$scroll$1(dVar, continuation);
        Object obj2 = pagerState$scroll$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pagerState$scroll$1.label;
        if (i != 0) {
        }
        if (!dVar.k.a()) {
        }
        h hVar2 = dVar.k;
        pagerState$scroll$1.L$0 = dVar;
        pagerState$scroll$1.L$1 = null;
        pagerState$scroll$1.L$2 = null;
        pagerState$scroll$1.label = 2;
    }

    public static Object u(d dVar, int i, SuspendLambda suspendLambda) {
        dVar.getClass();
        Object d = dVar.d(MutatePriority.Default, new PagerState$scrollToPage$2(dVar, 0.0f, i, null), suspendLambda);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }

    @Override // defpackage.wkp0
    public final boolean a() {
        return this.k.a();
    }

    @Override // defpackage.wkp0
    public final boolean b() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.wkp0
    public final float c(float f) {
        return this.k.c(f);
    }

    @Override // defpackage.wkp0
    public final Object d(MutatePriority mutatePriority, wls wlsVar, Continuation continuation) {
        return t(this, mutatePriority, wlsVar, continuation);
    }

    @Override // defpackage.wkp0
    public final boolean e() {
        return ((Boolean) this.D.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i, jj2 jj2Var, ContinuationImpl continuationImpl) {
        PagerState$animateScrollToPage$1 pagerState$animateScrollToPage$1;
        int i2;
        jj2 jj2Var2;
        int i3;
        float f;
        double d;
        if (continuationImpl instanceof PagerState$animateScrollToPage$1) {
            pagerState$animateScrollToPage$1 = (PagerState$animateScrollToPage$1) continuationImpl;
            int i4 = pagerState$animateScrollToPage$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                pagerState$animateScrollToPage$1.label = i4 - Integer.MIN_VALUE;
                Object obj = pagerState$animateScrollToPage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = pagerState$animateScrollToPage$1.label;
                zy11 zy11Var = zy11.a;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    if ((i != k() || l() != 0.0f) && o() != 0) {
                        pagerState$animateScrollToPage$1.L$0 = jj2Var;
                        pagerState$animateScrollToPage$1.I$0 = i;
                        pagerState$animateScrollToPage$1.F$0 = 0.0f;
                        pagerState$animateScrollToPage$1.label = 1;
                        if (i(pagerState$animateScrollToPage$1) != obj2) {
                            jj2Var2 = jj2Var;
                            i3 = i;
                            f = 0.0f;
                        }
                    }
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f = pagerState$animateScrollToPage$1.F$0;
                i3 = pagerState$animateScrollToPage$1.I$0;
                jj2 jj2Var3 = (jj2) pagerState$animateScrollToPage$1.L$0;
                kotlin.b.b(obj);
                jj2Var2 = jj2Var3;
                d = f;
                if (-0.5d <= d || d > 0.5d) {
                    lxv.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
                }
                wls pagerState$animateScrollToPage$3 = new PagerState$animateScrollToPage$3(this, j(i3), f * q(), jj2Var2, null);
                pagerState$animateScrollToPage$1.L$0 = null;
                pagerState$animateScrollToPage$1.label = 2;
                return d(MutatePriority.Default, pagerState$animateScrollToPage$3, pagerState$animateScrollToPage$1) != obj2 ? obj2 : zy11Var;
            }
        }
        pagerState$animateScrollToPage$1 = new PagerState$animateScrollToPage$1(this, continuationImpl);
        Object obj3 = pagerState$animateScrollToPage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = pagerState$animateScrollToPage$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i2 != 0) {
        }
        d = f;
        if (-0.5d <= d) {
        }
        lxv.a("pageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        wls pagerState$animateScrollToPage$32 = new PagerState$animateScrollToPage$3(this, j(i3), f * q(), jj2Var2, null);
        pagerState$animateScrollToPage$1.L$0 = null;
        pagerState$animateScrollToPage$1.label = 2;
        if (d(MutatePriority.Default, pagerState$animateScrollToPage$32, pagerState$animateScrollToPage$1) != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0390, code lost:
    
        if (s() == false) goto L204;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x027d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x033a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0303  */
    /* JADX WARN: Type inference failed for: r5v28, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(s890 s890Var, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        Object obj;
        boolean z7;
        boolean z8;
        qd7 qd7Var;
        List list;
        ?? r5;
        long d;
        long j;
        List list2 = s890Var.a;
        int i2 = s890Var.l;
        da10 da10Var = s890Var.i;
        da10 da10Var2 = s890Var.j;
        float f = s890Var.k;
        this.t.e = list2.size();
        int i3 = s890Var.b;
        this.o = s890Var.c + i3;
        if (!z && this.a) {
            this.b = s890Var;
            return;
        }
        boolean z9 = true;
        if (z) {
            this.a = true;
        }
        h890 h890Var = this.u;
        boolean z10 = this.l;
        no6 no6Var = this.d;
        if (z2) {
            ((tx40) no6Var.w).setFloatValue(f);
        } else {
            no6Var.getClass();
            no6Var.x = da10Var2 != null ? da10Var2.d : null;
            if (no6Var.a || !list2.isEmpty()) {
                no6Var.a = true;
                int i4 = da10Var2 != null ? da10Var2.a : 0;
                ((yx40) no6Var.c).setIntValue(i4);
                ((w5y) no6Var.y).a(i4);
                ((tx40) no6Var.w).setFloatValue(f);
            }
            if (z10) {
                boolean z11 = z10;
                p370 p370Var = h890Var.o;
                wx40 wx40Var = h890Var.e;
                p370Var.c = s890Var;
                p370Var.w = h890Var.n;
                nw70 nw70Var = h890Var.a;
                int i5 = h890Var.g;
                int i6 = -1;
                float f2 = 0.0f;
                if (i5 != -1 && i5 != p370Var.x()) {
                    h890Var.l = true;
                    if (p370Var.p()) {
                        int i7 = h890Var.h;
                        if (i7 < 0) {
                            i7 = 0;
                        }
                        h890Var.h = i7;
                        s890 s890Var2 = (s890) p370Var.c;
                        if (s890Var2 == null) {
                            s890Var2 = null;
                        }
                        int x = s890Var2.a.isEmpty() ? -1 : p370Var.x() - 1;
                        if (x != -1) {
                            int i8 = h890Var.i;
                            if (i8 <= x) {
                                x = i8;
                            }
                            h890Var.i = x;
                        }
                        if (h890Var.f <= 0.0f) {
                            h890Var.f(p370Var.s(), h890Var.m - 1);
                        } else {
                            h890Var.f(0, p370Var.o());
                        }
                    }
                }
                h890Var.m = p370Var.x();
                if (p370Var.p()) {
                    s890 s890Var3 = (s890) p370Var.c;
                    if (s890Var3 == null) {
                        s890Var3 = null;
                    }
                    int size = s890Var3.q.size();
                    s890 s890Var4 = (s890) p370Var.c;
                    if (s890Var4 == null) {
                        s890Var4 = null;
                    }
                    int size2 = s890Var4.a.size() + size;
                    s890 s890Var5 = (s890) p370Var.c;
                    if (s890Var5 == null) {
                        s890Var5 = null;
                    }
                    int size3 = s890Var5.r.size() + size2;
                    int i9 = 0;
                    while (i9 < size3) {
                        s890 s890Var6 = (s890) p370Var.c;
                        if (s890Var6 == null) {
                            s890Var6 = null;
                        }
                        int size4 = s890Var6.q.size();
                        float f3 = f2;
                        s890 s890Var7 = (s890) p370Var.c;
                        if (s890Var7 == null) {
                            s890Var7 = null;
                        }
                        int size5 = s890Var7.a.size();
                        if (i9 < size4) {
                            s890 s890Var8 = (s890) p370Var.c;
                            if (s890Var8 == null) {
                                s890Var8 = null;
                            }
                            i = ((da10) s890Var8.q.get(i9)).a;
                        } else if (i9 >= size4 && i9 < size4 + size5) {
                            s890 s890Var9 = (s890) p370Var.c;
                            if (s890Var9 == null) {
                                s890Var9 = null;
                            }
                            i = ((da10) s890Var9.a.get(i9 - size4)).a;
                        } else if (i9 >= size4 + size5) {
                            s890 s890Var10 = (s890) p370Var.c;
                            if (s890Var10 == null) {
                                s890Var10 = null;
                            }
                            i = ((da10) s890Var10.r.get((i9 - size4) - size5)).a;
                        } else {
                            i = i6;
                        }
                        s890 s890Var11 = (s890) p370Var.c;
                        if (s890Var11 == null) {
                            s890Var11 = null;
                        }
                        int size6 = s890Var11.q.size();
                        s890 s890Var12 = (s890) p370Var.c;
                        if (s890Var12 == null) {
                            s890Var12 = null;
                        }
                        int size7 = s890Var12.a.size();
                        if (i9 < size6) {
                            s890 s890Var13 = (s890) p370Var.c;
                            if (s890Var13 == null) {
                                s890Var13 = null;
                            }
                            obj = ((da10) s890Var13.q.get(i9)).d;
                        } else if (i9 >= size6 && i9 < size6 + size7) {
                            s890 s890Var14 = (s890) p370Var.c;
                            if (s890Var14 == null) {
                                s890Var14 = null;
                            }
                            obj = ((da10) s890Var14.a.get(i9 - size6)).d;
                        } else if (i9 >= size6 + size7) {
                            s890 s890Var15 = (s890) p370Var.c;
                            if (s890Var15 == null) {
                                s890Var15 = null;
                            }
                            obj = ((da10) s890Var15.r.get((i9 - size6) - size7)).d;
                        } else {
                            obj = qd7.c;
                        }
                        s890 s890Var16 = (s890) p370Var.c;
                        if (s890Var16 == null) {
                            s890Var16 = null;
                        }
                        int i10 = s890Var16.b;
                        if (i != -1) {
                            if (wx40Var.a(i)) {
                                int i11 = ((qd7) wx40Var.b(i)).b;
                                z7 = z11;
                                Object obj2 = ((qd7) wx40Var.b(i)).a;
                                if (i11 != i10 || !jl40.l(obj2, obj)) {
                                    z8 = true;
                                    h890Var.l = true;
                                    qd7Var = (qd7) wx40Var.b(i);
                                    if (qd7Var == null) {
                                        qd7Var.b = i10;
                                        qd7Var.a = obj;
                                    } else {
                                        qd7Var = new qd7();
                                        qd7Var.a = obj;
                                        qd7Var.b = i10;
                                    }
                                    wx40Var.i(i, qd7Var);
                                    h890Var.h = Math.min(h890Var.h, i);
                                    h890Var.i = Math.max(h890Var.i, i);
                                    list = (List) h890Var.b.g(i);
                                    if (list == null) {
                                        int size8 = list.size();
                                        for (int i12 = 0; i12 < size8; i12++) {
                                            ((b6y) list.get(i12)).cancel();
                                        }
                                    }
                                }
                            } else {
                                z7 = z11;
                            }
                            z8 = true;
                            qd7Var = (qd7) wx40Var.b(i);
                            if (qd7Var == null) {
                            }
                            wx40Var.i(i, qd7Var);
                            h890Var.h = Math.min(h890Var.h, i);
                            h890Var.i = Math.max(h890Var.i, i);
                            list = (List) h890Var.b.g(i);
                            if (list == null) {
                            }
                        } else {
                            z7 = z11;
                            z8 = true;
                        }
                        i9++;
                        f2 = f3;
                        z9 = z8;
                        z11 = z7;
                        i6 = -1;
                    }
                    z3 = z11;
                    z4 = z9;
                    float f4 = f2;
                    if (h890Var.l) {
                        boolean z12 = h890Var.f <= f4 ? z4 : false;
                        if (p370Var.p()) {
                            s890 s890Var17 = (s890) p370Var.c;
                            if (s890Var17 == null) {
                                s890Var17 = null;
                            }
                            h6u0.i(s890Var17);
                            s890 s890Var18 = (s890) p370Var.c;
                            if (s890Var18 == null) {
                                s890Var18 = null;
                            }
                            int i13 = s890Var18.t != null ? ((d) nw70Var.b).o : 0;
                            z6 = false;
                            h890Var.d(p370Var, p370Var.o(), p370Var.s(), i13, p370Var.t(), p370Var.u(), 0.0f, z12);
                        } else {
                            z6 = false;
                        }
                        h890Var.l = z6;
                        z5 = z6;
                    } else {
                        z5 = false;
                    }
                } else {
                    z3 = z11;
                    z4 = true;
                    z5 = false;
                    h890Var.g();
                }
                h890Var.g = p370Var.x();
                r5 = z5;
                this.m.setValue(s890Var);
                this.C.setValue(Boolean.valueOf(s890Var.m));
                this.D.setValue(Boolean.valueOf(((da10Var == null ? da10Var.a : r5) == 0 || i2 != 0) ? z4 : r5));
                if (da10Var != null) {
                    this.e = da10Var.a;
                }
                this.f = i2;
                i2t0 D = tje.D();
                tls e = D != null ? D.e() : null;
                i2t0 O = tje.O(D);
                if (z3) {
                    try {
                        if (s890Var.h < o() && Math.abs(this.j) > 0.5f) {
                            float f5 = this.j;
                            if (n().e == Orientation.Vertical) {
                                if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (r() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)))) {
                                    h890Var.e(this.j, s890Var);
                                }
                            } else if (Math.signum(f5) == Math.signum(-Float.intBitsToFloat((int) (r() >> 32)))) {
                                h890Var.e(this.j, s890Var);
                            }
                        }
                    } finally {
                        tje.W(D, O, e);
                    }
                }
                this.g = a990.a(s890Var, o());
                o();
                int e2 = (int) (s890Var.e != Orientation.Horizontal ? s890Var.e() >> 32 : s890Var.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                d = y6i0.d(s890Var.n.c(e2, i3, -s890Var.f, s890Var.d), r5, e2);
                j = this.g;
                if (d > j) {
                    d = j;
                }
                this.h = d;
            }
        }
        z4 = true;
        z3 = z10;
        r5 = 0;
        this.m.setValue(s890Var);
        this.C.setValue(Boolean.valueOf(s890Var.m));
        this.D.setValue(Boolean.valueOf(((da10Var == null ? da10Var.a : r5) == 0 || i2 != 0) ? z4 : r5));
        if (da10Var != null) {
        }
        this.f = i2;
        i2t0 D2 = tje.D();
        tls e3 = D2 != null ? D2.e() : null;
        i2t0 O2 = tje.O(D2);
        if (z3) {
        }
        this.g = a990.a(s890Var, o());
        o();
        int e22 = (int) (s890Var.e != Orientation.Horizontal ? s890Var.e() >> 32 : s890Var.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        d = y6i0.d(s890Var.n.c(e22, i3, -s890Var.f, s890Var.d), r5, e22);
        j = this.g;
        if (d > j) {
        }
        this.h = d;
    }

    public final Object i(ContinuationImpl continuationImpl) {
        Object m;
        return (this.m.getValue() == a990.b && (m = this.w.m(continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? m : zy11.a;
    }

    public final int j(int i) {
        if (o() > 0) {
            return y6i0.d(i, 0, o() - 1);
        }
        return 0;
    }

    public final int k() {
        return ((yx40) this.d.c).getIntValue();
    }

    public final float l() {
        return ((tx40) this.d.w).getFloatValue();
    }

    public final boolean m() {
        return ((Boolean) this.E.getValue()).booleanValue();
    }

    public final s890 n() {
        return (s890) this.m.getValue();
    }

    public abstract int o();

    public final int p() {
        return ((s890) this.m.getValue()).b;
    }

    public final int q() {
        return ((s890) this.m.getValue()).c + p();
    }

    public final long r() {
        return ((wu60) this.c.getValue()).a;
    }

    public final boolean s() {
        return ((int) Float.intBitsToFloat((int) (r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (r() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) == 0;
    }

    public final void v(int i, float f, boolean z) {
        no6 no6Var = this.d;
        yx40 yx40Var = (yx40) no6Var.c;
        tx40 tx40Var = (tx40) no6Var.w;
        if (yx40Var.getIntValue() != i || tx40Var.getFloatValue() != f) {
            this.u.g();
        }
        ((yx40) no6Var.c).setIntValue(i);
        ((w5y) no6Var.y).a(i);
        tx40Var.setFloatValue(f);
        no6Var.x = null;
        if (!z) {
            this.B.setValue(zy11.a);
            return;
        }
        xti0 xti0Var = (xti0) this.x.getValue();
        if (xti0Var != null) {
            ((LayoutNode) xti0Var).h();
        }
    }

    public d() {
        this(0, 0.0f);
    }
}
