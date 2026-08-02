package com.yandex.go.scooters.photocontrol.camera_ui.take_photo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yandex.go.design.widget.mask.BaseTargetMaskView;
import defpackage.djo0;
import defpackage.ehn0;
import defpackage.ejo0;
import defpackage.fva0;
import defpackage.gjo0;
import defpackage.i3y;
import defpackage.kyh0;
import defpackage.ljo0;
import defpackage.n5o0;
import defpackage.sls;
import defpackage.t1w;
import defpackage.t9h0;
import defpackage.tje;
import defpackage.v3n0;
import defpackage.vam0;
import defpackage.xva0;
import defpackage.yuf0;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;

/* loaded from: classes13.dex */
public final class b extends CameraLayer {
    public final Context k;
    public final fva0 l;
    public final ljo0 m;
    public final n5o0 n;
    public final gjo0 o;
    public final i3y p = kotlin.a.b(LazyThreadSafetyMode.NONE, new ehn0(20, this));

    public b(Context context, fva0 fva0Var, ljo0 ljo0Var, n5o0 n5o0Var, gjo0 gjo0Var) {
        this.k = context;
        this.l = fva0Var;
        this.m = ljo0Var;
        this.n = n5o0Var;
        this.o = gjo0Var;
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void b() {
        this.n.b("Perf.ScootersPhotocontrolTakePhotoCameraLayer.InitPreview");
        ejo0 j = j();
        ViewStub viewStub = j.d;
        ljo0 ljo0Var = this.m;
        c.w(viewStub, ljo0Var.a);
        j().a.setAlpha(0.0f);
        j().e.setEnabled(false);
        j().c.setTitle(kyh0.common_loading);
        j().c.setLeadImage((Drawable) null);
        BaseTargetMaskView baseTargetMaskView = ljo0Var.a;
        baseTargetMaskView.reset();
        baseTargetMaskView.setOnFullyCapturedListener(new vam0(26, j, this));
        ToolbarComponent toolbarComponent = j.f;
        toolbarComponent.setTitle(ljo0Var.b);
        toolbarComponent.setOnCloseClickListener(new v3n0(18, this));
        c.z(new sls() { // from class: com.yandex.go.scooters.photocontrol.camera_ui.take_photo.a
            @Override // defpackage.sls
            public final Object invoke() {
                gjo0 gjo0Var = b.this.o;
                tje.N(gjo0Var.Jg(), null, null, new ScootersPhotocontrolTakePhotoPresenter$takePhoto$1(gjo0Var, null), 3);
                return zy11.a;
            }
        }, j.e);
        djo0 djo0Var = new djo0(this);
        gjo0 gjo0Var = this.o;
        gjo0Var.Bg(djo0Var);
        tje.N(gjo0Var.Jg(), null, null, new ScootersPhotocontrolTakePhotoPresenter$attachView$1(gjo0Var, djo0Var, null), 3);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void d() {
        this.o.Cg();
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void h(t1w t1wVar) {
        j().g.setGuidelineBegin(t1wVar.b);
        j().b.setGuidelineEnd(t1wVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.photocontrol.camera_ui.take_photo.ScootersPhotocontrolTakePhotoCameraLayer$provideView$$inlined$wrapJankStats$1] */
    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final View i() {
        final String str = "ScootersPhotocontrolTakePhotoCameraLayer";
        fva0.f(this.l, "ScootersPhotocontrolTakePhotoCameraLayer", PerformanceAnalytics$Type.Inflate, 0L, 4);
        final ConstraintLayout constraintLayout = j().a;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.photocontrol.camera_ui.take_photo.ScootersPhotocontrolTakePhotoCameraLayer$provideView$$inlined$wrapJankStats$1
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

    public final ejo0 j() {
        return (ejo0) this.p.getValue();
    }
}
