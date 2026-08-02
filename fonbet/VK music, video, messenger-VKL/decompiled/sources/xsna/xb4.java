package xsna;

import com.ironsource.X3;
import com.vk.api.generated.audioAds.dto.AudioAdsAcknowledgeViewPositionDto;

/* compiled from: AudioAdsService.kt */
/* loaded from: classes2.dex */
public interface xb4 {
    default tfx a(AudioAdsAcknowledgeViewPositionDto audioAdsAcknowledgeViewPositionDto, String str) {
        tfx tfxVar = new tfx("audioAds.acknowledgeView", new et(2), new gp(4));
        tfx.o(tfxVar, X3.i.L, audioAdsAcknowledgeViewPositionDto.i(), 0, 0, 12);
        tfx.o(tfxVar, "section", str, 0, 0, 12);
        return tfxVar;
    }

    default tfx b(int i, int i2, int i3, String str) {
        tfx tfxVar = new tfx("audioAds.updateUserStatistic", new eq0(2), new k73(2));
        tfx.l(tfxVar, "age_type", i, 0, 0, 12);
        tfx.l(tfxVar, "track_length", i2, 0, 0, 12);
        tfx.l(tfxVar, "listened_length", i3, 0, 0, 12);
        tfx.o(tfxVar, "section", str, 0, 0, 12);
        return tfxVar;
    }
}
