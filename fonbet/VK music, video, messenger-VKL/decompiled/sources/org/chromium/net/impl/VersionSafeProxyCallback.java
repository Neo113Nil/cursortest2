package org.chromium.net.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.Proxy;
import org.chromium.net.impl.VersionSafeCallbacks;
import xsna.tgw;

/* loaded from: classes8.dex */
final class VersionSafeProxyCallback {
    private static final int PROXY_CALLBACK_API_LEVEL = 38;

    @NonNull
    private final Proxy.Callback mBackend;

    public VersionSafeProxyCallback(@NonNull Proxy.Callback callback) {
        if (!apiContainsProxyCallbackClass()) {
            throw new AssertionError(tgw.b(VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel(), "This should not have been created: the Cronet API being used has an ApiLevel of ", ", but ProxyCallback was added in ApiLevel 38"));
        }
        Objects.requireNonNull(callback);
        this.mBackend = callback;
    }

    private boolean apiContainsProxyCallbackClass() {
        return VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel() >= 38;
    }

    @Nullable
    public List<Map.Entry<String, String>> onBeforeTunnelRequest() {
        return this.mBackend.onBeforeTunnelRequest();
    }

    public boolean onTunnelHeadersReceived(@NonNull List<Map.Entry<String, String>> list, int i) {
        return this.mBackend.onTunnelHeadersReceived(list, i);
    }
}
