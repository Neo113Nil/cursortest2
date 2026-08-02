package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.a33;
import defpackage.aah0;
import defpackage.au2;
import defpackage.b64;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.fs31;
import defpackage.hi41;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.j0g;
import defpackage.jl40;
import defpackage.jmh0;
import defpackage.kgx;
import defpackage.ki41;
import defpackage.kmm0;
import defpackage.lyz0;
import defpackage.mn41;
import defpackage.mx60;
import defpackage.myz0;
import defpackage.nyz0;
import defpackage.oxz0;
import defpackage.pub1;
import defpackage.pxy0;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.qxz0;
import defpackage.rs31;
import defpackage.rxz0;
import defpackage.s23;
import defpackage.sl91;
import defpackage.sls;
import defpackage.sng0;
import defpackage.sxz0;
import defpackage.t23;
import defpackage.tce;
import defpackage.tg21;
import defpackage.ul60;
import defpackage.vng;
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

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 62\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/topup/TopupFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lnyz0;", ClidProvider.STATE, "Lzy11;", "setScreenState", "(Lnyz0;)V", "", "startedTimeoutMillis", "loadedTimeoutMillis", "Lmn41;", "createWebViewController", "(JJ)Lmn41;", "Lhi41;", "createPaymentWidgetContract", "(JJ)Lhi41;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "Loxz0;", "dependencies$delegate", "Li3y;", "getDependencies", "()Loxz0;", "dependencies", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/topup/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/topup/a;", "viewModel", "Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView$delegate", "Lxu5;", "getProgressView", "()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "", "lastTopupUrl", "Ljava/lang/String;", "webViewController", "Lmn41;", "Companion", "qxz0", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TopupFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("progressView", 0, "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", TopupFragment.class), b64.x(qoi0.a, TopupFragment.class, "webViewContainer", "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", 0)};
    private static final qxz0 Companion = new qxz0();

    @Deprecated
    public static final String SOURCE_TOPUP = "TarifficatorTopup";

    @Deprecated
    public static final String WEBVIEW_NAME = "topup";

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;
    private String lastTopupUrl;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final xu5 webViewContainer;
    private mn41 webViewController;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment$special$$inlined$viewModels$default$1] */
    public TopupFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_topup);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: pxz0
            public final /* synthetic */ TopupFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                oxz0 dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i2 = i;
                TopupFragment topupFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = TopupFragment.dependencies_delegate$lambda$0(topupFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = TopupFragment.viewModel_delegate$lambda$1(topupFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: pxz0
            public final /* synthetic */ TopupFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                oxz0 dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i22 = i2;
                TopupFragment topupFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = TopupFragment.dependencies_delegate$lambda$0(topupFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = TopupFragment.viewModel_delegate$lambda$1(topupFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.topup.TopupFragment$special$$inlined$viewModels$default$4
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
        this.progressView = new xu5(new rxz0(this, i), new sxz0(this, aah0.topup_progress_view, i));
        this.webViewContainer = new xu5(new rxz0(this, i2), new sxz0(this, aah0.topup_web_view_container, i2));
    }

    private final hi41 createPaymentWidgetContract(long startedTimeoutMillis, long loadedTimeoutMillis) {
        return ((ki41) ((kmm0) getDependencies()).a.J0.getValue()).a(WEBVIEW_NAME, startedTimeoutMillis, loadedTimeoutMillis, new tce(this, 1));
    }

    private final mn41 createWebViewController(long startedTimeoutMillis, long loadedTimeoutMillis) {
        WebViewContainer webViewContainer = getWebViewContainer();
        au2 c = sl91.c(Collections.singletonList(createPaymentWidgetContract(startedTimeoutMillis, loadedTimeoutMillis)));
        ul60 a = ((kmm0) getDependencies()).a.t.a(SOURCE_TOPUP);
        ((wyj) ((kmm0) getDependencies()).a.i).getClass();
        com.yandex.plus.webview.api.a aVar = new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, ((kmm0) getDependencies()).a.g);
        aVar.k = (tg21) ((kmm0) getDependencies()).a.G.getValue();
        aVar.m = startedTimeoutMillis + loadedTimeoutMillis;
        aVar.n = new j0g(getProgressView(), getWebViewContainer());
        aVar.l = false;
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oxz0 dependencies_delegate$lambda$0(TopupFragment topupFragment) {
        ArrayList b = ho91.b(topupFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof oxz0) {
                return (oxz0) dependencies;
            }
        }
        qir.o(oxz0.class, b);
        return null;
    }

    private final oxz0 getDependencies() {
        return (oxz0) this.dependencies.getValue();
    }

    private final ProgressView getProgressView() {
        return (ProgressView) this.progressView.a($$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[1]);
    }

    private static final zy11 onViewCreated$lambda$3$lambda$2(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(TopupFragment topupFragment, mx60 mx60Var) {
        topupFragment.getViewModel().W();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(nyz0 state) {
        if (state instanceof myz0) {
            getProgressView().setVisibility(0);
            getWebViewContainer().setVisibility(8);
            return;
        }
        if (!(state instanceof lyz0)) {
            w511.b();
            return;
        }
        String str = this.lastTopupUrl;
        lyz0 lyz0Var = (lyz0) state;
        String str2 = lyz0Var.a;
        if (jl40.l(str, str2)) {
            return;
        }
        this.lastTopupUrl = str2;
        long j = lyz0Var.c;
        mn41 createWebViewController = createWebViewController(j, j);
        this.webViewController = createWebViewController;
        createWebViewController.loadUrl(str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$1(TopupFragment topupFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(a.class, new fs31(((kmm0) topupFragment.getDependencies()).b, 1))}, 1);
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
        t23 t23Var = new t23();
        a33 a33Var = a33.c;
        t23.a aVar = new t23.a();
        onViewCreated$lambda$3$lambda$2(aVar);
        t23Var.a.put(a33Var, aVar);
        t23Var.a(view);
        getWebViewContainer().getWebView().setBackgroundColor(vng.p(sng0.pay_sdk_primaryBlockColor, view.getContext()));
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new pxy0(10, this));
        c.b(g.a(getViewModel().A, getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED), com.yandex.plus.home.common.utils.a.c(this), new TopupFragment$onViewCreated$3(this, null));
    }
}
