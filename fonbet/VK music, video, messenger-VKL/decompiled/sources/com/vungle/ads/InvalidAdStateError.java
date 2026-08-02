package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class InvalidAdStateError extends VungleError {
    public /* synthetic */ InvalidAdStateError(Sdk.SDKError.Reason reason, String str, int i, zcl zclVar) {
        this(reason, (i & 2) != 0 ? "Ad state is invalid" : str);
    }

    public InvalidAdStateError(Sdk.SDKError.Reason reason, String str) {
        super(reason, str, null);
    }
}
