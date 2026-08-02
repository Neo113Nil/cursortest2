package com.yandex.android.webview.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.security.KeyChain;
import android.security.KeyChainAliasCallback;
import android.security.KeyChainException;
import android.text.TextUtils;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import defpackage.bi21;
import defpackage.cn51;
import defpackage.dn51;
import defpackage.en51;
import defpackage.g3x0;
import defpackage.h3x0;
import defpackage.hn51;
import defpackage.k070;
import defpackage.nn41;
import defpackage.psw;
import defpackage.puu;
import defpackage.qsw;
import defpackage.rsw;
import defpackage.ssw;
import defpackage.unr0;
import defpackage.vdm0;
import defpackage.z6v;
import defpackage.z83;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
class SystemInternalWebClient extends WebViewClient {
    private static final String ABOUT_BLANK = "about:blank";
    private boolean mCleanHistory;
    private psw mErrorListener;
    private String mFutureUrl;
    private puu mHttpAuthController;
    private en51 mInterceptingDelegate;
    private final List<ssw> mOnStateChangedListeners = new ArrayList();
    private boolean mPaused;
    private k070 mRenderProcessGoneListener;
    private qsw mSbListener;
    private vdm0 mSbManager;
    private rsw mSslErrorListener;
    private hn51 mUrlLoadingDelegate;
    private final nn41 mWebViewController;
    private cn51 mYandexUuidChangeListener;
    private static final Pattern YANDEX_UUID_PATTERN = Pattern.compile("yandexuid=(.*?);");
    private static final h3x0 EMPTY_ERROR_HANDLER = new h3x0();

    public static final class KeyChainLookup extends AsyncTask<Void, Void, Void> {
        private final String mAlias;
        private final Context mContext;
        private final ClientCertRequest mHandler;

        public KeyChainLookup(Context context, ClientCertRequest clientCertRequest, String str) {
            this.mContext = context.getApplicationContext();
            this.mHandler = clientCertRequest;
            this.mAlias = str;
        }

        @Override // android.os.AsyncTask
        public Void doInBackground(Void... voidArr) {
            try {
                this.mHandler.proceed(KeyChain.getPrivateKey(this.mContext, this.mAlias), KeyChain.getCertificateChain(this.mContext, this.mAlias));
                return null;
            } catch (KeyChainException unused) {
                this.mHandler.ignore();
                return null;
            } catch (InterruptedException unused2) {
                this.mHandler.ignore();
                return null;
            }
        }
    }

    public SystemInternalWebClient(nn41 nn41Var) {
    }

    public static /* synthetic */ qsw access$400(SystemInternalWebClient systemInternalWebClient) {
        systemInternalWebClient.getClass();
        return null;
    }

    public static /* synthetic */ vdm0 access$500(SystemInternalWebClient systemInternalWebClient) {
        systemInternalWebClient.getClass();
        return null;
    }

    private void checkUrl(WebView webView, String str) {
    }

    private dn51 getCallback(SslErrorHandler sslErrorHandler, WebView webView, String str, String str2) {
        return new g3x0();
    }

    private boolean isMainFrame(String str, String str2) {
        return TextUtils.isEmpty(str) || str.equals(str2);
    }

