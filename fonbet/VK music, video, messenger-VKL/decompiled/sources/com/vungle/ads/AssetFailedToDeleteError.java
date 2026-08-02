package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class AssetFailedToDeleteError extends VungleError {
    public AssetFailedToDeleteError(String str) {
        super(Sdk.SDKError.Reason.ASSET_FAILED_TO_DELETE, str, null);
    }
}
