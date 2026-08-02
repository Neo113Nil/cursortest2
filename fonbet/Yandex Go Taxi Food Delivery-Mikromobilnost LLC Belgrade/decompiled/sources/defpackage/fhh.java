package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.permission.b;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.permission.a;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public final class fhh extends CameraLayer {
    public static final int n = k7h0.permission_camera_layer_tag_key;
    public final Context k;
    public final fva0 l;
    public final ghh m;

    public fhh(Context context, fva0 fva0Var, ghh ghhVar) {
        this.k = context;
        this.l = fva0Var;
        this.m = ghhVar;
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void b() {
        ghh ghhVar = this.m;
        if (((b) ghhVar.z).a(3)) {
            g();
        } else {
            ghhVar.Bg(new ehh(this));
            ghhVar.y.b(ghhVar, new a(ghhVar));
        }
    }

    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final void d() {
        this.m.Cg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.permission.DefaultPermissionCameraLayer$provideView$$inlined$wrapJankStats$1] */
    @Override // ru.yandex.taxi.scooters.presentation.common.ui.camera.CameraLayer
    public final View i() {
        final String str = "DefaultPermissionCameraLayer";
        fva0.f(this.l, "DefaultPermissionCameraLayer", PerformanceAnalytics$Type.Inflate, 0L, 4);
        final GoLinearLayout goLinearLayout = new GoLinearLayout(this.k, null, 0, 0, 14, null);
        goLinearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        final int i = 1;
        goLinearLayout.setOrientation(1);
        int i2 = n;
        goLinearLayout.setTag(i2, Integer.valueOf(i2));
        goLinearLayout.setGravity(17);
        int u = tje.u(32, goLinearLayout.getContext());
        goLinearLayout.setPadding(u, u, u, u);
        goLinearLayout.setBackgroundColor(goLinearLayout.getContext().getColor(mqg0.component_black));
        RobotoTextView robotoTextView = new RobotoTextView(this.k, null, 0, 6, null);
        robotoTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        robotoTextView.setTextSize(20.0f);
        robotoTextView.setTextTypeface(3);
        robotoTextView.setTextColor(robotoTextView.getContext().getColor(mqg0.white));
        robotoTextView.setGravity(17);
        robotoTextView.setText(robotoTextView.getContext().getString(kyh0.scooters_permission_grant_title));
        goLinearLayout.addView(robotoTextView);
        RobotoTextView robotoTextView2 = new RobotoTextView(this.k, null, 0, 6, null);
        robotoTextView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        robotoTextView2.setTextSize(16.0f);
        final int i3 = 0;
        robotoTextView2.setPadding(0, 0, 0, tje.u(24, robotoTextView2.getContext()));
        robotoTextView2.setTextColor(robotoTextView2.getContext().getColor(mqg0.white));
        robotoTextView2.setGravity(17);
        robotoTextView2.setText(robotoTextView2.getContext().getString(kyh0.scooters_permission_grant_subtitle));
        goLinearLayout.addView(robotoTextView2);
        ButtonComponent buttonComponent = new ButtonComponent(this.k, null, 0, 6, null);
        buttonComponent.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams = buttonComponent.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int u2 = tje.u(60, buttonComponent.getContext());
        marginLayoutParams.leftMargin = u2;
        marginLayoutParams.rightMargin = u2;
        buttonComponent.setLayoutParams(marginLayoutParams);
        buttonComponent.setButtonBackground(buttonComponent.getContext().getColor(mqg0.component_fog_dark));
        buttonComponent.setRoundedCornersRadius(tje.u(100, buttonComponent.getContext()));
        buttonComponent.setTextSize(16.0f);
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.scooters_go_to_settings));
        buttonComponent.setButtonTitleColor(buttonComponent.getContext().getColor(mqg0.white));
        buttonComponent.setDebounceClickListener(new Runnable(this) { // from class: dhh
            public final /* synthetic */ fhh b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i;
                fhh fhhVar = this.b;
                switch (i4) {
                    case 0:
                        sls slsVar = fhhVar.b;
                        if (slsVar == null) {
                            slsVar = null;
                        }
                        slsVar.invoke();
                        break;
                    default:
                        ((a60) fhhVar.m.x).d();
                        break;
                }
            }
        });
        goLinearLayout.addView(buttonComponent);
        ButtonComponent buttonComponent2 = new ButtonComponent(this.k, null, 0, 6, null);
        buttonComponent2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup.LayoutParams layoutParams2 = buttonComponent2.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        int u3 = tje.u(60, buttonComponent2.getContext());
        marginLayoutParams2.leftMargin = u3;
        marginLayoutParams2.rightMargin = u3;
        marginLayoutParams2.topMargin = tje.u(8, buttonComponent2.getContext());
        buttonComponent2.setLayoutParams(marginLayoutParams2);
        buttonComponent2.setButtonBackground(buttonComponent2.getContext().getColor(mqg0.component_fog_dark));
        buttonComponent2.setRoundedCornersRadius(tje.u(100, buttonComponent2.getContext()));
        buttonComponent2.setTextSize(16.0f);
        buttonComponent2.setText(buttonComponent2.getContext().getString(kyh0.scooters_exit));
        buttonComponent2.setButtonTitleColor(buttonComponent2.getContext().getColor(mqg0.white));
        buttonComponent2.setDebounceClickListener(new Runnable(this) { // from class: dhh
            public final /* synthetic */ fhh b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i4 = i3;
                fhh fhhVar = this.b;
                switch (i4) {
                    case 0:
                        sls slsVar = fhhVar.b;
                        if (slsVar == null) {
                            slsVar = null;
                        }
                        slsVar.invoke();
                        break;
                    default:
                        ((a60) fhhVar.m.x).d();
                        break;
                }
            }
        });
        goLinearLayout.addView(buttonComponent2);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ?? r1 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.permission.DefaultPermissionCameraLayer$provideView$$inlined$wrapJankStats$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v) {
                View rootView = goLinearLayout.getRootView();
                Object tag = rootView.getTag(t9h0.metricsStateHolder);
                if (tag == null) {
                    tag = new xva0();
                    rootView.setTag(t9h0.metricsStateHolder, tag);
                }
                yuf0 yuf0Var = ((xva0) tag).a;
                if (yuf0Var != null) {
                    yuf0Var.I(str);
                }
                View view = goLinearLayout;
                T t = ref$ObjectRef.element;
                view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v) {
            }
        };
        ref$ObjectRef.element = r1;
        goLinearLayout.addOnAttachStateChangeListener(r1);
        return goLinearLayout;
    }
}
