package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import defpackage.a2d;
import defpackage.dvw;
import defpackage.fse;
import defpackage.fwi;
import defpackage.gn50;
import defpackage.i18;
import defpackage.j18;
import defpackage.jl40;
import defpackage.k631;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.oas0;
import defpackage.s751;
import defpackage.sd2;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010 \u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010\u000fJ\u001f\u0010)\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010-\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010,J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b.\u0010/J \u00103\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b1\u00102J\u001f\u00107\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020\r¢\u0006\u0004\b9\u0010\u000fJ\u0017\u0010:\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b<\u0010;R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010I\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR \u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006X"}, d2 = {"Landroidx/compose/foundation/layout/WindowInsetsNestedScrollConnection;", "Lgn50;", "Landroid/view/WindowInsetsAnimationControlListener;", "Lsd2;", "windowInsets", "Landroid/view/View;", "view", "Loas0;", "sideCalculator", "Lfwi;", "density", "<init>", "(Lsd2;Landroid/view/View;Loas0;Lfwi;)V", "Lzy11;", "requestAnimationController", "()V", "Landroid/view/WindowInsetsAnimationController;", "getAnimationController", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lwu60;", "available", "", "scrollAmount", "scroll-8S9VItk", "(JF)J", "scroll", "Lk631;", "flingAmount", "", "towardShown", "fling-huYlsQE", "(JFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fling", "inset", "adjustInsets", "(F)V", "animationEnded", "", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "controller", "", "types", "onReady", "(Landroid/view/WindowInsetsAnimationController;I)V", "dispose", "onFinished", "(Landroid/view/WindowInsetsAnimationController;)V", "onCancelled", "Lsd2;", "getWindowInsets", "()Lsd2;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Loas0;", "getSideCalculator", "()Loas0;", "Lfwi;", "getDensity", "()Lfwi;", "animationController", "Landroid/view/WindowInsetsAnimationController;", "isControllerRequested", "Z", "Landroid/os/CancellationSignal;", "cancellationSignal", "Landroid/os/CancellationSignal;", "partialConsumption", "F", "Ll8x;", "animationJob", "Ll8x;", "Li18;", "continuation", "Li18;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
final class WindowInsetsNestedScrollConnection implements gn50, WindowInsetsAnimationControlListener {
    private WindowInsetsAnimationController animationController;
    private l8x animationJob;
    private final CancellationSignal cancellationSignal = new CancellationSignal();
    private i18 continuation;
    private final fwi density;
    private boolean isControllerRequested;
    private float partialConsumption;
    private final oas0 sideCalculator;
    private final View view;
    private final sd2 windowInsets;

