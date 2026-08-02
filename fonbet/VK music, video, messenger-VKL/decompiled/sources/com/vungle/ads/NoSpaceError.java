package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class NoSpaceError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public NoSpaceError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ NoSpaceError(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? "No space left on device" : str);
    }

    public NoSpaceError(String str) {
        super(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE, str, null);
    }
}
