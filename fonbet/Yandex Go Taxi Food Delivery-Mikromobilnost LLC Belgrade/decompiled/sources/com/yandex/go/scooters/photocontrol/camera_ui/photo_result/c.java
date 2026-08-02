package com.yandex.go.scooters.photocontrol.camera_ui.photo_result;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.photocontrol.camera_ui.photo_result.c;
import defpackage.ehn0;
import defpackage.fva0;
import defpackage.i3y;
import defpackage.ljo0;
import defpackage.rio0;
import defpackage.sio0;
import defpackage.t1w;
import defpackage.t9h0;
import defpackage.tio0;
import defpackage.tje;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewTopRounded$1;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;

/* loaded from: classes13.dex */
public final class c extends CameraLayer {
    public final Context k;
    public final fva0 l;
    public final ljo0 m;
    public final d n;
    public final i3y o = kotlin.a.b(LazyThreadSafetyMode.NONE, new ehn0(19, this));
    public CharSequence p;

    public c(Context context, fva0 fva0Var, ljo0 ljo0Var, d dVar) {
        this.k = context;
        this.l = fva0Var;
        this.m = ljo0Var;
        this.n = dVar;
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void b() {
        ViewStub viewStub = j().h;
        ljo0 ljo0Var = this.m;
        ru.yandex.taxi.design.utils.c.w(viewStub, ljo0Var.a);
        final int i = 0;
        ljo0Var.a.setStrokeVisibility(false);
        j().c.setDebounceClickListener(new Runnable() { // from class: com.yandex.go.scooters.photocontrol.camera_ui.photo_result.a
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = c.this.n;
                ScootersExamType scootersExamType = dVar.D;
                ScootersExamType scootersExamType2 = ScootersExamType.PASSPORT;
                boolean z = scootersExamType == scootersExamType2 || !dVar.E.contains(scootersExamType2);
                ((tio0) dVar.Dg()).j9();
                tje.N(dVar.Jg(), null, null, new ScootersPhotocontrolPhotoResultPresenter$checkPhoto$1(dVar, z, null), 3);
            }
        });
        j().l.setDebounceClickListener(new Runnable(this) { // from class: qio0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                c cVar = this.b;
                switch (i2) {
                    case 0:
                        cVar.c();
                        break;
                    default:
                        sls slsVar = cVar.b;
                        if (slsVar == null) {
                            slsVar = null;
                        }
                        slsVar.invoke();
                        break;
                }
            }
        });
        final int i2 = 1;
        j().n.setOnCloseClickListener(new Runnable(this) { // from class: qio0
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                c cVar = this.b;
                switch (i22) {
                    case 0:
                        cVar.c();
                        break;
                    default:
                        sls slsVar = cVar.b;
                        if (slsVar == null) {
                            slsVar = null;
                        }
                        slsVar.invoke();
                        break;
                }
            }
        });
        j().n.setTitle(ljo0Var.b);
        View view = j().i;
        view.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewTopRounded$1(tje.u(24, this.k)));
        view.setClipToOutline(true);
        rio0 rio0Var = new rio0(this);
        d dVar = this.n;
        dVar.Bg(rio0Var);
        j().k.setVisibility(0);
        j().d.setVisibility(8);
        tje.N(dVar.Jg(), null, null, new ScootersPhotocontrolPhotoResultPresenter$setupLegalView$1(dVar, null), 3);
        tje.N(dVar.Jg(), null, null, new ScootersPhotocontrolPhotoResultPresenter$attachView$1(dVar, rio0Var, null), 3);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void d() {
        this.n.Cg();
        j().m.setImageDrawable(null);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void h(t1w t1wVar) {
        j().o.setGuidelineBegin(t1wVar.b);
        j().b.setGuidelineEnd(t1wVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.photocontrol.camera_ui.photo_result.ScootersPhotocontrolPhotoResultCameraLayer$provideView$$inlined$wrapJankStats$1] */
    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final View i() {
        final String str = "ScootersPhotocontrolPhotoResultCameraLayer";
        fva0.f(this.l, "ScootersPhotocontrolPhotoResultCameraLayer", PerformanceAnalytics$Type.Inflate, 0L, 4);
        final ConstraintLayout constraintLayout = j().a;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.photocontrol.camera_ui.photo_result.ScootersPhotocontrolPhotoResultCameraLayer$provideView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = constraintLayout.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = constraintLayout;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r2;
        constraintLayout.addOnAttachStateChangeListener(r2);
        return constraintLayout;
    }

    public final sio0 j() {
        return (sio0) this.o.getValue();
    }
}
