package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.core.mobile.view.toolbar.PlusPayToolbarView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.PayUIEvgenAnalytics$CollectingContactsCloseSource;
import defpackage.a33;
import defpackage.aah0;
import defpackage.au2;
import defpackage.b64;
import defpackage.bb1;
import defpackage.ci8;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.fs31;
import defpackage.gci0;
import defpackage.hi41;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.ind0;
import defpackage.j0g;
import defpackage.jl40;
import defpackage.jmh0;
import defpackage.kgx;
import defpackage.ki41;
import defpackage.kmm0;
import defpackage.lde;
import defpackage.lgd0;
import defpackage.mn41;
import defpackage.mx60;
import defpackage.nce;
import defpackage.oce;
import defpackage.ode;
import defpackage.ovg0;
import defpackage.pde;
import defpackage.pmm0;
import defpackage.pub1;
import defpackage.q7u;
import defpackage.qde;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.rs31;
import defpackage.s23;
import defpackage.sce;
import defpackage.sl91;
import defpackage.sls;
import defpackage.sng0;
import defpackage.t23;
import defpackage.tce;
import defpackage.tg21;
import defpackage.ttz0;
import defpackage.u1w;
import defpackage.uce;
import defpackage.ul60;
import defpackage.vce;
import defpackage.vng;
import defpackage.vqb;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wyj;
import defpackage.xu5;
import defpackage.y23;
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

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u0000 M2\u00020\u0001:\u0001NB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003R\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u001b\u0010=\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00101\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00101\u001a\u0004\bE\u0010FR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/contacts/ContactsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lqde;", ClidProvider.STATE, "Lzy11;", "setScreenState", "(Lqde;)V", "", "startedTimeoutMillis", "loadedTimeoutMillis", "Lmn41;", "createWebViewController", "(JJ)Lmn41;", "Lhi41;", "createPaymentWidgetContract", "(JJ)Lhi41;", "", "imeBottomInsets", "moveWebViewToBeFullyVisible", "(I)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "Loce;", "dependencies$delegate", "Li3y;", "getDependencies", "()Loce;", "dependencies", "Lttz0;", "toolbarViewModel$delegate", "getToolbarViewModel", "()Lttz0;", "toolbarViewModel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/contacts/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/contacts/a;", "viewModel", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root$delegate", "Lxu5;", "getRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", "toolbar$delegate", "getToolbar", "()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", "toolbar", "progressView$delegate", "getProgressView", "()Landroid/view/View;", "progressView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Landroid/widget/Button;", "skipButton$delegate", "getSkipButton", "()Landroid/widget/Button;", "skipButton", "", "lastContactsUrl", "Ljava/lang/String;", "webViewController", "Lmn41;", "Companion", "sce", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ContactsFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("root", 0, "getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;", ContactsFragment.class), b64.x(qoi0.a, ContactsFragment.class, "toolbar", "getToolbar()Lcom/yandex/plus/pay/ui/core/mobile/view/toolbar/PlusPayToolbarView;", 0), new PropertyReference1Impl("progressView", 0, "getProgressView()Landroid/view/View;", ContactsFragment.class), new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", ContactsFragment.class), new PropertyReference1Impl("skipButton", 0, "getSkipButton()Landroid/widget/Button;", ContactsFragment.class)};
    private static final sce Companion = new sce();

    @Deprecated
    public static final String SOURCE_CONTACTS = "TarifficatorContacts";

    @Deprecated
    public static final String WEBVIEW_NAME = "contacts";

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;
    private String lastContactsUrl;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final xu5 root;

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

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$6] */
    public ContactsFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_contacts);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: rce
            public final /* synthetic */ ContactsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                oce dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                ContactsFragment contactsFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = ContactsFragment.dependencies_delegate$lambda$0(contactsFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ContactsFragment.toolbarViewModel_delegate$lambda$1(contactsFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ContactsFragment.viewModel_delegate$lambda$2(contactsFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: rce
            public final /* synthetic */ ContactsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                oce dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                ContactsFragment contactsFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = ContactsFragment.dependencies_delegate$lambda$0(contactsFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ContactsFragment.toolbarViewModel_delegate$lambda$1(contactsFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ContactsFragment.viewModel_delegate$lambda$2(contactsFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.toolbarViewModel = new es31(qoi0.a(ttz0.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$4
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
        sls slsVar2 = new sls(this) { // from class: rce
            public final /* synthetic */ ContactsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                oce dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                ContactsFragment contactsFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = ContactsFragment.dependencies_delegate$lambda$0(contactsFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = ContactsFragment.toolbarViewModel_delegate$lambda$1(contactsFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = ContactsFragment.viewModel_delegate$lambda$2(contactsFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r5 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$6
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r5.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar2, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment$special$$inlined$viewModels$default$9
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
        this.root = new xu5(new vce(this, i), new uce(this, aah0.contacts_root, i2));
        this.toolbar = new xu5(new vce(this, i2), new uce(this, aah0.contacts_toolbar, i3));
        int i4 = 3;
        this.progressView = new xu5(new vce(this, i3), new uce(this, aah0.contacts_progress_view, i4));
        int i5 = aah0.contacts_web_view_container;
        vce vceVar = new vce(this, i4);
        int i6 = 4;
        this.webViewContainer = new xu5(vceVar, new uce(this, i5, i6));
        this.skipButton = new xu5(new vce(this, i6), new uce(this, aah0.contacts_skip_button, i));
    }

    private final hi41 createPaymentWidgetContract(long startedTimeoutMillis, long loadedTimeoutMillis) {
        return ((ki41) ((kmm0) getDependencies()).a.J0.getValue()).a(WEBVIEW_NAME, startedTimeoutMillis, loadedTimeoutMillis, new tce(this, 0));
    }

    private final mn41 createWebViewController(long startedTimeoutMillis, long loadedTimeoutMillis) {
        WebViewContainer webViewContainer = getWebViewContainer();
        au2 c = sl91.c(Collections.singletonList(createPaymentWidgetContract(startedTimeoutMillis, loadedTimeoutMillis)));
        ul60 a = ((kmm0) getDependencies()).a.t.a(SOURCE_CONTACTS);
        ((wyj) ((kmm0) getDependencies()).a.i).getClass();
        com.yandex.plus.webview.api.a aVar = new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, ((kmm0) getDependencies()).a.g);
        aVar.k = (tg21) ((kmm0) getDependencies()).a.G.getValue();
        aVar.m = startedTimeoutMillis + loadedTimeoutMillis;
        aVar.n = new j0g(getProgressView(), getWebViewContainer());
        aVar.l = false;
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oce dependencies_delegate$lambda$0(ContactsFragment contactsFragment) {
        ArrayList b = ho91.b(contactsFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof oce) {
                return (oce) dependencies;
            }
        }
        qir.o(oce.class, b);
        return null;
    }

    private final oce getDependencies() {
        return (oce) this.dependencies.getValue();
    }

    private final View getProgressView() {
        return (View) this.progressView.a($$delegatedProperties[2]);
    }

    private final ConstraintLayout getRoot() {
        return (ConstraintLayout) this.root.a($$delegatedProperties[0]);
    }

    private final Button getSkipButton() {
        return (Button) this.skipButton.a($$delegatedProperties[4]);
    }

    private final PlusPayToolbarView getToolbar() {
        return (PlusPayToolbarView) this.toolbar.a($$delegatedProperties[1]);
    }

    private final ttz0 getToolbarViewModel() {
        return (ttz0) this.toolbarViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[3]);
    }

    private final void moveWebViewToBeFullyVisible(int imeBottomInsets) {
        e eVar = new e();
        eVar.g(getRoot());
        if (imeBottomInsets > 0) {
            eVar.j(getWebViewContainer().getId(), 4, 0, 4, imeBottomInsets);
            WebView webView = getWebViewContainer().getWebView();
            webView.scrollTo(webView.getScrollX(), webView.getContentHeight());
        } else {
            eVar.j(getWebViewContainer().getId(), 4, getSkipButton().getId(), 3, bb1.q(ovg0.pay_sdk_margin_large, getWebViewContainer()));
        }
        eVar.b(getRoot());
    }

    private static final zy11 onViewCreated$lambda$4$lambda$3(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$7$lambda$5(ContactsFragment contactsFragment, u1w u1wVar) {
        contactsFragment.moveWebViewToBeFullyVisible(u1wVar.d);
    }

    private static final zy11 onViewCreated$lambda$7$lambda$6(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.b.add(8);
        aVar.a = true;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$8(ContactsFragment contactsFragment, mx60 mx60Var) {
        contactsFragment.getViewModel().W();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$9(ContactsFragment contactsFragment, View view) {
        a viewModel = contactsFragment.getViewModel();
        nce nceVar = viewModel.y;
        if (nceVar != null) {
            ind0 a = viewModel.b.a.a();
            lde ldeVar = viewModel.x;
            ldeVar.a.a(a.a.toString(), nceVar.a, nceVar.b, PayUIEvgenAnalytics$CollectingContactsCloseSource.SkipButton);
        }
        viewModel.W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(qde state) {
        if (state instanceof pde) {
            getProgressView().setVisibility(0);
            getWebViewContainer().setVisibility(8);
            getSkipButton().setVisibility(8);
        } else {
            if (!(state instanceof ode)) {
                w511.b();
                return;
            }
            getSkipButton().setVisibility(0);
            String str = this.lastContactsUrl;
            ode odeVar = (ode) state;
            String str2 = odeVar.a;
            if (!jl40.l(str, str2)) {
                this.lastContactsUrl = str2;
                mn41 createWebViewController = createWebViewController(10000L, 10000L);
                this.webViewController = createWebViewController;
                createWebViewController.loadUrl(str2, null);
            }
            getSkipButton().setText(odeVar.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 toolbarViewModel_delegate$lambda$1(ContactsFragment contactsFragment) {
        return ((kmm0) contactsFragment.getDependencies()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(ContactsFragment contactsFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(a.class, new fs31(((kmm0) contactsFragment.getDependencies()).b, 3))}, 1);
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
        onViewCreated$lambda$4$lambda$3(aVar);
        t23Var.a.put(a33Var, aVar);
        t23Var.a(view);
        WebViewContainer webViewContainer = getWebViewContainer();
        t23 t23Var2 = new t23();
        y23 y23Var = new y23() { // from class: qce
            @Override // defpackage.y23
            public final void b(u1w u1wVar) {
                ContactsFragment.onViewCreated$lambda$7$lambda$5(ContactsFragment.this, u1wVar);
            }
        };
        t23.a aVar2 = new t23.a();
        onViewCreated$lambda$7$lambda$6(aVar2);
        t23Var2.a.put(y23Var, aVar2);
        t23Var2.a(webViewContainer);
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new vqb(23, this));
        PlusPayToolbarView toolbar = getToolbar();
        pmm0 pmm0Var = ((kmm0) getDependencies()).a;
        lgd0 lgd0Var = new lgd0(toolbar, ((kmm0) getDependencies()).a.j, new ContactsFragment$onViewCreated$toolbarController$1(0, getViewModel(), a.class, "onCloseButtonClicked", "onCloseButtonClicked()V", 0));
        getWebViewContainer().getWebView().setBackgroundColor(vng.p(sng0.pay_sdk_primaryBlockColor, view.getContext()));
        bb1.L(getSkipButton(), new ci8(12, this));
        gci0 gci0Var = getToolbarViewModel().b;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        c.b(g.a(gci0Var, lifecycle, state), com.yandex.plus.home.common.utils.a.c(this), new ContactsFragment$onViewCreated$5(lgd0Var, null));
        c.b(g.a(getViewModel().A, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new ContactsFragment$onViewCreated$6(this, null));
    }
}
