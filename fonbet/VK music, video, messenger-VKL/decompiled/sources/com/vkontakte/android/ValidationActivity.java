package com.vkontakte.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.X3;
import com.vk.billing.PurchasesManagerComponent;
import com.vk.billing.SberpayPurchasesManager;
import com.vk.billing.StorePurchasesManager;
import com.vk.common.links.LaunchContext;
import com.vk.core.preference.Preference;
import com.vk.core.view.FitSystemWindowsFrameLayout;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.pushes.PushComponent;
import com.vk.pushes.PushOpenActivity;
import com.vk.superapp.core.api.models.BanInfo;
import com.vk.webapp.fragments.HelpFragment;
import com.vkontakte.android.activities.TabletsDialogActivity;
import ru.ok.android.sdk.SharedKt;
import xsna.a0a;
import xsna.b25;
import xsna.b6m;
import xsna.be50;
import xsna.bir0;
import xsna.cuz;
import xsna.cvk;
import xsna.d3r0;
import xsna.dhr0;
import xsna.dir0;
import xsna.dsw;
import xsna.h7r0;
import xsna.j6i;
import xsna.jsb0;
import xsna.kh10;
import xsna.lm70;
import xsna.m7m;
import xsna.m8f0;
import xsna.mbw;
import xsna.mge0;
import xsna.mnh0;
import xsna.naz;
import xsna.ner0;
import xsna.nge0;
import xsna.nr2;
import xsna.o25;
import xsna.oge0;
import xsna.qge0;
import xsna.ril0;
import xsna.rjx0;
import xsna.rsg0;
import xsna.t200;
import xsna.u1u0;
import xsna.ujx0;
import xsna.um70;
import xsna.v390;
import xsna.w83;
import xsna.xwk;
import xsna.y390;

/* loaded from: classes7.dex */
public class ValidationActivity extends TabletsDialogActivity {
    public static volatile int H = 0;
    public static boolean I = false;
    public oge0 A;
    public WebView C;
    public ner0 D;

    @Nullable
    public qge0 B = null;
    public final d E = new d();
    public final b25 F = o25.a();
    public SberpayPurchasesManager.SberpayUriHandleResult G = SberpayPurchasesManager.SberpayUriHandleResult.IRRELEVANT;

    public class a implements DownloadListener {
        public a() {
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            LaunchContext.a aVar = new LaunchContext.a();
            aVar.l = LaunchContext.ActivityNextState.ALIVE;
            xwk.d().e().l(ValidationActivity.this, str, aVar.a(), null, null);
        }
    }

    public class c extends bir0 {

        public class a extends dir0 {
            public a() {
            }

            @Override // xsna.dir0, android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                ValidationActivity.this.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str)));
                webView.destroy();
                return true;
            }
        }

        public c() {
        }

        @Override // xsna.bir0, android.webkit.WebChromeClient
        public final void onCloseWindow(WebView webView) {
            if (ValidationActivity.H == 0 && !ValidationActivity.this.getIntent().getBooleanExtra("return_result", false)) {
                ValidationActivity.H = 1;
            }
            ValidationActivity.this.finish();
        }

