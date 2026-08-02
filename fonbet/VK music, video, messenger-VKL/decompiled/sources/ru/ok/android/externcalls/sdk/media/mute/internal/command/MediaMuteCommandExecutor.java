package ru.ok.android.externcalls.sdk.media.mute.internal.command;

import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MediaMuteCommandExecutor.kt */
/* loaded from: classes9.dex */
public interface MediaMuteCommandExecutor {
    MediaOptions getMediaOptionsForCall(SessionRoomId sessionRoomId);

    MediaOptions getMediaOptionsForCurrentUser();

    void requestToEnableMediaForAll(Set<? extends MediaOption> set, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void requestToEnableMediaForParticipant(Set<? extends MediaOption> set, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void setAudioPlayoutMuted(boolean z);

    void updateMediaOptionsForAll(Map<MediaOption, ? extends MediaOptionState> map, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void updateMediaOptionsForParticipant(Map<MediaOption, ? extends MediaOptionState> map, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
