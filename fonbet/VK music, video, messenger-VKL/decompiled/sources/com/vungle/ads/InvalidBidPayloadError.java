package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class InvalidBidPayloadError extends VungleError {
    public InvalidBidPayloadError() {
        super(Sdk.SDKError.Reason.INVALID_BID_PAYLOAD, "Unable to create data object from payload string.", null);
    }
}
