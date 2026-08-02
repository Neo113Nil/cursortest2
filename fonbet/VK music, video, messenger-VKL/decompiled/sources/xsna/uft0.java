package xsna;

import com.ironsource.B5;
import com.vk.api.generated.video.dto.VideoGetUVStatsTokenEnvDto;
import com.vk.dto.common.id.UserId;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.tft0;

/* compiled from: VideoService.kt */
/* loaded from: classes.dex */
public final class uft0 implements tft0 {
    public final tfx E(UserId userId, UserId userId2, Integer num, Integer num2, Boolean bool) {
        tfx tfxVar = new tfx("video.getAlbums", new kft0(0), new m2o0(2));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (userId2 != null) {
            tfx.n(tfxVar, "group_id", userId2, 1L, 0L, 8);
        }
        if (num != null) {
            tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, num.intValue(), 0, 0, 8);
        }
        tfxVar.f(num2.intValue(), 0, 100, "count");
        if (bool != null) {
            tfxVar.j("extended", bool.booleanValue());
        }
        return tfxVar;
    }

    public final tfx F(String str, VideoGetUVStatsTokenEnvDto videoGetUVStatsTokenEnvDto, Boolean bool) {
        tfx tfxVar = new tfx("video.getUVStatsToken", new n5e0(6), new wga0(7));
        if (str != null) {
            tfx.o(tfxVar, "device_id", str, 0, 0, 12);
        }
        if (videoGetUVStatsTokenEnvDto != null) {
            tfx.o(tfxVar, B5.o, videoGetUVStatsTokenEnvDto.i(), 0, 0, 12);
        }
        tfxVar.j("force_refresh", bool.booleanValue());
        return tfxVar;
    }

    @Override // xsna.sft0
    public final vfx i(UserId userId, List list, Integer num, Integer num2, Integer num3, Boolean bool, List list2, Boolean bool2) {
        return tft0.a.a(userId, list, num, num2, num3, bool, list2, bool2);
    }
}
