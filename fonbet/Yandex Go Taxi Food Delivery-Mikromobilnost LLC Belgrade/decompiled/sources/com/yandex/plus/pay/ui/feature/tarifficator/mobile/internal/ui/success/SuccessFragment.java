package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g;
import com.yandex.plus.home.common.utils.c;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.success.p003native.SuccessNativeContentView;
import com.yandex.plus.pay.ui.core.mobile.haptic.HapticType;
import com.yandex.plus.pay.ui.core.mobile.view.confetti.PlusPayConfettiView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.aah0;
import defpackage.ang0;
import defpackage.au2;
import defpackage.b5d0;
import defpackage.b64;
import defpackage.bb1;
import defpackage.cs31;
import defpackage.d2d0;
import defpackage.d6w;
import defpackage.e2d0;
import defpackage.es31;
import defpackage.gbd0;
import defpackage.gci0;
import defpackage.hi41;
import defpackage.ho91;
import defpackage.hs31;
import defpackage.i3y;
import defpackage.j0g;
import defpackage.j3v0;
import defpackage.j73;
import defpackage.jcs0;
import defpackage.jl40;
import defpackage.jmh0;
import defpackage.kgx;
import defpackage.ki41;
import defpackage.kmm0;
import defpackage.m3v0;
import defpackage.mn41;
import defpackage.mx60;
import defpackage.o3v0;
import defpackage.ovg0;
import defpackage.p3v0;
import defpackage.p8f0;
import defpackage.p9t0;
import defpackage.ph91;
import defpackage.pub1;
import defpackage.q3v0;
import defpackage.q7u;
import defpackage.qir;
import defpackage.qoi0;
import defpackage.r3v0;
import defpackage.rs31;
import defpackage.s23;
import defpackage.s3v0;
import defpackage.sl91;
import defpackage.sls;
import defpackage.t23;
import defpackage.tg21;
import defpackage.ttz0;
import defpackage.u1w;
import defpackage.ud30;
import defpackage.ul60;
import defpackage.v3a1;
import defpackage.v3v0;
import defpackage.vng;
import defpackage.w3v0;
import defpackage.w511;
import defpackage.w8f;
import defpackage.wv5;
import defpackage.wyj;
import defpackage.x3v0;
import defpackage.xu5;
import defpackage.y3v0;
import defpackage.y8f;
import defpackage.ywv;
import defpackage.zad0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u0000 P2\u00020\u0001:\u0001QB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010\"\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010\u0003J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\u0003J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u0003R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u00105R\u0018\u00107\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001b\u0010?\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010B\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010<\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010<\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/success/SuccessFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Ly3v0;", ClidProvider.STATE, "Ls3v0;", "nativeContentViewController", "Lzy11;", "setScreenState", "(Ly3v0;Ls3v0;)V", "setLoading", "(Ls3v0;)V", "Lx3v0;", "setWebContent", "(Ls3v0;Lx3v0;)V", "Lw3v0;", "setNativeContent", "(Ls3v0;Lw3v0;)V", "", "startedTimeoutMillis", "loadedTimeoutMillis", "Lmn41;", "createWebViewController", "(JJ)Lmn41;", "Lhi41;", "createPaymentWidgetContract", "(JJ)Lhi41;", "Landroid/view/View;", "view", "applyInsets", "(Landroid/view/View;Ls3v0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "Lj3v0;", "dependencies$delegate", "Li3y;", "getDependencies", "()Lj3v0;", "dependencies", "Lttz0;", "toolbarViewModel$delegate", "getToolbarViewModel", "()Lttz0;", "toolbarViewModel", "Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/success/b;", "viewModel$delegate", "getViewModel", "()Lcom/yandex/plus/pay/ui/feature/tarifficator/mobile/internal/ui/success/b;", "viewModel", "successContentViewController", "Ls3v0;", "webViewController", "Lmn41;", "root$delegate", "Lxu5;", "getRoot", "()Landroid/view/View;", "root", "progressView$delegate", "getProgressView", "progressView", "Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer$delegate", "getWebViewContainer", "()Lcom/yandex/plus/webview/api/WebViewContainer;", "webViewContainer", "Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/success/native/SuccessNativeContentView;", "successContentView$delegate", "getSuccessContentView", "()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/success/native/SuccessNativeContentView;", "successContentView", "", "lastSuccessUrl", "Ljava/lang/String;", "Companion", "o3v0", "pay-sdk-ui-feature-tarifficator-mobile_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SuccessFragment extends Fragment {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new PropertyReference1Impl("root", 0, "getRoot()Landroid/view/View;", SuccessFragment.class), b64.x(qoi0.a, SuccessFragment.class, "progressView", "getProgressView()Landroid/view/View;", 0), new PropertyReference1Impl("webViewContainer", 0, "getWebViewContainer()Lcom/yandex/plus/webview/api/WebViewContainer;", SuccessFragment.class), new PropertyReference1Impl("successContentView", 0, "getSuccessContentView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/success/native/SuccessNativeContentView;", SuccessFragment.class)};
    private static final o3v0 Companion = new o3v0();

    @Deprecated
    public static final String SOURCE_SUCCESS = "TarifficatorSuccess";

    @Deprecated
    public static final String WEBVIEW_NAME = "success";

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;
    private String lastSuccessUrl;

    /* renamed from: progressView$delegate, reason: from kotlin metadata */
    private final xu5 progressView;

    /* renamed from: root$delegate, reason: from kotlin metadata */
    private final xu5 root;

    /* renamed from: successContentView$delegate, reason: from kotlin metadata */
    private final xu5 successContentView;
    private s3v0 successContentViewController;

    /* renamed from: toolbarViewModel$delegate, reason: from kotlin metadata */
    private final i3y toolbarViewModel;

    /* renamed from: viewModel$delegate, reason: from kotlin metadata */
    private final i3y viewModel;

    /* renamed from: webViewContainer$delegate, reason: from kotlin metadata */
    private final xu5 webViewContainer;
    private mn41 webViewController;

    /* JADX WARN: Type inference failed for: r3v0, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$1] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$6] */
    public SuccessFragment() {
        super(jmh0.pay_sdk_fragment_tarifficator_success);
        final int i = 0;
        this.dependencies = kotlin.a.a(new sls(this) { // from class: n3v0
            public final /* synthetic */ SuccessFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                j3v0 dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i2 = i;
                SuccessFragment successFragment = this.b;
                switch (i2) {
                    case 0:
                        dependencies_delegate$lambda$0 = SuccessFragment.dependencies_delegate$lambda$0(successFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = SuccessFragment.toolbarViewModel_delegate$lambda$1(successFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = SuccessFragment.viewModel_delegate$lambda$2(successFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        });
        final int i2 = 1;
        sls slsVar = new sls(this) { // from class: n3v0
            public final /* synthetic */ SuccessFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                j3v0 dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i2;
                SuccessFragment successFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = SuccessFragment.dependencies_delegate$lambda$0(successFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = SuccessFragment.toolbarViewModel_delegate$lambda$1(successFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = SuccessFragment.viewModel_delegate$lambda$2(successFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r3 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$1
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
        final i3y b = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r3.invoke();
            }
        });
        this.toolbarViewModel = new es31(qoi0.a(ttz0.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$4
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
        sls slsVar2 = new sls(this) { // from class: n3v0
            public final /* synthetic */ SuccessFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                j3v0 dependencies_delegate$lambda$0;
                hs31 hs31Var;
                hs31 viewModel_delegate$lambda$2;
                int i22 = i3;
                SuccessFragment successFragment = this.b;
                switch (i22) {
                    case 0:
                        dependencies_delegate$lambda$0 = SuccessFragment.dependencies_delegate$lambda$0(successFragment);
                        return dependencies_delegate$lambda$0;
                    case 1:
                        hs31Var = SuccessFragment.toolbarViewModel_delegate$lambda$1(successFragment);
                        return hs31Var;
                    default:
                        viewModel_delegate$lambda$2 = SuccessFragment.viewModel_delegate$lambda$2(successFragment);
                        return viewModel_delegate$lambda$2;
                }
            }
        };
        final ?? r5 = new sls(this) { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$6
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
        final i3y b2 = kotlin.a.b(lazyThreadSafetyMode, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return (rs31) r5.invoke();
            }
        });
        this.viewModel = new es31(qoi0.a(b.class), new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return ((rs31) i3y.this.getValue()).getViewModelStore();
            }
        }, slsVar2, new sls() { // from class: com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$special$$inlined$viewModels$default$9
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
        this.root = new xu5(new p3v0(this, i), new q3v0(this, aah0.success_root, i));
        this.progressView = new xu5(new p3v0(this, i2), new q3v0(this, aah0.success_progress_view, i2));
        this.webViewContainer = new xu5(new p3v0(this, i3), new q3v0(this, aah0.success_webview_container, i3));
        int i4 = 3;
        this.successContentView = new xu5(new p3v0(this, i4), new q3v0(this, aah0.success_native_content_view, i4));
    }

    private final void applyInsets(View view, s3v0 nativeContentViewController) {
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
        jcs0 jcs0Var = new jcs0(this, i, i2, i3, i4, nativeContentViewController, 1);
        t23.a aVar = new t23.a();
        applyInsets$lambda$6$lambda$5(aVar);
        t23Var.a.put(jcs0Var, aVar);
        t23Var.a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void applyInsets$lambda$6$lambda$4(SuccessFragment successFragment, int i, int i2, int i3, int i4, s3v0 s3v0Var, u1w u1wVar) {
        WebViewContainer webViewContainer = successFragment.getWebViewContainer();
        int i5 = u1wVar.a;
        int i6 = u1wVar.b;
        int i7 = u1wVar.c;
        int i8 = u1wVar.d;
        bb1.R(i + i5, i2 + i6, i3 + i7, i4 + i8, webViewContainer);
        s3v0Var.a().setPadding(s3v0Var.j + i5, s3v0Var.k + i6, s3v0Var.l + i7, s3v0Var.m + i8);
    }

    private static final zy11 applyInsets$lambda$6$lambda$5(s23 s23Var) {
        t23.a aVar = (t23.a) s23Var;
        aVar.c();
        aVar.b();
        return zy11.a;
    }

    private final hi41 createPaymentWidgetContract(long startedTimeoutMillis, long loadedTimeoutMillis) {
        return ((ki41) ((kmm0) getDependencies()).a.J0.getValue()).a("success", startedTimeoutMillis, loadedTimeoutMillis, new a(this));
    }

    private final mn41 createWebViewController(long startedTimeoutMillis, long loadedTimeoutMillis) {
        WebViewContainer webViewContainer = getWebViewContainer();
        au2 c = sl91.c(Collections.singletonList(createPaymentWidgetContract(startedTimeoutMillis, loadedTimeoutMillis)));
        ul60 a = ((kmm0) getDependencies()).a.t.a(SOURCE_SUCCESS);
        ((wyj) ((kmm0) getDependencies()).a.i).getClass();
        com.yandex.plus.webview.api.a aVar = new com.yandex.plus.webview.api.a(webViewContainer, c, a, false, wyj.c, ((kmm0) getDependencies()).a.g);
        aVar.k = (tg21) ((kmm0) getDependencies()).a.G.getValue();
        aVar.m = startedTimeoutMillis + loadedTimeoutMillis;
        aVar.n = new j0g(getProgressView(), getWebViewContainer());
        aVar.l = false;
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3v0 dependencies_delegate$lambda$0(SuccessFragment successFragment) {
        ArrayList b = ho91.b(successFragment);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d2d0 dependencies = ((e2d0) it.next()).getDependencies();
            if (dependencies instanceof j3v0) {
                return (j3v0) dependencies;
            }
        }
        qir.o(j3v0.class, b);
        return null;
    }

    private final j3v0 getDependencies() {
        return (j3v0) this.dependencies.getValue();
    }

    private final View getProgressView() {
        return (View) this.progressView.a($$delegatedProperties[1]);
    }

    private final View getRoot() {
        return (View) this.root.a($$delegatedProperties[0]);
    }

    private final SuccessNativeContentView getSuccessContentView() {
        return (SuccessNativeContentView) this.successContentView.a($$delegatedProperties[3]);
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
    public static final zy11 onViewCreated$lambda$3(SuccessFragment successFragment, mx60 mx60Var) {
        ((m3v0) successFragment.getViewModel().c).b(SuccessFlowScreen.SUCCESS);
        return zy11.a;
    }

    private final void setLoading(s3v0 nativeContentViewController) {
        getProgressView().setVisibility(0);
        getWebViewContainer().setVisibility(8);
        nativeContentViewController.h.a();
        nativeContentViewController.a.setVisibility(8);
    }

    private final void setNativeContent(s3v0 nativeContentViewController, w3v0 state) {
        getProgressView().setVisibility(8);
        getWebViewContainer().setVisibility(8);
        mn41 mn41Var = this.webViewController;
        if (mn41Var != null) {
            mn41Var.stopLoading();
        }
        r3v0 r3v0Var = state.a;
        p8f0 p8f0Var = nativeContentViewController.i;
        ArrayList arrayList = r3v0Var.a;
        ArrayList arrayList2 = p8f0Var.w;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        p8f0Var.notifyDataSetChanged();
        wv5 wv5Var = nativeContentViewController.c;
        kgx[] kgxVarArr = s3v0.n;
        ((TextView) wv5Var.a(kgxVarArr[3])).setText(r3v0Var.b);
        v3a1.c((TextView) nativeContentViewController.d.a(kgxVarArr[4]), r3v0Var.c);
        ((Button) nativeContentViewController.e.a(kgxVarArr[5])).setText(r3v0Var.d);
        nativeContentViewController.a.setVisibility(0);
        PlusPayConfettiView.a aVar = nativeContentViewController.h;
        Context context = ((PlusPayConfettiView) nativeContentViewController.f.a(kgxVarArr[6])).getContext();
        d6w d6wVar = com.yandex.plus.pay.ui.core.mobile.view.confetti.a.a;
        zad0 zad0Var = new zad0(j73.b0(context.getResources().getIntArray(ang0.pay_sdk_confetti_colors)), com.yandex.plus.pay.ui.core.mobile.view.confetti.a.a, com.yandex.plus.pay.ui.core.mobile.view.confetti.a.b, vng.s(ovg0.pay_sdk_confetti_size, context));
        PlusPayConfettiView plusPayConfettiView = aVar.a;
        if (plusPayConfettiView != null) {
            aVar.a();
            plusPayConfettiView.post(new ud30(16, aVar, plusPayConfettiView, zad0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setScreenState(y3v0 state, s3v0 nativeContentViewController) {
        if (state instanceof v3v0) {
            setLoading(nativeContentViewController);
            return;
        }
        if (state instanceof x3v0) {
            setWebContent(nativeContentViewController, (x3v0) state);
        } else if (state instanceof w3v0) {
            setNativeContent(nativeContentViewController, (w3v0) state);
        } else {
            w511.b();
        }
    }

    private final void setWebContent(s3v0 nativeContentViewController, x3v0 state) {
        nativeContentViewController.h.a();
        nativeContentViewController.a.setVisibility(8);
        getProgressView().setVisibility(8);
        String str = this.lastSuccessUrl;
        String str2 = state.a;
        if (jl40.l(str, str2)) {
            getWebViewContainer().setVisibility(0);
            getProgressView().setVisibility(8);
            return;
        }
        getWebViewContainer().setVisibility(8);
        getProgressView().setVisibility(0);
        this.lastSuccessUrl = str2;
        mn41 createWebViewController = createWebViewController(state.b, state.c);
        this.webViewController = createWebViewController;
        createWebViewController.loadUrl(str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 toolbarViewModel_delegate$lambda$1(SuccessFragment successFragment) {
        return ((kmm0) successFragment.getDependencies()).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs31 viewModel_delegate$lambda$2(SuccessFragment successFragment) {
        cs31[] cs31VarArr = (cs31[]) Arrays.copyOf(new cs31[]{new cs31(b.class, new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.di.b(((kmm0) successFragment.getDependencies()).b, 1))}, 1);
        return new ywv((cs31[]) Arrays.copyOf(cs31VarArr, cs31VarArr.length));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        s3v0 s3v0Var = this.successContentViewController;
        if (s3v0Var != null) {
            PlusPayConfettiView.a aVar = s3v0Var.h;
            aVar.a();
            aVar.a = null;
        }
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
        pub1.c(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), new p9t0(17, this));
        SuccessNativeContentView successContentView = getSuccessContentView();
        gbd0 gbd0Var = ((kmm0) getDependencies()).a.q;
        b5d0 b5d0Var = ((kmm0) getDependencies()).a.j;
        Drawable background = getRoot().getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        s3v0 s3v0Var = new s3v0(successContentView, gbd0Var, b5d0Var, colorDrawable != null ? Integer.valueOf(colorDrawable.getColor()) : null, new SuccessFragment$onViewCreated$successContentViewController$1(0, getViewModel(), b.class, "onFinishButtonClick", "onFinishButtonClick()V", 0), new SuccessFragment$onViewCreated$successContentViewController$2(0, getViewModel(), b.class, "onFinishButtonClick", "onFinishButtonClick()V", 0));
        this.successContentViewController = s3v0Var;
        s3v0Var.h.a = (PlusPayConfettiView) s3v0Var.f.a(s3v0.n[6]);
        applyInsets(view, s3v0Var);
        gci0 gci0Var = getToolbarViewModel().b;
        Lifecycle lifecycle = getViewLifecycleOwner().getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        c.b(g.a(gci0Var, lifecycle, state), com.yandex.plus.home.common.utils.a.c(this), new SuccessFragment$onViewCreated$2(s3v0Var, null));
        c.b(g.a(getViewModel().D, getViewLifecycleOwner().getLifecycle(), state), com.yandex.plus.home.common.utils.a.c(this), new SuccessFragment$onViewCreated$3(this, s3v0Var, null));
        if (savedInstanceState == null) {
            ph91.c(view, HapticType.SUCCESS);
        }
    }
}
