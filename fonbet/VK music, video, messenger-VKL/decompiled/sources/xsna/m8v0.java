package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.Lifecycle;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkOnboardingTooltip.kt */
/* loaded from: classes17.dex */
public final class m8v0 extends rpo0 {
    public static final /* synthetic */ int M = 0;
    public final wh50 A;
    public final wh50 B;
    public final wh50 C;
    public final wh50 D;
    public final wh50 E;
    public final wh50 F;
    public final wh50 G;
    public final wh50 H;
    public final h8v0 I;
    public final i8v0 J;
    public WeakReference<View> K;
    public final j8v0 L;
    public final wh50 m;
    public final wh50 n;
    public final wh50 o;
    public final wh50 p;
    public final wh50 q;
    public final wh50 r;
    public final wh50 s;
    public final wh50 t;
    public final wh50 u;
    public final wh50 v;
    public final wh50 w;
    public final wh50 x;
    public final Object y;
    public gzs<Rect> z;

    /* compiled from: VkOnboardingTooltip.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:118:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x00e5  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x00ed  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void a(View view, String str, gzs gzsVar, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, VkOnboarding$TintColor vkOnboarding$TintColor, VkTooltip$BalloonPosition vkTooltip$BalloonPosition, VkTooltip$BalloonTilt vkTooltip$BalloonTilt, izs izsVar, izs izsVar2, izs izsVar3, izs izsVar4, izs izsVar5, izs izsVar6, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, int i, boolean z, Lifecycle lifecycle, f5z f5zVar, boolean z2, Context context, boolean z3, int i2) {
            gzs gzsVar2;
            Lifecycle lifecycle2;
            Lifecycle lifecycle3;
            Lifecycle.State state;
            Window window;
            Window window2;
            int i3 = m8v0.M;
            gzs gzsVar3 = (i2 & 4) != 0 ? null : gzsVar;
            VkTooltip$MarkerStyle vkTooltip$MarkerStyle2 = (i2 & 8) != 0 ? VkTooltip$MarkerStyle.Style1 : vkTooltip$MarkerStyle;
            VkTooltip$MarkerSize vkTooltip$MarkerSize2 = (i2 & 16) != 0 ? VkTooltip$MarkerSize.Size48 : vkTooltip$MarkerSize;
            VkOnboarding$TintColor vkOnboarding$TintColor2 = (i2 & 32) != 0 ? VkOnboarding$TintColor.Lime : vkOnboarding$TintColor;
            VkTooltip$BalloonPosition vkTooltip$BalloonPosition2 = (i2 & 64) != 0 ? VkTooltip$BalloonPosition.TopRight : vkTooltip$BalloonPosition;
            VkTooltip$BalloonTilt vkTooltip$BalloonTilt2 = (i2 & 128) != 0 ? VkTooltip$BalloonTilt.Left : vkTooltip$BalloonTilt;
            izs izsVar7 = (i2 & 512) != 0 ? null : izsVar2;
            izs izsVar8 = (i2 & 1024) != 0 ? null : izsVar3;
            izs izsVar9 = (i2 & 2048) != 0 ? null : izsVar4;
            izs izsVar10 = (i2 & 4096) != 0 ? null : izsVar5;
            izs izsVar11 = (i2 & 8192) != 0 ? null : izsVar6;
            VkOnboardingStat$Delegate vkOnboardingStat$Delegate2 = (i2 & 16384) != 0 ? null : vkOnboardingStat$Delegate;
            int i4 = (32768 & i2) != 0 ? atv0.b : i;
            boolean z4 = (i2 & 65536) != 0 ? false : z;
            Lifecycle lifecycle4 = (i2 & 131072) != 0 ? null : lifecycle;
            f5z f5zVar2 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : f5zVar;
            boolean z5 = (i2 & 524288) == 0;
            boolean z6 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? true : z2;
            boolean z7 = (i2 & 2097152) == 0;
            Context context2 = (i2 & 4194304) != 0 ? null : context;
            boolean z8 = (i2 & 8388608) != 0 ? true : z3;
            Context context3 = view.getContext();
            if (lifecycle4 == null) {
                f5z e = gqo.e(view);
                if (e == null) {
                    gzsVar2 = gzsVar3;
                    lifecycle2 = null;
                    if (f5zVar2 == null) {
                        f5zVar2 = gqo.e(view);
                    }
                    f5z f5zVar3 = f5zVar2;
                    if (lifecycle2 == null) {
                        lifecycle3 = lifecycle2;
                        state = lifecycle2.getCurrentState();
                    } else {
                        lifecycle3 = lifecycle2;
                        state = null;
                    }
                    boolean z9 = z4;
                    if (state == Lifecycle.State.RESUMED || f5zVar3 == null || f5zVar3.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                        return;
                    }
                    Activity h = e3m.h(context3);
                    if (h == null || !h.isFinishing()) {
                        WindowManager windowManager = (WindowManager) context3.getSystemService(WindowManager.class);
                        if (context2 != null) {
                            context3 = context2;
                        }
                        m8v0 m8v0Var = new m8v0(context3);
                        gqo.f(m8v0Var, f5zVar3);
                        lyd.h(m8v0Var, lyd.f(view));
                        m8v0Var.setTitle(str);
                        m8v0Var.setMarkerStyle(vkTooltip$MarkerStyle2);
                        m8v0Var.setMarkerSize(vkTooltip$MarkerSize2);
                        m8v0Var.setMarkerColor(vkOnboarding$TintColor2);
                        m8v0Var.setBalloonPosition(vkTooltip$BalloonPosition2);
                        m8v0Var.setBalloonTilt(vkTooltip$BalloonTilt2);
                        m8v0Var.setOnTooltipAnchorClick(izsVar);
                        m8v0Var.setOnTooltipBalloonClick(izsVar7);
                        m8v0Var.setOnTooltipAnchorLongClick(izsVar8);
                        m8v0Var.setOnTooltipBalloonLongClick(izsVar9);
                        m8v0Var.setOnTooltipShown(izsVar10);
                        m8v0Var.setOnDispose(izsVar11);
                        m8v0Var.setStatDelegate(vkOnboardingStat$Delegate2);
                        m8v0Var.m412setBalloonMaxWidthDp0680j_4(i4);
                        m8v0Var.setAutoPosition(z9);
                        m8v0Var.setLifecycle(lifecycle3);
                        m8v0Var.setDismissIfNotResumed(z5);
                        m8v0Var.setPopupClippingEnabled(z6);
                        m8v0Var.setForceDarkTheme(z8);
                        WeakReference<View> weakReference = new WeakReference<>(view);
                        int i5 = 7;
                        m8v0Var.z = gzsVar2 == null ? new uvs0(weakReference, i5) : gzsVar2;
                        Activity b = enj.b(view);
                        View decorView = (b == null || (window2 = b.getWindow()) == null) ? null : window2.getDecorView();
                        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                        layoutParams.copyFrom((b == null || (window = b.getWindow()) == null) ? null : window.getAttributes());
                        if (decorView != null) {
                            layoutParams.systemUiVisibility = decorView.getSystemUiVisibility();
                        }
                        layoutParams.gravity = 0;
                        layoutParams.width = -1;
                        layoutParams.height = -1;
                        layoutParams.type = 2;
                        layoutParams.windowAnimations = 0;
                        layoutParams.softInputMode = 1;
                        layoutParams.format = -2;
                        layoutParams.flags = 66824;
                        layoutParams.layoutInDisplayCutoutMode = 1;
                        layoutParams.x = 0;
                        layoutParams.y = 0;
                        windowManager.addView(m8v0Var, layoutParams);
                        mi1 mi1Var = new mi1(weakReference, m8v0Var, windowManager, i5);
                        if (z7) {
                            view.addOnAttachStateChangeListener(new l8v0(view, mi1Var));
                        } else {
                            view.addOnAttachStateChangeListener(new k8v0(view, mi1Var));
                        }
                        view.addOnLayoutChangeListener(m8v0Var.J);
                        m8v0Var.K = weakReference;
                        view.getViewTreeObserver().addOnGlobalLayoutListener(m8v0Var.L);
                        return;
                    }
                    return;
                }
                lifecycle4 = e.getLifecycle();
            }
            gzsVar2 = gzsVar3;
            lifecycle2 = lifecycle4;
            if (f5zVar2 == null) {
            }
            f5z f5zVar32 = f5zVar2;
            if (lifecycle2 == null) {
            }
            boolean z92 = z4;
            if (state == Lifecycle.State.RESUMED) {
            }
        }
    }

    /* compiled from: VkOnboardingTooltip.kt */
    @b6l(c = "com.vk.core.tool.view.onboarding.VkOnboardingTooltip$ThemedContent$1$1", f = "VkOnboardingTooltip.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ etv0 $state;
        int label;
        final /* synthetic */ m8v0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(etv0 etv0Var, m8v0 m8v0Var, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$state = etv0Var;
            this.this$0 = m8v0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$state, this.this$0, spjVar);
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
            if (!this.$state.isVisible()) {
                m8v0 m8v0Var = this.this$0;
                ((WindowManager) m8v0Var.y).removeView(m8v0Var);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkOnboardingTooltip.kt */
    @b6l(c = "com.vk.core.tool.view.onboarding.VkOnboardingTooltip$ThemedContent$2$1", f = "VkOnboardingTooltip.kt", l = {}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ mtk0<Lifecycle.Event> $lifecycleState;
        int label;
        final /* synthetic */ m8v0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(mtk0<? extends Lifecycle.Event> mtk0Var, m8v0 m8v0Var, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$lifecycleState = mtk0Var;
            this.this$0 = m8v0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new c(this.$lifecycleState, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            mtk0<Lifecycle.Event> mtk0Var = this.$lifecycleState;
            if ((mtk0Var != null ? mtk0Var.getValue() : null) == Lifecycle.Event.ON_PAUSE && this.this$0.getDismissIfNotResumed()) {
                m8v0 m8v0Var = this.this$0;
                ((WindowManager) m8v0Var.y).removeView(m8v0Var);
            }
            return s3q0.a;
        }
    }

    /* compiled from: VkOnboardingTooltip.kt */
    public static final class d implements gzs {
        public static final d b = new d();

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ Object invoke() {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [xsna.h8v0] */
    /* JADX WARN: Type inference failed for: r8v12, types: [xsna.i8v0] */
    /* JADX WARN: Type inference failed for: r8v14, types: [xsna.j8v0] */
    public m8v0(Context context) {
        super(context, null, 6, 0);
        this.m = androidx.compose.runtime.k.b("");
        this.n = androidx.compose.runtime.k.b(VkTooltip$MarkerStyle.Style1);
        this.o = androidx.compose.runtime.k.b(VkTooltip$MarkerSize.Size48);
        this.p = androidx.compose.runtime.k.b(VkOnboarding$TintColor.Lime);
        this.q = androidx.compose.runtime.k.b(VkTooltip$BalloonPosition.TopRight);
        this.r = androidx.compose.runtime.k.b(VkTooltip$BalloonTilt.Left);
        this.s = androidx.compose.runtime.k.b(null);
        this.t = androidx.compose.runtime.k.b(null);
        this.u = androidx.compose.runtime.k.b(null);
        this.v = androidx.compose.runtime.k.b(null);
        this.w = androidx.compose.runtime.k.b(null);
        this.x = androidx.compose.runtime.k.b(null);
        this.y = context.getSystemService(WindowManager.class);
        this.z = d.b;
        this.A = androidx.compose.runtime.k.b(null);
        this.B = cq.f(atv0.b);
        Boolean bool = Boolean.FALSE;
        this.C = androidx.compose.runtime.k.b(bool);
        long j = 0;
        this.D = androidx.compose.runtime.k.b(new h9x((j & 4294967295L) | (j << 32)));
        this.E = androidx.compose.runtime.k.b(null);
        this.F = androidx.compose.runtime.k.b(bool);
        Boolean bool2 = Boolean.TRUE;
        this.G = androidx.compose.runtime.k.b(bool2);
        this.H = androidx.compose.runtime.k.b(bool2);
        this.I = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.h8v0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                m8v0.this.W();
            }
        };
        this.J = new View.OnLayoutChangeListener() { // from class: xsna.i8v0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                m8v0.this.W();
            }
        };
        this.K = new WeakReference<>(null);
        this.L = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: xsna.j8v0
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                m8v0.this.W();
            }
        };
    }

