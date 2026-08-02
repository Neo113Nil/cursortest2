package xsna;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.oqx0;

/* compiled from: ModalBottomSheet.android.kt */
/* loaded from: classes11.dex */
public final class vw20 extends y8i {
    public gzs<s3q0> f;
    public yx20 g;
    public long h;
    public final View i;
    public final tw20 j;

    /* compiled from: ModalBottomSheet.android.kt */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    public static final class b extends m180 {
        public final yvj a;
        public final if2<Float, sq2> b;
        public final w100 c;

        /* compiled from: ModalBottomSheet.android.kt */
        @b6l(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackCancelled$1", f = "ModalBottomSheet.android.kt", l = {638}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;

            public a(spj<? super a> spjVar) {
                super(2, spjVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return b.this.new a(spjVar);
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
                    if2<Float, sq2> if2Var = b.this.b;
                    Float f = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    this.label = 1;
                    if (if2.c(if2Var, f, null, null, this, 14) == coroutineSingletons) {
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

        /* compiled from: ModalBottomSheet.android.kt */
        @b6l(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackProgressed$1", f = "ModalBottomSheet.android.kt", l = {LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED}, m = "invokeSuspend")
        /* renamed from: xsna.vw20$b$b, reason: collision with other inner class name */
        public static final class C3905b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ wu5 $backEvent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3905b(wu5 wu5Var, spj<? super C3905b> spjVar) {
                super(2, spjVar);
                this.$backEvent = wu5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return b.this.new C3905b(this.$backEvent, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3905b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    if2<Float, sq2> if2Var = b.this.b;
                    Float f = new Float(fv5.a.a(this.$backEvent.c));
                    this.label = 1;
                    if (if2Var.e(f, this) == coroutineSingletons) {
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

        /* compiled from: ModalBottomSheet.android.kt */
        @b6l(c = "androidx.compose.material3.ModalBottomSheetDialogWrapper$PredictiveBackOnBackPressedCallback$handleOnBackStarted$1", f = "ModalBottomSheet.android.kt", l = {IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW}, m = "invokeSuspend")
        public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ wu5 $backEvent;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(wu5 wu5Var, spj<? super c> spjVar) {
                super(2, spjVar);
                this.$backEvent = wu5Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return b.this.new c(this.$backEvent, spjVar);
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
                    if2<Float, sq2> if2Var = b.this.b;
                    Float f = new Float(fv5.a.a(this.$backEvent.c));
                    this.label = 1;
                    if (if2Var.e(f, this) == coroutineSingletons) {
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

        public b(boolean z, yvj yvjVar, if2 if2Var, w100 w100Var) {
            super(z);
            this.a = yvjVar;
            this.b = if2Var;
            this.c = w100Var;
        }

        @Override // xsna.m180
        public final void handleOnBackCancelled() {
            myc0.h(this.a, null, null, new a(null), 3);
        }

        @Override // xsna.m180
        public final void handleOnBackPressed() {
            this.c.invoke();
        }

        @Override // xsna.m180
        public final void handleOnBackProgressed(wu5 wu5Var) {
            myc0.h(this.a, null, null, new C3905b(wu5Var, null), 3);
        }

        @Override // xsna.m180
        public final void handleOnBackStarted(wu5 wu5Var) {
            myc0.h(this.a, null, null, new c(wu5Var, null), 3);
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    public /* synthetic */ class c {
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

    public vw20() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw20(gzs gzsVar, yx20 yx20Var, long j, View view, LayoutDirection layoutDirection, azl azlVar, UUID uuid, if2 if2Var, yvj yvjVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        boolean z = false;
        this.f = gzsVar;
        this.g = yx20Var;
        this.h = j;
        this.i = view;
        float f = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        ppx0.b(window, false);
        tw20 tw20Var = new tw20(getContext(), window);
        tw20Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        tw20Var.setClipChildren(false);
        tw20Var.setElevation(azlVar.I0(f));
        tw20Var.setOutlineProvider(new a());
        this.j = tw20Var;
        setContentView(tw20Var);
        gqo.f(tw20Var, gqo.e(view));
        ro.o(tw20Var, ro.h(view));
        lyd.h(tw20Var, lyd.f(view));
        h(this.f, this.g, this.h, layoutDirection);
        oek0 oek0Var = new oek0(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        oqx0.g fVar = i >= 35 ? new oqx0.f(window, oek0Var) : i >= 30 ? new oqx0.d(window, oek0Var) : new oqx0.c(window, oek0Var);
        this.g.getClass();
        long j2 = this.h;
        long j3 = l5g.j;
        fVar.f(!l5g.d(j2, j3) && ((double) f870.E(j2)) <= 0.5d);
        this.g.getClass();
        if (!l5g.d(this.h, j3) && f870.E(r10) <= 0.5d) {
            z = true;
        }
        fVar.e(z);
        getOnBackPressedDispatcher().a(this, new b(this.g.b, yvjVar, if2Var, new w100(this, 2)));
    }

    public final void h(gzs<s3q0> gzsVar, yx20 yx20Var, long j, LayoutDirection layoutDirection) {
        this.f = gzsVar;
        this.g = yx20Var;
        this.h = j;
        SecureFlagPolicy secureFlagPolicy = yx20Var.a;
        ViewGroup.LayoutParams layoutParams = this.i.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i = 1;
        boolean z = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int i2 = jt6.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i2 == 1) {
            z = false;
        } else if (i2 == 2) {
            z = true;
        } else if (i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        getWindow().setFlags(z ? 8192 : -8193, 8192);
        int i3 = c.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i3 == 1) {
            i = 0;
        } else if (i3 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        this.j.setLayoutDirection(i);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f.invoke();
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
