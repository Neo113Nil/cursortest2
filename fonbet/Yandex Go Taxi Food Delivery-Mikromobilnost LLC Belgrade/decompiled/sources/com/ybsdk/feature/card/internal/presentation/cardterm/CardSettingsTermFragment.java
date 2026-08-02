package com.ybsdk.feature.card.internal.presentation.cardterm;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.card.api.CardsSettingsTermParameter;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.c;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import defpackage.bnp0;
import defpackage.ce4;
import defpackage.ci8;
import defpackage.dcs;
import defpackage.hua1;
import defpackage.i3y;
import defpackage.l661;
import defpackage.lfx;
import defpackage.mo8;
import defpackage.n751;
import defpackage.no8;
import defpackage.p1b;
import defpackage.qtb1;
import defpackage.so8;
import defpackage.tdr;
import defpackage.to8;
import defpackage.u08;
import defpackage.uo8;
import defpackage.vo8;
import defpackage.w511;
import defpackage.wo8;
import defpackage.wz51;
import defpackage.xo8;
import defpackage.xx60;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0012H\u0016¢\u0006\u0004\b*\u0010\u0014J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\rJ\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/card/internal/presentation/cardterm/CardSettingsTermFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Ll661;", "Lxo8;", "Lcom/ybsdk/feature/card/internal/presentation/cardterm/a;", "Ltdr;", "Lce4;", "Lso8;", "viewModelFactory", "<init>", "(Lso8;)V", "Lzy11;", "initBottomSheet", "()V", "viewState", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "getBottomSheetState", "(Lxo8;)Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "", "fitNavigation", "()Z", "createViewModel", "()Lcom/ybsdk/feature/card/internal/presentation/cardterm/a;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ll661;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "fitsSystemWindow", "Ln751;", "insets", "onApplyInsets", "(Ln751;)Ln751;", "render", "(Lxo8;)V", "onBackPressed", "onDestroyView", "onDestroy", "Lso8;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "settingsTermBottomSheet", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Lbnp0;", "sdkCardAppearance", "Lbnp0;", "Lcom/ybsdk/feature/card/api/CardsSettingsTermParameter;", "screenParams$delegate", "Li3y;", "getScreenParams", "()Lcom/ybsdk/feature/card/api/CardsSettingsTermParameter;", "screenParams", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CardSettingsTermFragment extends BaseDivContextMvvmFragment<l661, xo8, a> implements tdr, ce4 {

    /* renamed from: screenParams$delegate, reason: from kotlin metadata */
    private final i3y screenParams;
    private bnp0 sdkCardAppearance;
    private BottomSheetDialogView settingsTermBottomSheet;
    private final so8 viewModelFactory;

    public CardSettingsTermFragment(so8 so8Var) {
        super(null, null, null, null, a.class, 15, null);
        this.viewModelFactory = so8Var;
        this.screenParams = kotlin.a.a(new mo8(this, 0));
    }

    private final BottomSheetDialogView.State getBottomSheetState(xo8 viewState) {
        vo8 b = viewState.b();
        int i = 1;
        if (b.equals(qtb1.y)) {
            return new BottomSheetDialogView.State((d) new e(null, null, new mo8(this, i), 3), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65534);
        }
        if (b instanceof wo8) {
            return new BottomSheetDialogView.State((d) new e(null, Integer.valueOf(viewState.a()), new u08(7, this, viewState), 1), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (c) null, false, (z1x0) null, (z1x0) null, false, false, 65534);
        }
        if (!(b instanceof uo8)) {
            w511.b();
            return null;
        }
        BottomSheetDialogView bottomSheetDialogView = this.settingsTermBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.onPrimaryAction(new ci8(2, this));
        }
        return ((uo8) viewState.b()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View getBottomSheetState$lambda$3(CardSettingsTermFragment cardSettingsTermFragment) {
        return wz51.q(cardSettingsTermFragment.getLayoutInflater()).p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View getBottomSheetState$lambda$6(CardSettingsTermFragment cardSettingsTermFragment, xo8 xo8Var) {
        YbDivView ybDivView = new YbDivView(cardSettingsTermFragment.getDivContext(), null, 0, 6, null);
        YbDivView.setData$default(ybDivView, ((wo8) xo8Var.b()).a(), null, null, false, 14, null);
        ybDivView.setActionHandler(new no8(cardSettingsTermFragment, 0));
        return ybDivView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean getBottomSheetState$lambda$6$lambda$5$lambda$4(CardSettingsTermFragment cardSettingsTermFragment, Uri uri) {
        return ((a) cardSettingsTermFragment.getViewModel()).f0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getBottomSheetState$lambda$8$lambda$7(CardSettingsTermFragment cardSettingsTermFragment, View view) {
        ((a) cardSettingsTermFragment.getViewModel()).e0();
    }

    private final CardsSettingsTermParameter getScreenParams() {
        return (CardsSettingsTermParameter) this.screenParams.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initBottomSheet() {
        if (this.settingsTermBottomSheet == null) {
            BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView.onDismiss(new no8(this, 1));
            bottomSheetDialogView.show(requireActivity(), ((l661) getBinding()).o());
            this.settingsTermBottomSheet = bottomSheetDialogView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 initBottomSheet$lambda$2$lambda$1(CardSettingsTermFragment cardSettingsTermFragment, boolean z) {
        ((a) cardSettingsTermFragment.getViewModel()).d0();
        bnp0 bnp0Var = cardSettingsTermFragment.sdkCardAppearance;
        if (bnp0Var != null) {
            bnp0Var.setGripVisible(true);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardsSettingsTermParameter screenParams_delegate$lambda$0(CardSettingsTermFragment cardSettingsTermFragment) {
        return (CardsSettingsTermParameter) dcs.a(cardSettingsTermFragment);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public a getFactoryOfViewModel() {
        return ((to8) this.viewModelFactory).a(getScreenParams());
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return true;
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.xdr
    public boolean fitsSystemWindow() {
        return getScreenParams().getFitsSystemWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.presentation.BindingFragment, defpackage.zjf
    public n751 onApplyInsets(n751 insets) {
        ((a) getViewModel()).c0(insets.a.h(2).d);
        return insets;
    }

    @Override // defpackage.ce4
    public boolean onBackPressed() {
        BottomSheetDialogView bottomSheetDialogView = this.settingsTermBottomSheet;
        if (bottomSheetDialogView == null) {
            return true;
        }
        bottomSheetDialogView.dismiss();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        hua1.f(new Bundle(), this, "SETTINGS_TERM_FRAGMENT_CLOSED_RESULT_KEY");
        super.onDestroy();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.settingsTermBottomSheet = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bnp0] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ?? r2 = this;
        while (true) {
            if (r2 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof bnp0)) {
                    activity = null;
                }
                r2 = (bnp0) activity;
                if (r2 == 0) {
                    r2 = 0;
                }
            } else if (r2 instanceof bnp0) {
                break;
            } else {
                r2 = r2.getParentFragment();
            }
        }
        bnp0 bnp0Var = (bnp0) r2;
        this.sdkCardAppearance = bnp0Var;
        if (bnp0Var != null) {
            bnp0Var.setGripVisible(false);
        }
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(xo8 viewState) {
        initBottomSheet();
        BottomSheetDialogView bottomSheetDialogView = this.settingsTermBottomSheet;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.render(getBottomSheetState(viewState));
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public l661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return l661.p(inflater, container);
    }
}
