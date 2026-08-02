package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.log.api.LogPriority;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment;
import com.yandex.plus.webview.api.WebViewContainer;
import com.yandex.plus.webview.api.contract.message.WebViewMessagesHandler;
import defpackage.PayUIEvgenAnalytics$FamilyInviteCloseSource;
import defpackage.a33;
import defpackage.aah0;
import defpackage.au2;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cmi;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.dzm;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.fs31;
import defpackage.gci0;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.iap;
import defpackage.ind0;
import defpackage.j0g;
import defpackage.jap;
import defpackage.jl40;
import defpackage.jmh0;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.lgd0;
import defpackage.mn41;
import defpackage.mum;
import defpackage.mx60;
import defpackage.nap;
import defpackage.obp;
import defpackage.pap;
import defpackage.pbp;
import defpackage.pgz;
import defpackage.pmm0;
import defpackage.pub1;
import defpackage.q7u;
import defpackage.qap;
import defpackage.qbp;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.qtd;
import defpackage.rap;
import defpackage.rbp;
import defpackage.rs31;
import defpackage.s23;
import defpackage.sbp;
import defpackage.sl91;
import defpackage.sls;
import defpackage.sng0;
import defpackage.t23;
import defpackage.tbp;
import defpackage.tg21;
import defpackage.ttz0;
import defpackage.ul60;
import defpackage.vng;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wap;
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
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 I2\u00020\u0001:\u0001JB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u0003R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00106\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010/\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010/\u001a\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010H\u001a\u00020E8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/family/FamilyFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Ltbp;", ClidProvider.STATE, "Lmn41;", "webViewController", "Lzy11;", "setScreenState", "(Ltbp;Lmn41;)V", "Lqbp;", "effect", "showScreenEffect", "(Lqbp;)V", "createWebViewController", "()Lmn41;", "Liap;", "createFamilyContract", "()Liap;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "Lnap;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lnap;", "dependencies", "Lttz0;", "toolbarViewModel$delegate", "getToolbarViewModel", "()Lttz0;", "toolbarViewModel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/family/b;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/family/b;", "viewModel", "Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", "toolbar$delegate", "Lxu5;", "getToolbar", "()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", "toolbar", "progressView$delegate", "getProgressView", "()Landroid/view/View;", "progressView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Landroid/widget/Button;", "skipButton$delegate", "getSkipButton", "()Landroid/widget/Button;", "skipButton", "", "lastFamilyUrl", "Ljava/lang/String;", "Lmn41;", "Lpgz;", "getLogger", "()Lpgz;", "logger", "Companion", "pap", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FamilyFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("toolbar", 0, "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", FamilyFragment.class), b64.x(qoi0.a, FamilyFragment.class, "progressView", "getProgressView()Landroid/view/View;", 0), new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", FamilyFragment.class), new PropertyReference1Impl("skipButton", 0, "getSkipButton()Landroid/widget/Button;", FamilyFragment.class)};
    private static final pap Companion = new pap();

    @Deprecated
    public static final String LOG_TAG = "FamilyFragment";

    @Deprecated
    public static final String SOURCE_FAMILY_INVITE = "TarifficatorFamilyInvite";

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;
    private String lastFamilyUrl;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: skipButton$delegate, reason: from kotlin metadata */
    private final xu5 skipButton;

    /* renamed from: toolbar$delegate, reason: from kotlin metadata */
    private final xu5 toolbar;

    /* renamed from: toolbarViewModel$delegate, reason: from kotlin metadata */
    private final i3y toolbarViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final xu5 webViewContainer;
    private mn41 webViewController;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$6] */
    public FamilyFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_family);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: oap
            public final /* synthetic */ FamilyFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                nap dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                FamilyFragment familyFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = FamilyFragment.dependencies_delegate$lambda$0(familyFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = FamilyFragment.toolbarViewModel_delegate$lambda$1(familyFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = FamilyFragment.viewModel_delegate$lambda$2(familyFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: oap
            public final /* synthetic */ FamilyFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                nap dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                FamilyFragment familyFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = FamilyFragment.dependencies_delegate$lambda$0(familyFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = FamilyFragment.toolbarViewModel_delegate$lambda$1(familyFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = FamilyFragment.viewModel_delegate$lambda$2(familyFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.toolbarViewModel = new es31(qoi0.a(ttz0.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$4
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
        sls slsVar2 = new sls(this) { // from class: oap
            public final /* synthetic */ FamilyFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                nap dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                FamilyFragment familyFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = FamilyFragment.dependencies_delegate$lambda$0(familyFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = FamilyFragment.toolbarViewModel_delegate$lambda$1(familyFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = FamilyFragment.viewModel_delegate$lambda$2(familyFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r5 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$6
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r5.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar2, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.family.FamilyFragment$special$$inlined$viewModels$default$9
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
        this.toolbar = new xu5(new qap(this, i), new rap(this, aah0.checkout_toolbar, i));
        this.progressView = new xu5(new qap(this, i2), new rap(this, aah0.family_progress_view, i2));
        this.webViewContainer = new xu5(new qap(this, i3), new rap(this, aah0.family_webview_container, i3));
        int i4 = 3;
        this.skipButton = new xu5(new qap(this, i4), new rap(this, aah0.family_skip_button, i4));
    }

    private final iap createFamilyContract() {
        jap japVar = (jap) ((kmm0) getDependencies()).a.D0.getValue();
        return new com.yandex.plus.pay.ui.webview.family.ui.a(japVar.b, new a(this), new qtd(2, japVar.c), new WebViewMessagesHandler(new mum(japVar), japVar.e), japVar.d, ((Boolean) japVar.f.invoke()).booleanValue());
    }

    private final mn41 createWebViewController() {
        WebViewContainer webViewContainer = getWebViewContainer();
        au2 c = sl91.c(Collections.singletonList(createFamilyContract()));
        ul60 a = ((kmm0) getDependencies()).a.t.a(SOURCE_FAMILY_INVITE);
        ((wyj) ((kmm0) getDependencies()).a.i).getClass();
        com.yandex.plus.webview.api.a aVar = new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, ((kmm0) getDependencies()).a.g);
        aVar.k = (tg21) ((kmm0) getDependencies()).a.G.getValue();
        aVar.n = new j0g(getProgressView(), getWebViewContainer());
        aVar.l = false;
        getViewModel().getClass();
        aVar.m = 15000L;
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nap dependencies_delegate$lambda$0(FamilyFragment familyFragment) {
        ArrayList b = ho91.b(familyFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof nap) {
                return (nap) dependencies;
            }
        }
        qir.o(nap.class, b);
        return null;
    }

    private final nap getDependencies() {
        return (nap) this.dependencies.getValue();
    }

    private final pgz getLogger() {
        return ((kmm0) getDependencies()).a.g;
    }

    private final View getProgressView() {
        return (View) this.progressView.a($$delegatedProperties[1]);
    }

    private final Button getSkipButton() {
        return (Button) this.skipButton.a($$delegatedProperties[3]);
    }

    private final PlusPayToolbarView getToolbar() {
        return (PlusPayToolbarView) this.toolbar.a($$delegatedProperties[0]);
    }

    private final ttz0 getToolbarViewModel() {
        return (ttz0) this.toolbarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b getViewModel() {
        return (b) this.viewModel.getValue();
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$3(FamilyFragment familyFragment, mx60 mx60Var) {
        familyFragment.getViewModel().W();
        return zy11.a;
    }

    private static final zy11 onViewCreated$lambda$5$lambda$4(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$6(FamilyFragment familyFragment, View view) {
        b viewModel = familyFragment.getViewModel();
        wap wapVar = viewModel.z;
        if (wapVar != null) {
            ind0 a = viewModel.b.a.a();
            obp obpVar = viewModel.x;
            obpVar.b.b(a.a.toString(), wapVar.a, wapVar.c, PayUIEvgenAnalytics$FamilyInviteCloseSource.SkipButton);
        }
        viewModel.W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(tbp state, mn41 webViewController) {
        if (state instanceof sbp) {
            getProgressView().setVisibility(0);
            getWebViewContainer().setVisibility(8);
            getSkipButton().setVisibility(8);
        } else {
            if (!(state instanceof rbp)) {
                w511.b();
                return;
            }
            String str = this.lastFamilyUrl;
            rbp rbpVar = (rbp) state;
            String str2 = rbpVar.a;
            if (!jl40.l(str, str2)) {
                this.lastFamilyUrl = str2;
                webViewController.loadUrl(str2, rbpVar.b);
            }
            getSkipButton().setVisibility(0);
            getSkipButton().setText(rbpVar.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showScreenEffect(qbp effect) {
        if (!(effect instanceof pbp)) {
            w511.b();
            return;
        }
        Context requireContext = requireContext();
        pbp pbpVar = (pbp) effect;
        String str = pbpVar.a;
        String str2 = pbpVar.b;
        String str3 = pbpVar.c;
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            Intent createChooser = Intent.createChooser(intent, null);
            createChooser.addFlags(SelfTester_JCP.IMITA);
            requireContext.startActivity(createChooser);
        } catch (ActivityNotFoundException e) {
            pgz logger = getLogger();
            LogPriority logPriority = LogPriority.ERROR;
            if (logger.e(logPriority)) {
                logger.b(logPriority, LOG_TAG, "There is no intent handler for sharing", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 toolbarViewModel_delegate$lambda$1(FamilyFragment familyFragment) {
        return ((kmm0) familyFragment.getDependencies()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(FamilyFragment familyFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(b.class, new fs31(((kmm0) familyFragment.getDependencies()).b, 4))}, 1);
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
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new dzm(17, this));
        t23 t23Var = new t23();
        a33 a33Var = a33.c;
        t23.a aVar = new t23.a();
        onViewCreated$lambda$5$lambda$4(aVar);
        t23Var.a.put(a33Var, aVar);
        t23Var.a(view);
        getWebViewContainer().getWebView().setBackgroundColor(vng.p(sng0.pay_sdk_primaryBlockColor, view.getContext()));
        PlusPayToolbarView toolbar = getToolbar();
        pmm0 pmm0Var = ((kmm0) getDependencies()).a;
        lgd0 lgd0Var = new lgd0(toolbar, ((kmm0) getDependencies()).a.j, new FamilyFragment$onViewCreated$toolbarViewController$1(0, getViewModel(), b.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0));
        bb1.L(getSkipButton(), new cmi(22, this));
        mn41 createWebViewController = createWebViewController();
        this.webViewController = createWebViewController;
        gci0 gci0Var = getToolbarViewModel().b;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        c.b(g.a(gci0Var, lifecycle, state), com.yandex.plus.home.common.utils.a.c(this), new FamilyFragment$onViewCreated$4(lgd0Var, null));
        c.b(g.a(getViewModel().D, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new FamilyFragment$onViewCreated$5(this, createWebViewController, null));
        c.b(g.a(getViewModel().B, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new FamilyFragment$onViewCreated$6(this, null));
    }
}
