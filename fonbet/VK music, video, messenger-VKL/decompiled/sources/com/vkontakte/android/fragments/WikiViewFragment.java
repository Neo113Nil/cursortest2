package com.vkontakte.android.fragments;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import me.grishka.appkit.fragments.LoaderFragment;
import me.zhanghai.android.materialprogressbar.MaterialProgressBar;
import xsna.dsw;
import xsna.e8r;
import xsna.lpx0;
import xsna.mkc;
import xsna.npx0;
import xsna.nr2;
import xsna.nr4;
import xsna.oz50;
import xsna.rjx0;
import xsna.ujx0;
import xsna.v390;
import xsna.y390;

/* compiled from: WikiViewFragment.kt */
/* loaded from: classes7.dex */
public final class WikiViewFragment extends LoaderFragment {
    public static final /* synthetic */ int q0 = 0;
    public WebView l0;
    public MaterialProgressBar m0;
    public ujx0 n0;
    public String o0 = "";
    public final String p0 = "";

    /* compiled from: WikiViewFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: WikiViewFragment.kt */
    public static final class b extends lpx0 {
        public b(Context context, Bundle bundle) {
            super(context, bundle);
        }

        @Override // xsna.lpx0
        public final void a(String str, String str2) {
            int i = WikiViewFragment.q0;
            WikiViewFragment.this.setTitle(str2);
        }
    }

    static {
        e8r.a.b(r1, PrivateSubdir.WEBVIEW.h(), true);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        WebView webView = this.l0;
        if (webView == null) {
            webView = null;
        }
        if (!webView.canGoBack()) {
            return false;
        }
        WebView webView2 = this.l0;
        (webView2 != null ? webView2 : null).goBack();
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        to(R.layout.loader_fragment_progress);
        super.onAttach(context);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new b(requireContext(), requireArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (getArguments() == null || !requireArguments().getBoolean("site")) {
            return;
        }
        MenuItem add = menu.add(0, R.id.share, 0, R.string.sys_share_link);
        add.setShowAsAction(2);
        add.setIcon(R.drawable.vk_icon_share_external_24);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.share || getActivity() == null) {
            return true;
        }
        String str = this.p0;
        if (str.length() <= 0) {
            return true;
        }
        nr4.b().k(requireContext(), str);
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        this.l0 = (WebView) view.findViewById(R.id.webview);
        WebView webView = this.l0;
        if (webView == null) {
            webView = null;
        }
        this.n0 = new ujx0(webView);
        WebView webView2 = this.l0;
        if (webView2 == null) {
            webView2 = null;
        }
        webView2.setWebChromeClient(new npx0(this));
        ho().setNavigationOnClickListener(new mkc(4, webView2, this));
        CookieManager.getInstance().setAcceptThirdPartyCookies(webView2, true);
        WebSettings settings = webView2.getSettings();
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        settings.setCacheMode(-1);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptEnabled(true);
        ujx0 ujx0Var = this.n0;
        nr2.n(webView2, new rjx0(ujx0Var != null ? ujx0Var : null));
        this.m0 = (MaterialProgressBar) view.findViewById(R.id.horizontal_progress_toolbar);
        if (getArguments() != null) {
            String string = requireArguments().getString("refer");
            if (!TextUtils.isEmpty(string)) {
                if (requireArguments().getBoolean("site", false)) {
                    b.d dVar = new b.d("open_layer");
                    dVar.b(string, "ref");
                    dVar.e();
                } else {
                    b.d dVar2 = new b.d("open_wiki");
                    dVar2.b(string, "ref");
                    dVar2.e();
                }
            }
        }
        if (this.f0) {
            return;
        }
        qo();
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final void po() {
        this.o0 = requireArguments().getString("url", "");
        dsw<UserId, v390> dswVar = y390.a;
        v390 a2 = y390.a.a();
        String b2 = v390.b(this.o0, a2.c(a2.e));
        this.o0 = b2;
        ujx0 ujx0Var = this.n0;
        if (ujx0Var == null) {
            ujx0Var = null;
        }
        ujx0Var.c(b2, true);
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment
    public final View ro(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        WebView webView = new WebView(kn());
        webView.setId(R.id.webview);
        return webView;
    }

    @Override // me.grishka.appkit.fragments.LoaderFragment, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void h() {
    }
}
