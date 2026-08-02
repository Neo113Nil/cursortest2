package com.vkontakte.android.fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.billing.SberpayPurchasesManager;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import com.vk.webapp.fragments.VkPayFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.VKActivity;
import com.vkontakte.android.fragments.WebViewFragment;
import io.reactivex.rxjava3.internal.operators.maybe.l;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.io.File;
import java.util.HashMap;
import java.util.Locale;
import kotlin.text.Regex;
import me.grishka.appkit.fragments.LoaderFragment;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.asu0;
import xsna.brm0;
import xsna.bwt0;
import xsna.c3y;
import xsna.dhr0;
import xsna.dsw;
import xsna.e43;
import xsna.e9z;
import xsna.g3p0;
import xsna.gq;
import xsna.gv5;
import xsna.gz80;
import xsna.h8n0;
import xsna.i5s;
import xsna.iri0;
import xsna.itg0;
import xsna.j6i;
import xsna.jan0;
import xsna.kjn0;
import xsna.l6v0;
import xsna.l7m;
import xsna.m7m;
import xsna.mge0;
import xsna.mz60;
import xsna.n2v0;
import xsna.nds;
import xsna.nr2;
import xsna.nrq0;
import xsna.o25;
import xsna.oge0;
import xsna.oz50;
import xsna.ply;
import xsna.pnr0;
import xsna.pro0;
import xsna.ps60;
import xsna.q6c0;
import xsna.qge0;
import xsna.qwv0;
import xsna.rao;
import xsna.six0;
import xsna.ss9;
import xsna.tix0;
import xsna.tjj;
import xsna.u1u0;
import xsna.ujx0;
import xsna.v390;
import xsna.vds;
import xsna.vul0;
import xsna.w8i;
import xsna.y390;
import xsna.zhy0;
import xsna.zr;

/* loaded from: classes11.dex */
public class WebViewFragment extends LoaderFragment implements gv5, nds, w8i, vds, kjn0 {
    public static final /* synthetic */ int O0 = 0;
    public ValueCallback<Uri[]> H0;
    public Uri I0;
    public Uri J0;
    public final l7m K0;
    public final oge0 L0;
    public qge0<mge0> M0;
    public SberpayPurchasesManager.SberpayUriHandleResult N0;
    public WebView l0;
    public ujx0 m0;
    public String n0;
    public String o0;
    public String p0;
    public MaterialProgressBar q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public long u0;
    public String v0;
    public boolean w0;
    public String x0;
    public boolean y0 = false;
    public boolean z0 = false;
    public boolean A0 = false;
    public boolean B0 = false;
    public boolean C0 = false;
    public boolean D0 = false;
    public final HashMap<String, e9z> E0 = new HashMap<>();
    public boolean F0 = false;
    public boolean G0 = false;

    /* loaded from: classes7.dex */
    public class a extends ujx0 {
        public a(WebView webView, String str) {
            super(webView, str);
        }

