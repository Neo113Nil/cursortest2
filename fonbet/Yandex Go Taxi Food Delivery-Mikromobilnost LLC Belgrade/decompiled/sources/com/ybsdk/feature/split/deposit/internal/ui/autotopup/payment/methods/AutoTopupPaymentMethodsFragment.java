package com.ybsdk.feature.split.deposit.internal.ui.autotopup.payment.methods;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.feature.transfer.api.a;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import defpackage.eh6;
import defpackage.eo1;
import defpackage.gh6;
import defpackage.hua1;
import defpackage.ih6;
import defpackage.lfx;
import defpackage.mw2;
import defpackage.pw3;
import defpackage.qas0;
import defpackage.qw3;
import defpackage.rw3;
import defpackage.tf;
import defpackage.uw3;
import defpackage.vw3;
import defpackage.w511;
import defpackage.ww3;
import defpackage.xw3;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.yz51;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001)\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/ui/autotopup/payment/methods/AutoTopupPaymentMethodsFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lyz51;", "Lxw3;", "Lvw3;", "Luw3;", "viewModelFactory", "<init>", "(Luw3;)V", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "newBottomSheetState", "Lzy11;", "renderBottomSheet", "(Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "createViewModel", "()Lvw3;", "viewState", "render", "(Lxw3;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lyz51;", "Luw3;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "pw3", "selectPaymentMethodListener", "Lpw3;", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AutoTopupPaymentMethodsFragment extends BaseDivContextMvvmFragment<yz51, xw3, vw3> {
    private BottomSheetDialogView bottomSheetDialogView;
    private final pw3 selectPaymentMethodListener;
    private final uw3 viewModelFactory;

    public AutoTopupPaymentMethodsFragment(uw3 uw3Var) {
        super(Boolean.FALSE, null, null, null, vw3.class, 14, null);
        this.viewModelFactory = uw3Var;
        this.selectPaymentMethodListener = new pw3(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ vw3 access$getViewModel(AutoTopupPaymentMethodsFragment autoTopupPaymentMethodsFragment) {
        return (vw3) autoTopupPaymentMethodsFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View render$lambda$3$lambda$2$lambda$1(AutoTopupPaymentMethodsFragment autoTopupPaymentMethodsFragment, ih6 ih6Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(autoTopupPaymentMethodsFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(autoTopupPaymentMethodsFragment.selectPaymentMethodListener);
        selectPaymentMethodView.render(((gh6) ih6Var).b());
        return selectPaymentMethodView;
    }

    private final void renderBottomSheet(BottomSheetDialogView.State newBottomSheetState) {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (newBottomSheetState == null) {
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.bottomSheetDialogView = null;
            return;
        }
        if (bottomSheetDialogView == null) {
            BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
            bottomSheetDialogView2.onPrimaryAction(new tf(9, this));
            bottomSheetDialogView2.onDismiss(new eo1(20, this));
            BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
            this.bottomSheetDialogView = bottomSheetDialogView2;
        }
        BottomSheetDialogView bottomSheetDialogView3 = this.bottomSheetDialogView;
        if (bottomSheetDialogView3 != null) {
            bottomSheetDialogView3.render(newBottomSheetState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderBottomSheet$lambda$6$lambda$4(AutoTopupPaymentMethodsFragment autoTopupPaymentMethodsFragment, View view) {
        ((vw3) autoTopupPaymentMethodsFragment.getViewModel()).d0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 renderBottomSheet$lambda$6$lambda$5(AutoTopupPaymentMethodsFragment autoTopupPaymentMethodsFragment, boolean z) {
        ((vw3) autoTopupPaymentMethodsFragment.getViewModel()).e0();
        return zy11.a;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof qw3) {
            hua1.f(new Bundle(), this, "navigating_away_after_method_selection_payment");
            hua1.f(new Bundle(), this, "navigating_away_after_method_selection_auto_topup");
        } else if (sideEffect instanceof rw3) {
            hua1.f(new Bundle(), this, "user_returned_from_settings");
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public vw3 getFactoryOfViewModel() {
        return ((ww3) this.viewModelFactory).a();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [uc5] */
    /* JADX WARN: Type inference failed for: r3v0, types: [uc5] */
    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        hua1.g(this, "request_select_target", new a(new AutoTopupPaymentMethodsFragment$onCreate$2(getViewModel()), new AutoTopupPaymentMethodsFragment$onCreate$1(getViewModel())));
        super.onCreate(savedInstanceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((vw3) getViewModel()).f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(xw3 viewState) {
        ih6 a = viewState.a();
        BottomSheetDialogView.State state = null;
        if (a != null) {
            if (a instanceof eh6) {
                state = ((eh6) a).a();
            } else {
                if (!(a instanceof gh6)) {
                    w511.b();
                    return;
                }
                state = new BottomSheetDialogView.State(new e(null, null, new mw2(5, this, a), 3), ((gh6) a).a(), null, null, null, null, null, null, null, 131068);
            }
        }
        renderBottomSheet(state);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public yz51 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return yz51.o(inflater, container);
    }
}
