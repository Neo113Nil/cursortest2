package xsna;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import com.unity3d.services.UnityAdsConstants;
import java.util.function.Consumer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ComposeScrollCaptureCallback.android.kt */
/* loaded from: classes11.dex */
public final class kqi implements ScrollCaptureCallback {
    public final igi0 a;
    public final l9x b;
    public final a c;
    public final p52 d;
    public final hpj e;
    public final dtf0 f;

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    public interface a {
        void a();

        void b();
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @b6l(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureEnd$1", f = "ComposeScrollCaptureCallback.android.kt", l = {188}, m = "invokeSuspend", v = 1)
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Runnable $onReady;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Runnable runnable, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$onReady = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return kqi.this.new b(this.$onReady, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                dtf0 dtf0Var = kqi.this.f;
                this.label = 1;
                Object a = dtf0Var.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - dtf0Var.c, this);
                if (a != coroutineSingletons) {
                    a = s3q0.a;
                }
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            kqi.this.c.a();
            this.$onReady.run();
            return s3q0.a;
        }
    }

    /* compiled from: ComposeScrollCaptureCallback.android.kt */
    @b6l(c = "androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1", f = "ComposeScrollCaptureCallback.android.kt", l = {120}, m = "invokeSuspend", v = 1)
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Rect $captureArea;
        final /* synthetic */ Consumer<Rect> $onComplete;
        final /* synthetic */ ScrollCaptureSession $session;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer<Rect> consumer, spj<? super c> spjVar) {
            super(2, spjVar);
            this.$session = scrollCaptureSession;
            this.$captureArea = rect;
            this.$onComplete = consumer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return kqi.this.new c(this.$session, this.$captureArea, this.$onComplete, spjVar);
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
                kqi kqiVar = kqi.this;
                ScrollCaptureSession scrollCaptureSession = this.$session;
                Rect rect = this.$captureArea;
                l9x l9xVar = new l9x(rect.left, rect.top, rect.right, rect.bottom);
                this.label = 1;
                obj = kqi.a(kqiVar, scrollCaptureSession, l9xVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            this.$onComplete.accept(zjq.m((l9x) obj));
            return s3q0.a;
        }
    }

    public kqi(igi0 igi0Var, l9x l9xVar, hpj hpjVar, a aVar, p52 p52Var) {
        this.a = igi0Var;
        this.b = l9xVar;
        this.c = aVar;
        this.d = p52Var;
        this.e = zvj.g(hpjVar, zzm.b);
        this.f = new dtf0(l9xVar.b(), new nqi(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
    
        if (r3 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(kqi kqiVar, ScrollCaptureSession scrollCaptureSession, l9x l9xVar, ContinuationImpl continuationImpl) {
        lqi lqiVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        int i3;
        Object a2;
        mqi mqiVar;
        ScrollCaptureSession scrollCaptureSession2;
        l9x l9xVar2;
        int i4;
        int i5;
        int g;
        int g2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        kqiVar.getClass();
        if (continuationImpl instanceof lqi) {
            lqiVar = (lqi) continuationImpl;
            int i6 = lqiVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lqiVar.label = i6 - Integer.MIN_VALUE;
                Object obj = lqiVar.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = lqiVar.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    i2 = l9xVar.b;
                    i3 = l9xVar.d;
                    dtf0 dtf0Var = kqiVar.f;
                    lqiVar.L$0 = scrollCaptureSession;
                    lqiVar.L$1 = l9xVar;
                    lqiVar.I$0 = i2;
                    lqiVar.I$1 = i3;
                    lqiVar.label = 1;
                    int i7 = dtf0Var.a;
                    if (i2 > i3) {
                        throw new IllegalArgumentException(efz.a(i2, i3, "Expected min=", " ≤ max=").toString());
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        throw new IllegalArgumentException(efz.a(i8, i7, "Expected range (", ") to be ≤ viewportSize=").toString());
                    }
                    float f = i2;
                    float f2 = dtf0Var.c;
                    if (f < f2 || i3 > i7 + f2) {
                        a2 = dtf0Var.a((((i8 / 2) + i2) - (i7 / 2)) - f2, lqiVar);
                        if (a2 != coroutineSingletons) {
                            a2 = s3q0.a;
                        }
                        if (a2 != coroutineSingletons) {
                            a2 = s3q0.a;
                        }
                    } else {
                        a2 = s3q0.a;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i5 = lqiVar.I$1;
                        i4 = lqiVar.I$0;
                        l9xVar2 = (l9x) lqiVar.L$1;
                        scrollCaptureSession2 = i72.b(lqiVar.L$0);
                        kotlin.a.a(obj);
                        dtf0 dtf0Var2 = kqiVar.f;
                        g = swe0.g(i4 - an10.b(dtf0Var2.c), 0, dtf0Var2.a);
                        dtf0 dtf0Var3 = kqiVar.f;
                        g2 = swe0.g(i5 - an10.b(dtf0Var3.c), 0, dtf0Var3.a);
                        int i9 = l9xVar2.a;
                        int i10 = l9xVar2.c;
                        if (g != g2) {
                            return l9x.e;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -g);
                            l9x l9xVar3 = kqiVar.b;
                            lockHardwareCanvas.translate(-l9xVar3.a, -l9xVar3.b);
                            kqiVar.d.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int b2 = an10.b(kqiVar.f.c);
                            return new l9x(i9, g + b2, i10, g2 + b2);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = lqiVar.I$1;
                    int i12 = lqiVar.I$0;
                    l9x l9xVar4 = (l9x) lqiVar.L$1;
                    ScrollCaptureSession b3 = i72.b(lqiVar.L$0);
                    kotlin.a.a(obj);
                    i2 = i12;
                    l9xVar = l9xVar4;
                    i3 = i11;
                    scrollCaptureSession = b3;
                }
                mqiVar = mqi.j;
                lqiVar.L$0 = scrollCaptureSession;
                lqiVar.L$1 = l9xVar;
                lqiVar.I$0 = i2;
                lqiVar.I$1 = i3;
                lqiVar.label = 2;
                if (i830.a(lqiVar.getContext()).k(mqiVar, lqiVar) != coroutineSingletons) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    l9xVar2 = l9xVar;
                    i4 = i2;
                    i5 = i3;
                    dtf0 dtf0Var22 = kqiVar.f;
                    g = swe0.g(i4 - an10.b(dtf0Var22.c), 0, dtf0Var22.a);
                    dtf0 dtf0Var32 = kqiVar.f;
                    g2 = swe0.g(i5 - an10.b(dtf0Var32.c), 0, dtf0Var32.a);
                    int i92 = l9xVar2.a;
                    int i102 = l9xVar2.c;
                    if (g != g2) {
                    }
                }
                return coroutineSingletons;
            }
        }
        lqiVar = new lqi(kqiVar, continuationImpl);
        Object obj2 = lqiVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = lqiVar.label;
        if (i != 0) {
        }
        mqiVar = mqi.j;
        lqiVar.L$0 = scrollCaptureSession;
        lqiVar.L$1 = l9xVar;
        lqiVar.I$0 = i2;
        lqiVar.I$1 = i3;
        lqiVar.label = 2;
        if (i830.a(lqiVar.getContext()).k(mqiVar, lqiVar) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        myc0.h(this.e, r570.b, null, new b(runnable, null), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer<Rect> consumer) {
        final yok0 h = myc0.h(this.e, null, null, new c(scrollCaptureSession, rect, consumer, null), 3);
        h.E(new pqi(cancellationSignal));
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: xsna.oqi
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                yok0.this.b(null);
            }
        });
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer<Rect> consumer) {
        consumer.accept(zjq.m(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.c.b();
        runnable.run();
    }
}
