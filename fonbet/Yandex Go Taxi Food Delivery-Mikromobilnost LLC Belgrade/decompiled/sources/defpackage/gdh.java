package defpackage;

import android.content.Context;
import android.util.Size;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.v;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.camera.CameraPreview;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a;
import ru.yandex.taxi.widget.ShimmeringFrameLayout;

/* loaded from: classes6.dex */
public final class gdh extends CameraLayer {
    public er7 A;
    public final Context k;
    public final Integer l;
    public final Lifecycle m;
    public final boolean n;
    public final Size o;
    public final Size p;
    public final fva0 q;
    public final a r;
    public final dfv s;
    public final i3y t;
    public final i3y u;
    public pzt0 v;
    public long w;
    public g18 x;
    public final fdh y;
    public final hs7 z;

    public gdh(Context context, Integer num, Lifecycle lifecycle, boolean z, Size size, Size size2, fva0 fva0Var, a aVar, dfv dfvVar) {
        this.k = context;
        this.l = num;
        this.m = lifecycle;
        this.n = z;
        this.o = size;
        this.p = size2;
        this.q = fva0Var;
        this.r = aVar;
        this.s = dfvVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = kotlin.a.b(lazyThreadSafetyMode, new ddh(this, 0));
        this.u = kotlin.a.b(lazyThreadSafetyMode, new ddh(this, 1));
        this.y = new fdh(0, this);
        this.z = new hs7(1, this);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void b() {
        ((ShimmeringFrameLayout) this.u.getValue()).setShimmering(true);
        j().setVisibility(4);
        this.m.a(this.y);
        j().getPreviewStreamState().g(this.z);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void d() {
        g18 g18Var = this.x;
        if (g18Var != null) {
            this.x = null;
            g18Var.cancel();
        }
        k();
        j().getPreviewStreamState().j(this.z);
        this.m.d(this.y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.DefaultImageStreamCameraLayer$provideView$$inlined$wrapJankStats$1] */
    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final View i() {
        final String str = "DefaultImageStreamCameraLayer";
        fva0.f(this.q, "DefaultImageStreamCameraLayer", PerformanceAnalytics$Type.Inflate, 0L, 4);
        final ShimmeringFrameLayout shimmeringFrameLayout = (ShimmeringFrameLayout) this.u.getValue();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.DefaultImageStreamCameraLayer$provideView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = shimmeringFrameLayout.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = shimmeringFrameLayout;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r2;
        shimmeringFrameLayout.addOnAttachStateChangeListener(r2);
        return shimmeringFrameLayout;
    }

    public final CameraPreview j() {
        return (CameraPreview) this.t.getValue();
    }

    public final void k() {
        pzt0 pzt0Var = this.v;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.v = null;
        this.w++;
        a aVar = this.r;
        iq7 iq7Var = (iq7) aVar.b.getValue();
        if (iq7Var != null) {
            tob1.b();
            ody odyVar = iq7Var.s;
            qp7 b = odyVar == null ? null : odyVar.b();
            if (b != null) {
                ((e70) b).f(false);
            }
        }
        aVar.b.l(null);
        aVar.e = m94.c;
        aVar.d = null;
        er7 er7Var = this.A;
        if (er7Var != null) {
            er7Var.c();
        }
        er7 er7Var2 = this.A;
        if (er7Var2 != null) {
            er7Var2.a();
        }
        this.A = null;
    }

    public final void l(iq7 iq7Var, xs7 xs7Var) {
        v k;
        iq7Var.o(xs7Var);
        dfv dfvVar = this.s;
        if ((dfvVar instanceof cfv) && ((cfv) dfvVar).a) {
            tob1.b();
            ody odyVar = iq7Var.s;
            kf61 kf61Var = null;
            ar7 c = odyVar == null ? null : odyVar.c();
            if (c != null && (k = ((g70) c).k()) != null) {
                kf61Var = (kf61) k.d();
            }
            if (kf61Var != null) {
                iq7Var.r(kf61Var.c());
            }
        }
    }
}
