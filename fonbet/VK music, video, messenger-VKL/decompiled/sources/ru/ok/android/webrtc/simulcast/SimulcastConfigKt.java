package ru.ok.android.webrtc.simulcast;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.android.webrtc.simulcast.SimulcastLayerInfo;

/* loaded from: classes9.dex */
public final class SimulcastConfigKt {
    public static final SimulcastLayerInfo high(SimulcastLayerInfo.Companion companion, boolean z, SimulcastDirection simulcastDirection) {
        return new SimulcastLayerInfo("h", simulcastDirection, z, 1.0d, 1317000, 19300, 30, null, VideoRecord.DEFAULT_MAX_DIMENSION, 540, 128, null);
    }

    public static /* synthetic */ SimulcastLayerInfo high$default(SimulcastLayerInfo.Companion companion, boolean z, SimulcastDirection simulcastDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            simulcastDirection = SimulcastDirection.SEND;
        }
        return high(companion, z, simulcastDirection);
    }

    public static final SimulcastLayerInfo low(SimulcastLayerInfo.Companion companion, boolean z, SimulcastDirection simulcastDirection) {
        return new SimulcastLayerInfo("l", simulcastDirection, z, 4.0d, 146000, 2130, 30, null, PsExtractor.VIDEO_STREAM_MASK, 144, 128, null);
    }

    public static /* synthetic */ SimulcastLayerInfo low$default(SimulcastLayerInfo.Companion companion, boolean z, SimulcastDirection simulcastDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            simulcastDirection = SimulcastDirection.SEND;
        }
        return low(companion, z, simulcastDirection);
    }

    public static final SimulcastLayerInfo medium(SimulcastLayerInfo.Companion companion, boolean z, SimulcastDirection simulcastDirection) {
        return new SimulcastLayerInfo(InneractiveMediationDefs.GENDER_MALE, simulcastDirection, z, 1.5d, 585000, 8570, 30, null, 640, 360, 128, null);
    }

    public static /* synthetic */ SimulcastLayerInfo medium$default(SimulcastLayerInfo.Companion companion, boolean z, SimulcastDirection simulcastDirection, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            simulcastDirection = SimulcastDirection.SEND;
        }
        return medium(companion, z, simulcastDirection);
    }
}
