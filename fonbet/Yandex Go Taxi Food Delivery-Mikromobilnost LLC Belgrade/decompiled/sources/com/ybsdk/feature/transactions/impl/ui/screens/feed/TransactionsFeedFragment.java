package com.ybsdk.feature.transactions.impl.ui.screens.feed;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import defpackage.a10;
import defpackage.but0;
import defpackage.dcs;
import defpackage.ds31;
import defpackage.e7n;
import defpackage.eal;
import defpackage.ela1;
import defpackage.er31;
import defpackage.g861;
import defpackage.gf01;
import defpackage.gsx;
import defpackage.hc5;
import defpackage.hf01;
import defpackage.i3y;
import defpackage.if01;
import defpackage.iig;
import defpackage.ils0;
import defpackage.ip2;
import defpackage.jf01;
import defpackage.jls0;
import defpackage.kf01;
import defpackage.kla1;
import defpackage.kux0;
import defpackage.lf01;
import defpackage.lfx;
import defpackage.lum;
import defpackage.lwg0;
import defpackage.mf01;
import defpackage.mlf;
import defpackage.n2v0;
import defpackage.o70;
import defpackage.of01;
import defpackage.ola1;
import defpackage.pf01;
import defpackage.pxy0;
import defpackage.pzt0;
import defpackage.qas0;
import defpackage.rb6;
import defpackage.rr51;
import defpackage.sb6;
import defpackage.si91;
import defpackage.spl;
import defpackage.stz0;
import defpackage.tb6;
import defpackage.tcc;
import defpackage.tje;
import defpackage.w511;
import defpackage.xe01;
import defpackage.y8f;
import defpackage.ye01;
import defpackage.yr31;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 C2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001DB\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\r2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\rH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\r2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R!\u00106\u001a\b\u0012\u0004\u0012\u000201008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b>\u0010?R\u0016\u0010A\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B¨\u0006G²\u0006\f\u0010F\u001a\u00020E8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/ui/screens/feed/TransactionsFeedFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lg861;", "Lpf01;", "Lcom/ybsdk/feature/transactions/impl/ui/screens/feed/c;", "Lkf01;", "factoryOfViewModel", "Lsb6;", "bottomBarReporter", "<init>", "(Lkf01;Lsb6;)V", "Ljf01;", "viewState", "Lzy11;", "renderScreen", "(Lg861;Ljf01;)V", "", "canScrollUp", "()Z", "hasToolbar", "updateTopPaddings", "(Lg861;Z)V", "renderShimmer", "(Ljf01;)V", "createViewModel", "()Lcom/ybsdk/feature/transactions/impl/ui/screens/feed/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg861;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "()V", "render", "(Lpf01;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Lkf01;", "Lsb6;", "Le7n;", "Lgc5;", "adapter$delegate", "Li3y;", "getAdapter", "()Le7n;", "adapter", "Lgsx;", "lastItemScrollListener$delegate", "getLastItemScrollListener", "()Lgsx;", "lastItemScrollListener", "Lcom/ybsdk/feature/transactions/impl/ui/screens/feed/TransactionsFeedScreenParams;", "screenParams$delegate", "getScreenParams", "()Lcom/ybsdk/feature/transactions/impl/ui/screens/feed/TransactionsFeedScreenParams;", "screenParams", "isScrollable", "Z", "Companion", "ye01", "", "topPaddingPx", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransactionsFeedFragment extends BaseDivContextMvvmFragment<g861, pf01, c> {
    private static final float COLLAPSED_APP_BAR_ALPHA = 0.98f;
    private static final ye01 Companion = new ye01();
    private static final float EXPANDED_APP_BAR_ALPHA = 1.0f;

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private final sb6 bottomBarReporter;
    private final kf01 factoryOfViewModel;
    private boolean isScrollable;

    /* renamed from: lastItemScrollListener$delegate, reason: from kotlin metadata */
    private final i3y lastItemScrollListener;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;

    public TransactionsFeedFragment(kf01 kf01Var, sb6 sb6Var) {
        super(null, null, null, null, c.class, 15, null);
        this.factoryOfViewModel = kf01Var;
        this.bottomBarReporter = sb6Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.adapter = kotlin.a.b(lazyThreadSafetyMode, new xe01(this, 2));
        this.lastItemScrollListener = kotlin.a.b(lazyThreadSafetyMode, new xe01(this, 3));
        this.screenParams = dcs.c(this);
        this.isScrollable = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e7n adapter_delegate$lambda$2(TransactionsFeedFragment transactionsFeedFragment) {
        lum b;
        a10 a = hc5.a();
        o70 c = ola1.c(new but0(19, transactionsFeedFragment));
        lum d = ola1.d();
        lum d2 = kla1.d();
        lum j = si91.j();
        lum d3 = ela1.d();
        b = er31.b(new xe01(transactionsFeedFragment, 4), false);
        return new e7n(a, c, d, d2, j, d3, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean adapter_delegate$lambda$2$lambda$0(TransactionsFeedFragment transactionsFeedFragment, Uri uri, spl splVar) {
        return ((c) transactionsFeedFragment.getViewModel()).f0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 adapter_delegate$lambda$2$lambda$1(TransactionsFeedFragment transactionsFeedFragment) {
        ((c) transactionsFeedFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canScrollUp() {
        g861 g861Var = (g861) getBinding();
        return g861Var.e.canScrollVertically(-1) || com.ybsdk.core.utils.ext.view.b.f(g861Var.b);
    }

    private final e7n getAdapter() {
        return (e7n) this.adapter.getValue();
    }

    private final gsx getLastItemScrollListener() {
        return (gsx) this.lastItemScrollListener.getValue();
    }

    private final TransactionsFeedScreenParams getScreenParams() {
        return (TransactionsFeedScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gsx lastItemScrollListener_delegate$lambda$4(TransactionsFeedFragment transactionsFeedFragment) {
        return new gsx(new xe01(transactionsFeedFragment, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 lastItemScrollListener_delegate$lambda$4$lambda$3(TransactionsFeedFragment transactionsFeedFragment) {
        ((c) transactionsFeedFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$9$lambda$5(TransactionsFeedFragment transactionsFeedFragment, tb6 tb6Var) {
        ((c) transactionsFeedFragment.getViewModel()).e0(tb6Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9$lambda$6(g861 g861Var, AppBarLayout appBarLayout, int i) {
        int totalScrollRange = g861Var.b.getTotalScrollRange();
        g861Var.b.setAlpha(totalScrollRange != 0 && (-i) == totalScrollRange ? COLLAPSED_APP_BAR_ALPHA : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$9$lambda$7(TransactionsFeedFragment transactionsFeedFragment, CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        return transactionsFeedFragment.canScrollUp();
    }

    private final void renderScreen(g861 g861Var, jf01 jf01Var) {
        ErrorView errorView;
        boolean z;
        int i;
        renderShimmer(jf01Var);
        CoordinatorLayout coordinatorLayout = g861Var.c;
        YbDivView ybDivView = g861Var.g;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = g861Var.m;
        YbDivView ybDivView2 = g861Var.f;
        ErrorView errorView2 = g861Var.d;
        ToolbarView toolbarView = g861Var.n;
        boolean z2 = jf01Var instanceof gf01;
        coordinatorLayout.setVisibility(z2 ? 0 : 8);
        boolean z3 = jf01Var instanceof hf01;
        if (z3) {
            toolbarView.setVisibility(8);
            errorView2.render(((hf01) jf01Var).a());
            errorView = errorView2;
            z = z2;
            i = 8;
        } else if (z2) {
            gf01 gf01Var = (gf01) jf01Var;
            updateTopPaddings(g861Var, gf01Var.d() != null);
            toolbarView.setVisibility(gf01Var.d() != null ? 0 : 8);
            stz0 d = gf01Var.d();
            if (d != null) {
                toolbarView.render(d);
            }
            ybDivView.setVisibility(gf01Var.b() != null ? 0 : 8);
            rr51 b = gf01Var.b();
            if (b != null) {
                YbDivView.setData$default(ybDivView, b, null, null, false, 14, null);
            }
            ybDivView2.setVisibility(gf01Var.a() != null ? 0 : 8);
            errorView = errorView2;
            rr51 a = gf01Var.a();
            if (a != null) {
                i = 8;
                z = z2;
                YbDivView.setData$default(ybDivView2, a, null, null, false, 14, null);
            } else {
                z = z2;
                i = 8;
            }
            ybDivView2.post(new kux0(20, g861Var));
            getAdapter().g(gf01Var.c().getItems());
            customSwipeRefreshLayout.setEnabled(gf01Var.c().a());
            this.isScrollable = gf01Var.c().a();
        } else {
            errorView = errorView2;
            z = z2;
            i = 8;
            if (!(jf01Var instanceof if01)) {
                w511.b();
                return;
            }
            toolbarView.setVisibility(8);
        }
        customSwipeRefreshLayout.setVisibility(z ? 0 : i);
        errorView.setVisibility(z3 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renderScreen$lambda$15(g861 g861Var) {
        YbDivView ybDivView = g861Var.f;
        ybDivView.setMinimumHeight(ybDivView.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderShimmer(jf01 viewState) {
        LinearLayout linearLayout = ((g861) getBinding()).k;
        boolean z = viewState instanceof if01;
        if01 if01Var = z ? (if01) viewState : null;
        int i = 8;
        linearLayout.setVisibility((if01Var == null || !if01Var.c()) ? 8 : 0);
        if01 if01Var2 = z ? (if01) viewState : null;
        boolean z2 = if01Var2 != null && if01Var2.b();
        ((g861) getBinding()).i.setVisibility(z2 ? 0 : 8);
        if (z2) {
            DivSkeletonsView divSkeletonsView = ((g861) getBinding()).i;
            if01 if01Var3 = z ? (if01) viewState : null;
            divSkeletonsView.render(new eal(ils0.b, if01Var3 != null ? if01Var3.d() : false, null, 4));
        }
        if01 if01Var4 = z ? (if01) viewState : null;
        boolean z3 = if01Var4 != null && if01Var4.a();
        ((g861) getBinding()).j.setVisibility(z3 ? 0 : 8);
        if (z3) {
            ((g861) getBinding()).j.render(new eal(jls0.b, false, null, 6));
        }
        LinearLayoutCompat o = ((g861) getBinding()).l.o();
        if01 if01Var5 = z ? (if01) viewState : null;
        o.setVisibility((if01Var5 == null || !if01Var5.f()) ? 8 : 0);
        LinearLayoutCompat o2 = ((g861) getBinding()).h.o();
        if01 if01Var6 = z ? (if01) viewState : null;
        if (if01Var6 != null && if01Var6.e()) {
            i = 0;
        }
        o2.setVisibility(i);
    }

    private final void updateTopPaddings(g861 g861Var, boolean z) {
        i3y a = kotlin.a.a(new xe01(this, 1));
        YbDivView ybDivView = g861Var.g;
        int i = 0;
        ybDivView.setPadding(ybDivView.getPaddingLeft(), (!getScreenParams().getShowTabbar() || z) ? 0 : updateTopPaddings$lambda$18(a), ybDivView.getPaddingRight(), ybDivView.getPaddingBottom());
        CoordinatorLayout coordinatorLayout = g861Var.c;
        if (!getScreenParams().getShowTabbar() && !z) {
            i = updateTopPaddings$lambda$18(a);
        }
        coordinatorLayout.setPadding(coordinatorLayout.getPaddingLeft(), i, coordinatorLayout.getPaddingRight(), coordinatorLayout.getPaddingBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int updateTopPaddings$lambda$17(TransactionsFeedFragment transactionsFeedFragment) {
        return transactionsFeedFragment.getResources().getDimensionPixelOffset(lwg0.ybsdk_transactions_feed_top_padding);
    }

    private static final int updateTopPaddings$lambda$18(i3y i3yVar) {
        return ((Number) i3yVar.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof lf01) {
            ((g861) getBinding()).m.setRefreshing(((lf01) sideEffect).a());
        } else if (sideEffect instanceof mf01) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((mf01) sideEffect).a(), null, 12);
        } else {
            super.consumeSideEffect(sideEffect);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((of01) this.factoryOfViewModel).a(getScreenParams());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((g861) getBinding()).e.removeOnScrollListener(getLastItemScrollListener());
        ((g861) getBinding()).e.setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r6v1, types: [uc5] */
    /* JADX WARN: Type inference failed for: r8v9, types: [uc5] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setBackButtonVisible(!getScreenParams().getShowTabbar());
        g861 g861Var = (g861) getBinding();
        BottomBarNavigation bottomBarNavigation = g861Var.o;
        ErrorView errorView = g861Var.d;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = g861Var.m;
        RecyclerView recyclerView = g861Var.e;
        bottomBarNavigation.setVisibility(getScreenParams().getShowTabbar() ? 0 : 8);
        g861Var.o.setOnTabClickListener(new pxy0(21, this));
        g861Var.b.addOnOffsetChangedListener((ip2) new iig(3, g861Var));
        final c cVar = (c) getViewModel();
        customSwipeRefreshLayout.setOnRefreshListener(new mlf() { // from class: com.ybsdk.feature.transactions.impl.ui.screens.feed.a
            @Override // defpackage.mlf
            public final void onRefresh() {
                c cVar2 = c.this;
                pzt0 pzt0Var = cVar2.I;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                pzt0 pzt0Var2 = cVar2.J;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                cVar2.K = false;
                tje.N(ds31.a(cVar2), null, null, new TransactionsFeedViewModel$onRefresh$1(cVar2, null), 3);
            }
        });
        customSwipeRefreshLayout.setOnChildScrollUpCallback(new n2v0(25, this));
        g861Var.f.setActionHandler(new TransactionsFeedFragment$onViewCreated$1$5(getViewModel()));
        final Context requireContext = requireContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext) { // from class: com.ybsdk.feature.transactions.impl.ui.screens.feed.TransactionsFeedFragment$onViewCreated$1$6
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
            public final boolean J() {
                boolean z;
                z = TransactionsFeedFragment.this.isScrollable;
                if (z) {
                    return super.J();
                }
                return false;
            }
        };
        linearLayoutManager.Q = false;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(getAdapter());
        recyclerView.addOnScrollListener(getLastItemScrollListener());
        errorView.setPrimaryButtonOnClickListener(new TransactionsFeedFragment$onViewCreated$1$8(getViewModel()));
        errorView.setSecondaryButtonClickListener(new TransactionsFeedFragment$onViewCreated$1$9(getViewModel()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(pf01 viewState) {
        g861 g861Var = (g861) getBinding();
        rb6 a = viewState.a();
        jf01 b = viewState.b();
        g861Var.o.render(a);
        List a2 = a.a();
        ArrayList arrayList = new ArrayList(tcc.n(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((tb6) it.next()).a());
        }
        this.bottomBarReporter.c(arrayList.toString());
        renderScreen(g861Var, b);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public g861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return g861.o(inflater, container);
    }
}
