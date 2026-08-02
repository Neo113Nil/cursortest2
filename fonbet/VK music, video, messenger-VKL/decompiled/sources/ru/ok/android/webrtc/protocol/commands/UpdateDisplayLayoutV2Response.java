package ru.ok.android.webrtc.protocol.commands;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Objects;
import ru.ok.android.webrtc.protocol.RtcResponse;
import ru.ok.android.webrtc.videotracks.CallVideoTrackParticipantKey;
import xsna.cjl0;

/* loaded from: classes9.dex */
public class UpdateDisplayLayoutV2Response implements RtcResponse {

    @NonNull
    public final Map<CallVideoTrackParticipantKey, Error> participantsToErrorMap;

    public enum Error {
        UNKNOWN,
        NOT_ENOUGH_VIDEO_TRACKS
    }

    public UpdateDisplayLayoutV2Response(@NonNull Map<CallVideoTrackParticipantKey, Error> map) {
        this.participantsToErrorMap = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.participantsToErrorMap.equals(((UpdateDisplayLayoutV2Response) obj).participantsToErrorMap);
    }

    public int hashCode() {
        return Objects.hash(this.participantsToErrorMap);
    }

    public String toString() {
        return cjl0.a(new StringBuilder("UpdateDisplayLayoutCommandV2Response{participantsToErrorMap="), this.participantsToErrorMap, '}');
    }
}
