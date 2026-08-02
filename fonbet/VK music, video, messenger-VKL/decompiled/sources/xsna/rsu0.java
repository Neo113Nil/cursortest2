package xsna;

import com.vk.dto.music.ExternalAudio;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: VkExternalAudioBottomSheetActionsFactory.kt */
/* loaded from: classes3.dex */
public final class rsu0 implements gc40<MusicTrack> {
    public final MusicTrack b;
    public final u2b0 c;

    public rsu0(MusicTrack musicTrack, ia50 ia50Var, u2b0 u2b0Var) {
        this.b = musicTrack;
        this.c = u2b0Var;
    }

    @Override // xsna.gc40
    public final List<ec40<MusicTrack>> a() {
        ArrayList arrayList = new ArrayList();
        MusicTrack musicTrack = this.b;
        ExternalAudio externalAudio = musicTrack.H;
        if ((externalAudio != null ? externalAudio.c : null) != null) {
            arrayList.add(new ec40(R.id.music_action_longread_open, musicTrack, R.string.music_setting_go_to_longread, R.drawable.vk_icon_article_outline_28, false, false, 496));
        }
        if (!this.c.m0().i()) {
            arrayList.add(new ec40(R.id.music_action_setting_player_timer, this.b, R.string.music_sleep_timer, R.drawable.vk_icon_moon_outline_28, false, false, 496));
        }
        return arrayList;
    }

    @Override // xsna.gc40
    public final EmptyList c() {
        return EmptyList.b;
    }
}
