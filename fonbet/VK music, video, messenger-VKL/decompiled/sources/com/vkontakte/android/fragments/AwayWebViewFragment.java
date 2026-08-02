package com.vkontakte.android.fragments;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.web.view.marker.di.WebViewMarkerComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import me.grishka.appkit.fragments.LoaderFragment;
import xsna.a8;
import xsna.dhr0;
import xsna.dir0;
import xsna.drm0;
import xsna.dsw;
import xsna.e43;
import xsna.epx;
import xsna.eu1;
import xsna.fpf0;
import xsna.go9;
import xsna.gv5;
import xsna.gz80;
import xsna.m7m;
import xsna.msy;
import xsna.naz;
import xsna.nds;
import xsna.oz50;
import xsna.qdz;
import xsna.ujx0;
import xsna.v390;
import xsna.y390;

/* compiled from: AwayWebViewFragment.kt */
/* loaded from: classes7.dex */
public final class AwayWebViewFragment extends LoaderFragment implements gv5, nds {
    public static final /* synthetic */ int t0 = 0;
    public WebView l0;
    public View m0;
    public ujx0 n0;
    public String o0;
    public String p0;
    public final Object q0 = msy.a(LazyThreadSafetyMode.NONE, new eu1(this, 5));
    public final c r0 = new c();
    public final b s0 = new b();

    /* compiled from: AwayWebViewFragment.kt */
    public static final class a extends oz50 {
        public a(String str, String str2) {
            super(AwayWebViewFragment.class, null, null);
            this.j.putString("away_url", str);
            this.j.putString("target_url", str2);
        }
    }

