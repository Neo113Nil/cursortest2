package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class EmptyBidPayloadError extends VungleError {
    public EmptyBidPayloadError(String str) {
        super(Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD, d.a(str, " header bidding status does not match with loadAd parameters"), null);
    }
}
