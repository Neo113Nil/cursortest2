package xsna;

import com.vk.catalog2.feature.music.dto.ui.UIBlockRadioStation;
import com.vk.catalog2.feature.music.holders.RadioStationCellVh;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.e;

/* compiled from: RadioStationCellVh.kt */
/* loaded from: classes16.dex */
public final class yue0 extends e.a {
    public final /* synthetic */ RadioStationCellVh b;

    public yue0(RadioStationCellVh radioStationCellVh) {
        this.b = radioStationCellVh;
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        PlayerTrack playerTrack;
        RadioStationCellVh radioStationCellVh;
        UIBlockRadioStation uIBlockRadioStation;
        if (fVar == null || (playerTrack = fVar.c) == null || playerTrack.b == null || (uIBlockRadioStation = (radioStationCellVh = this.b).g) == null) {
            return;
        }
        radioStationCellVh.N6(uIBlockRadioStation);
    }
}
