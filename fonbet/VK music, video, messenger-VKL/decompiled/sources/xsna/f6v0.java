package xsna;

import com.vk.music.player.MusicCountDownTimer;
import com.vk.music.player.PlayerMode;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioPlayerUiClickItem;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioSourceEnum;
import com.vkontakte.android.R;
import java.util.concurrent.TimeUnit;
import xsna.ec40;

/* compiled from: VkMusicSleepTimerClickListener.kt */
/* loaded from: classes3.dex */
public final class f6v0 implements ec40.a<Long> {
    public final com.vk.music.player.d b;

    public f6v0(com.vk.music.player.d dVar) {
        this.b = dVar;
    }

    @Override // xsna.ec40.a
    public final /* bridge */ /* synthetic */ boolean a(Long l) {
        l.longValue();
        return false;
    }

    @Override // xsna.ec40.a
    public final boolean b(ec40<Long> ec40Var) {
        int i = ec40Var.a;
        com.vk.music.player.d dVar = this.b;
        if (i == R.id.music_action_cancel_music_sleep_timer) {
            CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum = CommonAudioStat$TypeAudioSourceEnum.RADIO_PLAYER_MENU;
            u750 u750Var = dVar.b;
            bn40.f(com.vk.music.player.d.f, "cancel");
            dVar.d.a();
            if (dVar.a.z0()) {
                u750Var.R(commonAudioStat$TypeAudioSourceEnum);
            } else {
                u750Var.x0();
                u750Var.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TIMER_SET, PlayerMode.AUDIO);
            }
            cvk.u(R.string.music_sleep_timer_disabled_toast, false);
            return true;
        }
        long longValue = ec40Var.b.longValue();
        CommonAudioStat$TypeAudioSourceEnum commonAudioStat$TypeAudioSourceEnum2 = CommonAudioStat$TypeAudioSourceEnum.RADIO_PLAYER_MENU;
        u750 u750Var2 = dVar.b;
        bn40.f(com.vk.music.player.d.f, "timerToStartMs = ", Long.valueOf(longValue));
        u2b0 u2b0Var = dVar.a;
        if (!u2b0Var.m0().i()) {
            MusicCountDownTimer musicCountDownTimer = dVar.d;
            musicCountDownTimer.getClass();
            bn40.f(MusicCountDownTimer.i, "startTimeMs = ", Long.valueOf(longValue));
            musicCountDownTimer.a();
            musicCountDownTimer.c = MusicCountDownTimer.State.TICKING;
            musicCountDownTimer.d = new com.vk.music.player.c(longValue, musicCountDownTimer, musicCountDownTimer.a).start();
            if (u2b0Var.z0()) {
                u750Var2.Y0((int) TimeUnit.MILLISECONDS.toSeconds(longValue), commonAudioStat$TypeAudioSourceEnum2);
            } else {
                u750Var2.g0(TimeUnit.MILLISECONDS.toSeconds(longValue));
                u750Var2.k0(CommonAudioStat$TypeAudioPlayerUiClickItem.EventType.TAP_TIMER_CONFIRM_SET, PlayerMode.AUDIO);
            }
        }
        cvk.u(R.string.music_sleep_timer_enabled_toast, false);
        return true;
    }
}
