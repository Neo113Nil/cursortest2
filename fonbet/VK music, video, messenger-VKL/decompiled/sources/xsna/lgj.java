package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import xsna.dd8;
import xsna.fd8;
import xsna.q630;

/* compiled from: ContentInViewNode.kt */
/* loaded from: classes11.dex */
public final class lgj extends q630.c implements nvi, lp10 {
    public Orientation p;
    public final zhh0 q;
    public boolean r;
    public fd8 s;
    public final lva0 t;
    public boolean v;
    public boolean x;
    public final xc8 u = new xc8();
    public long w = mgj.a;

    /* compiled from: ContentInViewNode.kt */
    public static final class a {
        public final dd8.a.C2721a a;
        public final lq9 b;

        public a(dd8.a.C2721a c2721a, lq9 lq9Var) {
            this.a = c2721a;
            this.b = lq9Var;
        }

        public final String toString() {
            String str;
            lq9 lq9Var = this.b;
            vvj vvjVar = (vvj) lq9Var.f.get(vvj.c);
            String str2 = vvjVar != null ? vvjVar.b : null;
            StringBuilder sb = new StringBuilder("Request@");
            int hashCode = hashCode();
            ro.d(16);
            sb.append(Integer.toString(hashCode, 16));
            if (str2 == null || (str = zr.a(X3.j.d, str2, "](")) == null) {
                str = "(";
            }
            sb.append(str);
            sb.append("currentBounds()=");
            sb.append(this.a.invoke());
            sb.append(", continuation=");
            sb.append(lq9Var);
            sb.append(')');
            return sb.toString();
        }
    }

