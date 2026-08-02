package org.chromium.net.impl;

import android.net.http.UrlRequest$StatusListener;
import org.chromium.net.UrlRequest;

/* loaded from: classes8.dex */
class AndroidUrlRequestStatusListenerWrapper implements UrlRequest$StatusListener {
    private final UrlRequest.StatusListener mBackend;

    public AndroidUrlRequestStatusListenerWrapper(UrlRequest.StatusListener statusListener) {
        this.mBackend = statusListener;
    }

    public void onStatus(int i) {
        this.mBackend.onStatus(i);
    }
}
