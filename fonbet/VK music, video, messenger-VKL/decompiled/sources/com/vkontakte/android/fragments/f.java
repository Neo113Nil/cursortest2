package com.vkontakte.android.fragments;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.api.base.Document;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.billing.SberpayPurchasesManager;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.log.L;
import com.vk.profile.ui.community.CommunityMessagesFragment;
import com.vkontakte.android.LinkRedirActivity;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.Objects;
import kotlin.text.Regex;
import xsna.a0a;
import xsna.aq80;
import xsna.brm0;
import xsna.cp0;
import xsna.d3r0;
import xsna.dpo0;
import xsna.e9z;
import xsna.efr0;
import xsna.enq;
import xsna.er;
import xsna.fr;
import xsna.go9;
import xsna.hg1;
import xsna.hhw0;
import xsna.iie;
import xsna.is1;
import xsna.laz;
import xsna.mnh0;
import xsna.naz;
import xsna.oge0;
import xsna.pe1;
import xsna.peq0;
import xsna.ril0;
import xsna.rjx0;
import xsna.rsg0;
import xsna.tfx;
import xsna.ujx0;
import xsna.xwk;
import xsna.yfb;
import xsna.zr;

/* compiled from: WebViewFragment.java */
/* loaded from: classes7.dex */
public final class f extends rjx0 {
    public boolean f;
    public boolean g;
    public final /* synthetic */ WebViewFragment h;

    /* compiled from: WebViewFragment.java */
    public class a extends aq80 {
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, boolean z) {
            super(context);
            this.c = str;
            this.d = z;
        }

        @Override // xsna.yp80
        public final void U() {
            WebViewFragment webViewFragment = f.this.h;
            webViewFragment.y0 = true;
            webViewFragment.l0.loadUrl(this.c);
        }

        @Override // xsna.aq80, xsna.yp80
        public final void onError(Throwable th) {
            super.onError(th);
            U();
        }

        @Override // xsna.aq80, xsna.yp80
        public final void onSuccess() {
            if (this.d) {
                f.this.h.finish();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(WebViewFragment webViewFragment, ujx0 ujx0Var) {
        super(ujx0Var);
        this.h = webViewFragment;
        this.f = false;
        this.g = false;
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        String str2;
        super.doUpdateVisitedHistory(webView, str, z);
        L.e("WebViewFragment", go9.b("doUpdateVisitedHistory url=", str));
        WebViewFragment webViewFragment = this.h;
        if (webViewFragment.G0) {
            boolean z2 = this.f;
            if (z2 && str != null) {
                UiTracker uiTracker = UiTracker.a;
                UiTracker.i(str, webViewFragment.D0);
            } else if (!z2) {
                boolean q = naz.q(Uri.parse(str));
                this.f = !q;
                if (!q && ((str2 = webViewFragment.p0) == null || naz.q(Uri.parse(str2)))) {
                    UiTracker uiTracker2 = UiTracker.a;
                    UiTracker.i(str, false);
                }
            }
            webViewFragment.D0 = false;
        } else if (!this.g && !(webViewFragment instanceof CommunityMessagesFragment)) {
            UiTracker uiTracker3 = UiTracker.a;
            UiTracker.i(null, false);
            this.g = true;
        }
        webViewFragment.p0 = str;
        if (webViewFragment.C0 && !webViewFragment.E0.containsKey(str)) {
            e9z e9zVar = new e9z(str);
            webViewFragment.E0.put(str, e9zVar);
            Context mo2getContext = webViewFragment.mo2getContext();
            efr0 efr0Var = new efr0(e9zVar, 16);
            enq enqVar = enq.a;
            enq.b.getClass();
            tfx tfxVar = new tfx("fave.checkLink", new er(17), new fr(17));
            tfx.o(tfxVar, "link", str, 0, 0, 12);
            int i = 25;
            io.reactivex.rxjava3.disposables.c subscribe = hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), mo2getContext, 0L, false, 62).subscribe(new cp0(new iie(efr0Var, 14), i), new is1(new pe1(24), i));
            enqVar.getClass();
            enq.b(mo2getContext, subscribe);
        }
        if (webViewFragment.B0) {
            Uri parse = Uri.parse(str);
            String str3 = parse.getHost() + parse.getPath();
            webViewFragment.P = str3;
            if (webViewFragment.T != null) {
                return;
            }
            Toolbar toolbar = webViewFragment.Q;
            if (toolbar != null) {
                toolbar.setSubtitle(str3);
                webViewFragment.lo();
            } else {
                if (!webViewFragment.N || webViewFragment.getActivity().getActionBar() == null) {
                    return;
                }
                webViewFragment.getActivity().getActionBar().setSubtitle(str3);
            }
        }
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        String str2;
        L.e("WebViewFragment", zr.a("onPageFinished url='", str, "'"));
        super.onPageFinished(webView, str);
        WebViewFragment webViewFragment = this.h;
        if (!webViewFragment.f0 && !webViewFragment.F0 && str != null && (str2 = webViewFragment.o0) != null) {
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(str2);
            if (parse.getPath().equals(parse2.getPath()) && parse.getAuthority().equals(parse2.getAuthority())) {
                webViewFragment.oo();
            }
        }
        webViewFragment.o0 = null;
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        L.e("WebViewFragment", zr.a("onPageStarted url='", str, "'"));
        super.onPageStarted(webView, str, bitmap);
        WebViewFragment webViewFragment = this.h;
        webViewFragment.o0 = str;
        webViewFragment.F0 = false;
    }

