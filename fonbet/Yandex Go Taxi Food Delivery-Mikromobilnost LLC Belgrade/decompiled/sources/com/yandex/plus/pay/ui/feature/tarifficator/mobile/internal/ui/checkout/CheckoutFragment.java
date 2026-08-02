package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.CheckoutContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.BottomSheetLoadingView;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment;
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
import defpackage.ekb;
import defpackage.es31;
import defpackage.fkb;
import defpackage.fs31;
import defpackage.fwa0;
import defpackage.gci0;
import defpackage.gkb;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.hwa0;
import defpackage.i3y;
import defpackage.in41;
import defpackage.jl40;
import defpackage.jmh0;
import defpackage.jy90;
import defpackage.kgx;
import defpackage.kmb;
import defpackage.kmm0;
import defpackage.ll5;
import defpackage.lmb;
import defpackage.mmb;
import defpackage.mn41;
import defpackage.mx60;
import defpackage.nmb;
import defpackage.od9;
import defpackage.omb;
import defpackage.p6;
import defpackage.pgz;
import defpackage.pjb;
import defpackage.pub1;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.s23;
import defpackage.sl91;
import defpackage.sls;
import defpackage.t23;
import defpackage.tjb;
import defpackage.ttz0;
import defpackage.u1w;
import defpackage.ul60;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wv5;
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

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \\2\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0003J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\u0003J'\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010%\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J/\u0010(\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001b\u0010H\u001a\u00020D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010@\u001a\u0004\bK\u0010LR\u001b\u0010R\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010@\u001a\u0004\bP\u0010QR\u0018\u0010T\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010VR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010WR\u0016\u0010Y\u001a\u00020X8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010ZR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010[¨\u0006^"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/checkout/CheckoutFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "Lzy11;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "onStop", "onResume", "onPause", "onDestroyView", "Lpjb;", "checkoutContentViewController", "Lcg6;", "paymentLoadingViewController", "applyInsets", "(Landroid/view/View;Lpjb;Lcg6;)V", "Lomb;", "screenState", "Lmn41;", "webViewController", "setScreenState", "(Lomb;Lpjb;Lcg6;Lmn41;)V", "handleScreenState", "Lmmb;", ClidProvider.STATE, "setLoadingState", "(Lmmb;Lpjb;Lcg6;)V", "Llmb;", "setContentState", "(Llmb;Lpjb;Lcg6;)V", "Lnmb;", "setPaymentLoadingState", "(Lnmb;Lpjb;Lcg6;)V", "Lkmb;", "setConfirmation3dsState", "(Lkmb;Lpjb;Lcg6;Lmn41;)V", "createWebViewController", "()Lmn41;", "Lin41;", "createContract3ds", "()Lin41;", "Ltjb;", "dependencies$delegate", "Li3y;", "getDependencies", "()Ltjb;", "dependencies", "Lttz0;", "toolbarViewModel$delegate", "getToolbarViewModel", "()Lttz0;", "toolbarViewModel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/checkout/d;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/checkout/d;", "viewModel", "progressView$delegate", "Lxu5;", "getProgressView", "()Landroid/view/View;", "progressView", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/CheckoutContentView;", "checkoutContentView$delegate", "getCheckoutContentView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/CheckoutContentView;", "checkoutContentView", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/common/BottomSheetLoadingView;", "paymentLoadingView$delegate", "getPaymentLoadingView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/common/BottomSheetLoadingView;", "paymentLoadingView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "", "last3dsUrl", "Ljava/lang/String;", "Lpjb;", "Lmn41;", "", "started", "Z", "Lomb;", "Companion", "ekb", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CheckoutFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("progressView", 0, "getProgressView()Landroid/view/View;", CheckoutFragment.class), b64.x(qoi0.a, CheckoutFragment.class, "checkoutContentView", "getCheckoutContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/CheckoutContentView;", 0), new PropertyReference1Impl("paymentLoadingView", 0, "getPaymentLoadingView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/common/BottomSheetLoadingView;", CheckoutFragment.class), new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", CheckoutFragment.class)};
    private static final ekb Companion = new ekb();

    @Deprecated
    public static final String SOURCE_TARIFFICATOR_CHECKOUT_3DS = "TarifficatorCheckoutPayment3DSWebView";

    /* renamed from: checkoutContentView$delegate, reason: from kotlin metadata */
    private final xu5 checkoutContentView;
    private pjb checkoutContentViewController;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;
    private String last3dsUrl;

    /* renamed from: paymentLoadingView$delegate, reason: from kotlin metadata */
    private final xu5 paymentLoadingView;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;
    private omb screenState;
    private boolean started;

    /* renamed from: toolbarViewModel$delegate, reason: from kotlin metadata */
    private final i3y toolbarViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final xu5 webViewContainer;
    private mn41 webViewController;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$6] */
    public CheckoutFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_checkout);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: dkb
            public final /* synthetic */ CheckoutFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tjb dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                CheckoutFragment checkoutFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = CheckoutFragment.dependencies_delegate$lambda$0(checkoutFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = CheckoutFragment.toolbarViewModel_delegate$lambda$1(checkoutFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = CheckoutFragment.viewModel_delegate$lambda$2(checkoutFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: dkb
            public final /* synthetic */ CheckoutFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tjb dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                CheckoutFragment checkoutFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = CheckoutFragment.dependencies_delegate$lambda$0(checkoutFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = CheckoutFragment.toolbarViewModel_delegate$lambda$1(checkoutFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = CheckoutFragment.viewModel_delegate$lambda$2(checkoutFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.toolbarViewModel = new es31(qoi0.a(ttz0.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$4
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
        final int i3 = 2;
        sls slsVar2 = new sls(this) { // from class: dkb
            public final /* synthetic */ CheckoutFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                tjb dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                CheckoutFragment checkoutFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = CheckoutFragment.dependencies_delegate$lambda$0(checkoutFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = CheckoutFragment.toolbarViewModel_delegate$lambda$1(checkoutFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = CheckoutFragment.viewModel_delegate$lambda$2(checkoutFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r5 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$6
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r5.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(d.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar2, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment$special$$inlined$viewModels$default$9
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar3 = this.$extrasProducer;
                if (slsVar3 != null && (y8fVar = (y8f) slsVar3.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                y8f defaultViewModelCreationExtras = q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? w8f.b : defaultViewModelCreationExtras;
            }
        });
        this.progressView = new xu5(new fkb(this, i), new gkb(this, aah0.checkout_progress_view, i));
        this.checkoutContentView = new xu5(new fkb(this, i2), new gkb(this, aah0.checkout_content_view, i2));
        this.paymentLoadingView = new xu5(new fkb(this, i3), new gkb(this, aah0.checkout_loading_view, i3));
        int i4 = 3;
        this.webViewContainer = new xu5(new fkb(this, i4), new gkb(this, aah0.checkout_webview_container, i4));
    }

    private final void applyInsets(View view, pjb checkoutContentViewController, cg6 paymentLoadingViewController) {
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
        ckb ckbVar = new ckb(this, i, i2, i3, i4, checkoutContentViewController, paymentLoadingViewController);
        t23.a aVar = new t23.a();
        applyInsets$lambda$6$lambda$5(aVar);
        t23Var.a.put(ckbVar, aVar);
        t23Var.a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyInsets$lambda$6$lambda$4(CheckoutFragment checkoutFragment, int i, int i2, int i3, int i4, pjb pjbVar, cg6 cg6Var, u1w u1wVar) {
        WebViewContainer webViewContainer = checkoutFragment.getWebViewContainer();
        int i5 = u1wVar.a;
        int i6 = u1wVar.b;
        int i7 = u1wVar.c;
        int i8 = u1wVar.d;
        bb1.R(i + i5, i2 + i6, i3 + i7, i4 + i8, webViewContainer);
        wv5 wv5Var = pjbVar.d;
        kgx[] kgxVarArr = pjb.I;
        PlusPayToolbarView plusPayToolbarView = (PlusPayToolbarView) wv5Var.a(kgxVarArr[1]);
        plusPayToolbarView.setPadding(plusPayToolbarView.getPaddingLeft(), pjbVar.z + i6, plusPayToolbarView.getPaddingRight(), plusPayToolbarView.getPaddingBottom());
        CheckoutContentView checkoutContentView = pjbVar.a;
        checkoutContentView.setPadding(pjbVar.A + i5, checkoutContentView.getPaddingTop(), pjbVar.B + i7, checkoutContentView.getPaddingBottom());
        CardView cardView = (CardView) pjbVar.r.a(kgxVarArr[16]);
        if (cardView != null) {
            cardView.setContentPadding(cardView.getContentPaddingLeft(), cardView.getContentPaddingTop(), cardView.getContentPaddingRight(), pjbVar.D + i8);
        }
        LinearLayout linearLayout = (LinearLayout) pjbVar.s.a(kgxVarArr[17]);
        if (linearLayout != null) {
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), pjbVar.C + i8);
        }
        bb1.S(0, pjbVar.E + i8, 7, pjbVar.f());
        ViewGroup a = cg6Var.a();
        a.setPadding(i5, a.getPaddingTop(), i7, i8);
    }

    private static final zy11 applyInsets$lambda$6$lambda$5(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    private final in41 createContract3ds() {
        return ((jy90) ((kmm0) getDependencies()).a.E0.getValue()).a(requireActivity(), new b(this));
    }

    private final mn41 createWebViewController() {
        WebViewContainer webViewContainer = getWebViewContainer();
        au2 c = sl91.c(Collections.singletonList(createContract3ds()));
        ul60 a = ((kmm0) getDependencies()).a.t.a(SOURCE_TARIFFICATOR_CHECKOUT_3DS);
        ((wyj) ((kmm0) getDependencies()).a.i).getClass();
        return new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, ((kmm0) getDependencies()).a.g).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tjb dependencies_delegate$lambda$0(CheckoutFragment checkoutFragment) {
        ArrayList b = ho91.b(checkoutFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof tjb) {
                return (tjb) dependencies;
            }
        }
        qir.o(tjb.class, b);
        return null;
    }

    private final CheckoutContentView getCheckoutContentView() {
        return (CheckoutContentView) this.checkoutContentView.a($$delegatedProperties[1]);
    }

    private final tjb getDependencies() {
        return (tjb) this.dependencies.getValue();
    }

    private final BottomSheetLoadingView getPaymentLoadingView() {
        return (BottomSheetLoadingView) this.paymentLoadingView.a($$delegatedProperties[2]);
    }

    private final View getProgressView() {
        return (View) this.progressView.a($$delegatedProperties[0]);
    }

    private final ttz0 getToolbarViewModel() {
        return (ttz0) this.toolbarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d getViewModel() {
        return (d) this.viewModel.getValue();
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[3]);
    }

    private final void handleScreenState() {
        omb ombVar;
        if (!this.started || (ombVar = this.screenState) == null || (ombVar instanceof mmb)) {
            return;
        }
        if (!(ombVar instanceof lmb) && !(ombVar instanceof nmb) && !(ombVar instanceof kmb)) {
            w511.b();
            return;
        }
        hwa0 hwa0Var = (hwa0) ((fwa0) ((kmm0) getDependencies()).a.L0.getValue());
        pgz pgzVar = hwa0Var.e;
        LogPriority logPriority = LogPriority.DEBUG;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PerformanceSessionImpl", "onShowFirstScreen()");
        }
        hwa0Var.a((ll5) hwa0Var.f.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(CheckoutFragment checkoutFragment, mx60 mx60Var) {
        checkoutFragment.getViewModel().b0();
        return zy11.a;
    }

    private final void setConfirmation3dsState(kmb state, pjb checkoutContentViewController, cg6 paymentLoadingViewController, mn41 webViewController) {
        if (!jl40.l(this.last3dsUrl, state.d)) {
            String str = state.d;
            this.last3dsUrl = str;
            webViewController.loadUrl(str, null);
        }
        getProgressView().setVisibility(8);
        if (state.e) {
            getWebViewContainer().setVisibility(0);
            getCheckoutContentView().setVisibility(8);
            paymentLoadingViewController.d();
        } else {
            getWebViewContainer().setVisibility(8);
            getCheckoutContentView().setVisibility(0);
            checkoutContentViewController.g(state.a);
            paymentLoadingViewController.f(state.b, state.c);
        }
    }

    private final void setContentState(lmb state, pjb checkoutContentViewController, cg6 paymentLoadingViewController) {
        getProgressView().setVisibility(8);
        getCheckoutContentView().setVisibility(0);
        getWebViewContainer().setVisibility(8);
        checkoutContentViewController.g(state.a);
        checkoutContentViewController.a.removeView(checkoutContentViewController.H);
        checkoutContentViewController.d().setEnabled(true);
        paymentLoadingViewController.d();
    }

    private final void setLoadingState(mmb state, pjb checkoutContentViewController, cg6 paymentLoadingViewController) {
        if (state.a != null) {
            getProgressView().setVisibility(8);
            getCheckoutContentView().setVisibility(0);
            checkoutContentViewController.g(state.a);
            View view = checkoutContentViewController.H;
            if (view.getParent() == null) {
                checkoutContentViewController.a.addView(view);
            }
            checkoutContentViewController.d().setEnabled(false);
        } else {
            getProgressView().setVisibility(0);
            getCheckoutContentView().setVisibility(8);
        }
        getWebViewContainer().setVisibility(8);
        paymentLoadingViewController.d();
    }

    private final void setPaymentLoadingState(nmb state, pjb checkoutContentViewController, cg6 paymentLoadingViewController) {
        getProgressView().setVisibility(8);
        getCheckoutContentView().setVisibility(0);
        getWebViewContainer().setVisibility(8);
        checkoutContentViewController.g(state.a);
        paymentLoadingViewController.f(state.b, state.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(omb screenState, pjb checkoutContentViewController, cg6 paymentLoadingViewController, mn41 webViewController) {
        if (screenState instanceof mmb) {
            setLoadingState((mmb) screenState, checkoutContentViewController, paymentLoadingViewController);
        } else if (screenState instanceof lmb) {
            setContentState((lmb) screenState, checkoutContentViewController, paymentLoadingViewController);
        } else if (screenState instanceof nmb) {
            setPaymentLoadingState((nmb) screenState, checkoutContentViewController, paymentLoadingViewController);
        } else {
            if (!(screenState instanceof kmb)) {
                w511.b();
                return;
            }
            setConfirmation3dsState((kmb) screenState, checkoutContentViewController, paymentLoadingViewController, webViewController);
        }
        this.screenState = screenState;
        handleScreenState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 toolbarViewModel_delegate$lambda$1(CheckoutFragment checkoutFragment) {
        return ((kmm0) checkoutFragment.getDependencies()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(CheckoutFragment checkoutFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(d.class, new fs31(((kmm0) checkoutFragment.getDependencies()).b, 8))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        pjb pjbVar = this.checkoutContentViewController;
        if (pjbVar != null) {
            p6 p6Var = pjbVar.G;
            ViewTreeObserver viewTreeObserver = pjbVar.F;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnScrollChangedListener(p6Var);
            } else {
                pjbVar.a.getViewTreeObserver().removeOnScrollChangedListener(p6Var);
            }
        }
        this.checkoutContentViewController = null;
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
    public void onStart() {
        super.onStart();
        this.started = true;
        handleScreenState();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.started = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new od9(25, this));
        pjb pjbVar = new pjb(getCheckoutContentView(), new CheckoutFragment$onViewCreated$checkoutContentViewController$1(1, getViewModel(), d.class, "onPaymentMethodClick", "onPaymentMethodClick(Ljava/lang/String;)V", 0), new CheckoutFragment$onViewCreated$checkoutContentViewController$2(1, getViewModel(), d.class, "onPaymentPromoCardClick", "onPaymentPromoCardClick(Ljava/lang/String;)V", 0), new CheckoutFragment$onViewCreated$checkoutContentViewController$3(1, getViewModel(), d.class, "onMailingAdsAgreementStatusChanged", "onMailingAdsAgreementStatusChanged(Z)V", 0), new CheckoutFragment$onViewCreated$checkoutContentViewController$4(0, getViewModel(), d.class, "onPaymentButtonClick", "onPaymentButtonClick()V", 0), new CheckoutFragment$onViewCreated$checkoutContentViewController$5(0, getViewModel(), d.class, "onCloseButtonClick", "onCloseButtonClick()V", 0), new CheckoutFragment$onViewCreated$checkoutContentViewController$6(0, getViewModel(), d.class, "onLegalTextShown", "onLegalTextShown()V", 0), new CheckoutFragment$onViewCreated$checkoutContentViewController$7(2, getViewModel(), d.class, "onOnsaleSelectedChanged", "onOnsaleSelectedChanged(Ljava/lang/String;Z)V", 0), new CheckoutFragment$onViewCreated$checkoutContentViewController$8(1, getViewModel(), d.class, "onOfferSwitchSelectedChanged", "onOfferSwitchSelectedChanged(Z)V", 0), ((kmm0) getDependencies()).a.j, ((kmm0) getDependencies()).a.q);
        this.checkoutContentViewController = pjbVar;
        cg6 cg6Var = new cg6(getPaymentLoadingView());
        applyInsets(view, pjbVar, cg6Var);
        mn41 createWebViewController = createWebViewController();
        this.webViewController = createWebViewController;
        gci0 gci0Var = getToolbarViewModel().b;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        com.yandex.plus.home.common.utils.c.b(g.a(gci0Var, lifecycle, state), com.yandex.plus.home.common.utils.a.c(this), new CheckoutFragment$onViewCreated$2(pjbVar, null));
        com.yandex.plus.home.common.utils.c.b(g.a(getViewModel().U, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new CheckoutFragment$onViewCreated$3(this, pjbVar, cg6Var, createWebViewController, null));
    }
}
