package com.ybsdk.feature.main.internal.screens.sbpAccount;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.main.api.SbpAccountInfoScreenParams;
import com.ybsdk.feature.main.internal.screens.sbpAccount.SbpAccountInfoFragment;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.c861;
import defpackage.ce4;
import defpackage.dcs;
import defpackage.gem0;
import defpackage.hem0;
import defpackage.hua1;
import defpackage.iem0;
import defpackage.if6;
import defpackage.j0t0;
import defpackage.j6m0;
import defpackage.jem0;
import defpackage.kem0;
import defpackage.kp50;
import defpackage.lem0;
import defpackage.lfx;
import defpackage.mem0;
import defpackage.mnh0;
import defpackage.n751;
import defpackage.nem0;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.oem0;
import defpackage.p1b;
import defpackage.pem0;
import defpackage.qas0;
import defpackage.qem0;
import defpackage.w511;
import defpackage.xdm0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zdm0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001-B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010\fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/ybsdk/feature/main/internal/screens/sbpAccount/SbpAccountInfoFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lc861;", "Lqem0;", "Lcom/ybsdk/feature/main/internal/screens/sbpAccount/a;", "Lce4;", "Lgem0;", "factoryOfViewModel", "<init>", "(Lgem0;)V", "Lzy11;", "initBottomSheet", "()V", "viewState", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "getStateForRender", "(Lqem0;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "render", "(Lqem0;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lc861;", "createViewModel", "()Lcom/ybsdk/feature/main/internal/screens/sbpAccount/a;", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "", "onBackPressed", "()Z", "fitsSystemWindow", "onDestroyView", "Lgem0;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "sbpAccountBottomSheet", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Companion", "zdm0", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SbpAccountInfoFragment extends BaseDivContextMvvmFragment<c861, qem0, a> implements ce4 {

    @Deprecated
    public static final int BOTTOM_SHEET_TOP_PADDING_DP = 12;
    private static final zdm0 Companion = new zdm0();
    private final gem0 factoryOfViewModel;
    private BottomSheetDialogView sbpAccountBottomSheet;

    public SbpAccountInfoFragment(gem0 gem0Var) {
        super(null, null, null, null, a.class, 15, null);
        this.factoryOfViewModel = gem0Var;
    }

    private final BottomSheetDialogView.State getStateForRender(qem0 viewState) {
        int i = 3;
        final int i2 = 0;
        if (viewState instanceof nem0) {
            BottomSheetDialogView bottomSheetDialogView = this.sbpAccountBottomSheet;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.onDismiss(new xdm0(this, i2));
            }
            return new BottomSheetDialogView.State((d) new e(null, null, new j6m0(7, this), 3), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65534);
        }
        int i3 = 2;
        if (viewState instanceof lem0) {
            BottomSheetDialogView bottomSheetDialogView2 = this.sbpAccountBottomSheet;
            if (bottomSheetDialogView2 != null) {
                bottomSheetDialogView2.onDismiss(new xdm0(this, i3));
            }
            return new BottomSheetDialogView.State((d) new e(Integer.valueOf(kp50.r(12)), null, new o8k0(22, this, (lem0) viewState), 2), (YbButtonViewGroup.b) null, (h) null, true, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65526);
        }
        if (viewState instanceof mem0) {
            BottomSheetDialogView bottomSheetDialogView3 = this.sbpAccountBottomSheet;
            if (bottomSheetDialogView3 != null) {
                bottomSheetDialogView3.onSecondaryAction(new View.OnClickListener(this) { // from class: ydm0
                    public final /* synthetic */ SbpAccountInfoFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = i2;
                        SbpAccountInfoFragment sbpAccountInfoFragment = this.b;
                        switch (i4) {
                            case 0:
                                SbpAccountInfoFragment.getStateForRender$lambda$11$lambda$9(sbpAccountInfoFragment, view);
                                break;
                            default:
                                SbpAccountInfoFragment.getStateForRender$lambda$15$lambda$13(sbpAccountInfoFragment, view);
                                break;
                        }
                    }
                });
                bottomSheetDialogView3.onDismiss(new xdm0(this, i));
            }
            return ((mem0) viewState).a();
        }
        if (viewState instanceof oem0) {
            BottomSheetDialogView bottomSheetDialogView4 = this.sbpAccountBottomSheet;
            if (bottomSheetDialogView4 != null) {
                bottomSheetDialogView4.onPrimaryAction(new if6(bottomSheetDialogView4, i3));
                final int i4 = 1;
                bottomSheetDialogView4.onSecondaryAction(new View.OnClickListener(this) { // from class: ydm0
                    public final /* synthetic */ SbpAccountInfoFragment b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i42 = i4;
                        SbpAccountInfoFragment sbpAccountInfoFragment = this.b;
                        switch (i42) {
                            case 0:
                                SbpAccountInfoFragment.getStateForRender$lambda$11$lambda$9(sbpAccountInfoFragment, view);
                                break;
                            default:
                                SbpAccountInfoFragment.getStateForRender$lambda$15$lambda$13(sbpAccountInfoFragment, view);
                                break;
                        }
                    }
                });
                bottomSheetDialogView4.onDismiss(new xdm0(this, 4));
            }
            return ((oem0) viewState).a();
        }
        if (!(viewState instanceof pem0)) {
            w511.b();
            return null;
        }
        BottomSheetDialogView bottomSheetDialogView5 = this.sbpAccountBottomSheet;
        if (bottomSheetDialogView5 != null) {
            bottomSheetDialogView5.onDismiss(new xdm0(this, 5));
        }
        return ((pem0) viewState).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getStateForRender$lambda$11$lambda$10(SbpAccountInfoFragment sbpAccountInfoFragment, boolean z) {
        ((a) sbpAccountInfoFragment.getViewModel()).e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getStateForRender$lambda$11$lambda$9(SbpAccountInfoFragment sbpAccountInfoFragment, View view) {
        ((a) sbpAccountInfoFragment.getViewModel()).b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getStateForRender$lambda$15$lambda$13(SbpAccountInfoFragment sbpAccountInfoFragment, View view) {
        ((a) sbpAccountInfoFragment.getViewModel()).c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getStateForRender$lambda$15$lambda$14(SbpAccountInfoFragment sbpAccountInfoFragment, boolean z) {
        ((a) sbpAccountInfoFragment.getViewModel()).f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getStateForRender$lambda$16(SbpAccountInfoFragment sbpAccountInfoFragment, boolean z) {
        ((a) sbpAccountInfoFragment.getViewModel()).f0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getStateForRender$lambda$3(SbpAccountInfoFragment sbpAccountInfoFragment, boolean z) {
        ((a) sbpAccountInfoFragment.getViewModel()).e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View getStateForRender$lambda$4(SbpAccountInfoFragment sbpAccountInfoFragment) {
        return View.inflate(sbpAccountInfoFragment.getContext(), mnh0.ybsdk_screen_sbp_account_info_skeleton, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getStateForRender$lambda$5(SbpAccountInfoFragment sbpAccountInfoFragment, boolean z) {
        ((a) sbpAccountInfoFragment.getViewModel()).e0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View getStateForRender$lambda$8(SbpAccountInfoFragment sbpAccountInfoFragment, qem0 qem0Var) {
        YbDivView ybDivView = new YbDivView(sbpAccountInfoFragment.getDivContext(), null, 0, 6, null);
        YbDivView.setData$default(ybDivView, ((lem0) qem0Var).a(), null, null, false, 14, null);
        ybDivView.setActionHandler(new xdm0(sbpAccountInfoFragment, 1));
        return ybDivView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean getStateForRender$lambda$8$lambda$7$lambda$6(SbpAccountInfoFragment sbpAccountInfoFragment, Uri uri) {
        return ((a) sbpAccountInfoFragment.getViewModel()).g0(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBottomSheet() {
        if (this.sbpAccountBottomSheet == null) {
            BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView.show(requireActivity(), ((c861) getBinding()).o());
            this.sbpAccountBottomSheet = bottomSheetDialogView;
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        jem0 jem0Var = sideEffect instanceof jem0 ? (jem0) sideEffect : null;
        if (!(jem0Var instanceof iem0)) {
            if (jem0Var instanceof hem0) {
                hua1.f(((hem0) jem0Var).a(), this, "ReloadUserCards");
                return;
            } else {
                super.consumeSideEffect(sideEffect);
                return;
            }
        }
        com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((iem0) jem0Var).a(), j0t0.c, 8);
        BottomSheetDialogView bottomSheetDialogView = this.sbpAccountBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((kem0) this.factoryOfViewModel).a((SbpAccountInfoScreenParams) dcs.a(this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        int i = insets.a.h(2).d;
        FrameLayout frameLayout = ((c861) getBinding()).b;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i);
        frameLayout.setLayoutParams(marginLayoutParams);
        return insets;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        BottomSheetDialogView bottomSheetDialogView = this.sbpAccountBottomSheet;
        if (bottomSheetDialogView == null) {
            return true;
        }
        bottomSheetDialogView.dismiss();
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.sbpAccountBottomSheet = null;
        super.onDestroyView();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(qem0 viewState) {
        initBottomSheet();
        BottomSheetDialogView bottomSheetDialogView = this.sbpAccountBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.render(getStateForRender(viewState));
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public c861 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return c861.p(inflater, container);
    }
}
