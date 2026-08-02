package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class AdExpiredError extends VungleError {
    public AdExpiredError(String str) {
        super(Sdk.SDKError.Reason.AD_EXPIRED, d.a("Ad expired: ", str), null);
    }
}
