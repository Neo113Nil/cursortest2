package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.er9;
import xsna.q630;

/* compiled from: BasicMarquee.kt */
/* loaded from: classes11.dex */
public final class yf10 extends q630.c implements noy, lio, lvr {
    public final f1m B;
    public int p;
    public int q;
    public int r;
    public float s;
    public yok0 w;
    public mdu x;
    public final wh50 y;
    public final rg50 t = androidx.compose.runtime.i.a(0);
    public final rg50 u = androidx.compose.runtime.i.a(0);
    public final wh50 v = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final wh50 z = androidx.compose.runtime.k.b(new vf10());
    public final if2<Float, sq2> A = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* compiled from: BasicMarquee.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: BasicMarquee.kt */
    @b6l(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", l = {390, 391}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ eyx $oldJob;
        int label;
        final /* synthetic */ yf10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(eyx eyxVar, yf10 yf10Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$oldJob = eyxVar;
            this.this$0 = yf10Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$oldJob, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        
            if (r5 == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0029, code lost:
        
            if (r5.y(r4) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object k;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                eyx eyxVar = this.$oldJob;
                if (eyxVar != null) {
                    this.label = 1;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                kotlin.a.a(obj);
            }
            yf10 yf10Var = this.this$0;
            this.label = 2;
            if (yf10Var.p <= 0) {
                k = s3q0.a;
            } else {
                k = myc0.k(cnr.b, new zf10(yf10Var, null), this);
                if (k != obj2) {
                    k = s3q0.a;
                }
            }
        }
    }

    public yf10(int i, int i2, int i3, mr mrVar, float f) {
        this.p = i;
        this.q = i2;
        this.r = i3;
        this.s = f;
        this.y = androidx.compose.runtime.k.b(mrVar);
        this.B = bbk0.b(new defpackage.e0(13, mrVar, this));
    }

    @Override // xsna.lvr
    public final void D(xwr xwrVar) {
        ((zak0) this.v).setValue(Boolean.valueOf(xwrVar.s0()));
    }

    @Override // xsna.q630.c
    public final void a2() {
        mdu mduVar = this.x;
        kdu graphicsContext = itl.g(this).getGraphicsContext();
        if (mduVar != null) {
            graphicsContext.b(mduVar);
        }
        this.x = graphicsContext.a();
        j2();
    }

    @Override // xsna.q630.c
    public final void b2() {
        yok0 yok0Var = this.w;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        this.w = null;
        mdu mduVar = this.x;
        if (mduVar != null) {
            itl.g(this).getGraphicsContext().b(mduVar);
            this.x = null;
        }
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        tra0 N = zo10Var.N(o6j.b(0, j, Integer.MAX_VALUE, 0, 0, 13));
        int g = s6j.g(N.b, j);
        wak0 wak0Var = (wak0) this.u;
        wak0Var.C(g);
        ((wak0) this.t).C(N.b);
        return ep10Var.Q(wak0Var.getIntValue(), N.c, jgp.b, new lrk(N, 29));
    }

    public final int i2() {
        return ((Number) this.B.getValue()).intValue();
    }

    public final void j2() {
        yok0 yok0Var = this.w;
        if (yok0Var != null) {
            yok0Var.b(null);
        }
        if (this.o) {
            this.w = myc0.h(W1(), null, null, new b(yok0Var, this, null), 3);
        }
    }

    @Override // xsna.noy
    public final int k(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.Z(Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    @Override // xsna.lio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(toy toyVar) {
        float intValue;
        float floatValue;
        int intValue2;
        mdu mduVar;
        er9.b bVar;
        mdu mduVar2;
        er9 er9Var = toyVar.b;
        int a2 = pco.a(this.s, 0);
        rg50 rg50Var = this.u;
        if2<Float, sq2> if2Var = this.A;
        rg50 rg50Var2 = this.t;
        if (a2 > 0) {
            int i = a.$EnumSwitchMapping$0[toyVar.getLayoutDirection().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                floatValue = (-if2Var.d().floatValue()) + (((wak0) rg50Var2).getIntValue() * 2) + i2();
                intValue2 = ((wak0) rg50Var).getIntValue();
                intValue = floatValue - intValue2;
                wak0 wak0Var = (wak0) rg50Var2;
                boolean z = intValue >= ((float) wak0Var.getIntValue());
                wak0 wak0Var2 = (wak0) rg50Var;
                boolean z2 = ((float) wak0Var2.getIntValue()) + intValue > ((float) (i2() + wak0Var.getIntValue()));
                float i2 = i2() + wak0Var.getIntValue();
                float intBitsToFloat = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
                mduVar = this.x;
                if (mduVar != null) {
                    toyVar.N1((an10.b(intBitsToFloat) & 4294967295L) | (wak0Var.getIntValue() << 32), new r3h(toyVar, 24), mduVar);
                }
                float intValue3 = wak0Var2.getIntValue();
                float intBitsToFloat2 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
                bVar = er9Var.c;
                long d = bVar.d();
                bVar.a().e();
                try {
                    bVar.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue3, intBitsToFloat2, 1);
                    float f = -intValue;
                    er9Var.c.a.l(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    try {
                        mduVar2 = this.x;
                        if (mduVar2 == null) {
                            if (z) {
                                qdu.a(toyVar, mduVar2);
                            }
                            if (z2) {
                                er9Var.c.a.l(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                try {
                                    qdu.a(toyVar, mduVar2);
                                    er9Var.c.a.l(-i2, -0.0f);
                                } finally {
                                }
                            }
                            er9Var.c.a.l(-f, -0.0f);
                            return;
                        }
                        if (z) {
                            toyVar.s1();
                        }
                        if (z2) {
                            er9Var.c.a.l(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                            try {
                                toyVar.s1();
                                er9Var.c.a.l(-i2, -0.0f);
                            } finally {
                            }
                        }
                        er9Var.c.a.l(-f, -0.0f);
                        return;
                    } catch (Throwable th) {
                        er9Var.c.a.l(-f, -0.0f);
                        throw th;
                    }
                } finally {
                    nq.b(bVar, d);
                }
            }
            intValue = if2Var.d().floatValue();
            wak0 wak0Var3 = (wak0) rg50Var2;
            if (intValue >= ((float) wak0Var3.getIntValue())) {
            }
            wak0 wak0Var22 = (wak0) rg50Var;
            if (((float) wak0Var22.getIntValue()) + intValue > ((float) (i2() + wak0Var3.getIntValue()))) {
            }
            float i22 = i2() + wak0Var3.getIntValue();
            float intBitsToFloat3 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
            mduVar = this.x;
            if (mduVar != null) {
            }
            float intValue32 = wak0Var22.getIntValue();
            float intBitsToFloat22 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
            bVar = er9Var.c;
            long d2 = bVar.d();
            bVar.a().e();
            bVar.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue32, intBitsToFloat22, 1);
            float f2 = -intValue;
            er9Var.c.a.l(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            mduVar2 = this.x;
            if (mduVar2 == null) {
            }
        } else {
            int i3 = a.$EnumSwitchMapping$0[toyVar.getLayoutDirection().ordinal()];
            if (i3 == 1) {
                intValue = (-if2Var.d().floatValue()) + ((wak0) rg50Var2).getIntValue() + i2();
                wak0 wak0Var32 = (wak0) rg50Var2;
                if (intValue >= ((float) wak0Var32.getIntValue())) {
                }
                wak0 wak0Var222 = (wak0) rg50Var;
                if (((float) wak0Var222.getIntValue()) + intValue > ((float) (i2() + wak0Var32.getIntValue()))) {
                }
                float i222 = i2() + wak0Var32.getIntValue();
                float intBitsToFloat32 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
                mduVar = this.x;
                if (mduVar != null) {
                }
                float intValue322 = wak0Var222.getIntValue();
                float intBitsToFloat222 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
                bVar = er9Var.c;
                long d22 = bVar.d();
                bVar.a().e();
                bVar.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue322, intBitsToFloat222, 1);
                float f22 = -intValue;
                er9Var.c.a.l(f22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                mduVar2 = this.x;
                if (mduVar2 == null) {
                }
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                floatValue = if2Var.d().floatValue() + ((wak0) rg50Var2).getIntValue();
                intValue2 = ((wak0) rg50Var).getIntValue();
                intValue = floatValue - intValue2;
                wak0 wak0Var322 = (wak0) rg50Var2;
                if (intValue >= ((float) wak0Var322.getIntValue())) {
                }
                wak0 wak0Var2222 = (wak0) rg50Var;
                if (((float) wak0Var2222.getIntValue()) + intValue > ((float) (i2() + wak0Var322.getIntValue()))) {
                }
                float i2222 = i2() + wak0Var322.getIntValue();
                float intBitsToFloat322 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
                mduVar = this.x;
                if (mduVar != null) {
                }
                float intValue3222 = wak0Var2222.getIntValue();
                float intBitsToFloat2222 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
                bVar = er9Var.c;
                long d222 = bVar.d();
                bVar.a().e();
                bVar.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intValue3222, intBitsToFloat2222, 1);
                float f222 = -intValue;
                er9Var.c.a.l(f222, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                mduVar2 = this.x;
                if (mduVar2 == null) {
                }
            }
        }
    }

    @Override // xsna.noy
    public final int w(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return 0;
    }

    @Override // xsna.noy
    public final int x(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.j0(Integer.MAX_VALUE);
    }

    @Override // xsna.noy
    public final int y(androidx.compose.ui.node.f fVar, zox zoxVar, int i) {
        return zoxVar.l0(i);
    }
}
