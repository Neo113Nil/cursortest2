package ru.ok.android.externcalls.sdk.id;

import androidx.annotation.Nullable;
import ru.ok.android.webrtc.participant.CallExternalId;

/* loaded from: classes9.dex */
public class CallExternalIdConverter {
    private CallExternalIdConverter() {
    }

    @Nullable
    public static ParticipantId convert(@Nullable CallExternalId callExternalId) {
        if (callExternalId == null) {
            return null;
        }
        return new ParticipantId(callExternalId.getId(), callExternalId.getType() == CallExternalId.Type.ANONYM, callExternalId.getDeviceIndex());
    }
}
