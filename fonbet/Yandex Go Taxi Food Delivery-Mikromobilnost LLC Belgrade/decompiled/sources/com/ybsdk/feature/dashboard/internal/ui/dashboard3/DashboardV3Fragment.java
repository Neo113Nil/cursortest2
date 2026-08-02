package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ybsdk.core.analytics.generated.delegates.DashboardEvents$DashboardErrorStateType;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.a10;
import defpackage.a7i0;
import defpackage.amg;
import defpackage.apn;
import defpackage.bmg;
import defpackage.bvf0;
import defpackage.ce4;
import defpackage.cmg;
import defpackage.dcs;
import defpackage.dlg;
import defpackage.dmg;
import defpackage.e7n;
import defpackage.eja1;
import defpackage.ejg;
import defpackage.emg;
import defpackage.er31;
import defpackage.gmg;
import defpackage.h960;
import defpackage.ha60;
import defpackage.hc5;
import defpackage.hf8;
import defpackage.hkg;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.i470;
import defpackage.j0g;
import defpackage.jmg;
import defpackage.jw00;
import defpackage.kp50;
import defpackage.lb7;
import defpackage.lfx;
import defpackage.lig;
import defpackage.lpn;
import defpackage.lzz0;
import defpackage.mig;
import defpackage.n751;
import defpackage.ny61;
import defpackage.ola1;
import defpackage.on70;
import defpackage.p7b1;
import defpackage.pmg;
import defpackage.psp0;
import defpackage.pz40;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qmg;
import defpackage.qsz0;
import defpackage.qx21;
import defpackage.rcc;
import defpackage.rmg;
import defpackage.rsf;
import defpackage.s661;
import defpackage.sd90;
import defpackage.smg;
import defpackage.spl;
import defpackage.suf;
import defpackage.t661;
import defpackage.ta60;
import defpackage.tje;
import defpackage.uh6;
import defpackage.umg;
import defpackage.utz0;
import defpackage.v4b1;
import defpackage.v8e;
import defpackage.vmg;
import defpackage.vtz0;
import defpackage.w511;
import defpackage.w860;
import defpackage.wtz0;
import defpackage.xon;
import defpackage.xty0;
import defpackage.xtz0;
import defpackage.y5e;
import defpackage.y8f;
import defpackage.ylg;
import defpackage.yon;
import defpackage.yr31;
import defpackage.zhg;
import defpackage.zlg;
import defpackage.zon;
import defpackage.zy11;
import java.util.concurrent.Executors;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\b\u0000\u0018\u0000 \u0088\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0003|\u0089\u0001Be\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0019\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0014¢\u0006\u0004\b+\u0010,J!\u00101\u001a\u00020\u00022\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0014¢\u0006\u0004\b1\u00102J!\u00105\u001a\u00020(2\u0006\u00104\u001a\u0002032\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u001eH\u0016¢\u0006\u0004\b7\u0010 J\u0017\u00109\u001a\u00020(2\u0006\u00108\u001a\u00020\u0003H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020(2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020(H\u0016¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u001eH\u0002¢\u0006\u0004\bA\u0010 J\u000f\u0010B\u001a\u00020(H\u0002¢\u0006\u0004\bB\u0010@J\u0017\u0010C\u001a\u00020(2\u0006\u00108\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010:J\u0017\u0010D\u001a\u00020(2\u0006\u00108\u001a\u00020\u0003H\u0002¢\u0006\u0004\bD\u0010:J\u001f\u0010I\u001a\u00020(2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bI\u0010JJ\u001b\u0010K\u001a\u00020(2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\bK\u0010:J\u0017\u0010L\u001a\u00020(2\u0006\u0010H\u001a\u00020GH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020(H\u0002¢\u0006\u0004\bN\u0010@J\u000f\u0010O\u001a\u00020(H\u0002¢\u0006\u0004\bO\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010QR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010RR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010SR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010TR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010UR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010VR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010XR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010YR\u001b\u0010_\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u0016\u0010`\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR)\u0010m\u001a\u0010\u0012\f\u0012\n i*\u0004\u0018\u00010h0h0g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010\\\u001a\u0004\bk\u0010lR)\u0010p\u001a\u0010\u0012\f\u0012\n i*\u0004\u0018\u00010h0h0g8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bn\u0010\\\u001a\u0004\bo\u0010lR!\u0010v\u001a\b\u0012\u0004\u0012\u00020r0q8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010\\\u001a\u0004\bt\u0010uR\u001b\u0010{\u001a\u00020w8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010\\\u001a\u0004\by\u0010zR\u0018\u0010}\u001a\u00060|R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0016\u0010\u007f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010aR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0083\u0001\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010aR%\u0010\u0086\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020r0\u0085\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardV3Fragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Ls661;", "Lvmg;", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/d;", "Lce4;", "", "Lsmg;", "factoryOfViewModel", "Lylg;", "factoryOfAnalyticsInteractor", "Lw860;", "nfcPaymentController", "Lta60;", "nfcWidgetsFactory", "Ldlg;", "dashboardRemoteConfig", "Lha60;", "nfcSupportChecker", "Lpsp0;", "visualParams", "Lzon;", "educationsFeature", "Lmig;", "bottomSheetInteractor", "La7i0;", "rateAppFeature", "remoteConfig", "<init>", "(Lsmg;Lylg;Lw860;Lta60;Ldlg;Lha60;Lpsp0;Lzon;Lmig;La7i0;Ldlg;)V", "", "willPostponeEnterTransition", "()Z", "fitsSystemWindow", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/d;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ls661;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onBackPressed", "viewState", "render", "(Lvmg;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onDestroyView", "()V", "shouldBackButtonVisibility", "setWidgetsAnimator", "renderEducationV2", "renderContent", "Lxtz0;", "toolbarState", "Ljmg;", "nfcType", "renderToolbar", "(Lxtz0;Ljmg;)V", "renderRefreshLayout", "preparePaymentToken", "(Ljmg;)V", "requestFocusOnFirstItem", "showRateAppBottomSheet", "Lsmg;", "Lylg;", "Lw860;", "Lta60;", "Ldlg;", "Lha60;", "Lpsp0;", "Lzon;", "Lmig;", "La7i0;", "Lzlg;", "analyticsInteractor$delegate", "Li3y;", "getAnalyticsInteractor", "()Lzlg;", "analyticsInteractor", "isRvAnimationActive", "Z", "Llpn;", "educationsV2View", "Llpn;", "previousViewState", "Lvmg;", "Lqa3;", "Lqsz0;", "kotlin.jvm.PlatformType", "leftToolbarButtonAdapter$delegate", "getLeftToolbarButtonAdapter", "()Lqa3;", "leftToolbarButtonAdapter", "rightToolbarButtonAdapter$delegate", "getRightToolbarButtonAdapter", "rightToolbarButtonAdapter", "Le7n;", "Lgc5;", "widgetsAdapter$delegate", "getWidgetsAdapter", "()Le7n;", "widgetsAdapter", "Ljw00;", "toolbarButtonsMarginDecorator$delegate", "getToolbarButtonsMarginDecorator", "()Ljw00;", "toolbarButtonsMarginDecorator", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/a;", "transitionHelper", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/a;", "isRecyclerScrollEnabled", "Llig;", "dashboardCollapsedAnimation", "Llig;", "initialDataComplete", "Lpz40;", "", "adapterProxy", "Lpz40;", "Companion", "emg", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DashboardV3Fragment extends BaseDivContextMvvmFragment<s661, vmg, d> implements ce4 {
    private static final emg Companion = new emg();

    @Deprecated
    public static final long START_POSTPONED_ENTER_TRANSITION_TIMEOUT = 600;
    private final pz40 adapterProxy;

    /* renamed from: analyticsInteractor$delegate, reason: from kotlin metadata */
    private final i3y analyticsInteractor;
    private final mig bottomSheetInteractor;
    private lig dashboardCollapsedAnimation;
    private final dlg dashboardRemoteConfig;
    private final zon educationsFeature;
    private lpn educationsV2View;
    private final ylg factoryOfAnalyticsInteractor;
    private final smg factoryOfViewModel;
    private boolean initialDataComplete;
    private boolean isRecyclerScrollEnabled;
    private boolean isRvAnimationActive;

    /* renamed from: leftToolbarButtonAdapter$delegate, reason: from kotlin metadata */
    private final i3y leftToolbarButtonAdapter;
    private final w860 nfcPaymentController;
    private final ha60 nfcSupportChecker;
    private final ta60 nfcWidgetsFactory;
    private vmg previousViewState;
    private final a7i0 rateAppFeature;

    /* renamed from: rightToolbarButtonAdapter$delegate, reason: from kotlin metadata */
    private final i3y rightToolbarButtonAdapter;

    /* renamed from: toolbarButtonsMarginDecorator$delegate, reason: from kotlin metadata */
    private final i3y toolbarButtonsMarginDecorator;
    private final a transitionHelper;
    private final psp0 visualParams;

    /* renamed from: widgetsAdapter$delegate, reason: from kotlin metadata */
    private final i3y widgetsAdapter;

    public DashboardV3Fragment(smg smgVar, ylg ylgVar, w860 w860Var, ta60 ta60Var, dlg dlgVar, ha60 ha60Var, psp0 psp0Var, zon zonVar, mig migVar, a7i0 a7i0Var, dlg dlgVar2) {
        super(null, null, null, null, d.class, 15, null);
        this.factoryOfViewModel = smgVar;
        this.factoryOfAnalyticsInteractor = ylgVar;
        this.dashboardRemoteConfig = dlgVar;
        this.nfcSupportChecker = ha60Var;
        this.visualParams = psp0Var;
        this.educationsFeature = zonVar;
        this.bottomSheetInteractor = migVar;
        this.rateAppFeature = a7i0Var;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.analyticsInteractor = kotlin.a.b(lazyThreadSafetyMode, new dmg(this, 2));
        this.leftToolbarButtonAdapter = kotlin.a.b(lazyThreadSafetyMode, new dmg(this, 3));
        int i = 4;
        this.rightToolbarButtonAdapter = kotlin.a.b(lazyThreadSafetyMode, new dmg(this, i));
        this.widgetsAdapter = kotlin.a.b(lazyThreadSafetyMode, new dmg(this, 5));
        this.toolbarButtonsMarginDecorator = kotlin.a.b(lazyThreadSafetyMode, new rsf(i));
        this.transitionHelper = new a(this, dlgVar2);
        this.adapterProxy = bvf0.c(EmptyList.a);
    }

    public static final /* synthetic */ w860 access$getNfcPaymentController$p(DashboardV3Fragment dashboardV3Fragment) {
        dashboardV3Fragment.getClass();
        return null;
    }

    public static final /* synthetic */ ta60 access$getNfcWidgetsFactory$p(DashboardV3Fragment dashboardV3Fragment) {
        dashboardV3Fragment.getClass();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ d access$getViewModel(DashboardV3Fragment dashboardV3Fragment) {
        return (d) dashboardV3Fragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zlg analyticsInteractor_delegate$lambda$0(DashboardV3Fragment dashboardV3Fragment) {
        return ((amg) dashboardV3Fragment.factoryOfAnalyticsInteractor).a(b.a((DashboardV3Params) dcs.a(dashboardV3Fragment)));
    }

    private final zlg getAnalyticsInteractor() {
        return (zlg) this.analyticsInteractor.getValue();
    }

    private final qa3 getLeftToolbarButtonAdapter() {
        return (qa3) this.leftToolbarButtonAdapter.getValue();
    }

    private final qa3 getRightToolbarButtonAdapter() {
        return (qa3) this.rightToolbarButtonAdapter.getValue();
    }

    private final jw00 getToolbarButtonsMarginDecorator() {
        return (jw00) this.toolbarButtonsMarginDecorator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e7n getWidgetsAdapter() {
        return (e7n) this.widgetsAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 leftToolbarButtonAdapter_delegate$lambda$2(DashboardV3Fragment dashboardV3Fragment) {
        a10 a = hc5.a();
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new qa3(new lb7(9, y5e.b, a), on70.b(new bmg(dashboardV3Fragment, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 leftToolbarButtonAdapter_delegate$lambda$2$lambda$1(DashboardV3Fragment dashboardV3Fragment, qsz0 qsz0Var) {
        ((d) dashboardV3Fragment.getViewModel()).p0(qsz0Var.d(), qsz0Var.c());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$14(DashboardV3Fragment dashboardV3Fragment) {
        ((d) dashboardV3Fragment.getViewModel()).o0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$17$lambda$15(DashboardV3Fragment dashboardV3Fragment) {
        ((d) dashboardV3Fragment.getViewModel()).m0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onViewCreated$lambda$17$lambda$16(DashboardV3Fragment dashboardV3Fragment) {
        ((d) dashboardV3Fragment.getViewModel()).n0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$18(DashboardV3Fragment dashboardV3Fragment, String str, Bundle bundle) {
        ((d) dashboardV3Fragment.getViewModel()).j0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$19(DashboardV3Fragment dashboardV3Fragment) {
        ((d) dashboardV3Fragment.getViewModel()).j0();
        return zy11.a;
    }

    private final void preparePaymentToken(jmg nfcType) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderContent(vmg viewState) {
        this.isRvAnimationActive = viewState.g();
        ((s661) getBinding()).f.render(viewState.b());
        ((r0) this.adapterProxy).l(viewState.c());
        ((s661) getBinding()).e.setVisibility((viewState.f() == null || viewState.h()) ? 8 : 0);
        lzz0 f = viewState.f();
        if (f != null) {
            ((s661) getBinding()).e.render(f);
        }
        this.isRecyclerScrollEnabled = viewState.k();
        DashboardEvents$DashboardErrorStateType dashboardEvents$DashboardErrorStateType = viewState.b() != null ? DashboardEvents$DashboardErrorStateType.FULLSCREEN : ((s661) getBinding()).e.getVisibility() == 0 ? DashboardEvents$DashboardErrorStateType.BOTTOM_WITH_CARD : null;
        if (dashboardEvents$DashboardErrorStateType != null) {
            getAnalyticsInteractor().c(dashboardEvents$DashboardErrorStateType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderEducationV2(vmg viewState) {
        s661 s661Var = (s661) getBinding();
        yon a = viewState.a();
        if (a == null) {
            return;
        }
        lpn lpnVar = this.educationsV2View;
        if (lpnVar == null) {
            lpnVar = ((apn) this.educationsFeature).a().h(requireContext(), ((s661) getBinding()).o());
            this.educationsV2View = lpnVar;
            lpnVar.setScrollContext(new xon(viewState.c(), s661Var.p, s661Var.b));
            lpnVar.setOnDismissListener(new dmg(this, 1));
        }
        lpnVar.render(a);
        ((d) getViewModel()).l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 renderEducationV2$lambda$26$lambda$25$lambda$24(DashboardV3Fragment dashboardV3Fragment) {
        dashboardV3Fragment.educationsV2View = null;
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderRefreshLayout(vmg viewState) {
        ((s661) getBinding()).h.setEnabled(viewState != null ? viewState.i() : true);
        ((s661) getBinding()).h.setRefreshing(viewState != null ? viewState.j() : false);
    }

    public static /* synthetic */ void renderRefreshLayout$default(DashboardV3Fragment dashboardV3Fragment, vmg vmgVar, int i, Object obj) {
        if ((i & 1) != 0) {
            vmgVar = dashboardV3Fragment.previousViewState;
        }
        dashboardV3Fragment.renderRefreshLayout(vmgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar(xtz0 toolbarState, jmg nfcType) {
        lig ligVar = this.dashboardCollapsedAnimation;
        if (ligVar != null) {
            ligVar.b();
        }
        boolean z = toolbarState instanceof wtz0;
        ((s661) getBinding()).n.o().setVisibility(z ? 0 : 8);
        ((s661) getBinding()).n.c.setVisibility((getIsBackButtonVisible() || ((j0g) this.dashboardRemoteConfig).r()) ? 8 : 0);
        ((s661) getBinding()).c.setVisibility(!z ? 0 : 4);
        ((s661) getBinding()).o.p().setVisibility(toolbarState.a() ? 0 : 8);
        ((s661) getBinding()).l.bind(nfcType);
        ((s661) getBinding()).l.setVisibility(!toolbarState.a() ? 0 : 8);
        boolean z2 = toolbarState instanceof utz0;
        EmptyList emptyList = EmptyList.a;
        if (!z2) {
            if (toolbarState instanceof wtz0) {
                t661 t661Var = ((s661) getBinding()).n;
                getRightToolbarButtonAdapter().g(emptyList);
                getLeftToolbarButtonAdapter().g(emptyList);
                t661Var.c.setVisibility(((wtz0) toolbarState).b() ? 0 : 8);
                t661Var.d.setVisibility(0);
                return;
            }
            if (!(toolbarState instanceof vtz0)) {
                w511.b();
                return;
            }
            t661 t661Var2 = ((s661) getBinding()).n;
            t661Var2.c.setVisibility(8);
            t661Var2.d.setVisibility(8);
            return;
        }
        setBackButtonVisible(shouldBackButtonVisibility() || ((utz0) toolbarState).g());
        if (getIsBackButtonVisible()) {
            getLeftToolbarButtonAdapter().g(emptyList);
            qa3 rightToolbarButtonAdapter = getRightToolbarButtonAdapter();
            ListBuilder a = rcc.a();
            utz0 utz0Var = (utz0) toolbarState;
            a.addAll(utz0Var.d());
            a.addAll(utz0Var.c());
            rightToolbarButtonAdapter.g(a.j());
        } else {
            utz0 utz0Var2 = (utz0) toolbarState;
            getLeftToolbarButtonAdapter().g(utz0Var2.c());
            getRightToolbarButtonAdapter().g(utz0Var2.d());
        }
        utz0 utz0Var3 = (utz0) toolbarState;
        xty0.d(((s661) getBinding()).k, utz0Var3.f());
        xty0.d(((s661) getBinding()).j, utz0Var3.e());
        ((s661) getBinding()).j.setVisibility(com.ybsdk.core.utils.text.d.b(utz0Var3.e()) ? 0 : 8);
        v4b1.k(utz0Var3.b(), ((s661) getBinding()).m, null, null, 6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void requestFocusOnFirstItem() {
        safePost(new dmg(this, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 requestFocusOnFirstItem$lambda$32(DashboardV3Fragment dashboardV3Fragment) {
        if (((s661) dashboardV3Fragment.getBinding()).p.getChildCount() > 0) {
            com.ybsdk.core.utils.ext.view.b.m(uh6.v(((s661) dashboardV3Fragment.getBinding()).p, 0));
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 rightToolbarButtonAdapter_delegate$lambda$4(DashboardV3Fragment dashboardV3Fragment) {
        a10 a = hc5.a();
        synchronized (y5e.a) {
            try {
                if (y5e.b == null) {
                    y5e.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return new qa3(new lb7(9, y5e.b, a), on70.b(new bmg(dashboardV3Fragment, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 rightToolbarButtonAdapter_delegate$lambda$4$lambda$3(DashboardV3Fragment dashboardV3Fragment, qsz0 qsz0Var) {
        ((d) dashboardV3Fragment.getViewModel()).p0(qsz0Var.d(), qsz0Var.c());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setWidgetsAnimator() {
        safePost(new dmg(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 setWidgetsAnimator$lambda$22(DashboardV3Fragment dashboardV3Fragment) {
        if (dashboardV3Fragment.isRvAnimationActive && ((s661) dashboardV3Fragment.getBinding()).p.getItemAnimator() == null) {
            OrientationAwareRecyclerView orientationAwareRecyclerView = ((s661) dashboardV3Fragment.getBinding()).p;
            hkg hkgVar = new hkg();
            hkgVar.g = true;
            orientationAwareRecyclerView.setItemAnimator(hkgVar);
        }
        return zy11.a;
    }

    private final boolean shouldBackButtonVisibility() {
        return (!((j0g) this.dashboardRemoteConfig).r() && ((ejg) this.visualParams).a() && dcs.b(this)) ? false : true;
    }

    private final void showRateAppBottomSheet() {
        a7i0 a7i0Var = this.rateAppFeature;
        requireActivity();
        a7i0Var.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jw00 toolbarButtonsMarginDecorator_delegate$lambda$11() {
        return new jw00(0, kp50.r(12), 0, new suf(13), 5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean toolbarButtonsMarginDecorator_delegate$lambda$11$lambda$10(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r5v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r6v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r7v0, types: [uc5] */
    public static final e7n widgetsAdapter_delegate$lambda$9(DashboardV3Fragment dashboardV3Fragment) {
        return new e7n(hc5.a(), ola1.c(new cmg(dashboardV3Fragment, 1)), zhg.a(new rsf(5), new DashboardV3Fragment$widgetsAdapter$2$4(dashboardV3Fragment.getViewModel()), new DashboardV3Fragment$widgetsAdapter$2$2(dashboardV3Fragment.getViewModel()), new DashboardV3Fragment$widgetsAdapter$2$3(dashboardV3Fragment.getViewModel())), i470.a(new dmg(dashboardV3Fragment, 8)), sd90.b(), er31.b(new dmg(dashboardV3Fragment, 9), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean widgetsAdapter_delegate$lambda$9$lambda$5(DashboardV3Fragment dashboardV3Fragment, Uri uri, spl splVar) {
        return ((d) dashboardV3Fragment.getViewModel()).k0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h960 widgetsAdapter_delegate$lambda$9$lambda$7(DashboardV3Fragment dashboardV3Fragment) {
        dashboardV3Fragment.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 widgetsAdapter_delegate$lambda$9$lambda$8(DashboardV3Fragment dashboardV3Fragment) {
        ((d) dashboardV3Fragment.getViewModel()).o0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof rmg) {
            rmg rmgVar = (rmg) sideEffect;
            if (rmgVar.b()) {
                getAnalyticsInteractor().c(DashboardEvents$DashboardErrorStateType.SNACKBAR);
            }
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), rmgVar.a(), null, 12);
            return;
        }
        if (sideEffect instanceof qmg) {
            showRateAppBottomSheet();
        } else if (sideEffect instanceof pmg) {
            ((d) getViewModel()).s0(((pmg) sideEffect).a());
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public d getFactoryOfViewModel() {
        return ((umg) this.factoryOfViewModel).a((DashboardV3Params) dcs.a(this), getAnalyticsInteractor());
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public s661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        s661 p = s661.p(inflater, container);
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new DashboardV3Fragment$getViewBinding$1$1(p, this, null), 3);
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        int i = p7b1.f(insets).b;
        int i2 = p7b1.f(insets).d;
        CoordinatorLayout coordinatorLayout = ((s661) getBinding()).d;
        ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, i2);
        coordinatorLayout.setLayoutParams(marginLayoutParams);
        return insets;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        lpn lpnVar = this.educationsV2View;
        boolean z = lpnVar != null;
        if (lpnVar == null) {
            ((d) getViewModel()).h0();
            return z;
        }
        lpnVar.dismiss();
        this.educationsV2View = null;
        return z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tje.N(eja1.s(this), null, null, new DashboardV3Fragment$onCreate$1(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.dashboardCollapsedAnimation = null;
        this.educationsV2View = null;
        super.onDestroyView();
        ((d) getViewModel()).r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.transitionHelper.a();
        ((d) getViewModel()).q0();
        setBackButtonVisible(shouldBackButtonVisibility());
        s661 s661Var = (s661) getBinding();
        s661Var.i.addItemDecoration(getToolbarButtonsMarginDecorator());
        s661Var.i.setAdapter(getRightToolbarButtonAdapter());
        RecyclerView recyclerView = s661Var.g;
        recyclerView.addItemDecoration(getToolbarButtonsMarginDecorator());
        recyclerView.setAdapter(getLeftToolbarButtonAdapter());
        OrientationAwareRecyclerView orientationAwareRecyclerView = s661Var.p;
        orientationAwareRecyclerView.setItemAnimator(null);
        orientationAwareRecyclerView.setConfig(((d) getViewModel()).f0());
        qx21.b(orientationAwareRecyclerView);
        orientationAwareRecyclerView.setAdapter(getWidgetsAdapter());
        final Context context = getContext();
        orientationAwareRecyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3Fragment$onViewCreated$1$1
            {
                this.Q = false;
            }
        });
        orientationAwareRecyclerView.addOnItemTouchListener(new gmg(this));
        ((s661) getBinding()).f.setPrimaryButtonOnClickListener(new dmg(this, 10));
        ((s661) getBinding()).f.setSecondaryButtonClickListener(new dmg(this, 11));
        int i = 0;
        ((s661) getBinding()).f.setChangeVisibilityWithDelay(false);
        s661Var.h.setOnRefreshListener(new v8e(8, this));
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new DashboardV3Fragment$onViewCreated$2(this, null), 3);
        tje.N(eja1.s(getViewLifecycleOwner()), null, null, new DashboardV3Fragment$onViewCreated$3(this, null), 3);
        hua1.g(this, "SETTINGS_TERM_FRAGMENT_CLOSED_RESULT_KEY", new cmg(this, i));
        ((hf8) this.bottomSheetInteractor).a(getViewLifecycleOwner().getLifecycle(), new dmg(this, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(vmg viewState) {
        preparePaymentToken(viewState.d());
        renderRefreshLayout(viewState);
        renderToolbar(viewState.e(), viewState.d());
        renderContent(viewState);
        renderEducationV2(viewState);
        this.previousViewState = viewState;
        if (viewState.g()) {
            getAnalyticsInteractor().a();
        }
    }

    public boolean willPostponeEnterTransition() {
        return this.transitionHelper.c();
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
