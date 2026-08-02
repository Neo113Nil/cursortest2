package com.yandex.go.pickup_from_photo.presentation;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.view.OrientationEventListener;
import androidx.camera.core.g;
import androidx.camera.core.j;
import defpackage.er7;
import defpackage.fq7;
import defpackage.i5f0;
import defpackage.jst;
import defpackage.noh;
import defpackage.ny61;
import defpackage.pxe0;
import defpackage.pzt0;
import defpackage.scc;
import defpackage.tls;
import defpackage.tse;
import defpackage.tuz;
import defpackage.uuz;
import defpackage.w8v;
import defpackage.wn7;
import defpackage.xs7;
import defpackage.zy11;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import ru.yandex.taxi.camera.CameraPreview;

/* loaded from: classes13.dex */
public final class b {
    public final Context a;
    public final tse b;
    public final CameraPreview c;
    public final w8v d;
    public final tuz e;
    public final tls f;
    public final AtomicReference g = new AtomicReference(new fq7(0));
    public final xs7 h = xs7.c;
    public final er7 i = new er7();
    public final noh j;
    public pzt0 k;
    public final CameraController$orientationListener$1 l;

    /* JADX WARN: Type inference failed for: r2v5, types: [com.yandex.go.pickup_from_photo.presentation.CameraController$orientationListener$1] */
    public b(Context context, tse tseVar, CameraPreview cameraPreview, w8v w8vVar, tuz tuzVar, tls tlsVar) {
        this.a = context;
        this.b = tseVar;
        this.c = cameraPreview;
        this.d = w8vVar;
        this.e = tuzVar;
        this.f = tlsVar;
        this.j = ru.yandex.taxi.camera.ml.a.b(context);
        this.l = new OrientationEventListener(context) { // from class: com.yandex.go.pickup_from_photo.presentation.CameraController$orientationListener$1
            @Override // android.view.OrientationEventListener
            public void onOrientationChanged(int orientation) {
                int i = (45 > orientation || orientation >= 135) ? (135 > orientation || orientation >= 225) ? (225 > orientation || orientation >= 315) ? 0 : 1 : 2 : 3;
                if (b.this.d.n() != i) {
                    b.this.d.N(i);
                }
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(final b bVar, er7 er7Var, xs7 xs7Var, CameraPreview cameraPreview, j jVar, ContinuationImpl continuationImpl) {
        CameraController$initializeCamera$1 cameraController$initializeCamera$1;
        int i;
        final tuz tuzVar;
        bVar.getClass();
        try {
            if (continuationImpl instanceof CameraController$initializeCamera$1) {
                cameraController$initializeCamera$1 = (CameraController$initializeCamera$1) continuationImpl;
                int i2 = cameraController$initializeCamera$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cameraController$initializeCamera$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = cameraController$initializeCamera$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cameraController$initializeCamera$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        noh nohVar = bVar.j;
                        cameraController$initializeCamera$1.L$0 = er7Var;
                        cameraController$initializeCamera$1.L$1 = xs7Var;
                        cameraController$initializeCamera$1.L$2 = cameraPreview;
                        cameraController$initializeCamera$1.L$3 = jVar;
                        cameraController$initializeCamera$1.label = 1;
                        obj = nohVar.k(cameraController$initializeCamera$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jVar = (j) cameraController$initializeCamera$1.L$3;
                        cameraPreview = (CameraPreview) cameraController$initializeCamera$1.L$2;
                        xs7Var = (xs7) cameraController$initializeCamera$1.L$1;
                        er7Var = (er7) cameraController$initializeCamera$1.L$0;
                        kotlin.b.b(obj);
                    }
                    i5f0 i5f0Var = (i5f0) obj;
                    pxe0 pxe0Var = new pxe0();
                    tuzVar = bVar.e;
                    if (tuzVar != null) {
                        final tls tlsVar = new tls() { // from class: com.yandex.go.pickup_from_photo.presentation.a
                            @Override // defpackage.tls
                            public final Object invoke(Object obj2) {
                                Boolean bool = (Boolean) obj2;
                                bool.getClass();
                                b bVar2 = b.this;
                                if (((fq7) bVar2.g.get()).a) {
                                    ((PickupFromPhotoModalView$cameraController$2$1) bVar2.f).invoke(bool);
                                }
                                return zy11.a;
                            }
                        };
                        pxe0Var.a.w(wn7.y, new CameraCaptureSession.CaptureCallback() { // from class: com.yandex.go.pickup_from_photo.presentation.LowLightDetector$attachTo$1
                            @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                            public void onCaptureCompleted(CameraCaptureSession session, CaptureRequest request, TotalCaptureResult result) {
                                Integer num;
                                Integer num2 = (Integer) result.get(CaptureResult.CONTROL_AE_STATE);
                                if (num2 == null || num2.intValue() != 2 || (num = (Integer) result.get(CaptureResult.SENSOR_SENSITIVITY)) == null) {
                                    return;
                                }
                                int intValue = num.intValue();
                                if (((Long) result.get(CaptureResult.SENSOR_EXPOSURE_TIME)) != null) {
                                    tuz.this.b.addLast(Double.valueOf((intValue / 100.0d) * (r10.longValue() / 1000000)));
                                    int size = tuz.this.b.size();
                                    tuz tuzVar2 = tuz.this;
                                    uuz uuzVar = tuzVar2.a;
                                    if (size > 15) {
                                        tuzVar2.b.removeFirst();
                                    }
                                    int size2 = tuz.this.b.size();
                                    tuz tuzVar3 = tuz.this;
                                    uuz uuzVar2 = tuzVar3.a;
                                    if (size2 < 7) {
                                        return;
                                    }
                                    ArrayDeque arrayDeque = tuzVar3.b;
                                    int size3 = arrayDeque.size();
                                    double[] dArr = tuzVar3.c;
                                    if (dArr == null || dArr.length != size3) {
                                        tuzVar3.c = new double[size3];
                                    }
                                    double[] dArr2 = tuzVar3.c;
                                    Iterator it = arrayDeque.iterator();
                                    boolean z = false;
                                    int i3 = 0;
                                    while (it.hasNext()) {
                                        Object next = it.next();
                                        int i4 = i3 + 1;
                                        if (i3 < 0) {
                                            scc.m();
                                            throw null;
                                        }
                                        dArr2[i3] = ((Double) next).doubleValue();
                                        i3 = i4;
                                    }
                                    if (dArr2.length > 1) {
                                        Arrays.sort(dArr2);
                                    }
                                    int i5 = size3 / 2;
                                    double d = size3 % 2 == 1 ? dArr2[i5] : (dArr2[i5 - 1] + dArr2[i5]) / 2.0d;
                                    tuz tuzVar4 = tuz.this;
                                    uuz uuzVar3 = tuzVar4.a;
                                    boolean z2 = d > uuzVar3.a;
                                    boolean z3 = d < uuzVar3.b;
                                    if (!tuzVar4.d && z2) {
                                        z = true;
                                    } else if (!tuz.this.d || !z3) {
                                        z = tuz.this.d;
                                    }
                                    boolean z4 = tuz.this.d;
                                    tuz.this.d = z;
                                    if (tuz.this.d != z4) {
                                        tlsVar.invoke(Boolean.valueOf(tuz.this.d));
                                    }
                                }
                            }
                        });
                    }
                    g f = pxe0Var.f();
                    cameraPreview.attachPreview(f);
                    i5f0Var.g();
                    return i5f0Var.d(er7Var, xs7Var, f, jVar);
                }
            }
            return i5f0Var.d(er7Var, xs7Var, f, jVar);
        } catch (IllegalArgumentException e) {
            jst.e.k(e, "Unable to init camera");
            return null;
        } catch (IllegalStateException e2) {
            jst.e.k(e2, "Unable to init camera");
            return null;
        }
        cameraController$initializeCamera$1 = new CameraController$initializeCamera$1(bVar, continuationImpl);
        Object obj2 = cameraController$initializeCamera$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraController$initializeCamera$1.label;
        if (i != 0) {
        }
        i5f0 i5f0Var2 = (i5f0) obj2;
        pxe0 pxe0Var2 = new pxe0();
        tuzVar = bVar.e;
        if (tuzVar != null) {
        }
        g f2 = pxe0Var2.f();
        cameraPreview.attachPreview(f2);
        i5f0Var2.g();
    }

    public final void b(final boolean z) {
        AtomicReference atomicReference = this.g;
        fq7 fq7Var = (fq7) atomicReference.get();
        if (fq7Var.a && fq7Var.e != z) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            atomicReference.updateAndGet(new UnaryOperator() { // from class: up7
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    fq7 fq7Var2 = (fq7) obj;
                    if (fq7Var2.a) {
                        boolean z2 = fq7Var2.e;
                        boolean z3 = z;
                        if (z2 != z3) {
                            if (fq7Var2.b) {
                                return fq7.a(fq7Var2, false, false, Boolean.valueOf(z3), false, 23);
                            }
                            ref$BooleanRef.element = true;
                            return fq7.a(fq7Var2, false, true, null, false, 27);
                        }
                    }
                    return fq7Var2;
                }
            });
            if (ref$BooleanRef.element) {
                pzt0 pzt0Var = this.k;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                this.k = com.yandex.go.coroutines.b.g(this.b, null, null, new CameraController$rebindForNightMode$2(this, z, null), 3);
            }
        }
    }

    public final void c() {
        this.g.set(new fq7(0));
        pzt0 pzt0Var = this.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.k = null;
        this.i.c();
        this.c.detachPreview();
        ru.yandex.taxi.camera.ml.a.f(this.j);
        disable();
    }
}
