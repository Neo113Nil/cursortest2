package com.yandex.passport.internal.ui.webview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.Settings;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.t0;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.core.accounts.p;
import com.yandex.passport.internal.ui.BaseActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import com.yandex.passport.internal.ui.webview.webcases.l;
import com.yandex.passport.internal.util.o;
import defpackage.cvu0;
import defpackage.ny61;
import defpackage.uw51;
import defpackage.vng;
import defpackage.zy11;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 +2\u00020\u0001:\u0002,-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0013\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/yandex/passport/internal/ui/webview/WebViewActivity;", "Lcom/yandex/passport/internal/ui/BaseActivity;", "<init>", "()V", "Landroid/view/Menu;", "menu", "Lzy11;", "filterUnsafeWebViewActions", "(Landroid/view/Menu;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/ActionMode;", "mode", "onActionModeStarted", "(Landroid/view/ActionMode;)V", "outState", "onSaveInstanceState", "onRestoreInstanceState", "onResume", "onPause", "onDestroy", "onBackPressed", "Landroid/content/res/Configuration;", "overrideConfiguration", "applyOverrideConfiguration", "(Landroid/content/res/Configuration;)V", "Lcom/yandex/passport/internal/ui/webview/d;", "viewController", "Lcom/yandex/passport/internal/ui/webview/d;", "Landroid/webkit/WebView;", "webView", "Landroid/webkit/WebView;", "Lcom/yandex/passport/internal/ui/webview/PassportWebViewClient;", "webViewClient", "Lcom/yandex/passport/internal/ui/webview/PassportWebViewClient;", "Lcom/yandex/passport/internal/ui/webview/webcases/l;", "webCase", "Lcom/yandex/passport/internal/ui/webview/webcases/l;", "Lcom/yandex/passport/internal/ui/webview/f;", "debugOverlay", "Lcom/yandex/passport/internal/ui/webview/f;", "Companion", "com/yandex/passport/internal/core/accounts/p", "com/yandex/passport/internal/ui/webview/b", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewActivity extends BaseActivity {
    public static final int $stable = 8;
    public static final b Companion = new b();
    public static final String KEY_ENVIRONMENT = "environment";
    public static final String KEY_SHOW_DEBUG_OVERLAY = "show-debug-overlay";
    public static final String KEY_THEME = "passport-theme";
    public static final String KEY_WEBVIEW_RESULT = "webview-result";
    public static final String KEY_WEB_CASE = "web-case";
    public static final String KEY_WEB_CASE_DATA = "web-case-data";
    private f debugOverlay;
    private d viewController;
    private l webCase;
    private WebView webView;
    private PassportWebViewClient webViewClient;

    public static final Intent createIntent(t0 t0Var, Context context, PassportTheme passportTheme, WebCaseType webCaseType, Bundle bundle) {
        Companion.getClass();
        return b.a(t0Var, context, passportTheme, webCaseType, bundle, false);
    }

    private final void filterUnsafeWebViewActions(Menu menu) {
        String str;
        int i = 0;
        while (menu.size() != 0 && i < menu.size()) {
            int itemId = menu.getItem(i).getItemId();
            if (itemId == 0) {
                menu.removeItem(itemId);
            } else {
                try {
                    str = getResources().getResourceName(itemId);
                } catch (Resources.NotFoundException unused) {
                    str = null;
                }
                if (str == null || !(cvu0.s(str, "copy", false) || cvu0.s(str, "select_all", false))) {
                    menu.removeItem(itemId);
                } else {
                    i++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$10(WebViewActivity webViewActivity, View view) {
        com.yandex.passport.internal.util.a.a(webViewActivity, new Intent("android.settings.SETTINGS"));
    }

    private static final zy11 onCreate$lambda$14(WebCaseType webCaseType, WebViewActivity webViewActivity, String str) {
        int i = c.a[webCaseType.ordinal()];
        if (i == 1) {
            WebView webView = webViewActivity.webView;
            if (webView == null) {
                webView = null;
            }
            l lVar = webViewActivity.webCase;
            webView.postUrl(str, (lVar != null ? lVar : null).c());
        } else if (i != 2) {
            WebView webView2 = webViewActivity.webView;
            (webView2 != null ? webView2 : null).loadUrl(str);
        } else {
            WebView webView3 = webViewActivity.webView;
            if (webView3 == null) {
                webView3 = null;
            }
            l lVar2 = webViewActivity.webCase;
            webView3.postUrl(str, (lVar2 != null ? lVar2 : null).c());
        }
        return zy11.a;
    }

    private static final void onCreate$lambda$16(WebViewActivity webViewActivity) {
        View rootView = webViewActivity.getWindow().getDecorView().getRootView();
        d dVar = webViewActivity.viewController;
        if (dVar == null) {
            dVar = null;
        }
        f fVar = new f(webViewActivity, dVar);
        PopupWindow popupWindow = fVar.h;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        fVar.h = null;
        PopupWindow popupWindow2 = new PopupWindow(fVar.j, -1, -1);
        popupWindow2.showAtLocation(rootView, 17, 0, 0);
        fVar.h = popupWindow2;
        webViewActivity.debugOverlay = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(WebViewActivity webViewActivity, View view) {
        PassportWebViewClient passportWebViewClient = webViewActivity.webViewClient;
        if (passportWebViewClient == null) {
            passportWebViewClient = null;
        }
        passportWebViewClient.onRetry();
        d dVar = webViewActivity.viewController;
        if (dVar == null) {
            dVar = null;
        }
        ((View) dVar.d.a).setVisibility(8);
        dVar.c.setVisibility(0);
        dVar.e.setVisibility(8);
        WebView webView = webViewActivity.webView;
        (webView != null ? webView : null).reload();
    }

    private static final void onCreate$lambda$8$lambda$7(View view) {
    }

    @Override // android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration overrideConfiguration) {
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onActionModeStarted(ActionMode mode) {
        super.onActionModeStarted(mode);
        if (Settings.Global.getInt(getContentResolver(), "device_provisioned", 0) != 1 || o.a()) {
            filterUnsafeWebViewActions(mode.getMenu());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        l lVar = this.webCase;
        if (lVar == null) {
            lVar = null;
        }
        com.yandex.passport.internal.ui.webview.webcases.a aVar = lVar instanceof com.yandex.passport.internal.ui.webview.webcases.a ? (com.yandex.passport.internal.ui.webview.webcases.a) lVar : null;
        if (aVar == null || !aVar.h) {
            WebView webView = this.webView;
            if (webView == null) {
                webView = null;
            }
            if (!webView.canGoBack()) {
                super.onBackPressed();
            } else {
                WebView webView2 = this.webView;
                (webView2 != null ? webView2 : null).goBack();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.view.View, android.widget.ProgressBar] */
    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        LottieAnimationView lottieAnimationView;
        super.onCreate(savedInstanceState);
        WebCaseType webCaseType = WebCaseType.values()[getIntent().getIntExtra(KEY_WEB_CASE, -1)];
        Bundle extras = getIntent().getExtras();
        final int i = 1;
        Bundle bundleExtra = (extras == null || !extras.containsKey(KEY_WEB_CASE_DATA)) ? null : getIntent().getBundleExtra(KEY_WEB_CASE_DATA);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        int intExtra = getIntent().getIntExtra(KEY_ENVIRONMENT, -1);
        if (intExtra == -1) {
            ny61.g("missing key KEY_ENVIRONMENT, did you forget to specify environment?");
            return;
        }
        Environment.Companion.getClass();
        this.webCase = com.yandex.passport.internal.di.a.a().getWebCaseFactory().a(this, com.yandex.passport.common.core.a.a(intExtra), webCaseType, bundleExtra);
        final int i2 = 0;
        if (o.a() && webCaseType != WebCaseType.VIEW_LEGAL) {
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.ERROR, null, "shouldDisableWebView() is true, exiting.", 8);
            }
            Toast.makeText(this, R.string.passport_error_track_invalid, 0).show();
            finish();
            return;
        }
        setContentView(R.layout.passport_activity_web_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
            Resources.Theme theme = getTheme();
            int i3 = R.attr.passportBackButtonDrawable;
            int i4 = R.drawable.passport_back;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(new int[]{i3});
            try {
                Drawable t = vng.t(obtainStyledAttributes.getResourceId(0, i4), this);
                obtainStyledAttributes.recycle();
                supportActionBar.r(t);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.webView = (WebView) findViewById(R.id.webview);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.container);
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) findViewById(R.id.lottie);
        lottieAnimationView2.setVisibility(8);
        ?? r7 = (ProgressBar) findViewById(R.id.progress);
        r7.setVisibility(8);
        l lVar = this.webCase;
        if ((lVar == null ? null : lVar) instanceof com.yandex.passport.internal.ui.webview.webcases.a) {
            if (lVar == null) {
                lVar = null;
            }
            Integer num = ((com.yandex.passport.internal.ui.webview.webcases.a) lVar).g;
            if (num != null) {
                constraintLayout.setBackground(getDrawable(num.intValue()));
            }
            l lVar2 = this.webCase;
            if (lVar2 == null) {
                lVar2 = null;
            }
            Integer num2 = ((com.yandex.passport.internal.ui.webview.webcases.a) lVar2).f;
            if (num2 != null) {
                lottieAnimationView2.setAnimation(num2.intValue());
                lottieAnimationView2.playAnimation();
            }
        }
        l lVar3 = this.webCase;
        if ((lVar3 == null ? null : lVar3) instanceof com.yandex.passport.internal.ui.webview.webcases.a) {
            if (lVar3 == null) {
                lVar3 = null;
            }
            if (((com.yandex.passport.internal.ui.webview.webcases.a) lVar3).f == null) {
                lottieAnimationView2 = r7;
            }
            lottieAnimationView = lottieAnimationView2;
        } else {
            lottieAnimationView = r7;
        }
        lottieAnimationView.setVisibility(0);
        p pVar = new p(findViewById(R.id.layout_error), (TextView) findViewById(R.id.text_error_message));
        WebView webView = this.webView;
        this.viewController = new d(constraintLayout, toolbar, lottieAnimationView, pVar, webView == null ? null : webView);
        findViewById(R.id.button_retry).setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.a
            public final /* synthetic */ WebViewActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i5 = i2;
                WebViewActivity webViewActivity = this.b;
                switch (i5) {
                    case 0:
                        WebViewActivity.onCreate$lambda$8(webViewActivity, view);
                        break;
                    case 1:
                        webViewActivity.onBackPressed();
                        break;
                    default:
                        WebViewActivity.onCreate$lambda$10(webViewActivity, view);
                        break;
                }
            }
        });
        View findViewById = findViewById(R.id.button_back);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.a
                public final /* synthetic */ WebViewActivity b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i5 = i;
                    WebViewActivity webViewActivity = this.b;
                    switch (i5) {
                        case 0:
                            WebViewActivity.onCreate$lambda$8(webViewActivity, view);
                            break;
                        case 1:
                            webViewActivity.onBackPressed();
                            break;
                        default:
                            WebViewActivity.onCreate$lambda$10(webViewActivity, view);
                            break;
                    }
                }
            });
        }
        l lVar4 = this.webCase;
        if (lVar4 == null) {
            lVar4 = null;
        }
        if (lVar4.e()) {
            View findViewById2 = findViewById(R.id.button_settings);
            if (findViewById2 != null) {
                final int i5 = 2;
                findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.yandex.passport.internal.ui.webview.a
                    public final /* synthetic */ WebViewActivity b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i52 = i5;
                        WebViewActivity webViewActivity = this.b;
                        switch (i52) {
                            case 0:
                                WebViewActivity.onCreate$lambda$8(webViewActivity, view);
                                break;
                            case 1:
                                webViewActivity.onBackPressed();
                                break;
                            default:
                                WebViewActivity.onCreate$lambda$10(webViewActivity, view);
                                break;
                        }
                    }
                });
            }
        } else {
            View findViewById3 = findViewById(R.id.button_settings);
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
        }
        l lVar5 = this.webCase;
        if (lVar5 == null) {
            lVar5 = null;
        }
        setTitle(lVar5.g(getResources()));
        displayHomeAsUp();
        WebView webView2 = this.webView;
        if (webView2 == null) {
            webView2 = null;
        }
        l lVar6 = this.webCase;
        if (lVar6 == null) {
            lVar6 = null;
        }
        d dVar = this.viewController;
        if (dVar == null) {
            dVar = null;
        }
        PassportWebViewClient passportWebViewClient = new PassportWebViewClient(this, lVar6, dVar, this.eventReporter);
        this.webViewClient = passportWebViewClient;
        webView2.setWebViewClient(passportWebViewClient);
        WebView webView3 = this.webView;
        if (webView3 == null) {
            webView3 = null;
        }
        WebSettings settings = webView3.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setUserAgentString(settings.getUserAgentString() + HexString.CHAR_SPACE + com.yandex.passport.common.web.a.b);
        settings.setDomStorageEnabled(true);
        WebView webView4 = this.webView;
        if (webView4 == null) {
            webView4 = null;
        }
        webView4.setLayerType(1, null);
        CookieManager cookieManager = CookieManager.getInstance();
        WebView webView5 = this.webView;
        if (webView5 == null) {
            webView5 = null;
        }
        cookieManager.setAcceptThirdPartyCookies(webView5, true);
        if (savedInstanceState == null) {
            if (webCaseType.getClearCookies()) {
                CookieManager cookieManager2 = CookieManager.getInstance();
                cookieManager2.removeAllCookies(null);
                cookieManager2.flush();
            }
            l lVar7 = this.webCase;
            if (lVar7 == null) {
                lVar7 = null;
            }
            String f = lVar7.f();
            com.yandex.passport.common.logger.c cVar2 = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                uw51.w("Open url: ", f, LogLevel.DEBUG, null, 8);
            }
            l lVar8 = this.webCase;
            if (lVar8 == null) {
                lVar8 = null;
            }
            onCreate$lambda$14(webCaseType, this, lVar8.f());
        }
        if (webCaseType == WebCaseType.VIEW_LEGAL) {
            WebView webView6 = this.webView;
            if (webView6 == null) {
                webView6 = null;
            }
            webView6.setFocusable(false);
            WebView webView7 = this.webView;
            if (webView7 == null) {
                webView7 = null;
            }
            webView7.setFocusableInTouchMode(false);
        }
        if (webCaseType == WebCaseType.AUTH_ON_TV) {
            toolbar.setVisibility(8);
            WebView webView8 = this.webView;
            if (webView8 == null) {
                webView8 = null;
            }
            webView8.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            WebView webView9 = this.webView;
            if (webView9 == null) {
                webView9 = null;
            }
            webView9.setBackgroundColor(Color.argb(1, 255, 255, 255));
            WebView webView10 = this.webView;
            if (webView10 == null) {
                webView10 = null;
            }
            webView10.setVisibility(4);
            WebView webView11 = this.webView;
            if (webView11 == null) {
                webView11 = null;
            }
            webView11.setVerticalScrollBarEnabled(false);
            WebView webView12 = this.webView;
            (webView12 != null ? webView12 : null).setHorizontalScrollBarEnabled(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (this.viewController != null) {
            WebView webView = this.webView;
            if (webView == null) {
                webView = null;
            }
            webView.destroy();
        }
        super.onDestroy();
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        WebView webView = this.webView;
        if (webView == null) {
            webView = null;
        }
        webView.onPause();
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        WebView webView = this.webView;
        if (webView == null) {
            webView = null;
        }
        webView.restoreState(savedInstanceState);
        super.onRestoreInstanceState(savedInstanceState);
    }

    @Override // com.yandex.passport.internal.ui.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        WebView webView = this.webView;
        if (webView == null) {
            webView = null;
        }
        webView.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        WebView webView = this.webView;
        if (webView == null) {
            webView = null;
        }
        webView.saveState(outState);
    }

    public static final Intent createIntent(t0 t0Var, Context context, PassportTheme passportTheme, WebCaseType webCaseType, Bundle bundle, boolean z) {
        Companion.getClass();
        return b.a(t0Var, context, passportTheme, webCaseType, bundle, z);
    }
}