    /* compiled from: ContentInViewNode.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ContentInViewNode.kt */
    @b6l(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE}, m = "invokeSuspend", v = 1)
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ o7q0 $animationState;
        final /* synthetic */ fd8 $bringIntoViewSpec;
        final /* synthetic */ long $viewportAdjustmentForReverseScroll;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: ContentInViewNode.kt */
        @b6l(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE}, m = "invokeSuspend", v = 1)
        public static final class a extends SuspendLambda implements wzs<n160, spj<? super s3q0>, Object> {
            final /* synthetic */ eyx $animationJob;
            final /* synthetic */ o7q0 $animationState;
            final /* synthetic */ fd8 $bringIntoViewSpec;
            final /* synthetic */ long $viewportAdjustmentForReverseScroll;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ lgj this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o7q0 o7q0Var, lgj lgjVar, fd8 fd8Var, long j, eyx eyxVar, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$animationState = o7q0Var;
                this.this$0 = lgjVar;
                this.$bringIntoViewSpec = fd8Var;
                this.$viewportAdjustmentForReverseScroll = j;
                this.$animationJob = eyxVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                a aVar = new a(this.$animationState, this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, this.$animationJob, spjVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // xsna.wzs
            public final Object invoke(n160 n160Var, spj<? super s3q0> spjVar) {
                return ((a) create(n160Var, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    n160 n160Var = (n160) this.L$0;
                    this.$animationState.e = lgj.i2(this.this$0, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll);
                    o7q0 o7q0Var = this.$animationState;
                    lgj lgjVar = this.this$0;
                    on7 on7Var = new on7(lgjVar, o7q0Var, this.$animationJob, n160Var);
                    kad kadVar = new kad(lgjVar, o7q0Var, this.$bringIntoViewSpec, 2);
                    this.label = 1;
                    if (o7q0Var.a(on7Var, kadVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o7q0 o7q0Var, fd8 fd8Var, long j, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$animationState = o7q0Var;
            this.$bringIntoViewSpec = fd8Var;
            this.$viewportAdjustmentForReverseScroll = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            c cVar = lgj.this.new c(this.$animationState, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, spjVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            CancellationException cancellationException = null;
            try {
                try {
                    if (i == 0) {
                        kotlin.a.a(obj);
                        eyx f = iyx.f(((yvj) this.L$0).getCoroutineContext());
                        lgj lgjVar = lgj.this;
                        lgjVar.x = true;
                        zhh0 zhh0Var = lgjVar.q;
                        MutatePriority mutatePriority = MutatePriority.Default;
                        a aVar = new a(this.$animationState, lgjVar, this.$bringIntoViewSpec, this.$viewportAdjustmentForReverseScroll, f, null);
                        this.label = 1;
                        if (zhh0Var.f(mutatePriority, aVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    lgj.this.u.b();
                    lgj lgjVar2 = lgj.this;
                    lgjVar2.x = false;
                    lgjVar2.u.a(null);
                    lgj.this.v = false;
                    return s3q0.a;
                } catch (CancellationException e) {
                    cancellationException = e;
                    throw cancellationException;
                }
            } catch (Throwable th) {
                lgj lgjVar3 = lgj.this;
                lgjVar3.x = false;
                lgjVar3.u.a(cancellationException);
                lgj.this.v = false;
                throw th;
            }
        }
    }

    public lgj(Orientation orientation, zhh0 zhh0Var, boolean z, fd8 fd8Var, lva0 lva0Var) {
        this.p = orientation;
        this.q = zhh0Var;
        this.r = z;
        this.s = fd8Var;
        this.t = lva0Var;
    }

    public static final float i2(lgj lgjVar, fd8 fd8Var, long j) {
        char c2;
        zhf0 zhf0Var;
        int compare;
        long j2 = lgjVar.w;
        ci50<a> ci50Var = lgjVar.u.a;
        int i = ci50Var.d - 1;
        a[] aVarArr = ci50Var.b;
        if (i < aVarArr.length) {
            zhf0Var = null;
            while (true) {
                if (i < 0) {
                    c2 = ' ';
                    break;
                }
                zhf0 zhf0Var2 = (zhf0) aVarArr[i].a.invoke();
                if (zhf0Var2 != null) {
                    long d = zhf0Var2.d();
                    long w = pli.w(lgjVar.j2());
                    c2 = ' ';
                    int i2 = b.$EnumSwitchMapping$0[lgjVar.p.ordinal()];
                    if (i2 == 1) {
                        compare = Float.compare(Float.intBitsToFloat((int) (d & 4294967295L)), Float.intBitsToFloat((int) (w & 4294967295L)));
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        compare = Float.compare(Float.intBitsToFloat((int) (d >> 32)), Float.intBitsToFloat((int) (w >> 32)));
                    }
                    if (compare <= 0) {
                        zhf0Var = zhf0Var2;
                    } else if (zhf0Var == null) {
                        zhf0Var = zhf0Var2;
                    }
                }
                i--;
            }
        } else {
            c2 = ' ';
            zhf0Var = null;
        }
        if (zhf0Var == null) {
            zhf0 zhf0Var3 = lgjVar.v ? (zhf0) lgjVar.t.invoke() : null;
            if (zhf0Var3 == null) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            zhf0Var = zhf0Var3;
        }
        long w2 = pli.w(j2);
        int i3 = b.$EnumSwitchMapping$0[lgjVar.p.ordinal()];
        if (i3 == 1) {
            float f = zhf0Var.b;
            return fd8Var.a(f - ((int) (j & 4294967295L)), zhf0Var.d - f, Float.intBitsToFloat((int) (w2 & 4294967295L)));
        }
        if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float f2 = zhf0Var.a;
        return fd8Var.a(f2 - ((int) (j >> c2)), zhf0Var.c - f2, Float.intBitsToFloat((int) (w2 >> c2)));
    }

    public static boolean k2(lgj lgjVar, zhf0 zhf0Var, long j, long j2, int i) {
        if ((i & 1) != 0) {
            j = lgjVar.j2();
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long m2 = lgjVar.m2(zhf0Var, j3, j2);
        return Math.abs(Float.intBitsToFloat((int) (m2 >> 32))) <= 0.5f && Math.abs(Float.intBitsToFloat((int) (m2 & 4294967295L))) <= 0.5f;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.lp10
    public final void e(long j) {
        int g;
        long j2;
        long j3;
        long j4;
        long j22 = j2();
        this.w = j;
        int i = b.$EnumSwitchMapping$0[this.p.ordinal()];
        if (i == 1) {
            g = epx.g((int) (j & 4294967295L), (int) (j22 & 4294967295L));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            g = epx.g((int) (j >> 32), (int) (j22 >> 32));
        }
        if (g >= 0) {
            return;
        }
        if (this.r) {
            j2 = 0;
        } else {
            if (this.p == Orientation.Vertical) {
                j3 = 0 << 32;
                j4 = ((int) (j22 & 4294967295L)) - ((int) (j & 4294967295L));
            } else {
                j3 = (((int) (j22 >> 32)) - ((int) (j >> 32))) << 32;
                j4 = 0;
            }
            j2 = j3 | (j4 & 4294967295L);
        }
        long j5 = j2;
        zhf0 zhf0Var = (zhf0) this.t.invoke();
        if (zhf0Var == null || this.x || this.v || !k2(this, zhf0Var, j22, 0L, 2) || k2(this, zhf0Var, 0L, j5, 1)) {
            return;
        }
        this.v = true;
        l2(j5);
    }

    public final long j2() {
        long j = this.w;
        if (q9x.b(j, mgj.a)) {
            return 0L;
        }
        return j;
    }

    public final void l2(long j) {
        fd8 fd8Var = this.s;
        if (fd8Var == null) {
            fd8Var = (fd8) ovi.a(this, gd8.a);
        }
        fd8 fd8Var2 = fd8Var;
        if (this.x) {
            xzw.c("launchAnimation called when previous animation was running");
        }
        fd8 fd8Var3 = this.s;
        if (fd8Var3 == null) {
            fd8Var3 = (fd8) ovi.a(this, gd8.a);
        }
        fd8Var3.getClass();
        fd8.a.getClass();
        myc0.h(W1(), null, CoroutineStart.UNDISPATCHED, new c(new o7q0(fd8.a.b), fd8Var2, j, null), 1);
    }

    public final long m2(zhf0 zhf0Var, long j, long j2) {
        long j3;
        long j4;
        long w = pli.w(j);
        int i = b.$EnumSwitchMapping$0[this.p.ordinal()];
        if (i == 1) {
            fd8 fd8Var = this.s;
            if (fd8Var == null) {
                fd8Var = (fd8) ovi.a(this, gd8.a);
            }
            float f = zhf0Var.b;
            float a2 = fd8Var.a(f - ((int) (j2 & 4294967295L)), zhf0Var.d - f, Float.intBitsToFloat((int) (w & 4294967295L)));
            long floatToRawIntBits = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            long floatToRawIntBits2 = Float.floatToRawIntBits(a2);
            j3 = floatToRawIntBits << 32;
            j4 = floatToRawIntBits2 & 4294967295L;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fd8 fd8Var2 = this.s;
            if (fd8Var2 == null) {
                fd8Var2 = (fd8) ovi.a(this, gd8.a);
            }
            float f2 = zhf0Var.a;
            j3 = Float.floatToRawIntBits(fd8Var2.a(f2 - ((int) (j2 >> 32)), zhf0Var.c - f2, Float.intBitsToFloat((int) (w >> 32)))) << 32;
            j4 = Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L;
        }
        return j3 | j4;
    }
}
