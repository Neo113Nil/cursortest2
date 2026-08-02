package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class InvalidAppId extends VungleError {
    public InvalidAppId(String str) {
        super(Sdk.SDKError.Reason.INVALID_APP_ID, str, null);
    }
}
