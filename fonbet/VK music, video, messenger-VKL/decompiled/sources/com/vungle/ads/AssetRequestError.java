package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class AssetRequestError extends VungleError {
    public AssetRequestError(String str) {
        super(Sdk.SDKError.Reason.ASSET_REQUEST_ERROR, str, null);
    }
}
