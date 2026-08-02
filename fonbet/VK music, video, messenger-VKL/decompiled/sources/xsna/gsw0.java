package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import xsna.fsw0;

/* compiled from: VoipMediaMuteManagerImpl.kt */
/* loaded from: classes7.dex */
public final class gsw0 implements fsw0 {
    public final om60 a;
    public final vs10 b = new vs10();

    public gsw0(om60 om60Var) {
        this.a = om60Var;
    }

    @Override // xsna.fsw0
    public final void a(ParticipantId participantId, Set set) {
        MediaMuteManager mediaMuteManager = (MediaMuteManager) this.a.invoke();
        if (mediaMuteManager == null) {
            mediaMuteManager = this.b;
        }
        mediaMuteManager.requestToEnableMediaForParticipant(set, participantId, null, null, null);
    }

    @Override // xsna.fsw0
    public final void b(CallMemberId callMemberId, Map<MediaOption, ? extends MediaOptionState> map) {
        ParticipantId participantId = new ParticipantId(callMemberId.b, false, callMemberId.c);
        MediaMuteManager mediaMuteManager = (MediaMuteManager) this.a.invoke();
        if (mediaMuteManager == null) {
            mediaMuteManager = this.b;
        }
        mediaMuteManager.updateMediaOptionsForParticipant(map, participantId, null, null, null);
    }

    @Override // xsna.fsw0
    public final void c(fsw0.a aVar) {
        MediaOptionState mediaOptionState = aVar.a;
        MediaOptionState mediaOptionState2 = aVar.b;
        MediaOptionState mediaOptionState3 = MediaOptionState.UNMUTED;
        if (mediaOptionState != mediaOptionState3 && mediaOptionState2 != mediaOptionState3) {
            f(pn00.k(new Pair(MediaOption.AUDIO, mediaOptionState), new Pair(MediaOption.VIDEO, mediaOptionState2)));
        } else if (mediaOptionState != mediaOptionState3) {
            f(on00.f(new Pair(MediaOption.AUDIO, mediaOptionState)));
        } else if (mediaOptionState2 != mediaOptionState3) {
            f(on00.f(new Pair(MediaOption.VIDEO, mediaOptionState2)));
        }
    }

    @Override // xsna.fsw0
    public final void e(Set set) {
        MediaMuteManager mediaMuteManager = (MediaMuteManager) this.a.invoke();
        if (mediaMuteManager == null) {
            mediaMuteManager = this.b;
        }
        mediaMuteManager.requestToEnableMediaForAll(set, null, null, null);
    }

    @Override // xsna.fsw0
    public final void f(Map map) {
        MediaMuteManager mediaMuteManager = (MediaMuteManager) this.a.invoke();
        if (mediaMuteManager == null) {
            mediaMuteManager = this.b;
        }
        mediaMuteManager.updateMediaOptionsForAll(map, null, null, null);
    }
}
