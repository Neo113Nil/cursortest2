package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.PlusPayPaymentLoadingView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.aah0;
import defpackage.au2;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.ds31;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.fs31;
import defpackage.hed0;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.ics0;
import defpackage.in41;
import defpackage.jcs0;
import defpackage.jl40;
import defpackage.jmh0;
import defpackage.jy90;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.lcs0;
import defpackage.mcs0;
import defpackage.mn41;
import defpackage.mx60;
import defpackage.ncs0;
import defpackage.ocs0;
import defpackage.pcs0;
import defpackage.pub1;
import defpackage.q7u;
import defpackage.qcs0;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.quq0;
import defpackage.rcs0;
import defpackage.rs31;
import defpackage.s23;
import defpackage.sl91;
import defpackage.sls;
import defpackage.t23;
import defpackage.tje;
import defpackage.u1w;
import defpackage.ul60;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wyj;
import defpackage.xu5;
import defpackage.y8f;
import defpackage.ywv;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00106¨\u00069"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/silent/SilentPaymentFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lrcs0;", ClidProvider.STATE, "Lhed0;", "loadingViewController", "Lmn41;", "webViewController", "Lzy11;", "setScreenState", "(Lrcs0;Lhed0;Lmn41;)V", "Landroid/view/View;", "view", "applyInsets", "(Landroid/view/View;Lhed0;)V", "createWebViewController", "()Lmn41;", "Lin41;", "createContract3ds", "()Lin41;", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "Lics0;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lics0;", "dependencies", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/silent/b;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/silent/b;", "viewModel", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "Lxu5;", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/loading/PlusPayPaymentLoadingView;", "loadingView$delegate", "getLoadingView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/loading/PlusPayPaymentLoadingView;", "loadingView", "", "last3dsUrl", "Ljava/lang/String;", "Lmn41;", "Companion", "lcs0", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SilentPaymentFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", SilentPaymentFragment.class), b64.x(qoi0.a, SilentPaymentFragment.class, "loadingView", "getLoadingView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/loading/PlusPayPaymentLoadingView;", 0)};
    private static final lcs0 Companion = new lcs0();

    @Deprecated
    public static final String SOURCE_TARIFFICATOR_SILENT_3DS = "TarifficatorSilentPayment3DSWebView";

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;
    private String last3dsUrl;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final xu5 loadingView;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final xu5 webViewContainer;
    private mn41 webViewController;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment$special$$inlined$viewModels$default$1] */
    public SilentPaymentFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_silent);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: kcs0
            public final /* synthetic */ SilentPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ics0 dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i2 = i;
                SilentPaymentFragment silentPaymentFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = SilentPaymentFragment.dependencies_delegate$lambda$0(silentPaymentFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = SilentPaymentFragment.viewModel_delegate$lambda$1(silentPaymentFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: kcs0
            public final /* synthetic */ SilentPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ics0 dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i22 = i2;
                SilentPaymentFragment silentPaymentFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = SilentPaymentFragment.dependencies_delegate$lambda$0(silentPaymentFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = SilentPaymentFragment.viewModel_delegate$lambda$1(silentPaymentFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment$special$$inlined$viewModels$default$1
            final /* synthetic */ Fragment $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_viewModels;
            }
        };
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment$special$$inlined$viewModels$default$4
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar2 = this.$extrasProducer;
                if (slsVar2 != null && (y8fVar = (y8f) slsVar2.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                y8f defaultViewModelCreationExtras = q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? w8f.b : defaultViewModelCreationExtras;
            }
        });
        this.webViewContainer = new xu5(new mcs0(this, i), new ncs0(this, aah0.silent_payment_webview_container, i));
        this.loadingView = new xu5(new mcs0(this, i2), new ncs0(this, aah0.silent_payment_loading_view, i2));
    }

    private final void applyInsets(View view, hed0 loadingViewController) {
        ViewGroup.LayoutParams layoutParams = getWebViewContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = getWebViewContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = getWebViewContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = getWebViewContainer().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0;
        t23 t23Var = new t23();
        jcs0 jcs0Var = new jcs0(this, i, i2, i3, i4, loadingViewController, 0);
        t23.a aVar = new t23.a();
        applyInsets$lambda$5$lambda$4(aVar);
        t23Var.a.put(jcs0Var, aVar);
        t23Var.a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyInsets$lambda$5$lambda$3(SilentPaymentFragment silentPaymentFragment, int i, int i2, int i3, int i4, hed0 hed0Var, u1w u1wVar) {
        WebViewContainer webViewContainer = silentPaymentFragment.getWebViewContainer();
        int i5 = u1wVar.a;
        int i6 = u1wVar.b;
        int i7 = u1wVar.c;
        int i8 = u1wVar.d;
        bb1.R(i + i5, i2 + i6, i3 + i7, i4 + i8, webViewContainer);
        hed0Var.a().setPadding(hed0Var.i + i5, hed0Var.j + i6, hed0Var.k + i7, hed0Var.l + i8);
    }

    private static final zy11 applyInsets$lambda$5$lambda$4(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    private final in41 createContract3ds() {
        return ((jy90) ((kmm0) getDependencies()).a.E0.getValue()).a(requireActivity(), new a(this));
    }

    private final mn41 createWebViewController() {
        WebViewContainer webViewContainer = getWebViewContainer();
        au2 c = sl91.c(Collections.singletonList(createContract3ds()));
        ul60 a = ((kmm0) getDependencies()).a.t.a(SOURCE_TARIFFICATOR_SILENT_3DS);
        ((wyj) ((kmm0) getDependencies()).a.i).getClass();
        return new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, ((kmm0) getDependencies()).a.g).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ics0 dependencies_delegate$lambda$0(SilentPaymentFragment silentPaymentFragment) {
        ArrayList b = ho91.b(silentPaymentFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof ics0) {
                return (ics0) dependencies;
            }
        }
        qir.o(ics0.class, b);
        return null;
    }

    private final ics0 getDependencies() {
        return (ics0) this.dependencies.getValue();
    }

    private final PlusPayPaymentLoadingView getLoadingView() {
        return (PlusPayPaymentLoadingView) this.loadingView.a($$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getViewModel() {
        return (b) this.viewModel.getValue();
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(SilentPaymentFragment silentPaymentFragment, mx60 mx60Var) {
        b viewModel = silentPaymentFragment.getViewModel();
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new SilentPaymentViewModel$onBackPressed$1(viewModel, null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(rcs0 state, hed0 loadingViewController, mn41 webViewController) {
        if (state instanceof pcs0) {
            getWebViewContainer().setVisibility(8);
            loadingViewController.b();
            loadingViewController.a.setVisibility(0);
            loadingViewController.c(false);
            return;
        }
        if (state instanceof qcs0) {
            getWebViewContainer().setVisibility(8);
            loadingViewController.d(((qcs0) state).a);
            return;
        }
        if (!(state instanceof ocs0)) {
            w511.b();
            return;
        }
        String str = this.last3dsUrl;
        ocs0 ocs0Var = (ocs0) state;
        String str2 = ocs0Var.a;
        if (!jl40.l(str, str2)) {
            this.last3dsUrl = str2;
            webViewController.loadUrl(str2, null);
        }
        if (!ocs0Var.b) {
            getWebViewContainer().setVisibility(8);
            loadingViewController.d(ocs0Var.c);
        } else {
            getWebViewContainer().setVisibility(0);
            loadingViewController.b();
            loadingViewController.a.setVisibility(8);
            loadingViewController.c(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$1(SilentPaymentFragment silentPaymentFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(b.class, new fs31(((kmm0) silentPaymentFragment.getDependencies()).b, 6))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.webViewController = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        mn41 mn41Var = this.webViewController;
        if (mn41Var != null) {
            mn41Var.onPause();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        mn41 mn41Var = this.webViewController;
        if (mn41Var != null) {
            mn41Var.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new quq0(11, this));
        mn41 createWebViewController = createWebViewController();
        this.webViewController = createWebViewController;
        hed0 hed0Var = new hed0(getLoadingView());
        applyInsets(view, hed0Var);
        c.b(g.a(getViewModel().F, getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED), com.yandex.plus.home.common.utils.a.c(this), new SilentPaymentFragment$onViewCreated$2(this, hed0Var, createWebViewController, null));
    }
}
