package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.BlendModeCompat;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.u700;

/* compiled from: AnimatedStateButton.kt */
/* loaded from: classes3.dex */
public final class yl2 {

    /* compiled from: AnimatedStateButton.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.AnimatedStateButtonKt$AnimatedStateButton$2$1", f = "AnimatedStateButton.kt", l = {70, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $actualSpeed;
        final /* synthetic */ s600 $animatable;
        final /* synthetic */ s700 $composition$delegate;
        final /* synthetic */ wh50<S> $currentState$delegate;
        final /* synthetic */ S $targetState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(S s, s600 s600Var, float f, wh50<S> wh50Var, s700 s700Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$targetState = s;
            this.$animatable = s600Var;
            this.$actualSpeed = f;
            this.$currentState$delegate = wh50Var;
            this.$composition$delegate = s700Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$targetState, this.$animatable, this.$actualSpeed, this.$currentState$delegate, this.$composition$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            if (xsna.y600.b(r0, r13) != r11) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
        
            return r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
        
            if (xsna.s600.a.a(r0, r2, 0, false, r4, null, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, r13, 2030) == r11) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (!epx.f(this.$currentState$delegate.getValue(), this.$targetState)) {
                    s600 s600Var = this.$animatable;
                    i700 value = this.$composition$delegate.getValue();
                    float f = this.$actualSpeed;
                    this.label = 1;
                }
                s600 s600Var2 = this.$animatable;
                this.label = 2;
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
            this.$currentState$delegate.setValue(this.$targetState);
            s600 s600Var22 = this.$animatable;
            this.label = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <S> void a(final S s, final long j, final izs<? super S, Integer> izsVar, final q630 q630Var, izs<? super S, Float> izsVar2, float f, boolean z, izs<? super S, Integer> izsVar3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        izs<? super S, Float> izsVar4;
        int i4;
        int i5;
        int i6;
        izs<? super S, Integer> izsVar5;
        androidx.compose.runtime.a aVar2;
        final float f2;
        final boolean z2;
        final izs<? super S, Integer> izsVar6;
        androidx.compose.runtime.f s2;
        float d;
        t700 t700Var;
        s600 s600Var;
        izs<? super S, Float> izsVar7;
        Object obj;
        wh50 wh50Var;
        String f3;
        androidx.compose.runtime.a M = aVar.M(388741833);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? M.J(s) : M.y(s) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= M.p(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= M.J(q630Var) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            izsVar4 = izsVar2;
            i3 |= M.y(izsVar4) ? 16384 : 8192;
            i4 = 196608 | i3;
            i5 = i2 & 64;
            if (i5 == 0) {
                i4 = 1769472 | i3;
            } else if ((1572864 & i) == 0) {
                i4 |= M.l(z) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                i6 = i2 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                    izsVar5 = izsVar3;
                } else {
                    izsVar5 = izsVar3;
                    if ((i & 12582912) == 0) {
                        i4 |= M.y(izsVar5) ? 8388608 : 4194304;
                    }
                }
                boolean z3 = true;
                if (M.t(i4 & 1, (i4 & 4793491) != 4793490)) {
                    Object obj2 = a.C0011a.a;
                    if (i7 != 0) {
                        Object x = M.x();
                        if (x == obj2) {
                            x = new am0(3);
                            M.R(x);
                        }
                        izsVar4 = (izs) x;
                    }
                    boolean z4 = i5 != 0 ? false : z;
                    izs<? super S, Integer> izsVar8 = i6 != 0 ? null : izsVar5;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(388741833, i4, -1, "com.vk.music.stickyplayer.presentation.components.AnimatedStateButton (AnimatedStateButton.kt:40)");
                    }
                    Object x2 = M.x();
                    if (x2 == obj2) {
                        x2 = androidx.compose.runtime.k.b(s);
                        M.R(x2);
                    }
                    wh50 wh50Var2 = (wh50) x2;
                    t700 c = guf0.c(new u700.e(izsVar.invoke((Object) wh50Var2.getValue()).intValue()), M, 0);
                    l800 x3 = qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M);
                    if (z4) {
                        M.K(1777103154);
                        M.j();
                        d = Float.POSITIVE_INFINITY;
                    } else {
                        M.K(1777148724);
                        d = 1.0f / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
                        M.j();
                    }
                    s600 a2 = y600.a(M);
                    int i8 = i4 & 14;
                    if (i8 != 4 && ((i4 & 8) == 0 || !M.y(s))) {
                        z3 = false;
                    }
                    boolean J = z3 | M.J(a2) | M.J(c) | M.n(d);
                    Object x4 = M.x();
                    if (J || x4 == obj2) {
                        izs<? super S, Float> izsVar9 = izsVar4;
                        t700Var = c;
                        s600Var = a2;
                        izsVar7 = izsVar9;
                        obj = obj2;
                        wh50Var = wh50Var2;
                        Object aVar3 = new a(s, s600Var, d, wh50Var, t700Var, null);
                        M.R(aVar3);
                        x4 = aVar3;
                    } else {
                        izs<? super S, Float> izsVar10 = izsVar4;
                        t700Var = c;
                        s600Var = a2;
                        izsVar7 = izsVar10;
                        wh50Var = wh50Var2;
                        obj = obj2;
                    }
                    bap.g(s, (wzs) x4, M, i8);
                    float progress = (s600Var.getProgress() * (izsVar7.invoke(s).floatValue() - izsVar7.invoke((Object) wh50Var.getValue()).floatValue())) + izsVar7.invoke((Object) wh50Var.getValue()).floatValue();
                    Integer invoke = izsVar8 != null ? izsVar8.invoke((Object) wh50Var.getValue()) : null;
                    if (invoke == null) {
                        M.K(1777771327);
                        M.j();
                        f3 = null;
                    } else {
                        f3 = l4.f(M, 1777771328, invoke, M, 0);
                    }
                    boolean J2 = M.J(f3);
                    Object x5 = M.x();
                    if (J2 || x5 == obj) {
                        x5 = new wl2(f3, 0);
                        M.R(x5);
                    }
                    q630 a3 = o19.a(egi0.a(q630Var, (izs) x5), progress);
                    i700 i700Var = (i700) t700Var.getValue();
                    boolean J3 = M.J(s600Var);
                    Object x6 = M.x();
                    if (J3 || x6 == obj) {
                        x6 = new ka0(s600Var, 3);
                        M.R(x6);
                    }
                    gzs gzsVar = (gzs) x6;
                    izs<? super S, Integer> izsVar11 = izsVar8;
                    aVar2 = M;
                    izsVar4 = izsVar7;
                    z600.a(i700Var, gzsVar, a3, false, false, false, false, null, false, x3, null, null, false, false, null, null, false, aVar2, 1073741824, 0, 130552);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    izsVar6 = izsVar11;
                    z2 = z4;
                    f2 = 1.0f;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    f2 = f;
                    z2 = z;
                    izsVar6 = izsVar5;
                }
                final izs<? super S, Float> izsVar12 = izsVar4;
                s2 = aVar2.s();
                if (s2 != null) {
                    s2.d = new wzs() { // from class: xsna.xl2
                        @Override // xsna.wzs
                        public final Object invoke(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            yl2.a(s, j, izsVar, q630Var, izsVar12, f2, z2, izsVar6, (androidx.compose.runtime.a) obj3, ne7.I(i | 1), i2);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            boolean z32 = true;
            if (M.t(i4 & 1, (i4 & 4793491) != 4793490)) {
            }
            final izs izsVar122 = izsVar4;
            s2 = aVar2.s();
            if (s2 != null) {
            }
        }
        izsVar4 = izsVar2;
        i4 = 196608 | i3;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        boolean z322 = true;
        if (M.t(i4 & 1, (i4 & 4793491) != 4793490)) {
        }
        final izs izsVar1222 = izsVar4;
        s2 = aVar2.s();
        if (s2 != null) {
        }
    }
}
