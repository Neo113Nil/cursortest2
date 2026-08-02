package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class SdkNotInitialized extends VungleError {
    public SdkNotInitialized(String str) {
        super(Sdk.SDKError.Reason.SDK_NOT_INITIALIZED, str, null);
    }
}
