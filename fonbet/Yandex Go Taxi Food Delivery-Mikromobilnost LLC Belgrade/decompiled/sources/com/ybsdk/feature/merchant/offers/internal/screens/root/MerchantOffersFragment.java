package com.ybsdk.feature.merchant.offers.internal.screens.root;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import com.ybsdk.feature.merchant.offers.internal.view.MerchantOffersBannerView;
import com.ybsdk.feature.merchant.offers.internal.view.MerchantOffersFloatingActionButtonView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.SkeletonView;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import defpackage.a10;
import defpackage.bns;
import defpackage.bp10;
import defpackage.bv4;
import defpackage.cp10;
import defpackage.dp10;
import defpackage.ds31;
import defpackage.dwg0;
import defpackage.e7n;
import defpackage.eal;
import defpackage.ejg;
import defpackage.ep10;
import defpackage.er31;
import defpackage.fbz;
import defpackage.fp10;
import defpackage.g761;
import defpackage.gk1;
import defpackage.gp10;
import defpackage.gp41;
import defpackage.gsx;
import defpackage.gzk;
import defpackage.hc5;
import defpackage.hp10;
import defpackage.i3y;
import defpackage.iig;
import defpackage.is8;
import defpackage.jt31;
import defpackage.k200;
import defpackage.lfx;
import defpackage.lia1;
import defpackage.lum;
import defpackage.mlf;
import defpackage.n751;
import defpackage.np10;
import defpackage.nq10;
import defpackage.ny61;
import defpackage.nzm;
import defpackage.o70;
import defpackage.ola1;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qas0;
import defpackage.qw51;
import defpackage.rje;
import defpackage.rw51;
import defpackage.sb6;
import defpackage.scc;
import defpackage.si91;
import defpackage.spl;
import defpackage.tb6;
import defpackage.tcc;
import defpackage.tif0;
import defpackage.tje;
import defpackage.tks0;
import defpackage.tp10;
import defpackage.u1w;
import defpackage.uhx;
import defpackage.ung0;
import defpackage.uo10;
import defpackage.up10;
import defpackage.uq10;
import defpackage.vp10;
import defpackage.vq10;
import defpackage.w511;
import defpackage.wo10;
import defpackage.wp10;
import defpackage.wq10;
import defpackage.xq10;
import defpackage.y6i0;
import defpackage.y8f;
import defpackage.yq10;
import defpackage.yr31;
import defpackage.yvf0;
import defpackage.z1x0;
import defpackage.zgv;
import defpackage.zmg;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0004Sbhn\b\u0000\u0018\u0000 \u0085\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0002\u0086\u0001B/\b\u0007\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010 J!\u0010(\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020*2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010 J\u0017\u00100\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0003H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u001c2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u001cH\u0002¢\u0006\u0004\b6\u0010 J\u000f\u00107\u001a\u00020\u000fH\u0002¢\u0006\u0004\b7\u0010\u0011J\u0017\u00109\u001a\u00020\u001c2\u0006\u0010/\u001a\u000208H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u001cH\u0002¢\u0006\u0004\b?\u0010 J\u000f\u0010@\u001a\u00020\u001cH\u0002¢\u0006\u0004\b@\u0010 J\u001f\u0010D\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020;H\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010I\u001a\u00020\u001c2\u0006\u0010F\u001a\u00020$2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u001cH\u0002¢\u0006\u0004\bK\u0010 J!\u0010M\u001a\u00020\u001c2\u0006\u0010H\u001a\u00020;2\b\b\u0002\u0010L\u001a\u00020GH\u0002¢\u0006\u0004\bM\u0010NR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010OR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR!\u0010a\u001a\b\u0012\u0004\u0012\u00020]0\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b^\u0010X\u001a\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010l\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010o\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010w\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010{\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010}\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010|R\u0015\u0010\u007f\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/ybsdk/feature/merchant/offers/internal/screens/root/MerchantOffersFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lg761;", "Lxq10;", "Lcom/ybsdk/feature/merchant/offers/internal/screens/root/b;", "Lyvf0;", "viewModelProvider", "Lgzk;", "offerListReporter", "Lsb6;", "bottomBarReporter", "Lyq10;", "merchantOffersVisualParamsProvider", "<init>", "(Lyvf0;Lgzk;Lsb6;Lyq10;)V", "", "fitsSystemWindow", "()Z", "createViewModel", "()Lcom/ybsdk/feature/merchant/offers/internal/screens/root/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg761;", "Landroid/content/Context;", "context", "Lzy11;", "onAttach", "(Landroid/content/Context;)V", "onDetach", "()V", "onResume", "onPause", "onStop", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "onDestroyView", "viewState", "render", "(Lxq10;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "scrollUp", "canScrollUp", "Ltp10;", "setupBanners", "(Ltp10;)V", "", "currentItemProgress", "updateStoryProgressBar", "(I)V", "startPagerTimer", "onProgressBarFinished", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "verticalOffset", "onAppBarOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", Constants.KEY_PAGE, "", "position", "transformBannerPage", "(Landroid/view/View;F)V", "updateToolbarAlpha", "progress", "changeVerticalScrollProgressForBanner", "(IF)V", "Lyvf0;", "Lgzk;", "Lsb6;", "Lyq10;", "fp10", "bannerLongPressListener", "Lfp10;", "Lwo10;", "bannersAdapter$delegate", "Li3y;", "getBannersAdapter", "()Lwo10;", "bannersAdapter", "Le7n;", "Lgc5;", "recyclerAdapter$delegate", "getRecyclerAdapter", "()Le7n;", "recyclerAdapter", "ep10", "bannerChangedCallback", "Lep10;", "Lgsx;", "lastItemScrollListener", "Lgsx;", "gp10", "checkVisibleOffersListener", "Lgp10;", "Landroid/view/View$OnScrollChangeListener;", "onScrollChangeListener", "Landroid/view/View$OnScrollChangeListener;", "hp10", "expandAppBarListener", "Lhp10;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "accessibilityStateChangedListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Ltif0;", "timer", "Ltif0;", "currentContentViewState", "Ltp10;", "currentScrollProgress", "F", "shouldExpandAppBarOnIdleScrolling", "Z", "isAccessibilityModeEnabled", "Landroid/os/Handler;", "timerHandler", "Landroid/os/Handler;", "Landroidx/recyclerview/widget/RecyclerView;", "getPagerRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "pagerRecyclerView", "Companion", "dp10", "feature-merchant-offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MerchantOffersFragment extends BaseDivContextMvvmFragment<g761, xq10, b> {
    private static final dp10 Companion = new dp10();

    @Deprecated
    public static final int MAX_RECYCLER_POSITION_FOR_SMOOTH_SCROLLING = 10;

    @Deprecated
    public static final float MAX_SCROLL_PROGRESS = 1.0f;

    @Deprecated
    public static final float SHOW_TOOLBAR_THRESHOLD = 0.5f;
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangedListener;
    private final ep10 bannerChangedCallback;
    private final fp10 bannerLongPressListener;

    /* renamed from: bannersAdapter$delegate, reason: from kotlin metadata */
    private final i3y bannersAdapter;
    private final sb6 bottomBarReporter;
    private final gp10 checkVisibleOffersListener;
    private tp10 currentContentViewState;
    private float currentScrollProgress;
    private final hp10 expandAppBarListener;
    private boolean isAccessibilityModeEnabled;
    private final gsx lastItemScrollListener;
    private final yq10 merchantOffersVisualParamsProvider;
    private final gzk offerListReporter;
    private final View.OnScrollChangeListener onScrollChangeListener;

    /* renamed from: recyclerAdapter$delegate, reason: from kotlin metadata */
    private final i3y recyclerAdapter;
    private boolean shouldExpandAppBarOnIdleScrolling;
    private tif0 timer;
    private final Handler timerHandler;
    private final yvf0 viewModelProvider;

    public MerchantOffersFragment(yvf0 yvf0Var, gzk gzkVar, sb6 sb6Var, yq10 yq10Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        this.viewModelProvider = yvf0Var;
        this.offerListReporter = gzkVar;
        this.bottomBarReporter = sb6Var;
        this.merchantOffersVisualParamsProvider = yq10Var;
        this.bannerLongPressListener = new fp10(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.bannersAdapter = kotlin.a.b(lazyThreadSafetyMode, new bp10(this, 1));
        this.recyclerAdapter = kotlin.a.b(lazyThreadSafetyMode, new bp10(this, 2));
        this.bannerChangedCallback = new ep10(this);
        int i = 3;
        this.lastItemScrollListener = new gsx(new bp10(this, i));
        this.checkVisibleOffersListener = new gp10(this);
        this.onScrollChangeListener = new gk1(i, this);
        this.expandAppBarListener = new hp10(this);
        this.accessibilityStateChangedListener = new cp10(0, this);
        this.timerHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ g761 access$getBinding(MerchantOffersFragment merchantOffersFragment) {
        return (g761) merchantOffersFragment.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ b access$getViewModel(MerchantOffersFragment merchantOffersFragment) {
        return (b) merchantOffersFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r3v0, types: [uc5] */
    public static final wo10 bannersAdapter_delegate$lambda$0(MerchantOffersFragment merchantOffersFragment) {
        return new wo10(new MerchantOffersFragment$bannersAdapter$2$1(merchantOffersFragment.getViewModel()), new MerchantOffersFragment$bannersAdapter$2$2(merchantOffersFragment.getViewModel()), merchantOffersFragment.bannerLongPressListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canScrollUp() {
        g761 g761Var = (g761) getBinding();
        return g761Var.i.canScrollVertically(-1) || com.ybsdk.core.utils.ext.view.b.f(g761Var.c);
    }

    private final void changeVerticalScrollProgressForBanner(int position, float progress) {
        x0 findViewHolderForAdapterPosition = getPagerRecyclerView().findViewHolderForAdapterPosition(position);
        KeyEvent.Callback callback = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.a : null;
        MerchantOffersBannerView merchantOffersBannerView = callback instanceof MerchantOffersBannerView ? (MerchantOffersBannerView) callback : null;
        if (merchantOffersBannerView != null) {
            merchantOffersBannerView.setVerticalScrollProgress(progress);
        }
    }

    public static /* synthetic */ void changeVerticalScrollProgressForBanner$default(MerchantOffersFragment merchantOffersFragment, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = merchantOffersFragment.currentScrollProgress;
        }
        merchantOffersFragment.changeVerticalScrollProgressForBanner(i, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wo10 getBannersAdapter() {
        return (wo10) this.bannersAdapter.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final RecyclerView getPagerRecyclerView() {
        return (RecyclerView) ((g761) getBinding()).d.getChildAt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e7n getRecyclerAdapter() {
        return (e7n) this.recyclerAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 lastItemScrollListener$lambda$4(MerchantOffersFragment merchantOffersFragment) {
        ((b) merchantOffersFragment.getViewModel()).f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onAppBarOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        float totalScrollRange = ((-1.0f) * verticalOffset) / appBarLayout.getTotalScrollRange();
        if (totalScrollRange > 1.0f) {
            totalScrollRange = 1.0f;
        }
        this.currentScrollProgress = totalScrollRange;
        updateToolbarAlpha();
        changeVerticalScrollProgressForBanner$default(this, ((g761) getBinding()).d.getCurrentItem(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onProgressBarFinished() {
        if (this.isAccessibilityModeEnabled) {
            return;
        }
        this.timerHandler.post(new fbz(22, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onProgressBarFinished$lambda$28(MerchantOffersFragment merchantOffersFragment) {
        ViewPager2 viewPager2 = ((g761) merchantOffersFragment.getBinding()).d;
        viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        merchantOffersFragment.changeVerticalScrollProgressForBanner(viewPager2.getCurrentItem() - 1, 0.0f);
        changeVerticalScrollProgressForBanner$default(merchantOffersFragment, viewPager2.getCurrentItem(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onScrollChangeListener$lambda$6(MerchantOffersFragment merchantOffersFragment, View view, int i, int i2, int i3, int i4) {
        g761 g761Var = (g761) merchantOffersFragment.getBinding();
        int measuredHeight = g761Var.i.getMeasuredHeight();
        g761Var.h.setCurrentScrollPositionY(g761Var.i.computeVerticalScrollOffset(), measuredHeight);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$14$lambda$11(MerchantOffersFragment merchantOffersFragment, CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        return merchantOffersFragment.canScrollUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$14$lambda$9(MerchantOffersFragment merchantOffersFragment, tb6 tb6Var) {
        ((b) merchantOffersFragment.getViewModel()).e0(tb6Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e7n recyclerAdapter_delegate$lambda$3(MerchantOffersFragment merchantOffersFragment) {
        lum b;
        a10 a = hc5.a();
        o70 c = ola1.c(new bns(27, merchantOffersFragment));
        lum d = gp41.d();
        lum j = si91.j();
        b = er31.b(new bp10(merchantOffersFragment, 0), false);
        return new e7n(a, c, d, j, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean recyclerAdapter_delegate$lambda$3$lambda$1(MerchantOffersFragment merchantOffersFragment, Uri uri, spl splVar) {
        return ((b) merchantOffersFragment.getViewModel()).h0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 recyclerAdapter_delegate$lambda$3$lambda$2(MerchantOffersFragment merchantOffersFragment) {
        ((b) merchantOffersFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void scrollUp() {
        OrientationAwareRecyclerView orientationAwareRecyclerView = ((g761) getBinding()).i;
        if (((LinearLayoutManager) orientationAwareRecyclerView.getLayoutManager()).K1() > 10) {
            orientationAwareRecyclerView.scrollToPosition(10);
        }
        orientationAwareRecyclerView.smoothScrollToPosition(0);
        this.shouldExpandAppBarOnIdleScrolling = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupBanners(tp10 viewState) {
        rw51 a = viewState.a();
        List b = viewState.b();
        boolean z = getBannersAdapter().getItemCount() == 0;
        g761 g761Var = (g761) getBinding();
        List list = b;
        g761Var.k.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        getBannersAdapter().i(b);
        if (a != null) {
            g761Var.l.render(a);
        }
        if (z && list != null && !list.isEmpty()) {
            g761Var.d.setCurrentItem(getBannersAdapter().f(), false);
        }
        updateToolbarAlpha();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void startPagerTimer() {
        tif0 tif0Var = this.timer;
        if (tif0Var != null) {
            tif0Var.a();
        }
        this.timer = null;
        tp10 tp10Var = this.currentContentViewState;
        List c = tp10Var != null ? tp10Var.c() : null;
        List list = c;
        if (list == null || list.isEmpty()) {
            return;
        }
        int b = ((uo10) c.get(((g761) getBinding()).d.getCurrentItem() % c.size())).b();
        tif0 tif0Var2 = new tif0(b, new is8(this, b, 7), new MerchantOffersFragment$startPagerTimer$2(this));
        tif0Var2.c();
        this.timer = tif0Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 startPagerTimer$lambda$26(MerchantOffersFragment merchantOffersFragment, int i, long j) {
        merchantOffersFragment.updateStoryProgressBar(i - ((int) j));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void transformBannerPage(View page, float position) {
        uo10 g;
        ColorModel a;
        ColorModel a2;
        int childAdapterPosition = ((RecyclerView) page.getParent()).getChildAdapterPosition(page);
        MerchantOffersBannerView merchantOffersBannerView = page instanceof MerchantOffersBannerView ? (MerchantOffersBannerView) page : null;
        float c = y6i0.c(position, -1.0f, 1.0f);
        if (merchantOffersBannerView != null) {
            merchantOffersBannerView.setHorizontalScrollProgress(c);
        }
        if (position < 0.0f) {
            uo10 g2 = getBannersAdapter().g(childAdapterPosition + 1);
            if (g2 == null || (a2 = g2.a()) == null || merchantOffersBannerView == null) {
                return;
            }
            merchantOffersBannerView.blendBackground(1.0f + c, a2);
            return;
        }
        if (position == 0.0f) {
            if (merchantOffersBannerView != null) {
                merchantOffersBannerView.resetBackground();
            }
        } else {
            if (position <= 0.0f || (g = getBannersAdapter().g(childAdapterPosition - 1)) == null || (a = g.a()) == null || merchantOffersBannerView == null) {
                return;
            }
            merchantOffersBannerView.blendBackground(1.0f - c, a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateStoryProgressBar(int currentItemProgress) {
        tp10 tp10Var = this.currentContentViewState;
        List c = tp10Var != null ? tp10Var.c() : null;
        List list = c;
        if (list == null || list.isEmpty()) {
            return;
        }
        int currentItem = ((g761) getBinding()).d.getCurrentItem() % c.size();
        List list2 = c;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            uo10 uo10Var = (uo10) obj;
            arrayList.add(new qw51(i > currentItem ? 0 : i < currentItem ? uo10Var.b() : currentItemProgress, uo10Var.b()));
            i = i2;
        }
        ((g761) getBinding()).l.render(new rw51(arrayList));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateToolbarAlpha() {
        Toolbar toolbar = ((g761) getBinding()).n;
        float f = 1.0f;
        if (getBannersAdapter().h() != 0 && this.currentScrollProgress < 0.5f) {
            f = 0.0f;
        }
        toolbar.setAlpha(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof uq10) {
            ((g761) getBinding()).m.setRefreshing(((uq10) sideEffect).a());
            return;
        }
        if (sideEffect instanceof wq10) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((wq10) sideEffect).a(), null, 12);
            return;
        }
        if (sideEffect.equals(zmg.i)) {
            scrollUp();
        } else if (sideEffect instanceof vq10) {
            ((b) getViewModel()).i0(((vq10) sideEffect).a());
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
    public b getFactoryOfViewModel() {
        return (b) this.viewModelProvider.get();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public g761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        g761 p = g761.p(inflater, container);
        p.i.setConfig(((b) getViewModel()).d0());
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        u1w h = insets.a.h(519);
        int i = h.b;
        int d = rje.d(dwg0.ybsdk_merchant_offers_shimmer_progress_top_margin, requireContext());
        g761 g761Var = (g761) getBinding();
        ConstraintLayout o = g761Var.o();
        ViewGroup.LayoutParams layoutParams = o.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = h.a;
        marginLayoutParams.bottomMargin = h.d;
        marginLayoutParams.rightMargin = h.c;
        o.setLayoutParams(marginLayoutParams);
        ConstraintLayout constraintLayout = g761Var.b;
        ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
        if (layoutParams2 == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, i, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
        constraintLayout.setLayoutParams(marginLayoutParams2);
        SkeletonView skeletonView = (SkeletonView) ((nzm) g761Var.j.c).c;
        ViewGroup.LayoutParams layoutParams3 = skeletonView.getLayoutParams();
        if (layoutParams3 == null) {
            ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return null;
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins(((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, i + d, ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
        skeletonView.setLayoutParams(layoutParams4);
        return insets;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.isAccessibilityModeEnabled = lia1.g(context);
        AccessibilityManager b = lia1.b(context);
        if (b != null) {
            b.addAccessibilityStateChangeListener(this.accessibilityStateChangedListener);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        g761 g761Var = (g761) getBinding();
        ViewPager2 viewPager2 = g761Var.d;
        OrientationAwareRecyclerView orientationAwareRecyclerView = g761Var.i;
        viewPager2.unregisterOnPageChangeCallback(this.bannerChangedCallback);
        g761Var.d.setAdapter(null);
        this.timerHandler.removeCallbacksAndMessages(null);
        tif0 tif0Var = this.timer;
        if (tif0Var != null) {
            tif0Var.a();
        }
        this.timer = null;
        orientationAwareRecyclerView.removeOnScrollListener(this.lastItemScrollListener);
        orientationAwareRecyclerView.removeOnScrollListener(this.checkVisibleOffersListener);
        orientationAwareRecyclerView.removeOnScrollListener(this.expandAppBarListener);
        orientationAwareRecyclerView.setOnScrollChangeListener(null);
        orientationAwareRecyclerView.setAdapter(null);
        super.onDestroyView();
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        AccessibilityManager b = lia1.b(requireContext());
        if (b != null) {
            b.removeAccessibilityStateChangeListener(this.accessibilityStateChangedListener);
        }
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        tif0 tif0Var = this.timer;
        if (tif0Var != null) {
            tif0Var.a();
        }
        super.onPause();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.offerListReporter.a(((g761) getBinding()).i, getRecyclerAdapter().f());
        tif0 tif0Var = this.timer;
        if (tif0Var != null) {
            tif0Var.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.offerListReporter.b();
        super.onStop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setStatusBarColorModel(new z1x0(new ColorModel.Attr(ung0.ybColor_internal_transparent)));
        g761 g761Var = (g761) getBinding();
        com.ybsdk.core.utils.ext.view.b.s(g761Var.c, new iig(2, this));
        ViewPager2 viewPager2 = g761Var.d;
        viewPager2.registerOnPageChangeCallback(this.bannerChangedCallback);
        viewPager2.setPageTransformer(new jt31() { // from class: ap10
            @Override // defpackage.jt31
            public final void c(float f, View view2) {
                MerchantOffersFragment.this.transformBannerPage(view2, f);
            }
        });
        viewPager2.setAdapter(getBannersAdapter());
        g761Var.g.setOnTabClickListener(new k200(21, this));
        g761Var.h.setOnClickListener(new zgv(11, this));
        CustomSwipeRefreshLayout customSwipeRefreshLayout = g761Var.m;
        customSwipeRefreshLayout.setOnChildScrollUpCallback(new uhx(10, this));
        final b bVar = (b) getViewModel();
        customSwipeRefreshLayout.setOnRefreshListener(new mlf() { // from class: com.ybsdk.feature.merchant.offers.internal.screens.root.a
            @Override // defpackage.mlf
            public final void onRefresh() {
                r0 r0Var;
                Object value;
                b bVar2 = b.this;
                pzt0 pzt0Var = bVar2.J;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                bVar2.J = null;
                pz40 Y = bVar2.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, nq10.a((nq10) value, null, null, np10.a, 7)));
                tje.N(ds31.a(bVar2), null, null, new MerchantOffersViewModel$onRefresh$2(bVar2, null), 3);
            }
        });
        OrientationAwareRecyclerView orientationAwareRecyclerView = g761Var.i;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(orientationAwareRecyclerView.getContext());
        linearLayoutManager.Q = false;
        orientationAwareRecyclerView.setLayoutManager(linearLayoutManager);
        orientationAwareRecyclerView.setAdapter(getRecyclerAdapter());
        orientationAwareRecyclerView.addOnScrollListener(this.lastItemScrollListener);
        orientationAwareRecyclerView.addOnScrollListener(this.checkVisibleOffersListener);
        orientationAwareRecyclerView.addOnScrollListener(this.expandAppBarListener);
        orientationAwareRecyclerView.setOnScrollChangeListener(this.onScrollChangeListener);
        ErrorView errorView = g761Var.f;
        errorView.setPrimaryButtonOnClickListener(new MerchantOffersFragment$onViewCreated$1$8(getViewModel()));
        errorView.setSecondaryButtonClickListener(new MerchantOffersFragment$onViewCreated$1$9(getViewModel()));
        g761Var.n.setVisibility(((ejg) this.merchantOffersVisualParamsProvider).a() ? 8 : 0);
        androidx.core.view.b.p(getPagerRecyclerView(), new bv4(getPagerRecyclerView()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(xq10 viewState) {
        g761 g761Var = (g761) getBinding();
        MerchantOffersFloatingActionButtonView merchantOffersFloatingActionButtonView = g761Var.h;
        ErrorView errorView = g761Var.f;
        DivSkeletonsView divSkeletonsView = g761Var.e;
        merchantOffersFloatingActionButtonView.setNeedSetScrollPositionY(viewState.b());
        g761Var.g.render(viewState.a());
        List a = viewState.a().a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(((tb6) it.next()).a());
        }
        this.bottomBarReporter.c(arrayList.toString());
        wp10 c = viewState.c();
        ShimmerFrameLayout p = g761Var.j.p();
        boolean z = c instanceof vp10;
        vp10 vp10Var = z ? (vp10) c : null;
        p.setVisibility((vp10Var != null ? vp10Var.a() : null) == ShimmerType.NATIVE_SHIMMER ? 0 : 8);
        vp10 vp10Var2 = z ? (vp10) c : null;
        boolean z2 = (vp10Var2 != null ? vp10Var2.a() : null) == ShimmerType.DIV_KIT_SHIMMER;
        divSkeletonsView.setVisibility(z2 ? 0 : 8);
        if (z2) {
            divSkeletonsView.render(new eal(tks0.b, false, null, 6));
        }
        boolean z3 = c instanceof tp10;
        g761Var.m.setVisibility(z3 ? 0 : 8);
        if (!z) {
            if (z3) {
                tp10 tp10Var = (tp10) c;
                getRecyclerAdapter().g(tp10Var.d());
                this.currentContentViewState = tp10Var;
                setupBanners(tp10Var);
            } else {
                if (!(c instanceof up10)) {
                    w511.b();
                    return;
                }
                errorView.render(((up10) c).a());
            }
        }
        errorView.setVisibility(c instanceof up10 ? 0 : 8);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
