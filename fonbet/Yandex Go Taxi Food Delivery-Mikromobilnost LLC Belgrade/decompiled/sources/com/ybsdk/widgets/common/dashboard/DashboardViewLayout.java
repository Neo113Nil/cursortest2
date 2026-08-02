package com.ybsdk.widgets.common.dashboard;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.behaviors.BlockableAppBarLayoutBehavior;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import defpackage.akx;
import defpackage.b161;
import defpackage.bkx;
import defpackage.cma1;
import defpackage.fch0;
import defpackage.fzh0;
import defpackage.ip2;
import defpackage.jl40;
import defpackage.lcb1;
import defpackage.lwg0;
import defpackage.mlf;
import defpackage.njb;
import defpackage.ny61;
import defpackage.poh0;
import defpackage.sls;
import defpackage.ymg;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 A2\u00020\u0001:\u0001BB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\rJ\u0019\u0010#\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J#\u0010)\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020+¢\u0006\u0004\b,\u0010-R\u0017\u0010/\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00104\u001a\u0002038\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u00109\u001a\u0002088\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010?\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0011\u0010@\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b@\u0010 ¨\u0006C"}, d2 = {"Lcom/ybsdk/widgets/common/dashboard/DashboardViewLayout;", "Lcom/ybsdk/widgets/common/swiperefresh/CustomSwipeRefreshLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "Lzy11;", "setHeaderHeight", "(II)V", "collapsingBalanceContainerHeight", "toClosestEven", "(I)I", "", "lock", "lockAppBar", "(Z)V", "Lkotlin/Function0;", "listener", "setBottomButtonClickListener", "(Lsls;)V", "Lcom/ybsdk/widgets/common/YbButtonView$a;", ClidProvider.STATE, "showBottomYbButtonView", "(Lcom/ybsdk/widgets/common/YbButtonView$a;)V", "hideBottomYbButtonView", "()V", "canScrollUp", "()Z", "onMeasure", "Lmlf;", "setOnRefreshListener", "(Lmlf;)V", "Landroid/view/View;", "child", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "Lip2;", "addOnOffsetChangedListener", "(Lip2;)V", "Lb161;", "binding", "Lb161;", "getBinding", "()Lb161;", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "getRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "balanceWithFooterContainer", "Landroid/view/View;", "midFooterContainer", "isAppBarIsFullyExpanded", "Companion", "ymg", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DashboardViewLayout extends CustomSwipeRefreshLayout {

    @Deprecated
    public static final float BALANCE_HEIGHT_SCREEN_PERCENT = 0.25f;
    private static final ymg Companion = new ymg();
    private final AppBarLayout appBarLayout;
    private View balanceWithFooterContainer;
    private final b161 binding;
    private View midFooterContainer;
    private final RecyclerView recycler;

    public DashboardViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View inflate = LayoutInflater.from(context).inflate(poh0.ybsdk_dashboard_view, (ViewGroup) this, false);
        addView(inflate);
        int i = fch0.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) cma1.O(i, inflate);
        if (appBarLayout != null) {
            i = fch0.collapsingToolbar;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) cma1.O(i, inflate);
            if (collapsingToolbarLayout != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate;
                i = fch0.dashboard_bottom_button;
                YbButtonView ybButtonView = (YbButtonView) cma1.O(i, inflate);
                if (ybButtonView != null) {
                    i = fch0.dashboardViewToolbar;
                    Toolbar toolbar = (Toolbar) cma1.O(i, inflate);
                    if (toolbar != null) {
                        i = fch0.recycler;
                        RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                        if (recyclerView != null) {
                            this.binding = new b161(coordinatorLayout, appBarLayout, collapsingToolbarLayout, ybButtonView, toolbar, recyclerView);
                            this.appBarLayout = appBarLayout;
                            this.recycler = recyclerView;
                            setEnabled(false);
                            lockAppBar(false);
                            return;
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void setHeaderHeight(int widthMeasureSpec, int heightMeasureSpec) {
        bkx bkxVar;
        View view;
        View view2;
        Activity activity;
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        Context context = getContext();
        if (context != null) {
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
            if (activity != null) {
                bkxVar = lcb1.c(activity);
                akx akxVar = !(bkxVar instanceof akx) ? (akx) bkxVar : null;
                int i = akxVar == null ? akxVar.a : 0;
                view = this.midFooterContainer;
                if (view != null) {
                    measureChild(this.balanceWithFooterContainer, widthMeasureSpec, heightMeasureSpec);
                    int measuredHeight = view.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                    r3 = (marginLayoutParams != null ? marginLayoutParams.topMargin : 0) + measuredHeight;
                }
                float h = ((size + i) * 0.25f) + b.h(lwg0.ybsdk_toolbar_height, this) + r3;
                view2 = this.balanceWithFooterContainer;
                if (view2 == null) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 == null) {
                        ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return;
                    } else {
                        layoutParams2.height = toClosestEven((int) h);
                        view2.setLayoutParams(layoutParams2);
                        return;
                    }
                }
                return;
            }
        }
        bkxVar = null;
        if (!(bkxVar instanceof akx)) {
        }
        if (akxVar == null) {
        }
        view = this.midFooterContainer;
        if (view != null) {
        }
        float h2 = ((size + i) * 0.25f) + b.h(lwg0.ybsdk_toolbar_height, this) + r3;
        view2 = this.balanceWithFooterContainer;
        if (view2 == null) {
        }
    }

    private final int toClosestEven(int collapsingBalanceContainerHeight) {
        return collapsingBalanceContainerHeight % 2 == 0 ? collapsingBalanceContainerHeight : collapsingBalanceContainerHeight - 1;
    }

    public final void addOnOffsetChangedListener(ip2 listener) {
        b.s(this.binding.b, listener);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (this.binding == null) {
            super.addView(child, params);
            return;
        }
        if (child != null) {
            if (jl40.l(child.getTag(), child.getContext().getString(fzh0.ybsdk_tag_balance_view_container)) || (child instanceof DashboardCollapsingBalanceView)) {
                this.balanceWithFooterContainer = child;
                this.binding.c.addView(child, params);
                this.midFooterContainer = child.findViewWithTag(getContext().getString(fzh0.ybsdk_tag_dashboard_middle_container_footer));
            } else {
                boolean l = jl40.l(child.getTag(), getContext().getString(fzh0.ybsdk_tag_dashboard_toolbar));
                b161 b161Var = this.binding;
                if (l) {
                    b161Var.e.addView(child, params);
                } else {
                    b161Var.c.addView(child, params);
                }
            }
        }
    }

    public final boolean canScrollUp() {
        return b.f(this.binding.f) || b.f(this.binding.b);
    }

    public final AppBarLayout getAppBarLayout() {
        return this.appBarLayout;
    }

    public final b161 getBinding() {
        return this.binding;
    }

    public final RecyclerView getRecycler() {
        return this.recycler;
    }

    public final void hideBottomYbButtonView() {
        this.binding.d.setVisibility(4);
        RecyclerView recyclerView = this.recycler;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), 0);
    }

    public final boolean isAppBarIsFullyExpanded() {
        return !b.f(this.binding.b);
    }

    public final void lockAppBar(boolean lock) {
        ViewGroup.LayoutParams layoutParams = this.binding.b.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        Object behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
        BlockableAppBarLayoutBehavior blockableAppBarLayoutBehavior = behavior instanceof BlockableAppBarLayoutBehavior ? (BlockableAppBarLayoutBehavior) behavior : null;
        if (blockableAppBarLayoutBehavior != null) {
            blockableAppBarLayoutBehavior.I = !lock;
        }
    }

    @Override // com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setHeaderHeight(widthMeasureSpec, heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public final void setBottomButtonClickListener(sls listener) {
        this.binding.d.setOnClickListener(new njb(3, listener));
    }

    @Override // com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout
    public void setOnRefreshListener(mlf listener) {
        setEnabled(true);
        super.setOnRefreshListener(listener);
    }

    public final void showBottomYbButtonView(YbButtonView.a state) {
        b161 b161Var = this.binding;
        b161Var.d.setVisibility(0);
        int h = b.h(lwg0.ybsdk_dashboard_footer_button_vertical_margin, this) * 2;
        YbButtonView ybButtonView = b161Var.d;
        int height = ybButtonView.getHeight() + h;
        int h2 = b.h(lwg0.ybsdk_dashboard_recycler_padding_top, this);
        RecyclerView recyclerView = b161Var.f;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), h2, recyclerView.getPaddingRight(), height);
        ybButtonView.render(state);
    }

    public /* synthetic */ DashboardViewLayout(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardViewLayout(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }
}
