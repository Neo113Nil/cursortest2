package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.autoplay.b;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoCommentClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideoCommentStat.kt */
/* loaded from: classes4.dex */
public final class vbs0 {
    public static void a(MobileOfficialAppsVideoStat$TypeVideoCommentClick.Event event, int i) {
        yg5 yg5Var;
        VideoFile A;
        bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
        xh5 xh5Var = b.C1208b.a().c;
        if (xh5Var == null || (yg5Var = xh5Var.a) == null || (A = yg5Var.A()) == null) {
            return;
        }
        new bjc(MobileOfficialAppsCoreNavStat$EventScreen.COMMENTS_LIST_VIDEO, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(A.o0()), Long.valueOf(A.I0().b), null, A.r(), null, 40, null), new MobileOfficialAppsVideoStat$TypeVideoCommentClick(event, String.valueOf(i)), 2)).q();
    }
}
