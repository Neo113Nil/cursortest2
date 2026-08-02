package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class InvalidCTAUrl extends VungleError {
    public InvalidCTAUrl(String str) {
        super(Sdk.SDKError.Reason.INVALID_CTA_URL, str, null);
    }
}
