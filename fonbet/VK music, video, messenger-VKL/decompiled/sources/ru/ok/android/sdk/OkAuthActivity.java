package ru.ok.android.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import java.io.Serializable;
import java.net.URLEncoder;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.TypeCastException;
import kotlin.collections.EmptyList;
import ru.ok.android.sdk.util.OkAuthType;
import xsna.brm0;
import xsna.drm0;
import xsna.epx;
import xsna.i5s;
import xsna.j5g;
import xsna.n6j;
import xsna.pzl;
import xsna.rl3;

/* compiled from: OkAuthActivity.kt */
/* loaded from: classes9.dex */
public final class OkAuthActivity extends Activity {
    private HashMap _$_findViewCache;
    private OkAuthType authType;
    private String mAppId;
    private String mAppKey;
    private String mRedirectUri;
    private String[] mScopes;
    private WebView mWebView;
    private boolean ssoAuthorizationStarted;

    /* compiled from: OkAuthActivity.kt */
    public final class OAuthWebViewClient extends OkWebViewClient {
        public OAuthWebViewClient(Context context) {
            super(context);
        }

        @Override // ru.ok.android.sdk.OkWebViewClient, android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            OkAuthActivity.this.showAlert(getErrorMessage(i));
        }

        @Override // ru.ok.android.sdk.OkWebViewClient, android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            OkAuthActivity.this.showAlert(getErrorMessage(sslError));
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x010d A[SYNTHETIC] */
        @Override // ru.ok.android.sdk.OkWebViewClient, android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            String str3;
            long j;
            Collection collection;
            Collection collection2;
            Collection collection3;
            boolean z = true;
            if (!brm0.B(str, OkAuthActivity.this.mRedirectUri, false)) {
                if (!drm0.D(str, "st.cmd=userMain", false)) {
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                OkAuthActivity.this.mWebView.loadUrl(OkAuthActivity.this.buildOAuthUrl());
                return true;
            }
            String fragment = Uri.parse(str).getFragment();
            String str4 = null;
            if (fragment != null) {
                List a = n6j.a(0, "&", fragment);
                if (!a.isEmpty()) {
                    ListIterator listIterator = a.listIterator(a.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collection = j5g.H0(a, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = EmptyList.b;
                Collection collection4 = collection;
                if (collection4 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                }
                Object[] array = collection4.toArray(new String[0]);
                if (array == null) {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                String[] strArr = (String[]) array;
                int length = strArr.length;
                str2 = null;
                str3 = null;
                int i = 0;
                long j2 = 0;
                while (i < length) {
                    boolean z2 = z;
                    List a2 = n6j.a(0, "=", strArr[i]);
                    if (!a2.isEmpty()) {
                        ListIterator listIterator2 = a2.listIterator(a2.size());
                        while (listIterator2.hasPrevious()) {
                            if (((String) listIterator2.previous()).length() != 0) {
                                collection2 = j5g.H0(a2, listIterator2.nextIndex() + 1);
                                collection3 = collection2;
                                if (collection3 != null) {
                                    throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
                                }
                                Object[] array2 = collection3.toArray(new String[0]);
                                if (array2 == null) {
                                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                                String[] strArr2 = (String[]) array2;
                                if (strArr2.length == 2) {
                                    String str5 = strArr2[0];
                                    String str6 = strArr2[z2 ? 1 : 0];
                                    switch (str5.hashCode()) {
                                        case -1938933922:
                                            if (!str5.equals(SharedKt.PARAM_ACCESS_TOKEN)) {
                                                break;
                                            } else {
                                                str4 = str6;
                                                continue;
                                            }
                                        case -1432035435:
                                            if (!str5.equals(SharedKt.PARAM_REFRESH_TOKEN)) {
                                                break;
                                            }
                                            break;
                                        case -833810928:
                                            if (!str5.equals(SharedKt.PARAM_EXPIRES_IN)) {
                                                continue;
                                            } else if (str6.length() != 0) {
                                                j2 = Long.parseLong(str6);
                                                break;
                                            } else {
                                                j2 = 0;
                                                break;
                                            }
                                        case 96784904:
                                            if (str5.equals("error")) {
                                                str3 = str6;
                                                break;
                                            } else {
                                                continue;
                                            }
                                        case 438353305:
                                            if (!str5.equals("session_secret_key")) {
                                                break;
                                            }
                                            break;
                                    }
                                    str2 = str6;
                                }
                                i++;
                                z = z2 ? 1 : 0;
                            }
                        }
                    }
                    collection2 = EmptyList.b;
                    collection3 = collection2;
                    if (collection3 != null) {
                    }
                }
                j = j2;
            } else {
                str2 = null;
                str3 = null;
                j = 0;
            }
            boolean z3 = z;
            if (str4 != null) {
                OkAuthActivity.this.onSuccess(str4, str2, j);
                return z3;
            }
            OkAuthActivity.this.onFail(str3);
            return z3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void auth() {
        String str;
        String str2 = this.mAppId;
        if (str2 == null || drm0.N(str2) || (str = this.mAppKey) == null || drm0.N(str)) {
            onFail(getString(R.string.no_application_data));
            return;
        }
        OkAuthType okAuthType = this.authType;
        OkAuthType okAuthType2 = OkAuthType.NATIVE_SSO;
        if (okAuthType == okAuthType2 || okAuthType == OkAuthType.ANY) {
            if (startSsoAuthorization()) {
                this.ssoAuthorizationStarted = true;
                return;
            } else if (this.authType == okAuthType2) {
                onFail(getString(R.string.no_ok_application_installed));
                return;
            }
        }
        OkAuthType okAuthType3 = this.authType;
        if (okAuthType3 == OkAuthType.WEBVIEW_OAUTH || okAuthType3 == OkAuthType.ANY) {
            this.mWebView.loadUrl(buildOAuthUrl());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildOAuthUrl() {
        StringBuilder sb = new StringBuilder("https://connect.ok.ru/oauth/authorize?client_id=");
        sb.append(this.mAppId);
        sb.append("&response_type=token&redirect_uri=");
        String a = i5s.a(sb, this.mRedirectUri, "&layout=m&platform=ANDROID");
        String[] strArr = this.mScopes;
        return (strArr == null || strArr.length == 0) ? a : pzl.b(a, "&scope=", URLEncoder.encode(rl3.Z(strArr, ";", null, null, null, 62)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancel(String str) {
        Intent intent = new Intent();
        intent.putExtra("error", str);
        setResult(3, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFail(String str) {
        Intent intent = new Intent();
        intent.putExtra("error", str);
        setResult(2, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSuccess(String str, String str2, long j) {
        TokenStore.store(this, str, str2);
        Intent intent = new Intent();
        intent.putExtra(SharedKt.PARAM_ACCESS_TOKEN, str);
        intent.putExtra("session_secret_key", str2);
        if (j > 0) {
            intent.putExtra(SharedKt.PARAM_EXPIRES_IN, j);
        }
        setResult(-1, intent);
        finish();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void prepareWebView() {
        WebView webView = (WebView) findViewById(R.id.web_view);
        this.mWebView = webView;
        webView.setWebViewClient(new OAuthWebViewClient(this));
        this.mWebView.getSettings().setJavaScriptEnabled(true);
    }

    private final ResolveInfo resolveOkAppLogin(Intent intent, String str) {
        intent.setClassName(str, "ru.ok.android.external.LoginExternal");
        return getPackageManager().resolveActivity(intent, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showAlert(final String str) {
        if (isFinishing()) {
            return;
        }
        try {
            new AlertDialog.Builder(this).setMessage(str).setPositiveButton(getString(R.string.retry), new DialogInterface.OnClickListener() { // from class: ru.ok.android.sdk.OkAuthActivity$showAlert$1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    OkAuthActivity.this.auth();
                }
            }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: ru.ok.android.sdk.OkAuthActivity$showAlert$2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    OkAuthActivity.this.onCancel(str);
                }
            }).show();
        } catch (RuntimeException unused) {
            onCancel(str);
        }
    }

    private final boolean startSsoAuthorization() {
        Intent intent = new Intent();
        ResolveInfo resolveOkAppLogin = resolveOkAppLogin(intent, "ru.ok.android");
        if (resolveOkAppLogin == null && Odnoklassniki.Companion.of(this).getAllowDebugOkSso()) {
            resolveOkAppLogin = resolveOkAppLogin(intent, "ru.ok.android.debug");
        }
        if (resolveOkAppLogin == null) {
            return false;
        }
        try {
            PackageInfo packageInfo = getPackageManager().getPackageInfo(resolveOkAppLogin.activityInfo.packageName, 64);
            if (packageInfo != null && packageInfo.versionCode >= 120) {
                for (Signature signature : packageInfo.signatures) {
                    if (epx.f(signature.toCharsString(), "3082025b308201c4a00302010202044f6760f9300d06092a864886f70d01010505003071310c300a06035504061303727573310c300a06035504081303737062310c300a0603550407130373706231163014060355040a130d4f646e6f6b6c6173736e696b6931143012060355040b130b6d6f62696c65207465616d311730150603550403130e416e647265792041736c616d6f763020170d3132303331393136333831375a180f32303636313232313136333831375a3071310c300a06035504061303727573310c300a06035504081303737062310c300a0603550407130373706231163014060355040a130d4f646e6f6b6c6173736e696b6931143012060355040b130b6d6f62696c65207465616d311730150603550403130e416e647265792041736c616d6f7630819f300d06092a864886f70d010101050003818d003081890281810080bea15bf578b898805dfd26346b2fbb662889cd6aba3f8e53b5b27c43a984eeec9a5d21f6f11667d987b77653f4a9651e20b94ff10594f76a93a6a36e6a42f4d851847cf1da8d61825ce020b7020cd1bc2eb435b0d416908be9393516ca1976ff736733c1d48ff17cd57f21ad49e05fc99384273efc5546e4e53c5e9f391c430203010001300d06092a864886f70d0101050500038181007d884df69a9748eabbdcfe55f07360433b23606d3b9d4bca03109c3ffb80fccb7809dfcbfd5a466347f1daf036fbbf1521754c2d1d999f9cbc66b884561e8201459aa414677e411e66360c3840ca4727da77f6f042f2c011464e99f34ba7df8b4bceb4fa8231f1d346f4063f7ba0e887918775879e619786728a8078c76647ed")) {
                        intent.putExtra("client_id", this.mAppId);
                        intent.putExtra(SharedKt.PARAM_CLIENT_SECRET, "6C6B6397C2BCE5EDB7290039");
                        intent.putExtra("redirect_uri", this.mRedirectUri);
                        String[] strArr = this.mScopes;
                        if (!(strArr.length == 0)) {
                            intent.putExtra(SharedKt.PARAM_SCOPES, strArr);
                        }
                        startActivityForResult(intent, 31337);
                        return true;
                    }
                }
            }
        } catch (ActivityNotFoundException | PackageManager.NameNotFoundException unused) {
        }
        return false;
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

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        if (i != 31337) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.ssoAuthorizationStarted = false;
        if (intent == null || (str = intent.getStringExtra("error")) == null) {
            str = "";
        }
        if (i2 == -1) {
            String stringExtra = intent != null ? intent.getStringExtra(SharedKt.PARAM_ACCESS_TOKEN) : null;
            String stringExtra2 = intent != null ? intent.getStringExtra("session_secret_key") : null;
            String stringExtra3 = intent != null ? intent.getStringExtra(SharedKt.PARAM_REFRESH_TOKEN) : null;
            long longExtra = intent != null ? intent.getLongExtra(SharedKt.PARAM_EXPIRES_IN, 0L) : 0L;
            if (stringExtra != null) {
                if (stringExtra2 == null) {
                    stringExtra2 = stringExtra3;
                }
                onSuccess(stringExtra, stringExtra2, longExtra);
                finish();
            }
        }
        onFail(str);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        OkAuthType okAuthType;
        super.onCreate(bundle);
        setContentView(R.layout.oksdk_webview_activity);
        findViewById(R.id.web_view).setVisibility(4);
        prepareWebView();
        if (bundle == null) {
            bundle = getIntent().getExtras();
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.mAppId = bundle.getString("client_id");
        this.mAppKey = bundle.getString("application_key");
        String string = bundle.getString("redirect_uri");
        if (string == null) {
            string = "okauth://auth";
        }
        this.mRedirectUri = string;
        String[] stringArray = bundle.getStringArray(SharedKt.PARAM_SCOPES);
        if (stringArray == null) {
            stringArray = new String[0];
        }
        this.mScopes = stringArray;
        if (bundle.getSerializable(SharedKt.PARAM_AUTH_TYPE) instanceof OkAuthType) {
            Serializable serializable = bundle.getSerializable(SharedKt.PARAM_AUTH_TYPE);
            if (serializable == null) {
                throw new TypeCastException("null cannot be cast to non-null type ru.ok.android.sdk.util.OkAuthType");
            }
            okAuthType = (OkAuthType) serializable;
        } else {
            okAuthType = OkAuthType.ANY;
        }
        this.authType = okAuthType;
        boolean z = bundle.getBoolean("SSO_STARTED", false);
        this.ssoAuthorizationStarted = z;
        if (z) {
            return;
        }
        auth();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (4 != i) {
            return false;
        }
        showAlert(getString(R.string.authorization_canceled));
        return true;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("client_id", this.mAppId);
        bundle.putString("application_key", this.mAppKey);
        bundle.putString("redirect_uri", this.mRedirectUri);
        bundle.putStringArray(SharedKt.PARAM_SCOPES, this.mScopes);
        bundle.putSerializable(SharedKt.PARAM_AUTH_TYPE, this.authType);
        bundle.putBoolean("SSO_STARTED", this.ssoAuthorizationStarted);
    }
}
