package xsna;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.OrdAdvertiser;
import com.vk.dto.common.VideoAdInfo;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: CopyAdMarker.kt */
/* loaded from: classes2.dex */
public final class btj extends h6s0 {
    public static final btj c = new btj(VideoBottomSheetOptions.COPY_AD_MARKER.ordinal());

    @Override // xsna.h6s0
    public final e520 a(s6s0 s6s0Var) {
        List<OrdAdvertiser> list;
        OrdAdvertiser ordAdvertiser;
        String str;
        VideoFile videoFile = s6s0Var.a;
        VideoAdInfo X0 = videoFile.X0();
        String str2 = X0 != null ? X0.k : null;
        OrdAdInfo p1 = videoFile.p1();
        if (hg10.u(s6s0Var) && str2 != null && str2.length() > 0) {
            Context context = e43.a;
            return new e520(this.b, R.drawable.vk_icon_copy_outline_28, this.b, 1008, (context != null ? context : null).getString(R.string.ad_marker_template, str2));
        }
        if (p1 == null || (list = p1.c) == null || (ordAdvertiser = (OrdAdvertiser) j5g.a0(list)) == null || (str = ordAdvertiser.c) == null || str.length() <= 0) {
            return null;
        }
        Context context2 = e43.a;
        return new e520(this.b, R.drawable.vk_icon_copy_outline_28, this.b, 1008, (context2 != null ? context2 : null).getString(R.string.ad_marker_template, ((OrdAdvertiser) j5g.Y(list)).c));
    }

    @Override // xsna.h6s0
    public final void c(Activity activity, s6s0 s6s0Var, y6s0 y6s0Var) {
        List<OrdAdvertiser> list;
        OrdAdvertiser ordAdvertiser;
        VideoFile videoFile = s6s0Var.a;
        VideoAdInfo X0 = videoFile.X0();
        String str = null;
        String str2 = X0 != null ? X0.k : null;
        if (str2 == null || str2.length() == 0) {
            OrdAdInfo p1 = videoFile.p1();
            if (p1 != null && (list = p1.c) != null && (ordAdvertiser = (OrdAdvertiser) j5g.Y(list)) != null) {
                str = ordAdvertiser.c;
            }
            bpn0 bpn0Var = cqm0.a;
            if (str == null) {
                str = "";
            }
        } else {
            VideoAdInfo X02 = videoFile.X0();
            if (X02 != null) {
                str = X02.k;
            }
        }
        ((ClipboardManager) activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
        cvk.u(R.string.ad_marker_copied, false);
    }
}
