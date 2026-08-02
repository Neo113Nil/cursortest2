package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AutoscrollHelper.kt */
/* loaded from: classes17.dex */
public final class yo5 {

    /* compiled from: AutoscrollHelper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AutoscrollHelper.kt */
    @b6l(c = "com.vk.games.presentation.utils.AutoscrollHelperKt$enableAutoScroll$1$1", f = "AutoscrollHelper.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $isAutoScrolling$delegate;
        final /* synthetic */ wh50<Boolean> $isUserInteracting$delegate;
        final /* synthetic */ wh50<Boolean> $shouldUseExtendedDelay$delegate;
        final /* synthetic */ mc90 $this_enableAutoScroll;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc90 mc90Var, wh50<Boolean> wh50Var, wh50<Boolean> wh50Var2, wh50<Boolean> wh50Var3, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$this_enableAutoScroll = mc90Var;
            this.$isAutoScrolling$delegate = wh50Var;
            this.$isUserInteracting$delegate = wh50Var2;
            this.$shouldUseExtendedDelay$delegate = wh50Var3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$this_enableAutoScroll, this.$isAutoScrolling$delegate, this.$isUserInteracting$delegate, this.$shouldUseExtendedDelay$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!this.$this_enableAutoScroll.k.a()) {
                wh50<Boolean> wh50Var = this.$isAutoScrolling$delegate;
                Boolean bool = Boolean.FALSE;
                wh50Var.setValue(bool);
                if (this.$isUserInteracting$delegate.getValue().booleanValue()) {
                    this.$isUserInteracting$delegate.setValue(bool);
                    this.$shouldUseExtendedDelay$delegate.setValue(Boolean.TRUE);
                }
            } else if (!this.$isAutoScrolling$delegate.getValue().booleanValue()) {
                this.$isUserInteracting$delegate.setValue(Boolean.TRUE);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AutoscrollHelper.kt */
    @b6l(c = "com.vk.games.presentation.utils.AutoscrollHelperKt$enableAutoScroll$3$1", f = "AutoscrollHelper.kt", l = {72, TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isActive;
        final /* synthetic */ wh50<Boolean> $isAutoScrolling$delegate;
        final /* synthetic */ wh50<Boolean> $isScreenOn$delegate;
        final /* synthetic */ wh50<Boolean> $isUserInteracting$delegate;
        final /* synthetic */ wh50<Boolean> $shouldUseExtendedDelay$delegate;
        final /* synthetic */ mc90 $this_enableAutoScroll;
        long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, mc90 mc90Var, wh50<Boolean> wh50Var, wh50<Boolean> wh50Var2, wh50<Boolean> wh50Var3, wh50<Boolean> wh50Var4, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$isActive = z;
            this.$this_enableAutoScroll = mc90Var;
            this.$isUserInteracting$delegate = wh50Var;
            this.$isScreenOn$delegate = wh50Var2;
            this.$shouldUseExtendedDelay$delegate = wh50Var3;
            this.$isAutoScrolling$delegate = wh50Var4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$isActive, this.$this_enableAutoScroll, this.$isUserInteracting$delegate, this.$isScreenOn$delegate, this.$shouldUseExtendedDelay$delegate, this.$isAutoScrolling$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        
            if (xsna.qsl.b(r4, r7) == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00a3, code lost:
        
            if (r8 == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
        
            if (xsna.s3q0.a == r0) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (!this.$isUserInteracting$delegate.getValue().booleanValue()) {
                }
                return s3q0.a;
            }
            if (i == 1) {
                j = this.J$0;
                kotlin.a.a(obj);
                this.$isAutoScrolling$delegate.setValue(Boolean.TRUE);
                mc90 mc90Var = this.$this_enableAutoScroll;
                int k = mc90Var.k();
                int i2 = k + 1;
                this.J$0 = j;
                this.label = 2;
                if (i2 <= mc90Var.k()) {
                    k += 2;
                    int o = mc90Var.o();
                    if (k > o) {
                        k = o;
                    }
                } else if (k < 0) {
                    k = 0;
                }
                Object b = mc90Var.b(MutatePriority.Default, new ap5(mc90Var, i2, k, null), this);
                if (b != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                if (!this.$isUserInteracting$delegate.getValue().booleanValue()) {
                }
                return s3q0.a;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                kotlin.a.a(obj);
                if (!this.$isUserInteracting$delegate.getValue().booleanValue() || !this.$isScreenOn$delegate.getValue().booleanValue() || !this.$isActive) {
                    return s3q0.a;
                }
                if (this.$shouldUseExtendedDelay$delegate.getValue().booleanValue()) {
                    this.$shouldUseExtendedDelay$delegate.setValue(Boolean.FALSE);
                    j = 6000;
                } else {
                    j = 3000;
                }
                this.J$0 = j;
                this.label = 1;
            } finally {
                this.$isAutoScrolling$delegate.setValue(Boolean.FALSE);
            }
        }
    }

    /* compiled from: Effects.kt */
    public static final class d implements kgn {
        public final /* synthetic */ f5z a;
        public final /* synthetic */ xo5 b;

        public d(f5z f5zVar, xo5 xo5Var) {
            this.a = f5zVar;
            this.b = xo5Var;
        }

        @Override // xsna.kgn
        public final void dispose() {
            this.a.getLifecycle().removeObserver(this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(mc90 mc90Var, boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        Object bVar;
        int i3;
        final mc90 mc90Var2 = mc90Var;
        final boolean z2 = z;
        androidx.compose.runtime.a M = aVar.M(-1224441943);
        if ((i & 6) == 0) {
            i2 = (M.J(mc90Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z2) ? 32 : 16;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1224441943, i4, -1, "com.vk.games.presentation.utils.enableAutoScroll (AutoscrollHelper.kt:23)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Boolean valueOf = Boolean.valueOf(mc90Var2.k.a());
            int i5 = i4 & 14;
            boolean z3 = i5 == 4;
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                i3 = i5;
                bVar = new b(mc90Var2, wh50Var2, wh50Var, wh50Var3, null);
                M.R(bVar);
            } else {
                i3 = i5;
                bVar = x4;
            }
            bap.g(valueOf, (wzs) bVar, M, 0);
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = androidx.compose.runtime.k.b(Boolean.TRUE);
                M.R(x5);
            }
            wh50 wh50Var4 = (wh50) x5;
            f5z f5zVar = (f5z) M.r(bvz.a);
            Configuration configuration = (Configuration) M.r(AndroidCompositionLocals_androidKt.a);
            boolean y = M.y(f5zVar);
            Object x6 = M.x();
            if (y || x6 == c0012a) {
                x6 = new defpackage.b0(5, f5zVar, wh50Var4);
                M.R(x6);
            }
            bap.c(f5zVar, (izs) x6, M, 0);
            Boolean bool = (Boolean) wh50Var.getValue();
            bool.getClass();
            Boolean bool2 = (Boolean) wh50Var4.getValue();
            bool2.getClass();
            Object[] objArr = {mc90Var2, bool, bool2, Integer.valueOf(configuration.orientation), Boolean.valueOf(z2)};
            boolean z4 = ((i4 & 112) == 32) | (i3 == 4);
            Object x7 = M.x();
            if (z4 || x7 == c0012a) {
                c cVar = new c(z2, mc90Var2, wh50Var, wh50Var4, wh50Var3, wh50Var2, null);
                z2 = z2;
                mc90Var2 = mc90Var2;
                M.R(cVar);
                x7 = cVar;
            }
            bap.h(objArr, (wzs) x7, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wo5
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    yo5.a(mc90.this, z2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
