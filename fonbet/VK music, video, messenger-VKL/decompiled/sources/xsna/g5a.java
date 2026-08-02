package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoAudioDto;
import com.vk.dto.music.MusicTrack;
import com.vk.internal.api.GsonHolder;
import org.json.JSONObject;

/* compiled from: CatalogExtendedData.kt */
/* loaded from: classes16.dex */
public final class g5a extends aay<MusicTrack> {
    @Override // xsna.aay
    public final MusicTrack a(JSONObject jSONObject) {
        return sfj0.c((ShortVideoAudioDto) GsonHolder.a().fromJson(jSONObject.toString(), ShortVideoAudioDto.class));
    }
}
