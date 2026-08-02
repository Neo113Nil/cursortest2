package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.BottomSheetLoadingView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.UpsaleContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.aah0;
import defpackage.au2;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cg6;
import defpackage.ckb;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.e2d0;
import defpackage.ee21;
import defpackage.es31;
import defpackage.fe21;
import defpackage.fs31;
import defpackage.he21;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.ie21;
import defpackage.in41;
import defpackage.je21;
import defpackage.jmh0;
import defpackage.jy90;
import defpackage.ke21;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.le21;
import defpackage.me21;
import defpackage.mn41;
import defpackage.mx60;
import defpackage.ne21;
import defpackage.oe21;
import defpackage.p6;
import defpackage.pub1;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.s23;
import defpackage.sl91;
import defpackage.sls;
import defpackage.t23;
import defpackage.u1w;
import defpackage.ul60;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wx11;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0003R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010<R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010>R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010?¨\u0006B"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/upsale/UpsaleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Loe21;", ClidProvider.STATE, "Lee21;", "upsaleContentViewController", "Lcg6;", "paymentLoadingViewController", "Lmn41;", "webViewController", "Lzy11;", "setScreenState", "(Loe21;Lee21;Lcg6;Lmn41;)V", "Landroid/view/View;", "view", "applyInsets", "(Landroid/view/View;Lcg6;Lee21;)V", "createWebViewController", "()Lmn41;", "Lin41;", "createContract3ds", "()Lin41;", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "Lfe21;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lfe21;", "dependencies", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/upsale/b;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/upsale/b;", "viewModel", "progressView$delegate", "Lxu5;", "getProgressView", "()Landroid/view/View;", "progressView", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/upsale/UpsaleContentView;", "upsaleContentView$delegate", "getUpsaleContentView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/upsale/UpsaleContentView;", "upsaleContentView", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/common/BottomSheetLoadingView;", "paymentLoadingView$delegate", "getPaymentLoadingView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/common/BottomSheetLoadingView;", "paymentLoadingView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Lee21;", "Lmn41;", "Companion", "he21", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UpsaleFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("progressView", 0, "getProgressView()Landroid/view/View;", UpsaleFragment.class), b64.x(qoi0.a, UpsaleFragment.class, "upsaleContentView", "getUpsaleContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/upsale/UpsaleContentView;", 0), new PropertyReference1Impl("paymentLoadingView", 0, "getPaymentLoadingView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/common/BottomSheetLoadingView;", UpsaleFragment.class), new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", UpsaleFragment.class)};
    public static final he21 Companion = new he21();
    public static final String SOURCE_TARIFFICATOR_3DS = "TarifficatorUpsale3DSWebView";

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;

    /* renamed from: paymentLoadingView$delegate, reason: from kotlin metadata */
    private final xu5 paymentLoadingView;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: upsaleContentView$delegate, reason: from kotlin metadata */
    private final xu5 upsaleContentView;
    private ee21 upsaleContentViewController;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final xu5 webViewContainer;
    private mn41 webViewController;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment$special$$inlined$viewModels$default$1] */
    public UpsaleFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_upsale);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: ge21
            public final /* synthetic */ UpsaleFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                fe21 dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i2 = i;
                UpsaleFragment upsaleFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = UpsaleFragment.dependencies_delegate$lambda$0(upsaleFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = UpsaleFragment.viewModel_delegate$lambda$1(upsaleFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: ge21
            public final /* synthetic */ UpsaleFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                fe21 dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i22 = i2;
                UpsaleFragment upsaleFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = UpsaleFragment.dependencies_delegate$lambda$0(upsaleFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = UpsaleFragment.viewModel_delegate$lambda$1(upsaleFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.UpsaleFragment$special$$inlined$viewModels$default$4
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
        this.progressView = new xu5(new ie21(this, i), new je21(this, aah0.upsale_progress_view, i));
        this.upsaleContentView = new xu5(new ie21(this, i2), new je21(this, aah0.upsale_content_view, i2));
        int i3 = 2;
        this.paymentLoadingView = new xu5(new ie21(this, i3), new je21(this, aah0.upsale_loading_view, i3));
        int i4 = 3;
        this.webViewContainer = new xu5(new ie21(this, i4), new je21(this, aah0.upsale_webview_container, i4));
    }

    private final void applyInsets(View view, cg6 paymentLoadingViewController, ee21 upsaleContentViewController) {
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
        ckb ckbVar = new ckb(this, i, i2, i3, i4, paymentLoadingViewController, upsaleContentViewController);
        t23.a aVar = new t23.a();
        applyInsets$lambda$5$lambda$4(aVar);
        t23Var.a.put(ckbVar, aVar);
        t23Var.a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyInsets$lambda$5$lambda$3(UpsaleFragment upsaleFragment, int i, int i2, int i3, int i4, cg6 cg6Var, ee21 ee21Var, u1w u1wVar) {
        WebViewContainer webViewContainer = upsaleFragment.getWebViewContainer();
        int i5 = u1wVar.a;
        int i6 = u1wVar.b;
        int i7 = u1wVar.c;
        int i8 = u1wVar.d;
        bb1.R(i + i5, i2 + i6, i3 + i7, i4 + i8, webViewContainer);
        ViewGroup a = cg6Var.a();
        a.setPadding(i5, a.getPaddingTop(), i7, i8);
        ee21Var.a().setPadding(ee21Var.s + i5, ee21Var.t + i6, ee21Var.u + i7, ee21Var.v + i8);
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
        ul60 a = ((kmm0) getDependencies()).a.t.a(SOURCE_TARIFFICATOR_3DS);
        ((wyj) ((kmm0) getDependencies()).a.i).getClass();
        return new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, ((kmm0) getDependencies()).a.g).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fe21 dependencies_delegate$lambda$0(UpsaleFragment upsaleFragment) {
        ArrayList b = ho91.b(upsaleFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof fe21) {
                return (fe21) dependencies;
            }
        }
        qir.o(fe21.class, b);
        return null;
    }

    private final fe21 getDependencies() {
        return (fe21) this.dependencies.getValue();
    }

    private final BottomSheetLoadingView getPaymentLoadingView() {
        return (BottomSheetLoadingView) this.paymentLoadingView.a($$delegatedProperties[2]);
    }

    private final View getProgressView() {
        return (View) this.progressView.a($$delegatedProperties[0]);
    }

    private final UpsaleContentView getUpsaleContentView() {
        return (UpsaleContentView) this.upsaleContentView.a($$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getViewModel() {
        return (b) this.viewModel.getValue();
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$2(UpsaleFragment upsaleFragment, mx60 mx60Var) {
        b viewModel = upsaleFragment.getViewModel();
        oe21 oe21Var = (oe21) viewModel.J.getValue();
        if ((oe21Var instanceof me21) || (oe21Var instanceof le21) || (oe21Var instanceof ke21)) {
            viewModel.Y();
        } else if (!(oe21Var instanceof ne21)) {
            w511.b();
            return null;
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(oe21 state, ee21 upsaleContentViewController, cg6 paymentLoadingViewController, mn41 webViewController) {
        if (state instanceof me21) {
            getProgressView().setVisibility(0);
            getWebViewContainer().setVisibility(8);
            paymentLoadingViewController.d();
            upsaleContentViewController.a.setVisibility(8);
            return;
        }
        if (state instanceof le21) {
            getProgressView().setVisibility(8);
            getWebViewContainer().setVisibility(8);
            paymentLoadingViewController.d();
            upsaleContentViewController.b(((le21) state).a);
            upsaleContentViewController.a.setVisibility(0);
            return;
        }
        if (state instanceof ne21) {
            getProgressView().setVisibility(8);
            getWebViewContainer().setVisibility(8);
            ne21 ne21Var = (ne21) state;
            paymentLoadingViewController.f(ne21Var.b, ne21Var.c);
            upsaleContentViewController.b(ne21Var.a);
            upsaleContentViewController.a.setVisibility(0);
            return;
        }
        if (!(state instanceof ke21)) {
            w511.b();
            return;
        }
        getProgressView().setVisibility(8);
        getWebViewContainer().setVisibility(0);
        webViewController.loadUrl(((ke21) state).a, null);
        paymentLoadingViewController.d();
        upsaleContentViewController.a.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$1(UpsaleFragment upsaleFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(b.class, new fs31(((kmm0) upsaleFragment.getDependencies()).b, 0))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ee21 ee21Var = this.upsaleContentViewController;
        if (ee21Var != null) {
            p6 p6Var = ee21Var.r;
            ViewTreeObserver viewTreeObserver = ee21Var.q;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(p6Var);
            } else {
                ee21Var.a.getViewTreeObserver().removeOnScrollChangedListener(p6Var);
            }
        }
        this.upsaleContentViewController = null;
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
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new wx11(9, this));
        ee21 ee21Var = new ee21(getUpsaleContentView(), ((kmm0) getDependencies()).a.j, new UpsaleFragment$onViewCreated$upsaleContentViewController$1(0, getViewModel(), b.class, "onAcceptUpsale", "onAcceptUpsale()V", 0), new UpsaleFragment$onViewCreated$upsaleContentViewController$2(0, getViewModel(), b.class, "onRejectUpsale", "onRejectUpsale()V", 0), new UpsaleFragment$onViewCreated$upsaleContentViewController$3(0, getViewModel(), b.class, "onLegalTextShown", "onLegalTextShown()V", 0));
        this.upsaleContentViewController = ee21Var;
        mn41 createWebViewController = createWebViewController();
        this.webViewController = createWebViewController;
        cg6 cg6Var = new cg6(getPaymentLoadingView());
        applyInsets(view, cg6Var, ee21Var);
        c.b(g.a(getViewModel().J, getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED), com.yandex.plus.home.common.utils.a.c(this), new UpsaleFragment$onViewCreated$2(this, ee21Var, cg6Var, createWebViewController, null));
    }
}
