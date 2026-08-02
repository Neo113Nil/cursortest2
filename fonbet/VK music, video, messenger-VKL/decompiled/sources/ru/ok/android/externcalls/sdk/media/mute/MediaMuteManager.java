package ru.ok.android.externcalls.sdk.media.mute;

import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MediaMuteManager.kt */
/* loaded from: classes9.dex */
public interface MediaMuteManager {
    static /* synthetic */ MediaOptions getMediaOptionsForCall$default(MediaMuteManager mediaMuteManager, SessionRoomId sessionRoomId, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMediaOptionsForCall");
        }
        if ((i & 1) != 0) {
            sessionRoomId = null;
        }
        return mediaMuteManager.getMediaOptionsForCall(sessionRoomId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void requestToEnableMediaForAll$default(MediaMuteManager mediaMuteManager, Set set, SessionRoomId sessionRoomId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestToEnableMediaForAll");
        }
        if ((i & 2) != 0) {
            sessionRoomId = null;
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        mediaMuteManager.requestToEnableMediaForAll(set, sessionRoomId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void requestToEnableMediaForParticipant$default(MediaMuteManager mediaMuteManager, Set set, ParticipantId participantId, SessionRoomId sessionRoomId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestToEnableMediaForParticipant");
        }
        if ((i & 4) != 0) {
            sessionRoomId = null;
        }
        if ((i & 8) != 0) {
            gzsVar = null;
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        mediaMuteManager.requestToEnableMediaForParticipant(set, participantId, sessionRoomId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void updateMediaOptionsForAll$default(MediaMuteManager mediaMuteManager, Map map, SessionRoomId sessionRoomId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMediaOptionsForAll");
        }
        if ((i & 2) != 0) {
            sessionRoomId = null;
        }
        if ((i & 4) != 0) {
            gzsVar = null;
        }
        if ((i & 8) != 0) {
            izsVar = null;
        }
        mediaMuteManager.updateMediaOptionsForAll(map, sessionRoomId, gzsVar, izsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void updateMediaOptionsForParticipant$default(MediaMuteManager mediaMuteManager, Map map, ParticipantId participantId, SessionRoomId sessionRoomId, gzs gzsVar, izs izsVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateMediaOptionsForParticipant");
        }
        if ((i & 4) != 0) {
            sessionRoomId = null;
        }
        if ((i & 8) != 0) {
            gzsVar = null;
        }
        if ((i & 16) != 0) {
            izsVar = null;
        }
        mediaMuteManager.updateMediaOptionsForParticipant(map, participantId, sessionRoomId, gzsVar, izsVar);
    }

    void addListener(MediaMuteManagerListener mediaMuteManagerListener);

    MediaOptions getMediaOptionsForCall(SessionRoomId sessionRoomId);

    MediaOptions getMediaOptionsForCurrentUser();

    void removeListener(MediaMuteManagerListener mediaMuteManagerListener);

    void requestToEnableMediaForAll(Set<? extends MediaOption> set, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void requestToEnableMediaForParticipant(Set<? extends MediaOption> set, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void setAudioPlayoutMuted(boolean z);

    void updateMediaOptionsForAll(Map<MediaOption, ? extends MediaOptionState> map, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);

    void updateMediaOptionsForParticipant(Map<MediaOption, ? extends MediaOptionState> map, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar);
}
