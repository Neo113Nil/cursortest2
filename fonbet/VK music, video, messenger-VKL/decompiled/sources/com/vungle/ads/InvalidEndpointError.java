package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class InvalidEndpointError extends VungleError {
    public InvalidEndpointError(Sdk.SDKError.Reason reason, String str) {
        super(reason, str, null);
    }
}
