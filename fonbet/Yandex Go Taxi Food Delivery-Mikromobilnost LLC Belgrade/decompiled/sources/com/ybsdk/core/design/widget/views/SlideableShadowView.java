package com.ybsdk.core.design.widget.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.a;
import com.ybsdk.core.design.theme.ThemeType;
import defpackage.kp50;
import defpackage.lv31;
import defpackage.nos0;
import defpackage.oo31;
import defpackage.rje;
import defpackage.txg0;
import defpackage.uhw0;

/* loaded from: classes2.dex */
public class SlideableShadowView extends FrameLayout implements lv31, a {
    private final int BOTTOM_OFFSET;
    private final int LEFT_OFFSET;
    private final int RIGHT_OFFSET;
    private final int TOP_OFFSET;
    private final int anchorViewId;
    private final uhw0 topOffsetSupplier;

    public SlideableShadowView(Context context, int i, uhw0 uhw0Var) {
        super(context);
        this.LEFT_OFFSET = (int) dpToPx(13.0f);
        this.TOP_OFFSET = (int) dpToPx(10.0f);
        this.RIGHT_OFFSET = (int) dpToPx(13.0f);
        this.BOTTOM_OFFSET = 0;
        setBackgroundResource(txg0.ybsdk_modal_view_shadow_patch);
        this.topOffsetSupplier = uhw0Var;
        this.anchorViewId = i;
    }

    private void setDefaultParams() {
        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) getLayoutParams();
        layoutParams.anchorGravity = 81;
        layoutParams.gravity = 49;
        layoutParams.setAnchorId(this.anchorViewId);
    }

    public /* bridge */ /* synthetic */ boolean allowTraverse() {
        return true;
    }

    public /* bridge */ /* synthetic */ void applyTheme(ThemeType themeType) {
    }

    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // defpackage.lv31
    public View asView() {
        return this;
    }

    public int color(int i) {
        return asView().getContext().getColor(i);
    }

    public int dimen(int i) {
        return rje.d(i, asView().getContext());
    }

    public float dpToPx(float f) {
        return kp50.q(f);
    }

    @Override // androidx.coordinatorlayout.widget.a
    public CoordinatorLayout.a getBehavior() {
        return new nos0(this.LEFT_OFFSET, this.TOP_OFFSET, this.RIGHT_OFFSET, this.topOffsetSupplier);
    }

    public View inflate(int i) {
        ViewGroup viewGroup = (ViewGroup) asView();
        return oo31.f(viewGroup, i, viewGroup, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDefaultParams();
    }

    public SlideableShadowView(Context context, int i) {
        this(context, i, null);
    }
}
