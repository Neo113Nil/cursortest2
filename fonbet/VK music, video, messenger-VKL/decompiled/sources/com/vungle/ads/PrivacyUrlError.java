package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class PrivacyUrlError extends VungleError {
    public PrivacyUrlError(String str) {
        super(Sdk.SDKError.Reason.PRIVACY_URL_ERROR, d.a("Failed to open privacy url: ", str), null);
    }
}
