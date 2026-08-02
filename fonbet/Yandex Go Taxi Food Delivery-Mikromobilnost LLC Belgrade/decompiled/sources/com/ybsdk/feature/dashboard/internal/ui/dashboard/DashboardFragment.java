package com.ybsdk.feature.dashboard.internal.ui.dashboard;

import android.animation.AnimatorInflater;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.internal.domain.entities.TopButtonTag;
import com.ybsdk.feature.dashboard.internal.ui.dashboard.DashboardFragment;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.DashboardBalanceTextView;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.GradientTextView;
import com.ybsdk.widgets.common.Tooltip$PreferredGravity;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbCardIconView;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.dashboard.DashboardViewLayout;
import com.ybsdk.widgets.common.swiperefresh.CustomSwipeRefreshLayout;
import defpackage.a10;
import defpackage.a7i0;
import defpackage.ang;
import defpackage.bng;
import defpackage.buz0;
import defpackage.cng;
import defpackage.dcs;
import defpackage.dlg;
import defpackage.dq51;
import defpackage.dye;
import defpackage.dzh0;
import defpackage.e7n;
import defpackage.ejg;
import defpackage.eng;
import defpackage.er31;
import defpackage.exa1;
import defpackage.fng;
import defpackage.frb1;
import defpackage.gsx;
import defpackage.h2b1;
import defpackage.hab1;
import defpackage.hjg;
import defpackage.i3y;
import defpackage.ip2;
import defpackage.j0g;
import defpackage.j9f;
import defpackage.jiu;
import defpackage.jjg;
import defpackage.kjg;
import defpackage.kp50;
import defpackage.lb7;
import defpackage.lfx;
import defpackage.ljg;
import defpackage.llg;
import defpackage.lum;
import defpackage.lwg0;
import defpackage.mjg;
import defpackage.ny61;
import defpackage.o70;
import defpackage.ojg;
import defpackage.ola1;
import defpackage.otb1;
import defpackage.oxe;
import defpackage.psp0;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qhg;
import defpackage.r661;
import defpackage.rhg;
import defpackage.rje;
import defpackage.rjg;
import defpackage.rtu;
import defpackage.scc;
import defpackage.si91;
import defpackage.sjg;
import defpackage.skg;
import defpackage.sm91;
import defpackage.smg0;
import defpackage.spl;
import defpackage.suf;
import defpackage.unr0;
import defpackage.uns0;
import defpackage.v4b1;
import defpackage.vo31;
import defpackage.vvg0;
import defpackage.w511;
import defpackage.wlg;
import defpackage.wnb1;
import defpackage.wo31;
import defpackage.wsz0;
import defpackage.xty0;
import defpackage.y5e;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.ys0;
import defpackage.zmg;
import defpackage.zvg0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000Ç\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006*\u0001q\b\u0000\u0018\u0000 \u0083\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0004\u0084\u0001\u0085\u0001B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\"J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020\u0018H\u0016¢\u0006\u0004\b%\u0010\u001cJ\u000f\u0010&\u001a\u00020\u001aH\u0016¢\u0006\u0004\b&\u0010\"J\u0017\u0010)\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u00102\u001a\u0002012\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00103J?\u0010<\u001a\u00020\u001a2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020.2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020.H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u001a2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020.H\u0002¢\u0006\u0004\b>\u0010?J7\u0010D\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020.2\u0006\u0010A\u001a\u00020.2\u0006\u00106\u001a\u00020.2\u0006\u0010B\u001a\u0002082\u0006\u0010C\u001a\u000208H\u0002¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020\u001aH\u0002¢\u0006\u0004\bF\u0010\"J\u0017\u0010G\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010-J\u000f\u0010H\u001a\u00020\u001aH\u0002¢\u0006\u0004\bH\u0010\"J\u000f\u0010I\u001a\u000201H\u0002¢\u0006\u0004\bI\u0010JJ\u0019\u0010M\u001a\u00020\u001a2\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u001aH\u0002¢\u0006\u0004\bO\u0010\"J\u000f\u0010P\u001a\u00020\u001aH\u0002¢\u0006\u0004\bP\u0010\"J\u0017\u0010R\u001a\u00020\u001a2\u0006\u0010Q\u001a\u000201H\u0002¢\u0006\u0004\bR\u0010SJ'\u0010W\u001a\u00020\u001a2\u0006\u0010T\u001a\u0002012\u0006\u0010U\u001a\u0002012\u0006\u0010V\u001a\u000201H\u0002¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u001aH\u0002¢\u0006\u0004\bY\u0010\"J'\u0010W\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u000208H\u0002¢\u0006\u0004\bW\u0010]R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010^R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010aR\u0016\u0010b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010f\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR$\u0010i\u001a\u0002012\u0006\u0010h\u001a\u0002018\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bi\u0010g\"\u0004\bj\u0010SR\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001a\u0010v\u001a\b\u0012\u0004\u0012\u00020u0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u001a\u0010y\u001a\b\u0012\u0004\u0012\u00020x0t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010wR\u0014\u0010{\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010~\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\"\u0010\u0081\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard/DashboardFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lr661;", "Lfng;", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard/b;", "Luns0;", "Lcng;", "viewModelFactory", "La7i0;", "rateAppFeature", "Ldlg;", "dashboardRemoteConfig", "Lpsp0;", "visualParams", "<init>", "(Lcng;La7i0;Ldlg;Lpsp0;)V", "createViewModel", "()Lcom/ybsdk/feature/dashboard/internal/ui/dashboard/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lr661;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onPause", "()V", "onResume", "outState", "onSaveInstanceState", "onDestroyView", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "viewState", "render", "(Lfng;)V", "", "positionX", "positionY", "", "canSlideFrom", "(FF)Z", "Landroid/widget/TextView;", "textView", "expandedPercentage", "totalScrollRange", "", "verticalOffset", "collapsedBalanceX", "collapsedPlusBalanceTextSize", "updateSubtitleTranslationAndScale", "(Landroid/widget/TextView;FFIIF)V", "cropTextView", "(Landroid/widget/TextView;F)V", "balanceViewTranslationX", "subtitleTranslationY", "expandedImageSize", "collapsedImageSize", "updateWalletIconTranslation", "(FFFII)V", "setupListeners", "renderShimmer", "updateBackButtonVisibility", "canScrollUp", "()Z", "Lrhg;", ClidProvider.STATE, "bottomSheet", "(Lrhg;)V", "dismissBottomSheet", "scrollScreenToTop", "isEnable", "changeViewsAccessibility", "(Z)V", "profileButtonEnabled", "userAvatarButtonEnabled", "hasProfileTopButton", "showAutoTopupTooltip", "(ZZZ)V", "showAutotopupTooltip", "Lcom/ybsdk/widgets/common/Tooltip$PreferredGravity;", "tooltipGravity", "offsetX", "(Landroid/view/View;Lcom/ybsdk/widgets/common/Tooltip$PreferredGravity;I)V", "Lcng;", "La7i0;", "Ldlg;", "Lpsp0;", "innerRecyclersState", "Landroid/os/Bundle;", "paddingRightForPlusBalanceView", CA20Status.STATUS_USER_I, "showProfileTooltipWhenReady", "Z", "value", "isDashboardViewsAccessibilityEnabled", "setDashboardViewsAccessibilityEnabled", "Lgsx;", "lastItemScrollListener$delegate", "Li3y;", "getLastItemScrollListener", "()Lgsx;", "lastItemScrollListener", "sjg", "diffCallback", "Lsjg;", "Lqa3;", "Lgc5;", "adapter", "Lqa3;", "Lbwz0;", "topButtonAdapter", "Landroid/graphics/Rect;", "transactionsToolbarPosition", "Landroid/graphics/Rect;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "", "accessibilityOrderList", "Ljava/util/List;", "Companion", "rjg", "ojg", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DashboardFragment extends BaseDivContextMvvmFragment<r661, fng, b> implements uns0 {
    public static final ojg Companion = new ojg();
    private static final float HEADER_GONE_THRESHOLD_PERCENT = 75.0f;
    private static final String INNER_RECYCLERS_STATE_BUNDLE = "inner_recyclers_states_bundle";
    private static final int MARGIN_PAY_BUTTON_CONTAINER_FOR_SUBTITLE_DP = 4;
    private static final float PERCENT_0 = 0.0f;
    private static final float PERCENT_100 = 100.0f;
    private List<? extends View> accessibilityOrderList;
    private final qa3 adapter;
    private BottomSheetDialogView bottomSheetDialogView;
    private final dlg dashboardRemoteConfig;
    private final sjg diffCallback;
    private Bundle innerRecyclersState;
    private boolean isDashboardViewsAccessibilityEnabled;

    /* renamed from: lastItemScrollListener$delegate, reason: from kotlin metadata */
    private final i3y lastItemScrollListener;
    private int paddingRightForPlusBalanceView;
    private final a7i0 rateAppFeature;
    private boolean showProfileTooltipWhenReady;
    private final qa3 topButtonAdapter;
    private final Rect transactionsToolbarPosition;
    private final cng viewModelFactory;
    private final psp0 visualParams;

    public DashboardFragment(cng cngVar, a7i0 a7i0Var, dlg dlgVar, psp0 psp0Var) {
        super(Boolean.FALSE, null, null, h2b1.P, b.class, 6, null);
        lum b;
        this.viewModelFactory = cngVar;
        this.rateAppFeature = a7i0Var;
        this.dashboardRemoteConfig = dlgVar;
        this.visualParams = psp0Var;
        this.innerRecyclersState = new Bundle();
        int i = 1;
        this.isDashboardViewsAccessibilityEnabled = true;
        this.lastItemScrollListener = kotlin.a.b(LazyThreadSafetyMode.NONE, new jjg(this, 2));
        sjg sjgVar = new sjg();
        this.diffCallback = sjgVar;
        o70 c = ola1.c(new mjg(this, 0));
        lum a = otb1.a();
        lum j = si91.j();
        b = er31.b(new jjg(this, 3), false);
        this.adapter = new e7n(sjgVar, c, a, j, b);
        a10 b2 = wlg.b();
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.topButtonAdapter = new qa3(new lb7(9, y5e.b, b2), wlg.a(new mjg(this, i)));
        this.transactionsToolbarPosition = new Rect();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean adapter$lambda$2(DashboardFragment dashboardFragment, Uri uri, spl splVar) {
        return ((b) dashboardFragment.getViewModel()).C0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 adapter$lambda$3(DashboardFragment dashboardFragment) {
        ((b) dashboardFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bottomSheet(rhg state) {
        if (state == null) {
            dismissBottomSheet();
            return;
        }
        if (!(state instanceof qhg)) {
            w511.b();
            return;
        }
        qhg qhgVar = (qhg) state;
        ColorModel colorModel = null;
        Text text = null;
        ColorModel colorModel2 = null;
        ColorModel colorModel3 = null;
        boolean z = false;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        BottomSheetDialogView.State state2 = new BottomSheetDialogView.State(new BottomSheetDialogView.State.a(qhgVar.c(), qhgVar.a(), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonView.a(qhgVar.b(), text, null, null, colorModel, colorModel2, colorModel3, false, z, null, 4094), new YbButtonView.a(text, objArr, objArr2, colorModel, colorModel2, colorModel3, null, z, false, null, 4094), null, null, null, null, null, null, 131064);
        if (this.bottomSheetDialogView == null) {
            BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(((r661) getBinding()).o().getContext(), null, 0, 6, null);
            bottomSheetDialogView.onPrimaryAction(new kjg(this, 2));
            bottomSheetDialogView.onSecondaryAction(new kjg(this, 8));
            bottomSheetDialogView.onDismiss(new dye(23, this));
            BottomSheetDialogView.show$default(bottomSheetDialogView, requireActivity(), null, 2, null);
            this.bottomSheetDialogView = bottomSheetDialogView;
            bottomSheetDialogView.render(state2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bottomSheet$lambda$49$lambda$48$lambda$45(DashboardFragment dashboardFragment, View view) {
        ((b) dashboardFragment.getViewModel()).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void bottomSheet$lambda$49$lambda$48$lambda$46(DashboardFragment dashboardFragment, View view) {
        ((b) dashboardFragment.getViewModel()).k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 bottomSheet$lambda$49$lambda$48$lambda$47(DashboardFragment dashboardFragment, boolean z) {
        ((b) dashboardFragment.getViewModel()).i0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean canScrollUp() {
        return ((r661) getBinding()).f.canScrollUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeViewsAccessibility(boolean isEnable) {
        r661 r661Var = (r661) getBinding();
        Iterator it = scc.g(r661Var.f.getRecycler(), r661Var.f.getAppBarLayout()).iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setImportantForAccessibility(isEnable ? 2 : 4);
        }
    }

    private final void cropTextView(TextView textView, float expandedPercentage) {
        float f = 100.0f - expandedPercentage;
        int i = this.paddingRightForPlusBalanceView;
        if (i > 0) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), (int) ((i * f) / 100.0f), textView.getPaddingBottom());
        }
    }

    private final void dismissBottomSheet() {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.bottomSheetDialogView = null;
    }

    private final gsx getLastItemScrollListener() {
        return (gsx) this.lastItemScrollListener.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gsx lastItemScrollListener_delegate$lambda$1(DashboardFragment dashboardFragment) {
        return new gsx(new jjg(dashboardFragment, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 lastItemScrollListener_delegate$lambda$1$lambda$0(DashboardFragment dashboardFragment) {
        ((b) dashboardFragment.getViewModel()).n0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$10(DashboardFragment dashboardFragment) {
        ((b) dashboardFragment.getViewModel()).t0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$11(DashboardFragment dashboardFragment) {
        ((b) dashboardFragment.getViewModel()).m0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a onViewCreated$lambda$14(YbButtonView.a aVar) {
        return new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_dashboard_deposit_button_title), null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final YbButtonView.a onViewCreated$lambda$15(YbButtonView.a aVar) {
        return new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_dashboard_withdraw_button_title), null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$17(DashboardFragment dashboardFragment, int i) {
        dashboardFragment.doOnViewIsNotDestroyed(new ys0(dashboardFragment, i, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$16(DashboardFragment dashboardFragment, int i) {
        dashboardFragment.paddingRightForPlusBalanceView = (((r661) dashboardFragment.getBinding()).l.getWidth() - ((r661) dashboardFragment.getBinding()).s.getWidth()) - i;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$7$lambda$5(r661 r661Var) {
        r661Var.f.getAppBarLayout().setExpanded(true, true);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$7$lambda$6(DashboardFragment dashboardFragment) {
        ((b) dashboardFragment.getViewModel()).h0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$9(DashboardFragment dashboardFragment, int i, float f, int i2, int i3, int i4, int i5, int i6, AppBarLayout appBarLayout, int i7) {
        float totalScrollRange = appBarLayout.getTotalScrollRange();
        float abs = 100.0f - ((100.0f / totalScrollRange) * Math.abs(i7));
        if (abs == 0.0f) {
            ((r661) dashboardFragment.getBinding()).l.setImportantForAccessibility(2);
            ((r661) dashboardFragment.getBinding()).b.setImportantForAccessibility(2);
            ((r661) dashboardFragment.getBinding()).c.setImportantForAccessibility(2);
        } else if (abs == 100.0f) {
            ((r661) dashboardFragment.getBinding()).l.setImportantForAccessibility(1);
            ((r661) dashboardFragment.getBinding()).b.setImportantForAccessibility(1);
            ((r661) dashboardFragment.getBinding()).c.setImportantForAccessibility(1);
        }
        ((r661) dashboardFragment.getBinding()).s.setEnabled(abs == 0.0f);
        LinearLayout linearLayout = ((r661) dashboardFragment.getBinding()).i;
        float abs2 = totalScrollRange - Math.abs(i7);
        float f2 = i5;
        float f3 = abs2 > f2 ? 1.0f : abs2 / f2;
        linearLayout.setTranslationY((1.0f - f3) * i6);
        linearLayout.setAlpha(f3);
        dashboardFragment.updateSubtitleTranslationAndScale(((r661) dashboardFragment.getBinding()).l, abs, totalScrollRange, i7, i, f);
        dashboardFragment.cropTextView(((r661) dashboardFragment.getBinding()).l, abs);
        dashboardFragment.updateSubtitleTranslationAndScale(((r661) dashboardFragment.getBinding()).c, abs, totalScrollRange, i7, i2, f);
        dashboardFragment.updateWalletIconTranslation(((r661) dashboardFragment.getBinding()).l.getTranslationX(), ((r661) dashboardFragment.getBinding()).c.getTranslationY(), abs, i3, i4);
        ((r661) dashboardFragment.getBinding()).b.updateAnimationByPercent(totalScrollRange, 100.0f - abs, i7, i);
        float max = Math.max(abs - HEADER_GONE_THRESHOLD_PERCENT, 0.0f);
        float f4 = max / 25.0f;
        ((r661) dashboardFragment.getBinding()).k.setAlpha(f4);
        ((r661) dashboardFragment.getBinding()).d.setAlpha(f4);
        ((r661) dashboardFragment.getBinding()).r.setAlpha(f4);
        ((r661) dashboardFragment.getBinding()).k.setVisibility(max == 0.0f ? 4 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void render$lambda$43$lambda$39(DashboardFragment dashboardFragment, r661 r661Var) {
        dashboardFragment.safePost(new hjg(r661Var, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$43$lambda$39$lambda$38(r661 r661Var) {
        if (!com.ybsdk.core.utils.ext.view.b.f(r661Var.f.getAppBarLayout())) {
            r661Var.f.getRecycler().scrollToPosition(0);
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderShimmer(fng viewState) {
        r661 r661Var = (r661) getBinding();
        llg k = viewState.k();
        r661Var.p.c.setVisibility(k.c() ? 0 : 8);
        r661Var.o.c.setVisibility(k.a() ? 0 : 8);
        r661Var.n.setVisibility(k.b() ? 0 : 8);
        r661Var.q.p().setVisibility(k.e() ? 0 : 8);
        r661Var.e.p().setVisibility(k.d() ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void scrollScreenToTop() {
        r661 r661Var = (r661) getBinding();
        boolean canScrollVertically = r661Var.f.getRecycler().canScrollVertically(-1);
        DashboardViewLayout dashboardViewLayout = r661Var.f;
        if (canScrollVertically) {
            dashboardViewLayout.getRecycler().smoothScrollToPosition(0);
        } else {
            dashboardViewLayout.getAppBarLayout().setExpanded(true, true);
        }
    }

    private final void setDashboardViewsAccessibilityEnabled(boolean z) {
        if (z != this.isDashboardViewsAccessibilityEnabled) {
            this.isDashboardViewsAccessibilityEnabled = z;
            changeViewsAccessibility(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupListeners() {
        r661 r661Var = (r661) getBinding();
        r661Var.m.setOnClickListener(new kjg(this, 0));
        int i = 1;
        r661Var.y.setOnClickListener(new kjg(this, i));
        DashboardViewLayout dashboardViewLayout = r661Var.f;
        dashboardViewLayout.setOnChildScrollUpCallback(new ljg(this));
        dashboardViewLayout.setOnRefreshListener(new ljg(this));
        r661Var.d.setOnClickListener(new kjg(this, 3));
        r661Var.t.setOnClickListener(new kjg(this, 4));
        r661Var.v.setOnClickListener(new kjg(this, 5));
        r661Var.s.setOnClickListener(new kjg(this, 6));
        ImageView imageView = r661Var.z;
        exa1.d(imageView, scc.g(new wo31(imageView), new vo31(imageView)), new jjg(this, i));
        r661Var.u.setOnClickListener(new kjg(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$31$lambda$21(DashboardFragment dashboardFragment, View view) {
        ((b) dashboardFragment.getViewModel()).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$31$lambda$22(DashboardFragment dashboardFragment, View view) {
        ((b) dashboardFragment.getViewModel()).w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupListeners$lambda$31$lambda$23(DashboardFragment dashboardFragment, CustomSwipeRefreshLayout customSwipeRefreshLayout, View view) {
        return dashboardFragment.canScrollUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$31$lambda$24(DashboardFragment dashboardFragment) {
        ((b) dashboardFragment.getViewModel()).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$31$lambda$25(DashboardFragment dashboardFragment, View view) {
        ((b) dashboardFragment.getViewModel()).l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$31$lambda$26(DashboardFragment dashboardFragment, View view) {
        ((b) dashboardFragment.getViewModel()).o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$31$lambda$27(DashboardFragment dashboardFragment, View view) {
        ((b) dashboardFragment.getViewModel()).u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setupListeners$lambda$31$lambda$29(DashboardFragment dashboardFragment) {
        ((b) dashboardFragment.getViewModel()).x0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$31$lambda$30(DashboardFragment dashboardFragment, View view) {
        ((b) dashboardFragment.getViewModel()).q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showAutoTopupTooltip(boolean profileButtonEnabled, boolean userAvatarButtonEnabled, boolean hasProfileTopButton) {
        if (hasProfileTopButton) {
            this.showProfileTooltipWhenReady = true;
            if (this.topButtonAdapter.f().isEmpty()) {
                return;
            }
            showAutotopupTooltip();
            return;
        }
        if (profileButtonEnabled) {
            showAutoTopupTooltip(((r661) getBinding()).t, Tooltip$PreferredGravity.END, rje.d(lwg0.ybsdk_tooltip_horizontal_padding, requireContext()));
            return;
        }
        if (userAvatarButtonEnabled) {
            showAutoTopupTooltip(((r661) getBinding()).z, Tooltip$PreferredGravity.START, -rje.d(lwg0.ybsdk_tooltip_horizontal_padding, requireContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAutotopupTooltip() {
        if (this.showProfileTooltipWhenReady) {
            safePost(new jjg(this, 4));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 showAutotopupTooltip$lambda$53(DashboardFragment dashboardFragment) {
        View findViewWithTag = ((r661) dashboardFragment.getBinding()).x.findViewWithTag(TopButtonTag.PROFILE);
        if (findViewWithTag != null) {
            dashboardFragment.showAutoTopupTooltip(findViewWithTag, Tooltip$PreferredGravity.END, rje.d(lwg0.ybsdk_tooltip_horizontal_padding, dashboardFragment.requireContext()));
            dashboardFragment.showProfileTooltipWhenReady = false;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 topButtonAdapter$lambda$4(DashboardFragment dashboardFragment, String str, TopButtonTag topButtonTag) {
        ((b) dashboardFragment.getViewModel()).v0(str, topButtonTag);
        return zy11.a;
    }

    private final void updateBackButtonVisibility() {
        boolean z = true;
        if (!((j0g) this.dashboardRemoteConfig).r() && ((ejg) this.visualParams).a() && dcs.b(this)) {
            z = false;
        }
        setBackButtonVisible(z);
    }

    private final void updateSubtitleTranslationAndScale(TextView textView, float expandedPercentage, float totalScrollRange, int verticalOffset, int collapsedBalanceX, float collapsedPlusBalanceTextSize) {
        float f = 100.0f - expandedPercentage;
        textView.setTranslationX((collapsedBalanceX / 100.0f) * f);
        textView.setTranslationY(((totalScrollRange - textView.getTop()) / 100.0f) * f);
        wnb1.b(totalScrollRange, kp50.w(collapsedPlusBalanceTextSize), verticalOffset, textView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateWalletIconTranslation(float balanceViewTranslationX, float subtitleTranslationY, float expandedPercentage, int expandedImageSize, int collapsedImageSize) {
        AppCompatImageView appCompatImageView = ((r661) getBinding()).A;
        appCompatImageView.setTranslationX(balanceViewTranslationX);
        appCompatImageView.setTranslationY(subtitleTranslationY);
        wnb1.a(appCompatImageView, expandedPercentage / 100.0f, expandedImageSize, collapsedImageSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uns0
    public boolean canSlideFrom(float positionX, float positionY) {
        if (getIsFragmentViewDestroyed()) {
            return false;
        }
        if (com.ybsdk.core.utils.ext.view.b.f(((r661) getBinding()).f.getAppBarLayout()) && !com.ybsdk.core.utils.ext.view.b.f(((r661) getBinding()).f.getRecycler())) {
            return false;
        }
        ((r661) getBinding()).f.getBinding().e.getLocalVisibleRect(this.transactionsToolbarPosition);
        ((r661) getBinding()).o().offsetDescendantRectToMyCoords(((r661) getBinding()).f.getBinding().e, this.transactionsToolbarPosition);
        return positionY <= ((float) this.transactionsToolbarPosition.bottom);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof ang) {
            ang angVar = (ang) sideEffect;
            showAutoTopupTooltip(angVar.b(), angVar.c(), angVar.a());
            ((b) getViewModel()).D0();
        } else if (sideEffect.equals(zmg.a)) {
            ((r661) getBinding()).f.setRefreshing(false);
        } else if (sideEffect instanceof bng) {
            ((b) getViewModel()).E0(((bng) sideEffect).a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public b getFactoryOfViewModel() {
        return ((eng) this.viewModelFactory).a((DashboardScreenParams) dcs.a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Bundle bundle;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null || (bundle = savedInstanceState.getBundle(INNER_RECYCLERS_STATE_BUNDLE)) == null) {
            bundle = new Bundle();
        }
        this.innerRecyclersState = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((b) getViewModel()).d0();
        this.accessibilityOrderList = null;
        dismissBottomSheet();
        ((r661) getBinding()).f.getRecycler().removeOnScrollListener(getLastItemScrollListener());
        ((r661) getBinding()).f.getRecycler().setAdapter(null);
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        ((b) getViewModel()).p0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ((b) getViewModel()).s0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        outState.putBundle(INNER_RECYCLERS_STATE_BUNDLE, this.innerRecyclersState);
        super.onSaveInstanceState(outState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int i = 1;
        if (!requireActivity().isChangingConfigurations()) {
            ((b) getViewModel()).B0(true);
        }
        ((b) getViewModel()).c0();
        updateBackButtonVisibility();
        setupListeners();
        r661 r661Var = (r661) getBinding();
        rjg rjgVar = new rjg(requireContext(), new hjg(r661Var, i));
        RecyclerView recyclerView = r661Var.x;
        DashboardViewLayout dashboardViewLayout = r661Var.f;
        recyclerView.addItemDecoration(new wsz0());
        r661Var.x.setAdapter(this.topButtonAdapter);
        dashboardViewLayout.getRecycler().setLayoutManager(rjgVar);
        dashboardViewLayout.getRecycler().setAdapter(this.adapter);
        dashboardViewLayout.getRecycler().addOnScrollListener(getLastItemScrollListener());
        dashboardViewLayout.setBottomButtonClickListener(new jjg(this, 5));
        final float d = rje.d(vvg0.ybsdk_textsize_body3, requireContext());
        final int d2 = getIsBackButtonVisible() ? rje.d(lwg0.ybsdk_dashboard_collapsed_balance_margin, requireContext()) : 0;
        final int d3 = getIsBackButtonVisible() ? rje.d(zvg0.ybsdk_dashboard_collapsed_subtitle_margin, requireContext()) : 0;
        final int i2 = -rje.d(lwg0.ybsdk_toolbar_height, requireContext());
        final int d4 = rje.d(lwg0.ybsdk_dashboard_logo_animation_threshold_margin_to_toolbar, requireContext()) + rje.d(lwg0.ybsdk_toolbar_height, requireContext());
        int i3 = 8;
        ((r661) getBinding()).i.setVisibility(!getIsBackButtonVisible() ? 0 : 8);
        final int d5 = rje.d(zvg0.ybsdk_dashboard_wallet_icon_collapsed_size, requireContext());
        final int d6 = rje.d(zvg0.ybsdk_dashboard_wallet_icon_expanded_size, requireContext());
        ((r661) getBinding()).f.addOnOffsetChangedListener(new ip2() { // from class: njg
            @Override // defpackage.gp2
            public final void a(AppBarLayout appBarLayout, int i4) {
                DashboardFragment.onViewCreated$lambda$9(DashboardFragment.this, d2, d, d3, d6, d5, d4, i2, appBarLayout, i4);
            }
        });
        ((r661) getBinding()).g.setPrimaryButtonOnClickListener(new jjg(this, 6));
        int i4 = 7;
        ((r661) getBinding()).g.setSecondaryButtonClickListener(new jjg(this, i4));
        ((r661) getBinding()).g.setChangeVisibilityWithDelay(false);
        Iterator it = scc.g(((r661) getBinding()).v, ((r661) getBinding()).t, ((r661) getBinding()).u).iterator();
        while (it.hasNext()) {
            ((AppCompatImageView) it.next()).setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), smg0.ybsdk_click_scale_animator));
        }
        r661 r661Var2 = (r661) getBinding();
        this.accessibilityOrderList = scc.g(r661Var2.i, r661Var2.x, r661Var2.l, r661Var2.c, r661Var2.b, r661Var2.r, r661Var2.d, r661Var2.m, r661Var2.y);
        final int d7 = rje.d(zvg0.ybsdk_screen_dashboard_padding_horizontal, requireContext());
        ((r661) getBinding()).m.render(new suf(i3));
        ((r661) getBinding()).y.render(new suf(i4));
        com.ybsdk.core.utils.ext.view.b.p(view, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ijg
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                DashboardFragment.onViewCreated$lambda$17(DashboardFragment.this, d7);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ce  */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void render(fng viewState) {
        TextView textView;
        CharSequence charSequence;
        Iterable iterable;
        String str;
        Spannable a;
        dq51 f;
        List<? extends View> list;
        r661 r661Var = (r661) getBinding();
        ErrorView errorView = r661Var.g;
        GradientTextView gradientTextView = r661Var.l;
        AppCompatImageView appCompatImageView = r661Var.v;
        YbCardIconView ybCardIconView = r661Var.d;
        TextView textView2 = r661Var.j;
        AppCompatImageView appCompatImageView2 = r661Var.h;
        DashboardViewLayout dashboardViewLayout = r661Var.f;
        YbButtonView ybButtonView = r661Var.y;
        YbButtonView ybButtonView2 = r661Var.m;
        AppCompatImageView appCompatImageView3 = r661Var.A;
        ImageView imageView = r661Var.z;
        TextView textView3 = r661Var.c;
        DashboardBalanceTextView dashboardBalanceTextView = r661Var.b;
        LinearLayout linearLayout = r661Var.k;
        errorView.render(viewState.g());
        TextView textView4 = r661Var.r;
        textView4.setVisibility(viewState.n() ? 0 : 8);
        TextView textView5 = ((r661) getBinding()).j;
        skg j = viewState.j();
        if (j != null) {
            Text b = j.b();
            textView = textView3;
            charSequence = d.a(requireContext(), b);
        } else {
            textView = textView3;
            charSequence = null;
        }
        textView5.setText(charSequence);
        ybButtonView2.setEnabled(!viewState.y());
        ybButtonView.setVisibility(viewState.w() ? 0 : 8);
        ybButtonView2.setVisibility(viewState.w() ? 0 : 8);
        ybButtonView.setEnabled(!viewState.y());
        if (linearLayout.getChildCount() > 0) {
            int i = 0 + 1;
            View childAt = linearLayout.getChildAt(0);
            if (childAt == null) {
                ny61.s();
                return;
            }
            if (i < linearLayout.getChildCount()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(childAt);
                while (true) {
                    if (!(i < linearLayout.getChildCount())) {
                        iterable = arrayList;
                        break;
                    }
                    int i2 = i + 1;
                    View childAt2 = linearLayout.getChildAt(i);
                    if (childAt2 == null) {
                        ny61.s();
                        return;
                    } else {
                        arrayList.add(childAt2);
                        i = i2;
                    }
                }
            } else {
                iterable = Collections.singletonList(childAt);
            }
        } else {
            iterable = EmptyList.a;
        }
        Iterable iterable2 = iterable;
        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
            Iterator it = iterable2.iterator();
            while (it.hasNext()) {
                if (((View) it.next()).getVisibility() != 8) {
                    break;
                }
            }
        }
        if (!viewState.k().b()) {
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            if (layoutParams == null) {
                ny61.t("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                return;
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
            layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, 0, ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            linearLayout.setLayoutParams(layoutParams2);
            linearLayout.setVisibility(8);
            renderShimmer(viewState);
            ((r661) getBinding()).b.setTextColor(viewState.c().get(requireContext()));
            ((r661) getBinding()).c.setTextColor(viewState.s().get(requireContext()));
            dashboardViewLayout.lockAppBar(viewState.i());
            if (viewState.d() != null) {
                dashboardViewLayout.hideBottomYbButtonView();
            } else {
                dashboardViewLayout.showBottomYbButtonView(viewState.d());
            }
            bottomSheet(viewState.e());
            if (viewState.u() == null) {
                appCompatImageView2.setVisibility(8);
                textView2.setVisibility(8);
                imageView.setVisibility(0);
                v4b1.k(viewState.u(), imageView, null, null, 6);
                r661Var.i.setContentDescription(getString(dzh0.ybsdk_settings_yandex_profile));
            } else {
                appCompatImageView2.setVisibility(viewState.j() != null ? 0 : 8);
                textView2.setVisibility(viewState.j() != null ? 0 : 8);
                skg j2 = viewState.j();
                v4b1.k(j2 != null ? j2.a() : null, appCompatImageView2, null, null, 6);
                imageView.setVisibility(8);
            }
            r661Var.t.setVisibility(!viewState.o() ? 0 : 8);
            ybCardIconView.setVisibility(!viewState.x() ? 0 : 8);
            dashboardBalanceTextView.setVisibility(!viewState.y() ? 4 : 0);
            v4b1.k(viewState.r().a(), appCompatImageView, null, null, 6);
            appCompatImageView.setContentDescription(d.a(sm91.c(r661Var), viewState.r().b()));
            gradientTextView.setVisibility(8);
            this.topButtonAdapter.h(viewState.t(), new oxe(9, this));
            ((r661) getBinding()).x.setVisibility(!viewState.m() ? 0 : 8);
            ((r661) getBinding()).w.setVisibility(!viewState.l() ? 0 : 8);
            if (viewState.i()) {
                TextView textView6 = textView;
                dashboardBalanceTextView.setText(viewState.b());
                xty0.b(gradientTextView);
                textView6.setVisibility(viewState.a() != null ? 0 : 8);
                appCompatImageView3.setVisibility(viewState.a() != null ? 0 : 8);
                Text a2 = viewState.a();
                a = rtu.a(new jiu(6), String.valueOf(a2 != null ? d.a(textView6.getContext(), a2) : null));
                textView6.setText(a);
                v4b1.k(viewState.v(), appCompatImageView3, null, null, 6);
                Text q = viewState.q();
                if (q != null) {
                    ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
                    if (layoutParams3 == null) {
                        ny61.t(str);
                        return;
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                    layoutParams4.setMargins(((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, kp50.r(4), ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
                    linearLayout.setLayoutParams(layoutParams4);
                    textView4.setText(d.a(sm91.c(r661Var), q));
                    xty0.e(textView4, viewState.p());
                }
                if (dashboardBalanceTextView.getImportantForAccessibility() == 1) {
                    com.ybsdk.core.utils.ext.view.b.m(dashboardBalanceTextView);
                }
                setDashboardViewsAccessibilityEnabled(viewState.g() == null);
                a7i0 a7i0Var = this.rateAppFeature;
                requireActivity();
                a7i0Var.getClass();
            } else {
                setDashboardViewsAccessibilityEnabled(false);
                textView.setVisibility(8);
                appCompatImageView3.setVisibility(8);
            }
            this.adapter.h(viewState.h(), new j9f(23, this, r661Var));
            f = viewState.f();
            if (f == null) {
                ybCardIconView.render(f);
            } else {
                ybCardIconView.setVisibility(8);
            }
            list = this.accessibilityOrderList;
            if (list == null) {
                hab1.d(list);
                return;
            }
            return;
        }
        str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        ViewGroup.LayoutParams layoutParams5 = linearLayout.getLayoutParams();
        if (layoutParams5 == null) {
            ny61.t(str);
            return;
        }
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        layoutParams6.setMargins(((ViewGroup.MarginLayoutParams) layoutParams6).leftMargin, rje.d(lwg0.ybsdk_dashboard_buttons_top_margin, requireContext()), ((ViewGroup.MarginLayoutParams) layoutParams6).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin);
        linearLayout.setLayoutParams(layoutParams6);
        linearLayout.setVisibility(0);
        renderShimmer(viewState);
        ((r661) getBinding()).b.setTextColor(viewState.c().get(requireContext()));
        ((r661) getBinding()).c.setTextColor(viewState.s().get(requireContext()));
        dashboardViewLayout.lockAppBar(viewState.i());
        if (viewState.d() != null) {
        }
        bottomSheet(viewState.e());
        if (viewState.u() == null) {
        }
        r661Var.t.setVisibility(!viewState.o() ? 0 : 8);
        ybCardIconView.setVisibility(!viewState.x() ? 0 : 8);
        dashboardBalanceTextView.setVisibility(!viewState.y() ? 4 : 0);
        v4b1.k(viewState.r().a(), appCompatImageView, null, null, 6);
        appCompatImageView.setContentDescription(d.a(sm91.c(r661Var), viewState.r().b()));
        gradientTextView.setVisibility(8);
        this.topButtonAdapter.h(viewState.t(), new oxe(9, this));
        ((r661) getBinding()).x.setVisibility(!viewState.m() ? 0 : 8);
        ((r661) getBinding()).w.setVisibility(!viewState.l() ? 0 : 8);
        if (viewState.i()) {
        }
        this.adapter.h(viewState.h(), new j9f(23, this, r661Var));
        f = viewState.f();
        if (f == null) {
        }
        list = this.accessibilityOrderList;
        if (list == null) {
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public r661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return r661.p(inflater, container);
    }

    private final void showAutoTopupTooltip(View view, Tooltip$PreferredGravity tooltipGravity, int offsetX) {
        buz0 d = frb1.d(requireContext());
        com.ybsdk.core.utils.text.b bVar = Text.Companion;
        int i = dzh0.ybsdk_card_card_autotopup_enabled;
        bVar.getClass();
        d.l(new Text.Resource(i));
        d.g(tooltipGravity);
        d.j(offsetX);
        d.a().f(view, 0L);
    }
}
