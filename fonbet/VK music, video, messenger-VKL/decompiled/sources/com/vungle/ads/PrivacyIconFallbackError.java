package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class PrivacyIconFallbackError extends VungleError {
    public PrivacyIconFallbackError(String str) {
        super(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR, str, null);
    }
}
