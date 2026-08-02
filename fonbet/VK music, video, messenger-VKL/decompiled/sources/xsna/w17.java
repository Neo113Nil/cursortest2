package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.haptic.MusicHapticEvent;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.ogo;
import xsna.q630;

/* compiled from: BigPlayerSeekbar.kt */
/* loaded from: classes3.dex */
public final class w17 {

    /* compiled from: BigPlayerSeekbar.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.BigPlayerSeekbarKt$SliderPanel$1$1", f = "BigPlayerSeekbar.kt", l = {143}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ sg50 $interactionSource;
        final /* synthetic */ wh50<Boolean> $isDragging$delegate;
        final /* synthetic */ View $view;
        int label;

        /* compiled from: BigPlayerSeekbar.kt */
        /* renamed from: xsna.w17$a$a, reason: collision with other inner class name */
        public static final class C3910a<T> implements lsr {
            public final /* synthetic */ View b;
            public final /* synthetic */ wh50<Boolean> c;

            public C3910a(View view, wh50<Boolean> wh50Var) {
                this.b = view;
                this.c = wh50Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                vax vaxVar = (vax) obj;
                this.c.setValue(Boolean.valueOf(vaxVar instanceof ogo.b));
                if (vaxVar instanceof ogo.c) {
                    cl40.a(this.b, MusicHapticEvent.SOFT);
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sg50 sg50Var, View view, wh50<Boolean> wh50Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$interactionSource = sg50Var;
            this.$view = view;
            this.$isDragging$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$interactionSource, this.$view, this.$isDragging$delegate, spjVar);
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
                caj0 b = this.$interactionSource.b();
                C3910a c3910a = new C3910a(this.$view, this.$isDragging$delegate);
                this.label = 1;
                b.getClass();
                if (caj0.k(b, c3910a, this) == coroutineSingletons) {
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

    /* compiled from: BigPlayerSeekbar.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.BigPlayerSeekbarKt$SliderPanel$2$1", f = "BigPlayerSeekbar.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $isDragging$delegate;
        final /* synthetic */ wh50<Float> $sliderValue$delegate;
        final /* synthetic */ float $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, wh50<Boolean> wh50Var, wh50<Float> wh50Var2, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$value = f;
            this.$isDragging$delegate = wh50Var;
            this.$sliderValue$delegate = wh50Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$value, this.$isDragging$delegate, this.$sliderValue$delegate, spjVar);
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
            if (!this.$isDragging$delegate.getValue().booleanValue()) {
                this.$sliderValue$delegate.setValue(Float.valueOf(this.$value));
            }
            return s3q0.a;
        }
    }