    private boolean isWhiteListUrl(String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onReceivedClientCertRequest$1(ClientCertRequest clientCertRequest, Context context, String str) {
        if (str == null) {
            clientCertRequest.cancel();
        } else {
            new KeyChainLookup(context, clientCertRequest, str).execute(new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$shouldInterceptRequest$0(WebView webView, String str) {
        if (isMainFrame(webView, str) && needCheckUrl(str)) {
            checkUrl(webView, str);
        }
    }

    private void loadPageAndCleanHistory(WebView webView) {
        webView.loadUrl(ABOUT_BLANK);
        this.mCleanHistory = true;
    }

    private boolean needCheckUrl(String str) {
        boolean z;
        if (str == null) {
            return false;
        }
        if (!ABOUT_BLANK.equals(str)) {
            int i = bi21.a;
            if (str.startsWith("http://") || str.startsWith("https://")) {
                z = true;
                return (z || isWhiteListUrl(str)) ? false : true;
            }
        }
        z = false;
        if (z) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyOnSslStateChanged(int i, SslError sslError, dn51 dn51Var, String str, String str2) {
    }

    private void notifyPageCommitVisible(String str) {
        Iterator<ssw> it = this.mOnStateChangedListeners.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifySbListenerOk(String str) {
    }

    private void notifyTitleChanged(String str) {
        Iterator<ssw> it = this.mOnStateChangedListeners.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
    }

    private void notifyUrlChanged(String str, int i) {
        Iterator<ssw> it = this.mOnStateChangedListeners.iterator();
        if (it.hasNext()) {
            throw unr0.i(it);
        }
        updateSslStateAccordingToUrl(str);
    }

    private int tryFindOriginalUrlStep(WebBackForwardList webBackForwardList, String str) {
        if (webBackForwardList.getSize() < 1) {
            return -1;
        }
        for (int size = webBackForwardList.getSize() - 1; size >= 0; size--) {
            if (webBackForwardList.getItemAtIndex(size).getOriginalUrl().equals(str)) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryGoBack(WebView webView, String str, String str2) {
        if (TextUtils.isEmpty(str) || ABOUT_BLANK.equals(str)) {
            loadPageAndCleanHistory(webView);
            if (TextUtils.isEmpty(str)) {
                str = ABOUT_BLANK;
            }
            notifyUrlChanged(str, 0);
            notifySbListenerOk(str2);
            return;
        }
        if (tryFindOriginalUrlStep(webView.copyBackForwardList(), str) != -1) {
            webView.goBackOrForward(-((r0.getSize() - r2) - 1));
        }
        notifyUrlChanged(str, 0);
        notifySbListenerOk(str2);
    }

    private void updateSslStateAccordingToUrl(String str) {
        if (str == null) {
            return;
        }
        if (z6v.b.a.contains(str)) {
            notifyOnSslStateChanged(8, null, EMPTY_ERROR_HANDLER, str, str);
            return;
        }
        int i = bi21.a;
        if (str.startsWith("https://")) {
            notifyOnSslStateChanged(1, null, EMPTY_ERROR_HANDLER, str, str);
        } else if (str.startsWith("http://")) {
            notifyOnSslStateChanged(0, null, EMPTY_ERROR_HANDLER, str, str);
        }
    }

    private void updateYandexUuidCookie(String str) {
    }

    public void addOnStateChangedListener(ssw sswVar) {
        this.mOnStateChangedListeners.add(sswVar);
    }

    @Override // android.webkit.WebViewClient
    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        notifyUrlChanged(webView.getUrl(), 4);
    }

    @Override // android.webkit.WebViewClient
    public void onPageCommitVisible(WebView webView, String str) {
        super.onPageCommitVisible(webView, str);
        notifyPageCommitVisible(str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        String title = webView.getTitle();
        String url = webView.getUrl();
        if (TextUtils.isEmpty(url) || ABOUT_BLANK.equals(url)) {
            url = ABOUT_BLANK;
        }
        if (TextUtils.isEmpty(title)) {
            notifyTitleChanged("");
        } else {
            notifyTitleChanged(title);
        }
        notifyUrlChanged(url, 2);
        if (this.mCleanHistory) {
            webView.clearHistory();
            this.mCleanHistory = false;
        }
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String url = webView.getUrl();
        if (TextUtils.isEmpty(url) || ABOUT_BLANK.equals(url)) {
            url = ABOUT_BLANK;
        }
        if (TextUtils.isEmpty(this.mFutureUrl)) {
            this.mFutureUrl = url;
        }
        if (isMainFrame(this.mFutureUrl, url) && needCheckUrl(url)) {
            checkUrl(webView, url);
        }
        notifyUrlChanged(url, 1);
    }

    public void onPause() {
        this.mPaused = true;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedClientCertRequest(WebView webView, final ClientCertRequest clientCertRequest) {
        if (this.mPaused) {
            clientCertRequest.ignore();
            return;
        }
        final Context context = webView.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            KeyChain.choosePrivateKeyAlias(activity, new KeyChainAliasCallback() { // from class: com.yandex.android.webview.view.c
                @Override // android.security.KeyChainAliasCallback
                public final void alias(String str) {
                    SystemInternalWebClient.lambda$onReceivedClientCertRequest$1(clientCertRequest, context, str);
                }
            }, clientCertRequest.getKeyTypes(), clientCertRequest.getPrincipals(), clientCertRequest.getHost(), clientCertRequest.getPort(), null);
            return;
        }
        clientCertRequest.ignore();
        z83.j("Context is not Activity: " + context);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public void onResume() {
        this.mPaused = false;
    }

    public boolean removeOnStateChangedListener(ssw sswVar) {
        return this.mOnStateChangedListeners.remove(sswVar);
    }

    public void setErrorListener(psw pswVar) {
    }

    public void setHttpAuthController(puu puuVar) {
    }

    public void setInterceptingDelegate(en51 en51Var) {
    }

    public void setRenderProcessGoneListener(k070 k070Var) {
    }

    public void setSafebrowsingManager(vdm0 vdm0Var) {
    }

    public void setSbListener(qsw qswVar) {
    }

    public void setSslErrorListener(rsw rswVar) {
    }

    public void setUrlLoadingDelegate(hn51 hn51Var) {
    }

    public void setYandexUuidChangeListener(cn51 cn51Var) {
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(final WebView webView, WebResourceRequest webResourceRequest) {
        final String uri = webResourceRequest.getUrl().toString();
        webView.post(new Runnable() { // from class: com.yandex.android.webview.view.b
            @Override // java.lang.Runnable
            public final void run() {
                SystemInternalWebClient.this.lambda$shouldInterceptRequest$0(webView, uri);
            }
        });
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.mFutureUrl = str;
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    private boolean isMainFrame(WebView webView, String str) {
        return isMainFrame(webView.getUrl(), str);
    }
}
