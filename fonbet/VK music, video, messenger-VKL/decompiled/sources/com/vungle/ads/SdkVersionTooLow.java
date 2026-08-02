package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class SdkVersionTooLow extends VungleError {
    public SdkVersionTooLow(String str) {
        super(Sdk.SDKError.Reason.API_REQUEST_ERROR, str, null);
    }
}
