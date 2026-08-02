package com.pichillilorenzo.flutter_inappwebview_android.service_worker;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import defpackage.ea20;
import defpackage.hm91;
import defpackage.kxq0;
import defpackage.lxq0;
import defpackage.mxq0;
import java.io.ByteArrayInputStream;
import java.util.Map;

/* loaded from: classes11.dex */
public class ServiceWorkerManager implements Disposable {
    protected static final String LOG_TAG = "ServiceWorkerManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_serviceworkercontroller";
    public static mxq0 serviceWorkerController;
    public ServiceWorkerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public static final class DummyServiceWorkerClientCompat extends kxq0 {
        static final kxq0 INSTANCE = new DummyServiceWorkerClientCompat();

        private DummyServiceWorkerClientCompat() {
        }

        @Override // defpackage.kxq0
        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }
    }

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new ServiceWorkerChannelDelegate(this, new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    private kxq0 dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public static void init() {
        if (serviceWorkerController == null && hm91.d("SERVICE_WORKER_BASIC_USAGE")) {
            serviceWorkerController = lxq0.a;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = this.channelDelegate;
        if (serviceWorkerChannelDelegate != null) {
            serviceWorkerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }

    public void setServiceWorkerClient(Boolean bool) {
        mxq0 mxq0Var = serviceWorkerController;
        if (mxq0Var != null) {
            mxq0Var.b(bool.booleanValue() ? dummyServiceWorkerClientCompat() : new kxq0() { // from class: com.pichillilorenzo.flutter_inappwebview_android.service_worker.ServiceWorkerManager.1
                @Override // defpackage.kxq0
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    WebResourceResponseExt shouldInterceptRequest;
                    WebResourceRequestExt fromWebResourceRequest = WebResourceRequestExt.fromWebResourceRequest(webResourceRequest);
                    ServiceWorkerChannelDelegate serviceWorkerChannelDelegate = ServiceWorkerManager.this.channelDelegate;
                    if (serviceWorkerChannelDelegate != null) {
                        try {
                            shouldInterceptRequest = serviceWorkerChannelDelegate.shouldInterceptRequest(fromWebResourceRequest);
                        } catch (InterruptedException e) {
                            Log.e(ServiceWorkerManager.LOG_TAG, "", e);
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
            });
        }
    }
}
