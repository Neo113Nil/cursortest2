package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class AdMarkupInvalidError extends VungleError {
    public AdMarkupInvalidError(String str) {
        super(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD, str, null);
    }
}
