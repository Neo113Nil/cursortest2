package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class InvalidBannerSizeError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public InvalidBannerSizeError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ InvalidBannerSizeError(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    public InvalidBannerSizeError(String str) {
        super(Sdk.SDKError.Reason.BANNER_VIEW_INVALID_SIZE, d.a("Invalidate size for banner ad: ", str), null);
    }
}
