package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class InvalidAssetUrlError extends VungleError {
    public InvalidAssetUrlError(String str) {
        super(Sdk.SDKError.Reason.INVALID_ASSET_URL, str, null);
    }
}
