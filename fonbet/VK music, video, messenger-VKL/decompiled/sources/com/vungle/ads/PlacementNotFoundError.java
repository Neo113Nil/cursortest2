package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import xsna.zr;

/* loaded from: classes7.dex */
public final class PlacementNotFoundError extends VungleError {
    public PlacementNotFoundError(String str) {
        super(Sdk.SDKError.Reason.INVALID_PLACEMENT_ID, zr.a("Placement '", str, "' is invalid"), null);
    }
}
