package com.vungle.ads;

import com.iab.omid.library.vungle.d;
import com.vungle.ads.internal.protos.Sdk;
import xsna.zcl;

/* loaded from: classes7.dex */
public final class AdExpiredOnPlayError extends VungleError {
    /* JADX WARN: Multi-variable type inference failed */
    public AdExpiredOnPlayError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ AdExpiredOnPlayError(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    public AdExpiredOnPlayError(String str) {
        super(Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY, d.a("Ad expired upon playback request: ", str), null);
    }
}
