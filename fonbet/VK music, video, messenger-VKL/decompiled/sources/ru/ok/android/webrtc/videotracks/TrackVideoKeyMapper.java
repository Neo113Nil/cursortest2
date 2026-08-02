package ru.ok.android.webrtc.videotracks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public interface TrackVideoKeyMapper {
    @Nullable
    CallVideoTrackParticipantKey keyByWebrtcTrackId(@NonNull String str);

    @Nullable
    String webrtcTrackIdByKey(@NonNull CallVideoTrackParticipantKey callVideoTrackParticipantKey);
}
