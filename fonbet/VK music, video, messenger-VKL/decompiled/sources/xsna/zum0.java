package xsna;

import com.vk.dto.common.MusicVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vkontakte.android.R;

/* compiled from: Subscribe.kt */
/* loaded from: classes2.dex */
public final class zum0 extends kxm0 {
    public static final zum0 d = new zum0(VideoBottomSheetOptions.SUBSCRIBE.ordinal(), VideoBottomSheetSideEffectOptions.SUBSCRIBE);

    @Override // xsna.kxm0
    public final e520 e() {
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_add_square_outline_28, R.string.video_setting_subscribe_author, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.kxm0
    public final boolean f(s6s0 s6s0Var) {
        VideoFile videoFile = s6s0Var.a;
        boolean z = videoFile instanceof MusicVideoFile;
        if (videoFile.U()) {
            return false;
        }
        Owner s = s6s0Var.a.s();
        return (epx.f(s != null ? Boolean.valueOf(fkq0.d(s.b)) : null, Boolean.TRUE) || z) ? false : true;
    }
}
