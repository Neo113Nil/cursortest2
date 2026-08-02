package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class InvalidTemplateURLError extends VungleError {
    public InvalidTemplateURLError(String str) {
        super(Sdk.SDKError.Reason.INVALID_TEMPLATE_URL, str, null);
    }
}
