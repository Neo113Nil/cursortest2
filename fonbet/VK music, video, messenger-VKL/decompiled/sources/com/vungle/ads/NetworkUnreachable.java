package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class NetworkUnreachable extends VungleError {
    public NetworkUnreachable(String str) {
        super(Sdk.SDKError.Reason.API_REQUEST_ERROR, str, null);
    }
}