    public static h9x B(m8v0 m8v0Var) {
        return new h9x(m8v0Var.m411getMarkerPositionnOccac());
    }

    private final boolean getAutoPosition() {
        return ((Boolean) ((zak0) this.C).getValue()).booleanValue();
    }

    /* renamed from: getBalloonMaxWidthDp-D9Ej5fM, reason: not valid java name */
    private final float m410getBalloonMaxWidthDpD9Ej5fM() {
        return ((pco) ((zak0) this.B).getValue()).b;
    }

    private final VkTooltip$BalloonPosition getBalloonPosition() {
        return (VkTooltip$BalloonPosition) ((zak0) this.q).getValue();
    }

    private final VkTooltip$BalloonTilt getBalloonTilt() {
        return (VkTooltip$BalloonTilt) ((zak0) this.r).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getDismissIfNotResumed() {
        return ((Boolean) ((zak0) this.F).getValue()).booleanValue();
    }

    private final boolean getForceDarkTheme() {
        return ((Boolean) ((zak0) this.H).getValue()).booleanValue();
    }

    private final Lifecycle getLifecycle() {
        return (Lifecycle) ((zak0) this.E).getValue();
    }

    private final VkOnboarding$TintColor getMarkerColor() {
        return (VkOnboarding$TintColor) ((zak0) this.p).getValue();
    }

    /* renamed from: getMarkerPosition-nOcc-ac, reason: not valid java name */
    private final long m411getMarkerPositionnOccac() {
        return ((h9x) ((zak0) this.D).getValue()).a;
    }

    private final VkTooltip$MarkerSize getMarkerSize() {
        return (VkTooltip$MarkerSize) ((zak0) this.o).getValue();
    }

    private final VkTooltip$MarkerStyle getMarkerStyle() {
        return (VkTooltip$MarkerStyle) ((zak0) this.n).getValue();
    }

    private final izs<Boolean, s3q0> getOnDispose() {
        return (izs) ((zak0) this.x).getValue();
    }

    private final izs<etv0, s3q0> getOnTooltipAnchorClick() {
        return (izs) ((zak0) this.s).getValue();
    }

    private final izs<etv0, s3q0> getOnTooltipAnchorLongClick() {
        return (izs) ((zak0) this.u).getValue();
    }

    private final izs<etv0, s3q0> getOnTooltipBalloonClick() {
        return (izs) ((zak0) this.t).getValue();
    }

    private final izs<etv0, s3q0> getOnTooltipBalloonLongClick() {
        return (izs) ((zak0) this.v).getValue();
    }

    private final izs<etv0, s3q0> getOnTooltipShown() {
        return (izs) ((zak0) this.w).getValue();
    }

    private final boolean getPopupClippingEnabled() {
        return ((Boolean) ((zak0) this.G).getValue()).booleanValue();
    }

    private final VkOnboardingStat$Delegate getStatDelegate() {
        return (VkOnboardingStat$Delegate) ((zak0) this.A).getValue();
    }

    private final String getTitle() {
        return (String) ((zak0) this.m).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAutoPosition(boolean z) {
        ((zak0) this.C).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setBalloonMaxWidthDp-0680j_4, reason: not valid java name */
    public final void m412setBalloonMaxWidthDp0680j_4(float f) {
        ((zak0) this.B).setValue(new pco(f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBalloonPosition(VkTooltip$BalloonPosition vkTooltip$BalloonPosition) {
        ((zak0) this.q).setValue(vkTooltip$BalloonPosition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBalloonTilt(VkTooltip$BalloonTilt vkTooltip$BalloonTilt) {
        ((zak0) this.r).setValue(vkTooltip$BalloonTilt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDismissIfNotResumed(boolean z) {
        ((zak0) this.F).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setForceDarkTheme(boolean z) {
        ((zak0) this.H).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLifecycle(Lifecycle lifecycle) {
        ((zak0) this.E).setValue(lifecycle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMarkerColor(VkOnboarding$TintColor vkOnboarding$TintColor) {
        ((zak0) this.p).setValue(vkOnboarding$TintColor);
    }

    /* renamed from: setMarkerPosition--gyyYBs, reason: not valid java name */
    private final void m413setMarkerPositiongyyYBs(long j) {
        ((zak0) this.D).setValue(new h9x(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMarkerSize(VkTooltip$MarkerSize vkTooltip$MarkerSize) {
        ((zak0) this.o).setValue(vkTooltip$MarkerSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMarkerStyle(VkTooltip$MarkerStyle vkTooltip$MarkerStyle) {
        ((zak0) this.n).setValue(vkTooltip$MarkerStyle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnDispose(izs<? super Boolean, s3q0> izsVar) {
        ((zak0) this.x).setValue(izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnTooltipAnchorClick(izs<? super etv0, s3q0> izsVar) {
        ((zak0) this.s).setValue(izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnTooltipAnchorLongClick(izs<? super etv0, s3q0> izsVar) {
        ((zak0) this.u).setValue(izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnTooltipBalloonClick(izs<? super etv0, s3q0> izsVar) {
        ((zak0) this.t).setValue(izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnTooltipBalloonLongClick(izs<? super etv0, s3q0> izsVar) {
        ((zak0) this.v).setValue(izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOnTooltipShown(izs<? super etv0, s3q0> izsVar) {
        ((zak0) this.w).setValue(izsVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPopupClippingEnabled(boolean z) {
        ((zak0) this.G).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStatDelegate(VkOnboardingStat$Delegate vkOnboardingStat$Delegate) {
        ((zak0) this.A).setValue(vkOnboardingStat$Delegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitle(String str) {
        ((zak0) this.m).setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.rpo0
    public final void A(int i, androidx.compose.runtime.a aVar) {
        wh50 a2;
        gzs gzsVar;
        gzs gzsVar2;
        gzs gzsVar3;
        gzs gzsVar4;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle;
        gzs gzsVar5;
        gzs gzsVar6;
        gzs gzsVar7;
        gzs gzsVar8;
        androidx.compose.runtime.a M2 = aVar.M(785653859);
        int i2 = i | (M2.J(this) ? 4 : 2);
        if (M2.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(785653859, i2, -1, "com.vk.core.tool.view.onboarding.VkOnboardingTooltip.ThemedContent (VkOnboardingTooltip.kt:104)");
            }
            buv0 z = rdi.z(true, getOnDispose(), null, M2, 6, 4);
            Boolean valueOf = Boolean.valueOf(z.isVisible());
            int i3 = i2 & 14;
            boolean y = M2.y(z) | (i3 == 4);
            Object x = M2.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new b(z, this, null);
                M2.R(x);
            }
            bap.g(valueOf, (wzs) x, M2, 0);
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle == null) {
                M2.K(2137604750);
                M2.j();
                a2 = null;
            } else {
                M2.K(-900876333);
                a2 = s4z.a(lifecycle, M2);
                M2.j();
            }
            Lifecycle.Event event = a2 != null ? (Lifecycle.Event) a2.getValue() : null;
            boolean J = M2.J(a2) | (i3 == 4);
            Object x2 = M2.x();
            if (J || x2 == c0012a) {
                x2 = new c(a2, this, null);
                M2.R(x2);
            }
            bap.g(event, (wzs) x2, M2, 0);
            boolean z2 = i3 == 4;
            Object x3 = M2.x();
            if (z2 || x3 == c0012a) {
                x3 = new rzl0(this, 24);
                M2.R(x3);
            }
            q630 q = txj0.q(kci.k(q630.a.a, (izs) x3), 0);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M2));
            sy90 D = M2.D();
            q630 c2 = qri.c(M2, q);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M2.N() == null) {
                n34.r();
                throw null;
            }
            M2.H();
            if (M2.L()) {
                M2.I(aVar2);
            } else {
                M2.f();
            }
            k9q0.w(M2, d2, cri.a.f);
            k9q0.w(M2, D, cri.a.e);
            k9q0.w(M2, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M2, cri.a.h);
            k9q0.w(M2, c2, cri.a.d);
            String title = getTitle();
            VkTooltip$MarkerStyle markerStyle = getMarkerStyle();
            VkTooltip$MarkerSize markerSize = getMarkerSize();
            VkOnboarding$TintColor markerColor = getMarkerColor();
            VkTooltip$BalloonPosition balloonPosition = getBalloonPosition();
            VkTooltip$BalloonTilt balloonTilt = getBalloonTilt();
            izs<etv0, s3q0> onTooltipAnchorClick = getOnTooltipAnchorClick();
            if (onTooltipAnchorClick == null) {
                M2.K(859511069);
                M2.j();
                gzsVar = null;
            } else {
                M2.K(859511070);
                boolean J2 = M2.J(onTooltipAnchorClick) | M2.y(z);
                Object x4 = M2.x();
                if (J2 || x4 == c0012a) {
                    x4 = new xq1(18, onTooltipAnchorClick, z);
                    M2.R(x4);
                }
                gzsVar = (gzs) x4;
                M2.j();
            }
            izs<etv0, s3q0> onTooltipBalloonClick = getOnTooltipBalloonClick();
            if (onTooltipBalloonClick == null) {
                M2.K(859645981);
                M2.j();
                gzsVar2 = null;
            } else {
                M2.K(859645982);
                boolean J3 = M2.J(onTooltipBalloonClick) | M2.y(z);
                Object x5 = M2.x();
                if (J3 || x5 == c0012a) {
                    x5 = new g8v0(0, z, onTooltipBalloonClick);
                    M2.R(x5);
                }
                M2.j();
                gzsVar2 = (gzs) x5;
            }
            izs<etv0, s3q0> onTooltipAnchorLongClick = getOnTooltipAnchorLongClick();
            if (onTooltipAnchorLongClick == null) {
                M2.K(859786845);
                M2.j();
                gzsVar3 = null;
                gzsVar4 = null;
            } else {
                M2.K(859786846);
                boolean J4 = M2.J(onTooltipAnchorLongClick) | M2.y(z);
                gzsVar3 = null;
                Object x6 = M2.x();
                if (J4 || x6 == c0012a) {
                    x6 = new yq1(24, onTooltipAnchorLongClick, z);
                    M2.R(x6);
                }
                M2.j();
                gzsVar4 = (gzs) x6;
            }
            izs<etv0, s3q0> onTooltipBalloonLongClick = getOnTooltipBalloonLongClick();
            if (onTooltipBalloonLongClick == null) {
                M2.K(859929693);
                M2.j();
                vkTooltip$MarkerStyle = markerStyle;
                gzsVar5 = gzsVar3;
            } else {
                M2.K(859929694);
                boolean J5 = M2.J(onTooltipBalloonLongClick) | M2.y(z);
                vkTooltip$MarkerStyle = markerStyle;
                Object x7 = M2.x();
                if (J5 || x7 == c0012a) {
                    x7 = new ss3(25, onTooltipBalloonLongClick, z);
                    M2.R(x7);
                }
                gzsVar5 = (gzs) x7;
                M2.j();
            }
            izs<etv0, s3q0> onTooltipShown = getOnTooltipShown();
            if (onTooltipShown == null) {
                M2.K(860050717);
                M2.j();
                gzsVar6 = gzsVar3;
                gzsVar7 = gzsVar;
                gzsVar8 = gzsVar5;
            } else {
                M2.K(860050718);
                boolean J6 = M2.J(onTooltipShown) | M2.y(z);
                gzs gzsVar9 = gzsVar5;
                Object x8 = M2.x();
                if (J6 || x8 == c0012a) {
                    x8 = new km1(24, onTooltipShown, z);
                    M2.R(x8);
                }
                M2.j();
                gzsVar6 = (gzs) x8;
                gzsVar7 = gzsVar;
                gzsVar8 = gzsVar9;
            }
            o9v0.a(title, z, null, vkTooltip$MarkerStyle, markerSize, markerColor, balloonPosition, balloonTilt, gzsVar7, gzsVar2, gzsVar4, gzsVar8, gzsVar6, false, getStatDelegate(), getAutoPosition(), m410getBalloonMaxWidthDpD9Ej5fM(), getPopupClippingEnabled(), getForceDarkTheme(), f9t.d, M2, 0, 805306368, 8196);
            M2 = M2;
            M2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M2.h();
        }
        androidx.compose.runtime.f s = M2.s();
        if (s != null) {
            s.d = new yg7(this, i, 16);
        }
    }

    public final void W() {
        if (this.z.invoke() == null) {
            return;
        }
        m413setMarkerPositiongyyYBs((r0.centerX() << 32) | (r0.centerY() & 4294967295L));
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets g = bqx0.b.g();
        return g == null ? windowInsets : g;
    }

    @Override // xsna.td, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this.I);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onDetachedFromWindow();
        ViewTreeObserver viewTreeObserver2 = getViewTreeObserver();
        if (viewTreeObserver2 != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.I);
        }
        View view = this.K.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this.L);
    }
}
