package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class NativeVideoPlaybackError extends VungleError {
    public NativeVideoPlaybackError(String str) {
        super(Sdk.SDKError.Reason.NATIVE_VIDEO_PLAYBACK_ERROR, str, null);
    }
}