    public WindowInsetsNestedScrollConnection(sd2 sd2Var, View view, oas0 oas0Var, fwi fwiVar) {
        this.windowInsets = sd2Var;
        this.view = view;
        this.density = fwiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustInsets(float inset) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController == null) {
            return;
        }
        windowInsetsAnimationController.getCurrentInsets();
        throw null;
    }

    private final void animationEnded() {
        boolean isReady;
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.animationController;
        if (windowInsetsAnimationController2 != null) {
            isReady = windowInsetsAnimationController2.isReady();
            if (isReady && (windowInsetsAnimationController = this.animationController) != null) {
                windowInsetsAnimationController.finish(this.windowInsets.f());
            }
        }
        this.animationController = null;
        i18 i18Var = this.continuation;
        if (i18Var != null) {
            i18Var.q(null, a2d.C);
        }
        this.continuation = null;
        l8x l8xVar = this.animationJob;
        if (l8xVar != null) {
            l8xVar.a(new WindowInsetsAnimationCancelledException());
        }
        this.animationJob = null;
        this.partialConsumption = 0.0f;
        this.isControllerRequested = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: fling-huYlsQE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m31flinghuYlsQE(long j, float f, boolean z, Continuation<? super k631> continuation) {
        WindowInsetsNestedScrollConnection$fling$1 windowInsetsNestedScrollConnection$fling$1;
        int i;
        WindowInsetsAnimationController e;
        if (continuation instanceof WindowInsetsNestedScrollConnection$fling$1) {
            windowInsetsNestedScrollConnection$fling$1 = (WindowInsetsNestedScrollConnection$fling$1) continuation;
            int i2 = windowInsetsNestedScrollConnection$fling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                windowInsetsNestedScrollConnection$fling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = windowInsetsNestedScrollConnection$fling$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = windowInsetsNestedScrollConnection$fling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    l8x l8xVar = this.animationJob;
                    if (l8xVar != null) {
                        l8xVar.a(new WindowInsetsAnimationCancelledException());
                    }
                    this.animationJob = null;
                    this.partialConsumption = 0.0f;
                    if ((f == 0.0f && !z) || (this.animationController == null && this.windowInsets.f() == z)) {
                        return new k631(0L);
                    }
                    windowInsetsNestedScrollConnection$fling$1.J$0 = j;
                    windowInsetsNestedScrollConnection$fling$1.F$0 = f;
                    windowInsetsNestedScrollConnection$fling$1.label = 1;
                    obj = getAnimationController(windowInsetsNestedScrollConnection$fling$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            Ref$FloatRef ref$FloatRef = (Ref$FloatRef) windowInsetsNestedScrollConnection$fling$1.L$0;
                            kotlin.b.b(obj);
                            float f2 = ref$FloatRef.element;
                            throw null;
                        }
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        throw null;
                    }
                    kotlin.b.b(obj);
                }
                e = s751.e(obj);
                if (e != null) {
                    return new k631(0L);
                }
                e.getHiddenStateInsets();
                throw null;
            }
        }
        windowInsetsNestedScrollConnection$fling$1 = new WindowInsetsNestedScrollConnection$fling$1(this, continuation);
        Object obj3 = windowInsetsNestedScrollConnection$fling$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = windowInsetsNestedScrollConnection$fling$1.label;
        if (i != 0) {
        }
        e = s751.e(obj3);
        if (e != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getAnimationController(Continuation<? super WindowInsetsAnimationController> continuation) {
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            return windowInsetsAnimationController;
        }
        j18 j18Var = new j18(1, dvw.b(continuation));
        j18Var.u();
        this.continuation = j18Var;
        requestAnimationController();
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onReady$lambda$0(Throwable th, WindowInsetsAnimationController windowInsetsAnimationController, fse fseVar) {
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestAnimationController() {
        WindowInsetsController windowInsetsController;
        if (this.isControllerRequested) {
            return;
        }
        this.isControllerRequested = true;
        windowInsetsController = this.view.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.windowInsets.a, -1L, null, this.cancellationSignal, s751.d(this));
        }
    }

    /* renamed from: scroll-8S9VItk, reason: not valid java name */
    private final long m32scroll8S9VItk(long available, float scrollAmount) {
        l8x l8xVar = this.animationJob;
        if (l8xVar != null) {
            l8xVar.a(new WindowInsetsAnimationCancelledException());
            this.animationJob = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (scrollAmount == 0.0f) {
            return 0L;
        }
        if (this.windowInsets.f() == (scrollAmount > 0.0f) && windowInsetsAnimationController == null) {
            return 0L;
        }
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.getHiddenStateInsets();
            throw null;
        }
        this.partialConsumption = 0.0f;
        requestAnimationController();
        throw null;
    }

    public final void dispose() {
        Insets currentInsets;
        Insets hiddenStateInsets;
        i18 i18Var = this.continuation;
        if (i18Var != null) {
            i18Var.q(null, a2d.D);
        }
        l8x l8xVar = this.animationJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.animationController;
        if (windowInsetsAnimationController != null) {
            currentInsets = windowInsetsAnimationController.getCurrentInsets();
            hiddenStateInsets = windowInsetsAnimationController.getHiddenStateInsets();
            windowInsetsAnimationController.finish(!jl40.l(currentInsets, hiddenStateInsets));
        }
    }

    public final fwi getDensity() {
        return this.density;
    }

    public final oas0 getSideCalculator() {
        return null;
    }

    public final View getView() {
        return this.view;
    }

    public final sd2 getWindowInsets() {
        return this.windowInsets;
    }

    public void onCancelled(WindowInsetsAnimationController controller) {
        animationEnded();
    }

    public void onFinished(WindowInsetsAnimationController controller) {
        animationEnded();
    }

    @Override // defpackage.gn50
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo28onPostFlingRZ2iAVY(long j, long j2, Continuation<? super k631> continuation) {
        k631.c(j2);
        k631.d(j2);
        throw null;
    }

    @Override // defpackage.gn50
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo29onPostScrollDzOQY0M(long consumed, long available, int source) {
        Float.intBitsToFloat((int) (available >> 32));
        Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & available));
        throw null;
    }

    @Override // defpackage.gn50
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo33onPreFlingQWom1Mo(long j, Continuation<? super k631> continuation) {
        k631.c(j);
        k631.d(j);
        throw null;
    }

    @Override // defpackage.gn50
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo34onPreScrollOzD1aCk(long available, int source) {
        Float.intBitsToFloat((int) (available >> 32));
        Float.intBitsToFloat((int) (available & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        throw null;
    }

    public void onReady(WindowInsetsAnimationController controller, int types) {
        this.animationController = controller;
        this.isControllerRequested = false;
        i18 i18Var = this.continuation;
        if (i18Var != null) {
            i18Var.q(controller, new b());
        }
        this.continuation = null;
    }
}
