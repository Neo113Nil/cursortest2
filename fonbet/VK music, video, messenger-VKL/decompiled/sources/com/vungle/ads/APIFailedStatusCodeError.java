package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class APIFailedStatusCodeError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public APIFailedStatusCodeError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ APIFailedStatusCodeError(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    public APIFailedStatusCodeError(String str) {
        super(Sdk.SDKError.Reason.API_FAILED_STATUS_CODE, d.a("Failed to get a successful response: ", str), null);
    }
}
