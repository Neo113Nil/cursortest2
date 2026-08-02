package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.utils.animation.DefaultAnimatorListener;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardParams;
import com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4;
import com.ybsdk.widgets.common.ErrorView;
import defpackage.apn;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.fbm0;
import defpackage.g8m0;
import defpackage.gcm0;
import defpackage.h561;
import defpackage.hab1;
import defpackage.hcm0;
import defpackage.i3y;
import defpackage.icm0;
import defpackage.iwg0;
import defpackage.kcm0;
import defpackage.lcm0;
import defpackage.lfx;
import defpackage.lpn;
import defpackage.mbm0;
import defpackage.n751;
import defpackage.nbm0;
import defpackage.ny61;
import defpackage.obm0;
import defpackage.p7b1;
import defpackage.pbm0;
import defpackage.pz40;
import defpackage.qas0;
import defpackage.rje;
import defpackage.scc;
import defpackage.tbh0;
import defpackage.tbm0;
import defpackage.tja1;
import defpackage.uam0;
import defpackage.v4b1;
import defpackage.v4m0;
import defpackage.vam0;
import defpackage.vfc0;
import defpackage.vvg0;
import defpackage.w511;
import defpackage.xam0;
import defpackage.xon;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yam0;
import defpackage.yon;
import defpackage.yr31;
import defpackage.zon;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000·\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001O\b\u0000\u0018\u0000 e2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001fB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010$\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0012H\u0016¢\u0006\u0004\b&\u0010\u0014J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u001bJ\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u000200H\u0002¢\u0006\u0004\b6\u00102J\u0017\u00107\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b7\u0010\u001bJ\u0017\u00108\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b<\u0010;J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b=\u0010;J\u0017\u0010>\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b>\u0010;J\u001f\u0010B\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u00122\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\bD\u0010\u001bJ\u0017\u0010E\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\bE\u0010;J\u0017\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0012H\u0002¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u000eH\u0002¢\u0006\u0004\bI\u0010\u0010J\u0013\u0010K\u001a\u00020\u0012*\u00020JH\u0002¢\u0006\u0004\bK\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001b\u0010W\u001a\u00020R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006g"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/SavingsDashboardFragmentV4;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lh561;", "Llcm0;", "Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/c;", "Lce4;", "Lmbm0;", "viewModelFactory", "Lzon;", "educationsFeature", "<init>", "(Lmbm0;Lzon;)V", "createViewModel", "()Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/c;", "Lzy11;", "onStart", "()V", "onDestroyView", "", "fitsSystemWindow", "()Z", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "viewState", "render", "(Llcm0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lh561;", "onBackPressed", "", "progress", "viewBinding", "applyHeaderCornerRadius", "(FLh561;)V", "applyScreenBackground", "Lhcm0;", "renderError", "(Lhcm0;)V", "Lgcm0;", "renderContent", "(Lgcm0;)V", "Lkcm0;", "renderPromo", "(Lkcm0;)V", "renderEducationV2", "setVisibility", "applyInsets", "(Ln751;)V", "setupMotionLayout", "(Lh561;)V", "restoreMotionLayoutState", "setupListeners", "setupAccessibility", "isSpoilerVisible", "", "totalBalance", "updateHeaderBalanceAccessibility", "(ZLjava/lang/String;)V", "applyAccessibility", "adjustSwipeRefreshEnabledState", BackendConfig.Restrictions.ENABLED, "setSwipe", "(Z)V", "expandToolbarIfCollapsed", "Landroidx/recyclerview/widget/RecyclerView;", "hasOverflowingContent", "(Landroidx/recyclerview/widget/RecyclerView;)Z", "Lmbm0;", "Lzon;", "yam0", "motionTransitionListener", "Lyam0;", "Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/b;", "contentRecyclerHelper$delegate", "Li3y;", "getContentRecyclerHelper", "()Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/b;", "contentRecyclerHelper", "", "motionLayoutLastStateId", CA20Status.STATUS_USER_I, "Landroid/os/Parcelable;", "recyclerState", "Landroid/os/Parcelable;", "", "Landroid/view/View;", "accessibilityOrderList", "Ljava/util/List;", "Llpn;", "educationsV2View", "Llpn;", "Companion", "xam0", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsDashboardFragmentV4 extends BaseDivContextMvvmFragment<h561, lcm0, c> implements ce4 {
    private static final xam0 Companion = new xam0();

    @Deprecated
    public static final float PERCENT_0 = 0.0f;

    @Deprecated
    public static final float PERCENT_100 = 1.0f;
    private List<? extends View> accessibilityOrderList;

    /* renamed from: contentRecyclerHelper$delegate, reason: from kotlin metadata */
    private final i3y contentRecyclerHelper;
    private final zon educationsFeature;
    private lpn educationsV2View;
    private int motionLayoutLastStateId;
    private final yam0 motionTransitionListener;
    private Parcelable recyclerState;
    private final mbm0 viewModelFactory;

    public SavingsDashboardFragmentV4(mbm0 mbm0Var, zon zonVar) {
        super(null, null, null, null, c.class, 15, null);
        this.viewModelFactory = mbm0Var;
        this.educationsFeature = zonVar;
        this.motionTransitionListener = new yam0(this);
        this.contentRecyclerHelper = kotlin.a.a(new uam0(this, 4));
        this.motionLayoutLastStateId = tbh0.start;
        this.accessibilityOrderList = EmptyList.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ h561 access$getBinding(SavingsDashboardFragmentV4 savingsDashboardFragmentV4) {
        return (h561) savingsDashboardFragmentV4.getBinding();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ c access$getViewModel(SavingsDashboardFragmentV4 savingsDashboardFragmentV4) {
        return (c) savingsDashboardFragmentV4.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void adjustSwipeRefreshEnabledState(h561 viewBinding) {
        viewBinding.d.setEnabled(this.motionLayoutLastStateId == tbh0.start);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyAccessibility(lcm0 viewState) {
        List<? extends View> list;
        h561 h561Var = (h561) getBinding();
        if (viewState instanceof gcm0) {
            list = scc.g(h561Var.e, h561Var.j, h561Var.l, h561Var.h, h561Var.o);
        } else if (viewState instanceof kcm0) {
            list = scc.g(h561Var.e, h561Var.j, h561Var.h, h561Var.o);
        } else {
            if (!(viewState instanceof hcm0) && !(viewState instanceof icm0)) {
                w511.b();
                return;
            }
            list = EmptyList.a;
        }
        this.accessibilityOrderList = list;
        if (list.size() > 1) {
            hab1.d(this.accessibilityOrderList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHeaderCornerRadius(float progress, h561 viewBinding) {
        float h = (1.0f - progress) * com.ybsdk.core.utils.ext.view.b.h(iwg0.ybsdk_savings_dashboard_shimmer_corner_radius, viewBinding.o());
        Drawable background = viewBinding.g.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, h, h, h, h});
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyInsets(n751 insets) {
        int i = p7b1.f(insets).b;
        int i2 = p7b1.f(insets).d;
        androidx.constraintlayout.widget.e constraintSet = ((h561) getBinding()).n.getConstraintSet(tbh0.start);
        if (constraintSet != null) {
            constraintSet.w(tbh0.toolbarIconsContainer, 3, i);
        }
        androidx.constraintlayout.widget.e constraintSet2 = ((h561) getBinding()).n.getConstraintSet(tbh0.end);
        if (constraintSet2 != null) {
            constraintSet2.w(tbh0.toolbarIconsContainer, 3, i);
        }
        int d = rje.d(iwg0.ybsdk_savings_dashboard_v4_background_gradient_height, requireContext()) + i;
        androidx.constraintlayout.widget.e constraintSet3 = ((h561) getBinding()).n.getConstraintSet(tbh0.start);
        if (constraintSet3 != null) {
            constraintSet3.k(tbh0.backgroundGradient, d);
        }
        androidx.constraintlayout.widget.e constraintSet4 = ((h561) getBinding()).n.getConstraintSet(tbh0.end);
        if (constraintSet4 != null) {
            constraintSet4.k(tbh0.backgroundGradient, d);
        }
        ConstraintLayout constraintLayout = ((h561) getBinding()).i.b;
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, ((h561) getBinding()).j.getTop() + i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        constraintLayout.setLayoutParams(marginLayoutParams);
        MotionLayout motionLayout = ((h561) getBinding()).n;
        motionLayout.setPadding(motionLayout.getPaddingLeft(), motionLayout.getPaddingTop(), motionLayout.getPaddingRight(), i2);
        int h = com.ybsdk.core.utils.ext.view.b.h(vvg0.ybsdk_screen_footer_space_error_view, ((h561) getBinding()).o()) + i2;
        ErrorView errorView = ((h561) getBinding()).f;
        errorView.setPadding(errorView.getPaddingLeft(), i, errorView.getPaddingRight(), h);
        ((h561) getBinding()).n.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyScreenBackground(lcm0 viewState) {
        ((h561) getBinding()).d.setBackgroundColor(viewState.getBackgroundColor().get(requireContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r0v3, types: [uc5] */
    public static final b contentRecyclerHelper_delegate$lambda$1(SavingsDashboardFragmentV4 savingsDashboardFragmentV4) {
        Context requireContext = savingsDashboardFragmentV4.requireContext();
        c cVar = (c) savingsDashboardFragmentV4.getViewModel();
        c cVar2 = (c) savingsDashboardFragmentV4.getViewModel();
        return new b(requireContext, new SavingsDashboardFragmentV4$contentRecyclerHelper$2$1(savingsDashboardFragmentV4.getViewModel()), cVar, cVar2, new uam0(savingsDashboardFragmentV4, 3), new SavingsDashboardFragmentV4$contentRecyclerHelper$2$2(savingsDashboardFragmentV4.getViewModel()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 contentRecyclerHelper_delegate$lambda$1$lambda$0(SavingsDashboardFragmentV4 savingsDashboardFragmentV4) {
        if (savingsDashboardFragmentV4.motionLayoutLastStateId != tbh0.end && savingsDashboardFragmentV4.hasOverflowingContent(((h561) savingsDashboardFragmentV4.getBinding()).o)) {
            ((h561) savingsDashboardFragmentV4.getBinding()).n.transitionToEnd();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void expandToolbarIfCollapsed() {
        if (this.motionLayoutLastStateId == tbh0.end) {
            ((h561) getBinding()).n.transitionToStart();
        }
    }

    private final b getContentRecyclerHelper() {
        return (b) this.contentRecyclerHelper.getValue();
    }

    private final boolean hasOverflowingContent(RecyclerView recyclerView) {
        return recyclerView.computeVerticalScrollRange() > recyclerView.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderContent(gcm0 viewState) {
        xty0.d(((h561) getBinding()).j, viewState.c().c());
        ((h561) getBinding()).m.setAnimationEnabled(viewState.a());
        ((h561) getBinding()).m.setText(viewState.c().e());
        ((h561) getBinding()).l.setSpoilerStateListener(new vam0(0, this, viewState));
        v4b1.k(viewState.c().d(), ((h561) getBinding()).k, null, null, 6);
        ((h561) getBinding()).b.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{viewState.c().a().get(requireContext()), 0}));
        YbDivView.setData$default(((h561) getBinding()).h, viewState.c().b(), null, null, false, 14, null);
        getContentRecyclerHelper().a(viewState.d(), new uam0(this, 2));
        renderEducationV2(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContent$lambda$3(SavingsDashboardFragmentV4 savingsDashboardFragmentV4, gcm0 gcm0Var, boolean z) {
        savingsDashboardFragmentV4.updateHeaderBalanceAccessibility(z, gcm0Var.c().e());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderContent$lambda$6(SavingsDashboardFragmentV4 savingsDashboardFragmentV4) {
        savingsDashboardFragmentV4.doOnViewIsNotDestroyed(new uam0(savingsDashboardFragmentV4, 1));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderContent$lambda$6$lambda$5(SavingsDashboardFragmentV4 savingsDashboardFragmentV4) {
        Parcelable parcelable = savingsDashboardFragmentV4.recyclerState;
        if (parcelable != null) {
            RecyclerView.e layoutManager = ((h561) savingsDashboardFragmentV4.getBinding()).o.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.W0(parcelable);
            }
            savingsDashboardFragmentV4.recyclerState = null;
        }
        savingsDashboardFragmentV4.safeDoOnLayout(((h561) savingsDashboardFragmentV4.getBinding()).o, new g8m0(3, savingsDashboardFragmentV4));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderContent$lambda$6$lambda$5$lambda$4(SavingsDashboardFragmentV4 savingsDashboardFragmentV4, View view) {
        savingsDashboardFragmentV4.setSwipe((savingsDashboardFragmentV4.motionLayoutLastStateId == tbh0.start && com.ybsdk.core.utils.ext.view.b.f(((h561) savingsDashboardFragmentV4.getBinding()).o)) ? false : true);
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderEducationV2(gcm0 viewState) {
        yon b = viewState.b();
        if (b == null) {
            return;
        }
        lpn lpnVar = this.educationsV2View;
        if (lpnVar == null) {
            lpnVar = ((apn) this.educationsFeature).a().h(requireContext(), ((h561) getBinding()).o());
            this.educationsV2View = lpnVar;
            lpnVar.setScrollContext(new xon(((h561) getBinding()).o, viewState.d()));
            lpnVar.setOnDismissListener(new uam0(this, 0));
        }
        lpnVar.render(b);
        ((c) getViewModel()).g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderEducationV2$lambda$9$lambda$8(SavingsDashboardFragmentV4 savingsDashboardFragmentV4) {
        savingsDashboardFragmentV4.educationsV2View = null;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderError(hcm0 viewState) {
        ((h561) getBinding()).f.render(viewState.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderPromo(kcm0 viewState) {
        xty0.d(((h561) getBinding()).j, viewState.a().c());
        ((h561) getBinding()).m.setText(null);
        ((h561) getBinding()).l.setContentDescription(null);
        v4b1.k(viewState.a().d(), ((h561) getBinding()).k, null, null, 6);
        ((h561) getBinding()).b.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{viewState.a().a().get(requireContext()), 0}));
        YbDivView.setData$default(((h561) getBinding()).h, viewState.a().b(), null, null, false, 14, null);
        getContentRecyclerHelper().a(viewState.b(), new v4m0(1));
    }

    private final void restoreMotionLayoutState(h561 viewBinding) {
        viewBinding.n.setProgress(this.motionLayoutLastStateId == tbh0.end ? 1.0f : 0.0f);
        adjustSwipeRefreshEnabledState(viewBinding);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setSwipe(boolean enabled) {
        ((h561) getBinding()).n.enableTransition(tbh0.swipeTransition, enabled);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setVisibility(lcm0 viewState) {
        boolean z = viewState instanceof gcm0;
        boolean z2 = viewState instanceof kcm0;
        boolean z3 = viewState instanceof icm0;
        int i = 0;
        ((h561) getBinding()).g.setVisibility((z || z3) ? 0 : 8);
        ((h561) getBinding()).b.setVisibility((z || z2) ? 0 : 8);
        ((h561) getBinding()).k.setVisibility((z || z2) ? 0 : 8);
        ((h561) getBinding()).j.setVisibility((z || z2) ? 0 : 8);
        ((h561) getBinding()).h.setVisibility((z || z2) ? 0 : 8);
        ((h561) getBinding()).e.setVisibility((z || z2) ? 0 : 8);
        ((h561) getBinding()).l.setVisibility(z ? 0 : 8);
        ((h561) getBinding()).i.o().setVisibility(z3 ? 0 : 8);
        ((h561) getBinding()).c.setVisibility(z3 ? 0 : 8);
        ((h561) getBinding()).f.setVisibility(viewState instanceof hcm0 ? 0 : 8);
        RecyclerView recyclerView = ((h561) getBinding()).o;
        if (!z && !z2) {
            i = 4;
        }
        recyclerView.setImportantForAccessibility(i);
    }

    private final void setupAccessibility(h561 viewBinding) {
        tja1.b(viewBinding.e);
        tja1.b(viewBinding.l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v3, types: [uc5] */
    private final void setupListeners(h561 viewBinding) {
        viewBinding.f.setPrimaryButtonOnClickListener(new SavingsDashboardFragmentV4$setupListeners$1(getViewModel()));
        viewBinding.d.setOnRefreshListener(new vfc0(26, (c) getViewModel()));
        final int i = 0;
        viewBinding.e.setOnClickListener(new View.OnClickListener(this) { // from class: wam0
            public final /* synthetic */ SavingsDashboardFragmentV4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                SavingsDashboardFragmentV4 savingsDashboardFragmentV4 = this.b;
                switch (i2) {
                    case 0:
                        SavingsDashboardFragmentV4.setupListeners$lambda$13(savingsDashboardFragmentV4, view);
                        break;
                    default:
                        SavingsDashboardFragmentV4.setupListeners$lambda$14(savingsDashboardFragmentV4, view);
                        break;
                }
            }
        });
        viewBinding.h.setActionHandler(new SavingsDashboardFragmentV4$setupListeners$4(getViewModel()));
        final int i2 = 1;
        viewBinding.l.setOnClickListener(new View.OnClickListener(this) { // from class: wam0
            public final /* synthetic */ SavingsDashboardFragmentV4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                SavingsDashboardFragmentV4 savingsDashboardFragmentV4 = this.b;
                switch (i22) {
                    case 0:
                        SavingsDashboardFragmentV4.setupListeners$lambda$13(savingsDashboardFragmentV4, view);
                        break;
                    default:
                        SavingsDashboardFragmentV4.setupListeners$lambda$14(savingsDashboardFragmentV4, view);
                        break;
                }
            }
        });
        viewBinding.m.addAnimatorListener(new DefaultAnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.v4.SavingsDashboardFragmentV4$setupListeners$6
            @Override // com.ybsdk.core.utils.animation.DefaultAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                r0 r0Var;
                Object value;
                c access$getViewModel = SavingsDashboardFragmentV4.access$getViewModel(SavingsDashboardFragmentV4.this);
                com.ybsdk.feature.savings.internal.data.b bVar = (com.ybsdk.feature.savings.internal.data.b) access$getViewModel.H.b;
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = bVar.b.a.a.edit();
                edit.putLong("savings_dashboard_balance_animation_timestamp", currentTimeMillis);
                edit.apply();
                pz40 Y = access$getViewModel.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, fbm0.a((fbm0) value, null, null, null, 27)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$13(SavingsDashboardFragmentV4 savingsDashboardFragmentV4, View view) {
        ((c) savingsDashboardFragmentV4.getViewModel()).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$14(SavingsDashboardFragmentV4 savingsDashboardFragmentV4, View view) {
        ((c) savingsDashboardFragmentV4.getViewModel()).f0();
    }

    private final void setupMotionLayout(h561 viewBinding) {
        Iterator it = scc.g(Integer.valueOf(tbh0.start), Integer.valueOf(tbh0.end)).iterator();
        while (it.hasNext()) {
            androidx.constraintlayout.widget.e constraintSet = viewBinding.n.getConstraintSet(((Number) it.next()).intValue());
            if (constraintSet != null) {
                constraintSet.o(tbh0.headerBackground).c.c = 1;
                constraintSet.o(tbh0.backgroundGradient).c.c = 1;
                constraintSet.o(tbh0.headerShimmer).c.c = 1;
                constraintSet.o(tbh0.contentShimmer).c.c = 1;
                constraintSet.o(tbh0.headerTotalAmountSpoiler).c.c = 1;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void updateHeaderBalanceAccessibility(boolean isSpoilerVisible, String totalBalance) {
        ((h561) getBinding()).l.setContentDescription(isSpoilerVisible ? getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount) : getString(dzh0.ybsdk_savings_dashboard_accessibility_account_balance, totalBalance));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect.equals(obm0.a)) {
            ((h561) getBinding()).d.setRefreshing(false);
        } else if (sideEffect.equals(nbm0.a)) {
            ((h561) getBinding()).m.replayAnimation();
        } else if (sideEffect.equals(pbm0.a)) {
            expandToolbarIfCollapsed();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((tbm0) this.viewModelFactory).a((SavingsDashboardParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public h561 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        h561 p = h561.p(inflater, container);
        setupListeners(p);
        setupAccessibility(p);
        setupMotionLayout(p);
        restoreMotionLayoutState(p);
        p.n.addTransitionListener(this.motionTransitionListener);
        getContentRecyclerHelper().b(p.o);
        View view = p.g;
        view.setBackground(view.getBackground().mutate());
        applyHeaderCornerRadius(this.motionLayoutLastStateId == tbh0.end ? 1.0f : 0.0f, p);
        return p;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        applyInsets(insets);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((c) getViewModel()).e0();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.educationsV2View = null;
        RecyclerView.e layoutManager = ((h561) getBinding()).o.getLayoutManager();
        this.recyclerState = layoutManager != null ? layoutManager.X0() : null;
        ((h561) getBinding()).n.removeTransitionListener(this.motionTransitionListener);
        this.accessibilityOrderList = EmptyList.a;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((c) getViewModel()).i0();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(lcm0 viewState) {
        applyScreenBackground(viewState);
        setVisibility(viewState);
        if (viewState instanceof kcm0) {
            renderPromo((kcm0) viewState);
        } else if (viewState instanceof gcm0) {
            renderContent((gcm0) viewState);
        } else if (viewState instanceof hcm0) {
            renderError((hcm0) viewState);
        } else if (!(viewState instanceof icm0)) {
            w511.b();
            return;
        }
        setSwipe(viewState instanceof gcm0);
        applyAccessibility(viewState);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
