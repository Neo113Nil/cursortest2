package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class TpatError extends VungleError {
    public TpatError(Sdk.SDKError.Reason reason, String str) {
        super(reason, str, null);
    }
}
