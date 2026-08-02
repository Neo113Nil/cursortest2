package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class InvalidCSBDataError extends VungleError {
    public InvalidCSBDataError(String str) {
        super(Sdk.SDKError.Reason.INVALID_CSB_DATA, d.a("Invalid CSB data: ", str), null);
    }
}
