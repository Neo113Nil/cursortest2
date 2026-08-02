package com.yandex.fintechsdk.features.webview.internal.presentation;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment;
import com.yandex.fintechsdk.core.ui.impl.api.shimmers.ShimmersFragment;
import com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment;
import com.yandex.pay.payment.YPayResult;
import defpackage.a621;
import defpackage.abe;
import defpackage.ag9;
import defpackage.au41;
import defpackage.du41;
import defpackage.ec31;
import defpackage.es31;
import defpackage.g8e;
import defpackage.gh91;
import defpackage.i3y;
import defpackage.i6g;
import defpackage.kgx;
import defpackage.knh0;
import defpackage.l7x;
import defpackage.lo41;
import defpackage.lt41;
import defpackage.m7x;
import defpackage.mp41;
import defpackage.mt41;
import defpackage.n7x;
import defpackage.nt41;
import defpackage.o7x;
import defpackage.ot41;
import defpackage.ovr0;
import defpackage.p7x;
import defpackage.q5z;
import defpackage.q7u;
import defpackage.q7x;
import defpackage.qoi0;
import defpackage.qr41;
import defpackage.qvr0;
import defpackage.r7x;
import defpackage.r941;
import defpackage.rs31;
import defpackage.s7x;
import defpackage.sls;
import defpackage.sm41;
import defpackage.t7x;
import defpackage.tls;
import defpackage.u6s0;
import defpackage.u7x;
import defpackage.uq41;
import defpackage.var;
import defpackage.vbi0;
import defpackage.vt41;
import defpackage.w13;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wn41;
import defpackage.y8f;
import defpackage.yt41;
import defpackage.zu41;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0007\u0010\"J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0002H\u0014¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0005R\u001b\u0010,\u001a\u00020'8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010)\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006="}, d2 = {"Lcom/yandex/fintechsdk/features/webview/internal/presentation/WebViewFragment;", "Lcom/yandex/fintechsdk/core/architecture/api/fragment/BaseFragment;", "Ldu41;", "Lot41;", "<init>", "()V", "Lmt41;", "sideEffect", "Lzy11;", "loadUrl", "(Lmt41;)V", "Lmp41;", "facade", "setupWebViewFacade", "(Lmp41;)V", "Landroid/webkit/WebResourceRequest;", "request", "", "shouldOverrideUrlLoading", "(Landroid/webkit/WebResourceRequest;)Z", "Lu7x;", Constants.KEY_MESSAGE, "handleJavascriptMessage", "(Lu7x;)V", "", "url", "openExternalUrl", "(Ljava/lang/String;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "(Lot41;)V", ClidProvider.STATE, "render", "(Ldu41;)V", "onDestroyView", "Lcom/yandex/fintechsdk/features/webview/internal/presentation/b;", "viewModel$delegate", "Li3y;", "getViewModel", "()Lcom/yandex/fintechsdk/features/webview/internal/presentation/b;", "viewModel", "Lvar;", "binding$delegate", "Lvbi0;", "getBinding", "()Lvar;", "binding", "Lsm41;", "componentStore$delegate", "getComponentStore", "()Lsm41;", "componentStore", "Ll7x;", "webviewInterface", "Ll7x;", "webViewFacade", "Lmp41;", "features-webview_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WebViewFragment extends BaseFragment<du41, ot41> {
    static final /* synthetic */ kgx[] $$delegatedProperties;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final vbi0 binding;

    /* renamed from: componentStore$delegate, reason: from kotlin metadata */
    private final i3y componentStore;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;
    private mp41 webViewFacade;
    private final l7x webviewInterface;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl("binding", 0, "getBinding()Lcom/yandex/fintechsdk/features/webview/databinding/FinsdkFragmentWebviewBinding;", WebViewFragment.class);
        qoi0.a.getClass();
        $$delegatedProperties = new kgx[]{propertyReference1Impl};
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectViewModel$2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectFeatureComponentStore$2] */
    public WebViewFragment() {
        super(knh0.finsdk_fragment_webview);
        u6s0 u6s0Var = new u6s0(9, new ec31(17, this));
        final ?? r0 = new sls(this) { // from class: com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectViewModel$2
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectViewModel$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r0.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectViewModel$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, u6s0Var, new sls() { // from class: com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectViewModel$5
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
        this.binding = gh91.d(this, WebViewFragment$binding$2.b);
        a621 a621Var = new a621(2, this, new r941(28));
        final ?? r02 = new sls(this) { // from class: com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectFeatureComponentStore$2
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectFeatureComponentStore$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r02.invoke();
            }
        });
        this.componentStore = new es31(qoi0.a(sm41.class), new sls() { // from class: com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectFeatureComponentStore$4
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, a621Var, new sls() { // from class: com.yandex.fintechsdk.features.webview.internal.presentation.WebViewFragment$special$$inlined$injectFeatureComponentStore$5
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
        this.webviewInterface = new l7x(new WebViewFragment$webviewInterface$1(1, this, WebViewFragment.class, "handleJavascriptMessage", "handleJavascriptMessage(Lcom/yandex/fintechsdk/core/ui/impl/api/view/webview/JavascriptMessage;)V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sm41 componentStore_delegate$lambda$1(lo41 lo41Var) {
        return new sm41(lo41Var);
    }

    private final var getBinding() {
        return (var) this.binding.getValue(this, $$delegatedProperties[0]);
    }

    private final sm41 getComponentStore() {
        return (sm41) this.componentStore.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleJavascriptMessage(u7x message) {
        b viewModel = getViewModel();
        viewModel.getClass();
        if (message instanceof m7x) {
            com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewViewModel$handleBstExpiredMessage$1(viewModel, (m7x) message, null));
            return;
        }
        if (message instanceof n7x) {
            com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewViewModel$handleCloseMessage$1(2, null));
            return;
        }
        if (message instanceof r7x) {
            com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewViewModel$handleOpenUrlMessage$1((r7x) message, null));
            return;
        }
        if (message instanceof o7x) {
            return;
        }
        if (message instanceof p7x) {
            com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewViewModel$handleLoginMessage$1(viewModel, null));
            return;
        }
        if (message instanceof q7x) {
            com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewViewModel$handleLogoutMessage$1(viewModel, null));
        } else {
            if ((message instanceof s7x) || (message instanceof t7x)) {
                return;
            }
            w511.b();
        }
    }

    private final void loadUrl(mt41 sideEffect) {
        mp41 mp41Var = this.webViewFacade;
        if (mp41Var == null) {
            mp41Var = sideEffect.c;
            setupWebViewFacade(mp41Var);
        }
        sideEffect.getClass();
        mp41Var.b(sideEffect.b, sideEffect.a);
    }

    private final void openExternalUrl(String url) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (ActivityNotFoundException unused) {
        }
    }

    private final void setupWebViewFacade(mp41 facade) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        Context requireContext = requireContext();
        l7x l7xVar = this.webviewInterface;
        final int i = 0;
        tls tlsVar = new tls(this) { // from class: xp41
            public final /* synthetic */ WebViewFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean shouldOverrideUrlLoading;
                String str;
                int i2 = i;
                WebViewFragment webViewFragment = this.b;
                switch (i2) {
                    case 0:
                        shouldOverrideUrlLoading = webViewFragment.shouldOverrideUrlLoading((WebResourceRequest) obj);
                        return Boolean.valueOf(shouldOverrideUrlLoading);
                    default:
                        str = WebViewFragment.setupWebViewFacade$lambda$6(webViewFragment, (String) obj);
                        return str;
                }
            }
        };
        final int i2 = 1;
        getBinding().c.addView(facade.a(requireContext, false, false, l7xVar, tlsVar, new tls(this) { // from class: xp41
            public final /* synthetic */ WebViewFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                boolean shouldOverrideUrlLoading;
                String str;
                int i22 = i2;
                WebViewFragment webViewFragment = this.b;
                switch (i22) {
                    case 0:
                        shouldOverrideUrlLoading = webViewFragment.shouldOverrideUrlLoading((WebResourceRequest) obj);
                        return Boolean.valueOf(shouldOverrideUrlLoading);
                    default:
                        str = WebViewFragment.setupWebViewFacade$lambda$6(webViewFragment, (String) obj);
                        return str;
                }
            }
        }), layoutParams);
        this.webViewFacade = facade;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setupWebViewFacade$lambda$6(WebViewFragment webViewFragment, String str) {
        return g8e.p(str, " ", webViewFragment.getViewModel().y.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldOverrideUrlLoading(WebResourceRequest request) {
        b viewModel = getViewModel();
        request.getUrl();
        viewModel.getClass();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b viewModel_delegate$lambda$0(WebViewFragment webViewFragment) {
        i6g i6gVar = (i6g) ((lo41) webViewFragment.getComponentStore().b.b);
        wn41 wn41Var = (wn41) i6gVar.W.get();
        q5z.h(wn41Var);
        qr41 qr41Var = new qr41((w13) i6gVar.Z.get(), (com.yandex.fintechsdk.core.navigation.impl.api.router.a) i6gVar.x.get());
        zu41 zu41Var = (zu41) i6gVar.V.get();
        q5z.h(zu41Var);
        boolean z = false;
        return new b(wn41Var, qr41Var, zu41Var, new abe(i6gVar.w, z, z), new mp41(0), new uq41());
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public b getViewModel() {
        return (b) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.webViewFacade = null;
        super.onDestroyView();
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ovr0 ovr0Var = ShimmersFragment.Companion;
        FragmentManager childFragmentManager = getChildFragmentManager();
        WebViewFragment$onViewCreated$1 webViewFragment$onViewCreated$1 = new WebViewFragment$onViewCreated$1(0, getViewModel(), b.class, "goBack", "goBack()V", 0);
        ovr0Var.getClass();
        childFragmentManager.m0("shimmers_fragment_result_id", this, new ag9(webViewFragment$onViewCreated$1));
        b viewModel = getViewModel();
        viewModel.getClass();
        com.yandex.fintechsdk.core.architecture.api.mvi.b.a(viewModel, new WebViewViewModel$onCreateView$1(viewModel, null));
    }

    @Override // com.yandex.fintechsdk.core.architecture.api.fragment.BaseFragment
    public void render(du41 state) {
        if ((state instanceof vt41) || (state instanceof au41)) {
            var binding = getBinding();
            ovr0 ovr0Var = ShimmersFragment.Companion;
            FragmentManager childFragmentManager = getChildFragmentManager();
            int id = getBinding().b.getId();
            Object obj = getComponentStore().b.b;
            qvr0 qvr0Var = new qvr0();
            ovr0Var.getClass();
            ovr0.a(id, childFragmentManager, qvr0Var, null);
            binding.c.setVisibility(4);
            return;
        }
        if (!(state instanceof yt41)) {
            w511.b();
            return;
        }
        var binding2 = getBinding();
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
    public void sideEffect(ot41 sideEffect) {
        if (sideEffect instanceof lt41) {
            w13 w13Var = getViewModel().w.a;
            YPayResult.Cancelled cancelled = YPayResult.Cancelled.INSTANCE;
            w13Var.c = null;
            w13Var.a.g(cancelled);
            return;
        }
        if (sideEffect instanceof mt41) {
            loadUrl((mt41) sideEffect);
        } else if (sideEffect instanceof nt41) {
            openExternalUrl(((nt41) sideEffect).a);
        } else {
            w511.b();
        }
    }
}
