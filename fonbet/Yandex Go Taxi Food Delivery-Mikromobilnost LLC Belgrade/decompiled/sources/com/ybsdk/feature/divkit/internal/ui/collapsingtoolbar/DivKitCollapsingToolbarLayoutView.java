package com.ybsdk.feature.divkit.internal.ui.collapsingtoolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yandex.div.core.view2.Div2View;
import com.ybsdk.core.utils.ext.view.b;
import defpackage.cma1;
import defpackage.f161;
import defpackage.fnh0;
import defpackage.iig;
import defpackage.kp50;
import defpackage.kxk;
import defpackage.lxk;
import defpackage.ny61;
import defpackage.xah0;
import defpackage.y6i0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 /2\u00020\u0001:\u00010B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ\u001d\u0010 \u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001e\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R(\u0010)\u001a\u0004\u0018\u00010\u00172\b\u0010(\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R(\u0010-\u001a\u0004\u0018\u00010\u00172\b\u0010(\u001a\u0004\u0018\u00010\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010*\u001a\u0004\b.\u0010,¨\u00061"}, d2 = {"Lcom/ybsdk/feature/divkit/internal/ui/collapsingtoolbar/DivKitCollapsingToolbarLayoutView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "", "isContentScrollBehaviorEnabled", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Lzy11;", "setupOffsetChangeListener", "()V", "", "progress", "setCollapseProgress", "(F)V", "isToolbarScrollEnabled", "isAnchored", "configureScrollBehavior", "(ZZ)V", "Landroid/view/View;", "view", "setToolbarChild", "(Landroid/view/View;)V", "setContentChild", "Llxk;", "viewState", "Lcom/yandex/div/core/view2/Div2View;", "divView", "render", "(Llxk;Lcom/yandex/div/core/view2/Div2View;)V", "Lf161;", "binding", "Lf161;", "Ljava/lang/ref/WeakReference;", "parentDivView", "Ljava/lang/ref/WeakReference;", "value", "toolbarChildView", "Landroid/view/View;", "getToolbarChildView", "()Landroid/view/View;", "contentChildView", "getContentChildView", "Companion", "kxk", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivKitCollapsingToolbarLayoutView extends FrameLayout {
    private static final String COLLAPSE_PROGRESS_VARIABLE_NAME = "collapseProgress";
    public static final kxk Companion = new kxk();
    private final f161 binding;
    private View contentChildView;
    private WeakReference<Div2View> parentDivView;
    private View toolbarChildView;

    public DivKitCollapsingToolbarLayoutView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(fnh0.ybsdk_divkit_collapsing_toolbar_layout, (ViewGroup) this, false);
        addView(inflate);
        int i2 = xah0.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) cma1.O(i2, inflate);
        if (appBarLayout != null) {
            i2 = xah0.collapsingToolbar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) cma1.O(i2, inflate);
            if (collapsingToolbarLayout != null) {
                i2 = xah0.contentContainer;
                FrameLayout frameLayout = (FrameLayout) cma1.O(i2, inflate);
                if (frameLayout != null) {
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                    i2 = xah0.toolbarContainer;
                    FrameLayout frameLayout2 = (FrameLayout) cma1.O(i2, inflate);
                    if (frameLayout2 != null) {
                        this.binding = new f161(coordinatorLayout, appBarLayout, collapsingToolbarLayout, frameLayout, frameLayout2);
                        setupOffsetChangeListener();
                        if (z) {
                            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                            CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
                            if (layoutParams2 != null) {
                                layoutParams2.setBehavior(new DivKitContentScrollBehavior(context, null));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    private final void configureScrollBehavior(boolean isToolbarScrollEnabled, boolean isAnchored) {
        int i = isToolbarScrollEnabled ? 3 : 0;
        int i2 = isAnchored ? 16 : 0;
        CollapsingToolbarLayout collapsingToolbarLayout = this.binding.c;
        ViewGroup.LayoutParams layoutParams = collapsingToolbarLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
            return;
        }
        AppBarLayout.LayoutParams layoutParams2 = (AppBarLayout.LayoutParams) layoutParams;
        layoutParams2.setScrollFlags(i | i2);
        collapsingToolbarLayout.setLayoutParams(layoutParams2);
    }

    private final void setCollapseProgress(float progress) {
        Div2View div2View;
        WeakReference<Div2View> weakReference = this.parentDivView;
        if (weakReference == null || (div2View = weakReference.get()) == null) {
            return;
        }
        div2View.setVariable(COLLAPSE_PROGRESS_VARIABLE_NAME, String.valueOf(progress));
    }

    private final void setupOffsetChangeListener() {
        b.s(this.binding.b, new iig(1, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupOffsetChangeListener$lambda$2(DivKitCollapsingToolbarLayoutView divKitCollapsingToolbarLayoutView, AppBarLayout appBarLayout, int i) {
        float abs = Math.abs(i);
        float totalScrollRange = appBarLayout.getTotalScrollRange();
        divKitCollapsingToolbarLayoutView.setCollapseProgress(totalScrollRange > 0.0f ? y6i0.c(abs / totalScrollRange, 0.0f, 1.0f) : 0.0f);
    }

    public final View getContentChildView() {
        return this.contentChildView;
    }

    public final View getToolbarChildView() {
        return this.toolbarChildView;
    }

    public final void render(lxk viewState, Div2View divView) {
        this.parentDivView = new WeakReference<>(divView);
        this.binding.c.setMinimumHeight(kp50.r(viewState.a));
        FrameLayout frameLayout = this.binding.e;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
            return;
        }
        CollapsingToolbarLayout.LayoutParams layoutParams2 = (CollapsingToolbarLayout.LayoutParams) layoutParams;
        layoutParams2.setParallaxMultiplier(viewState.d);
        frameLayout.setLayoutParams(layoutParams2);
        configureScrollBehavior(viewState.c, viewState.b);
    }

    public final void setContentChild(View view) {
        this.binding.d.removeAllViews();
        this.binding.d.addView(view);
        this.contentChildView = view;
    }

    public final void setToolbarChild(View view) {
        this.binding.e.removeAllViews();
        this.binding.e.addView(view);
        FrameLayout frameLayout = this.binding.e;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type com.google.android.material.appbar.CollapsingToolbarLayout.LayoutParams");
            return;
        }
        CollapsingToolbarLayout.LayoutParams layoutParams2 = (CollapsingToolbarLayout.LayoutParams) layoutParams;
        layoutParams2.setCollapseMode(2);
        frameLayout.setLayoutParams(layoutParams2);
        this.toolbarChildView = view;
    }

    public DivKitCollapsingToolbarLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
    }

    public DivKitCollapsingToolbarLayoutView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, null);
    }

    public /* synthetic */ DivKitCollapsingToolbarLayoutView(Context context, AttributeSet attributeSet, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    public DivKitCollapsingToolbarLayoutView(Context context) {
        this(context, null, 0, false, 14, null);
    }
}
