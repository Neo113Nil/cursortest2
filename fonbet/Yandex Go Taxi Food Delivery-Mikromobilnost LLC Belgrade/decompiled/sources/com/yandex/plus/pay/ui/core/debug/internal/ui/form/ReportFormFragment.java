package com.yandex.plus.pay.ui.core.debug.internal.ui.form;

import android.os.Bundle;
import android.view.View;
import android.webkit.ValueCallback;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.au2;
import defpackage.b64;
import defpackage.bad0;
import defpackage.bb1;
import defpackage.cs31;
import defpackage.cwu0;
import defpackage.d2d0;
import defpackage.d5b0;
import defpackage.e2d0;
import defpackage.e2j0;
import defpackage.ebd0;
import defpackage.eja1;
import defpackage.es31;
import defpackage.etb;
import defpackage.f2j0;
import defpackage.g1d;
import defpackage.gmh0;
import defpackage.h2j0;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i2j0;
import defpackage.i3y;
import defpackage.j0g;
import defpackage.j2j0;
import defpackage.jl40;
import defpackage.jmm0;
import defpackage.kgx;
import defpackage.kmm0;
import defpackage.lqi0;
import defpackage.mdd0;
import defpackage.mn41;
import defpackage.n2j0;
import defpackage.o2j0;
import defpackage.odf0;
import defpackage.p2j0;
import defpackage.q2j0;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.qq31;
import defpackage.rs31;
import defpackage.sl91;
import defpackage.sls;
import defpackage.tje;
import defpackage.tls;
import defpackage.ul60;
import defpackage.vs41;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wyj;
import defpackage.x9h0;
import defpackage.xkz;
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

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0003R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010$\u001a\u0004\b/\u00100R\u0018\u00103\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0019\u001a\u0004\b7\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/yandex/plus/pay/ui/core/debug/internal/ui/form/ReportFormFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lq2j0;", "screenState", "Lzy11;", "setScreenState", "(Lq2j0;)V", "setLoadingState", "Ln2j0;", "formInfo", "setFormState", "(Ln2j0;)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroy", "Lf2j0;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lf2j0;", "dependencies", "Lcom/yandex/plus/pay/ui/core/debug/internal/ui/form/a;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/core/debug/internal/ui/form/a;", "viewModel", "Landroid/widget/ImageButton;", "backButton$delegate", "Lxu5;", "getBackButton", "()Landroid/widget/ImageButton;", "backButton", "Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView$delegate", "getProgressView", "()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", "progressView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Lmn41;", "webViewController", "Lmn41;", "Le2j0;", "reportFormContract$delegate", "getReportFormContract", "()Le2j0;", "reportFormContract", "", "lastUrl", "Ljava/lang/String;", "Companion", "h2j0", "pay-sdk-ui-core-debug-menu_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReportFormFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("backButton", 0, "getBackButton()Landroid/widget/ImageButton;", ReportFormFragment.class), b64.x(qoi0.a, ReportFormFragment.class, "progressView", "getProgressView()Lcom/yandex/plus/pay/ui/common/api/ui/view/ProgressView;", 0), new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", ReportFormFragment.class)};
    private static final h2j0 Companion = new h2j0();

    @Deprecated
    public static final String SOURCE_REPORT_FORM = "ReportForm";

    /* renamed from: backButton$delegate, reason: from kotlin metadata */
    private final xu5 backButton;

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;
    private String lastUrl;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: reportFormContract$delegate, reason: from kotlin metadata */
    private final i3y reportFormContract;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final xu5 webViewContainer;
    private mn41 webViewController;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment$special$$inlined$viewModels$default$1] */
    public ReportFormFragment() {
        super(gmh0.pay_sdk_fragment_debug_report);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: g2j0
            public final /* synthetic */ ReportFormFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                f2j0 dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i2 = i;
                ReportFormFragment reportFormFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = ReportFormFragment.dependencies_delegate$lambda$0(reportFormFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = ReportFormFragment.viewModel_delegate$lambda$1(reportFormFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: g2j0
            public final /* synthetic */ ReportFormFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                f2j0 dependencies_delegate$lambda$0;
                hs31 viewModel_delegate$lambda$1;
                int i22 = i2;
                ReportFormFragment reportFormFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = ReportFormFragment.dependencies_delegate$lambda$0(reportFormFragment);
                        return dependencies_delegate$lambda$0;
                    default:
                        viewModel_delegate$lambda$1 = ReportFormFragment.viewModel_delegate$lambda$1(reportFormFragment);
                        return viewModel_delegate$lambda$1;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(a.class), new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment$special$$inlined$viewModels$default$4
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
        this.backButton = new xu5(new i2j0(this, i), new j2j0(this, x9h0.report_back_button, i));
        this.progressView = new xu5(new i2j0(this, i2), new j2j0(this, x9h0.report_progress_view, i2));
        int i3 = 2;
        this.webViewContainer = new xu5(new i2j0(this, i3), new j2j0(this, x9h0.report_webview, i3));
        this.reportFormContract = kotlin.a.a(new lqi0(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f2j0 dependencies_delegate$lambda$0(ReportFormFragment reportFormFragment) {
        ArrayList b = ho91.b(reportFormFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof f2j0) {
                return (f2j0) dependencies;
            }
        }
        qir.o(f2j0.class, b);
        return null;
    }

    private final ImageButton getBackButton() {
        return (ImageButton) this.backButton.a($$delegatedProperties[0]);
    }

    private final f2j0 getDependencies() {
        return (f2j0) this.dependencies.getValue();
    }

    private final ProgressView getProgressView() {
        return (ProgressView) this.progressView.a($$delegatedProperties[1]);
    }

    private final e2j0 getReportFormContract() {
        return (e2j0) this.reportFormContract.getValue();
    }

    private final a getViewModel() {
        return (a) this.viewModel.getValue();
    }

    private final WebViewContainer getWebViewContainer() {
        return (WebViewContainer) this.webViewContainer.a($$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(ReportFormFragment reportFormFragment, View view) {
        reportFormFragment.getViewModel().c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onViewCreated$lambda$4(ReportFormFragment reportFormFragment, ValueCallback valueCallback) {
        tje.N(eja1.s(reportFormFragment), null, null, new ReportFormFragment$onViewCreated$2$1(valueCallback, null), 3);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e2j0 reportFormContract_delegate$lambda$2() {
        return new e2j0();
    }

    private final void setFormState(n2j0 formInfo) {
        getReportFormContract().b = formInfo.b;
        String str = this.lastUrl;
        String str2 = formInfo.a;
        if (jl40.l(str, str2)) {
            return;
        }
        mn41 mn41Var = this.webViewController;
        if (mn41Var != null) {
            mn41Var.loadUrl(str2, null);
        }
        this.lastUrl = str2;
    }

    private final void setLoadingState() {
        getProgressView().setVisibility(0);
        getWebViewContainer().setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(q2j0 screenState) {
        if (screenState instanceof p2j0) {
            setLoadingState();
        } else if (screenState instanceof o2j0) {
            setFormState(((o2j0) screenState).a);
        } else {
            w511.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$1(ReportFormFragment reportFormFragment) {
        final g1d g1dVar = (g1d) reportFormFragment.getDependencies();
        g1dVar.getClass();
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(a.class, new tls() { // from class: com.yandex.plus.pay.ui.core.debug.internal.common.di.a
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                g1d g1dVar2 = g1d.this;
                jmm0 jmm0Var = g1dVar2.a;
                ebd0 a = ((kmm0) jmm0Var).a();
                mdd0 mdd0Var = g1dVar2.b;
                xkz xkzVar = (xkz) g1dVar2.g.getValue();
                bad0 bad0Var = g1dVar2.c;
                ComponentImpl$getReportViewModelFactory$1$1 componentImpl$getReportViewModelFactory$1$1 = new ComponentImpl$getReportViewModelFactory$1$1(0, jmm0Var, jmm0.class, "getTheme", "getTheme()Lcom/yandex/plus/ui/core/theme/PlusTheme;", 0);
                ((wyj) g1dVar2.d).getClass();
                return new com.yandex.plus.pay.ui.core.debug.internal.ui.form.a(new com.yandex.plus.pay.ui.core.debug.internal.domain.form.a(a, mdd0Var, xkzVar, bad0Var, componentImpl$getReportViewModelFactory$1$1, wyj.f), (etb) g1dVar2.f.getValue());
            }
        })}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.webViewController = null;
        super.onDestroy();
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
        bb1.L(getBackButton(), new d5b0(28, this));
        WebViewContainer webViewContainer = getWebViewContainer();
        au2 c = sl91.c(Collections.singletonList(getReportFormContract()));
        ul60 a = ((kmm0) ((g1d) getDependencies()).a).a.t.a(SOURCE_REPORT_FORM);
        ((wyj) ((g1d) getDependencies()).d).getClass();
        com.yandex.plus.webview.api.a aVar = new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, cwu0.a);
        aVar.i = new qq31(10, new odf0(14, this));
        aVar.l = false;
        aVar.o = vs41.a;
        aVar.n = new j0g(getProgressView(), getWebViewContainer());
        this.webViewController = aVar.a();
        getWebViewContainer().getWebView().getSettings().setDomStorageEnabled(false);
        c.b(g.a(getViewModel().w, getViewLifecycleOwner().getLifecycle(), Lifecycle.State.STARTED), com.yandex.plus.home.common.utils.a.c(this), new ReportFormFragment$onViewCreated$3(this, null));
    }
}
