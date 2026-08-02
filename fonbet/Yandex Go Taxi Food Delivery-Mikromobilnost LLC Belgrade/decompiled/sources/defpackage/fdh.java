package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.util.Size;
import android.view.ViewTreeObserver;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.r;
import com.yandex.go.coroutines.b;
import com.ybsdk.core.utils.sensors.RotationDetectorProvider;
import defpackage.asj0;
import defpackage.bsj0;
import defpackage.cdh;
import defpackage.dfb1;
import defpackage.er7;
import defpackage.g18;
import defpackage.gdh;
import defpackage.pdy;
import defpackage.pzt0;
import defpackage.scc;
import defpackage.tob1;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.camera.CameraPreview;

/* loaded from: classes2.dex */
public final class fdh implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fdh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(pey peyVar) {
        SensorManager sensorManager;
        Sensor sensor;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                gdh gdhVar = (gdh) obj;
                g18 g18Var = gdhVar.x;
                if (g18Var != null) {
                    gdhVar.x = null;
                    g18Var.cancel();
                }
                gdhVar.k();
                break;
            case 1:
                ((GLSurfaceView) obj).onPause();
                break;
            case 2:
                RotationDetectorProvider rotationDetectorProvider = (RotationDetectorProvider) obj;
                sensorManager = rotationDetectorProvider.sensorManager;
                sensor = rotationDetectorProvider.sensor;
                sensorManager.unregisterListener(rotationDetectorProvider, sensor);
                break;
            default:
                ((ua20) ((syq0) obj)).a.pauseSession();
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, ec3] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, dai] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(pey peyVar) {
        SensorManager sensorManager;
        Sensor sensor;
        int i = this.a;
        final boolean z = true;
        Object obj = this.b;
        switch (i) {
            case 0:
                final gdh gdhVar = (gdh) obj;
                if (gdhVar.x == null) {
                    CameraPreview j = gdhVar.j();
                    ViewTreeObserver viewTreeObserver = j.getViewTreeObserver();
                    final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    ref$ObjectRef.element = g18.u1;
                    ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.DefaultImageStreamCameraLayer$lifecycleObserver$1$onResume$$inlined$doOnPreDrawCancelable$1
                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                        public final boolean onPreDraw() {
                            gdh gdhVar2 = gdhVar;
                            long j2 = 1 + gdhVar2.w;
                            gdhVar2.w = j2;
                            boolean z2 = gdhVar2.n;
                            Context context = gdhVar2.k;
                            pdy pdyVar = new pdy(context);
                            Size size = gdhVar2.o;
                            if (size != null) {
                                asj0 asj0Var = new asj0();
                                asj0Var.c = new cdh(0, size);
                                bsj0 a = asj0Var.a();
                                tob1.b();
                                if (pdyVar.d != a) {
                                    pdyVar.d = a;
                                    pdyVar.x();
                                    pdyVar.t(null);
                                }
                            }
                            Size size2 = gdhVar2.p;
                            if (size2 != null) {
                                asj0 asj0Var2 = new asj0();
                                asj0Var2.c = new cdh(0, size2);
                                bsj0 a2 = asj0Var2.a();
                                tob1.b();
                                if (pdyVar.k != a2) {
                                    pdyVar.k = a2;
                                    pdyVar.v(Integer.valueOf(pdyVar.i.J()), Integer.valueOf(pdyVar.i.K()), Integer.valueOf(pdyVar.i.L()));
                                    pdyVar.t(null);
                                }
                            }
                            pdyVar.p(z2 ? 3 : 1);
                            if (z2) {
                                pdyVar.q();
                            }
                            Integer num = gdhVar2.l;
                            if (num != null) {
                                int i2 = num.intValue() > 95 ? 0 : 1;
                                tob1.b();
                                if (pdyVar.e.q != i2) {
                                    pdyVar.w(Integer.valueOf(i2));
                                    pdyVar.t(null);
                                }
                            }
                            gdhVar2.j().setCameraController(pdyVar);
                            er7 er7Var = new er7();
                            er7Var.b();
                            tob1.b();
                            pdyVar.O = er7Var;
                            pdyVar.t(null);
                            gdhVar2.A = er7Var;
                            pzt0 pzt0Var = gdhVar2.v;
                            if (pzt0Var != null) {
                                pzt0Var.a(null);
                            }
                            gdhVar2.v = b.g(r.a(gdhVar2.m), null, null, new DefaultImageStreamCameraLayer$initCameraController$1(scc.g(ru.yandex.taxi.camera.ml.a.b(context), dfb1.c(pdyVar.K)), gdhVar2, j2, pdyVar, null), 3);
                            gdhVar.x = null;
                            ((g18) Ref$ObjectRef.this.element).cancel();
                            return z;
                        }
                    };
                    ref$ObjectRef.element = new ec3(viewTreeObserver, onPreDrawListener, j, 2);
                    viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
                    gdhVar.x = (g18) ref$ObjectRef.element;
                    break;
                }
                break;
            case 1:
                ((GLSurfaceView) obj).onResume();
                break;
            case 2:
                RotationDetectorProvider rotationDetectorProvider = (RotationDetectorProvider) obj;
                sensorManager = rotationDetectorProvider.sensorManager;
                sensor = rotationDetectorProvider.sensor;
                sensorManager.registerListener(rotationDetectorProvider, sensor, 1);
                break;
            default:
                ((ua20) ((syq0) obj)).a.resumeSession();
                break;
        }
    }
}
