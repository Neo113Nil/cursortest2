package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class InvalidEventIdError extends VungleError {
    public InvalidEventIdError(String str) {
        super(Sdk.SDKError.Reason.INVALID_EVENT_ID_ERROR, str, null);
    }
}
