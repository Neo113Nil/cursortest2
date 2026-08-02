package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class AssetWriteError extends VungleError {
    public AssetWriteError(String str) {
        super(Sdk.SDKError.Reason.ASSET_WRITE_ERROR, str, null);
    }
}
