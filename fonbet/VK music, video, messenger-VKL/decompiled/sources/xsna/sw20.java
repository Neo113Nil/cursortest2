package xsna;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: InternalModalBottomSheet.kt */
/* loaded from: classes17.dex */
public final class sw20 extends td implements omm {
    public final Window l;
    public final gzs<Boolean> m;
    public final gzs<s3q0> n;
    public final if2<Float, sq2> o;
    public final yvj p;
    public final wh50 q;
    public Object r;
    public boolean s;

    /* compiled from: InternalModalBottomSheet.kt */
    public static final class a {

        /* compiled from: InternalModalBottomSheet.kt */
        /* renamed from: xsna.sw20$a$a, reason: collision with other inner class name */
        public static final class C3693a implements OnBackAnimationCallback {
            public final /* synthetic */ yvj a;
            public final /* synthetic */ if2<Float, sq2> b;
            public final /* synthetic */ gzs<s3q0> c;

            /* compiled from: InternalModalBottomSheet.kt */
            @b6l(c = "com.vk.core.compose.component.internal.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1", f = "InternalModalBottomSheet.kt", l = {738}, m = "invokeSuspend")
            /* renamed from: xsna.sw20$a$a$a, reason: collision with other inner class name */
            public static final class C3694a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ if2<Float, sq2> $predictiveBackProgress;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3694a(if2<Float, sq2> if2Var, spj<? super C3694a> spjVar) {
                    super(2, spjVar);
                    this.$predictiveBackProgress = if2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new C3694a(this.$predictiveBackProgress, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((C3694a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        if2<Float, sq2> if2Var = this.$predictiveBackProgress;
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

            /* compiled from: InternalModalBottomSheet.kt */
            @b6l(c = "com.vk.core.compose.component.internal.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1", f = "InternalModalBottomSheet.kt", l = {729}, m = "invokeSuspend")
            /* renamed from: xsna.sw20$a$a$b */
            public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ BackEvent $backEvent;
                final /* synthetic */ if2<Float, sq2> $predictiveBackProgress;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(if2<Float, sq2> if2Var, BackEvent backEvent, spj<? super b> spjVar) {
                    super(2, spjVar);
                    this.$predictiveBackProgress = if2Var;
                    this.$backEvent = backEvent;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new b(this.$predictiveBackProgress, this.$backEvent, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    float progress;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        if2<Float, sq2> if2Var = this.$predictiveBackProgress;
                        progress = this.$backEvent.getProgress();
                        Float f = new Float(nix.d.a(progress));
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

            /* compiled from: InternalModalBottomSheet.kt */
            @b6l(c = "com.vk.core.compose.component.internal.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1", f = "InternalModalBottomSheet.kt", l = {723}, m = "invokeSuspend")
            /* renamed from: xsna.sw20$a$a$c */
            public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ BackEvent $backEvent;
                final /* synthetic */ if2<Float, sq2> $predictiveBackProgress;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(if2<Float, sq2> if2Var, BackEvent backEvent, spj<? super c> spjVar) {
                    super(2, spjVar);
                    this.$predictiveBackProgress = if2Var;
                    this.$backEvent = backEvent;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new c(this.$predictiveBackProgress, this.$backEvent, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    float progress;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        if2<Float, sq2> if2Var = this.$predictiveBackProgress;
                        progress = this.$backEvent.getProgress();
                        Float f = new Float(nix.d.a(progress));
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

            public C3693a(gzs gzsVar, if2 if2Var, yvj yvjVar) {
                this.a = yvjVar;
                this.b = if2Var;
                this.c = gzsVar;
            }

            public final void onBackCancelled() {
                myc0.h(this.a, null, null, new C3694a(this.b, null), 3);
            }

            public final void onBackInvoked() {
                this.c.invoke();
            }

            public final void onBackProgressed(BackEvent backEvent) {
                myc0.h(this.a, null, null, new b(this.b, backEvent, null), 3);
            }

            public final void onBackStarted(BackEvent backEvent) {
                myc0.h(this.a, null, null, new c(this.b, backEvent, null), 3);
            }
        }

        public static final OnBackAnimationCallback a(gzs<s3q0> gzsVar, if2<Float, sq2> if2Var, yvj yvjVar) {
            return new C3693a(gzsVar, if2Var, yvjVar);
        }
    }

    /* compiled from: InternalModalBottomSheet.kt */
    public static final class b {
        public static final OnBackInvokedCallback a(final gzs<s3q0> gzsVar) {
            return new OnBackInvokedCallback() { // from class: xsna.rw20
                public final void onBackInvoked() {
                    gzs.this.invoke();
                }
            };
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
        
            r1 = r1.findOnBackInvokedDispatcher();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void b(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!sw5.f(obj) || findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, t23.a(obj));
        }

        /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
        
            r1 = r1.findOnBackInvokedDispatcher();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final void c(View view, Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!sw5.f(obj) || findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(t23.a(obj));
        }
    }

    public sw20(Context context, Window window, gzs<Boolean> gzsVar, gzs<s3q0> gzsVar2, if2<Float, sq2> if2Var, yvj yvjVar) {
        super(context, null, 6, 0);
        this.l = window;
        this.m = gzsVar;
        this.n = gzsVar2;
        this.o = if2Var;
        this.p = yvjVar;
        this.q = androidx.compose.runtime.k.b(sp.e);
    }

    @Override // xsna.td
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.s;
    }

    @Override // xsna.omm
    public final Window getWindow() {
        return this.l;
    }

    @Override // xsna.td
    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1384301023);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1384301023, i2, -1, "com.vk.core.compose.component.internal.ModalBottomSheetDialogLayout.Content (InternalModalBottomSheet.kt:672)");
            }
            ((wzs) ((zak0) this.q).getValue()).invoke(M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new x76(this, i, 8);
        }
    }

    @Override // xsna.td, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (!this.m.invoke().booleanValue() || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.r == null) {
            gzs<s3q0> gzsVar = this.n;
            this.r = i >= 34 ? a.a(gzsVar, this.o, this.p) : b.a(gzsVar);
        }
        b.b(this, this.r);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            b.c(this, this.r);
        }
        this.r = null;
    }
}