        @Override // xsna.bir0, android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
            WebView webView2 = new WebView(webView.getContext());
            nr2.n(webView2, new a());
            webViewTransport.setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        @Override // xsna.bir0, android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            boolean z = i < 100;
            ValidationActivity validationActivity = ValidationActivity.this;
            ner0 ner0Var = validationActivity.D;
            if (ner0Var == null || z == ner0Var.isShowing()) {
                return;
            }
            if (z) {
                u1u0.o(ner0Var);
            } else {
                u1u0.b(ner0Var);
                validationActivity.D = null;
            }
        }
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            ValidationActivity.this.finish();
        }
    }

    public static Intent U1(PushOpenActivity pushOpenActivity, String str, String str2) {
        Intent intent = new Intent(pushOpenActivity, (Class<?>) ValidationActivity.class);
        intent.putExtra("url", str);
        intent.putExtra("device_token", str2);
        return intent;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        qge0 qge0Var = this.B;
        if (qge0Var != null) {
            qge0Var.i(i, i2);
        }
    }

    @Override // com.vkontakte.android.VKActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        WebView webView = this.C;
        if (webView != null && webView.canGoBack()) {
            this.C.goBack();
            return;
        }
        if (H == 0 && !getIntent().getBooleanExtra("return_result", false)) {
            H = 1;
        }
        super.onBackPressed();
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        I = true;
        setFinishOnTouchOutside(false);
        dhr0.r0(this);
        dhr0.v0(this);
        String stringExtra = getIntent().getStringExtra("url");
        String stringExtra2 = getIntent().getStringExtra("ref_url");
        this.C = new WebView(this);
        ujx0 ujx0Var = new ujx0(this.C, ujx0.a.a());
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().sync();
        this.C.getSettings().setDomStorageEnabled(true);
        this.C.getSettings().setJavaScriptEnabled(true);
        if (!stringExtra.contains("payments")) {
            this.C.getSettings().setSupportMultipleWindows(true);
        }
        this.A = ((PurchasesManagerComponent) j6i.b(m7m.a(this), PurchasesManagerComponent.class)).J7();
        this.C.setDownloadListener(new a());
        dsw<UserId, v390> dswVar = y390.a;
        v390 a2 = y390.a.a();
        String b2 = v390.b(stringExtra, a2.c(a2.g));
        this.C.setWebViewClient(new b(ujx0Var, b2, stringExtra2));
        this.C.setWebChromeClient(new c());
        ujx0Var.c(b2, naz.j(Uri.parse(b2)));
        this.C.setBackgroundResource(R.color.cards_bg);
        FitSystemWindowsFrameLayout fitSystemWindowsFrameLayout = new FitSystemWindowsFrameLayout(this, null);
        fitSystemWindowsFrameLayout.setId(R.id.fragment_wrapper);
        fitSystemWindowsFrameLayout.addView(this.C);
        setContentView(fitSystemWindowsFrameLayout);
        ner0 ner0Var = new ner0(this);
        this.D = ner0Var;
        ner0Var.setMessage(getString(R.string.loading));
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (H == 0) {
            H = 1;
        }
        cuz.a(this).d(this.E);
        WebView webView = this.C;
        if (webView != null) {
            webView.setWebChromeClient(null);
            this.C.setWebViewClient(null);
            this.C.destroy();
            this.C = null;
        }
        I = false;
    }

    @Override // com.vkontakte.android.VKActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((PushComponent) j6i.b(m7m.a(this), PushComponent.class)).sc().c();
        cuz.a(this).b(this.E, new IntentFilter("CLOSE_VALIDATION_ACTION"));
    }

    public class b extends rjx0 {
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ujx0 ujx0Var, String str, String str2) {
            super(ujx0Var);
            this.f = str;
            this.g = str2;
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void doUpdateVisitedHistory(@Nullable WebView webView, @Nullable String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
            if (str == null || webView == null) {
                return;
            }
            WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
            if (copyBackForwardList.getCurrentIndex() <= 0) {
                return;
            }
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(copyBackForwardList.getItemAtIndex(copyBackForwardList.getCurrentIndex() - 1).getUrl());
            if (parse.getHost() == null || parse.getPath() == null || parse2.getHost() == null || parse2.getPath() == null) {
                return;
            }
            boolean z2 = parse2.getHost().contains(a0a.d) && parse2.getPath().contains("/activation");
            boolean z3 = parse.getHost().contains(a0a.d) && parse.getPath().contains("/menu");
            boolean z4 = parse.getHost().contains(a0a.d) && parse.getPath().contains("/auth");
            if (z2) {
                if (z3 || z4) {
                    boolean booleanExtra = ValidationActivity.this.getIntent().getBooleanExtra("return_result", false);
                    if (ValidationActivity.H == 0 && booleanExtra) {
                        ValidationActivity.H = 1;
                    }
                    ValidationActivity.this.finish();
                }
            }
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            CookieSyncManager.getInstance().sync();
            Uri parse = Uri.parse(str);
            if (ValidationActivity.this.getIntent().hasExtra("phone") && "m.".concat(a0a.d).equals(parse.getHost()) && "/restore".equals(parse.getPath()) && parse.getQueryParameter("rh") != null) {
                ValidationActivity.this.C.loadUrl("javascript:document.getElementsByTagName('input')[0].value='" + ValidationActivity.this.getIntent().getStringExtra("phone") + "';void(0);");
            }
        }

        @Override // xsna.dir0, android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            StringBuilder a2 = kh10.a(i, "ValidationActivity webViewError ", ": ", str, " failingUrl = ");
            a2.append(str2);
            L.l(a2.toString());
            Intent intent = new Intent();
            intent.putExtra("error", "connection_lost");
            ValidationActivity validationActivity = ValidationActivity.this;
            validationActivity.setResult(0, intent);
            validationActivity.finish();
        }

        @Override // xsna.rjx0, xsna.dir0, android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Uri parse = Uri.parse(str);
            if (!super.shouldOverrideUrlLoading(webView, str)) {
                ValidationActivity validationActivity = ValidationActivity.this;
                validationActivity.G = validationActivity.A.a(validationActivity.i, parse, validationActivity.C, this.f, validationActivity.G);
                if (ValidationActivity.this.G == SberpayPurchasesManager.SberpayUriHandleResult.IRRELEVANT) {
                    w83 w83Var = null;
                    if (naz.u(parse) && "purchases_googleplay".equals(parse.getHost())) {
                        String queryParameter = parse.getQueryParameter("type");
                        int b = d3r0.b(parse.getQueryParameter("id"));
                        ril0 ril0Var = new ril0();
                        ril0Var.C(b, "product_id");
                        ril0Var.K("type", queryParameter);
                        ril0Var.p = true;
                        ValidationActivity.this.p.b(rsg0.y0(ril0Var, null, null, 3).subscribe(new be50(this, 21), new jsb0(this, 15)));
                        return true;
                    }
                    if (!mnh0.p(parse)) {
                        if (str.contains(a0a.d.concat("/support")) && ValidationActivity.this.getIntent().getParcelableExtra("ban_info") != null) {
                            BanInfo banInfo = (BanInfo) ValidationActivity.this.getIntent().getParcelableExtra("ban_info");
                            ValidationActivity validationActivity2 = ValidationActivity.this;
                            String str2 = banInfo.c;
                            String str3 = banInfo.d;
                            int i = HelpFragment.a0;
                            HelpFragment.b.d(validationActivity2, str2, str3, null);
                            return true;
                        }
                        if (str.contains(a0a.d.concat("/settings"))) {
                            Uri parse2 = Uri.parse(str);
                            String str4 = this.g;
                            if (str4 != null) {
                                parse2 = parse2.buildUpon().appendQueryParameter("ref", str4).build();
                            }
                            webView.loadUrl(parse2.toString());
                            return true;
                        }
                        mbw.a.getClass();
                        if (!mbw.c().getBoolean("is_sbp_dialog_enabled", false) || !um70.a(parse)) {
                            webView.loadUrl(str);
                            return true;
                        }
                        L.e("NSPK", "Load URL: ".concat(str));
                        int i2 = lm70.l1;
                        lm70.a.a(parse).Td(ValidationActivity.this.getSupportFragmentManager(), parse.toString());
                        return true;
                    }
                    Uri parse3 = Uri.parse(str.replace('#', '?'));
                    if (ValidationActivity.this.getIntent().getBooleanExtra("return_result", false)) {
                        if (parse3.getQueryParameter("success") != null) {
                            Intent intent = new Intent();
                            if (parse3.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN) != null) {
                                intent.putExtra(SharedKt.PARAM_ACCESS_TOKEN, parse3.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN));
                                intent.putExtra("secret", parse3.getQueryParameter("secret"));
                                intent.putExtra("user_id", Integer.parseInt(parse3.getQueryParameter("user_id")));
                            }
                            intent.putExtra("authState", ValidationActivity.this.getIntent().getParcelableExtra("authState"));
                            intent.setData(parse3);
                            ValidationActivity.this.setResult(-1, intent);
                        } else if (!ValidationActivity.this.getIntent().getBooleanExtra("require_access_token", false) || parse3.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN) == null) {
                            Intent intent2 = new Intent();
                            String queryParameter2 = parse3.getQueryParameter("error_description");
                            intent2.putExtra("error", queryParameter2);
                            L.l("Validation Activity error: " + queryParameter2);
                            ValidationActivity.this.setResult(0, intent2);
                        } else {
                            Intent intent3 = new Intent();
                            intent3.putExtra(SharedKt.PARAM_ACCESS_TOKEN, parse3.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN));
                            intent3.setData(parse3);
                            ValidationActivity.this.setResult(-1, intent3);
                        }
                        ValidationActivity.this.finish();
                        return true;
                    }
                    if (parse3.getQueryParameter(X3.g.e) != null) {
                        L.e("Validation fail");
                        b25 b25Var = ValidationActivity.this.F;
                        b25Var.O(new t200(b25Var.c(), "validation_failed", null, true, false, true));
                        ValidationActivity.H = 1;
                        ValidationActivity.this.finish();
                        return true;
                    }
                    if (parse3.getQueryParameter("cancel") != null) {
                        ValidationActivity.H = 1;
                        ValidationActivity.this.finish();
                        return true;
                    }
                    if (parse3.getQueryParameter("success") != null) {
                        if (ValidationActivity.this.getIntent().hasExtra("device_token")) {
                            String stringExtra = ValidationActivity.this.getIntent().getStringExtra("device_token");
                            UserId c = ValidationActivity.this.F.c();
                            if (parse3.getQueryParameter("user_id") != null) {
                                c = new UserId(Long.parseLong(parse3.getQueryParameter("user_id")));
                            }
                            long j = c.b;
                            synchronized (b6m.class) {
                                String str5 = m8f0.a;
                                synchronized (m8f0.class) {
                                    w83 w83Var2 = m8f0.c;
                                    if (w83Var2 != null) {
                                        w83Var = w83Var2;
                                    }
                                    w83Var.getClass();
                                    Preference.l().edit().putString("device_token" + j, stringExtra).apply();
                                }
                            }
                        }
                        if (parse3.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN) != null) {
                            String queryParameter3 = parse3.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN);
                            String queryParameter4 = parse3.getQueryParameter("secret");
                            UserId userId = new UserId(Long.parseLong(parse3.getQueryParameter("user_id")));
                            String queryParameter5 = parse3.getQueryParameter(SharedKt.PARAM_EXPIRES_IN);
                            int parseInt = queryParameter5 != null ? Integer.parseInt(queryParameter5) : ValidationActivity.this.F.I();
                            if (!ValidationActivity.this.F.a(userId)) {
                                L.e("Current user is not current");
                                b25 b25Var2 = ValidationActivity.this.F;
                                b25Var2.O(new t200(b25Var2.c(), "validation_user_changed", null, true, false, true));
                            } else if (queryParameter3 == null || queryParameter4 == null) {
                                L.G("error! empty token or secret!");
                            } else {
                                ValidationActivity.this.F.t(new h7r0(parseInt, System.currentTimeMillis(), ValidationActivity.this.F.v(), userId, queryParameter3, queryParameter4));
                            }
                        }
                        ValidationActivity.H = 2;
                        ValidationActivity.this.finish();
                    }
                }
            }
            return true;
        }

        public class a implements StorePurchasesManager.a<mge0> {
            public a() {
            }

            @Override // com.vk.billing.StorePurchasesManager.a
            public final void a() {
                cvk.u(R.string.purchase_cancelled, false);
            }

            @Override // com.vk.billing.StorePurchasesManager.a
            public final void c(mge0 mge0Var, nge0 nge0Var) {
                Intent intent = new Intent();
                intent.putExtra(SharedKt.PARAM_ACCESS_TOKEN, ValidationActivity.this.F.h());
                ValidationActivity.this.setResult(-1, intent);
                ValidationActivity.H = 2;
                ValidationActivity.this.finish();
            }

            @Override // com.vk.billing.StorePurchasesManager.a
            public final void d(mge0 mge0Var) {
                Intent intent = new Intent();
                intent.putExtra(SharedKt.PARAM_ACCESS_TOKEN, ValidationActivity.this.F.h());
                ValidationActivity.this.setResult(0, intent);
                ValidationActivity.H = 1;
                ValidationActivity.this.finish();
            }

            @Override // com.vk.billing.StorePurchasesManager.a
            public final void b() {
            }
        }
    }
}
