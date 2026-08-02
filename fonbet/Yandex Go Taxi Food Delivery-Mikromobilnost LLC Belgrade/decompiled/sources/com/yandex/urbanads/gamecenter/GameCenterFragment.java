package com.yandex.urbanads.gamecenter;

import android.app.Dialog;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import defpackage.bvf0;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.i1i0;
import defpackage.i3y;
import defpackage.iah0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.o751;
import defpackage.p751;
import defpackage.pmh0;
import defpackage.pss;
import defpackage.q751;
import defpackage.qss;
import defpackage.rss;
import defpackage.sss;
import defpackage.tje;
import defpackage.tss;
import defpackage.va90;
import defpackage.wss;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\u0003J\u0010\u0010\b\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J-\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0017¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0004\b$\u0010\u0003R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u0010/\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001d\u00104\u001a\u0004\u0018\u0001008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103¨\u00067"}, d2 = {"Lcom/yandex/urbanads/gamecenter/GameCenterFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Lzy11;", "hideSystemBarsLegacy", "restoreSystemBarsLegacy", "setupWebView", "loadUrl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "cookies", "applyCookies", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onStart", "onResume", "onPause", "onStop", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "onDestroy", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Landroid/widget/ProgressBar;", "progressBar", "Landroid/widget/ProgressBar;", "url$delegate", "Li3y;", "getUrl", "()Ljava/lang/String;", "url", "Lpss;", "dependencies$delegate", "getDependencies", "()Lpss;", "dependencies", "Companion", "tss", "urbanads-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GameCenterFragment extends DialogFragment {
    private static final String ARG_URL = "game_center_url";
    public static final tss Companion = new tss();

    /* renamed from: dependencies$delegate, reason: from kotlin metadata */
    private final i3y dependencies;
    private ProgressBar progressBar;

    /* renamed from: url$delegate, reason: from kotlin metadata */
    private final i3y url;
    private WebView webView;

    public GameCenterFragment() {
        int i = 0;
        this.url = kotlin.a.a(new rss(this, i));
        this.dependencies = kotlin.a.a(new sss(i));
    }

    private final void applyCookies(String cookies) {
        List W;
        if (evu0.J(cookies)) {
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        WebView webView = this.webView;
        if (webView != null) {
            cookieManager.setAcceptThirdPartyCookies(webView, true);
        }
        W = evu0.W(cookies, new String[]{";"}, (r2 & 4) != 0 ? 0 : 2);
        Iterator it = W.iterator();
        while (it.hasNext()) {
            String obj = evu0.k0((String) it.next()).toString();
            if (obj.length() > 0) {
                cookieManager.setCookie(getUrl(), obj);
            }
        }
        cookieManager.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final pss dependencies_delegate$lambda$1() {
        AtomicReference atomicReference = qss.a;
        i3y i3yVar = (i3y) qss.a.get();
        if (i3yVar != null) {
            return (pss) i3yVar.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pss getDependencies() {
        return (pss) this.dependencies.getValue();
    }

    private final String getUrl() {
        return (String) this.url.getValue();
    }

    private final void hideSystemBarsLegacy() {
        Window window;
        View decorView;
        Window window2;
        View decorView2;
        FragmentActivity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
            decorView2.setSystemUiVisibility(4866);
        }
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(4866);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadUrl(Continuation<? super zy11> continuation) {
        GameCenterFragment$loadUrl$1 gameCenterFragment$loadUrl$1;
        int i;
        wss wssVar;
        if (continuation instanceof GameCenterFragment$loadUrl$1) {
            gameCenterFragment$loadUrl$1 = (GameCenterFragment$loadUrl$1) continuation;
            int i2 = gameCenterFragment$loadUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gameCenterFragment$loadUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = gameCenterFragment$loadUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gameCenterFragment$loadUrl$1.label;
                wssVar = null;
                if (i != 0) {
                    b.b(obj);
                    getDependencies();
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    wssVar = (wss) obj;
                }
                if (wssVar == null) {
                    Map map = wssVar.a;
                    applyCookies(wssVar.b);
                    map.getClass();
                    WebView webView = this.webView;
                    if (webView != null) {
                        webView.loadUrl(getUrl());
                    }
                } else {
                    WebView webView2 = this.webView;
                    if (webView2 != null) {
                        webView2.loadUrl(getUrl());
                    }
                }
                return zy11.a;
            }
        }
        gameCenterFragment$loadUrl$1 = new GameCenterFragment$loadUrl$1(this, continuation);
        Object obj2 = gameCenterFragment$loadUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gameCenterFragment$loadUrl$1.label;
        wssVar = null;
        if (i != 0) {
        }
        if (wssVar == null) {
        }
        return zy11.a;
    }

    public static final GameCenterFragment newInstance(String str) {
        Companion.getClass();
        GameCenterFragment gameCenterFragment = new GameCenterFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_URL, str);
        gameCenterFragment.setArguments(bundle);
        return gameCenterFragment;
    }

    private final void restoreSystemBarsLegacy() {
        Window window;
        View decorView;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setSystemUiVisibility(0);
    }

    private final void setupWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            WebSettings settings = webView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
            settings.setBuiltInZoomControls(false);
            settings.setDisplayZoomControls(false);
            settings.setSupportZoom(false);
            settings.setCacheMode(-1);
            settings.setMixedContentMode(2);
            webView.setOverScrollMode(2);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
            webView.addJavascriptInterface(new GameCenterMessageHandler(requireContext(), eja1.s(this), new rss(this, 1), new rss(this, 2)), "MarketGameMessageHandler");
            webView.setWebViewClient(new WebViewClient() { // from class: com.yandex.urbanads.gamecenter.GameCenterFragment$setupWebView$1$2
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView view, String finishedUrl) {
                    ProgressBar progressBar;
                    super.onPageFinished(view, finishedUrl);
                    progressBar = GameCenterFragment.this.progressBar;
                    if (progressBar != null) {
                        progressBar.setVisibility(8);
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    Uri url;
                    if (request != null && (url = request.getUrl()) != null && url.toString() != null && request.hasGesture() && request.isForMainFrame()) {
                        GameCenterFragment.this.getDependencies();
                    }
                    return false;
                }
            });
            webView.setWebChromeClient(new WebChromeClient() { // from class: com.yandex.urbanads.gamecenter.GameCenterFragment$setupWebView$1$3
                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView view, int newProgress) {
                    ProgressBar progressBar;
                    super.onProgressChanged(view, newProgress);
                    progressBar = GameCenterFragment.this.progressBar;
                    if (progressBar != null) {
                        progressBar.setProgress(newProgress);
                        progressBar.setVisibility(newProgress < 100 ? 0 : 8);
                    }
                }
            });
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupWebView$lambda$7$lambda$5(GameCenterFragment gameCenterFragment) {
        gameCenterFragment.dismiss();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setupWebView$lambda$7$lambda$6(GameCenterFragment gameCenterFragment) {
        gameCenterFragment.getDependencies();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String url_delegate$lambda$0(GameCenterFragment gameCenterFragment) {
        String string = gameCenterFragment.requireArguments().getString(ARG_URL);
        return string == null ? "" : string;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(0, i1i0.GameCenterDialogTheme);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog onCreateDialog = super.onCreateDialog(savedInstanceState);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 31) {
                window.addFlags(512);
            } else {
                jl40.L(window, false);
                va90 va90Var = new va90(window.getDecorView());
                int i = Build.VERSION.SDK_INT;
                bvf0 q751Var = i >= 35 ? new q751(window, va90Var) : i >= 30 ? new p751(window, va90Var) : new o751(window, va90Var);
                q751Var.B(2);
                q751Var.V();
            }
            window.setLayout(-1, -1);
        }
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(pmh0.fragment_game_center, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (Build.VERSION.SDK_INT < 31) {
            restoreSystemBarsLegacy();
        }
        WebView webView = this.webView;
        if (webView != null) {
            webView.removeJavascriptInterface("MarketGameMessageHandler");
            webView.stopLoading();
            webView.destroy();
        }
        this.webView = null;
        this.progressBar = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getDependencies();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getDependencies();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT < 31) {
            hideSystemBarsLegacy();
        }
        getDependencies();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        getDependencies();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.webView = (WebView) view.findViewById(iah0.webView);
        this.progressBar = (ProgressBar) view.findViewById(iah0.progressBar);
        setupWebView();
        tje.N(eja1.s(this), null, null, new GameCenterFragment$onViewCreated$1(this, null), 3);
    }
}
