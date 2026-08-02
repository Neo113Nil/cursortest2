package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.CookieManager;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.adjust.sdk.Constants;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.a;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.CredentialDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebViewAssetLoaderExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import defpackage.hm91;
import defpackage.hol0;
import defpackage.qj41;
import defpackage.qp41;
import java.io.ByteArrayInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public class InAppWebViewClientCompat extends WebViewClientCompat {
    protected static final String LOG_TAG = "IAWebViewClientCompat";
    private static List<URLCredential> credentialsProposed;
    private static int previousAuthRequestFailureCount;
    private InAppBrowserDelegate inAppBrowserDelegate;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat$7, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy;

        static {
            int[] iArr = new int[NavigationActionPolicy.values().length];
            $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy = iArr;
            try {
                iArr[NavigationActionPolicy.ALLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[NavigationActionPolicy.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public InAppWebViewClientCompat(InAppBrowserDelegate inAppBrowserDelegate) {
        this.inAppBrowserDelegate = inAppBrowserDelegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void allowShouldOverrideUrlLoading(WebView webView, String str, Map<String, String> map, boolean z) {
        if (z) {
            webView.loadUrl(str, map);
        }
    }

    public void dispose() {
        if (this.inAppBrowserDelegate != null) {
            this.inAppBrowserDelegate = null;
        }
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
        String url = webView.getUrl();
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didUpdateVisitedHistory(url);
        }
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onUpdateVisitedHistory(url, z);
        }
    }

    public void loadCustomJavaScriptOnPageFinished(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentEnd(), null);
    }

    public void loadCustomJavaScriptOnPageStarted(WebView webView) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (hm91.d("DOCUMENT_START_SCRIPT")) {
            return;
        }
        inAppWebView.evaluateJavascript(inAppWebView.userContentController.generateWrappedCodeForDocumentStart(), null);
    }

    @Override // android.webkit.WebViewClient
    public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        WebViewChannelDelegate.FormResubmissionCallback formResubmissionCallback = new WebViewChannelDelegate.FormResubmissionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.6
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(Integer num) {
                InAppWebViewClientCompat.super.onFormResubmission(webView, message, message2);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
            public void error(String str, String str2, Object obj) {
                StringBuilder a = a.a(str, Extension.FIX_SPACE);
                if (str2 == null) {
                    str2 = "";
                }
                com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str2, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((Integer) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(Integer num) {
                if (num.intValue() != 0) {
                    message.sendToTarget();
                    return false;
                }
                message2.sendToTarget();
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onFormResubmission(inAppWebView.getUrl(), formResubmissionCallback);
        } else {
            formResubmissionCallback.defaultBehaviour(null);
        }
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onPageCommitVisible(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = false;
        loadCustomJavaScriptOnPageFinished(inAppWebView);
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        super.onPageFinished(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFinishNavigation(str);
        }
        CookieManager.getInstance().flush();
        inAppWebView.evaluateJavascript(JavaScriptBridgeJS.PLATFORM_READY_JS_SOURCE, null);
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onLoadStop(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.isLoading = true;
        inAppWebView.disposeWebMessageChannels();
        inAppWebView.userContentController.resetContentWorlds();
        loadCustomJavaScriptOnPageStarted(inAppWebView);
        super.onPageStarted(webView, str, bitmap);
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didStartNavigation(str);
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onLoadStart(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
        String scheme;
        WebViewChannelDelegate webViewChannelDelegate;
        String url = webView.getUrl();
        String host = clientCertRequest.getHost();
        int port = clientCertRequest.getPort();
        if (url != null) {
            try {
                scheme = new URI(url).getScheme();
            } catch (URISyntaxException e) {
                Log.e(LOG_TAG, "", e);
            }
            ClientCertChallenge clientCertChallenge = new ClientCertChallenge(new URLProtectionSpace(host, scheme, null, port, webView.getCertificate(), null), clientCertRequest.getPrincipals(), clientCertRequest.getKeyTypes());
            final InAppWebView inAppWebView = (InAppWebView) webView;
            WebViewChannelDelegate.ReceivedClientCertRequestCallback receivedClientCertRequestCallback = new WebViewChannelDelegate.ReceivedClientCertRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.4
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public void defaultBehaviour(ClientCertResponse clientCertResponse) {
                    InAppWebViewClientCompat.super.onReceivedClientCertRequest(webView, clientCertRequest);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
                public void error(String str, String str2, Object obj) {
                    StringBuilder a = a.a(str, Extension.FIX_SPACE);
                    if (str2 == null) {
                        str2 = "";
                    }
                    com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str2, InAppWebViewClientCompat.LOG_TAG);
                    defaultBehaviour((ClientCertResponse) null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public boolean nonNullSuccess(ClientCertResponse clientCertResponse) {
                    Integer action = clientCertResponse.getAction();
                    if (action == null || inAppWebView.plugin == null) {
                        return true;
                    }
                    int intValue = action.intValue();
                    if (intValue != 1) {
                        ClientCertRequest clientCertRequest2 = clientCertRequest;
                        if (intValue != 2) {
                            clientCertRequest2.cancel();
                            return false;
                        }
                        clientCertRequest2.ignore();
                        return false;
                    }
                    Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView.plugin, clientCertResponse.getCertificatePath(), clientCertResponse.getCertificatePassword(), clientCertResponse.getKeyStoreType());
                    ClientCertRequest clientCertRequest3 = clientCertRequest;
                    if (loadPrivateKeyAndCertificate != null) {
                        clientCertRequest3.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                        return false;
                    }
                    clientCertRequest3.cancel();
                    return false;
                }
            };
            webViewChannelDelegate = inAppWebView.channelDelegate;
            if (webViewChannelDelegate == null) {
                webViewChannelDelegate.onReceivedClientCertRequest(clientCertChallenge, receivedClientCertRequestCallback);
                return;
            } else {
                receivedClientCertRequestCallback.defaultBehaviour(null);
                return;
            }
        }
        scheme = Constants.SCHEME;
        ClientCertChallenge clientCertChallenge2 = new ClientCertChallenge(new URLProtectionSpace(host, scheme, null, port, webView.getCertificate(), null), clientCertRequest.getPrincipals(), clientCertRequest.getKeyTypes());
        final InAppWebView inAppWebView2 = (InAppWebView) webView;
        WebViewChannelDelegate.ReceivedClientCertRequestCallback receivedClientCertRequestCallback2 = new WebViewChannelDelegate.ReceivedClientCertRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.4
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(ClientCertResponse clientCertResponse) {
                InAppWebViewClientCompat.super.onReceivedClientCertRequest(webView, clientCertRequest);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
            public void error(String str, String str2, Object obj) {
                StringBuilder a = a.a(str, Extension.FIX_SPACE);
                if (str2 == null) {
                    str2 = "";
                }
                com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str2, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((ClientCertResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(ClientCertResponse clientCertResponse) {
                Integer action = clientCertResponse.getAction();
                if (action == null || inAppWebView2.plugin == null) {
                    return true;
                }
                int intValue = action.intValue();
                if (intValue != 1) {
                    ClientCertRequest clientCertRequest2 = clientCertRequest;
                    if (intValue != 2) {
                        clientCertRequest2.cancel();
                        return false;
                    }
                    clientCertRequest2.ignore();
                    return false;
                }
                Util.PrivateKeyAndCertificates loadPrivateKeyAndCertificate = Util.loadPrivateKeyAndCertificate(inAppWebView2.plugin, clientCertResponse.getCertificatePath(), clientCertResponse.getCertificatePassword(), clientCertResponse.getKeyStoreType());
                ClientCertRequest clientCertRequest3 = clientCertRequest;
                if (loadPrivateKeyAndCertificate != null) {
                    clientCertRequest3.proceed(loadPrivateKeyAndCertificate.privateKey, loadPrivateKeyAndCertificate.certificates);
                    return false;
                }
                clientCertRequest3.cancel();
                return false;
            }
        };
        webViewChannelDelegate = inAppWebView2.channelDelegate;
        if (webViewChannelDelegate == null) {
        }
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, qj41 qj41Var) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (webResourceRequest.isForMainFrame()) {
            if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
                inAppWebView.stopLoading();
                inAppWebView.loadUrl("about:blank");
            }
            inAppWebView.isLoading = false;
            previousAuthRequestFailureCount = 0;
            credentialsProposed = null;
            if (this.inAppBrowserDelegate != null) {
                this.inAppBrowserDelegate.didFailNavigation(webResourceRequest.getUrl().toString(), hm91.d("WEB_RESOURCE_ERROR_GET_CODE") ? qj41Var.b() : -1, hm91.d("WEB_RESOURCE_ERROR_GET_DESCRIPTION") ? qj41Var.a().toString() : "");
            }
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceErrorExt.fromWebResourceError(qj41Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
        int port;
        String str3;
        String str4;
        String str5;
        WebViewChannelDelegate webViewChannelDelegate;
        String url = webView.getUrl();
        String str6 = Constants.SCHEME;
        if (url != null) {
            try {
                URI uri = new URI(url);
                str6 = uri.getScheme();
                port = uri.getPort();
                str3 = str6;
            } catch (URISyntaxException e) {
                Log.e(LOG_TAG, "", e);
            }
            previousAuthRequestFailureCount++;
            if (credentialsProposed != null) {
                str4 = str;
                str5 = str2;
                credentialsProposed = CredentialDatabase.getInstance(webView.getContext()).getHttpAuthCredentials(str4, str3, str5, Integer.valueOf(port));
            } else {
                str4 = str;
                str5 = str2;
            }
            List<URLCredential> list = credentialsProposed;
            final int i = port;
            HttpAuthenticationChallenge httpAuthenticationChallenge = new HttpAuthenticationChallenge(new URLProtectionSpace(str4, str3, str5, i, webView.getCertificate(), null), previousAuthRequestFailureCount, (list != null || list.size() <= 0) ? null : credentialsProposed.get(0));
            final String str7 = str3;
            WebViewChannelDelegate.ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback = new WebViewChannelDelegate.ReceivedHttpAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.2
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public void defaultBehaviour(HttpAuthResponse httpAuthResponse) {
                    InAppWebViewClientCompat.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
                public void error(String str8, String str9, Object obj) {
                    StringBuilder a = a.a(str8, Extension.FIX_SPACE);
                    if (str9 == null) {
                        str9 = "";
                    }
                    com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str9, InAppWebViewClientCompat.LOG_TAG);
                    defaultBehaviour((HttpAuthResponse) null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public boolean nonNullSuccess(HttpAuthResponse httpAuthResponse) {
                    Integer action = httpAuthResponse.getAction();
                    if (action == null) {
                        return true;
                    }
                    int intValue = action.intValue();
                    if (intValue == 1) {
                        String username = httpAuthResponse.getUsername();
                        String password = httpAuthResponse.getPassword();
                        if (httpAuthResponse.isPermanentPersistence()) {
                            CredentialDatabase.getInstance(webView.getContext()).setHttpAuthCredential(str, str7, str2, Integer.valueOf(i), username, password);
                        }
                        httpAuthHandler.proceed(username, password);
                        return false;
                    }
                    if (intValue != 2) {
                        InAppWebViewClientCompat.credentialsProposed = null;
                        InAppWebViewClientCompat.previousAuthRequestFailureCount = 0;
                        httpAuthHandler.cancel();
                        return false;
                    }
                    if (InAppWebViewClientCompat.credentialsProposed.size() <= 0) {
                        httpAuthHandler.cancel();
                        return false;
                    }
                    URLCredential uRLCredential = (URLCredential) InAppWebViewClientCompat.credentialsProposed.remove(0);
                    httpAuthHandler.proceed(uRLCredential.getUsername(), uRLCredential.getPassword());
                    return false;
                }
            };
            webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
            if (webViewChannelDelegate == null) {
                webViewChannelDelegate.onReceivedHttpAuthRequest(httpAuthenticationChallenge, receivedHttpAuthRequestCallback);
                return;
            } else {
                receivedHttpAuthRequestCallback.defaultBehaviour(null);
                return;
            }
        }
        str3 = str6;
        port = 0;
        previousAuthRequestFailureCount++;
        if (credentialsProposed != null) {
        }
        List<URLCredential> list2 = credentialsProposed;
        final int i2 = port;
        HttpAuthenticationChallenge httpAuthenticationChallenge2 = new HttpAuthenticationChallenge(new URLProtectionSpace(str4, str3, str5, i2, webView.getCertificate(), null), previousAuthRequestFailureCount, (list2 != null || list2.size() <= 0) ? null : credentialsProposed.get(0));
        final String str72 = str3;
        WebViewChannelDelegate.ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback2 = new WebViewChannelDelegate.ReceivedHttpAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.2
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(HttpAuthResponse httpAuthResponse) {
                InAppWebViewClientCompat.super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
            public void error(String str8, String str9, Object obj) {
                StringBuilder a = a.a(str8, Extension.FIX_SPACE);
                if (str9 == null) {
                    str9 = "";
                }
                com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str9, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((HttpAuthResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(HttpAuthResponse httpAuthResponse) {
                Integer action = httpAuthResponse.getAction();
                if (action == null) {
                    return true;
                }
                int intValue = action.intValue();
                if (intValue == 1) {
                    String username = httpAuthResponse.getUsername();
                    String password = httpAuthResponse.getPassword();
                    if (httpAuthResponse.isPermanentPersistence()) {
                        CredentialDatabase.getInstance(webView.getContext()).setHttpAuthCredential(str, str72, str2, Integer.valueOf(i2), username, password);
                    }
                    httpAuthHandler.proceed(username, password);
                    return false;
                }
                if (intValue != 2) {
                    InAppWebViewClientCompat.credentialsProposed = null;
                    InAppWebViewClientCompat.previousAuthRequestFailureCount = 0;
                    httpAuthHandler.cancel();
                    return false;
                }
                if (InAppWebViewClientCompat.credentialsProposed.size() <= 0) {
                    httpAuthHandler.cancel();
                    return false;
                }
                URLCredential uRLCredential = (URLCredential) InAppWebViewClientCompat.credentialsProposed.remove(0);
                httpAuthHandler.proceed(uRLCredential.getUsername(), uRLCredential.getPassword());
                return false;
            }
        };
        webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate == null) {
        }
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedHttpError(WebResourceRequestExt.fromWebResourceRequest(webResourceRequest), WebResourceResponseExt.fromWebResourceResponse(webResourceResponse));
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedLoginRequest(str, str2, str3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
        String str;
        int i;
        WebViewChannelDelegate webViewChannelDelegate;
        URI uri;
        String url = sslError.getUrl();
        String str2 = Constants.SCHEME;
        try {
            uri = new URI(url);
            str = uri.getHost();
        } catch (URISyntaxException e) {
            e = e;
            str = "";
        }
        try {
            str2 = uri.getScheme();
            i = uri.getPort();
        } catch (URISyntaxException e2) {
            e = e2;
            Log.e(LOG_TAG, "", e);
            i = 0;
            ServerTrustChallenge serverTrustChallenge = new ServerTrustChallenge(new URLProtectionSpace(str, str2, null, i, sslError.getCertificate(), sslError));
            WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.3
                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public void defaultBehaviour(ServerTrustAuthResponse serverTrustAuthResponse) {
                    InAppWebViewClientCompat.super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
                public void error(String str3, String str4, Object obj) {
                    StringBuilder a = a.a(str3, Extension.FIX_SPACE);
                    if (str4 == null) {
                        str4 = "";
                    }
                    com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str4, InAppWebViewClientCompat.LOG_TAG);
                    defaultBehaviour((ServerTrustAuthResponse) null);
                }

                @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
                public boolean nonNullSuccess(ServerTrustAuthResponse serverTrustAuthResponse) {
                    Integer action = serverTrustAuthResponse.getAction();
                    if (action == null) {
                        return true;
                    }
                    int intValue = action.intValue();
                    SslErrorHandler sslErrorHandler2 = sslErrorHandler;
                    if (intValue != 1) {
                        sslErrorHandler2.cancel();
                        return false;
                    }
                    sslErrorHandler2.proceed();
                    return false;
                }
            };
            webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
            if (webViewChannelDelegate == null) {
            }
        }
        ServerTrustChallenge serverTrustChallenge2 = new ServerTrustChallenge(new URLProtectionSpace(str, str2, null, i, sslError.getCertificate(), sslError));
        WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback2 = new WebViewChannelDelegate.ReceivedServerTrustAuthRequestCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.3
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(ServerTrustAuthResponse serverTrustAuthResponse) {
                InAppWebViewClientCompat.super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
            public void error(String str3, String str4, Object obj) {
                StringBuilder a = a.a(str3, Extension.FIX_SPACE);
                if (str4 == null) {
                    str4 = "";
                }
                com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str4, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((ServerTrustAuthResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(ServerTrustAuthResponse serverTrustAuthResponse) {
                Integer action = serverTrustAuthResponse.getAction();
                if (action == null) {
                    return true;
                }
                int intValue = action.intValue();
                SslErrorHandler sslErrorHandler2 = sslErrorHandler;
                if (intValue != 1) {
                    sslErrorHandler2.cancel();
                    return false;
                }
                sslErrorHandler2.proceed();
                return false;
            }
        };
        webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate == null) {
            webViewChannelDelegate.onReceivedServerTrustAuthRequest(serverTrustChallenge2, receivedServerTrustAuthRequestCallback2);
        } else {
            receivedServerTrustAuthRequestCallback2.defaultBehaviour(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.customSettings.useOnRenderProcessGone.booleanValue() || inAppWebView.channelDelegate == null) {
            return super.onRenderProcessGone(webView, renderProcessGoneDetail);
        }
        inAppWebView.channelDelegate.onRenderProcessGone(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
        return true;
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onSafeBrowsingHit(final WebView webView, final WebResourceRequest webResourceRequest, final int i, final hol0 hol0Var) {
        WebViewChannelDelegate.SafeBrowsingHitCallback safeBrowsingHitCallback = new WebViewChannelDelegate.SafeBrowsingHitCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.5
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(SafeBrowsingResponse safeBrowsingResponse) {
                InAppWebViewClientCompat.super.onSafeBrowsingHit(webView, webResourceRequest, i, hol0Var);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
            public void error(String str, String str2, Object obj) {
                StringBuilder a = a.a(str, Extension.FIX_SPACE);
                if (str2 == null) {
                    str2 = "";
                }
                com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str2, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((SafeBrowsingResponse) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(SafeBrowsingResponse safeBrowsingResponse) {
                Integer action = safeBrowsingResponse.getAction();
                if (action != null) {
                    boolean isReport = safeBrowsingResponse.isReport();
                    int intValue = action.intValue();
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (hm91.d("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
                                hol0Var.c(isReport);
                                return false;
                            }
                        } else if (hm91.d("SAFE_BROWSING_RESPONSE_PROCEED")) {
                            hol0Var.b(isReport);
                            return false;
                        }
                    } else if (hm91.d("SAFE_BROWSING_RESPONSE_BACK_TO_SAFETY")) {
                        hol0Var.a(isReport);
                        return false;
                    }
                }
                return true;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onSafeBrowsingHit(webResourceRequest.getUrl().toString(), i, safeBrowsingHitCallback);
        } else {
            safeBrowsingHitCallback.defaultBehaviour(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onScaleChanged(WebView webView, float f, float f2) {
        super.onScaleChanged(webView, f, f2);
        InAppWebView inAppWebView = (InAppWebView) webView;
        inAppWebView.zoomScale = f2 / Util.getPixelDensity(inAppWebView.getContext());
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onZoomScaleChanged(f, f2);
        }
    }

    public void onShouldOverrideUrlLoading(final InAppWebView inAppWebView, final String str, String str2, final Map<String, String> map, final boolean z, boolean z2, boolean z3) {
        NavigationAction navigationAction = new NavigationAction(new URLRequest(str, str2, null, map), z, z2, z3);
        WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback = new WebViewChannelDelegate.ShouldOverrideUrlLoadingCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewClientCompat.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public void defaultBehaviour(NavigationActionPolicy navigationActionPolicy) {
                InAppWebViewClientCompat.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult, defpackage.da20
            public void error(String str3, String str4, Object obj) {
                StringBuilder a = a.a(str3, Extension.FIX_SPACE);
                if (str4 == null) {
                    str4 = "";
                }
                com.pichillilorenzo.flutter_inappwebview_android.webview.a.a(a, str4, InAppWebViewClientCompat.LOG_TAG);
                defaultBehaviour((NavigationActionPolicy) null);
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl, com.pichillilorenzo.flutter_inappwebview_android.types.ICallbackResult
            public boolean nonNullSuccess(NavigationActionPolicy navigationActionPolicy) {
                if (AnonymousClass7.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$types$NavigationActionPolicy[navigationActionPolicy.ordinal()] != 1) {
                    return false;
                }
                InAppWebViewClientCompat.this.allowShouldOverrideUrlLoading(inAppWebView, str, map, z);
                return false;
            }
        };
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.shouldOverrideUrlLoading(navigationAction, shouldOverrideUrlLoadingCallback);
        } else {
            shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequestExt webResourceRequestExt) {
        CustomSchemeResponse onLoadResourceWithCustomScheme;
        WebResourceResponseExt shouldInterceptRequest;
        InAppWebView inAppWebView = (InAppWebView) webView;
        WebViewAssetLoaderExt webViewAssetLoaderExt = inAppWebView.webViewAssetLoaderExt;
        if (webViewAssetLoaderExt != null && webViewAssetLoaderExt.loader != null) {
            try {
                WebResourceResponse a = inAppWebView.webViewAssetLoaderExt.loader.a(Uri.parse(webResourceRequestExt.getUrl()));
                if (a != null) {
                    return a;
                }
            } catch (Exception e) {
                Log.e(LOG_TAG, "", e);
            }
        }
        WebResourceResponse webResourceResponse = null;
        if (inAppWebView.customSettings.useShouldInterceptRequest.booleanValue()) {
            WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
            if (webViewChannelDelegate != null) {
                try {
                    shouldInterceptRequest = webViewChannelDelegate.shouldInterceptRequest(webResourceRequestExt);
                } catch (InterruptedException e2) {
                    Log.e(LOG_TAG, "", e2);
                    return null;
                }
            } else {
                shouldInterceptRequest = null;
            }
            if (shouldInterceptRequest == null) {
                return null;
            }
            String contentType = shouldInterceptRequest.getContentType();
            String contentEncoding = shouldInterceptRequest.getContentEncoding();
            byte[] data = shouldInterceptRequest.getData();
            Map<String, String> headers = shouldInterceptRequest.getHeaders();
            Integer statusCode = shouldInterceptRequest.getStatusCode();
            String reasonPhrase = shouldInterceptRequest.getReasonPhrase();
            ByteArrayInputStream byteArrayInputStream = data != null ? new ByteArrayInputStream(data) : null;
            return (statusCode == null || reasonPhrase == null) ? new WebResourceResponse(contentType, contentEncoding, byteArrayInputStream) : new WebResourceResponse(contentType, contentEncoding, statusCode.intValue(), reasonPhrase, headers, byteArrayInputStream);
        }
        String lowerCase = webResourceRequestExt.getUrl().split(":")[0].toLowerCase();
        try {
            lowerCase = Uri.parse(webResourceRequestExt.getUrl()).getScheme();
        } catch (Exception unused) {
        }
        List<String> list = inAppWebView.customSettings.resourceCustomSchemes;
        if (list != null && list.contains(lowerCase)) {
            WebViewChannelDelegate webViewChannelDelegate2 = inAppWebView.channelDelegate;
            if (webViewChannelDelegate2 != null) {
                try {
                    onLoadResourceWithCustomScheme = webViewChannelDelegate2.onLoadResourceWithCustomScheme(webResourceRequestExt);
                } catch (InterruptedException e3) {
                    Log.e(LOG_TAG, "", e3);
                    return null;
                }
            } else {
                onLoadResourceWithCustomScheme = null;
            }
            if (onLoadResourceWithCustomScheme != null) {
                try {
                    webResourceResponse = inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, webResourceRequestExt, onLoadResourceWithCustomScheme.getContentType());
                } catch (Exception e4) {
                    Log.e(LOG_TAG, "", e4);
                }
                return webResourceResponse != null ? webResourceResponse : new WebResourceResponse(onLoadResourceWithCustomScheme.getContentType(), onLoadResourceWithCustomScheme.getContentType(), new ByteArrayInputStream(onLoadResourceWithCustomScheme.getData()));
            }
        }
        if (inAppWebView.contentBlockerHandler.getRuleList().size() <= 0) {
            return null;
        }
        try {
            return inAppWebView.contentBlockerHandler.checkUrl(inAppWebView, webResourceRequestExt);
        } catch (Exception e5) {
            Log.e(LOG_TAG, "", e5);
            return null;
        }
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        boolean isRedirect;
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        if (hm91.d("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
            qp41.m.getClass();
            isRedirect = webResourceRequest.isRedirect();
        } else {
            isRedirect = webResourceRequest.isRedirect();
        }
        onShouldOverrideUrlLoading(inAppWebView, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders(), webResourceRequest.isForMainFrame(), webResourceRequest.hasGesture(), isRedirect);
        if (inAppWebView.regexToCancelSubFramesLoadingCompiled == null) {
            return webResourceRequest.isForMainFrame();
        }
        if (webResourceRequest.isForMainFrame()) {
            return true;
        }
        return inAppWebView.regexToCancelSubFramesLoadingCompiled.matcher(webResourceRequest.getUrl().toString()).matches();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (inAppWebView.customSettings.disableDefaultErrorPage.booleanValue()) {
            inAppWebView.stopLoading();
            inAppWebView.loadUrl("about:blank");
        }
        inAppWebView.isLoading = false;
        previousAuthRequestFailureCount = 0;
        credentialsProposed = null;
        InAppBrowserDelegate inAppBrowserDelegate = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate != null) {
            inAppBrowserDelegate.didFailNavigation(str2, i, str);
        }
        WebResourceRequestExt webResourceRequestExt = new WebResourceRequestExt(str2, null, false, false, true, "GET");
        WebResourceErrorExt webResourceErrorExt = new WebResourceErrorExt(i, str);
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedError(webResourceRequestExt, webResourceErrorExt);
        }
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        InAppWebView inAppWebView = (InAppWebView) webView;
        if (!inAppWebView.customSettings.useShouldOverrideUrlLoading.booleanValue()) {
            return false;
        }
        onShouldOverrideUrlLoading(inAppWebView, str, "GET", null, true, false, false);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return shouldInterceptRequest(webView, new WebResourceRequestExt(str, null, false, false, true, "GET"));
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldInterceptRequest(webView, WebResourceRequestExt.fromWebResourceRequest(webResourceRequest));
    }
}
