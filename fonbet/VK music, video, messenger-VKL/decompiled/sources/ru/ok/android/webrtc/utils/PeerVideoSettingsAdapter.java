package ru.ok.android.webrtc.utils;

import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.PeerVideoSettings;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import xsna.zcl;

@CallInternalApi
/* loaded from: classes9.dex */
public final class PeerVideoSettingsAdapter {
    public static final Companion Companion = new Companion(null);
    public boolean a;
    public int b = VideoRecord.DEFAULT_MAX_DIMENSION;

    public static final class Companion {
        public Companion(zcl zclVar) {
        }
    }

    public final PeerVideoSettings applyOverride(PeerVideoSettings peerVideoSettings) {
        return this.a ? PeerVideoSettings.copy$default(peerVideoSettings, this.b, 0, 0, 0, null, null, 0, 0, null, 510, null) : peerVideoSettings;
    }

    public final int getOverrideMaxDimension() {
        return this.b;
    }

    public final boolean isMaxDimensionOverrideEnabled() {
        return this.a;
    }

    public final void setMaxDimensionOverrideEnabled(boolean z) {
        this.a = z;
    }

    public final void setOverrideMaxDimension(int i) {
        this.b = i;
    }
}
