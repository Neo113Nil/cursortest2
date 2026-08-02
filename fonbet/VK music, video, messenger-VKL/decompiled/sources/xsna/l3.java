package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AboutAppToolbar.kt */
/* loaded from: classes6.dex */
public final class l3 {

    /* compiled from: AboutAppToolbar.kt */
    @b6l(c = "com.vk.superapp.presentation.about.compose.AboutAppToolbarKt$AboutAppToolbar$1$1", f = "AboutAppToolbar.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<l5g> $backgroundColor$delegate;
        final /* synthetic */ Window $window;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Window window, mtk0<l5g> mtk0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$window = window;
            this.$backgroundColor$delegate = mtk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$window, this.$backgroundColor$delegate, spjVar);
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
            Window window = this.$window;
            if (window != null) {
                window.setStatusBarColor(f870.H(this.$backgroundColor$delegate.getValue().a));
            }
            return s3q0.a;
        }
    }

    /* compiled from: AboutAppToolbar.kt */
    @b6l(c = "com.vk.superapp.presentation.about.compose.AboutAppToolbarKt$AboutAppToolbar$2$1", f = "AboutAppToolbar.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ f5z $lifecycleOwner;
        final /* synthetic */ wh50<Boolean> $lifecycleToggle;
        int label;

        /* compiled from: AboutAppToolbar.kt */
        public static final class a implements androidx.lifecycle.l {
            public final /* synthetic */ wh50<Boolean> b;

            public a(wh50<Boolean> wh50Var) {
                this.b = wh50Var;
            }

            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_RESUME) {
                    this.b.setValue(Boolean.valueOf(!r1.getValue().booleanValue()));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f5z f5zVar, wh50<Boolean> wh50Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$lifecycleOwner = f5zVar;
            this.$lifecycleToggle = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$lifecycleOwner, this.$lifecycleToggle, spjVar);
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
            this.$lifecycleOwner.getLifecycle().addObserver(new a(this.$lifecycleToggle));
            return s3q0.a;
        }
    }

    /* compiled from: AboutAppToolbar.kt */
    @b6l(c = "com.vk.superapp.presentation.about.compose.AboutAppToolbarKt$AboutAppToolbar$3$1", f = "AboutAppToolbar.kt", l = {87}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wh50<Boolean> $isShowActionDropdown$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(wh50<Boolean> wh50Var, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$isShowActionDropdown$delegate = wh50Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$isShowActionDropdown$delegate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.label = 1;
                if (qsl.b(200L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$isShowActionDropdown$delegate.setValue(Boolean.FALSE);
            return s3q0.a;
        }
    }

    /* compiled from: AboutAppToolbar.kt */
    public static final class d implements gzs<l5g> {
        public final /* synthetic */ jgh0 b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        public d(jgh0 jgh0Var, long j, long j2) {
            this.b = jgh0Var;
            this.c = j;
            this.d = j2;
        }

        @Override // xsna.gzs
        public final l5g invoke() {
            return new l5g(((wak0) this.b.a).getIntValue() == 0 ? this.c : this.d);
        }
    }

    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-906855587);
        int i3 = i2 | (M.J(str) ? 4 : 2) | (M.o(i) ? 32 : 16) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-906855587, i3, -1, "com.vk.superapp.presentation.about.compose.AboutAppActionDropdownItem (AboutAppToolbar.kt:139)");
            }
            boolean z = (i3 & 7168) == 2048;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new k3(0, gzsVar);
                M.R(x);
            }
            q630 E = s200.E(txj0.j(48, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(ojc.c(q630Var, false, null, null, (gzs) x, 15), 1.0f)), 20, 10);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            pzu0.b(pg90.a(i, (i3 >> 3) & 14, M), null, txj0.q(q630.a.a, 24), wlb0.h(M).getIcon().b, M, 440, 0);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(str, s200.H(new xpy(1.0f, true), 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).X, M, i3 & 14, 0, 8184);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c3(i, i2, str, gzsVar, q630Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(jgh0 jgh0Var, izs<? super u0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        Window window;
        Window window2;
        androidx.compose.runtime.a M = aVar.M(-1818770928);
        int i2 = (M.J(jgh0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1818770928, i2, -1, "com.vk.superapp.presentation.about.compose.AboutAppToolbar (AboutAppToolbar.kt:46)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j2 = ylu0Var2.getBackground().g;
            boolean l = M.l(we7.m(M));
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (l || x == c0012a) {
                x = bbk0.b(new d(jgh0Var, j, j2));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-933599737, 0, -1, "com.vk.core.compose.utils.rememberWindow (Window.kt:23)");
            }
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            boolean J = M.J(view.getParent()) | M.J(view);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                ViewParent parent = view.getParent();
                omm ommVar = parent instanceof omm ? (omm) parent : null;
                if (ommVar == null || (window2 = ommVar.getWindow()) == null) {
                    Context context = view.getContext();
                    while (true) {
                        if (!(context instanceof Activity)) {
                            if (!(context instanceof ContextWrapper)) {
                                window = null;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        } else {
                            window = ((Activity) context).getWindow();
                            break;
                        }
                    }
                    x2 = window;
                } else {
                    x2 = window2;
                }
                M.R(x2);
            }
            Window window3 = (Window) x2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x3);
            }
            wh50 wh50Var = (wh50) x3;
            T value = wh50Var.getValue();
            l5g l5gVar = new l5g(((l5g) mtk0Var.getValue()).a);
            boolean y = M.y(window3) | M.J(mtk0Var);
            Object x4 = M.x();
            if (y || x4 == c0012a) {
                x4 = new a(window3, mtk0Var, null);
                M.R(x4);
            }
            bap.f(value, l5gVar, (wzs) x4, M, 0);
            f5z f5zVar = (f5z) M.r(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean y2 = M.y(f5zVar);
            Object x5 = M.x();
            if (y2 || x5 == c0012a) {
                x5 = new b(f5zVar, wh50Var, null);
                M.R(x5);
            }
            bap.g(f5zVar, (wzs) x5, M, 0);
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = bbk0.b(new b3(jgh0Var, 0));
                M.R(x6);
            }
            mtk0 mtk0Var2 = (mtk0) x6;
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x7);
            }
            wh50 wh50Var2 = (wh50) x7;
            Object x8 = M.x();
            if (x8 == c0012a) {
                x8 = androidx.compose.runtime.k.b(Boolean.FALSE);
                M.R(x8);
            }
            wh50 wh50Var3 = (wh50) x8;
            Boolean bool = (Boolean) wh50Var3.getValue();
            bool.getClass();
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = new c(wh50Var2, null);
                M.R(x9);
            }
            bap.g(bool, (wzs) x9, M, 0);
            aVar2 = M;
            uov0.a(null, null, 0L, 0L, null, ((pco) mtk0Var2.getValue()).b, kai.c(1098663447, new d3(izsVar, wh50Var2, mtk0Var, wh50Var3), M), aVar2, 1572864, 31);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new e3(jgh0Var, izsVar, i, 0);
        }
    }
}
