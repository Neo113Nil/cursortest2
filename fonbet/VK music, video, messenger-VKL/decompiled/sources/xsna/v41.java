package xsna;

import android.app.Activity;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: AdvertiserInfo.kt */
/* loaded from: classes2.dex */
public final class v41 extends h6s0 {
    public static final v41 c = new v41(VideoBottomSheetOptions.ADVERTISER_INFO.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        List<OrdAdvertiser> list;
        VideoAdInfo X0;
        String str;
        VideoFile videoFile = s6s0Var.a;
        boolean z = false;
        boolean z2 = hg10.u(s6s0Var) && (X0 = videoFile.X0()) != null && (str = X0.j) != null && str.length() > 0;
        OrdAdInfo p1 = videoFile.p1();
        if (p1 != null && (list = p1.c) != null && (!list.isEmpty())) {
            z = true;
        }
        if (!z2 && !z) {
            return null;
        }
        int i = this.b;
        return new e520(i, R.drawable.vk_icon_link_circle_outline_28, R.string.video_advertiser_info, i, false, 0, 0, false, null, 0, null, false, 8176);
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        List<OrdAdvertiser> list;
        OrdAdvertiser ordAdvertiser;
        String str;
        String str2;
        VideoFile videoFile = s6s0Var.a;
        if (videoFile.X0() != null) {
            VideoAdInfo X0 = videoFile.X0();
            if (X0 != null) {
                str2 = X0.j;
            }
            str2 = null;
        } else {
            OrdAdInfo p1 = videoFile.p1();
            if (p1 != null && (list = p1.c) != null && (ordAdvertiser = (OrdAdvertiser) j5g.a0(list)) != null && (str = ordAdvertiser.b) != null && str.length() > 0) {
                str2 = ((OrdAdvertiser) j5g.Y(videoFile.p1().c)).b;
            }
            str2 = null;
        }
        rk8 browser = xwk.d().getBrowser();
        if (str2 == null) {
            return;
        }
        browser.f(activity, null, LaunchContext.A, str2);
    }
}
