package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class AdRetryError extends VungleError {
    public AdRetryError() {
        super(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER, "Ads retry-after: Server is busy", null);
    }
}
