package org.chromium.net.impl;

import androidx.annotation.Nullable;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes8.dex */
class AndroidRequestFinishedInfoWrapper extends RequestFinishedInfoImpl {
    private static final String TAG = "RequestFinishedInfoImpl";
    private static boolean sListenerSupportLimitedLogged;

    private AndroidRequestFinishedInfoWrapper(String str, Collection<Object> collection, RequestFinishedInfo.Metrics metrics, int i, @Nullable UrlResponseInfo urlResponseInfo, @Nullable CronetException cronetException) {
        super(str, collection, metrics, i, urlResponseInfo, cronetException);
    }

    public static void reportFinished(AndroidHttpEngineWrapper androidHttpEngineWrapper, String str, Collection<Object> collection, VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        androidHttpEngineWrapper.reportRequestFinished(new AndroidRequestFinishedInfoWrapper(str, collection, new CronetMetrics(-1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, -1L, false, -1L, -1L), i, urlResponseInfo, cronetException), requestFinishedInfoListener);
    }

    @Override // org.chromium.net.impl.RequestFinishedInfoImpl, org.chromium.net.RequestFinishedInfo
    public RequestFinishedInfo.Metrics getMetrics() {
        if (!sListenerSupportLimitedLogged) {
            sListenerSupportLimitedLogged = true;
        }
        return super.getMetrics();
    }
}
