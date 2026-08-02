package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class PlacementMismatchError extends VungleError {
    public PlacementMismatchError(String str) {
        super(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH, str, null);
    }
}
