package com.yandex.passport.internal.ui.domik.samlsso;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.R;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Screen;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.flags.experiments.h;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.ui.base.BaseNextFragment;
import com.yandex.passport.internal.ui.base.l;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.base.BaseDomikFragment;
import com.yandex.passport.internal.ui.o;
import com.yandex.passport.internal.ui.util.j;
import com.yandex.passport.internal.util.p;
import defpackage.ds31;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qx60;
import defpackage.tje;
import defpackage.w511;
import defpackage.xx60;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

@Metadata(d1 = {"\u0000\u008b\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00019\b\u0001\u0018\u0000 A2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0005J-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010%\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u000bH\u0014¢\u0006\u0004\b,\u0010-R\u001b\u00102\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020<8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0018\u0010@\u001a\u00020+*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010-¨\u0006C"}, d2 = {"Lcom/yandex/passport/internal/ui/domik/samlsso/SamlSsoAuthFragment;", "Lcom/yandex/passport/internal/ui/domik/base/BaseDomikFragment;", "Lcom/yandex/passport/internal/ui/domik/samlsso/g;", "Lcom/yandex/passport/internal/ui/domik/AuthTrack;", "<init>", "()V", "Landroid/net/Uri;", "authUri", "Lzy11;", "proceedAuth", "(Landroid/net/Uri;)V", "", CRLReasonCodeExtension.REASON, "showError", "(Ljava/lang/String;)V", "closeFragment", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;", "component", "createViewModel", "(Lcom/yandex/passport/internal/di/component/PassportProcessGlobalComponent;)Lcom/yandex/passport/internal/ui/domik/samlsso/g;", "", "requestCode", "resultCode", "Landroid/content/Intent;", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "getScreenId", "()Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", ErrorResponseData.JSON_ERROR_CODE, "", "isFieldErrorSupported", "(Ljava/lang/String;)Z", "authUrl$delegate", "Li3y;", "getAuthUrl", "()Ljava/lang/String;", "authUrl", "Landroid/webkit/WebView;", "webview", "Landroid/webkit/WebView;", "Landroid/widget/ProgressBar;", "progress", "Landroid/widget/ProgressBar;", "com/yandex/passport/internal/ui/domik/samlsso/SamlSsoAuthFragment$webViewClient$1", "webViewClient", "Lcom/yandex/passport/internal/ui/domik/samlsso/SamlSsoAuthFragment$webViewClient$1;", "Lcom/yandex/passport/internal/ui/domik/samlsso/f;", "getAuthListener", "()Lcom/yandex/passport/internal/ui/domik/samlsso/f;", "authListener", "isAuthRedirectUrl", "Companion", "com/yandex/passport/internal/ui/domik/samlsso/e", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SamlSsoAuthFragment extends BaseDomikFragment<g, AuthTrack> {
    public static final int $stable = 8;
    public static final e Companion = new e();
    public static final String FRAGMENT_TAG = "SamlSsoAuthFragment";
    private ProgressBar progress;
    private WebView webview;

    /* renamed from: authUrl$delegate, reason: from kotlin metadata */
    private final i3y authUrl = kotlin.a.a(new h(19, this));
    private final SamlSsoAuthFragment$webViewClient$1 webViewClient = new WebViewClient() { // from class: com.yandex.passport.internal.ui.domik.samlsso.SamlSsoAuthFragment$webViewClient$1
        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            boolean isAuthRedirectUrl;
            com.yandex.passport.internal.ui.base.h hVar;
            super.onPageFinished(view, url);
            if (url == null) {
                return;
            }
            isAuthRedirectUrl = SamlSsoAuthFragment.this.isAuthRedirectUrl(url);
            if (isAuthRedirectUrl) {
                hVar = ((BaseNextFragment) SamlSsoAuthFragment.this).viewModel;
                g gVar = (g) hVar;
                String valueOf = String.valueOf(gVar.F);
                CookieManager.getInstance().flush();
                String cookie = CookieManager.getInstance().getCookie(valueOf);
                if (cookie == null) {
                    com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "Cookies parse error, url: ".concat(url), 8);
                        return;
                    }
                    return;
                }
                com.yandex.passport.internal.entities.d dVar = Cookie.Companion;
                PassportEnvironmentImpl y = p.y(p.u(gVar.B.getFilter().getPrimaryEnvironment()));
                dVar.getClass();
                Cookie cookie2 = new Cookie(PassportEnvironmentImpl.from(y), null, null, "https://yandex.ru/", cookie);
                AuthTrack authTrack = gVar.G;
                gVar.c.m(Boolean.TRUE);
                tje.N(ds31.a(gVar), null, null, new SamlSsoAuthViewModel$authorizeByCookie$1(gVar, cookie2, authTrack, null), 3);
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final String authUrl_delegate$lambda$0(SamlSsoAuthFragment samlSsoAuthFragment) {
        String string;
        Bundle arguments = samlSsoAuthFragment.getArguments();
        if (arguments != null && (string = arguments.getString("auth_url_param")) != null) {
            return string;
        }
        ny61.r("auth url is missing");
        return null;
    }

    private final void closeFragment() {
        qx60 onBackPressedDispatcher;
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.c();
    }

    private final f getAuthListener() {
        xx60 activity = getActivity();
        f fVar = activity instanceof f ? (f) activity : null;
        if (fVar != null) {
            return fVar;
        }
        ny61.r("SamlSsoAuthListener is not presented");
        return null;
    }

    private final String getAuthUrl() {
        return (String) this.authUrl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAuthRedirectUrl(String str) {
        return jl40.l(str, com.yandex.passport.common.browser.c.b(requireContext()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$3(SamlSsoAuthFragment samlSsoAuthFragment, l lVar) {
        samlSsoAuthFragment.startActivityForResult(lVar.a(samlSsoAuthFragment.requireContext()), lVar.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$4(SamlSsoAuthFragment samlSsoAuthFragment, c cVar) {
        if (cVar instanceof b) {
            samlSsoAuthFragment.proceedAuth(((b) cVar).a);
        } else if (!(cVar instanceof a)) {
            w511.b();
        } else {
            samlSsoAuthFragment.showError(((a) cVar).a);
            samlSsoAuthFragment.closeFragment();
        }
    }

    private final void proceedAuth(Uri authUri) {
        WebView webView = this.webview;
        if (webView == null) {
            webView = null;
        }
        webView.loadUrl(authUri.toString());
    }

    private final void showError(String reason) {
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, reason, 8);
        }
    }

    @Override // com.yandex.passport.internal.ui.base.BaseNextFragment
    public g createViewModel(PassportProcessGlobalComponent component) {
        return new g(((AuthTrack) this.currentTrack).getProperties(), component.getContextUtils(), component.getClientChooser(), component.getAuthByCookieUseCase(), getAuthListener());
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public DomikStatefulReporter$Screen getScreenId() {
        return DomikStatefulReporter$Screen.SAML_SSO_AUTH;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment
    public boolean isFieldErrorSupported(String errorCode) {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        g gVar = (g) this.viewModel;
        com.yandex.passport.internal.ui.util.l lVar = gVar.I;
        LoginProperties loginProperties = gVar.B;
        if (requestCode == 1505) {
            if (resultCode != -1 || data == null) {
                lVar.m(a.b);
                return;
            }
            Uri data2 = data.getData();
            String queryParameter = data2 != null ? data2.getQueryParameter("track_id") : null;
            if (queryParameter == null) {
                lVar.m(a.d);
                return;
            }
            com.yandex.passport.internal.network.client.e b = gVar.C.b(p.u(loginProperties.getFilter().getPrimaryEnvironment()));
            Uri build = Uri.parse(((com.yandex.passport.internal.network.l) b.c).f(b.b, null, null)).buildUpon().appendEncodedPath("auth/session").appendQueryParameter("track_id", queryParameter).build().buildUpon().appendQueryParameter("keep_track", "1").build();
            gVar.F = build;
            gVar.G = com.yandex.passport.internal.ui.domik.c.b(AuthTrack.Companion, loginProperties).withTrackId(queryParameter);
            lVar.m(new b(build));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.passport_fragment_saml_sso_auth, container, false);
        this.progress = (ProgressBar) inflate.findViewById(R.id.progress);
        WebView webView = (WebView) inflate.findViewById(R.id.webview);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        StringBuilder sb = new StringBuilder();
        sb.append(settings.getUserAgentString());
        sb.append(HexString.CHAR_SPACE);
        String str = com.yandex.passport.common.web.a.a;
        sb.append(com.yandex.passport.common.web.a.b);
        settings.setUserAgentString(sb.toString());
        settings.setDomStorageEnabled(true);
        this.webview = webView;
        CookieManager cookieManager = CookieManager.getInstance();
        WebView webView2 = this.webview;
        if (webView2 == null) {
            webView2 = null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView2, true);
        WebView webView3 = this.webview;
        if (webView3 == null) {
            webView3 = null;
        }
        webView3.setWebViewClient(this.webViewClient);
        Context requireContext = requireContext();
        ProgressBar progressBar = this.progress;
        com.yandex.passport.legacy.d.b(requireContext, progressBar != null ? progressBar : null, R.color.passport_progress_bar);
        return inflate;
    }

    @Override // com.yandex.passport.internal.ui.domik.base.BaseDomikFragment, com.yandex.passport.internal.ui.base.BaseNextFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            g gVar = (g) this.viewModel;
            Context requireContext = requireContext();
            String authUrl = getAuthUrl();
            gVar.getClass();
            try {
                gVar.H.m(new l(new o(5, requireContext, Uri.parse(authUrl).buildUpon().appendQueryParameter("redirect_url", com.yandex.passport.common.browser.c.b(requireContext)).build()), 1505));
            } catch (UnsupportedOperationException e) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "can't create auth url", e);
                }
                gVar.I.m(new a(authUrl.concat(" malformed")));
            }
        }
        final int i = 0;
        ((g) this.viewModel).H.n(getViewLifecycleOwner(), new j(this) { // from class: com.yandex.passport.internal.ui.domik.samlsso.d
            public final /* synthetic */ SamlSsoAuthFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i2 = i;
                SamlSsoAuthFragment samlSsoAuthFragment = this.b;
                switch (i2) {
                    case 0:
                        SamlSsoAuthFragment.onViewCreated$lambda$3(samlSsoAuthFragment, (l) obj);
                        break;
                    default:
                        SamlSsoAuthFragment.onViewCreated$lambda$4(samlSsoAuthFragment, (c) obj);
                        break;
                }
            }
        });
        final int i2 = 1;
        ((g) this.viewModel).I.n(getViewLifecycleOwner(), new j(this) { // from class: com.yandex.passport.internal.ui.domik.samlsso.d
            public final /* synthetic */ SamlSsoAuthFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.pq60
            public final void a(Object obj) {
                int i22 = i2;
                SamlSsoAuthFragment samlSsoAuthFragment = this.b;
                switch (i22) {
                    case 0:
                        SamlSsoAuthFragment.onViewCreated$lambda$3(samlSsoAuthFragment, (l) obj);
                        break;
                    default:
                        SamlSsoAuthFragment.onViewCreated$lambda$4(samlSsoAuthFragment, (c) obj);
                        break;
                }
            }
        });
    }
}
