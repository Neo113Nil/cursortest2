package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class ConcurrentPlaybackUnsupported extends VungleError {
    public ConcurrentPlaybackUnsupported(String str) {
        super(Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED, str, null);
    }
}
