package com.yandex.plus.home.feature.webviews.internal.container;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import com.yandex.plus.home.feature.webviews.internal.container.modal.ModalViewBehavior;
import defpackage.b64;
import defpackage.bb1;
import defpackage.dje;
import defpackage.emh0;
import defpackage.fy20;
import defpackage.gje;
import defpackage.gy20;
import defpackage.hy20;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.lhc;
import defpackage.m810;
import defpackage.nvg0;
import defpackage.ny61;
import defpackage.p130;
import defpackage.q130;
import defpackage.q230;
import defpackage.qoi0;
import defpackage.r130;
import defpackage.sls;
import defpackage.v9h0;
import defpackage.w511;
import defpackage.wv5;
import defpackage.zgv;
import java.util.ArrayList;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001<BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010\u001fJ\u000f\u0010#\u001a\u00020\u000fH\u0016¢\u0006\u0004\b#\u0010\u001fJ\u000f\u0010$\u001a\u00020\u000fH\u0016¢\u0006\u0004\b$\u0010\u001fJ\u000f\u0010%\u001a\u00020\u000fH\u0016¢\u0006\u0004\b%\u0010\u001fJ\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u001fJ\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010\u001fJ\u000f\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\b(\u0010\u001fJ\u000f\u0010)\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000203088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006="}, d2 = {"Lcom/yandex/plus/home/feature/webviews/internal/container/ModalContentViewContainer;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Ldje;", "Landroid/content/Context;", "context", "", "modalViewPaddingTop", "settleAnimationDuration", "Lq230;", "options", "", "isShadowEnabled", "Lgje;", "viewHolder", "Lkotlin/Function0;", "Lzy11;", "onHidden", "<init>", "(Landroid/content/Context;ILjava/lang/Integer;Lq230;ZLgje;Lsls;)V", "Lr130;", "modalHeight", "setHeight", "(Lgje;Lr130;)V", "isEnabled", "setIsCloseByTapEnabled", "(Z)V", "", CaretView.ALPHA_PROPERTY, "setShadowColorAlpha", "(F)V", "show", "()V", "hide", "onStart", "onResume", "onPause", "onStop", "disableSwipeClose", "enableSwipeClose", "onHasStartedBeingOverlapped", "onHasStoppedBeingOverlapped", "onBackPressed", "()Z", "Lgje;", "Lsls;", "Landroid/view/ViewGroup;", "modalViewWrapper$delegate", "Lwv5;", "getModalViewWrapper", "()Landroid/view/ViewGroup;", "modalViewWrapper", "Landroid/view/View;", "shadow$delegate", "getShadow", "()Landroid/view/View;", "shadow", "Lcom/yandex/plus/home/feature/webviews/internal/container/modal/ModalViewBehavior;", "behavior", "Lcom/yandex/plus/home/feature/webviews/internal/container/modal/ModalViewBehavior;", "Companion", "gy20", "plus-home-feature-webviews_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ModalContentViewContainer extends CoordinatorLayout implements dje {

    @Deprecated
    public static final int BASE_SHADOW_COLOR = -16777216;

    @Deprecated
    public static final float DEFAULT_SHADOW_ALPHA = 0.4f;
    private final ModalViewBehavior<View> behavior;

    /* renamed from: modalViewWrapper$delegate, reason: from kotlin metadata */
    private final wv5 modalViewWrapper;
    private final sls onHidden;

    /* renamed from: shadow$delegate, reason: from kotlin metadata */
    private final wv5 shadow;
    private final gje viewHolder;
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("modalViewWrapper", 0, "getModalViewWrapper()Landroid/view/ViewGroup;", ModalContentViewContainer.class), b64.x(qoi0.a, ModalContentViewContainer.class, "shadow", "getShadow()Landroid/view/View;", 0)};
    private static final gy20 Companion = new gy20();

    /* JADX WARN: Multi-variable type inference failed */
    public ModalContentViewContainer(Context context, int i, Integer num, q230 q230Var, boolean z, gje gjeVar, sls slsVar) {
        super(context);
        r130 r130Var;
        this.viewHolder = gjeVar;
        this.onHidden = slsVar;
        this.modalViewWrapper = new wv5(new hy20(this, v9h0.modal_view_wrapper, 0 == true ? 1 : 0));
        this.shadow = new wv5(new hy20(this, v9h0.modal_view_shadow, 1));
        bb1.v(this, emh0.plus_sdk_modal_container, true);
        float dimension = getResources().getDimension(nvg0.plus_sdk_mu_1);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.m(this, dimension);
        setImportantForAccessibility(2);
        Integer num2 = null;
        ((CoordinatorLayout.LayoutParams) getModalViewWrapper().getLayoutParams()).setBehavior(new ModalViewBehavior(context, null));
        ViewGroup.LayoutParams layoutParams = getModalViewWrapper().getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            ny61.g("The view is not a child of CoordinatorLayout");
            throw null;
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (!(behavior instanceof ModalViewBehavior)) {
            ny61.g("The view is not associated with BottomSheetBehavior");
            throw null;
        }
        ModalViewBehavior<View> modalViewBehavior = (ModalViewBehavior) behavior;
        this.behavior = modalViewBehavior;
        if (!modalViewBehavior.Q) {
            modalViewBehavior.Q = true;
            modalViewBehavior.H();
        }
        modalViewBehavior.V = true;
        modalViewBehavior.U = true;
        modalViewBehavior.C(5);
        ViewGroup modalViewWrapper = getModalViewWrapper();
        if (!modalViewWrapper.isLaidOut() || modalViewWrapper.isLayoutRequested()) {
            modalViewWrapper.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer$special$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    ModalContentViewContainer.this.behavior.B(view.getHeight());
                }
            });
        } else {
            this.behavior.B(modalViewWrapper.getHeight());
        }
        fy20 fy20Var = new fy20(this);
        ArrayList arrayList = modalViewBehavior.i0;
        if (!arrayList.contains(fy20Var)) {
            arrayList.add(fy20Var);
        }
        float f = 0.4f;
        setShadowColorAlpha(0.4f);
        modalViewBehavior.T = num != null ? num.intValue() : -1;
        getModalViewWrapper().setPadding(0, i, 0, 0);
        getModalViewWrapper().addView(gjeVar.getView());
        if (q230Var != null && (r130Var = q230Var.c) != null) {
            setHeight(gjeVar, r130Var);
        }
        if (q230Var != null) {
            modalViewBehavior.R = q230Var.a / 100.0f;
            modalViewBehavior.S = q230Var.b / 100.0f;
            modalViewBehavior.V = !jl40.l(q230Var.e, Boolean.TRUE);
            Integer num3 = q230Var.d;
            if (num3 != null) {
                int intValue = num3.intValue();
                if (intValue >= 0 && intValue < 101) {
                    num2 = num3;
                }
                if (num2 != null) {
                    f = num2.intValue() / 100.0f;
                }
            }
            setShadowColorAlpha(f);
        }
        setIsCloseByTapEnabled(!(q230Var != null ? jl40.l(q230Var.e, Boolean.TRUE) : false));
        if (z) {
            getShadow().animate().alpha(1.0f).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewGroup getModalViewWrapper() {
        return (ViewGroup) this.modalViewWrapper.a($$delegatedProperties[0]);
    }

    private final View getShadow() {
        return (View) this.shadow.a($$delegatedProperties[1]);
    }

    private final void setHeight(final gje gjeVar, final r130 r130Var) {
        int height;
        ViewGroup modalViewWrapper = getModalViewWrapper();
        if (!modalViewWrapper.isLaidOut() || modalViewWrapper.isLayoutRequested()) {
            modalViewWrapper.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer$setHeight$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    int height2;
                    view.removeOnLayoutChangeListener(this);
                    ViewGroup.LayoutParams layoutParams = gje.this.getView().getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    int paddingTop = this.getModalViewWrapper().getPaddingTop() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                    ModalViewBehavior modalViewBehavior = this.behavior;
                    r130 r130Var2 = r130Var;
                    if (r130Var2 instanceof p130) {
                        height2 = Float.valueOf(TypedValue.applyDimension(1, Integer.valueOf(((p130) r130Var2).a).floatValue(), this.getModalViewWrapper().getContext().getResources().getDisplayMetrics())).intValue();
                    } else {
                        if (!(r130Var2 instanceof q130)) {
                            w511.b();
                            return;
                        }
                        height2 = (int) ((((q130) r130Var2).a / 100.0f) * (this.getModalViewWrapper().getHeight() - paddingTop));
                    }
                    modalViewBehavior.D = height2 + paddingTop;
                }
            });
            return;
        }
        ViewGroup.LayoutParams layoutParams = gjeVar.getView().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int paddingTop = getModalViewWrapper().getPaddingTop() + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
        ModalViewBehavior modalViewBehavior = this.behavior;
        if (r130Var instanceof p130) {
            height = Float.valueOf(TypedValue.applyDimension(1, Integer.valueOf(((p130) r130Var).a).floatValue(), getModalViewWrapper().getContext().getResources().getDisplayMetrics())).intValue();
        } else {
            if (!(r130Var instanceof q130)) {
                w511.b();
                return;
            }
            height = (int) ((((q130) r130Var).a / 100.0f) * (getModalViewWrapper().getHeight() - paddingTop));
        }
        modalViewBehavior.D = height + paddingTop;
    }

    private final void setIsCloseByTapEnabled(boolean isEnabled) {
        if (isEnabled) {
            bb1.L(getShadow(), new zgv(17, this));
        } else {
            getShadow().setOnClickListener(null);
            getShadow().setClickable(false);
        }
    }

    private final void setShadowColorAlpha(float alpha) {
        getShadow().setBackgroundColor(lhc.f(BASE_SHADOW_COLOR, m810.b(alpha * 255.0f)));
    }

    @Override // defpackage.dje
    public void disableSwipeClose() {
        this.behavior.V = false;
        setIsCloseByTapEnabled(false);
    }

    @Override // defpackage.dje
    public void enableSwipeClose() {
        this.behavior.V = true;
        setIsCloseByTapEnabled(true);
    }

    @Override // defpackage.dje
    public void hide() {
        this.behavior.C(5);
    }

    @Override // defpackage.dje
    public boolean onBackPressed() {
        if (this.viewHolder.onBackPressed()) {
            return true;
        }
        ModalViewBehavior<View> modalViewBehavior = this.behavior;
        if (modalViewBehavior.W == 5) {
            return false;
        }
        modalViewBehavior.C(5);
        return true;
    }

    @Override // defpackage.dje
    public void onHasStartedBeingOverlapped() {
        this.viewHolder.onHasStartedBeingOverlapped();
    }

    @Override // defpackage.dje
    public void onHasStoppedBeingOverlapped() {
        this.viewHolder.onHasStoppedBeingOverlapped();
    }

    @Override // defpackage.dje
    public void onPause() {
        this.viewHolder.onPause();
    }

    @Override // defpackage.dje
    public void onResume() {
        this.viewHolder.onResume();
    }

    @Override // defpackage.dje
    public void onStart() {
        this.viewHolder.onStart();
    }

    @Override // defpackage.dje
    public void onStop() {
        this.viewHolder.onStop();
    }

    @Override // defpackage.dje
    public void show() {
        this.behavior.C(3);
    }
}
