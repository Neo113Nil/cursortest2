package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class JsonEncodeError extends VungleError {
    public JsonEncodeError(String str) {
        super(Sdk.SDKError.Reason.JSON_ENCODE_ERROR, str, null);
    }
}
