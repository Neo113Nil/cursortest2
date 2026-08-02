package xsna;

import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.holders.RadioStationVh;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;

/* compiled from: RadioStationVh.kt */
/* loaded from: classes16.dex */
public final class eve0 extends e.a {
    public final /* synthetic */ RadioStationVh b;

    public eve0(RadioStationVh radioStationVh) {
        this.b = radioStationVh;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        PlayerTrack playerTrack;
        RadioStationVh radioStationVh;
        UIBlockRadioStation uIBlockRadioStation;
        if (fVar == null || (playerTrack = fVar.c) == null || playerTrack.b == null || (uIBlockRadioStation = (radioStationVh = this.b).k) == null) {
            return;
        }
        radioStationVh.N6(uIBlockRadioStation);
    }
}
