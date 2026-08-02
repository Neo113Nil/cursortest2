package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import androidx.core.view.b;
import com.adjust.sdk.Constants;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoImageButton;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.scooters.api.analytics.AnalyticsCameraState;
import com.yandex.go.scooters.api.analytics.CameraTappedButton;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import defpackage.ban0;
import defpackage.nan0;
import defpackage.t9h0;
import defpackage.tje;
import defpackage.tso0;
import defpackage.xva0;
import defpackage.yuf0;
import defpackage.zy11;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.TopRoundRectBackgroundHelper$makeViewRounded$1;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.CameraControlRepository$listenToCameraStreamState$$inlined$flatMapLatest$1;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoPresenter$setupVehicleDetection$$inlined$collectIn$1;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.d;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionState;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class nan0 extends CameraLayer {
    public final Context k;
    public final fva0 l;
    public final tso0 m;
    public final f9n0 n;
    public final ban0 o;
    public final d p;
    public final n5o0 q;
    public final String s;
    public final String t;
    public final int v;
    public final int w;
    public final int x;
    public final i3y r = a.b(LazyThreadSafetyMode.NONE, new j6m0(26, this));
    public final yln u = new yln(21, this);

    public nan0(Context context, fva0 fva0Var, tso0 tso0Var, f9n0 f9n0Var, ban0 ban0Var, d dVar, n5o0 n5o0Var) {
        this.k = context;
        this.l = fva0Var;
        this.m = tso0Var;
        this.n = f9n0Var;
        this.o = ban0Var;
        this.p = dVar;
        this.q = n5o0Var;
        this.s = context.getString(kyh0.flashlight_enable);
        this.t = context.getString(kyh0.flashlight_disable);
        this.v = context.getColor(mqg0.white);
        this.w = context.getColor(mqg0.component_green_toxic);
        this.x = context.getColor(mqg0.component_red_toxic);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void b() {
        this.q.b("Perf.ScootersCompletionTakePhotoCameraLayer.InitPreview");
        j().a.setAlpha(0.0f);
        j().a.addOnLayoutChangeListener(this.u);
        GoImageView goImageView = j().j;
        tso0 tso0Var = this.m;
        ScootersVehicleType scootersVehicleType = tso0Var.d;
        ScootersVehicleType scootersVehicleType2 = ScootersVehicleType.BIKE;
        goImageView.setImageResource(scootersVehicleType == scootersVehicleType2 ? r0h0.ic_bike_full_outline : r0h0.ic_scooter_full_outline);
        final GoImageView goImageView2 = j().j;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoCameraLayer$startFlickerMirroringAnimation$1
            private int repeatingCount;

            public final int getRepeatingCount() {
                return this.repeatingCount;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                this.repeatingCount = 0;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                if (this.repeatingCount % 2 == 1) {
                    View view = goImageView2;
                    view.setScaleX(view.getScaleX() * (-1.0f));
                }
                this.repeatingCount++;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                this.repeatingCount = 0;
            }

            public final void setRepeatingCount(int i) {
                this.repeatingCount = i;
            }
        });
        goImageView2.startAnimation(alphaAnimation);
        ListItemComponent listItemComponent = j().d;
        CharSequence charSequence = tso0Var.b;
        Context context = this.k;
        if (charSequence == null) {
            charSequence = tso0Var.d == scootersVehicleType2 ? context.getString(kyh0.scooters_risky_force_completion_bike_message) : context.getString(kyh0.scooters_risky_force_completion_scooter_message);
        }
        listItemComponent.setTitle(charSequence);
        j().d.setTrailContainerClickListener(new v3n0(3, this));
        final GoImageButton goImageButton = j().i;
        c.z(new sls() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.a
            @Override // defpackage.sls
            public final Object invoke() {
                GoImageButton goImageButton2 = GoImageButton.this;
                goImageButton2.setSelected(!goImageButton2.isSelected());
                nan0 nan0Var = this;
                androidx.core.view.b.t(nan0Var.j().i, nan0Var.j().i.isSelected() ? nan0Var.t : nan0Var.s);
                boolean isSelected = goImageButton2.isSelected();
                d dVar = nan0Var.p;
                if (isSelected) {
                    dVar.F = true;
                    tje.N(dVar.Jg(), null, null, new ScootersCompletionTakePhotoPresenter$enableTorch$1(dVar, null), 3);
                } else {
                    dVar.F = false;
                    tje.N(dVar.Jg(), null, null, new ScootersCompletionTakePhotoPresenter$disableTorch$1(dVar, null), 3);
                }
                ban0 ban0Var = nan0Var.o;
                CameraTappedButton cameraTappedButton = CameraTappedButton.TORCH;
                AnalyticsCameraState analyticsCameraState = AnalyticsCameraState.CAMERA;
                tso0 tso0Var2 = nan0Var.m;
                ban0Var.a(cameraTappedButton, analyticsCameraState, tso0Var2.e, tso0Var2.a);
                return zy11.a;
            }
        }, goImageButton);
        c.z(new sls() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.b
            @Override // defpackage.sls
            public final Object invoke() {
                nan0 nan0Var = nan0.this;
                d dVar = nan0Var.p;
                tje.N(dVar.Jg(), null, null, new ScootersCompletionTakePhotoPresenter$takePicture$1(dVar, null), 3);
                ban0 ban0Var = nan0Var.o;
                CameraTappedButton cameraTappedButton = CameraTappedButton.TAKE_PHOTO;
                AnalyticsCameraState analyticsCameraState = AnalyticsCameraState.CAMERA;
                tso0 tso0Var2 = nan0Var.m;
                ban0Var.a(cameraTappedButton, analyticsCameraState, tso0Var2.e, tso0Var2.a);
                return zy11.a;
            }
        }, j().l);
        lan0 lan0Var = new lan0(this);
        d dVar = this.p;
        dVar.Bg(lan0Var);
        ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar = dVar.D;
        tje.N(dVar.Jg(), null, null, new ScootersCompletionTakePhotoPresenter$setupCamera$$inlined$collectIn$1(e.X(aVar.b, new CameraControlRepository$listenToCameraStreamState$$inlined$flatMapLatest$1(null, aVar)), null, dVar), 3);
        ((pan0) dVar.Dg()).tf(ScootersCompletionPhotoVehicleDetectionState.Idle);
        tje.N(dVar.Jg(), null, null, new ScootersCompletionTakePhotoPresenter$setupVehicleDetection$$inlined$collectIn$1(dVar.A.f(aVar, dVar.C.a()), null, (pan0) dVar.Dg()), 3);
        rbo0 rbo0Var = tso0Var.f;
        final GoFrameLayout goFrameLayout = j().b;
        goFrameLayout.setOutlineProvider(new TopRoundRectBackgroundHelper$makeViewRounded$1(tje.u(16, context)));
        goFrameLayout.setClipToOutline(true);
        if (rbo0Var == null) {
            f9n0 f9n0Var = this.n;
            if ((f9n0Var != null ? f9n0Var.c : null) != null) {
                ViewGroup.LayoutParams layoutParams = goFrameLayout.getLayoutParams();
                if (layoutParams == null) {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = -2;
                goFrameLayout.setLayoutParams(layoutParams);
                goFrameLayout.setBackground(null);
                goFrameLayout.setForeground(null);
                ListItemComponent listItemComponent2 = new ListItemComponent(this.k, null, 0, 6, null);
                listItemComponent2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                listItemComponent2.setTitleTextSizePx((int) tje.b0(listItemComponent2.getContext(), 13.0f));
                listItemComponent2.setTitleTextColor(listItemComponent2.getContext().getColor(mqg0.white));
                listItemComponent2.setBackgroundColor(listItemComponent2.getContext().getColor(mqg0.component_fog_light));
                listItemComponent2.setLeadTint(listItemComponent2.getContext().getColor(mqg0.component_red_toxic));
                listItemComponent2.setLeadImage(vng.t(s3h0.ic_exclamation_mark_fill, listItemComponent2.getContext()));
                listItemComponent2.setTitle(f9n0Var.c);
                goFrameLayout.addView(listItemComponent2);
                goFrameLayout.setVisibility(0);
                return;
            }
            return;
        }
        final View view = (View) rbo0Var.c.invoke(new zdk0(21, this, goFrameLayout, rbo0Var));
        if (view == null) {
            return;
        }
        j().k.setVisibility(0);
        WeakHashMap weakHashMap = b.a;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoCameraLayer$showPanoramaIfPossible$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    view.setTranslationY(-((view2.getHeight() - GoFrameLayout.this.getHeight()) / 2.0f));
                }
            });
        } else {
            view.setTranslationY(-((view.getHeight() - goFrameLayout.getHeight()) / 2.0f));
        }
        goFrameLayout.addView(view, -1, tje.u(Constants.MINIMAL_ERROR_STATUS_CODE, context));
        RobotoTextView robotoTextView = new RobotoTextView(this.k, null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        robotoTextView.setTextSize(13.0f);
        int u = tje.u(8, robotoTextView.getContext());
        robotoTextView.setPadding(u, u, u, u);
        robotoTextView.setText(rbo0Var.a);
        robotoTextView.setTextColor(robotoTextView.getContext().getColor(mqg0.white));
        robotoTextView.setGravity(81);
        robotoTextView.setBackground(vng.t(r0h0.scooters_rounded_rect_fog_gradient_bg, robotoTextView.getContext()));
        robotoTextView.setAlpha(0.0f);
        cma1.J(robotoTextView);
        goFrameLayout.addView(robotoTextView);
        goFrameLayout.setVisibility(0);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void d() {
        j().m.removeOnLayoutChangeListener(this.u);
        this.p.Cg();
        j().b.removeAllViews();
        j().i.setSelected(false);
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void h(t1w t1wVar) {
        ListItemComponent listItemComponent = j().d;
        listItemComponent.setPadding(listItemComponent.getPaddingLeft(), t1wVar.b, listItemComponent.getPaddingRight(), listItemComponent.getPaddingBottom());
        j().c.setGuidelineEnd(t1wVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoCameraLayer$provideView$$inlined$wrapJankStats$1] */
    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final View i() {
        final String str = "ScootersCompletionTakePhotoCameraLayer";
        fva0.f(this.l, "ScootersCompletionTakePhotoCameraLayer", PerformanceAnalytics$Type.Inflate, 0L, 4);
        final GoConstraintLayout goConstraintLayout = j().a;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r2 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.camera_ui.take_photo.ScootersCompletionTakePhotoCameraLayer$provideView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = goConstraintLayout.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = goConstraintLayout;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r2;
        goConstraintLayout.addOnAttachStateChangeListener(r2);
        return goConstraintLayout;
    }

    public final oan0 j() {
        return (oan0) this.r.getValue();
    }
}
