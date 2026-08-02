package xsna;

import com.vk.voip.ui.hint.VoipHintView;
import com.vk.voip.ui.hint.a;
import com.vkontakte.android.R;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import ru.ok.android.webrtc.media_options.MediaOption;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.media.MuteEvent;
import xsna.j9d0;

/* compiled from: VoipMediaOptionsStateListener.kt */
/* loaded from: classes7.dex */
public final class lsw0 implements ys10 {
    public final com.vk.voip.ui.hint.a a;
    public final i9d0 b;

    public lsw0(com.vk.voip.ui.hint.a aVar, i9d0 i9d0Var) {
        this.a = aVar;
        this.b = i9d0Var;
    }

    @Override // xsna.ys10
    public final void a(MuteEvent muteEvent, boolean z) {
        Pair pair;
        boolean z2;
        Map<MediaOption, MediaOptionState> changedMediaOptionsState = muteEvent.getChangedMediaOptionsState();
        MediaOption mediaOption = MediaOption.AUDIO;
        MediaOptionState mediaOptionState = changedMediaOptionsState.get(mediaOption);
        Map<MediaOption, MediaOptionState> changedMediaOptionsState2 = muteEvent.getChangedMediaOptionsState();
        MediaOption mediaOption2 = MediaOption.VIDEO;
        MediaOptionState mediaOptionState2 = changedMediaOptionsState2.get(mediaOption2);
        MediaOptionState mediaOptionState3 = muteEvent.getChangedMediaOptionsState().get(MediaOption.SCREEN_SHARING);
        Set y0 = rl3.y0(new MediaOptionState[]{MediaOptionState.MUTED_PERMANENT, MediaOptionState.UNMUTED_BUT_MUTED_ONCE});
        boolean P = j5g.P(y0, mediaOptionState);
        boolean P2 = j5g.P(y0, mediaOptionState2);
        boolean P3 = j5g.P(y0, mediaOptionState3);
        com.vk.voip.ui.hint.a aVar = this.a;
        if (!z) {
            com.vk.voip.ui.c.b.getClass();
            boolean z3 = com.vk.voip.ui.c.v;
            if (!com.vk.voip.ui.c.z0()) {
                rah0 rah0Var = com.vk.voip.ui.c.g;
                if (rah0Var == null) {
                    rah0Var = null;
                }
                if (!rah0Var.b()) {
                    z2 = false;
                    aVar.e(mediaOptionState, mediaOptionState2, z3, z2);
                }
            }
            z2 = true;
            aVar.e(mediaOptionState, mediaOptionState2, z3, z2);
        }
        if (P || P2 || P3) {
            if (P) {
                com.vk.voip.ui.c.b.A0();
            }
            if (P2) {
                com.vk.voip.ui.c.b.q1();
            }
            if (P3) {
                com.vk.voip.ui.c.b.getClass();
                rah0 rah0Var2 = com.vk.voip.ui.c.g;
                (rah0Var2 != null ? rah0Var2 : null).d();
            }
        } else if (!z) {
            MediaOptionState mediaOptionState4 = muteEvent.getChangedMediaOptionsState().get(mediaOption);
            MediaOptionState mediaOptionState5 = muteEvent.getChangedMediaOptionsState().get(mediaOption2);
            com.vk.voip.ui.c.b.getClass();
            boolean z0 = com.vk.voip.ui.c.z0();
            boolean z4 = com.vk.voip.ui.c.v;
            Set<MediaOption> requestedMedia = muteEvent.getRequestedMedia();
            if (requestedMedia.isEmpty()) {
                VoipHintView voipHintView = aVar.a;
                a.EnumC2056a enumC2056a = a.EnumC2056a.MuteStateChanged;
                if (enumC2056a.h() >= aVar.a()) {
                    Set y02 = rl3.y0(new MediaOptionState[]{MediaOptionState.MUTED_PERMANENT_BUT_UNMUTED_ONCE, MediaOptionState.UNMUTED});
                    boolean P4 = j5g.P(y02, mediaOptionState4);
                    boolean P5 = j5g.P(y02, mediaOptionState5);
                    if (P4 && !z4) {
                        pair = new Pair(Integer.valueOf(R.drawable.vk_icon_voice_outline_28), Integer.valueOf(R.string.voip_admin_granted_mic_access_to_you));
                    } else if (P5 && !z0) {
                        pair = new Pair(Integer.valueOf(R.drawable.vk_icon_videocam_outline_28), Integer.valueOf(R.string.voip_admin_granted_video_access_to_you));
                    }
                    voipHintView.a(new VoipHintView.a(voipHintView.getResources().getString(((Number) pair.g()).intValue()), Integer.valueOf(((Number) pair.d()).intValue()), null, null, false, 28));
                    voipHintView.setVisibility(0);
                    aVar.i = enumC2056a;
                    aVar.j(io.reactivex.rxjava3.core.a.s(3000L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new u00(aVar, 7)));
                }
            } else if (requestedMedia.contains(mediaOption) && ((requestedMedia.contains(mediaOption2) || !z4) && (!z4 || !z0))) {
                com.vk.voip.ui.c.S0(new rp80(!requestedMedia.contains(mediaOption2)));
            }
        }
        this.b.i.onNext(new j9d0.c(mediaOptionState, mediaOptionState2, P, P2));
    }
}
