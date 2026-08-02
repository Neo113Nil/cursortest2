package com.ybsdk.feature.change.payment.method.internal.ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.change.payment.method.api.ChangePaymentMethodParameter;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import com.ybsdk.widgets.common.ToolbarView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.e;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import defpackage.bnp0;
import defpackage.ca41;
import defpackage.ce4;
import defpackage.ci8;
import defpackage.cs8;
import defpackage.dcs;
import defpackage.dd9;
import defpackage.dzh0;
import defpackage.eal;
import defpackage.ed9;
import defpackage.evu0;
import defpackage.fd9;
import defpackage.gd9;
import defpackage.ha41;
import defpackage.hd9;
import defpackage.id9;
import defpackage.jd9;
import defpackage.jl40;
import defpackage.kd9;
import defpackage.lfx;
import defpackage.m661;
import defpackage.mj31;
import defpackage.n661;
import defpackage.nbv;
import defpackage.nyg0;
import defpackage.p1b;
import defpackage.pbj;
import defpackage.qas0;
import defpackage.qtz0;
import defpackage.rr51;
import defpackage.stz0;
import defpackage.tdr;
import defpackage.u08;
import defpackage.unr0;
import defpackage.vc9;
import defpackage.w511;
import defpackage.wc9;
import defpackage.xx60;
import defpackage.y8f;
import defpackage.yks0;
import defpackage.yr31;
import defpackage.z1x0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\r*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010\u000fJ\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0016¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00108\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lcom/ybsdk/feature/change/payment/method/internal/ui/ChangePaymentMethodFragment;", "Lcom/ybsdk/feature/divkit/api/ui/screen/BaseDivContextMvvmFragment;", "Lm661;", "Lkd9;", "Lcom/ybsdk/feature/change/payment/method/internal/ui/c;", "Ltdr;", "Lce4;", "Lfd9;", "viewModelFactory", "Lca41;", "web3dsFeature", "<init>", "(Lfd9;Lca41;)V", "Lzy11;", "renderBottomSheet", "(Lkd9;)V", "render3ds", "", "fitNavigation", "()Z", "createViewModel", "()Lcom/ybsdk/feature/change/payment/method/internal/ui/c;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lm661;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "viewState", "render", "Lqas0;", "sideEffect", "consumeSideEffect", "(Lqas0;)V", "onBackPressed", "onDestroyView", "()V", "onDestroy", "Lfd9;", "Lca41;", "Ln661;", "skeletonBinding", "Ln661;", "Lha41;", "web3dsView", "Lha41;", "Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "divView", "Lcom/ybsdk/feature/divkit/api/ui/YbDivView;", "Lrr51;", "lastYbDivData", "Lrr51;", "feature-change-payment-method_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChangePaymentMethodFragment extends BaseDivContextMvvmFragment<m661, kd9, c> implements tdr, ce4 {
    private YbDivView divView;
    private rr51 lastYbDivData;
    private n661 skeletonBinding;
    private final fd9 viewModelFactory;
    private final ca41 web3dsFeature;
    private ha41 web3dsView;

    public ChangePaymentMethodFragment(fd9 fd9Var, ca41 ca41Var) {
        super(Boolean.FALSE, null, null, null, c.class, 14, null);
        this.viewModelFactory = fd9Var;
        this.web3dsFeature = ca41Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$0(ChangePaymentMethodFragment changePaymentMethodFragment, bnp0 bnp0Var, boolean z) {
        ((c) changePaymentMethodFragment.getViewModel()).f0();
        if (bnp0Var != null) {
            bnp0Var.setGripVisible(true);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$1(ChangePaymentMethodFragment changePaymentMethodFragment) {
        ((c) changePaymentMethodFragment.getViewModel()).d0();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$6$lambda$3(ChangePaymentMethodFragment changePaymentMethodFragment) {
        changePaymentMethodFragment.doOnViewIsNotDestroyed(new vc9(changePaymentMethodFragment, 0));
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$6$lambda$3$lambda$2(ChangePaymentMethodFragment changePaymentMethodFragment) {
        ((m661) changePaymentMethodFragment.getBinding()).d.setVisibility(0);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final zy11 onViewCreated$lambda$6$lambda$4(ChangePaymentMethodFragment changePaymentMethodFragment, Throwable th) {
        ((c) changePaymentMethodFragment.getViewModel()).e0();
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void render3ds(kd9 kd9Var) {
        jd9 jd9Var;
        String a;
        if (!(kd9Var instanceof jd9) || (a = (jd9Var = (jd9) kd9Var).a()) == null || evu0.J(a)) {
            ((m661) getBinding()).d.setVisibility(8);
            return;
        }
        ha41 ha41Var = this.web3dsView;
        if (ha41Var != null) {
            ((pbj) ha41Var).K(jd9Var.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void renderBottomSheet(kd9 kd9Var) {
        BottomSheetDialogView.State a;
        boolean z = kd9Var instanceof jd9;
        if (z && jl40.l(this.lastYbDivData, ((jd9) kd9Var).b()) && this.divView != null) {
            return;
        }
        int i = 3;
        if (jl40.l(kd9Var, id9.a)) {
            a = new BottomSheetDialogView.State((d) new e(null, 0, new vc9(this, i), 1), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65534);
        } else if (z) {
            jd9 jd9Var = (jd9) kd9Var;
            this.lastYbDivData = jd9Var.b();
            a = new BottomSheetDialogView.State((d) new e(null, null, new u08(13, this, jd9Var), 3), (YbButtonViewGroup.b) null, (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65022);
        } else if (!(kd9Var instanceof hd9)) {
            w511.b();
            return;
        } else {
            ((m661) getBinding()).b.onPrimaryAction(new ci8(5, this));
            a = ((hd9) kd9Var).a();
        }
        ((m661) getBinding()).b.render(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderBottomSheet$lambda$12(ChangePaymentMethodFragment changePaymentMethodFragment, kd9 kd9Var) {
        YbDivView ybDivView;
        YbDivView ybDivView2 = changePaymentMethodFragment.divView;
        if (ybDivView2 == null) {
            ybDivView = new YbDivView(changePaymentMethodFragment.getDivContext(), null, 0, 6, null);
        } else {
            ybDivView = ybDivView2;
        }
        YbDivView.setData$default(ybDivView, ((jd9) kd9Var).b(), null, null, false, 14, null);
        ybDivView.setActionHandler(new wc9(changePaymentMethodFragment, 0));
        changePaymentMethodFragment.divView = ybDivView;
        return ybDivView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean renderBottomSheet$lambda$12$lambda$11$lambda$10(ChangePaymentMethodFragment changePaymentMethodFragment, Uri uri) {
        return ((c) changePaymentMethodFragment.getViewModel()).b0(uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void renderBottomSheet$lambda$14$lambda$13(ChangePaymentMethodFragment changePaymentMethodFragment, View view) {
        c.g0((c) changePaymentMethodFragment.getViewModel());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View renderBottomSheet$lambda$9(ChangePaymentMethodFragment changePaymentMethodFragment) {
        n661 n661Var = changePaymentMethodFragment.skeletonBinding;
        if (n661Var == null) {
            n661Var = n661.p(changePaymentMethodFragment.getLayoutInflater());
            changePaymentMethodFragment.skeletonBinding = n661Var;
        }
        n661Var.b.render(new eal(yks0.b, false, null, 6));
        return n661Var.o();
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void consumeSideEffect(qas0 sideEffect) {
        super.consumeSideEffect(sideEffect);
        if (!(sideEffect instanceof dd9)) {
            if (sideEffect instanceof ed9) {
                com.ybsdk.widgets.common.snackbar.a.a(Snackbar.Companion, requireActivity(), ((ed9) sideEffect).a(), null, 12);
            }
        } else {
            YbDivView ybDivView = this.divView;
            if (ybDivView != null) {
                dd9 dd9Var = (dd9) sideEffect;
                ybDivView.setVariable(dd9Var.b(), dd9Var.a());
            }
        }
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public /* bridge */ /* synthetic */ yr31 create(lfx lfxVar, y8f y8fVar) {
        return super.create(lfxVar, y8fVar);
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    /* renamed from: createViewModel */
    public c getFactoryOfViewModel() {
        return ((gd9) this.viewModelFactory).a((ChangePaymentMethodParameter) dcs.a(this));
    }

    @Override // defpackage.tdr
    public boolean fitNavigation() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ce4
    public boolean onBackPressed() {
        m661 m661Var = (m661) getBinding();
        LinearLayout linearLayout = m661Var.d;
        BottomSheetDialogView bottomSheetDialogView = m661Var.b;
        if (linearLayout.getVisibility() == 0) {
            ((c) getViewModel()).d0();
            return true;
        }
        if (bottomSheetDialogView.getVisibility() != 0) {
            return false;
        }
        bottomSheetDialogView.dismiss();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        ((c) getViewModel()).h0();
        super.onDestroy();
    }

    @Override // com.ybsdk.core.presentation.BindingFragment, com.ybsdk.core.presentation.BaseThemeFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.web3dsView = null;
        this.divView = null;
        this.lastYbDivData = null;
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v4, types: [bnp0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // com.ybsdk.core.mvp.BaseMvvmFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ?? r1 = this;
        while (true) {
            if (r1 == 0) {
                xx60 activity = getActivity();
                if (!(activity instanceof bnp0)) {
                    activity = null;
                }
                r1 = (bnp0) activity;
                if (r1 == 0) {
                    r1 = 0;
                }
            } else if (r1 instanceof bnp0) {
                break;
            } else {
                r1 = r1.getParentFragment();
            }
        }
        bnp0 bnp0Var = (bnp0) r1;
        ((m661) getBinding()).b.onDismiss(new cs8(8, this, bnp0Var));
        if (bnp0Var != null) {
            bnp0Var.setGripVisible(false);
        }
        ToolbarView toolbarView = ((m661) getBinding()).c;
        Text.Empty empty = Text.Empty.INSTANCE;
        nbv nbvVar = new nbv(nyg0.ybsdk_ic_arrow_short_back);
        Text.Resource h = unr0.h(Text.Companion, dzh0.ybsdk_common_accessability_back_title);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        toolbarView.render(new stz0(empty, null, null, nbvVar, h, qtz0.a, false, null, null, null, null, null, 28614));
        int i = 1;
        ((m661) getBinding()).c.setOnImageClickListener(new vc9(this, i));
        pbj w = ((mj31) this.web3dsFeature).w(requireContext());
        w.R(new vc9(this, 2));
        w.P(new wc9(this, i));
        WebView J = w.J();
        if (J != null) {
            J.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ((m661) getBinding()).d.addView(J);
        }
        this.web3dsView = w;
    }

    @Override // com.ybsdk.core.mvp.BaseMvvmFragment
    public void render(kd9 viewState) {
        renderBottomSheet(viewState);
        render3ds(viewState);
    }

    @Override // com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment, com.ybsdk.core.mvp.BaseMvvmFragment, defpackage.hs31
    public yr31 create(Class cls, y8f y8fVar) {
        return create(cls);
    }

    @Override // com.ybsdk.core.presentation.BindingFragment
    public m661 getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return m661.o(inflater, container);
    }
}