    /* compiled from: AwayWebViewFragment.kt */
    public static final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onCloseWindow(WebView webView) {
            super.onCloseWindow(webView);
            AwayWebViewFragment.this.finish();
        }
    }

    /* compiled from: AwayWebViewFragment.kt */
    public static final class c extends dir0 {
        public c() {
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"AwayWebViewFragment", go9.b("onPageFinished ", str)});
            }
            super.onPageFinished(webView, str);
            AwayWebViewFragment.this.oo();
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"AwayWebViewFragment", go9.b("onPageStarted ", str)});
            }
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            AwayWebViewFragment.this.onError(new VKApiExecutionException(-1, "", false, str, null, null, null, null, 0, null, null, null, 4080));
        }

        /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.dir0, xsna.cir0, android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url;
            String str = null;
            if (sslError != null && (url = sslError.getUrl()) != null && !drm0.N(url)) {
                str = url;
            }
            if (str != null) {
                dsw<UserId, v390> dswVar = y390.a;
                if (y390.a.a().d(str)) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"AwayWebViewFragment", "onReceivedSslError: skip SSL for ".concat(str)});
                    }
                    if (sslErrorHandler != null) {
                        sslErrorHandler.proceed();
                        return;
                    }
                    return;
                }
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            AwayWebViewFragment awayWebViewFragment = AwayWebViewFragment.this;
            FragmentActivity activity = awayWebViewFragment.getActivity();
            if (activity != null) {
                ((qdz) awayWebViewFragment.q0.getValue()).getBrowser().a(activity, Uri.parse(awayWebViewFragment.p0));
            }
            awayWebViewFragment.finish();
        }

        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.dir0, android.webkit.WebViewClient
        @SuppressLint({"CheckResult"})
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str != null) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"AwayWebViewFragment", "override ".concat(str)});
                }
                boolean q = naz.q(Uri.parse(str));
                AwayWebViewFragment awayWebViewFragment = AwayWebViewFragment.this;
                if (!q) {
                    String str2 = awayWebViewFragment.p0;
                    if (str2 != null) {
                        Uri parse = Uri.parse(str);
                        Uri parse2 = Uri.parse(str2);
                        String path = parse.getPath();
                        String path2 = parse2.getPath();
                        if (epx.f(path, DomExceptionUtils.SEPARATOR)) {
                            path = "";
                        }
                        if (epx.f(path2, DomExceptionUtils.SEPARATOR)) {
                            path2 = "";
                        }
                        if (epx.f(path, path2) && epx.f(parse.getAuthority(), parse2.getAuthority())) {
                            Context B = awayWebViewFragment.B();
                            if (B != null) {
                                ((qdz) awayWebViewFragment.q0.getValue()).getBrowser().a(B, Uri.parse(awayWebViewFragment.p0));
                            }
                            FragmentActivity activity = awayWebViewFragment.getActivity();
                            if (activity != null) {
                                activity.finish();
                            }
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                Uri parse3 = Uri.parse(str);
                if (parse3 != null) {
                    Uri build = parse3.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build();
                    dsw<UserId, v390> dswVar = y390.a;
                    v390 a = y390.a.a();
                    String b = v390.b(build.toString(), a.c(a.i));
                    ujx0 ujx0Var = awayWebViewFragment.n0;
                    if (ujx0Var != null) {
                        ujx0Var.c(b, false);
                        return true;
                    }
                }
                return true;
            }
            return false;
        }
    }

    @Override // xsna.nds
    public final boolean W9() {
        return dhr0.L();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        String a2;
        WebView webView = this.l0;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        this.l0.goBack();
        WebBackForwardList copyBackForwardList = this.l0.copyBackForwardList();
        String url = copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl();
        ujx0 ujx0Var = this.n0;
        if (ujx0Var == null || (a2 = ujx0Var.b) == null) {
            Regex regex = ujx0.g;
            a2 = ujx0.a.a();
        }
        if (!epx.f(url, a2)) {
            return false;
        }
        a0();
        return true;
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return dhr0.t.c(R.attr.vk_ui_background_modal);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        to(R.layout.loader_fragment_progress);
        super.onAttach(activity);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (gz80.a(28)) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            String str = context.getApplicationInfo().processName;
            if (!TextUtils.equals(str, B().getPackageName())) {
                try {
                    WebView.setDataDirectorySuffix(str);
                } catch (Throwable unused) {
                }
            }
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.l0.setWebChromeClient(null);
        FragmentActivity activity = getActivity();
        VKActivity vKActivity = activity instanceof VKActivity ? (VKActivity) activity : null;
        if (vKActivity != null) {
            vKActivity.r = true;
        }
        this.l0 = null;
        this.n0 = null;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        this.l0.onPause();
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.l0.onResume();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.l0 = (WebView) view.findViewById(R.id.webview);
        this.m0 = view.findViewById(R.id.toolbar);
        ujx0 ujx0Var = new ujx0(this.l0);
        ujx0Var.d = new a8(this, 6);
        this.n0 = ujx0Var;
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.l0, true);
        WebSettings settings = this.l0.getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(true);
        WebView webView = this.l0;
        if (webView != null) {
            webView.setWebViewClient(this.r0);
        }
        WebView webView2 = this.l0;
        if (webView2 != null) {
            webView2.setWebChromeClient(this.s0);
        }
        view.findViewById(R.id.horizontal_progress_toolbar).setVisibility(8);
        qo();
        FragmentActivity activity = getActivity();
        VKActivity vKActivity = activity instanceof VKActivity ? (VKActivity) activity : null;
        if (vKActivity != null) {
            vKActivity.r = false;
        }
        WebViewMarkerComponent webViewMarkerComponent = (WebViewMarkerComponent) m7m.d(this).mo408a(fpf0.a(WebViewMarkerComponent.class));
        if (webViewMarkerComponent.m7().isEnabled()) {
            View view2 = getView();
            FrameLayout frameLayout = view2 != null ? (FrameLayout) view2.findViewById(R.id.marker_placeholder) : null;
            TextView a2 = webViewMarkerComponent.Z().a(requireContext(), "");
            if (frameLayout != null) {
                frameLayout.addView(a2);
            }
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        Bundle arguments = getArguments();
        this.o0 = arguments != null ? arguments.getString("away_url") : null;
        Bundle arguments2 = getArguments();
        this.p0 = arguments2 != null ? arguments2.getString("target_url") : null;
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"AwayWebViewFragment", "doLoadData awayUrl=" + this.o0 + ", targetUrl=" + this.p0});
        }
        String str = this.o0;
        if (str != null) {
            dsw<UserId, v390> dswVar = y390.a;
            v390 a2 = y390.a.a();
            String b2 = v390.b(str, a2.c(a2.b));
            ujx0 ujx0Var = this.n0;
            if (ujx0Var != null) {
                ujx0Var.c(b2, false);
            }
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView = new WebView(kn());
        webView.setId(R.id.webview);
        return webView;
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        String str = this.p0;
        if (str != null) {
            uiTrackingScreen.f = new SchemeStat$EventItem(SchemeStat$EventItem.Type.BROWSER, null, null, str, null, null);
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }
}
