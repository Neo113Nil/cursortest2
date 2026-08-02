package com.vkontakte.android;

import android.content.Intent;
import android.content.pm.Signature;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.main.AuthActivity;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.pushes.PushAwareActivity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.ok.android.sdk.SharedKt;
import xsna.a0a;
import xsna.bir0;
import xsna.cvk;
import xsna.dsw;
import xsna.dy2;
import xsna.er;
import xsna.iah0;
import xsna.kpe0;
import xsna.mnh0;
import xsna.o25;
import xsna.p90;
import xsna.ply;
import xsna.q6r0;
import xsna.v390;
import xsna.xhr0;
import xsna.y390;

/* loaded from: classes7.dex */
public class SDKAuthActivity extends PushAwareActivity {
    public static final /* synthetic */ int y = 0;
    public WebView v;
    public ProgressBar w;
    public FrameLayout x;

    public class a implements View.OnLongClickListener {
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return true;
        }
    }

    public class b extends bir0 {
        public b() {
        }

        @Override // xsna.bir0, android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            boolean z = i < 100;
            SDKAuthActivity sDKAuthActivity = SDKAuthActivity.this;
            if (z != (sDKAuthActivity.w.getVisibility() == 0)) {
                if (z) {
                    sDKAuthActivity.w.setVisibility(0);
                } else {
                    sDKAuthActivity.w.setVisibility(8);
                }
            }
            sDKAuthActivity.v.setVisibility(z ? 8 : 0);
        }
    }

    public final void T1() {
        String action = getIntent().getAction();
        if (action == null) {
            L.r(L.LogType.e, "SDKAuthActivity", "action is null, called RESULT_CANCELED");
            U1(0, null);
            return;
        }
        if (!action.equals("com.vkontakte.android.action.SDK_AUTH")) {
            setResult(0);
            finish();
            return;
        }
        this.v.setWebViewClient(new c());
        String callingPackage = getCallingPackage();
        StringBuilder sb = new StringBuilder("");
        try {
            Signature signature = dy2.f(callingPackage, 64).signatures[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            messageDigest.update(signature.toByteArray());
            for (byte b2 : messageDigest.digest()) {
                sb.append(String.format("%02X", Byte.valueOf(b2)));
            }
        } catch (Exception e) {
            L.C("vk_sdk_auth", e);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("client_id", getIntent().getIntExtra("client_id", 0) + "");
        linkedHashMap.put(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, getIntent().getStringExtra(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL));
        linkedHashMap.put("redirect_uri", "https://oauth.vk.com/blank.html");
        linkedHashMap.put("display", "android");
        linkedHashMap.put(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "token");
        linkedHashMap.put(SharedKt.PARAM_ACCESS_TOKEN, o25.a().h());
        linkedHashMap.put("sdk_package", callingPackage);
        linkedHashMap.put("sdk_fingerprint", sb.toString());
        linkedHashMap.put("lang", ply.a());
        if (getIntent().hasExtra("revoke")) {
            linkedHashMap.put("revoke", "1");
        }
        kpe0 kpe0Var = kpe0.a;
        String v = q6r0.f().v();
        Map map = Collections.EMPTY_MAP;
        kpe0Var.getClass();
        String builder = er.a(HttpRequest.DEFAULT_SCHEME).authority("oauth.".concat(a0a.d)).path("/authorize").encodedQuery(kpe0.e("/authorize", linkedHashMap, v, map)).toString();
        dsw<UserId, v390> dswVar = y390.a;
        v390 a2 = y390.a.a();
        this.v.loadUrl(v390.b(builder, a2.c(a2.f)));
    }

    public final void U1(int i, String str) {
        this.v.setVisibility(8);
        this.x.setVisibility(8);
        Intent intent = new Intent();
        intent.putExtra("vw_login_error", i);
        intent.putExtra("error", str);
        setResult(0, intent);
        finish();
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (i2 == -1) {
                T1();
            } else {
                setResult(0);
                finish();
            }
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getCallingPackage() == null && "com.vkontakte.android.action.SDK_AUTH".equals(getIntent().getAction())) {
            cvk.w("Be sure to call this using startActivityForResult()", false);
            finish();
            return;
        }
        this.w = new ProgressBar(this);
        FrameLayout frameLayout = new FrameLayout(this);
        this.x = frameLayout;
        frameLayout.setBackgroundColor(-1);
        p90.c(this, this.x, -1, true);
        try {
            WebView webView = new WebView(this);
            this.v = webView;
            webView.setWebChromeClient(new b());
            this.v.getSettings().setJavaScriptEnabled(true);
            this.v.setOnLongClickListener(new a());
            this.v.setLongClickable(false);
            this.x.addView(this.v);
            this.x.addView(this.w, new FrameLayout.LayoutParams(iah0.a(40.0f), iah0.a(40.0f), 17));
            setContentView(this.x);
            this.v.setVisibility(8);
            if (q6r0.f().A()) {
                T1();
            } else {
                startActivityForResult(new Intent(this, (Class<?>) AuthActivity.class), 100);
            }
        } catch (Throwable unused) {
            cvk.u(R.string.vk_error_no_browser, false);
            finish();
        }
    }

    public class c extends WebViewClient {
        public c() {
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            L.G("vk_sdk_auth", i + StringUtils.PROCESS_POSTFIX_DELIMITER + str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2);
            if (TextUtils.equals(webView.getUrl(), str2)) {
                int i2 = SDKAuthActivity.y;
                SDKAuthActivity.this.U1(i, null);
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url = sslError.getUrl();
            if (url != null && !url.isEmpty()) {
                dsw<UserId, v390> dswVar = y390.a;
                if (y390.a.a().d(url)) {
                    L.e("WebClient: skip SSL for ".concat(url));
                    sslErrorHandler.proceed();
                    return;
                }
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!mnh0.p(Uri.parse(str))) {
                webView.loadUrl(str);
                return true;
            }
            Uri parse = Uri.parse(str.replace('#', '?'));
            String queryParameter = parse.getQueryParameter("error");
            SDKAuthActivity sDKAuthActivity = SDKAuthActivity.this;
            if (queryParameter != null) {
                L.G("vk_sdk_auth", "Auth not successful [fail]: ".concat(str));
                String queryParameter2 = parse.getQueryParameter("error");
                int i = SDKAuthActivity.y;
                sDKAuthActivity.U1(0, queryParameter2);
                return true;
            }
            if (parse.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN) == null) {
                L.G("vk_sdk_auth", "Auth not successful [unknown]: ".concat(str));
                int i2 = SDKAuthActivity.y;
                sDKAuthActivity.U1(0, null);
                return true;
            }
            String queryParameter3 = parse.getQueryParameter(SharedKt.PARAM_ACCESS_TOKEN);
            String queryParameter4 = parse.getQueryParameter("secret");
            String queryParameter5 = parse.getQueryParameter(SharedKt.PARAM_EXPIRES_IN);
            String queryParameter6 = parse.getQueryParameter("email");
            String queryParameter7 = parse.getQueryParameter("phone");
            String queryParameter8 = parse.getQueryParameter("phoneAccessKey");
            long parseLong = Long.parseLong(parse.getQueryParameter("user_id"));
            Intent intent = new Intent();
            intent.putExtra(SharedKt.PARAM_ACCESS_TOKEN, queryParameter3);
            if (queryParameter4 != null) {
                intent.putExtra("secret", queryParameter4);
            }
            if (queryParameter6 != null) {
                intent.putExtra("email", queryParameter6);
            }
            if (queryParameter7 != null) {
                intent.putExtra("phone", queryParameter7);
            }
            if (queryParameter8 != null) {
                intent.putExtra("phone_access_key", queryParameter8);
            }
            intent.putExtra("user_id", parseLong);
            intent.putExtra("https_required", "1");
            if (queryParameter5 != null) {
                try {
                    intent.putExtra(SharedKt.PARAM_EXPIRES_IN, Integer.parseInt(queryParameter5));
                } catch (Exception unused) {
                }
            }
            for (Map.Entry entry : xhr0.a(str.substring(str.indexOf("#") + 1)).entrySet()) {
                String str2 = (String) entry.getKey();
                if (!intent.hasExtra(str2)) {
                    intent.putExtra(str2, (String) entry.getValue());
                }
            }
            L.p("vk_sdk_auth", "Auth ok");
            sDKAuthActivity.setResult(-1, intent);
            sDKAuthActivity.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            int i;
            String str;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webResourceError != null) {
                i = webResourceError.getErrorCode();
                str = webResourceError.getDescription().toString();
            } else {
                i = -1;
                str = "no_description";
            }
            L.G("vk_sdk_auth", webResourceRequest.getUrl() + StringUtils.PROCESS_POSTFIX_DELIMITER + i + StringUtils.PROCESS_POSTFIX_DELIMITER + str);
            if (TextUtils.equals(webView.getUrl(), webResourceRequest.getUrl().toString())) {
                int i2 = SDKAuthActivity.y;
                SDKAuthActivity.this.U1(i, null);
            }
        }
    }
}