    /* compiled from: BigPlayerSeekbar.kt */
    @b6l(c = "com.vk.music.stickyplayer.presentation.components.BigPlayerSeekbarKt$SliderPanel$4$1$1", f = "BigPlayerSeekbar.kt", l = {173}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$view = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$view, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x0020 -> B:5:0x0023). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L15
                if (r1 != r2) goto Ld
                kotlin.a.a(r6)
                goto L23
            Ld:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L15:
                kotlin.a.a(r6)
            L18:
                r5.label = r2
                r3 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r6 = xsna.qsl.b(r3, r5)
                if (r6 != r0) goto L23
                return r0
            L23:
                android.view.View r6 = r5.$view
                com.vk.music.haptic.MusicHapticEvent r1 = com.vk.music.haptic.MusicHapticEvent.LIGHT
                xsna.cl40.a(r6, r1)
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: xsna.w17.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void a(final x17 x17Var, final float f, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        izs izsVar2;
        androidx.compose.runtime.a M = aVar.M(429077656);
        if ((i & 6) == 0) {
            i2 = (M.J(x17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 256 : 128;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(429077656, i2, -1, "com.vk.music.stickyplayer.presentation.components.BigPlayerSeekbar (BigPlayerSeekbar.kt:62)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new l1(x17Var, 10));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = bbk0.b(new com.vk.movika.sdk.base.ui.g(x17Var, 15));
                M.R(x2);
            }
            mtk0 mtk0Var2 = (mtk0) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = bbk0.b(new m1(x17Var, 6));
                M.R(x3);
            }
            mtk0 mtk0Var3 = (mtk0) x3;
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = bbk0.b(new jd(x17Var, 9));
                M.R(x4);
            }
            mtk0 mtk0Var4 = (mtk0) x4;
            float f2 = i17.b / 2;
            float f3 = f - f2;
            float f4 = 0;
            if (f3 < f4) {
                f3 = f4;
            }
            q630 F = s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            b(((Number) mtk0Var.getValue()).floatValue(), x17Var, izsVar2, ((Number) mtk0Var2.getValue()).floatValue(), M, (i2 & 896) | ((i2 << 3) & 112));
            f(384, M, (String) mtk0Var3.getValue(), (String) mtk0Var4.getValue(), s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.t17
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w17.a(x17.this, f, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final float f, final x17 x17Var, final izs<? super sx40, s3q0> izsVar, float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final float f3;
        wh50 wh50Var;
        androidx.compose.runtime.a M = aVar.M(-1964513004);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(x17Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.n(f2) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1964513004, i2, -1, "com.vk.music.stickyplayer.presentation.components.SliderPanel (BigPlayerSeekbar.kt:119)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x);
            }
            wh50 wh50Var2 = (wh50) x;
            Object x2 = M.x();
            if (x2 == obj) {
                x2 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x2;
            m0k0 m0k0Var = m0k0.a;
            i0k0 c2 = m0k0.c(l5g.d, i17.d, i17.e, M, 3126);
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = androidx.compose.runtime.k.b(null);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            Object x4 = M.x();
            if (x4 == obj) {
                x4 = bap.j(EmptyCoroutineContext.b, M);
                M.R(x4);
            }
            yvj yvjVar = (yvj) x4;
            String N = d370.N(((Boolean) ((zak0) x17Var.b).getValue()).booleanValue() ? R.string.music_kids_talkback_player_seek_track : R.string.music_talkback_player_seek_track, 0, M);
            Object x5 = M.x();
            if (x5 == obj) {
                x5 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x5);
            }
            wh50 wh50Var4 = (wh50) x5;
            boolean y = M.y(view);
            Object x6 = M.x();
            if (y || x6 == obj) {
                x6 = new a(sg50Var, view, wh50Var4, null);
                M.R(x6);
            }
            bap.g(sg50Var, (wzs) x6, M, 6);
            Object x7 = M.x();
            if (x7 == obj) {
                x7 = androidx.compose.runtime.k.b(Float.valueOf(f));
                M.R(x7);
            }
            wh50 wh50Var5 = (wh50) x7;
            Float valueOf = Float.valueOf(f);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object x8 = M.x();
            if (z || x8 == obj) {
                x8 = new b(f, wh50Var4, wh50Var5, null);
                M.R(x8);
            }
            bap.g(valueOf, (wzs) x8, M, i3);
            q630 f4 = txj0.f(q630.a.a, 1.0f);
            boolean J = M.J(N);
            Object x9 = M.x();
            if (J || x9 == obj) {
                x9 = new k17(N, 0);
                M.R(x9);
            }
            q630 E = ahn.E(egi0.a(f4, (izs) x9), "seekBar");
            float floatValue = ((Number) wh50Var5.getValue()).floatValue();
            boolean booleanValue = ((Boolean) ((zak0) x17Var.a).getValue()).booleanValue();
            boolean y2 = M.y(view) | M.y(yvjVar);
            Object x10 = M.x();
            if (y2 || x10 == obj) {
                x10 = new l17(view, yvjVar, wh50Var5, wh50Var2, wh50Var3, 0);
                wh50Var = wh50Var5;
                wh50Var2 = wh50Var2;
                wh50Var3 = wh50Var3;
                M.R(x10);
            } else {
                wh50Var = wh50Var5;
            }
            izs izsVar2 = (izs) x10;
            boolean z2 = (i2 & 896) == 256;
            Object x11 = M.x();
            if (z2 || x11 == obj) {
                x11 = new m17(izsVar, wh50Var, wh50Var2, wh50Var3, 0);
                M.R(x11);
            }
            f3 = f2;
            x0k0.a(floatValue, izsVar2, E, booleanValue, (gzs) x11, c2, sg50Var, kai.c(1288556368, new n17(x17Var, sg50Var, c2, 0), M), kai.c(1460970449, new yzs() { // from class: xsna.o17
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    g1k0 g1k0Var = (g1k0) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? aVar2.J(g1k0Var) : aVar2.y(g1k0Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1460970449, intValue, -1, "com.vk.music.stickyplayer.presentation.components.SliderPanel.<anonymous> (BigPlayerSeekbar.kt:188)");
                        }
                        w17.d(g1k0Var, f3, aVar2, (intValue & 14) | 8);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), null, M, 907542528, 1152);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            f3 = f2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final float f5 = f3;
            s.d = new wzs() { // from class: xsna.p17
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    w17.b(f, x17Var, izsVar, f5, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(x17 x17Var, sg50 sg50Var, i0k0 i0k0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-838306173);
        int i2 = i | (M.J(x17Var) ? 4 : 2) | (M.J(i0k0Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-838306173, i2, -1, "com.vk.music.stickyplayer.presentation.components.SliderThumb (BigPlayerSeekbar.kt:197)");
            }
            if (((Boolean) ((zak0) x17Var.a).getValue()).booleanValue()) {
                M.K(1255809485);
                float f = 2;
                m0k0.a.a(sg50Var, kci.l(q630.a.a, f, f), i0k0Var, true, i17.c, M, 224310 | (i2 & 896), 0);
            } else {
                M.K(1248808383);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q17(i, 0, x17Var, sg50Var, i0k0Var);
        }
    }

    public static final void d(final g1k0 g1k0Var, float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final float f2;
        androidx.compose.runtime.a M = aVar.M(-1374840617);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? M.J(g1k0Var) : M.y(g1k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f) ? 32 : 16;
        }
        boolean z = false;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1374840617, i2, -1, "com.vk.music.stickyplayer.presentation.components.SliderTrack (BigPlayerSeekbar.kt:211)");
            }
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && M.y(g1k0Var));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new yc(g1k0Var, 9);
                M.R(x);
            }
            gzs gzsVar = (gzs) x;
            if (i3 == 4 || ((i2 & 8) != 0 && M.y(g1k0Var))) {
                z = true;
            }
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new j1(g1k0Var, 11);
                M.R(x2);
            }
            f2 = f;
            e(f2, gzsVar, null, (gzs) x2, M, (i2 >> 3) & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            f2 = f;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.r17
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    w17.d(g1k0.this, f2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void e(final float f, final gzs gzsVar, q630 q630Var, final gzs gzsVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1359109707);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= M.y(gzsVar2) ? 2048 : 1024;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1359109707, i3, -1, "com.vk.music.stickyplayer.presentation.components.Track (BigPlayerSeekbar.kt:275)");
            }
            q630.a aVar2 = q630.a.a;
            q630 h = txj0.h(txj0.f(aVar2, 1.0f), i17.a);
            boolean z = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new izs() { // from class: xsna.j17
                    @Override // xsna.izs
                    public final Object invoke(Object obj) {
                        oio oioVar = (oio) obj;
                        boolean z2 = oioVar.getLayoutDirection() == LayoutDirection.Rtl;
                        float intBitsToFloat = Float.intBitsToFloat((int) (oioVar.d() >> 32));
                        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L);
                        long j = z2 ? floatToRawIntBits : floatToRawIntBits2;
                        if (!z2) {
                            floatToRawIntBits2 = floatToRawIntBits;
                        }
                        float I0 = oioVar.I0(i17.a);
                        oioVar.b1(I0, (r20 & 16) != 0 ? 0 : 1, 3, i17.e, j, floatToRawIntBits2);
                        int i4 = (int) (j >> 32);
                        float floatValue = (((Number) gzs.this.invoke()).floatValue() * (Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)) - Float.intBitsToFloat(i4))) + Float.intBitsToFloat(i4);
                        long floatToRawIntBits3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(floatValue) << 32);
                        oioVar.b1(I0, (r20 & 16) != 0 ? 0 : 1, 3, i17.f, j, (Float.floatToRawIntBits(((Float.intBitsToFloat(r6) - Float.intBitsToFloat(i4)) * f) + Float.intBitsToFloat(i4)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L));
                        oioVar.b1(I0, (r20 & 16) != 0 ? 0 : 1, 3, i17.d, (Float.floatToRawIntBits((((Number) gzsVar.invoke()).floatValue() * (Float.intBitsToFloat(r6) - Float.intBitsToFloat(i4))) + Float.intBitsToFloat(i4)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oioVar.n1() & 4294967295L))) & 4294967295L), floatToRawIntBits3);
                        return s3q0.a;
                    }
                };
                M.R(x);
            }
            xa4.i(0, M, (izs) x, h);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.s17
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w17.e(f, gzsVar, q630Var2, gzsVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void f(int i, androidx.compose.runtime.a aVar, String str, String str2, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-759052152);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-759052152, i2, -1, "com.vk.music.stickyplayer.presentation.components.TrackTimePanel (BigPlayerSeekbar.kt:237)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            int i3 = i2 & 14;
            String g = g(str, true, M, i3 | 48);
            int i4 = (i2 >> 3) & 14;
            String g2 = g(str2, false, M, i4 | 48);
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "time");
            ty6 ty6Var = dt1.a.e;
            ra8 ra8Var = ra8.a;
            q630 b2 = ra8Var.b(aVar3, ty6Var);
            boolean J = M.J(g);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (J || x == c0012a) {
                x = new p1(g, 11);
                M.R(x);
            }
            q630 g3 = E.g(egi0.a(b2, (izs) x));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            iyk0 iyk0Var = rrv0.c;
            wuv0 wuv0Var = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.w0;
            long j = l5g.d;
            yqv0.c(str, g3, j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, i3 | 384, 0, 8184);
            q630 E2 = ahn.E(aVar3, "duration");
            q630 b3 = ra8Var.b(aVar3, dt1.a.g);
            boolean J2 = M.J(g2);
            Object x2 = M.x();
            if (J2 || x2 == c0012a) {
                x2 = new u17(g2, 0);
                M.R(x2);
            }
            q630 g4 = E2.g(egi0.a(b3, (izs) x2));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var2 = (wuv0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str2, g4, j, null, null, 0, 0, null, 0, false, 0, 0, null, wuv0Var2.w0, M, i4 | 384, 0, 8184);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v17(i, 0, str, str2, q630Var);
        }
    }

    public static final String g(String str, boolean z, androidx.compose.runtime.a aVar, int i) {
        String F;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2028139693, i, -1, "com.vk.music.stickyplayer.presentation.components.getTimeContentDescription (BigPlayerSeekbar.kt:344)");
        }
        List c0 = drm0.c0(str, new String[]{StringUtils.PROCESS_POSTFIX_DELIMITER}, 0, 6);
        ArrayList arrayList = new ArrayList(c5g.u(c0, 10));
        Iterator it = c0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        int abs = Math.abs(((Number) arrayList.get(0)).intValue());
        int intValue = ((Number) arrayList.get(1)).intValue();
        if (z) {
            aVar.K(1290726890);
            F = d370.F(R.plurals.music_player_talkback_minutes, abs, new Object[]{Integer.valueOf(abs)}, aVar, 0) + d370.F(R.plurals.music_player_talkback_seconds, intValue, new Object[]{Integer.valueOf(intValue)}, aVar, 0);
            aVar.j();
        } else {
            aVar.K(1290965931);
            F = d370.F(R.plurals.music_player_talkback_minutes_header_remaining, abs, new Object[]{fo8.a(d370.F(R.plurals.music_player_talkback_minutes, abs, new Object[]{Integer.valueOf(abs)}, aVar, 0), d370.F(R.plurals.music_player_talkback_seconds, intValue, new Object[]{Integer.valueOf(intValue)}, aVar, 0))}, aVar, 0);
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return F;
    }
}
