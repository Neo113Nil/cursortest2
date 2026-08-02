package xsna;

import com.vk.log.L;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.media_options.MediaOptions;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: MediaMuteManagerStub.kt */
/* loaded from: classes7.dex */
public final class vs10 implements MediaMuteManager {
    public static void a() {
        L.G("VoipMediaMuteDelegateImpl", "Use managerStub!");
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager
    public final void addListener(MediaMuteManagerListener mediaMuteManagerListener) {
        a();
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public final MediaOptions getMediaOptionsForCall(SessionRoomId sessionRoomId) {
        a();
        return new MediaOptions(null, null, null, null, 15, null);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public final MediaOptions getMediaOptionsForCurrentUser() {
        a();
        return new MediaOptions(null, null, null, null, 15, null);
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager
    public final void removeListener(MediaMuteManagerListener mediaMuteManagerListener) {
        a();
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public final void requestToEnableMediaForAll(Set<? extends MediaOption> set, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        a();
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public final void requestToEnableMediaForParticipant(Set<? extends MediaOption> set, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        a();
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public final void setAudioPlayoutMuted(boolean z) {
        a();
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public final void updateMediaOptionsForAll(Map<MediaOption, ? extends MediaOptionState> map, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        a();
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager, ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutor
    public final void updateMediaOptionsForParticipant(Map<MediaOption, ? extends MediaOptionState> map, ParticipantId participantId, SessionRoomId sessionRoomId, gzs<s3q0> gzsVar, izs<? super Throwable, s3q0> izsVar) {
        a();
    }
}
