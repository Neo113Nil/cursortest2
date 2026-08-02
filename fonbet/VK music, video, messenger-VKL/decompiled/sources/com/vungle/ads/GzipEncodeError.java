package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class GzipEncodeError extends VungleError {
    public GzipEncodeError(String str) {
        super(Sdk.SDKError.Reason.GZIP_ENCODE_ERROR, str, null);
    }
}
