package xsna;

import com.vk.dto.newsfeed.Owner;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vkontakte.android.R;

/* compiled from: Unsubscribe.kt */
/* loaded from: classes2.dex */
public final class o6q0 extends kxm0 {
    public static final o6q0 d = new o6q0(VideoBottomSheetOptions.UNSUBSCRIBE.ordinal(), VideoBottomSheetSideEffectOptions.UNSUBSCRIBE);

    @Override // xsna.kxm0
    public final e520 e() {
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_minus_square_outline_28, R.string.video_setting_unsubscribe_author, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.kxm0
    public final boolean f(s6s0 s6s0Var) {
        if (!s6s0Var.a.U()) {
            return false;
        }
        Owner s = s6s0Var.a.s();
        return !epx.f(s != null ? Boolean.valueOf(fkq0.d(s.b)) : null, Boolean.TRUE);
    }
}
