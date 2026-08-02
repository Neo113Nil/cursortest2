package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class EvaluateJsError extends VungleError {
    public EvaluateJsError(String str) {
        super(Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED, str, null);
    }
}
