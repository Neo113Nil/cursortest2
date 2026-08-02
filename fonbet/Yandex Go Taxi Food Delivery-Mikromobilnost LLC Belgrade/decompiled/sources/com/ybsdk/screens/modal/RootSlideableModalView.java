package com.ybsdk.screens.modal;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.design.widget.SlideableModalView;
import defpackage.apk0;
import defpackage.bkx;
import defpackage.ekx;
import defpackage.jah0;
import defpackage.kp50;
import defpackage.lcb1;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.qmh0;
import defpackage.rje;
import defpackage.sls;
import defpackage.uns0;
import defpackage.vfc0;
import defpackage.zjx;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR(\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006%"}, d2 = {"Lcom/ybsdk/screens/modal/RootSlideableModalView;", "Lcom/ybsdk/core/design/widget/SlideableModalView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getCardContentViewLayoutRes", "()I", "getTopPadding", "Lzy11;", "onDismissManually", "()V", "onBackPressed", "removeFromParent", "Luns0;", "slideListener", "setSlideMotionHelper", "(Luns0;)V", "Landroid/view/View;", "navigationSliderRoot", "Landroid/view/View;", "getNavigationSliderRoot", "()Landroid/view/View;", "Lkotlin/Function0;", "onBackPressedListener", "Lsls;", "getOnBackPressedListener", "()Lsls;", "setOnBackPressedListener", "(Lsls;)V", "onDismissManuallyListener", "getOnDismissManuallyListener", "setOnDismissManuallyListener", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RootSlideableModalView extends SlideableModalView {
    private final View navigationSliderRoot;
    private sls onBackPressedListener;
    private sls onDismissManuallyListener;

    public RootSlideableModalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Activity activity;
        this.navigationSliderRoot = findViewById(jah0.navigationSliderRoot);
        this.onBackPressedListener = new apk0(4);
        this.onDismissManuallyListener = new apk0(5);
        setDismissOnTouchOutside(false);
        setDismissOnBackPressed(false);
        while (true) {
            if (!(context instanceof Activity)) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = (Activity) context;
                break;
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        if (fragmentActivity != null) {
            new ekx(fragmentActivity, new vfc0(19, this));
        } else {
            ny61.g("Expected activity context");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(RootSlideableModalView rootSlideableModalView, bkx bkxVar) {
        if (bkxVar.equals(zjx.a) && rootSlideableModalView.findFocus() == null) {
            rootSlideableModalView.requestFocus();
        }
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public /* bridge */ /* synthetic */ boolean allowTraverse() {
        return true;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public /* bridge */ /* synthetic */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView, defpackage.lv31
    public View asView() {
        return this;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public int color(int i) {
        return asView().getContext().getColor(i);
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public int dimen(int i) {
        return rje.d(i, asView().getContext());
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public float dpToPx(float f) {
        return kp50.q(f);
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return qmh0.ybsdk_slideable_modal_view_content;
    }

    public final View getNavigationSliderRoot() {
        return this.navigationSliderRoot;
    }

    public final sls getOnBackPressedListener() {
        return this.onBackPressedListener;
    }

    public final sls getOnDismissManuallyListener() {
        return this.onDismissManuallyListener;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // com.ybsdk.core.design.widget.SlideableModalView, com.ybsdk.core.design.widget.ModalView
    public View inflate(int i) {
        ViewGroup viewGroup = (ViewGroup) asView();
        return oo31.f(viewGroup, i, viewGroup, true);
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void onBackPressed() {
        this.onBackPressedListener.invoke();
        super.onBackPressed();
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void onDismissManually() {
        this.onDismissManuallyListener.invoke();
        super.onDismissManually();
    }

    @Override // com.ybsdk.core.design.widget.ModalView
    public void removeFromParent() {
        lcb1.d(this);
        super.removeFromParent();
    }

    public final void setOnBackPressedListener(sls slsVar) {
        this.onBackPressedListener = slsVar;
    }

    public final void setOnDismissManuallyListener(sls slsVar) {
        this.onDismissManuallyListener = slsVar;
    }

    public final void setSlideMotionHelper(uns0 slideListener) {
        contentView().setSlideMotionHelper(slideListener);
    }

    public RootSlideableModalView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ RootSlideableModalView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public RootSlideableModalView(Context context) {
        this(context, null, 0, 6, null);
    }
}
