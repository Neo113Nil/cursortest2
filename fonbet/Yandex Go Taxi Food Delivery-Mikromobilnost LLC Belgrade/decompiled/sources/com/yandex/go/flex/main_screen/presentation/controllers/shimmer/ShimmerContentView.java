package com.yandex.go.flex.main_screen.presentation.controllers.shimmer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoFrameLayout;
import defpackage.cma1;
import defpackage.h8;
import defpackage.ktg0;
import defpackage.lth0;
import defpackage.nih0;
import defpackage.ny61;
import defpackage.qtr0;
import defpackage.rtr0;
import defpackage.str0;
import defpackage.tje;
import defpackage.u3s0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.ShimmeringBar;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b*\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/yandex/go/flex/main_screen/presentation/controllers/shimmer/ShimmerContentView;", "Lcom/yandex/go/design/view/GoConstraintLayout;", "Landroid/content/Context;", "context", "Lqtr0;", "shimmerContentPresenter", "<init>", "(Landroid/content/Context;Lqtr0;)V", "Lzy11;", "applyNavShortcutsPaddings", "()V", "Landroid/view/ViewGroup;", "root", "", "isShimmering", "applyShimmeringStateRecursive", "(Landroid/view/ViewGroup;Landroid/view/ViewGroup;Z)V", "onAttachedToWindow", "onDetachedFromWindow", "Lqtr0;", "Lu3s0;", "binding", "Lu3s0;", "Companion", "str0", "rtr0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShimmerContentView extends GoConstraintLayout {
    private static final double CELL_SHORTCUT_TO_RATIO = 1.75d;
    private static final rtr0 Companion = new rtr0();
    private static final int FIGMA_CELL_BASE_SIZE = 84;
    private static final int FIGMA_CELL_BOTTOM_PADDING = 23;
    private static final int FIGMA_CELL_HORIZONTAL_PADDING = 18;
    private static final int FIGMA_CELL_TOP_PADDING = 13;
    private static final double SCREEN_TO_SHORTCUT_RATIO = 6.25d;
    private final u3s0 binding;
    private final qtr0 shimmerContentPresenter;

    public ShimmerContentView(Context context, qtr0 qtr0Var) {
        super(context, null, 0, 0, 14, null);
        this.shimmerContentPresenter = qtr0Var;
        LayoutInflater.from(context).inflate(lth0.shortcuts_skeleton, this);
        int i = nih0.nav_shortcut_1;
        if (((ShimmeringBar) cma1.O(i, this)) != null) {
            i = nih0.nav_shortcut_1_container;
            GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i, this);
            if (goFrameLayout != null) {
                i = nih0.nav_shortcut_2;
                if (((ShimmeringBar) cma1.O(i, this)) != null) {
                    i = nih0.nav_shortcut_2_container;
                    GoFrameLayout goFrameLayout2 = (GoFrameLayout) cma1.O(i, this);
                    if (goFrameLayout2 != null) {
                        i = nih0.nav_shortcut_3;
                        if (((ShimmeringBar) cma1.O(i, this)) != null) {
                            i = nih0.nav_shortcut_3_container;
                            GoFrameLayout goFrameLayout3 = (GoFrameLayout) cma1.O(i, this);
                            if (goFrameLayout3 != null) {
                                i = nih0.nav_shortcut_4;
                                if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                    i = nih0.nav_shortcut_4_container;
                                    GoFrameLayout goFrameLayout4 = (GoFrameLayout) cma1.O(i, this);
                                    if (goFrameLayout4 != null) {
                                        i = nih0.nav_shortcut_5;
                                        if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                            i = nih0.nav_shortcut_5_container;
                                            GoFrameLayout goFrameLayout5 = (GoFrameLayout) cma1.O(i, this);
                                            if (goFrameLayout5 != null) {
                                                i = nih0.nav_shortcut_6;
                                                if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                    i = nih0.nav_shortcut_6_container;
                                                    GoFrameLayout goFrameLayout6 = (GoFrameLayout) cma1.O(i, this);
                                                    if (goFrameLayout6 != null) {
                                                        i = nih0.nav_shortcut_7;
                                                        if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                            i = nih0.nav_shortcut_7_container;
                                                            GoFrameLayout goFrameLayout7 = (GoFrameLayout) cma1.O(i, this);
                                                            if (goFrameLayout7 != null) {
                                                                i = nih0.promo_block_1;
                                                                if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                    i = nih0.promo_block_2;
                                                                    if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                        i = nih0.promo_block_3;
                                                                        if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                            i = nih0.promo_block_4;
                                                                            if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                                i = nih0.promo_title;
                                                                                if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                                    i = nih0.suggest_1;
                                                                                    if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                                        i = nih0.suggest_2;
                                                                                        if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                                            i = nih0.suggest_3;
                                                                                            if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                                                i = nih0.where_to;
                                                                                                if (((ShimmeringBar) cma1.O(i, this)) != null) {
                                                                                                    this.binding = new u3s0(this, goFrameLayout, goFrameLayout2, goFrameLayout3, goFrameLayout4, goFrameLayout5, goFrameLayout6, goFrameLayout7);
                                                                                                    setPadding(getPaddingLeft(), tje.u(12, getContext()), getPaddingRight(), getPaddingBottom());
                                                                                                    applyNavShortcutsPaddings();
                                                                                                    applyShimmeringStateRecursive$default(this, this, null, true, 1, null);
                                                                                                    return;
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i)));
        throw null;
    }

    private final void applyNavShortcutsPaddings() {
        int i = tje.t(getContext()).widthPixels;
        int dimension = (int) (((i - (getContext().getResources().getDimension(ktg0.shortcuts_horizontal_paddings) * 2.0f)) / SCREEN_TO_SHORTCUT_RATIO) * CELL_SHORTCUT_TO_RATIO);
        int i2 = (i - (dimension * 4)) / 2;
        int i3 = (dimension * 18) / 84;
        int i4 = (dimension * 13) / 84;
        int i5 = (dimension * 23) / 84;
        u3s0 u3s0Var = this.binding;
        GoFrameLayout goFrameLayout = u3s0Var.b;
        GoFrameLayout goFrameLayout2 = u3s0Var.h;
        GoFrameLayout goFrameLayout3 = u3s0Var.e;
        GoFrameLayout goFrameLayout4 = u3s0Var.d;
        GoFrameLayout goFrameLayout5 = u3s0Var.c;
        ViewGroup.LayoutParams layoutParams = goFrameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(i2, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        goFrameLayout.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams2 = goFrameLayout5.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(i2, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        goFrameLayout5.setLayoutParams(marginLayoutParams2);
        ViewGroup.LayoutParams layoutParams3 = goFrameLayout4.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, i2, marginLayoutParams3.bottomMargin);
        goFrameLayout4.setLayoutParams(marginLayoutParams3);
        ViewGroup.LayoutParams layoutParams4 = goFrameLayout3.getLayoutParams();
        if (layoutParams4 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
        marginLayoutParams4.setMargins(i2, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
        goFrameLayout3.setLayoutParams(marginLayoutParams4);
        ViewGroup.LayoutParams layoutParams5 = goFrameLayout2.getLayoutParams();
        if (layoutParams5 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams5;
        marginLayoutParams5.setMargins(marginLayoutParams5.leftMargin, marginLayoutParams5.topMargin, i2, marginLayoutParams5.bottomMargin);
        goFrameLayout2.setLayoutParams(marginLayoutParams5);
        u3s0Var.b.setPadding(i3, i4, i3, i5);
        goFrameLayout5.setPadding(i3, i4, i3, i5);
        goFrameLayout4.setPadding(i3, i4, i3, i5);
        goFrameLayout3.setPadding(i3, i4, i3, i5);
        u3s0Var.f.setPadding(i3, i4, i3, i5);
        u3s0Var.g.setPadding(i3, i4, i3, i5);
        goFrameLayout2.setPadding(i3, i4, i3, i5);
    }

    private final void applyShimmeringStateRecursive(ViewGroup viewGroup, ViewGroup viewGroup2, boolean z) {
        h8 h8Var = new h8(3, viewGroup2);
        while (h8Var.hasNext()) {
            View view = (View) h8Var.next();
            if (view instanceof ShimmeringBar) {
                ((ShimmeringBar) view).setShimmering(z);
            }
            if (view instanceof ViewGroup) {
                applyShimmeringStateRecursive(viewGroup, (ViewGroup) view, z);
            }
        }
    }

    public static /* synthetic */ void applyShimmeringStateRecursive$default(ShimmerContentView shimmerContentView, ViewGroup viewGroup, ViewGroup viewGroup2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            viewGroup2 = shimmerContentView;
        }
        shimmerContentView.applyShimmeringStateRecursive(viewGroup, viewGroup2, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qtr0 qtr0Var = this.shimmerContentPresenter;
        str0 str0Var = new str0(this);
        qtr0Var.Bg(str0Var);
        tje.N(qtr0Var.Jg(), null, null, new ShimmerContentPresenter$attachView$1(qtr0Var, str0Var, null), 3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.shimmerContentPresenter.Cg();
        super.onDetachedFromWindow();
    }
}
