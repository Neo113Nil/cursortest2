package xsna;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.videoChannels.dto.VideoChannelsPinVideoPinTypeDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.author.VideoPinType;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.video.channel.author_pin.ChannelVideoPinArgs;
import com.vk.video.channel.common.di.VideoChannelComponent;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.k3t0;

/* compiled from: Pin.kt */
/* loaded from: classes2.dex */
public final class dla0 extends h6s0 {
    public static final dla0 c = new dla0(VideoBottomSheetOptions.PIN.ordinal());
    public static final abs0 d = new abs0();

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        boolean z = false;
        boolean z2 = fxc0.B().J().p() && hg10.m(s6s0Var);
        boolean z3 = epx.f(videoFile.Aa(), Boolean.TRUE) && epx.f(videoFile.Q(), Boolean.FALSE);
        boolean z4 = s6s0Var.q != null;
        PrivacySetting.PrivacyRule privacyRule = (PrivacySetting.PrivacyRule) j5g.a0(videoFile.getPrivacy());
        if (privacyRule != null) {
            List<String> zb = privacyRule.zb();
            if (!zb.equals(Collections.singletonList(PrivacyRules.g.d)) && !zb.equals(Collections.singletonList(PrivacyRules.e.d))) {
                z = true;
            }
        }
        if (!z2 || !z3 || !z4 || !z) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_pin_outline_28, R.string.video_pin_short, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        UserId userId = s6s0Var.q;
        VideoFile videoFile = s6s0Var.a;
        if (userId == null) {
            return;
        }
        if (!videoFile.getPrivacy().get(0).zb().equals(Collections.singletonList(PrivacyRules.d.d))) {
            if ((activity instanceof FragmentActivity ? (FragmentActivity) activity : null) == null) {
                return;
            }
            xas0 h4 = ((VideoChannelComponent) m7m.a(activity).mo408a(fpf0.a(VideoChannelComponent.class))).h4();
            new ChannelVideoPinArgs(videoFile.a1(), userId);
            h4.getClass();
            return;
        }
        String a1 = videoFile.a1();
        VideoPinType videoPinType = VideoPinType.SUBSCRIBERS;
        s2b s2bVar = new s2b(y6s0Var, s6s0Var, activity, 8);
        edd eddVar = new edd(activity, y6s0Var, s6s0Var, 2);
        abs0 abs0Var = d;
        abs0Var.getClass();
        UserId a = fkq0.a(userId);
        int i = k3t0.a.$EnumSwitchMapping$1[videoPinType.ordinal()];
        VideoChannelsPinVideoPinTypeDto videoChannelsPinVideoPinTypeDto = i != 1 ? i != 2 ? i != 3 ? null : VideoChannelsPinVideoPinTypeDto.NON_SUB : VideoChannelsPinVideoPinTypeDto.SUB : VideoChannelsPinVideoPinTypeDto.ALL;
        if (videoChannelsPinVideoPinTypeDto == null) {
            videoChannelsPinVideoPinTypeDto = VideoChannelsPinVideoPinTypeDto.ALL;
        }
        tfx tfxVar = new tfx("videoChannels.pinVideo", new hun0(2), new pq(25));
        tfx.n(tfxVar, "channel_id", a, 1L, 0L, 8);
        tfx.o(tfxVar, "video_raw_id", a1, 0, 0, 12);
        tfx.o(tfxVar, "pin_type", videoChannelsPinVideoPinTypeDto.i(), 0, 0, 12);
        hg1.m(rsg0.y0(yfb.x(tfxVar), null, null, 3), activity, 0L, false, 62).subscribe(new e7q0(new qhg0(s2bVar, abs0Var, activity, videoPinType), 4), new nex(new r9c0(eddVar, abs0Var, activity), 28));
    }
}
