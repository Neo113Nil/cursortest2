package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class NativeAssetError extends VungleError {
    public NativeAssetError(String str) {
        super(Sdk.SDKError.Reason.NATIVE_ASSET_ERROR, str, null);
    }
}
