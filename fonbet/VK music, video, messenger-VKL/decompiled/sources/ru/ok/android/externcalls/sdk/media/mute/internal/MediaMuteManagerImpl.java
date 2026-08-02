package ru.ok.android.externcalls.sdk.media.mute.internal;

import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: MediaMuteManagerImpl.kt */
/* loaded from: classes9.dex */
public final class MediaMuteManagerImpl implements MediaMuteManager, MediaMuteCommandExecutor, MediaMuteListenerManager {
    private final MediaMuteCommandExecutor commandExecutor;
    private final MediaMuteListenerManager listenerManager;

    public MediaMuteManagerImpl(MediaMuteCommandExecutor mediaMuteCommandExecutor, MediaMuteListenerManager mediaMuteListenerManager) {
        this.commandExecutor = mediaMuteCommandExecutor;
        this.listenerManager = mediaMuteListenerManager;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager
    public void addListener(MediaMuteManagerListener mediaMuteManagerListener) {
        this.listenerManager.addListener(mediaMuteManagerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public MediaOptions getMediaOptionsForCall(SessionRoomId sessionRoomId) {
        return this.commandExecutor.getMediaOptionsForCall(sessionRoomId);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public MediaOptions getMediaOptionsForCurrentUser() {
        return this.commandExecutor.getMediaOptionsForCurrentUser();
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager
    public void removeListener(MediaMuteManagerListener mediaMuteManagerListener) {
        this.listenerManager.removeListener(mediaMuteManagerListener);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForAll(Set<? extends MediaOption> set, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.requestToEnableMediaForAll(set, sessionRoomId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void requestToEnableMediaForParticipant(Set<? extends MediaOption> set, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.requestToEnableMediaForParticipant(set, participantId, sessionRoomId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void setAudioPlayoutMuted(boolean z) {
        this.commandExecutor.setAudioPlayoutMuted(z);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForAll(Map<MediaOption, ? extends MediaOptionState> map, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.updateMediaOptionsForAll(map, sessionRoomId, gzsVar, izsVar);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public void updateMediaOptionsForParticipant(Map<MediaOption, ? extends MediaOptionState> map, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        this.commandExecutor.updateMediaOptionsForParticipant(map, participantId, sessionRoomId, gzsVar, izsVar);
    }
}
