package xsna;

import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.ExternalAudio;
import com.vk.dto.music.MusicTrack;

/* compiled from: UIBlockRadioStation.kt */
/* loaded from: classes16.dex */
public final class qwp0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final MusicTrack a(RadioStation radioStation) {
        String str = null;
        return new MusicTrack(radioStation.b, radioStation.g ? o25.a().c() : UserId.d, radioStation.e, null, 0, 0, null, radioStation.f, null, 0, false, false, 0, null, false, new AlbumLink(0, UserId.d, null, str, radioStation.c, null, 32, null), null, false, null, null, null, null, null, radioStation.i, 0L, 0, false, 0L, null, false, false, false, new ExternalAudio(null, 0 == true ? 1 : 0, str, 2, 6, null), null, null, null, false, false, 0, null, false, 0, false, null, null, false, 0, null, false, null, null, null, -8421512, 1048574, null);
    }
}
