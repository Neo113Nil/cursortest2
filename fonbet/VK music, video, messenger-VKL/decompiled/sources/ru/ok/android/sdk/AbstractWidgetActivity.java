package ru.ok.android.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.ironsource.B5;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.TypeCastException;
import ru.ok.android.sdk.util.OkRequestUtil;
import ru.ok.android.sdk.util.Utils;
import xsna.brm0;
import xsna.epx;
import xsna.i5s;
import xsna.rl3;

/* compiled from: AbstractWidgetActivity.kt */
/* loaded from: classes9.dex */
public abstract class AbstractWidgetActivity extends Activity {
    private HashMap _$_findViewCache;
    private String mAccessToken;
    private String mAppId;
    private String mSessionSecretKey;
    private final HashMap<String, String> args = new HashMap<>();
    private boolean retryAllowed = true;

    /* compiled from: AbstractWidgetActivity.kt */
    public final class OkWidgetViewClient extends OkWebViewClient {
        public OkWidgetViewClient(Context context) {
            super(context);
        }

        @Override // ru.ok.android.sdk.OkWebViewClient, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            AbstractWidgetActivity.this.processError(getErrorMessage(i));
        }

        @Override // ru.ok.android.sdk.OkWebViewClient, android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            AbstractWidgetActivity.this.processError(getErrorMessage(sslError));
        }

        @Override // ru.ok.android.sdk.OkWebViewClient, android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!brm0.B(str, AbstractWidgetActivity.this.getReturnUrl(), false)) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            AbstractWidgetActivity.this.processResult(OkRequestUtil.getUrlParameters(str).getString("result"));
            return true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String prepareUrl$default(AbstractWidgetActivity abstractWidgetActivity, Map map, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareUrl");
        }
        if ((i & 1) != 0) {
            map = null;
        }
        return abstractWidgetActivity.prepareUrl(map);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final HashMap<String, String> getArgs() {
        return this.args;
    }

    public final String getBaseUrl() {
        return "https://connect.ok.ru/dk?st.cmd=" + getWidgetId() + "&st.access_token=" + this.mAccessToken + "&st.app=" + this.mAppId + "&st.return=" + getReturnUrl();
    }

    public abstract int getCancelledMessageId();

    public int getLayoutId() {
        return R.layout.oksdk_webview_activity;
    }

    public final String getMAccessToken() {
        return this.mAccessToken;
    }

    public final String getMAppId() {
        return this.mAppId;
    }

    public final String getMSessionSecretKey() {
        return this.mSessionSecretKey;
    }

    public final boolean getRetryAllowed() {
        return this.retryAllowed;
    }

    public final String getReturnUrl() {
        String widgetId = getWidgetId();
        if (widgetId != null) {
            return "okwidget://".concat(widgetId.toLowerCase());
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    public abstract String getWidgetId();

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutId());
        this.args.clear();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.mAppId = extras.getString("appId");
            this.mAccessToken = extras.getString(SharedKt.PARAM_ACCESS_TOKEN);
            this.mSessionSecretKey = extras.getString("session_secret_key");
            if (extras.containsKey(SharedKt.PARAM_WIDGET_ARGS)) {
                Serializable serializable = extras.getSerializable(SharedKt.PARAM_WIDGET_ARGS);
                if (!(serializable instanceof HashMap)) {
                    serializable = null;
                }
                HashMap hashMap = (HashMap) serializable;
                if (hashMap != null) {
                    this.args.putAll(hashMap);
                }
            }
            if (extras.containsKey(SharedKt.PARAM_WIDGET_RETRY_ALLOWED)) {
                this.retryAllowed = extras.getBoolean(SharedKt.PARAM_WIDGET_RETRY_ALLOWED, true);
            }
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i) {
            return false;
        }
        processError(getString(getCancelledMessageId()));
        return true;
    }

    public final String prepareUrl(Map<String, String> map) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry<String, String> entry : this.args.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }
        treeMap.put("st.return", getReturnUrl());
        StringBuilder sb = new StringBuilder(200);
        StringBuilder sb2 = new StringBuilder(getBaseUrl());
        for (Map.Entry entry2 : treeMap.entrySet()) {
            String str = (String) entry2.getKey();
            String str2 = (String) entry2.getValue();
            if (rl3.G(SharedKt.getWIDGET_SIGNED_ARGS(), str)) {
                sb.append(str);
                sb.append(B5.U);
                sb.append(str2);
            }
            if (!epx.f(str, "st.return")) {
                sb2.append('&');
                sb2.append(str);
                sb2.append(B5.U);
                sb2.append(OkRequestUtil.encode(str2));
            }
        }
        String md5 = Utils.INSTANCE.toMD5(sb.toString() + this.mSessionSecretKey);
        if (map == null) {
            map = AbstractWidgetActivityKt.DEFAULT_OPTIONS;
        }
        for (Map.Entry<String, String> entry3 : map.entrySet()) {
            String key = entry3.getKey();
            String value = entry3.getValue();
            sb2.append('&');
            sb2.append(key);
            sb2.append(B5.U);
            sb2.append(value);
        }
        return i5s.a(sb2, "&st.signature=", md5);
    }

    public final void processError(final String str) {
        if (!this.retryAllowed) {
            processResult(str);
            return;
        }
        try {
            new AlertDialog.Builder(this).setMessage(str).setPositiveButton(getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: ru.ok.android.sdk.AbstractWidgetActivity$processError$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    ((WebView) AbstractWidgetActivity.this.findViewById(R.id.web_view)).loadUrl(AbstractWidgetActivity.prepareUrl$default(AbstractWidgetActivity.this, null, 1, null));
                }
            }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: ru.ok.android.sdk.AbstractWidgetActivity$processError$2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    AbstractWidgetActivity.this.processResult(str);
                }
            }).show();
        } catch (RuntimeException unused) {
            processResult(str);
        }
    }

    public abstract void processResult(String str);

    public final void setMAccessToken(String str) {
        this.mAccessToken = str;
    }

    public final void setMAppId(String str) {
        this.mAppId = str;
    }

    public final void setMSessionSecretKey(String str) {
        this.mSessionSecretKey = str;
    }

    public final void setRetryAllowed(boolean z) {
        this.retryAllowed = z;
    }
}