        @Override // xsna.ujx0
        public final String e(String str) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            WebViewFragment webViewFragment = WebViewFragment.this;
            if (webViewFragment.getArguments().getBoolean("apiView", false)) {
                buildUpon.appendQueryParameter("api_view", "1");
            }
            if (webViewFragment.getArguments().getBoolean("with_lang", false)) {
                buildUpon.appendQueryParameter("lang", ply.a());
            }
            return buildUpon.toString();
        }
    }

    /* loaded from: classes7.dex */
    public class b extends c3y {

        public class a implements Runnable {
            public final /* synthetic */ String b;
            public final /* synthetic */ String c;

            public a(String str, String str2) {
                this.b = str;
                this.c = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                WebViewFragment webViewFragment = WebViewFragment.this;
                String str = this.b;
                if ("openExternalUrl".contains(str)) {
                    int i = WebViewFragment.O0;
                    int i2 = VkPayFragment.g0;
                    String str2 = this.c;
                    if ((brm0.B(str2, "vkpay", false) || brm0.B(str2, o25.a().i().z, false)) && o25.a().i().y) {
                        VkPayFragment.b.b(str2).g(102, webViewFragment);
                        return;
                    }
                    return;
                }
                if ("VKWebAppOpenQR".contains(str)) {
                    int i3 = WebViewFragment.O0;
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context mo2getContext = webViewFragment.mo2getContext();
                    permissionHelper.getClass();
                    permissionHelper.d(mo2getContext, PermissionHelper.l, R.string.vk_permissions_camera, R.string.vk_permissions_camera, new tix0(webViewFragment), new tjj(webViewFragment, 1));
                    return;
                }
                if ("showWallPostBox".equals(str)) {
                    String str3 = this.c;
                    int i4 = WebViewFragment.O0;
                    FragmentActivity activity = webViewFragment.getActivity();
                    if (activity == null) {
                        return;
                    }
                    try {
                        q6c0 q6c0Var = new q6c0();
                        q6c0Var.y(webViewFragment.u0, str3, null, false, false);
                        q6c0Var.h(activity, 112);
                    } catch (IllegalArgumentException e) {
                        L.l(e.getMessage());
                    }
                }
            }
        }

        public b() {
        }

        @JavascriptInterface
        public void callMethod(String str, String str2) {
            pro0.e(new a(str, str2));
        }
    }

    public WebViewFragment() {
        l7m f = m7m.f(this);
        this.K0 = f;
        this.L0 = ((PurchasesManagerComponent) j6i.b(f, PurchasesManagerComponent.class)).J7();
        this.M0 = null;
        this.N0 = SberpayPurchasesManager.SberpayUriHandleResult.IRRELEVANT;
    }

    @Override // xsna.vds
    public final int Q0() {
        Bundle arguments = getArguments();
        return (arguments == null || !arguments.getBoolean("force_portrait_orientation")) ? -1 : 1;
    }

    @Override // xsna.nds
    public final boolean W9() {
        return dhr0.L();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        WebView webView = this.l0;
        boolean z = false;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        this.D0 = true;
        boolean z2 = getArguments().getBoolean("ignore_back_history", false);
        L.e(zhy0.a("handleClientAuthBackHistory ignoreBackHistory=", z2));
        if (!z2) {
            this.l0.goBack();
            WebBackForwardList copyBackForwardList = this.l0.copyBackForwardList();
            if (copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex()).getUrl().equals(vo().b())) {
                a0();
            }
            return true ^ z;
        }
        z = true;
        return true ^ z;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment
    public final void go() {
        finish();
    }

    @Override // xsna.nds, xsna.xoo0
    public final int l2() {
        return dhr0.t.c(R.attr.vk_ui_background_modal);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        String valueOf;
        String str;
        String str2;
        Uri[] uriArr;
        Uri uri;
        WebView webView;
        String str3 = null;
        if (i == 112) {
            if (i2 != -1) {
                str = "VKWebAppShowWallPostBoxCancel";
                if (i2 == 0) {
                    valueOf = "null";
                } else {
                    if (i2 != 10) {
                        str2 = null;
                        if (str3 != null || str2 == null) {
                            return;
                        }
                        uo(ss9.a("{detail: {type: \"", str3, "\", data: ", str2, "}}"));
                        return;
                    }
                    String stringExtra = intent.getStringExtra("description");
                    Locale locale = Locale.US;
                    int intExtra = intent.getIntExtra("code", 0);
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    valueOf = gq.b(intExtra, "{error_code: ", ", error_msg: \"", stringExtra, "\"}");
                }
            } else {
                valueOf = String.valueOf(intent.getIntExtra("postId", 0));
                str = "VKWebAppShowWallPostBoxDone";
            }
            String str4 = valueOf;
            str3 = str;
            str2 = str4;
            if (str3 != null) {
                return;
            } else {
                return;
            }
        }
        if (i == 9999) {
            if (i2 != -1) {
                uriArr = null;
            } else if (intent != null && intent.getDataString() != null) {
                uriArr = new Uri[]{Uri.parse(intent.getDataString())};
            } else if (intent == null || intent.getClipData() == null || intent.getClipData().getItemCount() == 0) {
                Uri uri2 = this.I0;
                if (uri2 != null) {
                    String K = com.vk.core.files.a.K(uri2);
                    if (!TextUtils.isEmpty(K) && new File(K).length() > 0) {
                        uri = this.I0;
                        uriArr = new Uri[]{uri};
                    }
                }
                Uri uri3 = this.J0;
                if (uri3 != null) {
                    String K2 = com.vk.core.files.a.K(uri3);
                    if (!TextUtils.isEmpty(K2) && new File(K2).length() > 0) {
                        uri = this.J0;
                        uriArr = new Uri[]{uri};
                    }
                }
                uri = null;
                uriArr = new Uri[]{uri};
            } else {
                uriArr = new Uri[intent.getClipData().getItemCount()];
                for (int i3 = 0; i3 < intent.getClipData().getItemCount(); i3++) {
                    uriArr[i3] = intent.getClipData().getItemAt(i3).getUri();
                }
            }
            ValueCallback<Uri[]> valueCallback = this.H0;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(uriArr);
                this.H0 = null;
            }
            this.I0 = null;
            this.J0 = null;
            return;
        }
        switch (i) {
            case 101:
                if (i2 == -1) {
                    if (getArguments().getBoolean("should_close_after_native", false)) {
                        finish();
                        break;
                    }
                } else if (i2 == 0 && (webView = this.l0) != null) {
                    webView.loadUrl(this.n0);
                    break;
                }
                break;
            case 102:
                if (i2 == -1) {
                    String stringExtra2 = intent.getStringExtra("vk_pay_result");
                    try {
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", "appRunCallback");
                        jSONObject2.put(NotificationCompat.CATEGORY_EVENT, "onExternalAppDone");
                        jSONObject2.put("data", new JSONObject(stringExtra2));
                        jSONObject.put("detail", jSONObject2);
                        uo(jSONObject.toString());
                        break;
                    } catch (JSONException unused) {
                        return;
                    }
                }
                break;
            case 103:
                if (i2 == -1 && intent != null) {
                    String a2 = qwv0.a.a(intent);
                    if (!TextUtils.isEmpty(a2)) {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("type", "VKWebAppQRDone");
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("qr_string", a2);
                            jSONObject3.put("data", jSONObject4);
                            nr2.K(this.l0, jSONObject3);
                            break;
                        } catch (JSONException e) {
                            L.i(e);
                            return;
                        }
                    }
                }
                wo();
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.A0 = arguments.getBoolean("scroll_toolbar", false);
        }
        if (this.A0) {
            to(R.layout.loader_fragment_progress_scrollable);
        } else {
            to(R.layout.loader_fragment_progress);
        }
        super.onAttach(activity);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        setTitle(getArguments().getString("screen_title"));
        boolean z = true;
        this.r0 = arguments.getString("url_to_copy") != null;
        this.s0 = arguments.getBoolean("app_report", false);
        this.t0 = arguments.getBoolean("is_app_group", false);
        this.u0 = arguments.getLong(InneractiveMediationDefs.REMOTE_KEY_APP_ID, 0L);
        this.v0 = "/app" + String.valueOf(this.u0);
        this.w0 = arguments.getBoolean("share", false);
        this.z0 = arguments.getBoolean("should_override_deeplinks", false);
        this.B0 = arguments.getBoolean("show_url_in_toolbar", false);
        this.C0 = arguments.getBoolean("allow_add_to_fave", false);
        this.G0 = arguments.getBoolean("track_urls", false);
        if (!this.r0 && !this.s0 && !this.t0 && !this.C0 && !this.w0) {
            z = false;
        }
        setHasOptionsMenu(z);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.r0 || this.w0 || this.s0 || this.C0) {
            MenuItem add = menu.add(0, R.id.vk_menu_more, 0, R.string.accessibility_actions);
            add.setShowAsAction(2);
            add.setIcon(R.drawable.vk_icon_more_vertical_28);
        }
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (gz80.a(28)) {
            String str = e43.a.getApplicationInfo().processName;
            if (!TextUtils.equals(str, B().getPackageName())) {
                try {
                    WebView.setDataDirectorySuffix(str);
                } catch (Throwable unused) {
                }
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        WebView webView = this.l0;
        if (webView != null) {
            webView.getUrl();
        }
        super.onDestroyView();
        this.l0.setWebChromeClient(null);
        this.l0.setWebViewClient(null);
        FragmentActivity activity = getActivity();
        if (activity instanceof VKActivity) {
            ((VKActivity) activity).r = true;
        }
        this.l0 = null;
        this.m0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.vk_menu_more) {
            e.b a2 = VkContextMenu.e.a(dhr0.t.c(R.attr.vk_ui_icon_accent), ho().findViewById(R.id.vk_menu_more));
            if (this.r0) {
                a2.b(R.string.copy_link, null, new pnr0(this, 9));
            }
            if (this.w0) {
                a2.b(R.string.share, null, new h8n0(this, 22));
            }
            if (this.s0) {
                a2.b(R.string.report_content, null, new nrq0(this, 10));
            }
            if (this.C0) {
                e9z e9zVar = this.E0.get(this.p0);
                a2.b((e9zVar == null || !e9zVar.X()) ? R.string.favorites_add : R.string.favorites_remove, null, new iri0(this, 27));
            }
            a2.j();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        this.l0.onPause();
        this.l0.getContext().setTheme(dhr0.C().c);
        super.onPause();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (dhr0.C().b) {
            this.l0.getContext().setTheme(R.style.VkWebViewLightTheme);
        } else {
            this.l0.getContext().setTheme(R.style.VkWebViewDarkTheme);
        }
        if (!this.f0) {
            qo();
        }
        this.l0.onResume();
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.q0 = (MaterialProgressBar) view.findViewById(R.id.horizontal_progress_toolbar);
        this.l0 = (WebView) view.findViewById(R.id.webview);
        this.m0 = vo();
        WebView webView = this.l0;
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
        if (getArguments().getBoolean("internal_back")) {
            this.Q.setNavigationOnClickListener(new six0(this, webView));
        }
        WebSettings settings = webView.getSettings();
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        if (this.t0) {
            nr2.k(webView, new f(this, vo()), new b());
        } else {
            nr2.l(webView, new f(this, vo()));
        }
        webView.setWebChromeClient(new g(this));
        webView.setDownloadListener(new DownloadListener() { // from class: xsna.qix0
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                int i = WebViewFragment.O0;
                vao.a(WebViewFragment.this.mo2getContext(), null, str, str4);
            }
        });
        if (this.A0) {
            ((CoordinatorLayout.f) this.l0.getLayoutParams()).c(new AppBarLayout.ScrollingViewBehavior());
            this.l0.requestLayout();
        }
        Toolbar toolbar = this.Q;
        if (toolbar != null) {
            if (this.B0) {
                u1u0.k(toolbar, R.drawable.vk_icon_cancel_outline_28, R.string.accessibility_close);
            } else if (this.s0) {
                toolbar.setNavigationIcon(dhr0.t.b(R.drawable.vk_icon_cancel_24, R.attr.vk_ui_icon_medium));
                toolbar.setNavigationContentDescription(R.string.accessibility_close);
            } else {
                u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
            }
            if (this.B0) {
                this.Q.t(R.style.WebViewFragmentToolbar_Title, mo2getContext());
                this.Q.s(R.style.WebViewFragmentToolbar_Subtitle, mo2getContext());
            } else {
                this.Q.t(R.style.ToolbarFixSizeTitle, mo2getContext());
            }
            if (this.t0) {
                g3p0.c(toolbar);
                bwt0.Z(R.attr.vk_ui_background_modal, toolbar);
            } else {
                g3p0.b(toolbar);
                bwt0.Z(R.attr.vk_ui_header_background, toolbar);
            }
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof VKActivity) {
            ((VKActivity) activity).r = false;
        }
        l lVar = new l(new v(new ps60(this, 3)), new vul0(7));
        asu0 asu0Var = asu0.a;
        itg0.c(lVar.n(asu0Var.c()).k(asu0Var.d()).subscribe(new mz60(1, this, view), new rao()), this);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        this.x0 = getArguments().getString("url");
        L.e("WebViewFragment", i5s.a(new StringBuilder("doLoadData url='"), this.x0, "'"));
        if (this.x0 != null) {
            dsw<UserId, v390> dswVar = y390.a;
            v390 a2 = y390.a.a();
            this.x0 = v390.b(this.x0, a2.c(a2.b));
            boolean z = getArguments().getBoolean("webview_access_token");
            this.m0.f(new jan0(this, 17));
            this.m0.c(this.x0, z);
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView;
        if (this.A0) {
            l6v0 l6v0Var = new l6v0(kn());
            l6v0Var.setScrollHandler(new n2v0(l6v0Var));
            webView = l6v0Var;
        } else {
            webView = new WebView(getActivity());
        }
        webView.setId(R.id.webview);
        return webView;
    }

    public final void uo(String str) {
        this.l0.loadUrl("javascript:".concat(zr.a("window.dispatchEvent(new CustomEvent('VKWebAppEvent', ", str, "));")));
    }

    public final ujx0 vo() {
        ujx0 ujx0Var = this.m0;
        if (ujx0Var != null) {
            return ujx0Var;
        }
        WebView webView = this.l0;
        Regex regex = ujx0.g;
        return new a(webView, ujx0.a.a());
    }

    public final void wo() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", "VKWebAppContactsClosed");
            jSONObject.put("data", new JSONObject());
            nr2.K(this.l0, jSONObject);
        } catch (JSONException e) {
            L.i(e);
        }
    }

    public boolean xo(String str) {
        return false;
    }

    /* loaded from: classes7.dex */
    public static class c extends oz50 {
        public c(String str, Class<? extends FragmentImpl> cls) {
            super(cls, null, null);
            this.j.putString("url", str);
        }

        public final void A() {
            this.j.putBoolean("webview_access_token", true);
        }

        public final void B() {
            this.j.putBoolean("force_close_after_app_redirect", true);
        }

        public final void C() {
            this.j.putBoolean("internal_back", true);
        }

        public final void D() {
            this.j.putBoolean("with_lang", true);
        }

        public final void E() {
            F(false, false);
        }

        public final void F(boolean z, boolean z2) {
            Bundle bundle = this.j;
            bundle.putBoolean("open_internally", true);
            bundle.putBoolean("process_redirects_only", z);
            bundle.putBoolean("should_close_after_native", z2);
        }

        public final void G(long j) {
            this.j.putLong(InneractiveMediationDefs.REMOTE_KEY_APP_ID, j);
        }

        public final void H(String str) {
            this.j.putString("screen_title", str);
        }

        public final void I(boolean z) {
            this.j.putBoolean("should_close_after_native", z);
        }

        public final void J(String str) {
            this.j.putString("url_to_copy", str);
        }

        public final void K() {
            this.j.putBoolean("share", true);
        }

        public final void L() {
            this.j.putBoolean("should_override_deeplinks", true);
        }

        public final void M() {
            this.j.putBoolean("scroll_toolbar", true);
        }

        public final void N(boolean z) {
            this.j.putBoolean("show_url_in_toolbar", z);
        }

        public final void y() {
            this.j.putBoolean("allow_add_to_fave", true);
        }

        public final void z() {
            this.j.putBoolean("apiView", true);
        }

        public c(String str) {
            super(WebViewFragment.class, null, null);
            this.j.putString("url", str);
        }

        public c(Uri uri) {
            this(uri.toString());
        }
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }
}
