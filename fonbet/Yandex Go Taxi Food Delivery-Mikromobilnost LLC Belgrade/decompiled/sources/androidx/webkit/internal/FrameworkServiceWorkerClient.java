package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import defpackage.kxq0;

/* loaded from: classes10.dex */
public class FrameworkServiceWorkerClient extends ServiceWorkerClient {
    private final kxq0 mImpl;

    public FrameworkServiceWorkerClient(kxq0 kxq0Var) {
        this.mImpl = kxq0Var;
    }

    @Override // android.webkit.ServiceWorkerClient
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.mImpl.shouldInterceptRequest(webResourceRequest);
    }
}
