package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class OutOfMemory extends VungleError {
    public OutOfMemory(String str) {
        super(Sdk.SDKError.Reason.OUT_OF_MEMORY, str, null);
    }
}
