package com.yandex.payment.sdk.ui.common;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.adjust.sdk.Constants;
import com.yandex.payment.sdk.ui.view.Card3DSWebView;
import com.yandex.xplat.payment.sdk.PsdkScreen;
import com.yandex.xplat.payment.sdk.WebViewTagForAnalytics;
import defpackage.aj31;
import defpackage.aq41;
import defpackage.b88;
import defpackage.bqr0;
import defpackage.cma1;
import defpackage.dpb1;
import defpackage.ec31;
import defpackage.eg01;
import defpackage.eq41;
import defpackage.es31;
import defpackage.i3y;
import defpackage.j73;
import defpackage.j9h0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.p7u;
import defpackage.pwf;
import defpackage.qoi0;
import defpackage.qq31;
import defpackage.qv90;
import defpackage.rlh0;
import defpackage.rwo;
import defpackage.sls;
import defpackage.sv90;
import defpackage.wj00;
import defpackage.wpa0;
import defpackage.wy4;
import defpackage.y22;
import defpackage.y891;
import defpackage.y8f;
import defpackage.y8h;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0010\u0018\u0000 <2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u0003J-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u0010\u0005\u001a\u00020\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0006R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010'\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/yandex/payment/sdk/ui/common/WebViewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lb88;", "delegate", "(Lb88;)V", "", Constants.DEEPLINK, "Lzy11;", "handleDeeplink", "(Ljava/lang/String;)V", "onDestroy", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/yandex/payment/sdk/ui/view/Card3DSWebView;", "it", "onPrepareWebView", "(Lcom/yandex/payment/sdk/ui/view/Card3DSWebView;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "loggingTag", "Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "getLoggingTag", "()Lcom/yandex/xplat/payment/sdk/WebViewTagForAnalytics;", "Lwpa0;", "currentBinding", "Lwpa0;", "Lbqr0;", "activityViewModel$delegate", "Li3y;", "getActivityViewModel", "()Lbqr0;", "activityViewModel", "", "isRestoring", "Z", "card3DSView", "Lcom/yandex/payment/sdk/ui/view/Card3DSWebView;", "Lb88;", "getDelegate", "()Lb88;", "setDelegate", "Lrwo;", "eventReporter$delegate", "getEventReporter", "()Lrwo;", "eventReporter", "getBinding", "()Lwpa0;", "binding", "Companion", "eq41", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class WebViewFragment extends Fragment {
    public static final eq41 Companion = new eq41();
    private static final String EXTRA_HANDLE_DEEPLINK = "handle_deeplink";
    private static final String EXTRA_SHOW_NAVIGATION_BAR = "show_navigation_bar";
    private static final String EXTRA_URL = "url";
    private static final String IS_DEBUG = "is_debug";
    private static final String TRUSTED_URLS = "trusted_urls";

    /* renamed from: activityViewModel$delegate, reason: from kotlin metadata */
    private final i3y activityViewModel;
    private volatile Card3DSWebView card3DSView;
    private wpa0 currentBinding;
    private b88 delegate;

    /* renamed from: eventReporter$delegate, reason: from kotlin metadata */
    private final i3y eventReporter;
    private boolean isRestoring;
    private final WebViewTagForAnalytics loggingTag;

    public WebViewFragment() {
        this.loggingTag = WebViewTagForAnalytics.FORM_3DS;
        this.activityViewModel = new es31(qoi0.a(bqr0.class), new sls(this) { // from class: com.yandex.payment.sdk.ui.common.WebViewFragment$special$$inlined$activityViewModels$default$1
            final /* synthetic */ Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_activityViewModels.requireActivity().getViewModelStore();
            }
        }, new sls(this) { // from class: com.yandex.payment.sdk.ui.common.WebViewFragment$special$$inlined$activityViewModels$default$3
            final /* synthetic */ Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
            }
        }, new sls(this) { // from class: com.yandex.payment.sdk.ui.common.WebViewFragment$special$$inlined$activityViewModels$default$2
            final /* synthetic */ sls $extrasProducer = null;
            final /* synthetic */ Fragment $this_activityViewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_activityViewModels = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                y8f y8fVar;
                sls slsVar = this.$extrasProducer;
                return (slsVar == null || (y8fVar = (y8f) slsVar.invoke()) == null) ? this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras() : y8fVar;
            }
        });
        this.delegate = new aj31(10, this);
        this.eventReporter = kotlin.a.a(new ec31(16, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rwo eventReporter_delegate$lambda$0(WebViewFragment webViewFragment) {
        return ((pwf) ((wy4) ((y8h) ((p7u) dpb1.c(webViewFragment)).componentDispatcher()).b(wy4.class))).c();
    }

    private final bqr0 getActivityViewModel() {
        return (bqr0) this.activityViewModel.getValue();
    }

    private final wpa0 getBinding() {
        wpa0 wpa0Var = this.currentBinding;
        if (wpa0Var != null) {
            return wpa0Var;
        }
        ny61.r("Binding is not initialized");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rwo getEventReporter() {
        return (rwo) this.eventReporter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDeeplink(String deeplink) {
        if (jl40.l(deeplink, "yandexbank://deeplink/close")) {
            requireActivity().getSupportFragmentManager().V();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onCreateView$lambda$0(WebViewFragment webViewFragment, Card3DSWebView card3DSWebView) {
        webViewFragment.card3DSView = card3DSWebView;
        if (card3DSWebView.getId() == -1) {
            card3DSWebView.setId(View.generateViewId());
        }
        webViewFragment.getBinding().d.addView(card3DSWebView, 0, new ViewGroup.LayoutParams(-1, -1));
        webViewFragment.onPrepareWebView(card3DSWebView);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(WebViewFragment webViewFragment, View view) {
        rwo eventReporter = webViewFragment.getEventReporter();
        sv90 sv90Var = qv90.a;
        wj00 wj00Var = new wj00(0);
        wj00Var.k("webview_tag", webViewFragment.getLoggingTag().getValue());
        ((y22) eventReporter).a(y891.c("confirm_exit_screen_opened", wj00Var));
        webViewFragment.getActivityViewModel().L();
    }

    public final b88 getDelegate() {
        return this.delegate;
    }

    public WebViewTagForAnalytics getLoggingTag() {
        return this.loggingTag;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.isRestoring = savedInstanceState != null;
        View inflate = inflater.inflate(rlh0.paymentsdk_fragment_webview, container, false);
        int i = j9h0.close_button;
        if (((FrameLayout) cma1.O(i, inflate)) != null) {
            i = j9h0.close_button_icon;
            ImageView imageView = (ImageView) cma1.O(i, inflate);
            if (imageView != null) {
                i = j9h0.navigation_bar;
                ConstraintLayout constraintLayout = (ConstraintLayout) cma1.O(i, inflate);
                if (constraintLayout != null) {
                    i = j9h0.navigation_bar_title;
                    if (((TextView) cma1.O(i, inflate)) != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        int i2 = j9h0.webview_container;
                        FrameLayout frameLayout = (FrameLayout) cma1.O(i2, inflate);
                        if (frameLayout != null) {
                            this.currentBinding = new wpa0(linearLayout, imageView, constraintLayout, frameLayout);
                            this.delegate.d(requireContext(), new qq31(11, this));
                            return getBinding().a;
                        }
                        i = i2;
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.card3DSView != null) {
            this.card3DSView.destroy();
        }
    }

    public void onPrepareWebView(Card3DSWebView it) {
        it.setWebViewClient(new eg01(this));
        eq41 eq41Var = Companion;
        Bundle arguments = getArguments();
        eq41Var.getClass();
        it.setDebug(arguments != null ? arguments.getBoolean(IS_DEBUG) : false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Card3DSWebView card3DSWebView;
        eq41 eq41Var = Companion;
        Bundle arguments = getArguments();
        eq41Var.getClass();
        if (arguments == null || arguments.getBoolean(EXTRA_SHOW_NAVIGATION_BAR)) {
            getBinding().b.setOnClickListener(new aq41(0, this));
            getBinding().c.setVisibility(0);
        } else {
            getBinding().c.setVisibility(8);
        }
        rwo eventReporter = getEventReporter();
        sv90 sv90Var = qv90.a;
        PsdkScreen psdkScreen = PsdkScreen.WEBVIEW;
        sv90Var.getClass();
        ((y22) eventReporter).a(sv90.w0(psdkScreen));
        Bundle arguments2 = getArguments();
        String string = arguments2 != null ? arguments2.getString(EXTRA_URL) : null;
        Bundle arguments3 = getArguments();
        Parcelable[] parcelableArray = arguments3 != null ? arguments3.getParcelableArray(TRUSTED_URLS) : null;
        TrustedUrl[] trustedUrlArr = parcelableArray instanceof TrustedUrl[] ? (TrustedUrl[]) parcelableArray : null;
        List<TrustedUrl> d0 = trustedUrlArr != null ? j73.d0(trustedUrlArr) : EmptyList.a;
        if (string == null || (card3DSWebView = this.card3DSView) == null) {
            return;
        }
        card3DSWebView.loadUrl(string, d0, this.isRestoring);
    }

    public final void setDelegate(b88 b88Var) {
        this.delegate = b88Var;
    }

    public WebViewFragment(b88 b88Var) {
        this();
        this.delegate = b88Var;
    }
}
