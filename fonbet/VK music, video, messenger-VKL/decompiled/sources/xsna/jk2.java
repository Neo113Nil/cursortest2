package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.graphics.BlendModeCompat;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.s600;
import xsna.u700;

/* compiled from: AnimatedIcon.kt */
/* loaded from: classes3.dex */
public final class jk2 {

    /* compiled from: AnimatedIcon.kt */
    @b6l(c = "com.vk.music.compose.AnimatedIconKt$AnimatedIcon$1$1", f = "AnimatedIcon.kt", l = {65}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $actualSpeed;
        final /* synthetic */ s600 $animatable;
        final /* synthetic */ s700 $composition$delegate;
        final /* synthetic */ wh50<Boolean> $isFirstComposition$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s600 s600Var, float f, wh50<Boolean> wh50Var, s700 s700Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$animatable = s600Var;
            this.$actualSpeed = f;
            this.$isFirstComposition$delegate = wh50Var;
            this.$composition$delegate = s700Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$animatable, this.$actualSpeed, this.$isFirstComposition$delegate, this.$composition$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if (this.$isFirstComposition$delegate.getValue().booleanValue()) {
                    this.$isFirstComposition$delegate.setValue(Boolean.FALSE);
                } else {
                    s600 s600Var = this.$animatable;
                    i700 value = this.$composition$delegate.getValue();
                    float f = this.$actualSpeed;
                    this.label = 1;
                    if (s600.a.a(s600Var, value, 0, false, f, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, this, 2030) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final int i, final long j, final q630 q630Var, float f, final Object obj, Integer num, boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        float f2;
        int i5;
        Integer num2;
        int i6;
        boolean z2;
        androidx.compose.runtime.a aVar2;
        final float f3;
        final Integer num3;
        final boolean z3;
        androidx.compose.runtime.f s;
        boolean z4;
        float f4;
        Integer num4;
        t700 c;
        Object x;
        Object obj2;
        s600 a2;
        boolean J;
        Object x2;
        t700 t700Var;
        Object obj3;
        String N;
        androidx.compose.runtime.a M = aVar.M(1112342703);
        if ((i2 & 6) == 0) {
            i4 = (M.o(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.p(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= M.J(q630Var) ? 256 : 128;
        }
        int i7 = i3 & 8;
        if (i7 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            f2 = f;
            i4 |= M.n(f2) ? 2048 : 1024;
            if ((i2 & 24576) == 0) {
                i4 |= M.y(obj) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
            } else if ((196608 & i2) == 0) {
                num2 = num;
                i4 |= M.J(num2) ? 131072 : 65536;
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((1572864 & i2) == 0) {
                    z2 = z;
                    i4 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    if (M.t(i4 & 1, (599187 & i4) == 599186)) {
                        aVar2 = M;
                        aVar2.h();
                        f3 = f2;
                        num3 = num2;
                        z3 = z2;
                    } else {
                        M.V();
                        if ((i2 & 1) == 0 || M.i()) {
                            if (i7 != 0) {
                                f2 = 1.0f;
                            }
                            if (i5 != 0) {
                                num2 = null;
                            }
                            if (i6 != 0) {
                                z4 = false;
                                f4 = f2;
                                num4 = num2;
                                M.S();
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1112342703, i4, -1, "com.vk.music.compose.AnimatedIcon (AnimatedIcon.kt:40)");
                                }
                                c = guf0.c(new u700.e(i), M, 0);
                                l800 x3 = qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M);
                                float d = f4 / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
                                x = M.x();
                                obj2 = a.C0011a.a;
                                if (x == obj2) {
                                    x = androidx.compose.runtime.k.b(Boolean.TRUE);
                                    M.R(x);
                                }
                                wh50 wh50Var = (wh50) x;
                                a2 = y600.a(M);
                                Integer valueOf = Integer.valueOf(i);
                                J = M.J(a2) | M.J(c) | M.n(d);
                                x2 = M.x();
                                if (!J || x2 == obj2) {
                                    t700Var = c;
                                    x2 = new a(a2, d, wh50Var, t700Var, null);
                                    obj3 = a2;
                                    M.R(x2);
                                } else {
                                    t700Var = c;
                                    obj3 = a2;
                                }
                                bap.f(valueOf, obj, (wzs) x2, M, (i4 & 14) | ((i4 >> 9) & 112));
                                if (num4 != null) {
                                    M.K(2130108163);
                                    M.j();
                                    N = null;
                                } else {
                                    M.K(2130108164);
                                    N = d370.N(num4.intValue(), (i4 >> 15) & 14, M);
                                    M.j();
                                }
                                if (z4) {
                                    M.K(2130564732);
                                    boolean J2 = M.J(N);
                                    Object x4 = M.x();
                                    if (J2 || x4 == obj2) {
                                        x4 = new ak2(N, 0);
                                        M.R(x4);
                                    }
                                    q630 b = egi0.b(q630Var, false, (izs) x4);
                                    i700 i700Var = (i700) t700Var.getValue();
                                    boolean J3 = M.J(obj3);
                                    Object x5 = M.x();
                                    if (J3 || x5 == obj2) {
                                        x5 = new i70(obj3, 2);
                                        M.R(x5);
                                    }
                                    aVar2 = M;
                                    z600.a(i700Var, (gzs) x5, b, false, false, false, false, null, false, x3, null, null, false, false, null, null, false, aVar2, 1073741824, 0, 130552);
                                    aVar2.j();
                                } else {
                                    M.K(2130193538);
                                    boolean J4 = M.J(N);
                                    Object x6 = M.x();
                                    if (J4 || x6 == obj2) {
                                        x6 = new xj2(N, 0);
                                        M.R(x6);
                                    }
                                    z600.b((i700) t700Var.getValue(), egi0.b(q630Var, false, (izs) x6), false, true, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.MAX_VALUE, false, false, false, false, null, false, false, x3, null, null, false, false, null, false, null, M, 1575936, 32768, 0, 4177844);
                                    M.j();
                                    aVar2 = M;
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                f3 = f4;
                                num3 = num4;
                                z3 = z4;
                            }
                        } else {
                            M.h();
                        }
                        f4 = f2;
                        num4 = num2;
                        z4 = z2;
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                        }
                        c = guf0.c(new u700.e(i), M, 0);
                        l800 x32 = qxm0.x(new n800[]{qxm0.y(t800.I, pe7.a(f870.H(j), BlendModeCompat.SRC_ATOP), new String[]{"**"}, M)}, M);
                        float d2 = f4 / b3r0.d((Context) M.r(AndroidCompositionLocals_androidKt.b));
                        x = M.x();
                        obj2 = a.C0011a.a;
                        if (x == obj2) {
                        }
                        wh50 wh50Var2 = (wh50) x;
                        a2 = y600.a(M);
                        Integer valueOf2 = Integer.valueOf(i);
                        J = M.J(a2) | M.J(c) | M.n(d2);
                        x2 = M.x();
                        if (J) {
                        }
                        t700Var = c;
                        x2 = new a(a2, d2, wh50Var2, t700Var, null);
                        obj3 = a2;
                        M.R(x2);
                        bap.f(valueOf2, obj, (wzs) x2, M, (i4 & 14) | ((i4 >> 9) & 112));
                        if (num4 != null) {
                        }
                        if (z4) {
                        }
                        if (androidx.compose.runtime.b.d()) {
                        }
                        f3 = f4;
                        num3 = num4;
                        z3 = z4;
                    }
                    s = aVar2.s();
                    if (s == null) {
                        s.d = new wzs() { // from class: xsna.ck2
                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                ((Integer) obj5).getClass();
                                jk2.a(i, j, q630Var, f3, obj, num3, z3, (androidx.compose.runtime.a) obj4, ne7.I(i2 | 1), i3);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                z2 = z;
                if (M.t(i4 & 1, (599187 & i4) == 599186)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            num2 = num;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            z2 = z;
            if (M.t(i4 & 1, (599187 & i4) == 599186)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        f2 = f;
        if ((i2 & 24576) == 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        num2 = num;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        z2 = z;
        if (M.t(i4 & 1, (599187 & i4) == 599186)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