    @Override // xsna.dir0, android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        WebViewFragment webViewFragment = this.h;
        webViewFragment.F0 = true;
        webViewFragment.onError(new VKApiExecutionException(-1, "", false, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x028d, code lost:
    
        if (xsna.naz.q(r7) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00da, code lost:
    
        if (java.util.Objects.equals(r2, "/login") == false) goto L40;
     */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rjx0, xsna.dir0, android.webkit.WebViewClient
    @SuppressLint({"CheckResult"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        String str2;
        boolean z;
        L.e("WebViewFragment", zr.a("override url='", str, "'"));
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        String str3 = this.h.x0;
        if (str3 != null) {
            uri = Uri.parse(str3);
            str2 = uri.getPath();
        } else {
            uri = null;
            str2 = null;
        }
        boolean z2 = false;
        if (path == null || !path.equals(str2)) {
            int i = 1;
            if (super.shouldOverrideUrlLoading(webView, str)) {
                this.h.o0 = null;
                return true;
            }
            String host = parse.getHost();
            if ("http".equals(parse.getScheme()) && (Objects.equals(host, a0a.d) || Objects.equals(host, "vk.ru"))) {
                webView.loadUrl(parse.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build().toString());
                return true;
            }
            try {
                String host2 = uri.getHost();
                String path2 = uri.getPath();
                String queryParameter = uri.getQueryParameter("act");
                if (Objects.equals(host2, "m.".concat(a0a.d)) && Objects.equals(path2, "/payments")) {
                    if (Objects.equals(queryParameter, "finished")) {
                        if (mnh0.p(parse)) {
                            this.h.finish();
                            return true;
                        }
                        String host3 = parse.getHost();
                        String path3 = parse.getPath();
                        if (!Objects.equals(host3, "login.".concat(a0a.d))) {
                            if (!Objects.equals(path3, "/login.php")) {
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
            WebViewFragment webViewFragment = this.h;
            String str4 = webViewFragment.n0;
            if (str4 != null) {
                Uri parse2 = Uri.parse(str4);
                Uri parse3 = Uri.parse(str);
                String queryParameter2 = parse2.isHierarchical() ? parse2.getQueryParameter("forced_color_scheme_mode") : null;
                if (queryParameter2 != null && parse3.isHierarchical() && parse3.getQueryParameter("forced_color_scheme_mode") == null) {
                    webViewFragment.l0.loadUrl(parse3.buildUpon().appendQueryParameter("forced_color_scheme_mode", queryParameter2).build().toString());
                    this.h.o0 = null;
                    return true;
                }
            }
            if (this.h.xo(str)) {
                this.h.o0 = null;
                return true;
            }
            boolean z3 = (str == null || this.h.n0 == null) ? false : !Uri.parse(str).buildUpon().query("").toString().equals(Uri.parse(r0).buildUpon().query("").toString());
            if (z3) {
                this.h.y0 = false;
            }
            WebViewFragment webViewFragment2 = this.h;
            webViewFragment2.n0 = str;
            if (webViewFragment2.getArguments().getBoolean("should_override_url_loading")) {
                this.h.o0 = null;
                return true;
            }
            if (this.h.z0) {
                Object obj = naz.a;
                String[] strArr = {"vk://", "vkme://"};
                for (int i2 = 0; i2 < 2; i2++) {
                    if (brm0.B(str, strArr[i2], true)) {
                        this.h.o0 = null;
                        return true;
                    }
                }
            }
            if (naz.u(parse) && "purchases_googleplay".equals(parse.getHost())) {
                WebViewFragment webViewFragment3 = this.h;
                webViewFragment3.o0 = null;
                String queryParameter3 = parse.getQueryParameter("type");
                int b = d3r0.b(parse.getQueryParameter("id"));
                ril0 ril0Var = new ril0();
                ril0Var.C(b, "product_id");
                ril0Var.K("type", queryParameter3);
                ril0Var.p = true;
                m1 y0 = rsg0.y0(ril0Var, null, null, 3);
                io.reactivex.rxjava3.disposables.c cVar = webViewFragment3.i0;
                if (cVar != null) {
                    cVar.dispose();
                }
                webViewFragment3.i0 = y0.subscribe(new dpo0(webViewFragment3, 11), new hhw0(webViewFragment3, i));
                return true;
            }
            WebViewFragment webViewFragment4 = this.h;
            if (mnh0.p(parse) && webViewFragment4.getArguments().getBoolean("should_close_on_blank")) {
                webViewFragment4.finish();
                this.h.o0 = null;
                return true;
            }
            if (!this.h.getArguments().getBoolean("open_internally")) {
                if (this.h.getArguments().getBoolean("open_links_in_browser")) {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                    intent.setComponent(new ComponentName(this.h.getActivity(), (Class<?>) LinkRedirActivity.class));
                    intent.putExtra("no_browser", true);
                    this.h.startActivityForResult(intent, 101);
                    this.h.o0 = null;
                    return true;
                }
                Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
                Document document = (Document) this.h.getArguments().getParcelable("document");
                if (document != null) {
                    intent2.putExtra("document", document);
                }
                intent2.setComponent(new ComponentName(this.h.getActivity(), (Class<?>) LinkRedirActivity.class));
                this.h.startActivityForResult(intent2, 101);
                this.h.o0 = null;
                return true;
            }
            WebViewFragment webViewFragment5 = this.h;
            oge0 oge0Var = webViewFragment5.L0;
            Context mo2getContext = webViewFragment5.mo2getContext();
            WebViewFragment webViewFragment6 = this.h;
            webViewFragment5.N0 = oge0Var.a(mo2getContext, parse, webViewFragment6.l0, webViewFragment6.x0, webViewFragment6.N0);
            WebViewFragment webViewFragment7 = this.h;
            if (webViewFragment7.N0 != SberpayPurchasesManager.SberpayUriHandleResult.IRRELEVANT) {
                webViewFragment7.o0 = null;
                return true;
            }
            String scheme = parse.getScheme();
            if ((!"http".equals(scheme) && !HttpRequest.DEFAULT_SCHEME.equals(scheme)) || "play.google.com".equals(parse.getHost())) {
                if (com.vk.common.links.b.l(this.h.B(), parse)) {
                    try {
                        if (!this.h.getActivity().isTaskRoot()) {
                            this.h.finish();
                        }
                    } catch (Exception e) {
                        L.i(e);
                    }
                    this.h.o0 = null;
                    return true;
                }
                if (!((str == null || !str.startsWith("tel:") || str.startsWith("tel://")) ? false : true)) {
                    if (str != null && str.startsWith("mailto:") && !str.startsWith("mailto://")) {
                        z2 = true;
                    }
                    if (!z2) {
                        this.h.o0 = null;
                        return true;
                    }
                }
                com.vk.common.links.b.c(this.h.B(), str, null);
                this.h.o0 = null;
                return true;
            }
            WebViewFragment webViewFragment8 = this.h;
            String path4 = parse.getPath();
            if (path4 == null || !path4.contains(webViewFragment8.v0)) {
                try {
                    z = peq0.p(new peq0(parse), (Regex) laz.w.getValue(), null, null, 14);
                } catch (Exception unused2) {
                    z = false;
                }
                if (!z) {
                    if (!naz.v(parse)) {
                    }
                }
            }
            this.h.y0 = true;
            String valueOf = String.valueOf(this.h.requireArguments().getLong(InneractiveMediationDefs.REMOTE_KEY_APP_ID));
            boolean z4 = this.h.getArguments().getBoolean("force_close_after_app_redirect");
            if (str.contains(valueOf) && z4) {
                WebViewFragment webViewFragment9 = this.h;
                webViewFragment9.o0 = null;
                webViewFragment9.finish();
                return true;
            }
            boolean z5 = this.h.getArguments().getBoolean("process_redirects_only");
            boolean z6 = this.h.getArguments().getBoolean("should_close_after_native");
            WebViewFragment webViewFragment10 = this.h;
            if (webViewFragment10.y0 || (!z3 && z5)) {
                webViewFragment10.y0 = false;
                return false;
            }
            Context mo2getContext2 = webViewFragment10.mo2getContext();
            if (mo2getContext2 != null) {
                boolean l = xwk.d().e().l(mo2getContext2, str, LaunchContext.a(new LaunchContext(false, true, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, null, 67108860), this.h.x0, 67108607), null, new a(mo2getContext2, str, z6));
                if (l) {
                    this.h.o0 = null;
                }
                return l;
            }
        }
        return false;
    }
}
