package com.ybsdk.feature.savings.internal.screens.dashboard;

import android.animation.Animator;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.animation.DefaultAnimatorListener;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2;
import com.ybsdk.feature.savings.internal.screens.dashboard.delegates.b;
import com.ybsdk.feature.savings.internal.views.SavingsAccountTickerView;
import defpackage.ajl0;
import defpackage.bab;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.dzh0;
import defpackage.ebm0;
import defpackage.g561;
import defpackage.g8m0;
import defpackage.hab1;
import defpackage.ibm0;
import defpackage.jbm0;
import defpackage.kbm0;
import defpackage.kyg0;
import defpackage.lfx;
import defpackage.mdm0;
import defpackage.ndm0;
import defpackage.pz40;
import defpackage.q8m;
import defpackage.qam0;
import defpackage.qas0;
import defpackage.ram0;
import defpackage.rbv;
import defpackage.s8m;
import defpackage.sam0;
import defpackage.scc;
import defpackage.tam0;
import defpackage.tbh0;
import defpackage.ubm0;
import defpackage.v4b1;
import defpackage.vbm0;
import defpackage.vfc0;
import defpackage.vng;
import defpackage.vxj0;
import defpackage.w511;
import defpackage.wbm0;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.ybm0;
import defpackage.yr31;
import defpackage.zbm0;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0099\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005*\u0001S\b\u0000\u0018\u0000 [2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\\B\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\u0016J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0002¢\u0006\u0004\b,\u0010\u0016J\u000f\u0010-\u001a\u00020\u0010H\u0002¢\u0006\u0004\b-\u0010\u0016J\u0017\u0010/\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00102\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\u00020\u00102\u0006\u00102\u001a\u0002012\u0006\u00105\u001a\u000201H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0010H\u0002¢\u0006\u0004\b8\u0010\u0016J\u0017\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u00020)H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0010H\u0002¢\u0006\u0004\b<\u0010\u0016J\u0017\u0010=\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b=\u0010$J\u0017\u0010>\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b>\u0010$J\u000f\u0010?\u001a\u00020\u0010H\u0002¢\u0006\u0004\b?\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010@R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u001e\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010V\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010Z¨\u0006]"}, d2 = {"Lcom/ybsdk/feature/savings/internal/screens/dashboard/SavingsDashboardFragmentV2;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lg561;", "Lzbm0;", "Lcom/ybsdk/feature/savings/internal/screens/dashboard/a;", "Lce4;", "Libm0;", "viewModelFactory", "Lmdm0;", "savingsRemoteConfig", "<init>", "(Libm0;Lmdm0;)V", "createViewModel", "()Lcom/ybsdk/feature/savings/internal/screens/dashboard/a;", "Landroid/os/Bundle;", "outState", "Lzy11;", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "onStart", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lg561;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "viewState", "render", "(Lzbm0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "", "onBackPressed", "()Z", "setupListeners", "initRecyclerView", "Lybm0;", "setSavingsDescriptionTexts", "(Lybm0;)V", "", "from", "onChangeCellPositionInitiated", "(I)V", "to", "changeCellPosition", "(II)V", "saveFinalCellsOrder", "isSpoilerVisible", "updateAccessibility", "(Z)V", "buildAccessibilityOrderList", "setVisibility", "changeShimmerVisibility", "adjustSwipeRefreshEnabledState", "Libm0;", "Lmdm0;", "Lq8m;", "dragAndDropOnboardingAnimationHelper", "Lq8m;", "Ls8m;", "dragAndDropOnboardingAnimationHelperV2", "Ls8m;", "innerRecyclersState", "Landroid/os/Bundle;", "", "accessibilityOrderList", "Ljava/util/List;", "isAppBarCollapsedWhileItemDragging", "Z", "isOnboardingAnimating", "Lcom/ybsdk/feature/savings/internal/screens/dashboard/delegates/b;", "recyclerHelper", "Lcom/ybsdk/feature/savings/internal/screens/dashboard/delegates/b;", "tam0", "motionTransitionListener", "Ltam0;", "motionLayoutLastStateId", CA20Status.STATUS_USER_I, "", "motionLayoutTransitionProgress", "Ljava/lang/Float;", "Companion", "sam0", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SavingsDashboardFragmentV2 extends BaseDivContextMvvmFragment<g561, zbm0, a> implements ce4 {
    public static final sam0 Companion = new sam0();
    private static final String INNER_RECYCLERS_STATE_BUNDLE = "inner_recyclers_states_bundle";
    private List<? extends View> accessibilityOrderList;
    private final q8m dragAndDropOnboardingAnimationHelper;
    private final s8m dragAndDropOnboardingAnimationHelperV2;
    private Bundle innerRecyclersState;
    private boolean isAppBarCollapsedWhileItemDragging;
    private boolean isOnboardingAnimating;
    private int motionLayoutLastStateId;
    private Float motionLayoutTransitionProgress;
    private final tam0 motionTransitionListener;
    private final b recyclerHelper;
    private final mdm0 savingsRemoteConfig;
    private final ibm0 viewModelFactory;

    public SavingsDashboardFragmentV2(ibm0 ibm0Var, mdm0 mdm0Var) {
        super(Boolean.TRUE, null, null, null, a.class, 14, null);
        this.viewModelFactory = ibm0Var;
        this.savingsRemoteConfig = mdm0Var;
        this.dragAndDropOnboardingAnimationHelper = new q8m();
        this.dragAndDropOnboardingAnimationHelperV2 = new s8m();
        this.innerRecyclersState = new Bundle();
        this.recyclerHelper = new b(new bab(8, this), new g8m0(2, this));
        this.motionTransitionListener = new tam0(this);
        this.motionLayoutLastStateId = tbh0.start;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ a access$getViewModel(SavingsDashboardFragmentV2 savingsDashboardFragmentV2) {
        return (a) savingsDashboardFragmentV2.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void adjustSwipeRefreshEnabledState() {
        ((g561) getBinding()).o().setEnabled(this.motionLayoutLastStateId == tbh0.start);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void buildAccessibilityOrderList() {
        g561 g561Var = (g561) getBinding();
        this.accessibilityOrderList = scc.g(g561Var.q, g561Var.m, g561Var.p, g561Var.k, g561Var.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void changeCellPosition(int from, int to) {
        ((a) getViewModel()).h0(from, to);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeShimmerVisibility(zbm0 viewState) {
        if (((ndm0) this.savingsRemoteConfig).d()) {
            ((g561) getBinding()).o.render(viewState.a());
        } else {
            ((g561) getBinding()).o.setVisibility(viewState instanceof wbm0 ? 0 : 8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initRecyclerView() {
        this.recyclerHelper.b(((g561) getBinding()).i);
        ((g561) getBinding()).i.setItemAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onChangeCellPositionInitiated(int from) {
        ((a) getViewModel()).i0(from);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean recyclerHelper$lambda$0(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, Uri uri) {
        return ((a) savingsDashboardFragmentV2.getViewModel()).j0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 render$lambda$10(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, zbm0 zbm0Var) {
        savingsDashboardFragmentV2.doOnViewIsNotDestroyed(new ram0(savingsDashboardFragmentV2, zbm0Var, 0));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$10$lambda$9(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, zbm0 zbm0Var) {
        int i = 0;
        if (savingsDashboardFragmentV2.motionLayoutLastStateId == tbh0.start) {
            ((g561) savingsDashboardFragmentV2.getBinding()).i.scrollToPosition(0);
        }
        savingsDashboardFragmentV2.safeDoOnLayout(((g561) savingsDashboardFragmentV2.getBinding()).i, new vxj0(29, zbm0Var, savingsDashboardFragmentV2));
        savingsDashboardFragmentV2.recyclerHelper.a(((g561) savingsDashboardFragmentV2.getBinding()).i, new SavingsDashboardFragmentV2$render$1$1$2(savingsDashboardFragmentV2), new SavingsDashboardFragmentV2$render$1$1$3(savingsDashboardFragmentV2), new SavingsDashboardFragmentV2$render$1$1$4(savingsDashboardFragmentV2), new qam0(savingsDashboardFragmentV2, i));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$10$lambda$9$lambda$7(zbm0 zbm0Var, SavingsDashboardFragmentV2 savingsDashboardFragmentV2, View view) {
        ((g561) savingsDashboardFragmentV2.getBinding()).g.enableTransition(tbh0.savingsDashboardCollapseTransition, ((ybm0) zbm0Var).k() == null && !(savingsDashboardFragmentV2.motionLayoutLastStateId == tbh0.start && com.ybsdk.core.utils.ext.view.b.f(((g561) savingsDashboardFragmentV2.getBinding()).i)));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$10$lambda$9$lambda$8(SavingsDashboardFragmentV2 savingsDashboardFragmentV2) {
        if (!savingsDashboardFragmentV2.isAppBarCollapsedWhileItemDragging) {
            ((g561) savingsDashboardFragmentV2.getBinding()).g.transitionToEnd();
            savingsDashboardFragmentV2.isAppBarCollapsedWhileItemDragging = true;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void render$lambda$13(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, zbm0 zbm0Var) {
        if (((ndm0) savingsDashboardFragmentV2.savingsRemoteConfig).b()) {
            savingsDashboardFragmentV2.dragAndDropOnboardingAnimationHelperV2.b((ybm0) zbm0Var, (g561) savingsDashboardFragmentV2.getBinding(), new qam0(savingsDashboardFragmentV2, 1));
        } else {
            savingsDashboardFragmentV2.dragAndDropOnboardingAnimationHelper.b((ybm0) zbm0Var, (g561) savingsDashboardFragmentV2.getBinding(), new qam0(savingsDashboardFragmentV2, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$13$lambda$11(SavingsDashboardFragmentV2 savingsDashboardFragmentV2) {
        ((a) savingsDashboardFragmentV2.getViewModel()).k0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 render$lambda$13$lambda$12(SavingsDashboardFragmentV2 savingsDashboardFragmentV2) {
        ((a) savingsDashboardFragmentV2.getViewModel()).k0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void saveFinalCellsOrder() {
        this.isAppBarCollapsedWhileItemDragging = false;
        ((a) getViewModel()).q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setSavingsDescriptionTexts(ybm0 viewState) {
        AppCompatTextView appCompatTextView = ((g561) getBinding()).k;
        Text f = viewState.f();
        if (f == null) {
            f = Text.Empty.INSTANCE;
        }
        appCompatTextView.setText(d.a(requireContext(), f));
        ((g561) getBinding()).k.setTextAppearance(viewState.i());
        SpoilerTextView spoilerTextView = ((g561) getBinding()).l;
        Text h = viewState.h();
        Drawable drawable = null;
        spoilerTextView.setText(h != null ? d.a(requireContext(), h) : null);
        SpoilerTextView spoilerTextView2 = ((g561) getBinding()).l;
        ColorModel g = viewState.g();
        if (g != null) {
            int i = g.get(requireContext());
            Drawable t = vng.t(kyg0.ybsdk_savings_dashboard_description_balance_background, requireContext());
            if (t != null) {
                t.setTint(i);
                drawable = t;
            }
        }
        spoilerTextView2.setBackground(drawable);
        ((g561) getBinding()).k.setTextColor(viewState.o().a().get(requireContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setVisibility(zbm0 viewState) {
        ((g561) getBinding()).f.setVisibility(viewState instanceof vbm0 ? 0 : 8);
        changeShimmerVisibility(viewState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [uc5] */
    private final void setupListeners() {
        final int i = 0;
        ((g561) getBinding()).j.setOnClickListener(new View.OnClickListener(this) { // from class: pam0
            public final /* synthetic */ SavingsDashboardFragmentV2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                SavingsDashboardFragmentV2 savingsDashboardFragmentV2 = this.b;
                switch (i2) {
                    case 0:
                        SavingsDashboardFragmentV2.setupListeners$lambda$2(savingsDashboardFragmentV2, view);
                        break;
                    case 1:
                        SavingsDashboardFragmentV2.setupListeners$lambda$4(savingsDashboardFragmentV2, view);
                        break;
                    case 2:
                        SavingsDashboardFragmentV2.setupListeners$lambda$5(savingsDashboardFragmentV2, view);
                        break;
                    default:
                        SavingsDashboardFragmentV2.setupListeners$lambda$6(savingsDashboardFragmentV2, view);
                        break;
                }
            }
        });
        ((g561) getBinding()).f.setPrimaryButtonOnClickListener(new SavingsDashboardFragmentV2$setupListeners$2(getViewModel()));
        ((g561) getBinding()).o().setOnRefreshListener(new vfc0(25, this));
        final int i2 = 1;
        ((g561) getBinding()).k.setOnClickListener(new View.OnClickListener(this) { // from class: pam0
            public final /* synthetic */ SavingsDashboardFragmentV2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                SavingsDashboardFragmentV2 savingsDashboardFragmentV2 = this.b;
                switch (i22) {
                    case 0:
                        SavingsDashboardFragmentV2.setupListeners$lambda$2(savingsDashboardFragmentV2, view);
                        break;
                    case 1:
                        SavingsDashboardFragmentV2.setupListeners$lambda$4(savingsDashboardFragmentV2, view);
                        break;
                    case 2:
                        SavingsDashboardFragmentV2.setupListeners$lambda$5(savingsDashboardFragmentV2, view);
                        break;
                    default:
                        SavingsDashboardFragmentV2.setupListeners$lambda$6(savingsDashboardFragmentV2, view);
                        break;
                }
            }
        });
        final int i3 = 2;
        ((g561) getBinding()).l.setOnClickListener(new View.OnClickListener(this) { // from class: pam0
            public final /* synthetic */ SavingsDashboardFragmentV2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                SavingsDashboardFragmentV2 savingsDashboardFragmentV2 = this.b;
                switch (i22) {
                    case 0:
                        SavingsDashboardFragmentV2.setupListeners$lambda$2(savingsDashboardFragmentV2, view);
                        break;
                    case 1:
                        SavingsDashboardFragmentV2.setupListeners$lambda$4(savingsDashboardFragmentV2, view);
                        break;
                    case 2:
                        SavingsDashboardFragmentV2.setupListeners$lambda$5(savingsDashboardFragmentV2, view);
                        break;
                    default:
                        SavingsDashboardFragmentV2.setupListeners$lambda$6(savingsDashboardFragmentV2, view);
                        break;
                }
            }
        });
        final int i4 = 3;
        ((g561) getBinding()).q.setOnClickListener(new View.OnClickListener(this) { // from class: pam0
            public final /* synthetic */ SavingsDashboardFragmentV2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i4;
                SavingsDashboardFragmentV2 savingsDashboardFragmentV2 = this.b;
                switch (i22) {
                    case 0:
                        SavingsDashboardFragmentV2.setupListeners$lambda$2(savingsDashboardFragmentV2, view);
                        break;
                    case 1:
                        SavingsDashboardFragmentV2.setupListeners$lambda$4(savingsDashboardFragmentV2, view);
                        break;
                    case 2:
                        SavingsDashboardFragmentV2.setupListeners$lambda$5(savingsDashboardFragmentV2, view);
                        break;
                    default:
                        SavingsDashboardFragmentV2.setupListeners$lambda$6(savingsDashboardFragmentV2, view);
                        break;
                }
            }
        });
        ((g561) getBinding()).j.addAnimatorListener(new DefaultAnimatorListener() { // from class: com.ybsdk.feature.savings.internal.screens.dashboard.SavingsDashboardFragmentV2$setupListeners$7
            @Override // com.ybsdk.core.utils.animation.DefaultAnimatorListener, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                r0 r0Var;
                Object value;
                a access$getViewModel = SavingsDashboardFragmentV2.access$getViewModel(SavingsDashboardFragmentV2.this);
                com.ybsdk.feature.savings.internal.data.b bVar = (com.ybsdk.feature.savings.internal.data.b) access$getViewModel.I.b;
                long currentTimeMillis = System.currentTimeMillis();
                SharedPreferences.Editor edit = bVar.b.a.a.edit();
                edit.putLong("savings_dashboard_balance_animation_timestamp", currentTimeMillis);
                edit.apply();
                pz40 Y = access$getViewModel.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, ebm0.a((ebm0) value, null, false, null, false, null, null, 0, false, false, null, 895)));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$2(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, View view) {
        ((a) savingsDashboardFragmentV2.getViewModel()).g0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$3(SavingsDashboardFragmentV2 savingsDashboardFragmentV2) {
        ((a) savingsDashboardFragmentV2.getViewModel()).p0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$4(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, View view) {
        ((a) savingsDashboardFragmentV2.getViewModel()).m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$5(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, View view) {
        ((a) savingsDashboardFragmentV2.getViewModel()).m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void setupListeners$lambda$6(SavingsDashboardFragmentV2 savingsDashboardFragmentV2, View view) {
        ((a) savingsDashboardFragmentV2.getViewModel()).n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void updateAccessibility(boolean isSpoilerVisible) {
        ((g561) getBinding()).k.setContentDescription(((Object) ((g561) getBinding()).k.getText()) + " " + ((Object) ((g561) getBinding()).l.getText()));
        ((g561) getBinding()).p.setContentDescription(isSpoilerVisible ? getString(dzh0.ybsdk_spoilers_accessibility_spoiler_hidden_amount) : String.valueOf(((g561) getBinding()).j.getText()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect.equals(kbm0.a)) {
            ((g561) getBinding()).o().setRefreshing(false);
        } else if (sideEffect.equals(jbm0.a)) {
            ((g561) getBinding()).j.replayAnimation();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((ubm0) this.viewModelFactory).a((SavingsDashboardParams) dcs.a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((a) getViewModel()).f0();
        return true;
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
        this.accessibilityOrderList = null;
        ((g561) getBinding()).i.setAdapter(null);
        this.motionLayoutTransitionProgress = Float.valueOf((float) Math.rint(((g561) getBinding()).g.getProgress()));
        ((g561) getBinding()).g.removeTransitionListener(this.motionTransitionListener);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        outState.putBundle(INNER_RECYCLERS_STATE_BUNDLE, this.innerRecyclersState);
        super.onSaveInstanceState(outState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ((a) getViewModel()).l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecyclerView();
        setupListeners();
        buildAccessibilityOrderList();
        Float f = this.motionLayoutTransitionProgress;
        if (f != null) {
            ((g561) getBinding()).g.setProgress(f.floatValue());
        }
        this.motionLayoutTransitionProgress = null;
        ((g561) getBinding()).g.addTransitionListener(this.motionTransitionListener);
        adjustSwipeRefreshEnabledState();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(zbm0 viewState) {
        if (viewState instanceof vbm0) {
            ((g561) getBinding()).f.render(((vbm0) viewState).b());
            setVisibility(viewState);
        } else if (viewState instanceof wbm0) {
            setVisibility(viewState);
        } else {
            if (!(viewState instanceof ybm0)) {
                w511.b();
                return;
            }
            setVisibility(viewState);
            ybm0 ybm0Var = (ybm0) viewState;
            ((g561) getBinding()).j.setAnimationEnabled(ybm0Var.b());
            SavingsAccountTickerView savingsAccountTickerView = ((g561) getBinding()).j;
            MoneyEntity e = ybm0Var.e();
            savingsAccountTickerView.setText(e != null ? e.getFormattedAmount() : null);
            ((g561) getBinding()).p.setVisibility(ybm0Var.e() != null ? 0 : 8);
            xty0.d(((g561) getBinding()).m, ybm0Var.l());
            xty0.d(((g561) getBinding()).h, ybm0Var.k());
            ((g561) getBinding()).h.setVisibility(ybm0Var.k() != null ? 0 : 8);
            v4b1.k(ybm0Var.j(), ((g561) getBinding()).n, null, null, 6);
            setSavingsDescriptionTexts(ybm0Var);
            ((g561) getBinding()).g.enableTransition(tbh0.savingsDashboardCollapseTransition, false);
            this.recyclerHelper.c(ybm0Var.c(), ybm0Var.d(), new ram0(this, viewState, 1));
            if (ybm0Var.m() && !this.isOnboardingAnimating) {
                this.isOnboardingAnimating = true;
                ((g561) getBinding()).i.scrollToPosition(0);
                ((g561) getBinding()).j.post(new ajl0(9, this, viewState));
            }
            rbv n = ybm0Var.n();
            if (n != null) {
                v4b1.k(n, ((g561) getBinding()).q, null, null, 6);
            }
            ((g561) getBinding()).l.setSpoilerStateListener(new SavingsDashboardFragmentV2$render$3(this));
        }
        List<? extends View> list = this.accessibilityOrderList;
        if (list != null) {
            hab1.d(list);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public g561 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return g561.p(inflater, container);
    }
}
