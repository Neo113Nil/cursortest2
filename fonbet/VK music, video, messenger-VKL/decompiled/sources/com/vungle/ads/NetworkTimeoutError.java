package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class NetworkTimeoutError extends VungleError {
    public NetworkTimeoutError() {
        super(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT, "Ads: Network Timeout", null);
    }
}
