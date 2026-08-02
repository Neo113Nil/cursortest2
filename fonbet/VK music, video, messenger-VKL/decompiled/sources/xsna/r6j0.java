package xsna;

import android.app.Activity;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;
import com.vkontakte.android.R;

/* compiled from: Share.kt */
/* loaded from: classes2.dex */
public final class r6j0 extends h6s0 {
    public static final r6j0 c = new r6j0(VideoBottomSheetOptions.SHARE.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        boolean z = s6s0Var.z;
        VideoFile videoFile = s6s0Var.a;
        if (videoFile.Fa() && hg10.o(s6s0Var) && videoFile.k1() == 0 && z) {
            int i = this.b;
            return new e520(i, R.drawable.vk_icon_share_outline_28, R.string.video_share, i, false, 0, 0, false, null, 0, null, false, 8176);
        }
        if (!videoFile.F4().j() || !z) {
            return null;
        }
        int i2 = this.b;
        return new e520(i2, R.drawable.vk_icon_share_outline_28, R.string.video_share, i2, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        Peer peer;
        VideoFile videoFile = s6s0Var.a;
        s60 s60Var = s6s0Var.o;
        if (s60Var != null) {
            s60Var.a(videoFile, VideoBottomSheetOptions.SHARE);
        }
        UserId userId = s6s0Var.y;
        if (userId == null || (peer = com.vk.dto.common.a.a(userId)) == null) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
        Peer peer2 = peer;
        if (!o25.a().b()) {
            nr4.b().y(activity, fss0.a(videoFile));
        } else if (fxc0.B().J().m(videoFile.C2())) {
            g7s0 B = fxc0.B();
            MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource = MobileOfficialAppsSharingStat$TypeEventSource.ACTION_MENU;
            B.getClass();
        } else {
            kbj0.u(nr4.b(), activity, s6s0Var.a, s6s0Var.f, false, peer2, MobileOfficialAppsSharingStat$TypeEventSource.ACTION_MENU, 8);
        }
        if (y6s0Var != null) {
            y6s0Var.b(VideoBottomSheetSideEffectOptions.SHARE, videoFile);
        }
    }
}
