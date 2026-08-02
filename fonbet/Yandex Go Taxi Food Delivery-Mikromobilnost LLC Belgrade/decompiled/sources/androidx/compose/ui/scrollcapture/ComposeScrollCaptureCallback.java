package androidx.compose.ui.scrollcapture;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.Surface;
import android.view.View;
import defpackage.bvf0;
import defpackage.f6w;
import defpackage.fia1;
import defpackage.ie60;
import defpackage.jl40;
import defpackage.knj;
import defpackage.ldc;
import defpackage.m810;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.pzt0;
import defpackage.rt7;
import defpackage.rzo;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.x4c;
import defpackage.xgd;
import defpackage.y6i0;
import defpackage.ygd;
import defpackage.zy11;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.random.Random;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J%\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J5\u0010\u0011\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u0011\u0010#J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Landroidx/compose/ui/scrollcapture/ComposeScrollCaptureCallback;", "Landroid/view/ScrollCaptureCallback;", "Landroidx/compose/ui/semantics/c;", "node", "Lf6w;", "viewportBoundsInWindow", "Ltse;", "coroutineScope", "Lxgd;", "listener", "Landroid/view/View;", "composeView", "<init>", "(Landroidx/compose/ui/semantics/c;Lf6w;Ltse;Lxgd;Landroid/view/View;)V", "Landroid/view/ScrollCaptureSession;", "session", "captureArea", "onScrollCaptureImageRequest", "(Landroid/view/ScrollCaptureSession;Lf6w;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/graphics/Canvas;", "Lzy11;", "drawDebugBackground", "(Landroid/graphics/Canvas;)V", "drawDebugOverlay", "Landroid/os/CancellationSignal;", "signal", "Ljava/util/function/Consumer;", "Landroid/graphics/Rect;", "onReady", "onScrollCaptureSearch", "(Landroid/os/CancellationSignal;Ljava/util/function/Consumer;)V", "Ljava/lang/Runnable;", "onScrollCaptureStart", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Ljava/lang/Runnable;)V", "onComplete", "(Landroid/view/ScrollCaptureSession;Landroid/os/CancellationSignal;Landroid/graphics/Rect;Ljava/util/function/Consumer;)V", "onScrollCaptureEnd", "(Ljava/lang/Runnable;)V", "Landroidx/compose/ui/semantics/c;", "Lf6w;", "Lxgd;", "Landroid/view/View;", "Ltse;", "Landroidx/compose/ui/scrollcapture/a;", "scrollTracker", "Landroidx/compose/ui/scrollcapture/a;", "", "requestCount", CA20Status.STATUS_USER_I, "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposeScrollCaptureCallback implements ScrollCaptureCallback {
    public static final int $stable = 8;
    private final View composeView;
    private final tse coroutineScope;
    private final xgd listener;
    private final androidx.compose.ui.semantics.c node;
    private int requestCount;
    private final a scrollTracker;
    private final f6w viewportBoundsInWindow;

    public ComposeScrollCaptureCallback(androidx.compose.ui.semantics.c cVar, f6w f6wVar, tse tseVar, xgd xgdVar, View view) {
        this.node = cVar;
        this.viewportBoundsInWindow = f6wVar;
        this.listener = xgdVar;
        this.composeView = view;
        this.coroutineScope = bvf0.M(tseVar, knj.b);
        this.scrollTracker = new a(new ComposeScrollCaptureCallback$scrollTracker$1(this, null), f6wVar.b());
    }

    private final void drawDebugBackground(Canvas canvas) {
        int i = ldc.n;
        Random.a.getClass();
        canvas.drawColor(rzo.X(x4c.n(Random.b.k() * 360.0f, 0.75f, 0.5f, 16)));
    }

    private final void drawDebugOverlay(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setTextSize(48.0f);
        canvas.drawCircle(0.0f, 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), 0.0f, 20.0f, paint);
        canvas.drawCircle(canvas.getWidth(), canvas.getHeight(), 20.0f, paint);
        canvas.drawCircle(0.0f, canvas.getHeight(), 20.0f, paint);
        canvas.drawText(String.valueOf(this.requestCount), canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f, paint);
        this.requestCount++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0093, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, f6w f6wVar, Continuation<? super f6w> continuation) {
        ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2 composeScrollCaptureCallback$onScrollCaptureImageRequest$2;
        CoroutineSingletons coroutineSingletons;
        int i;
        int i2;
        int i3;
        ScrollCaptureSession scrollCaptureSession2;
        f6w f6wVar2;
        int i4;
        int i5;
        int d;
        int d2;
        Surface surface;
        Surface surface2;
        Surface surface3;
        if (continuation instanceof ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) {
            composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = (ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2) continuation;
            int i6 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = i6 - Integer.MIN_VALUE;
                Object obj = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i2 = f6wVar.b;
                    i3 = f6wVar.d;
                    a aVar = this.scrollTracker;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = f6wVar;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = i2;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = i3;
                    composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 1;
                    int i7 = aVar.a;
                    if (i2 > i3) {
                        w511.f(oyr.h(i2, i3, "Expected min=", " ≤ max="));
                        return null;
                    }
                    int i8 = i3 - i2;
                    if (i8 > i7) {
                        w511.f(oyr.h(i8, i7, "Expected range (", ") to be ≤ viewportSize="));
                        return null;
                    }
                    float f = i2;
                    float f2 = aVar.c;
                    Object obj2 = zy11.a;
                    if (f < f2 || i3 > i7 + f2) {
                        Object a = aVar.a((((i8 / 2) + i2) - (i7 / 2)) - f2, composeScrollCaptureCallback$onScrollCaptureImageRequest$2);
                        if (a != coroutineSingletons) {
                            a = obj2;
                        }
                        if (a == coroutineSingletons) {
                            obj2 = a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i5 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
                        i4 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
                        f6wVar2 = (f6w) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
                        scrollCaptureSession2 = rt7.k(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0);
                        kotlin.b.b(obj);
                        a aVar2 = this.scrollTracker;
                        d = y6i0.d(i4 - m810.b(aVar2.c), 0, aVar2.a);
                        a aVar3 = this.scrollTracker;
                        d2 = y6i0.d(i5 - m810.b(aVar3.c), 0, aVar3.a);
                        int i9 = f6wVar2.a;
                        int i10 = f6wVar2.c;
                        if (d != d2) {
                            return f6w.e;
                        }
                        surface = scrollCaptureSession2.getSurface();
                        Canvas lockHardwareCanvas = surface.lockHardwareCanvas();
                        try {
                            lockHardwareCanvas.save();
                            lockHardwareCanvas.translate(-i9, -d);
                            f6w f6wVar3 = this.viewportBoundsInWindow;
                            lockHardwareCanvas.translate(-f6wVar3.a, -f6wVar3.b);
                            this.composeView.getRootView().draw(lockHardwareCanvas);
                            surface3 = scrollCaptureSession2.getSurface();
                            surface3.unlockCanvasAndPost(lockHardwareCanvas);
                            int b = m810.b(this.scrollTracker.c);
                            return new f6w(i9, d + b, i10, d2 + b);
                        } catch (Throwable th) {
                            surface2 = scrollCaptureSession2.getSurface();
                            surface2.unlockCanvasAndPost(lockHardwareCanvas);
                            throw th;
                        }
                    }
                    int i11 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1;
                    int i12 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0;
                    f6w f6wVar4 = (f6w) composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1;
                    ScrollCaptureSession k = rt7.k(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0);
                    kotlin.b.b(obj);
                    i2 = i12;
                    f6wVar = f6wVar4;
                    i3 = i11;
                    scrollCaptureSession = k;
                }
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = f6wVar;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = i2;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = i3;
                composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
                if (jl40.z(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.get_context()).v(ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3.w, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutineSingletons) {
                    scrollCaptureSession2 = scrollCaptureSession;
                    f6wVar2 = f6wVar;
                    i4 = i2;
                    i5 = i3;
                    a aVar22 = this.scrollTracker;
                    d = y6i0.d(i4 - m810.b(aVar22.c), 0, aVar22.a);
                    a aVar32 = this.scrollTracker;
                    d2 = y6i0.d(i5 - m810.b(aVar32.c), 0, aVar32.a);
                    int i92 = f6wVar2.a;
                    int i102 = f6wVar2.c;
                    if (d != d2) {
                    }
                }
                return coroutineSingletons;
            }
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2 = new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$2(this, continuation);
        Object obj3 = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label;
        if (i != 0) {
        }
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$0 = scrollCaptureSession;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.L$1 = f6wVar;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$0 = i2;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.I$1 = i3;
        composeScrollCaptureCallback$onScrollCaptureImageRequest$2.label = 2;
        if (jl40.z(composeScrollCaptureCallback$onScrollCaptureImageRequest$2.get_context()).v(ComposeScrollCaptureCallback$onScrollCaptureImageRequest$3.w, composeScrollCaptureCallback$onScrollCaptureImageRequest$2) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public void onScrollCaptureEnd(Runnable onReady) {
        tje.N(this.coroutineScope, ie60.a, null, new ComposeScrollCaptureCallback$onScrollCaptureEnd$1(this, onReady, null), 2);
    }

    public void onScrollCaptureSearch(CancellationSignal signal, Consumer<Rect> onReady) {
        onReady.accept(fia1.d(this.viewportBoundsInWindow));
    }

    public void onScrollCaptureStart(ScrollCaptureSession session, CancellationSignal signal, Runnable onReady) {
        this.scrollTracker.c = 0.0f;
        this.requestCount = 0;
        ((b) this.listener).a.setValue(Boolean.TRUE);
        onReady.run();
    }

    public void onScrollCaptureImageRequest(ScrollCaptureSession session, final CancellationSignal signal, Rect captureArea, Consumer<Rect> onComplete) {
        pzt0 N = tje.N(this.coroutineScope, null, null, new ComposeScrollCaptureCallback$onScrollCaptureImageRequest$1(this, session, captureArea, onComplete, null), 3);
        N.w(new tls() { // from class: androidx.compose.ui.scrollcapture.ComposeScrollCaptureCallback_androidKt$launchWithCancellationSignal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                if (((Throwable) obj) != null) {
                    signal.cancel();
                }
                return zy11.a;
            }
        });
        signal.setOnCancelListener(new ygd(0, N));
    }
}
