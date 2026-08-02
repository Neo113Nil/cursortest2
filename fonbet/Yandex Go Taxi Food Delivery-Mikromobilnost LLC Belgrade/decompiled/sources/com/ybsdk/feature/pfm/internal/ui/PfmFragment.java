package com.ybsdk.feature.pfm.internal.ui;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionManager;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.divkit.api.domain.LocalVariableName;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.pfm.internal.ui.PfmFragment;
import com.ybsdk.feature.pfm.internal.ui.widgets.PFMCalendarView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmCategoriesView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmExpandedCategoryHeaderView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFilterBottomSheetContentView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFiltersView;
import com.ybsdk.feature.pfm.internal.ui.widgets.PfmFunFactView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.i;
import com.ybsdk.widgets.common.bottomsheet.l;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import defpackage.a10;
import defpackage.b9b0;
import defpackage.bgc;
import defpackage.c5z;
import defpackage.ce4;
import defpackage.cg91;
import defpackage.ds31;
import defpackage.dzh0;
import defpackage.e7n;
import defpackage.er31;
import defpackage.ewg0;
import defpackage.gc5;
import defpackage.hbb0;
import defpackage.hc5;
import defpackage.i3y;
import defpackage.ibb0;
import defpackage.ip2;
import defpackage.j38;
import defpackage.jbb0;
import defpackage.jdb0;
import defpackage.k751;
import defpackage.kbb0;
import defpackage.kp50;
import defpackage.l761;
import defpackage.lbb0;
import defpackage.ldb0;
import defpackage.lfx;
import defpackage.li91;
import defpackage.lum;
import defpackage.lz70;
import defpackage.mdb0;
import defpackage.mdr;
import defpackage.mlf;
import defpackage.n751;
import defpackage.nbb0;
import defpackage.ndb0;
import defpackage.ny61;
import defpackage.o70;
import defpackage.obb0;
import defpackage.odb0;
import defpackage.ok31;
import defpackage.ola1;
import defpackage.p1b;
import defpackage.p8b0;
import defpackage.pbb0;
import defpackage.pzt0;
import defpackage.q8b0;
import defpackage.qas0;
import defpackage.qbb0;
import defpackage.qdb0;
import defpackage.r8b0;
import defpackage.rb6;
import defpackage.rbb0;
import defpackage.rdb0;
import defpackage.ri91;
import defpackage.rje;
import defpackage.rzy0;
import defpackage.s8b0;
import defpackage.sdb0;
import defpackage.si91;
import defpackage.spl;
import defpackage.tb6;
import defpackage.tcc;
import defpackage.tdb0;
import defpackage.tdr;
import defpackage.tje;
import defpackage.udb0;
import defpackage.unr0;
import defpackage.vdb0;
import defpackage.w511;
import defpackage.x9b0;
import defpackage.xdb0;
import defpackage.y1x0;
import defpackage.y6i0;
import defpackage.y8f;
import defpackage.y9b0;
import defpackage.ydb0;
import defpackage.yln;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000û\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0005/\u0083\u0001\u008c\u0001\b\u0000\u0018\u0000 \u0092\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0002\u0093\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001f2\u0006\u0010&\u001a\u00020\u0003H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u001fH\u0016¢\u0006\u0004\b)\u0010*J'\u00100\u001a\u00020/2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020+H\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u001f*\u00020\u00022\u0006\u0010&\u001a\u000202H\u0002¢\u0006\u0004\b3\u00104J\u001b\u00105\u001a\u00020\u001f*\u00020\u00022\u0006\u0010&\u001a\u000202H\u0002¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u000bH\u0002¢\u0006\u0004\b6\u0010\rJ\u0019\u00109\u001a\u00020\u001f2\b\u00108\u001a\u0004\u0018\u000107H\u0002¢\u0006\u0004\b9\u0010:J!\u0010;\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u001b2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u001f*\u00020\u001b2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b?\u0010@J)\u0010I\u001a\u00020F2\u0006\u0010B\u001a\u00020A2\u0006\u0010C\u001a\u00020\u001b2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bG\u0010HJ!\u0010J\u001a\u00020\u001f2\u0006\u0010C\u001a\u00020\u001b2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bJ\u0010KJ!\u0010M\u001a\u00020L2\u0006\u0010C\u001a\u00020\u001b2\b\u0010E\u001a\u0004\u0018\u00010DH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u001fH\u0002¢\u0006\u0004\bO\u0010*J\u000f\u0010P\u001a\u00020\u001fH\u0002¢\u0006\u0004\bP\u0010*J\u001f\u0010T\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020QH\u0002¢\u0006\u0004\bT\u0010UJ\u001f\u0010X\u001a\u00020\u001f2\u0006\u0010W\u001a\u00020V2\u0006\u0010S\u001a\u00020QH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b^\u0010]J\u0017\u0010_\u001a\u00020\u001f2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010a\u001a\u00020`H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\u001fH\u0002¢\u0006\u0004\bc\u0010*J\u001b\u0010f\u001a\u00020\u001f*\u00020\u00022\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ\u0019\u0010i\u001a\u00020\u001f2\b\u0010&\u001a\u0004\u0018\u00010hH\u0002¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020QH\u0002¢\u0006\u0004\bk\u0010lJ\u001b\u0010n\u001a\u00020Q*\u00020\u001b2\u0006\u0010m\u001a\u00020QH\u0002¢\u0006\u0004\bn\u0010oR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010pR\u0018\u0010q\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010s\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010y\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010xR\u0016\u0010z\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010vR\u001b\u0010~\u001a\u00020Q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010lR\u001e\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001¨\u0006\u0094\u0001"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/PfmFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Ll761;", "Lydb0;", "Lcom/ybsdk/feature/pfm/internal/ui/b;", "Lce4;", "Ltdr;", "Lrdb0;", "pfmViewModelFactory", "<init>", "(Lrdb0;)V", "", "fitsSystemWindow", "()Z", "onBackPressed", "createViewModel", "()Lcom/ybsdk/feature/pfm/internal/ui/b;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ll761;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Lydb0;)V", "onDestroyView", "()V", "Landroidx/recyclerview/widget/RecyclerView;", "filtersRecyclerView", "categoriesRecyclerView", "expandedCategoriesRecyclerView", "obb0", "createHorizontalScrollAnalyticsListener", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView;)Lobb0;", "Lodb0;", "renderScreen", "(Ll761;Lodb0;)V", "renderExpandedParentCategoryHeader", "canScrollUp", "Ls8b0;", "content", "renderBottomSheet", "(Ls8b0;)V", "isSameBottomSheetContentType", "(Landroid/view/View;Ls8b0;)Z", "createBottomSheetContentView", "(Ls8b0;)Landroid/view/View;", "updateExistingContentView", "(Landroid/view/View;Ls8b0;)V", "Ltab0;", "filterId", "contentView", "Lcom/ybsdk/widgets/common/bottomsheet/h;", "toolbarState", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "createBottomSheetDialog-fBvOVSU", "(Ljava/lang/String;Landroid/view/View;Lcom/ybsdk/widgets/common/bottomsheet/h;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "createBottomSheetDialog", "updateBottomSheetDialog", "(Landroid/view/View;Lcom/ybsdk/widgets/common/bottomsheet/h;)V", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "createBottomSheetState", "(Landroid/view/View;Lcom/ybsdk/widgets/common/bottomsheet/h;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "hideFilterBottomSheet", "scrollToTop", "", "totalScrollRange", "verticalOffset", "updateSecondLevelPaddings", "(II)V", "Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout", "onAppBarOffsetChanged", "(Lcom/google/android/material/appbar/AppBarLayout;I)V", "", "currentScrollProgress", "updateFunFactOpacityValue", "(F)V", "updateFiltersBackgroundRadius", "updateFiltersRecyclerViewPaddings", "Lc5z;", "createFeedHeightDivLocalVar", "()Lc5z;", "updateVisiblePfmFeedDivKitLocalVariables", "Lb9b0;", "categories", "renderCategories", "(Ll761;Lb9b0;)V", "Lldb0;", "setUpLayoutChangesAnimation", "(Lldb0;)V", "calcVisibleFeedHeightDp", "()I", "parentWidth", "measureExpectedHeight", "(Landroid/view/View;I)I", "Lrdb0;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetContentView", "Landroid/view/View;", "transactionsFeedVisibleHeightDp", CA20Status.STATUS_USER_I, "shouldExpandAppBarOnIdleScrolling", "Z", "shouldAnimateAppBar", "topSystemBarHeightPx", "filtersPaddingTopPx$delegate", "Li3y;", "getFiltersPaddingTopPx", "filtersPaddingTopPx", "Le7n;", "Lgc5;", "adapter", "Le7n;", "qbb0", "onFilterBottomSheetClickListener", "Lqbb0;", "Lrzy0;", "thresholdItemScrollListener", "Lrzy0;", "Lmdr;", "firstVisibleItemScrollListener", "Lmdr;", "pbb0", "expandAppBarListener", "Lpbb0;", "Lip2;", "expandedCategoriesAppBarListener", "Lip2;", "Companion", "nbb0", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PfmFragment extends BaseDivContextMvvmFragment<l761, ydb0, b> implements ce4, tdr {
    private static final nbb0 Companion = new nbb0();

    @Deprecated
    public static final float FUN_FACT_OPACITY_SCROLL_PROGRESS_MULTIPLIER = 1.2f;

    @Deprecated
    public static final float MAX_FUN_FACT_OPACITY_VALUE = 1.0f;

    @Deprecated
    public static final float MAX_FUN_FACT_SCROLL_PROGRESS = 1.0f;

    @Deprecated
    public static final int MAX_RECYCLER_POSITION_FOR_SMOOTH_SCROLLING = 30;

    @Deprecated
    public static final int TRANSACTIONS_THRESHOLD = 12;

    @Deprecated
    public static final int ZERO_POSITION = 0;
    private final e7n adapter;
    private View bottomSheetContentView;
    private BottomSheetDialogView bottomSheetDialogView;
    private final pbb0 expandAppBarListener;
    private final ip2 expandedCategoriesAppBarListener;

    /* renamed from: filtersPaddingTopPx$delegate, reason: from kotlin metadata */
    private final i3y filtersPaddingTopPx;
    private final mdr firstVisibleItemScrollListener;
    private final qbb0 onFilterBottomSheetClickListener;
    private final rdb0 pfmViewModelFactory;
    private boolean shouldAnimateAppBar;
    private boolean shouldExpandAppBarOnIdleScrolling;
    private final rzy0 thresholdItemScrollListener;
    private int topSystemBarHeightPx;
    private int transactionsFeedVisibleHeightDp;

    public PfmFragment(rdb0 rdb0Var) {
        super(Boolean.FALSE, null, null, null, b.class, 14, null);
        lum b;
        this.pfmViewModelFactory = rdb0Var;
        int i = 0;
        this.filtersPaddingTopPx = kotlin.a.a(new hbb0(this, i));
        a10 b2 = hc5.b();
        int i2 = 1;
        o70 b3 = ola1.b(new hbb0(this, i2), new lbb0(i, this));
        lum j = si91.j();
        int i3 = 2;
        b = er31.b(new hbb0(this, i3), false);
        this.adapter = new e7n(b2, b3, j, b);
        this.onFilterBottomSheetClickListener = new qbb0(this);
        this.thresholdItemScrollListener = new rzy0(new hbb0(this, 3));
        this.firstVisibleItemScrollListener = new mdr(new ibb0(this, i3));
        this.expandAppBarListener = new pbb0(this);
        this.expandedCategoriesAppBarListener = new jbb0(this, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ l761 access$getBinding(PfmFragment pfmFragment) {
        return (l761) pfmFragment.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ b access$getViewModel(PfmFragment pfmFragment) {
        return (b) pfmFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set adapter$lambda$1(PfmFragment pfmFragment) {
        return Collections.singleton(pfmFragment.createFeedHeightDivLocalVar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean adapter$lambda$2(PfmFragment pfmFragment, Uri uri, spl splVar) {
        return ((b) pfmFragment.getViewModel()).m0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 adapter$lambda$3(PfmFragment pfmFragment) {
        ((b) pfmFragment.getViewModel()).w0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int calcVisibleFeedHeightDp() {
        int[] iArr = new int[2];
        ((l761) getBinding()).n.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        ((l761) getBinding()).j.getLocationInWindow(iArr2);
        return (int) kp50.x(iArr[1] - iArr2[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canScrollUp() {
        l761 l761Var = (l761) getBinding();
        return l761Var.j.canScrollVertically(-1) || com.ybsdk.core.utils.ext.view.b.f(l761Var.b);
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [uc5] */
    private final View createBottomSheetContentView(s8b0 content) {
        if (content instanceof p8b0) {
            PFMCalendarView pFMCalendarView = new PFMCalendarView(requireContext(), null, 0, 6, null);
            pFMCalendarView.render(((p8b0) content).c());
            pFMCalendarView.setOnRangePickerStateChangedListener(new PfmFragment$createBottomSheetContentView$1$1(getViewModel()));
            return pFMCalendarView;
        }
        if (content instanceof r8b0) {
            PfmFilterBottomSheetContentView pfmFilterBottomSheetContentView = new PfmFilterBottomSheetContentView(requireContext(), null, 0, 6, null);
            pfmFilterBottomSheetContentView.render(((r8b0) content).c());
            pfmFilterBottomSheetContentView.setOnClickListener(this.onFilterBottomSheetClickListener);
            return pfmFilterBottomSheetContentView;
        }
        if (!(content instanceof q8b0)) {
            w511.b();
            return null;
        }
        PfmFilterBottomSheetContentView pfmFilterBottomSheetContentView2 = new PfmFilterBottomSheetContentView(requireContext(), null, 0, 6, null);
        pfmFilterBottomSheetContentView2.render(((q8b0) content).c());
        pfmFilterBottomSheetContentView2.setOnClickListener(this.onFilterBottomSheetClickListener);
        return pfmFilterBottomSheetContentView2;
    }

    /* renamed from: createBottomSheetDialog-fBvOVSU, reason: not valid java name */
    private final BottomSheetDialogView m446createBottomSheetDialogfBvOVSU(final String filterId, View contentView, h toolbarState) {
        final BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        final int i = 0;
        bottomSheetDialogView.onPrimaryAction(new View.OnClickListener() { // from class: mbb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                String str = filterId;
                PfmFragment pfmFragment = this;
                BottomSheetDialogView bottomSheetDialogView2 = bottomSheetDialogView;
                switch (i2) {
                    case 0:
                        PfmFragment.createBottomSheetDialog_fBvOVSU$lambda$25$lambda$22(bottomSheetDialogView2, pfmFragment, str, view);
                        break;
                    default:
                        PfmFragment.createBottomSheetDialog_fBvOVSU$lambda$25$lambda$23(bottomSheetDialogView2, pfmFragment, str, view);
                        break;
                }
            }
        });
        final int i2 = 1;
        bottomSheetDialogView.onSecondaryAction(new View.OnClickListener() { // from class: mbb0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                String str = filterId;
                PfmFragment pfmFragment = this;
                BottomSheetDialogView bottomSheetDialogView2 = bottomSheetDialogView;
                switch (i22) {
                    case 0:
                        PfmFragment.createBottomSheetDialog_fBvOVSU$lambda$25$lambda$22(bottomSheetDialogView2, pfmFragment, str, view);
                        break;
                    default:
                        PfmFragment.createBottomSheetDialog_fBvOVSU$lambda$25$lambda$23(bottomSheetDialogView2, pfmFragment, str, view);
                        break;
                }
            }
        });
        bottomSheetDialogView.onDismiss(new ibb0(this, i));
        bottomSheetDialogView.render(createBottomSheetState(contentView, toolbarState));
        BottomSheetDialogView.show$default(bottomSheetDialogView, requireActivity(), null, 2, null);
        return bottomSheetDialogView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void createBottomSheetDialog_fBvOVSU$lambda$25$lambda$22(BottomSheetDialogView bottomSheetDialogView, PfmFragment pfmFragment, String str, View view) {
        cg91.c(bottomSheetDialogView, ok31.c);
        ((b) pfmFragment.getViewModel()).s0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void createBottomSheetDialog_fBvOVSU$lambda$25$lambda$23(BottomSheetDialogView bottomSheetDialogView, PfmFragment pfmFragment, String str, View view) {
        cg91.c(bottomSheetDialogView, ok31.c);
        ((b) pfmFragment.getViewModel()).q0(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 createBottomSheetDialog_fBvOVSU$lambda$25$lambda$24(PfmFragment pfmFragment, boolean z) {
        ((b) pfmFragment.getViewModel()).p0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final BottomSheetDialogView.State createBottomSheetState(View contentView, h toolbarState) {
        ColorModel colorModel = null;
        ColorModel colorModel2 = null;
        ColorModel colorModel3 = null;
        boolean z = false;
        return new BottomSheetDialogView.State((d) new e(null, null, new j38(contentView, 1), 3), new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, new YbButtonView.a(unr0.h(Text.Companion, ((contentView instanceof PFMCalendarView) || (contentView instanceof PfmFilterBottomSheetContentView)) ? dzh0.ybsdk_common_design_button_select : dzh0.ybsdk_card_card_save_button_title), null, null, null, colorModel, colorModel2, colorModel3, false, z, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_common_design_button_reset), 0 == true ? 1 : 0, 0 == true ? 1 : 0, colorModel, colorModel2, colorModel3, null, z, false, null, 4094), null, 8), toolbarState, true, (BottomSheetDialogView.State.Background) null, (l) i.a, (p1b) null, true, (c) null, false, (z1x0) null, (z1x0) null, false, true, 48976);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View createBottomSheetState$lambda$26(View view) {
        return view;
    }

    private final c5z createFeedHeightDivLocalVar() {
        return new c5z(LocalVariableName.PFM_FEED_HEIGHT.getVarName(), String.valueOf(this.transactionsFeedVisibleHeightDp));
    }

    private final obb0 createHorizontalScrollAnalyticsListener(RecyclerView filtersRecyclerView, RecyclerView categoriesRecyclerView, RecyclerView expandedCategoriesRecyclerView) {
        return new obb0(this, filtersRecyclerView, categoriesRecyclerView, expandedCategoriesRecyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void expandedCategoriesAppBarListener$lambda$6(PfmFragment pfmFragment, AppBarLayout appBarLayout, int i) {
        ((l761) pfmFragment.getBinding()).g.setTranslationY(-i);
        ((l761) pfmFragment.getBinding()).i.renderExpansionButton(i != 0);
        pfmFragment.updateSecondLevelPaddings(appBarLayout.getTotalScrollRange(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int filtersPaddingTopPx_delegate$lambda$0(PfmFragment pfmFragment) {
        return rje.d(ewg0.ybsdk_pfm_filters_padding_top, pfmFragment.requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 firstVisibleItemScrollListener$lambda$5(PfmFragment pfmFragment, int i) {
        ((b) pfmFragment.getViewModel()).t0((gc5) kotlin.collections.a.S(i, pfmFragment.adapter.f()));
        return zy11.a;
    }

    private final int getFiltersPaddingTopPx() {
        return ((Number) this.filtersPaddingTopPx.getValue()).intValue();
    }

    private final void hideFilterBottomSheet() {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.bottomSheetDialogView = null;
        this.bottomSheetContentView = null;
    }

    private final boolean isSameBottomSheetContentType(View view, s8b0 content) {
        if (content instanceof p8b0) {
            return view instanceof PFMCalendarView;
        }
        if (!(content instanceof r8b0) && !(content instanceof q8b0)) {
            w511.b();
            return false;
        }
        return view instanceof PfmFilterBottomSheetContentView;
    }

    private final int measureExpectedHeight(View view, int i) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAppBarOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
        float totalScrollRange = ((-1.0f) * verticalOffset) / appBarLayout.getTotalScrollRange();
        if (totalScrollRange > 1.0f) {
            totalScrollRange = 1.0f;
        }
        updateFunFactOpacityValue(totalScrollRange);
        updateFiltersBackgroundRadius(totalScrollRange);
        updateFiltersRecyclerViewPaddings(totalScrollRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$13$lambda$10(l761 l761Var, PfmFragment pfmFragment) {
        cg91.c(l761Var.o(), ok31.c);
        ((b) pfmFragment.getViewModel()).n0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$13$lambda$11(l761 l761Var, PfmFragment pfmFragment) {
        cg91.c(l761Var.o(), ok31.c);
        ((b) pfmFragment.getViewModel()).o0();
        l761Var.i.renderExpansionButton(false);
        l761Var.f.setExpanded(true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$13$lambda$12(PfmFragment pfmFragment, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        pfmFragment.transactionsFeedVisibleHeightDp = pfmFragment.calcVisibleFeedHeightDp();
        pfmFragment.updateVisiblePfmFeedDivKitLocalVariables();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$13$lambda$7(PfmFragment pfmFragment, tb6 tb6Var) {
        ((b) pfmFragment.getViewModel()).k0(tb6Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onViewCreated$lambda$13$lambda$8(PfmFragment pfmFragment, CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        return pfmFragment.canScrollUp();
    }

    private final void renderBottomSheet(s8b0 content) {
        if (content == null) {
            hideFilterBottomSheet();
            return;
        }
        View view = this.bottomSheetContentView;
        if (view == null || !isSameBottomSheetContentType(view, content)) {
            view = createBottomSheetContentView(content);
        } else {
            updateExistingContentView(view, content);
        }
        this.bottomSheetContentView = view;
        if (this.bottomSheetDialogView == null) {
            this.bottomSheetDialogView = m446createBottomSheetDialogfBvOVSU(content.a(), view, content.b());
        } else {
            updateBottomSheetDialog(view, content.b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderCategories(l761 l761Var, b9b0 b9b0Var) {
        boolean b = b9b0Var.b();
        boolean z = (b && l761Var.c.getVisibility() != 0 && l761Var.h.getVisibility() == 0) || (!b && l761Var.g.getVisibility() != 0 && l761Var.c.getVisibility() == 0);
        if (((b) getViewModel()).f0()) {
            if (b) {
                PfmCategoriesView pfmCategoriesView = l761Var.g;
                ViewGroup.LayoutParams layoutParams = pfmCategoriesView.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                layoutParams.height = l761Var.g.getHeight();
                pfmCategoriesView.setLayoutParams(layoutParams);
                FrameLayout frameLayout = l761Var.d;
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams2.height = -2;
                    frameLayout.setLayoutParams(layoutParams2);
                }
            } else {
                AppBarLayout appBarLayout = l761Var.f;
                FrameLayout frameLayout2 = l761Var.d;
                PfmCategoriesView pfmCategoriesView2 = l761Var.c;
                appBarLayout.setVisibility(0);
                ViewGroup.LayoutParams layoutParams3 = pfmCategoriesView2.getLayoutParams();
                if (layoutParams3 == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                }
                layoutParams3.height = pfmCategoriesView2.getHeight();
                pfmCategoriesView2.setLayoutParams(layoutParams3);
                ViewGroup.LayoutParams layoutParams4 = frameLayout2.getLayoutParams();
                if (layoutParams4 == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    return;
                } else {
                    layoutParams4.height = measureExpectedHeight(l761Var.i, frameLayout2.getWidth());
                    frameLayout2.setLayoutParams(layoutParams4);
                }
            }
            FrameLayout frameLayout3 = l761Var.h;
            ViewGroup.LayoutParams layoutParams5 = frameLayout3.getLayoutParams();
            if (layoutParams5 == null) {
                ny61.t("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams5.height = b ? 1 : -2;
            frameLayout3.setLayoutParams(layoutParams5);
            li91.a(frameLayout3, !b, new bgc(12));
            li91.a(l761Var.c, b, new bgc(12));
        } else {
            PfmCategoriesView pfmCategoriesView3 = l761Var.c;
            PfmCategoriesView pfmCategoriesView4 = l761Var.g;
            pfmCategoriesView3.setVisibility(b ? 0 : 8);
            pfmCategoriesView4.setVisibility(!b ? 0 : 8);
            l761Var.h.setVisibility(b ? 8 : 0);
            l761Var.f.setVisibility(b ? 4 : 0);
            if (z) {
                if (!b) {
                    pfmCategoriesView4 = l761Var.c;
                }
                pfmCategoriesView4.clearRecyclerContent();
            }
        }
        (b ? l761Var.c : l761Var.g).render(b9b0Var, z);
    }

    private final void renderExpandedParentCategoryHeader(l761 l761Var, odb0 odb0Var) {
        x9b0 x9b0Var;
        if (odb0Var instanceof ldb0) {
            x9b0Var = ((ldb0) odb0Var).c();
        } else if (odb0Var instanceof ndb0) {
            x9b0Var = ((ndb0) odb0Var).b();
        } else {
            if (!(odb0Var instanceof mdb0)) {
                w511.b();
                return;
            }
            x9b0Var = null;
        }
        l761Var.i.render(x9b0Var);
    }

    private final void renderScreen(l761 l761Var, odb0 odb0Var) {
        boolean z = odb0Var instanceof ldb0;
        boolean z2 = odb0Var instanceof mdb0;
        boolean z3 = odb0Var instanceof ndb0;
        ErrorView errorView = l761Var.e;
        PfmFiltersView pfmFiltersView = l761Var.k;
        CustomSwipeRefreshLayout customSwipeRefreshLayout = l761Var.m;
        errorView.setVisibility(z2 ? 0 : 8);
        customSwipeRefreshLayout.setVisibility((z || z3) ? 0 : 8);
        pfmFiltersView.setVisibility((z || z3) ? 0 : 8);
        l761Var.j.setVisibility((z || z3) ? 0 : 8);
        if (z2 || z3) {
            this.shouldAnimateAppBar = false;
        }
        ldb0 b = ri91.b(odb0Var);
        renderBottomSheet(b != null ? b.a() : null);
        renderExpandedParentCategoryHeader(l761Var, odb0Var);
        if (odb0Var instanceof mdb0) {
            l761Var.e.render(((mdb0) odb0Var).a());
            l761Var.c.setVisibility(8);
            return;
        }
        if (odb0Var instanceof ldb0) {
            ldb0 ldb0Var = (ldb0) odb0Var;
            l761Var.l.render(ldb0Var.e());
            this.adapter.g(ldb0Var.f().getItems());
            customSwipeRefreshLayout.setEnabled(true);
            pfmFiltersView.render(ldb0Var.d());
            renderCategories(l761Var, ldb0Var.b());
            setUpLayoutChangesAnimation(ldb0Var);
            updateVisiblePfmFeedDivKitLocalVariables();
            return;
        }
        if (!(odb0Var instanceof ndb0)) {
            w511.b();
            return;
        }
        ndb0 ndb0Var = (ndb0) odb0Var;
        this.adapter.g(jdb0.a.getItems());
        customSwipeRefreshLayout.setEnabled(false);
        pfmFiltersView.render(ndb0Var.c());
        renderCategories(l761Var, ndb0Var.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void scrollToTop() {
        safePost(new kbb0((l761) getBinding(), this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 scrollToTop$lambda$28$lambda$27(l761 l761Var, PfmFragment pfmFragment) {
        RecyclerView recyclerView = l761Var.j;
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).K1() > 30) {
            recyclerView.scrollToPosition(30);
        }
        recyclerView.smoothScrollToPosition(0);
        pfmFragment.shouldExpandAppBarOnIdleScrolling = true;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setUpLayoutChangesAnimation(ldb0 viewState) {
        if (((b) getViewModel()).f0()) {
            if (!this.shouldAnimateAppBar) {
                this.shouldAnimateAppBar = true;
                return;
            }
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.c = 450L;
            changeBounds.u(((l761) getBinding()).i);
            changeBounds.u(((l761) getBinding()).c);
            changeBounds.u(((l761) getBinding()).g);
            changeBounds.a(new rbb0(this, viewState));
            TransitionManager.a(changeBounds, ((l761) getBinding()).o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 thresholdItemScrollListener$lambda$4(PfmFragment pfmFragment) {
        ((b) pfmFragment.getViewModel()).v0();
        return zy11.a;
    }

    private final void updateBottomSheetDialog(View contentView, h toolbarState) {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.render(createBottomSheetState(contentView, toolbarState));
        }
    }

    private final void updateExistingContentView(View view, s8b0 s8b0Var) {
        if ((view instanceof PFMCalendarView) && (s8b0Var instanceof p8b0)) {
            ((PFMCalendarView) view).render(((p8b0) s8b0Var).c());
            return;
        }
        boolean z = view instanceof PfmFilterBottomSheetContentView;
        if (z && (s8b0Var instanceof r8b0)) {
            ((PfmFilterBottomSheetContentView) view).render(((r8b0) s8b0Var).c());
        } else if (z && (s8b0Var instanceof q8b0)) {
            ((PfmFilterBottomSheetContentView) view).render(((q8b0) s8b0Var).c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateFiltersBackgroundRadius(float currentScrollProgress) {
        float d = rje.d(ewg0.ybsdk_pfm_common_corner_radius, requireContext());
        float f = currentScrollProgress * d;
        if (f > d) {
            f = d;
        }
        float f2 = d - f;
        ((l761) getBinding()).k.setCornerRadius(new float[]{f2, f2, f2, f2, 0.0f, 0.0f, 0.0f, 0.0f});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateFiltersRecyclerViewPaddings(float currentScrollProgress) {
        l761 l761Var = (l761) getBinding();
        l761Var.k.updateTopPadding(((l761Var.l.getVisibility() != 0 || l761Var.l.getHeight() == 0) ? this.topSystemBarHeightPx : (int) (this.topSystemBarHeightPx * currentScrollProgress)) + getFiltersPaddingTopPx());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateFunFactOpacityValue(float currentScrollProgress) {
        float f = currentScrollProgress * 1.2f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        ((l761) getBinding()).l.setOpacityValue(1.0f - f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateSecondLevelPaddings(int totalScrollRange, int verticalOffset) {
        float c = y6i0.c(totalScrollRange == 0 ? 1.0f : Math.abs(verticalOffset) / totalScrollRange, 0.0f, 1.0f);
        float c2 = y6i0.c(totalScrollRange == 0 ? 0.0f : (verticalOffset + totalScrollRange) / totalScrollRange, 0.0f, 1.0f);
        ((l761) getBinding()).i.updateBottomPadding(c);
        ((l761) getBinding()).g.updateTopPadding(c2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateVisiblePfmFeedDivKitLocalVariables() {
        List<c5z> singletonList = Collections.singletonList(createFeedHeightDivLocalVar());
        RecyclerView recyclerView = ((l761) getBinding()).j;
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            }
            YbDivView ybDivView = childAt instanceof YbDivView ? (YbDivView) childAt : null;
            if (ybDivView != null) {
                ybDivView.updateLocalVariables(singletonList);
            }
            i = i2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof sdb0) {
            ((l761) getBinding()).m.setRefreshing(false);
            return;
        }
        if (sideEffect instanceof vdb0) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((vdb0) sideEffect).a(), null, 12);
            return;
        }
        if (!(sideEffect instanceof tdb0)) {
            if (sideEffect instanceof udb0) {
                scrollToTop();
                return;
            } else {
                super.consumeSideEffect(sideEffect);
                return;
            }
        }
        View view = this.bottomSheetContentView;
        PFMCalendarView pFMCalendarView = view instanceof PFMCalendarView ? (PFMCalendarView) view : null;
        if (pFMCalendarView != null) {
            pFMCalendarView.scrollToStartDate(((tdb0) sideEffect).a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((xdb0) this.pfmViewModelFactory).a();
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        k751 k751Var = insets.a;
        int i = k751Var.h(2).d;
        int i2 = k751Var.h(519).b;
        this.topSystemBarHeightPx = i2;
        BottomBarNavigation bottomBarNavigation = ((l761) getBinding()).n;
        bottomBarNavigation.setPadding(bottomBarNavigation.getPaddingLeft(), bottomBarNavigation.getPaddingTop(), bottomBarNavigation.getPaddingRight(), i);
        ErrorView errorView = ((l761) getBinding()).e;
        errorView.setPadding(errorView.getPaddingLeft(), i2, errorView.getPaddingRight(), i);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        return ((b) getViewModel()).u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((l761) getBinding()).j.clearOnScrollListeners();
        ((l761) getBinding()).j.setAdapter(null);
        ((l761) getBinding()).k.clearOnScrollListeners();
        ((l761) getBinding()).c.clearOnScrollListeners();
        ((l761) getBinding()).g.clearOnScrollListeners();
        ((l761) getBinding()).i.setOnCloseClickListener(null);
        ((l761) getBinding()).i.setOnExpansionButtonClickListener(null);
        hideFilterBottomSheet();
        super.onDestroyView();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setStatusBarColorModel(new z1x0(y1x0.c()));
        final l761 l761Var = (l761) getBinding();
        int i = 0;
        com.ybsdk.core.utils.ext.view.b.s(l761Var.b, new jbb0(this, i));
        FrameLayout frameLayout = l761Var.d;
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
        frameLayout.setOutlineProvider(viewOutlineProvider);
        int i2 = 1;
        frameLayout.setClipToOutline(true);
        AppBarLayout appBarLayout = l761Var.f;
        appBarLayout.setOutlineProvider(viewOutlineProvider);
        appBarLayout.setClipToOutline(true);
        com.ybsdk.core.utils.ext.view.b.s(appBarLayout, this.expandedCategoriesAppBarListener);
        l761Var.b.bringToFront();
        BottomBarNavigation bottomBarNavigation = l761Var.n;
        bottomBarNavigation.setVisibility(0);
        bottomBarNavigation.setOnTabClickListener(new ibb0(this, i2));
        CustomSwipeRefreshLayout customSwipeRefreshLayout = l761Var.m;
        final b bVar = (b) getViewModel();
        customSwipeRefreshLayout.setOnRefreshListener(new mlf() { // from class: com.ybsdk.feature.pfm.internal.ui.a
            @Override // defpackage.mlf
            public final void onRefresh() {
                b bVar2 = b.this;
                bVar2.c0();
                bVar2.A0(true);
                pzt0 N = tje.N(ds31.a(bVar2), null, null, new PfmViewModel$onRefresh$1(bVar2, null), 3);
                N.w(new qdb0(bVar2, 2));
                bVar2.M = N;
            }
        });
        customSwipeRefreshLayout.setOnChildScrollUpCallback(new lz70(10, this));
        RecyclerView recyclerView = l761Var.j;
        recyclerView.setClipToOutline(true);
        final Context context = view.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context) { // from class: com.ybsdk.feature.pfm.internal.ui.PfmFragment$onViewCreated$1$5
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
            public final boolean J() {
                int itemCount = getItemCount() - 1;
                int K1 = K1();
                int M1 = M1();
                if (K1 != -1 && M1 != -1) {
                    boolean z = K1 > 0;
                    boolean z2 = M1 < itemCount;
                    if (z || z2) {
                        return super.J();
                    }
                    View X = X(K1);
                    int top = X != null ? X.getTop() : 0;
                    View X2 = X(M1);
                    int bottom = (X2 != null ? X2.getBottom() : 0) - top;
                    int height = ((this.I - PfmFragment.access$getBinding(PfmFragment.this).l.getHeight()) - getPaddingTop()) - getPaddingBottom();
                    boolean z3 = H1() == 0 && L1() == itemCount;
                    if (bottom > height || !z3) {
                        return super.J();
                    }
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void z1(RecyclerView.k kVar, int[] iArr) {
                super.z1(kVar, iArr);
                Integer valueOf = 1 < iArr.length ? Integer.valueOf(iArr[1]) : null;
                iArr[1] = Math.max(valueOf != null ? valueOf.intValue() : 0, l761Var.j.getHeight());
            }
        };
        linearLayoutManager.Q = false;
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.adapter);
        recyclerView.setItemAnimator(new y9b0(50L));
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(12);
        recyclerView.addOnScrollListener(this.thresholdItemScrollListener);
        recyclerView.addOnScrollListener(this.firstVisibleItemScrollListener);
        recyclerView.addOnScrollListener(this.expandAppBarListener);
        ErrorView errorView = l761Var.e;
        errorView.setPrimaryButtonOnClickListener(new PfmFragment$onViewCreated$1$7(getViewModel()));
        errorView.setSecondaryButtonClickListener(new PfmFragment$onViewCreated$1$8(getViewModel()));
        PfmFiltersView pfmFiltersView = l761Var.k;
        pfmFiltersView.setOnFilterClickListener(new PfmFragment$onViewCreated$1$9(getViewModel()));
        pfmFiltersView.setOnFilterEndIconClickListener(new PfmFragment$onViewCreated$1$10(getViewModel()));
        PfmCategoriesView pfmCategoriesView = l761Var.c;
        pfmCategoriesView.setIsCategoriesItemAnimatorEnabled(new PfmFragment$onViewCreated$1$11(getViewModel()));
        pfmCategoriesView.setIsCategoriesSizeAnimationEnabled(new PfmFragment$onViewCreated$1$12(getViewModel()));
        pfmCategoriesView.setIsSecondLevelAnimationsEnabled(new PfmFragment$onViewCreated$1$13(getViewModel()));
        PfmCategoriesView pfmCategoriesView2 = l761Var.g;
        pfmCategoriesView2.setIsCategoriesItemAnimatorEnabled(new PfmFragment$onViewCreated$1$14(getViewModel()));
        pfmCategoriesView2.setIsCategoriesSizeAnimationEnabled(new PfmFragment$onViewCreated$1$15(getViewModel()));
        pfmCategoriesView2.setIsSecondLevelAnimationsEnabled(new PfmFragment$onViewCreated$1$16(getViewModel()));
        pfmCategoriesView.setOnCategoryClickListener(new PfmFragment$onViewCreated$1$17(getViewModel()));
        pfmCategoriesView2.setOnCategoryClickListener(new PfmFragment$onViewCreated$1$18(getViewModel()));
        PfmExpandedCategoryHeaderView pfmExpandedCategoryHeaderView = l761Var.i;
        pfmExpandedCategoryHeaderView.setAnimationEnabled(new PfmFragment$onViewCreated$1$19(getViewModel()));
        pfmExpandedCategoryHeaderView.setOnCloseClickListener(new kbb0(l761Var, this, i));
        pfmExpandedCategoryHeaderView.setOnExpansionButtonClickListener(new kbb0(l761Var, this, i2));
        obb0 createHorizontalScrollAnalyticsListener = createHorizontalScrollAnalyticsListener(pfmFiltersView, pfmCategoriesView, pfmCategoriesView2);
        pfmFiltersView.addOnScrollListener(createHorizontalScrollAnalyticsListener);
        pfmCategoriesView.addOnScrollListener(createHorizontalScrollAnalyticsListener);
        pfmCategoriesView2.addOnScrollListener(createHorizontalScrollAnalyticsListener);
        PfmFunFactView pfmFunFactView = l761Var.l;
        pfmFunFactView.setDivActionHandler(new PfmFragment$onViewCreated$1$22(getViewModel()));
        pfmFunFactView.setAnimationEnabled(new PfmFragment$onViewCreated$1$23(getViewModel()));
        com.ybsdk.core.utils.ext.view.b.r(recyclerView, new yln(9, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(ydb0 viewState) {
        l761 l761Var = (l761) getBinding();
        rb6 a = viewState.a();
        odb0 b = viewState.b();
        l761Var.n.render(a);
        List a2 = a.a();
        ArrayList arrayList = new ArrayList(tcc.n(a2, 10));
        Iterator it = a2.iterator();
        while (it.hasNext()) {
            arrayList.add(((tb6) it.next()).a());
        }
        ((b) getViewModel()).y0(arrayList.toString());
        renderScreen(l761Var, b);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public l761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return l761.p(inflater, container);
    }
}
