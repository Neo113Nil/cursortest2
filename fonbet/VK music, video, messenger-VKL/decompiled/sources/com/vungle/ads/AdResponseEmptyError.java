package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class AdResponseEmptyError extends VungleError {
    public AdResponseEmptyError(String str) {
        super(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY, str, null);
    }
}
