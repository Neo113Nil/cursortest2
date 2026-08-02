package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.transfer.version2.api.TransferRemoteConfig$DashboardTopButton$Type;
import com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation.view.GuidelinesWidgetView;
import com.ybsdk.widgets.common.bottombar.BottomBarNavigation;
import defpackage.anp0;
import defpackage.c1x0;
import defpackage.cjm0;
import defpackage.ctb;
import defpackage.dcs;
import defpackage.e960;
import defpackage.eja1;
import defpackage.gv01;
import defpackage.h5u;
import defpackage.ha61;
import defpackage.hab1;
import defpackage.hv01;
import defpackage.hw2;
import defpackage.i3y;
import defpackage.iv01;
import defpackage.jo01;
import defpackage.jv01;
import defpackage.kp50;
import defpackage.lfx;
import defpackage.m810;
import defpackage.mjt0;
import defpackage.mo01;
import defpackage.mob1;
import defpackage.mv01;
import defpackage.n751;
import defpackage.no01;
import defpackage.nv01;
import defpackage.ny61;
import defpackage.ov01;
import defpackage.p9g0;
import defpackage.pu01;
import defpackage.q4u;
import defpackage.qas0;
import defpackage.qu01;
import defpackage.rje;
import defpackage.ro01;
import defpackage.rv01;
import defpackage.sb6;
import defpackage.scc;
import defpackage.tb6;
import defpackage.tdr;
import defpackage.tfl0;
import defpackage.tn01;
import defpackage.vvg0;
import defpackage.w511;
import defpackage.w860;
import defpackage.xv01;
import defpackage.y6i0;
import defpackage.y8f;
import defpackage.ylb1;
import defpackage.yr31;
import defpackage.yv01;
import defpackage.z1x0;
import defpackage.zv01;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 {2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001|BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J!\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0003H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020)2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020)H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020)H\u0016¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020)H\u0016¢\u0006\u0004\b6\u00104J\u000f\u00107\u001a\u00020)H\u0016¢\u0006\u0004\b7\u00104J#\u0010<\u001a\u00020)*\b\u0012\u0004\u0012\u000209082\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020)H\u0002¢\u0006\u0004\b>\u00104J\u000f\u0010?\u001a\u00020)H\u0002¢\u0006\u0004\b?\u00104J\u001f\u0010C\u001a\u00020)2\u0006\u0010@\u001a\u00020:2\u0006\u0010B\u001a\u00020AH\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\"H\u0002¢\u0006\u0004\bE\u0010$J\u0019\u0010H\u001a\u00020\"*\b\u0012\u0004\u0012\u00020G0FH\u0002¢\u0006\u0004\bH\u0010IJ\u001b\u0010J\u001a\u0004\u0018\u00010G*\b\u0012\u0004\u0012\u00020G0FH\u0002¢\u0006\u0004\bJ\u0010KJ+\u0010N\u001a\u00020)2\f\u0010L\u001a\b\u0012\u0004\u0012\u000209082\f\u0010M\u001a\b\u0012\u0004\u0012\u00020908H\u0002¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010QR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010SR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010TR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010UR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010VR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001e\u0010a\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u001b\u0010g\u001a\u00020c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010Y\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010k\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u001e\u0010m\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010p\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010s\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u000209088BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0014\u0010z\u001a\u00020o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y¨\u0006}"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lha61;", "Lzv01;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/a;", "Ltdr;", "Lxv01;", "viewModelFactory", "Ltn01;", "qrContainerProvider", "Lro01;", ConfigConstants.CONFIG, "Lsb6;", "bottomBarReporter", "Lmjt0;", "sourceProvider", "Lanp0;", "sdkBottomSheetInsetsProvider", "Lw860;", "nfcPaymentController", "<init>", "(Lxv01;Ltn01;Lro01;Lsb6;Lmjt0;Lanp0;Lw860;)V", "createViewModel", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lha61;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "", "fitsSystemWindow", "()Z", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "(Lzv01;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onResume", "()V", "onPause", "onDestroyView", "onDetach", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardSlideableView;", "", "bottomSheetState", "safetySetState", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Ljava/lang/Integer;)V", "initSlideSubscription", "updateBoundary", "viewActualHeight", "", "maxBoundary", "adjustGuidelinesWidget", "(IF)V", "isGuidelinesWidgetFit", "", "Ljo01;", "containsNfcButton", "(Ljava/util/List;)Z", "getNfcButtonOrNull", "(Ljava/util/List;)Ljo01;", "previousBottomSheetBehaviour", "currentBottomSheetBehavior", "setBottomSheetBehaviour", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "Lxv01;", "Ltn01;", "Lro01;", "Lsb6;", "Lmjt0;", "Lanp0;", "Lw860;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardScreenParams;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardScreenParams;", "screenParams", "Lctb;", "Ltfl0;", "cicerone", "Lctb;", "accessibilityOrderList", "Ljava/util/List;", "Lhw2;", "navigator$delegate", "getNavigator", "()Lhw2;", "navigator", "Lno01;", "shutterSizes", "Lno01;", "shutterHalfExpandedRatio", "F", "_bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Lh5u;", "_halfStateCallback", "Lh5u;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$a;", "boundaryCallback", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$a;", "getBottomSheetBehavior", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "bottomSheetBehavior", "getHalfStateCallback", "()Lh5u;", "halfStateCallback", "Companion", "iv01", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransfersDashboardFragment extends BaseDivContextMvvmFragment<ha61, zv01, a> implements tdr {
    private static final iv01 Companion = new iv01();
    private static final int GUIDELINES_SLIDE_DISTANCE = kp50.r(32);
    private BottomSheetBehavior<TransfersDashboardSlideableView> _bottomSheetBehavior;
    private h5u _halfStateCallback;
    private List<? extends View> accessibilityOrderList;
    private final sb6 bottomBarReporter;
    private BottomSheetBehavior.a boundaryCallback;
    private final ctb cicerone;
    private final ro01 config;

    /* renamed from: navigator$delegate, reason: from kotlin metadata */
    private final i3y navigator;
    private final w860 nfcPaymentController;
    private final tn01 qrContainerProvider;

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private final anp0 sdkBottomSheetInsetsProvider;
    private final float shutterHalfExpandedRatio;
    private final no01 shutterSizes;
    private final mjt0 sourceProvider;
    private final xv01 viewModelFactory;

    public TransfersDashboardFragment(xv01 xv01Var, tn01 tn01Var, ro01 ro01Var, sb6 sb6Var, mjt0 mjt0Var, anp0 anp0Var, w860 w860Var) {
        super(Boolean.FALSE, null, null, null, a.class, 14, null);
        this.viewModelFactory = xv01Var;
        this.qrContainerProvider = tn01Var;
        this.config = ro01Var;
        this.bottomBarReporter = sb6Var;
        this.sourceProvider = mjt0Var;
        this.sdkBottomSheetInsetsProvider = anp0Var;
        this.screenParams = dcs.c(this);
        this.cicerone = ylb1.b(new tfl0());
        this.navigator = kotlin.a.a(new gv01(this, 0));
        no01 c = ((qu01) ro01Var).c();
        this.shutterSizes = c;
        this.shutterHalfExpandedRatio = c.e() ? c.d() : 0.5f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ a access$getViewModel(TransfersDashboardFragment transfersDashboardFragment) {
        return (a) transfersDashboardFragment.getViewModel();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void adjustGuidelinesWidget(int viewActualHeight, float maxBoundary) {
        ha61 ha61Var = (ha61) getBinding();
        GuidelinesWidgetView guidelinesWidgetView = ha61Var.g;
        BottomBarNavigation bottomBarNavigation = ha61Var.c;
        if (getBottomSheetBehavior().H() == 5) {
            guidelinesWidgetView.setAlpha(1.0f);
            guidelinesWidgetView.setTranslationY(bottomBarNavigation.getVisibility() == 0 ? bottomBarNavigation.getTop() - viewActualHeight : 0);
        } else {
            float c = y6i0.c(((viewActualHeight - ha61Var.d.getTop()) - r2) / (maxBoundary - (bottomBarNavigation.getHeight() + getBottomSheetBehavior().G())), 0.0f, 1.0f);
            guidelinesWidgetView.setAlpha(1.0f - c);
            guidelinesWidgetView.setTranslationY((c * GUIDELINES_SLIDE_DISTANCE) + (-r2));
        }
    }

    private final boolean containsNfcButton(List<jo01> list) {
        List<jo01> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (((jo01) it.next()).c() == TransferRemoteConfig$DashboardTopButton$Type.NFC) {
                return true;
            }
        }
        return false;
    }

    private final BottomSheetBehavior<TransfersDashboardSlideableView> getBottomSheetBehavior() {
        return this._bottomSheetBehavior;
    }

    /* renamed from: getHalfStateCallback, reason: from getter */
    private final h5u get_halfStateCallback() {
        return this._halfStateCallback;
    }

    private final hw2 getNavigator() {
        return (hw2) this.navigator.getValue();
    }

    private final jo01 getNfcButtonOrNull(List<jo01> list) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jo01) obj).c() == TransferRemoteConfig$DashboardTopButton$Type.NFC) {
                break;
            }
        }
        return null;
    }

    private final TransfersDashboardScreenParams getScreenParams() {
        return (TransfersDashboardScreenParams) this.screenParams.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$3$lambda$1(TransfersDashboardFragment transfersDashboardFragment) {
        ((a) transfersDashboardFragment.getViewModel()).g0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initSlideSubscription() {
        int b;
        ha61 ha61Var = (ha61) getBinding();
        BottomSheetBehavior<TransfersDashboardSlideableView> bottomSheetBehavior = getBottomSheetBehavior();
        if (!this.shutterSizes.e() || this.shutterSizes.c()) {
            ((c1x0) this.sourceProvider).getClass();
            b = ((cjm0) this.sdkBottomSheetInsetsProvider).b() / 2;
        } else {
            b = (int) ((1.0f - this.shutterHalfExpandedRatio) * ha61Var.b.getHeight());
        }
        bottomSheetBehavior.P(b);
        getBottomSheetBehavior().U(!this.shutterSizes.e() ? rje.d(vvg0.ybsdk_qr_reader_minimal_bottom_offset, requireContext()) : this.shutterSizes.b() ? m810.a(this.shutterSizes.a() * ha61Var.b.getHeight()) : m810.b(this.shutterHalfExpandedRatio * ha61Var.b.getHeight()));
        safePost(new gv01(this, 1));
        jv01 jv01Var = new jv01(this);
        getBottomSheetBehavior().v(jv01Var);
        this.boundaryCallback = jv01Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 initSlideSubscription$lambda$17$lambda$15(TransfersDashboardFragment transfersDashboardFragment) {
        transfersDashboardFragment.updateBoundary();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isGuidelinesWidgetFit() {
        mo01 b = ((qu01) this.config).b();
        return b != null && ((ha61) getBinding()).o().getHeight() >= kp50.r(b.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final hw2 navigator_delegate$lambda$0(TransfersDashboardFragment transfersDashboardFragment) {
        return new hw2(transfersDashboardFragment.requireActivity(), ((ha61) transfersDashboardFragment.getBinding()).f.getId(), transfersDashboardFragment.getChildFragmentManager(), ((pu01) transfersDashboardFragment.qrContainerProvider).a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$9$lambda$5(TransfersDashboardFragment transfersDashboardFragment, jo01 jo01Var) {
        if (jo01Var.c() == TransferRemoteConfig$DashboardTopButton$Type.NFC) {
            ((a) transfersDashboardFragment.getViewModel()).e0(jo01Var);
        }
        ((a) transfersDashboardFragment.getViewModel()).c0(jo01Var.a(), jo01Var.b().b());
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$9$lambda$8(TransfersDashboardFragment transfersDashboardFragment, tb6 tb6Var) {
        ((a) transfersDashboardFragment.getViewModel()).d0(tb6Var);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onViewCreated$lambda$9$updateNfcData(a aVar, List list, e960 e960Var, Continuation continuation) {
        aVar.h0(list, e960Var);
        return zy11.a;
    }

    private final void safetySetState(BottomSheetBehavior<TransfersDashboardSlideableView> bottomSheetBehavior, Integer num) {
        int H = bottomSheetBehavior.H();
        if ((num != null && H == num.intValue()) || num == null || num.intValue() == 2 || num.intValue() == 1) {
            return;
        }
        getBottomSheetBehavior().W(num.intValue());
    }

    private final void setBottomSheetBehaviour(BottomSheetBehavior<TransfersDashboardSlideableView> previousBottomSheetBehaviour, BottomSheetBehavior<TransfersDashboardSlideableView> currentBottomSheetBehavior) {
        currentBottomSheetBehavior.W(previousBottomSheetBehaviour.H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateBoundary() {
        int top;
        int i;
        ha61 ha61Var = (ha61) getBinding();
        ConstraintLayout o = ha61Var.o();
        TransfersDashboardSlideableView transfersDashboardSlideableView = ha61Var.d;
        int height = (o.getHeight() - o.getPaddingTop()) - o.getPaddingBottom();
        float height2 = ha61Var.b.getHeight() * this.shutterHalfExpandedRatio;
        BottomBarNavigation bottomBarNavigation = ha61Var.c;
        float height3 = height2 + bottomBarNavigation.getHeight();
        if (getBottomSheetBehavior().H() != 5) {
            top = transfersDashboardSlideableView.getTop();
        } else {
            if (bottomBarNavigation.getVisibility() != 0) {
                i = 0;
                ((pu01) this.qrContainerProvider).c(Integer.valueOf(i));
                ha61Var.e.setTranslationY(-Math.min(i, height3));
                transfersDashboardSlideableView.setErrorViewBoundary(Integer.valueOf((bottomBarNavigation.getVisibility() != 0 ? bottomBarNavigation.getTop() : ha61Var.o().getHeight()) - transfersDashboardSlideableView.getTop()));
                adjustGuidelinesWidget(height, height3);
            }
            top = bottomBarNavigation.getTop();
        }
        i = height - top;
        ((pu01) this.qrContainerProvider).c(Integer.valueOf(i));
        ha61Var.e.setTranslationY(-Math.min(i, height3));
        transfersDashboardSlideableView.setErrorViewBoundary(Integer.valueOf((bottomBarNavigation.getVisibility() != 0 ? bottomBarNavigation.getTop() : ha61Var.o().getHeight()) - transfersDashboardSlideableView.getTop()));
        adjustGuidelinesWidget(height, height3);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        ov01 ov01Var = sideEffect instanceof ov01 ? (ov01) sideEffect : null;
        if (ov01Var == null) {
            return;
        }
        if (ov01Var instanceof mv01) {
            getBottomSheetBehavior().S(this.shutterHalfExpandedRatio);
            getBottomSheetBehavior().W(4);
        } else if (!ov01Var.equals(nv01.a)) {
            w511.b();
        } else {
            getBottomSheetBehavior().S(this.shutterHalfExpandedRatio);
            getBottomSheetBehavior().W(6);
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((yv01) this.viewModelFactory).a(getScreenParams());
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public ha61 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        ha61 p = ha61.p(inflater, container);
        TransfersDashboardSlideableView transfersDashboardSlideableView = p.d;
        transfersDashboardSlideableView.setOnRetryClickListener(new gv01(this, 2));
        no01 no01Var = this.shutterSizes;
        if (!no01Var.e()) {
            no01Var = null;
        }
        transfersDashboardSlideableView.setShutterSizes(no01Var);
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        ConstraintLayout o = ((ha61) getBinding()).o();
        ViewGroup.LayoutParams layoutParams = o.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, insets.a.h(2).d);
        o.setLayoutParams(marginLayoutParams);
        return insets;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getBottomSheetBehavior().M(get_halfStateCallback());
        ((pu01) this.qrContainerProvider).c(null);
        BottomSheetBehavior.a aVar = this.boundaryCallback;
        if (aVar != null) {
            getBottomSheetBehavior().M(aVar);
        }
        this.boundaryCallback = null;
        this._halfStateCallback = null;
        this._bottomSheetBehavior = null;
        this.accessibilityOrderList = null;
        super.onDestroyView();
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        ((tfl0) this.cicerone.b()).e();
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.cicerone.a().a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.cicerone.a().b(getNavigator());
        b.m(((ha61) getBinding()).f);
        setStatusBarColorModel(new z1x0(new ColorModel.Raw(0), mob1.c(true, true)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [uc5] */
    /* JADX WARN: Type inference failed for: r1v12, types: [uc5] */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ha61 ha61Var = (ha61) getBinding();
        if (savedInstanceState == null) {
            ((tfl0) this.cicerone.b()).l(((pu01) this.qrContainerProvider).b(getScreenParams().getOrigin(), ((qu01) this.config).f(), getScreenParams().getAgreementId(), ((a) getViewModel()).b0(), getScreenParams().getAutopaymentId()));
        }
        TopButtonsListView topButtonsListView = ha61Var.e;
        BottomBarNavigation bottomBarNavigation = ha61Var.c;
        GuidelinesWidgetView guidelinesWidgetView = ha61Var.g;
        TransfersDashboardSlideableView transfersDashboardSlideableView = ha61Var.d;
        topButtonsListView.setClickListener(new hv01(this, 0));
        containsNfcButton(((qu01) this.config).a());
        BottomSheetBehavior<TransfersDashboardSlideableView> D = BottomSheetBehavior.D(transfersDashboardSlideableView);
        BottomSheetBehavior<TransfersDashboardSlideableView> bottomSheetBehavior = this._bottomSheetBehavior;
        if (bottomSheetBehavior != null) {
            setBottomSheetBehaviour(bottomSheetBehavior, D);
        }
        D.R();
        D.S(this.shutterHalfExpandedRatio);
        this._bottomSheetBehavior = D;
        this._halfStateCallback = new h5u(getBottomSheetBehavior(), this.shutterSizes);
        getBottomSheetBehavior().v(get_halfStateCallback());
        c.a(e.T(b.k(view), 1), eja1.s(getViewLifecycleOwner()), new p9g0(28, this, ha61Var));
        this.accessibilityOrderList = scc.g(ha61Var.f, guidelinesWidgetView, ha61Var.e, transfersDashboardSlideableView, bottomBarNavigation);
        bottomBarNavigation.setOnTabClickListener(new hv01(this, 1));
        transfersDashboardSlideableView.setDivkitActionHandler(new TransfersDashboardFragment$onViewCreated$1$6(getViewModel()));
        transfersDashboardSlideableView.setDivKitSkeletonsEnabled(((qu01) this.config).d());
        guidelinesWidgetView.setOnItemClickListener(new TransfersDashboardFragment$onViewCreated$1$7(getViewModel()));
        super.onViewCreated(view, savedInstanceState);
        ((a) getViewModel()).g0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(zv01 viewState) {
        ha61 ha61Var = (ha61) getBinding();
        BottomBarNavigation bottomBarNavigation = ha61Var.c;
        GuidelinesWidgetView guidelinesWidgetView = ha61Var.g;
        ((c1x0) this.sourceProvider).getClass();
        bottomBarNavigation.setVisibility(8);
        List<jo01> d = viewState.d();
        ha61Var.e.setData(d);
        ((a) getViewModel()).f0(getNfcButtonOrNull(d));
        ((c1x0) this.sourceProvider).getClass();
        ha61Var.d.render(viewState.a());
        guidelinesWidgetView.setVisibility(viewState.c() != null ? 0 : 8);
        q4u c = viewState.c();
        if (c != null) {
            guidelinesWidgetView.render(c);
        }
        List<? extends View> list = this.accessibilityOrderList;
        if (list != null) {
            hab1.d(list);
        }
        getBottomSheetBehavior().T(viewState.a().equals(rv01.a));
        safetySetState(getBottomSheetBehavior(), viewState.b());
        updateBoundary();
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
