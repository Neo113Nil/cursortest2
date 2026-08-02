package com.ybsdk.feature.autotopup.internal.presentation.saver;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.autotopup.internal.presentation.view.AutoTopupSummaryView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ErrorView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.paymentmethod.SelectPaymentMethodView;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.ahq0;
import defpackage.ce4;
import defpackage.cg91;
import defpackage.dcs;
import defpackage.gzk0;
import defpackage.hc5;
import defpackage.hua1;
import defpackage.hzk0;
import defpackage.i3y;
import defpackage.izk0;
import defpackage.jdk0;
import defpackage.jl40;
import defpackage.jw00;
import defpackage.jzk0;
import defpackage.kp50;
import defpackage.l24;
import defpackage.lbb0;
import defpackage.lcb1;
import defpackage.lfx;
import defpackage.lzk0;
import defpackage.mzk0;
import defpackage.nzk0;
import defpackage.o8k0;
import defpackage.ohk0;
import defpackage.ok31;
import defpackage.ozk0;
import defpackage.pyk0;
import defpackage.pzk0;
import defpackage.qa3;
import defpackage.qas0;
import defpackage.qyk0;
import defpackage.qzk0;
import defpackage.rr51;
import defpackage.rsa1;
import defpackage.ryk0;
import defpackage.rzk0;
import defpackage.syk0;
import defpackage.szk0;
import defpackage.t761;
import defpackage.tja1;
import defpackage.tyk0;
import defpackage.tzk0;
import defpackage.uk11;
import defpackage.uyk0;
import defpackage.uzk0;
import defpackage.vv3;
import defpackage.vyk0;
import defpackage.vzk0;
import defpackage.xty0;
import defpackage.y8f;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0006*\u0001L\b\u0000\u0018\u0000 O2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001PB\u0019\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b)\u0010$J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b*\u0010$J\u0017\u0010+\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010$J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010$J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010$J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010$J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b/\u0010$J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b0\u0010$J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u0010$J\u0017\u00102\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b2\u0010$J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u0010$J\u0017\u00106\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\u000e2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b8\u00107J\u0017\u0010:\u001a\u00020\u000e2\u0006\u0010&\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010?R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR)\u0010K\u001a\u0010\u0012\f\u0012\n F*\u0004\u0018\u00010E0E0D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/presentation/saver/RoundingFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lt761;", "Lvzk0;", "Lcom/ybsdk/feature/autotopup/internal/presentation/saver/b;", "Lce4;", "Lgzk0;", "factoryOfViewModel", "Luk11;", "secondFactorScreenProvider", "<init>", "(Lgzk0;Luk11;)V", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onCreate", "(Landroid/os/Bundle;)V", "createViewModel", "()Lcom/ybsdk/feature/autotopup/internal/presentation/saver/b;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lt761;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "onBackPressed", "()Z", "onDestroyView", "()V", "viewState", "render", "(Lvzk0;)V", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "renderTopDivView", "renderError", "renderTrivia", "renderTitle", "renderToolbar", "renderShimmer", "renderButtons", "renderDivView", "renderOptions", "renderSummaryWidget", "renderSourceSelection", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;", "bottomSheetState", "showNoticeBottomSheet", "(Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView$State;)V", "showExitConfirmationNotice", "Lmzk0;", "showSourceBottomSheet", "(Lmzk0;)V", BackendConfig.Restrictions.ENABLED, "onSummaryViewDropDownToggle", "(Z)V", "Lgzk0;", "Luk11;", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "bottomSheetDialogView", "Lcom/ybsdk/widgets/common/bottomsheet/BottomSheetDialogView;", "Lqa3;", "Lgc5;", "kotlin.jvm.PlatformType", "adapter$delegate", "Li3y;", "getAdapter", "()Lqa3;", "adapter", "vyk0", "selectPaymentMethodListener", "Lvyk0;", "Companion", "uyk0", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RoundingFragment extends BaseDivContextMvvmFragment<t761, vzk0, b> implements ce4 {
    private static final uyk0 Companion = new uyk0();
    private static final int LEFT_MARGIN_OPTION_PX = kp50.r(6);

    @Deprecated
    public static final String TAG_BOTTOM_SHEET_SOURCE = "SOURCE_SELECTION_BOTTOM_SHEET";

    /* renamed from: adapter$delegate, reason: from kotlin metadata */
    private final i3y adapter;
    private BottomSheetDialogView bottomSheetDialogView;
    private final gzk0 factoryOfViewModel;
    private final uk11 secondFactorScreenProvider;
    private final vyk0 selectPaymentMethodListener;

    public RoundingFragment(gzk0 gzk0Var, uk11 uk11Var) {
        super(null, null, null, null, b.class, 15, null);
        this.factoryOfViewModel = gzk0Var;
        this.secondFactorScreenProvider = uk11Var;
        this.adapter = kotlin.a.b(LazyThreadSafetyMode.NONE, new pyk0(this, 2));
        this.selectPaymentMethodListener = new vyk0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ b access$getViewModel(RoundingFragment roundingFragment) {
        return (b) roundingFragment.getViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qa3 adapter_delegate$lambda$1(RoundingFragment roundingFragment) {
        return new qa3(hc5.a(), rsa1.a(new tyk0(roundingFragment, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 adapter_delegate$lambda$1$lambda$0(RoundingFragment roundingFragment, int i) {
        lcb1.d(((t761) roundingFragment.getBinding()).o());
        ((b) roundingFragment.getViewModel()).n0(i);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void consumeSideEffect$lambda$17(RoundingFragment roundingFragment) {
        ((t761) roundingFragment.getBinding()).h.showInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void consumeSideEffect$lambda$18(RoundingFragment roundingFragment) {
        ((t761) roundingFragment.getBinding()).h.hideInfo();
    }

    private final qa3 getAdapter() {
        return (qa3) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$9$lambda$3(RoundingFragment roundingFragment, View view) {
        ((b) roundingFragment.getViewModel()).s0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getViewBinding$lambda$9$lambda$4(int i) {
        return i != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void getViewBinding$lambda$9$lambda$5(RoundingFragment roundingFragment, View view) {
        ((b) roundingFragment.getViewModel()).m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 getViewBinding$lambda$9$lambda$6(RoundingFragment roundingFragment, boolean z) {
        roundingFragment.onSummaryViewDropDownToggle(z);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$9$lambda$7(RoundingFragment roundingFragment) {
        ((b) roundingFragment.getViewModel()).k0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 getViewBinding$lambda$9$lambda$8(RoundingFragment roundingFragment) {
        ((b) roundingFragment.getViewModel()).l0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onCreate$lambda$2(RoundingFragment roundingFragment, String str, Bundle bundle) {
        ((b) roundingFragment.getViewModel()).p0(((vv3) roundingFragment.secondFactorScreenProvider).a(bundle));
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void onSummaryViewDropDownToggle(boolean enabled) {
        if (enabled) {
            ((t761) getBinding()).o().post(new syk0(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onSummaryViewDropDownToggle$lambda$29(RoundingFragment roundingFragment) {
        ((t761) roundingFragment.getBinding()).f.smoothScrollTo(0, ((t761) roundingFragment.getBinding()).h.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderButtons(vzk0 viewState) {
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        if (szk0Var != null) {
            ((t761) getBinding()).c.render(szk0Var.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [uc5] */
    private final void renderDivView(vzk0 viewState) {
        rr51 a;
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        rzk0 b = szk0Var != null ? szk0Var.b() : null;
        YbDivView ybDivView = ((t761) getBinding()).d;
        ybDivView.setVisibility(b == null ? 8 : 0);
        if (b != null && (a = b.a()) != null) {
            YbDivView.setData$default(ybDivView, a, null, null, false, 14, null);
        }
        if (b != null) {
            ybDivView.updateLocalVariables(b.b());
        }
        ybDivView.setActionHandler(new RoundingFragment$renderDivView$1$3(getViewModel()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderError(vzk0 viewState) {
        tzk0 tzk0Var = viewState instanceof tzk0 ? (tzk0) viewState : null;
        ((t761) getBinding()).l.render(tzk0Var != null ? tzk0Var.a() : null);
        ((t761) getBinding()).l.setVisibility(tzk0Var == null ? 8 : 0);
    }

    private final void renderOptions(vzk0 viewState) {
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        if (szk0Var != null) {
            getAdapter().g(szk0Var.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderShimmer(vzk0 viewState) {
        ((t761) getBinding()).g.p().setVisibility(viewState instanceof uzk0 ? 0 : 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderSourceSelection(vzk0 viewState) {
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        if (szk0Var != null) {
            ((t761) getBinding()).b.render(new ohk0(9, szk0Var.d()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahq0 renderSourceSelection$lambda$16(ahq0 ahq0Var, ahq0 ahq0Var2) {
        return ahq0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderSummaryWidget(vzk0 viewState) {
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        l24 e = szk0Var != null ? szk0Var.e() : null;
        AutoTopupSummaryView autoTopupSummaryView = ((t761) getBinding()).h;
        autoTopupSummaryView.setVisibility(e == null ? 8 : 0);
        if (e != null) {
            autoTopupSummaryView.render(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderTitle(vzk0 viewState) {
        Text f;
        AppCompatTextView appCompatTextView = ((t761) getBinding()).i;
        CharSequence charSequence = null;
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        if (szk0Var != null && (f = szk0Var.f()) != null) {
            charSequence = d.a(requireContext(), f);
        }
        appCompatTextView.setText(charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderToolbar(vzk0 viewState) {
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        if (szk0Var != null) {
            ((t761) getBinding()).m.render(szk0Var.g());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [uc5] */
    private final void renderTopDivView(vzk0 viewState) {
        rr51 a;
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        rzk0 h = szk0Var != null ? szk0Var.h() : null;
        YbDivView ybDivView = ((t761) getBinding()).j;
        ybDivView.setVisibility(h == null ? 8 : 0);
        if (h != null && (a = h.a()) != null) {
            YbDivView.setData$default(ybDivView, a, null, null, false, 14, null);
        }
        if (h != null) {
            ybDivView.updateLocalVariables(h.b());
        }
        ybDivView.setActionHandler(new RoundingFragment$renderTopDivView$1$3(getViewModel()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderTrivia(vzk0 viewState) {
        szk0 szk0Var = viewState instanceof szk0 ? (szk0) viewState : null;
        Text i = szk0Var != null ? szk0Var.i() : null;
        ((t761) getBinding()).k.setVisibility(i != null ? 0 : 8);
        xty0.d(((t761) getBinding()).k, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showExitConfirmationNotice(BottomSheetDialogView.State bottomSheetState) {
        lcb1.d(((t761) getBinding()).o());
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView2.onPrimaryAction(new qyk0(this, bottomSheetDialogView2, 2));
        bottomSheetDialogView2.onSecondaryAction(new qyk0(this, bottomSheetDialogView2, 3));
        bottomSheetDialogView2.render(bottomSheetState);
        BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showExitConfirmationNotice$lambda$24$lambda$22(RoundingFragment roundingFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((b) roundingFragment.getViewModel()).o0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showExitConfirmationNotice$lambda$24$lambda$23(RoundingFragment roundingFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((b) roundingFragment.getViewModel()).q0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void showNoticeBottomSheet(BottomSheetDialogView.State bottomSheetState) {
        lcb1.d(((t761) getBinding()).o());
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        BottomSheetDialogView bottomSheetDialogView2 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView2.onPrimaryAction(new qyk0(bottomSheetDialogView2, this));
        bottomSheetDialogView2.onSecondaryAction(new qyk0(this, bottomSheetDialogView2, 1));
        bottomSheetDialogView2.render(bottomSheetState);
        BottomSheetDialogView.show$default(bottomSheetDialogView2, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showNoticeBottomSheet$lambda$21$lambda$19(BottomSheetDialogView bottomSheetDialogView, RoundingFragment roundingFragment, View view) {
        bottomSheetDialogView.dismiss();
        ((b) roundingFragment.getViewModel()).j0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showNoticeBottomSheet$lambda$21$lambda$20(RoundingFragment roundingFragment, BottomSheetDialogView bottomSheetDialogView, View view) {
        ((b) roundingFragment.getViewModel()).i0();
        bottomSheetDialogView.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [uc5] */
    private final void showSourceBottomSheet(mzk0 sideEffect) {
        BottomSheetDialogView bottomSheetDialogView;
        lcb1.d(((t761) getBinding()).o());
        BottomSheetDialogView.State state = new BottomSheetDialogView.State(new e(null, null, new o8k0(8, this, sideEffect), 3), new YbButtonView.a(sideEffect.a(), null, null, null, null, null, null, false, false, null, 4094), null, null, null, null, null, null, null, 131068);
        BottomSheetDialogView bottomSheetDialogView2 = this.bottomSheetDialogView;
        if (jl40.l(bottomSheetDialogView2 != null ? bottomSheetDialogView2.getTag() : null, "SOURCE_SELECTION_BOTTOM_SHEET") && (bottomSheetDialogView = this.bottomSheetDialogView) != null && bottomSheetDialogView.isShown()) {
            BottomSheetDialogView bottomSheetDialogView3 = this.bottomSheetDialogView;
            if (bottomSheetDialogView3 != null) {
                bottomSheetDialogView3.render(state);
                return;
            }
            return;
        }
        BottomSheetDialogView bottomSheetDialogView4 = this.bottomSheetDialogView;
        if (bottomSheetDialogView4 != null) {
            bottomSheetDialogView4.dismiss();
        }
        BottomSheetDialogView bottomSheetDialogView5 = new BottomSheetDialogView(requireContext(), null, 0, 6, null);
        bottomSheetDialogView5.setTag("SOURCE_SELECTION_BOTTOM_SHEET");
        bottomSheetDialogView5.onDismiss(new RoundingFragment$showSourceBottomSheet$1$1(getViewModel()));
        bottomSheetDialogView5.onPrimaryAction(new ryk0(this, 0));
        bottomSheetDialogView5.render(state);
        BottomSheetDialogView.show$default(bottomSheetDialogView5, requireActivity(), null, 2, null);
        this.bottomSheetDialogView = bottomSheetDialogView5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View showSourceBottomSheet$lambda$26(RoundingFragment roundingFragment, mzk0 mzk0Var) {
        SelectPaymentMethodView selectPaymentMethodView = new SelectPaymentMethodView(roundingFragment.requireContext(), null, 0, 6, null);
        selectPaymentMethodView.setListener(roundingFragment.selectPaymentMethodListener);
        selectPaymentMethodView.render(mzk0Var.b());
        return selectPaymentMethodView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void showSourceBottomSheet$lambda$28$lambda$27(RoundingFragment roundingFragment, View view) {
        ((b) roundingFragment.getViewModel()).h0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        if (sideEffect instanceof pzk0) {
            cg91.c(((t761) getBinding()).o(), ok31.c);
            return;
        }
        if (sideEffect instanceof ozk0) {
            showNoticeBottomSheet(((ozk0) sideEffect).a());
            return;
        }
        if (sideEffect instanceof nzk0) {
            com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((nzk0) sideEffect).a(), null, 12);
            return;
        }
        if (sideEffect instanceof hzk0) {
            BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
            if (bottomSheetDialogView != null) {
                bottomSheetDialogView.dismiss();
            }
            this.bottomSheetDialogView = null;
            return;
        }
        if (sideEffect instanceof lzk0) {
            ((t761) getBinding()).o().post(new syk0(this, 0));
            return;
        }
        if (sideEffect instanceof jzk0) {
            ((t761) getBinding()).o().post(new syk0(this, 1));
            return;
        }
        if (sideEffect instanceof mzk0) {
            showSourceBottomSheet((mzk0) sideEffect);
        } else if (sideEffect instanceof izk0) {
            showExitConfirmationNotice(((izk0) sideEffect).a());
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
        return ((qzk0) this.factoryOfViewModel).a((RoundingParams) dcs.a(this));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v3, types: [uc5] */
    /* JADX WARN: Type inference failed for: r2v4, types: [uc5] */
    @Override // com.ybsdk.core.presentation.BindingFragment
    public t761 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        t761 p = t761.p(inflater, container);
        int i = 1;
        p.b.setOnClickListener(new ryk0(this, i));
        RecyclerView recyclerView = p.e;
        recyclerView.setAdapter(getAdapter());
        recyclerView.addItemDecoration(new jw00(0, LEFT_MARGIN_OPTION_PX, 0, new jdk0(28), 5));
        AppCompatTextView appCompatTextView = p.k;
        tja1.b(appCompatTextView);
        appCompatTextView.setOnClickListener(new ryk0(this, 2));
        YbButtonViewGroup ybButtonViewGroup = p.c;
        ybButtonViewGroup.setLinkClickListener(new RoundingFragment$getViewBinding$1$4(getViewModel()));
        ybButtonViewGroup.setPrimaryButtonOnClickListener(new RoundingFragment$getViewBinding$1$5(getViewModel()));
        ybButtonViewGroup.setSecondaryButtonClickListener(new RoundingFragment$getViewBinding$1$6(getViewModel()));
        p.h.setOnDropDownToggleAction(new tyk0(this, i));
        ErrorView errorView = p.l;
        errorView.setPrimaryButtonOnClickListener(new pyk0(this, 0));
        errorView.setSecondaryButtonClickListener(new pyk0(this, i));
        return p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        ((b) getViewModel()).g0();
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hua1.g(this, "AUTO_TOPUP_REQUEST_KEY", new lbb0(11, this));
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        BottomSheetDialogView bottomSheetDialogView = this.bottomSheetDialogView;
        if (bottomSheetDialogView != null) {
            bottomSheetDialogView.dismiss();
        }
        this.bottomSheetDialogView = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ((b) getViewModel()).t0(getViewLifecycleOwner().getLifecycle());
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(vzk0 viewState) {
        renderError(viewState);
        renderTrivia(viewState);
        renderTitle(viewState);
        renderTopDivView(viewState);
        renderButtons(viewState);
        renderDivView(viewState);
        renderToolbar(viewState);
        renderShimmer(viewState);
        renderOptions(viewState);
        renderSummaryWidget(viewState);
        renderSourceSelection(viewState);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }
}
