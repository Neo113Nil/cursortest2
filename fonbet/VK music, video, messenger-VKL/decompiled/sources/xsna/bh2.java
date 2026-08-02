package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: AnimatedButton.kt */
/* loaded from: classes3.dex */
public final class bh2 {

    /* compiled from: AnimatedButton.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.AnimatedButtonKt$AnimatedButton$2$1", f = "AnimatedButton.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ if2<Float, sq2> $animatable;
        final /* synthetic */ yvj $coroutineScope;
        final /* synthetic */ wh50<T> $currentState$delegate;
        final /* synthetic */ T $state;
        int label;

        /* compiled from: AnimatedButton.kt */
        @b6l(c = "com.vk.music.stickyplayer.presentation.components.AnimatedButtonKt$AnimatedButton$2$1$1", f = "AnimatedButton.kt", l = {44, 46}, m = "invokeSuspend")
        /* renamed from: xsna.bh2$a$a, reason: collision with other inner class name */
        public static final class C2609a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ if2<Float, sq2> $animatable;
            final /* synthetic */ wh50<T> $currentState$delegate;
            final /* synthetic */ T $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2609a(if2<Float, sq2> if2Var, T t, wh50<T> wh50Var, spj<? super C2609a> spjVar) {
                super(2, spjVar);
                this.$animatable = if2Var;
                this.$state = t;
                this.$currentState$delegate = wh50Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2609a(this.$animatable, this.$state, this.$currentState$delegate, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2609a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
            
                if (xsna.if2.c(r3, r4, null, null, r7, 14) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
            
                if (xsna.if2.c(r3, r4, null, null, r7, 14) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                C2609a c2609a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if2<Float, sq2> if2Var = this.$animatable;
                    Float f = new Float(0.8f);
                    this.label = 1;
                    c2609a = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                    c2609a = this;
                }
                c2609a.$currentState$delegate.setValue(c2609a.$state);
                if2<Float, sq2> if2Var2 = c2609a.$animatable;
                Float f2 = new Float(1.0f);
                c2609a.label = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(T t, yvj yvjVar, wh50<T> wh50Var, if2<Float, sq2> if2Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$state = t;
            this.$coroutineScope = yvjVar;
            this.$currentState$delegate = wh50Var;
            this.$animatable = if2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$state, this.$coroutineScope, this.$currentState$delegate, this.$animatable, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (!epx.f(this.$currentState$delegate.getValue(), this.$state)) {
                myc0.h(this.$coroutineScope, null, null, new C2609a(this.$animatable, this.$state, this.$currentState$delegate, null), 3);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> void a(final T t, final long j, final yzs<? super T, ? super androidx.compose.runtime.a, ? super Integer, ? extends lg90> yzsVar, final q630 q630Var, final String str, boolean z, boolean z2, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        androidx.compose.runtime.a aVar2;
        boolean z5;
        final boolean z6;
        androidx.compose.runtime.f s;
        int i5;
        androidx.compose.runtime.a M = aVar.M(493552108);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(t) : M.y(t) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(yzsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= M.J(str) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            z3 = z;
            i3 |= M.l(z3) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                z4 = z2;
                i3 |= M.l(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                if ((i & 12582912) == 0) {
                    i3 |= M.y(gzsVar) ? 8388608 : 4194304;
                }
                if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
                    z5 = i6 != 0 ? true : z3;
                    boolean z7 = i4 != 0 ? true : z4;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(493552108, i3, -1, "com.vk.music.stickyplayer.presentation.components.AnimatedButton (AnimatedButton.kt:30)");
                    }
                    Object x = M.x();
                    Object obj = a.C0011a.a;
                    if (x == obj) {
                        x = bap.j(EmptyCoroutineContext.b, M);
                        M.R(x);
                    }
                    yvj yvjVar = (yvj) x;
                    Object x2 = M.x();
                    if (x2 == obj) {
                        i5 = i3;
                        x2 = new if2(Float.valueOf(1.0f), rte0.e, null, 12);
                        M.R(x2);
                    } else {
                        i5 = i3;
                    }
                    if2 if2Var = (if2) x2;
                    Object x3 = M.x();
                    if (x3 == obj) {
                        x3 = androidx.compose.runtime.k.b(t);
                        M.R(x3);
                    }
                    wh50 wh50Var = (wh50) x3;
                    int i7 = i5 & 14;
                    boolean y = (i7 == 4 || ((i5 & 8) != 0 && M.y(t))) | M.y(yvjVar) | M.y(if2Var);
                    Object x4 = M.x();
                    if (y || x4 == obj) {
                        Object aVar3 = new a(t, yvjVar, wh50Var, if2Var, null);
                        M.R(aVar3);
                        x4 = aVar3;
                    }
                    int i8 = i5 & 8;
                    bap.g(t, (wzs) x4, M, i7);
                    boolean y2 = M.y(if2Var) | ((i5 & 3670016) == 1048576);
                    Object x5 = M.x();
                    if (y2 || x5 == obj) {
                        x5 = new zg2(if2Var, z7, 0);
                        M.R(x5);
                    }
                    aVar2 = M;
                    nzu0.c(gzsVar, yzsVar.invoke(wh50Var.getValue(), M, Integer.valueOf(i8 | ((i5 >> 3) & 112))), str, rdu.a(q630Var, (izs) x5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, z5, null, null, aVar2, ((i5 >> 21) & 14) | 64 | ((i5 >> 6) & 896) | ((i5 << 12) & 458752) | ((i5 << 9) & 234881024), 1744);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    z6 = z7;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    z5 = z3;
                    z6 = z4;
                }
                s = aVar2.s();
                if (s != null) {
                    final boolean z8 = z5;
                    s.d = new wzs() { // from class: xsna.ah2
                        @Override // xsna.wzs
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            bh2.a(t, j, yzsVar, q630Var, str, z8, z6, gzsVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            z4 = z2;
            if ((i & 12582912) == 0) {
            }
            if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        z3 = z;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        z4 = z2;
        if ((i & 12582912) == 0) {
        }
        if (M.t(i3 & 1, (i3 & 4793491) != 4793490)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final long j, final lg90 lg90Var, q630 q630Var, final String str, boolean z, final gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        q630 q630Var2;
        int i3;
        boolean z2;
        int i4;
        int i5;
        androidx.compose.runtime.a aVar2;
        final q630 q630Var3;
        final boolean z3;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar.M(2078506471);
        int i6 = (M.p(j) ? 4 : 2) | i | (M.y(lg90Var) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i6 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 256 : 128;
            int i8 = i6 | (!M.J(str) ? 2048 : 1024);
            i3 = i2 & 16;
            if (i3 == 0) {
                i4 = i8 | 24576;
                z2 = z;
            } else {
                z2 = z;
                i4 = i8 | (M.l(z2) ? 16384 : 8192);
            }
            i5 = i4 | (!M.y(gzsVar) ? 131072 : 65536);
            if (M.t(i5 & 1, (74899 & i5) == 74898)) {
                aVar2 = M;
                aVar2.h();
                q630Var3 = q630Var2;
                z3 = z2;
            } else {
                q630 q630Var4 = i7 != 0 ? q630.a.a : q630Var2;
                boolean z4 = i3 != 0 ? true : z2;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2078506471, i5, -1, "com.vk.music.stickyplayer.presentation.components.AnimatedButton (AnimatedButton.kt:76)");
                }
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = androidx.compose.runtime.i.a(0);
                    M.R(x);
                }
                rg50 rg50Var = (rg50) x;
                Integer valueOf = Integer.valueOf(rg50Var.getIntValue());
                wg2 wg2Var = new wg2(lg90Var, 0);
                boolean z5 = (i5 & 458752) == 131072;
                Object x2 = M.x();
                if (z5 || x2 == c0012a) {
                    x2 = new xg2(0, gzsVar, rg50Var);
                    M.R(x2);
                }
                int i9 = i5 << 3;
                aVar2 = M;
                q630 q630Var5 = q630Var4;
                a(valueOf, j, wg2Var, q630Var5, str, z4, false, (gzs) x2, aVar2, (i9 & 112) | 1572864 | (i9 & 7168) | (57344 & i9) | (i9 & 458752), 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = q630Var5;
                z3 = z4;
            }
            s = aVar2.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.yg2
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bh2.b(j, lg90Var, q630Var3, str, z3, gzsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        q630Var2 = q630Var;
        int i82 = i6 | (!M.J(str) ? 2048 : 1024);
        i3 = i2 & 16;
        if (i3 == 0) {
        }
        i5 = i4 | (!M.y(gzsVar) ? 131072 : 65536);
        if (M.t(i5 & 1, (74899 & i5) == 74898)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
