package xsna;

import android.content.Context;
import android.util.Pair;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.source.i;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.impl.C4716b0;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mxz implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mxz(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        vm5 e;
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                x5 x5Var = (x5) this.d;
                CountDownLatch countDownLatch = (CountDownLatch) this.e;
                ref$ObjectRef.element = x5Var.invoke();
                countDownLatch.countDown();
                return;
            case 1:
                h.a aVar = (h.a) this.c;
                Pair pair = (Pair) this.d;
                androidx.media3.exoplayer.h.this.h.x(((Integer) pair.first).intValue(), (i.b) pair.second, (pr10) this.e);
                return;
            case 2:
                p6y0 p6y0Var = (p6y0) this.c;
                ub9.a<Void> aVar2 = (ub9.a) this.d;
                vm5 vm5Var = (vm5) this.e;
                if (p6y0Var.f) {
                    p6y0Var.a(vm5Var);
                    p6y0Var.e.g(vm5Var.a, aVar2);
                    p6y0Var.a.n();
                    return;
                } else {
                    synchronized (p6y0Var.c) {
                        p6y0Var.c.e(1.0f);
                        e = spw.e(p6y0Var.c);
                    }
                    p6y0Var.a(e);
                    aVar2.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    return;
                }
            default:
                C4716b0.a((C4716b0) this.c, (Context) this.d, (AppMetricaLibraryAdapterConfig) this.e);
                return;
        }
    }
}
