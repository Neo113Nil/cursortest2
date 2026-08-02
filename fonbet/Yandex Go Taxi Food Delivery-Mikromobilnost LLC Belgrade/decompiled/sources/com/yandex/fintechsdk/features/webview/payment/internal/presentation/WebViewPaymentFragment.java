package com.yandex.fintechsdk.features.webview.payment.internal.presentation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersFragment;
import com.yandex.fintechsdk.data.auth.api.TokenSource;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment;
import com.yandex.pay.payment.PaymentData;
import defpackage.abe;
import defpackage.ag9;
import defpackage.as41;
import defpackage.bs41;
import defpackage.cs41;
import defpackage.dn90;
import defpackage.ds41;
import defpackage.ec31;
import defpackage.ek;
import defpackage.emg0;
import defpackage.es31;
import defpackage.es41;
import defpackage.fs41;
import defpackage.g8e;
import defpackage.gbr;
import defpackage.gh91;
import defpackage.gs41;
import defpackage.hk3;
import defpackage.hn90;
import defpackage.hs41;
import defpackage.i0k0;
import defpackage.i3y;
import defpackage.is41;
import defpackage.ji41;
import defpackage.kgx;
import defpackage.l7x;
import defpackage.li3;
import defpackage.lwf;
import defpackage.m50;
import defpackage.m6v;
import defpackage.mh5;
import defpackage.mp41;
import defpackage.mua1;
import defpackage.n7x;
import defpackage.nr41;
import defpackage.o7x;
import defpackage.ovr0;
import defpackage.p03;
import defpackage.p370;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.qk3;
import defpackage.qoi0;
import defpackage.qvr0;
import defpackage.r7x;
import defpackage.rs31;
import defpackage.s7x;
import defpackage.sls;
import defpackage.t7x;
import defpackage.tls;
import defpackage.u6s0;
import defpackage.u7x;
import defpackage.v50;
import defpackage.vbi0;
import defpackage.vnh0;
import defpackage.w13;
import defpackage.w511;
import defpackage.w8f;
import defpackage.war;
import defpackage.wr41;
import defpackage.y8f;
import defpackage.yn90;
import defpackage.yxf0;
import defpackage.z13;
import defpackage.z22;
import defpackage.zgf;
import defpackage.zn90;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u0019\u0010\u001e\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0005J\u0017\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0002H\u0014¢\u0006\u0004\b)\u0010*J\u0017\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010+R\u001b\u00101\u001a\u00020,8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\b028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010:\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010?\u001a\u00020;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010.\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/yandex/fintechsdk/features/webview/payment/internal/presentation/WebViewPaymentFragment;", "Lcom/yandex/fintechsdk/core/architecture/api/fragment/BaseFragment;", "Lis41;", "Les41;", "<init>", "()V", "Lbs41;", "sideEffect", "Lzy11;", "loadTargetUrl", "(Lbs41;)V", "Lmp41;", "facade", "", "isCachingEnabled", "isDomStorageEnabled", "setupWebViewFacade", "(Lmp41;ZZ)V", "clearWebViewFacade", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebResourceRequest;)Z", "Lu7x;", Constants.KEY_MESSAGE, "handleJavascriptMessage", "(Lu7x;)V", "initAuthContract", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", ClidProvider.STATE, "render", "(Lis41;)V", "(Les41;)V", "Lcom/yandex/fintechsdk/features/webview/payment/internal/presentation/b;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/fintechsdk/features/webview/payment/internal/presentation/b;", "viewModel", "Lm50;", "authLauncher", "Lm50;", "Lwar;", "binding$delegate", "Lvbi0;", "getBinding", "()Lwar;", "binding", "Lwr41;", "componentStore$delegate", "getComponentStore", "()Lwr41;", "componentStore", "Ll7x;", "webviewInterface", "Ll7x;", "webViewFacade", "Lmp41;", "features-webview-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WebViewPaymentFragment extends BaseFragment<is41, es41> {
    static final /* synthetic */ kgx[] $$delegatedProperties;
    private m50 authLauncher;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final vbi0 binding;

    /* renamed from: componentStore$delegate, reason: from kotlin metadata */
    private final i3y componentStore;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    private mp41 webViewFacade;
    private final l7x webviewInterface;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("binding", 0, "getBinding()Lcom/yandex/fintechsdk/features/webview/payment/databinding/FinsdkFragmentWebviewPaymentBinding;", WebViewPaymentFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectViewModel$2] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectFeatureComponentStore$2] */
    public WebViewPaymentFragment() {
        super(vnh0.finsdk_fragment_webview_payment);
        u6s0 u6s0Var = new u6s0(10, new ec31(19, this));
        final ?? r0 = new sls(this) { // from class: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectViewModel$2
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectViewModel$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectViewModel$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, u6s0Var, new sls() { // from class: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectViewModel$5
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                if (slsVar != null && (y8fVar = (y8f) slsVar.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        });
        this.binding = gh91.d(this, WebViewPaymentFragment$binding$2.b);
        WebViewPaymentFragment$componentStore$2 webViewPaymentFragment$componentStore$2 = WebViewPaymentFragment$componentStore$2.b;
        a aVar = new a(this);
        final ?? r1 = new sls(this) { // from class: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectFeatureComponentStore$2
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectFeatureComponentStore$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r1.invoke();
            }
        });
        this.componentStore = new es31(qoi0.a(wr41.class), new sls() { // from class: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectFeatureComponentStore$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, aVar, new sls() { // from class: com.yandex.fintechsdk.features.webview.payment.internal.presentation.WebViewPaymentFragment$special$$inlined$injectFeatureComponentStore$5
            final /* synthetic */ sls $extrasProducer = null;

            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                if (slsVar != null && (y8fVar = (y8f) slsVar.invoke()) != null) {
                    return y8fVar;
                }
                rs31 rs31Var = (rs31) i3y.this.getValue();
                q7u q7uVar = rs31Var instanceof q7u ? (q7u) rs31Var : null;
                return q7uVar != null ? q7uVar.getDefaultViewModelCreationExtras() : w8f.b;
            }
        });
        this.webviewInterface = new l7x(new WebViewPaymentFragment$webviewInterface$1(1, this, WebViewPaymentFragment.class, "handleJavascriptMessage", "handleJavascriptMessage(Lcom/yandex/fintechsdk/core/ui/impl/api/view/webview/JavascriptMessage;)V", 0));
    }

    private final void clearWebViewFacade() {
        getBinding().c.removeAllViews();
        mp41 mp41Var = this.webViewFacade;
        if (mp41Var != null) {
            WebView webView = mp41Var.b;
            if (webView != null) {
                webView.destroy();
            }
            CookieManager.getInstance().removeAllCookies(null);
            CookieManager.getInstance().flush();
        }
        this.webViewFacade = null;
    }

    private final war getBinding() {
        return (war) this.binding.getValue(this, $$delegatedProperties[0]);
    }

    private final wr41 getComponentStore() {
        return (wr41) this.componentStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleJavascriptMessage(u7x message) {
        b viewModel = getViewModel();
        Context requireContext = requireContext();
        z22 z22Var = viewModel.c;
        if (message instanceof n7x) {
            viewModel.G.b.a();
            return;
        }
        if (message instanceof s7x) {
            com.yandex.fintechsdk.core.analytics.impl.internal.a aVar = (com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var;
            aVar.a(new li3(19, "webview_form_ready", g8e.z("is_success", String.valueOf(((s7x) message).a))));
            return;
        }
        if (message instanceof t7x) {
            com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewPaymentViewModel$handleReloginMessage$1(viewModel, null));
            return;
        }
        if (message instanceof r7x) {
            r7x r7xVar = (r7x) message;
            if (viewModel.Z(r7xVar.c)) {
                return;
            }
            com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewPaymentViewModel$openExternalUrl$1(viewModel, r7xVar, requireContext, null));
            return;
        }
        if (message instanceof o7x) {
            ((com.yandex.fintechsdk.core.analytics.impl.internal.a) z22Var).c("webview_payment_javascript_message_error", ((o7x) message).a);
        }
    }

    private final void initAuthContract() {
        zgf zgfVar = getComponentStore().b;
        zgfVar.getClass();
        lwf lwfVar = (lwf) ((z13) zgfVar.b);
        DefaultEnvironment defaultEnvironment = lwfVar.B;
        dn90 b = lwfVar.b();
        yn90 yn90Var = b != null ? new yn90(defaultEnvironment, b, 0) : null;
        if (yn90Var == null) {
            return;
        }
        this.authLauncher = registerForActivityResult(yn90Var, new v50(11, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initAuthContract$lambda$6(WebViewPaymentFragment webViewPaymentFragment, Long l) {
        Context context = webViewPaymentFragment.getContext();
        if (context == null) {
            return;
        }
        b viewModel = webViewPaymentFragment.getViewModel();
        if (l == null) {
            viewModel.getClass();
            return;
        }
        dn90 dn90Var = viewModel.y;
        if (dn90Var != null) {
            long longValue = l.longValue();
            zn90 zn90Var = viewModel.z;
            String c = ((hn90) dn90Var).c(context, longValue, zn90Var.a, zn90Var.b, viewModel.x == DefaultEnvironment.TESTING, false, null);
            if (c == null) {
                return;
            }
            viewModel.w.a(new qk3(new ek(c, l.longValue()), TokenSource.PASSPORT));
            mua1.f(viewModel.G.b, "splash", new gbr(403, Integer.valueOf(emg0.finsdk_fade_in), Integer.valueOf(emg0.finsdk_fade_out), "webview-payment"), 2);
        }
    }

    private final void loadTargetUrl(bs41 sideEffect) {
        mp41 mp41Var = this.webViewFacade;
        if (mp41Var == null) {
            mp41Var = sideEffect.e;
            setupWebViewFacade(mp41Var, sideEffect.b, sideEffect.c);
        }
        sideEffect.getClass();
        mp41Var.b(sideEffect.d, sideEffect.a);
    }

    private final void setupWebViewFacade(mp41 facade, boolean isCachingEnabled, boolean isDomStorageEnabled) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Context requireContext = requireContext();
        l7x l7xVar = this.webviewInterface;
        final int i = 0;
        tls tlsVar = new tls(this) { // from class: yr41
            public final /* synthetic */ WebViewPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean shouldOverrideUrlLoading;
                String str;
                int i2 = i;
                WebViewPaymentFragment webViewPaymentFragment = this.b;
                switch (i2) {
                    case 0:
                        shouldOverrideUrlLoading = webViewPaymentFragment.shouldOverrideUrlLoading((WebResourceRequest) obj);
                        return Boolean.valueOf(shouldOverrideUrlLoading);
                    default:
                        str = WebViewPaymentFragment.setupWebViewFacade$lambda$5(webViewPaymentFragment, (String) obj);
                        return str;
                }
            }
        };
        final int i2 = 1;
        getBinding().c.addView(facade.a(requireContext, isCachingEnabled, isDomStorageEnabled, l7xVar, tlsVar, new tls(this) { // from class: yr41
            public final /* synthetic */ WebViewPaymentFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean shouldOverrideUrlLoading;
                String str;
                int i22 = i2;
                WebViewPaymentFragment webViewPaymentFragment = this.b;
                switch (i22) {
                    case 0:
                        shouldOverrideUrlLoading = webViewPaymentFragment.shouldOverrideUrlLoading((WebResourceRequest) obj);
                        return Boolean.valueOf(shouldOverrideUrlLoading);
                    default:
                        str = WebViewPaymentFragment.setupWebViewFacade$lambda$5(webViewPaymentFragment, (String) obj);
                        return str;
                }
            }
        }), layoutParams);
        this.webViewFacade = facade;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setupWebViewFacade$lambda$5(WebViewPaymentFragment webViewPaymentFragment, String str) {
        return g8e.p(str, " ", webViewPaymentFragment.getViewModel().E.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldOverrideUrlLoading(WebResourceRequest request) {
        return getViewModel().Z(request.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b viewModel_delegate$lambda$0(WebViewPaymentFragment webViewPaymentFragment) {
        lwf lwfVar = (lwf) ((z13) webViewPaymentFragment.getComponentStore().b.b);
        z22 analytics = lwfVar.getAnalytics();
        q5z.h(analytics);
        hk3 a = lwfVar.a();
        q5z.h(a);
        DefaultEnvironment defaultEnvironment = lwfVar.B;
        dn90 b = lwfVar.b();
        zn90 j = p03.j(defaultEnvironment);
        Context context = lwfVar.a;
        PaymentData paymentData = lwfVar.A;
        p370 p370Var = new p370(context, paymentData, lwfVar.z);
        Region region = lwfVar.y;
        boolean z = false;
        return new b(analytics, a, defaultEnvironment, b, j, p370Var, region, new yxf0(lwfVar.b, region), new i0k0((w13) lwfVar.R.get()), new abe(context, z, z), new ji41(5, (m6v) lwfVar.q0.get()), new mh5((com.yandex.fintechsdk.core.navigation.impl.api.router.a) lwfVar.T.get(), 2), new nr41(1, (com.yandex.fintechsdk.data.config.impl.internal.a) lwfVar.n0.get()), new com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.webviewpayment.data.a((com.yandex.fintechsdk.data.payment.impl.internal.order.a) lwfVar.p0.get(), paymentData, region));
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public b getViewModel() {
        return (b) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initAuthContract();
        ovr0 ovr0Var = ShimmersFragment.Companion;
        FragmentManager childFragmentManager = getChildFragmentManager();
        WebViewPaymentFragment$onCreate$1 webViewPaymentFragment$onCreate$1 = new WebViewPaymentFragment$onCreate$1(0, getViewModel(), b.class, "goBack", "goBack()V", 0);
        ovr0Var.getClass();
        childFragmentManager.m0("shimmers_fragment_result_id", this, new ag9(webViewPaymentFragment$onCreate$1));
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        b viewModel = getViewModel();
        Context requireContext = requireContext();
        viewModel.getClass();
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewPaymentViewModel$onCreateView$1(viewModel, requireContext, null));
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        getViewModel().Y();
        clearWebViewFacade();
        super.onDestroyView();
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public void render(is41 state) {
        if ((state instanceof fs41) || (state instanceof hs41)) {
            war binding = getBinding();
            ovr0 ovr0Var = ShimmersFragment.Companion;
            FragmentManager childFragmentManager = getChildFragmentManager();
            int id = getBinding().b.getId();
            ((lwf) ((z13) getComponentStore().b.b)).getClass();
            qvr0 qvr0Var = new qvr0();
            ovr0Var.getClass();
            ovr0.a(id, childFragmentManager, qvr0Var, null);
            binding.c.setVisibility(4);
            return;
        }
        if (!(state instanceof gs41)) {
            w511.b();
            return;
        }
        war binding2 = getBinding();
        ovr0 ovr0Var2 = ShimmersFragment.Companion;
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        ovr0Var2.getClass();
        Fragment F = childFragmentManager2.F("shimmers_fragment_tag");
        if (F != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager2);
            aVar.p(F);
            aVar.d();
        }
        binding2.c.setVisibility(0);
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public void sideEffect(es41 sideEffect) {
        WebView webView;
        if (sideEffect instanceof bs41) {
            loadTargetUrl((bs41) sideEffect);
            return;
        }
        if (sideEffect instanceof as41) {
            mp41 mp41Var = this.webViewFacade;
            if (mp41Var == null || (webView = mp41Var.b) == null || !webView.canGoBack()) {
                getViewModel().G.b.a();
                return;
            }
            WebView webView2 = mp41Var.b;
            if (webView2 != null) {
                webView2.goBack();
                return;
            }
            return;
        }
        if (sideEffect instanceof cs41) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((cs41) sideEffect).a)));
                return;
            } catch (Throwable th) {
                ((com.yandex.fintechsdk.core.analytics.impl.internal.a) getViewModel().c).c("webview_payment_failed_to_open_external_url", th);
                return;
            }
        }
        if (!(sideEffect instanceof ds41)) {
            w511.b();
            return;
        }
        m50 m50Var = this.authLauncher;
        if (m50Var == null) {
            m50Var = null;
        }
        m50Var.a(zy11.a);
    }
}
