package com.ybsdk.feature.cashback.impl.screens.dashboard;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.core.mvp.BaseMvvmFragment;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.cashback.impl.screens.dashboard.CashbackDashboardFragment;
import com.ybsdk.widgets.common.DashboardBalanceTextView;
import com.ybsdk.widgets.common.DashboardDrawableTextView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.dashboard.DashboardViewLayout;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import defpackage.a39;
import defpackage.d39;
import defpackage.dcs;
import defpackage.dn7;
import defpackage.e48;
import defpackage.f39;
import defpackage.g10;
import defpackage.g39;
import defpackage.h39;
import defpackage.ip2;
import defpackage.j1;
import defpackage.ju8;
import defpackage.kp50;
import defpackage.l39;
import defpackage.lfx;
import defpackage.lwg0;
import defpackage.n061;
import defpackage.rje;
import defpackage.sls;
import defpackage.sm91;
import defpackage.uns0;
import defpackage.vvg0;
import defpackage.y8f;
import defpackage.yep0;
import defpackage.yr31;
import defpackage.zep0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 :2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002;<B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJG\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00172\u0006\u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00108\u001a\u0010\u0012\f\u0012\n 7*\u0004\u0018\u00010606058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/ybsdk/feature/cashback/impl/screens/dashboard/CashbackDashboardFragment;", "Lcom/ybsdk/core/mvp/BaseMvvmFragment;", "Ln061;", "Lh39;", "Lcom/ybsdk/feature/cashback/impl/screens/dashboard/a;", "Luns0;", "Lf39;", "viewModelProvider", "<init>", "(Lf39;)V", "Lcom/ybsdk/widgets/common/DashboardDrawableTextView;", "view", "", "expandedPercentage", "totalScrollRange", "", "verticalOffset", "collapsedBalanceX", "collapsedTitleTopMargin", "collapsedTitleTextSize", "Lzy11;", "updateSubtitleTranslationAndScale", "(Lcom/ybsdk/widgets/common/DashboardDrawableTextView;FFIIIF)V", "", "canScrollUp", "()Z", "createViewModel", "()Lcom/ybsdk/feature/cashback/impl/screens/dashboard/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ln061;", "Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lh39;)V", "positionX", "positionY", "canSlideFrom", "(FF)Z", "Lf39;", "Lg10;", "delegateHelper", "Lg10;", "Landroid/graphics/Rect;", "toolbarPosition", "Landroid/graphics/Rect;", "Ll39;", "Lx00;", "kotlin.jvm.PlatformType", "decorator", "Ll39;", "Companion", "d39", "a39", "feature-cashback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CashbackDashboardFragment extends BaseMvvmFragment<n061, h39, a> implements uns0 {
    public static final a39 Companion = new a39();
    private static final float HEADER_GONE_THRESHOLD_PERCENT = 75.0f;
    public static final String NEED_TO_RELOAD_KEY = "NEED_TO_RELOAD_KEY";
    private static final float PERCENT_100 = 100.0f;
    public static final String REQUEST_SELECTOR = "request_key_cashback_selector";
    private final l39 decorator;
    private final g10 delegateHelper;
    private final Rect toolbarPosition;
    private final f39 viewModelProvider;

    public CashbackDashboardFragment(f39 f39Var) {
        super(Boolean.TRUE, null, null, null, a.class, 14, null);
        this.viewModelProvider = f39Var;
        g10 g10Var = new g10(new j1(5, this));
        this.delegateHelper = g10Var;
        this.toolbarPosition = new Rect();
        this.decorator = new l39(g10Var.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canScrollUp() {
        return ((n061) getBinding()).e.canScrollUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$0(n061 n061Var) {
        n061Var.e.getAppBarLayout().setExpanded(true, false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$1(CashbackDashboardFragment cashbackDashboardFragment) {
        cashbackDashboardFragment.getViewModel().b0(false);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$3$lambda$2(CashbackDashboardFragment cashbackDashboardFragment) {
        cashbackDashboardFragment.getViewModel().d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$4(CashbackDashboardFragment cashbackDashboardFragment, int i, int i2, float f, AppBarLayout appBarLayout, int i3) {
        float totalScrollRange = appBarLayout.getTotalScrollRange();
        float abs = 100.0f - ((100.0f / totalScrollRange) * Math.abs(i3));
        cashbackDashboardFragment.updateSubtitleTranslationAndScale(((n061) cashbackDashboardFragment.getBinding()).d, abs, totalScrollRange, i3, i, i2, f);
        ((n061) cashbackDashboardFragment.getBinding()).c.setAlpha(Math.max(abs - HEADER_GONE_THRESHOLD_PERCENT, 0.0f) / 25.0f);
        ((n061) cashbackDashboardFragment.getBinding()).b.updateAnimationByPercent(totalScrollRange, 100.0f - abs, i3, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$5(CashbackDashboardFragment cashbackDashboardFragment, String str, Bundle bundle) {
        cashbackDashboardFragment.getViewModel().b0(bundle.getBoolean(NEED_TO_RELOAD_KEY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void render$lambda$9$lambda$8(CashbackDashboardFragment cashbackDashboardFragment) {
        if (b.f(((n061) cashbackDashboardFragment.getBinding()).e.getAppBarLayout())) {
            return;
        }
        ((n061) cashbackDashboardFragment.getBinding()).e.getRecycler().scrollToPosition(0);
    }

    private final void updateSubtitleTranslationAndScale(DashboardDrawableTextView view, float expandedPercentage, float totalScrollRange, int verticalOffset, int collapsedBalanceX, int collapsedTitleTopMargin, float collapsedTitleTextSize) {
        float f = 100.0f - expandedPercentage;
        view.setTranslationX((collapsedBalanceX / 100.0f) * f);
        view.setTranslationY((((totalScrollRange - view.getTop()) + collapsedTitleTopMargin) / 100.0f) * f);
        sm91.a(view, view.getBinding().c, verticalOffset, totalScrollRange, kp50.w(collapsedTitleTextSize));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uns0
    public boolean canSlideFrom(float positionX, float positionY) {
        if (canScrollUp()) {
            return false;
        }
        ((n061) getBinding()).e.getBinding().e.getHitRect(this.toolbarPosition);
        ((n061) getBinding()).o().offsetDescendantRectToMyCoords(((n061) getBinding()).e.getBinding().e, this.toolbarPosition);
        return !(positionY <= ((float) this.toolbarPosition.bottom));
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((g39) this.viewModelProvider).a((CashbackDashboardScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public n061 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        n061 p = n061.p(inflater, container);
        DashboardViewLayout dashboardViewLayout = p.e;
        dashboardViewLayout.getRecycler().setLayoutManager(new d39(requireContext(), new ju8(7, p)));
        dashboardViewLayout.getRecycler().setAdapter(this.delegateHelper.a());
        dashboardViewLayout.getRecycler().addItemDecoration(this.decorator);
        ErrorView errorView = p.f;
        final int i = 0;
        errorView.setPrimaryButtonOnClickListener(new sls(this) { // from class: y29
            public final /* synthetic */ CashbackDashboardFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$3$lambda$1;
                zy11 viewBinding$lambda$3$lambda$2;
                int i2 = i;
                CashbackDashboardFragment cashbackDashboardFragment = this.b;
                switch (i2) {
                    case 0:
                        viewBinding$lambda$3$lambda$1 = CashbackDashboardFragment.getViewBinding$lambda$3$lambda$1(cashbackDashboardFragment);
                        return viewBinding$lambda$3$lambda$1;
                    default:
                        viewBinding$lambda$3$lambda$2 = CashbackDashboardFragment.getViewBinding$lambda$3$lambda$2(cashbackDashboardFragment);
                        return viewBinding$lambda$3$lambda$2;
                }
            }
        });
        final int i2 = 1;
        errorView.setSecondaryButtonClickListener(new sls(this) { // from class: y29
            public final /* synthetic */ CashbackDashboardFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                zy11 viewBinding$lambda$3$lambda$1;
                zy11 viewBinding$lambda$3$lambda$2;
                int i22 = i2;
                CashbackDashboardFragment cashbackDashboardFragment = this.b;
                switch (i22) {
                    case 0:
                        viewBinding$lambda$3$lambda$1 = CashbackDashboardFragment.getViewBinding$lambda$3$lambda$1(cashbackDashboardFragment);
                        return viewBinding$lambda$3$lambda$1;
                    default:
                        viewBinding$lambda$3$lambda$2 = CashbackDashboardFragment.getViewBinding$lambda$3$lambda$2(cashbackDashboardFragment);
                        return viewBinding$lambda$3$lambda$2;
                }
            }
        });
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        final int i;
        super.onViewCreated(view, savedInstanceState);
        if (getIsBackButtonVisible()) {
            i = rje.d(lwg0.ybsdk_dashboard_collapsed_balance_margin, requireContext());
        } else {
            i = 0;
        }
        final int d = rje.d(lwg0.ybsdk_dashboard_collapsed_plus_top_margin, requireContext());
        final float d2 = rje.d(vvg0.ybsdk_textsize_body3, requireContext());
        ((n061) getBinding()).e.addOnOffsetChangedListener(new ip2() { // from class: z29
            @Override // defpackage.gp2
            public final void a(AppBarLayout appBarLayout, int i2) {
                CashbackDashboardFragment.onViewCreated$lambda$4(CashbackDashboardFragment.this, i, d, d2, appBarLayout, i2);
            }
        });
        getParentFragmentManager().m0(REQUEST_SELECTOR, this, new e48(12, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(h39 viewState) {
        n061 n061Var = (n061) getBinding();
        DashboardBalanceTextView dashboardBalanceTextView = n061Var.b;
        ShimmerFrameLayout shimmerFrameLayout = n061Var.g;
        dashboardBalanceTextView.setText(d.a(requireContext(), viewState.a()));
        n061Var.c.setText(d.a(requireContext(), viewState.d()));
        DashboardDrawableTextView dashboardDrawableTextView = n061Var.d;
        dashboardDrawableTextView.setText(viewState.c());
        if (viewState.b() != null) {
            dashboardDrawableTextView.setImage(viewState.b());
        }
        this.delegateHelper.a().h(viewState.f(), new dn7(18, this));
        shimmerFrameLayout.setVisibility(viewState.g() instanceof yep0 ? 0 : 8);
        n061Var.e.setVisibility(viewState.g() instanceof zep0 ? 0 : 8);
        n061Var.f.render(viewState.e());
        if (viewState.g() instanceof yep0) {
            shimmerFrameLayout.startShimmer();
        } else {
            shimmerFrameLayout.stopShimmer();
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
