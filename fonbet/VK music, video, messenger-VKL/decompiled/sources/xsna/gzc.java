package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog.mvi.block.video.impl.video.video.VideoView$State;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class gzc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ VideoFile c;

    public /* synthetic */ gzc(int i, VideoFile videoFile) {
        this.b = i;
        this.c = videoFile;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        switch (this.b) {
            case 0:
                View view = (View) obj;
                SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.CLIPS_CHALLENGE;
                VideoFile videoFile = this.c;
                ActionLink m1 = videoFile.m1();
                String str2 = m1 != null ? m1.e : null;
                ActionLink m12 = videoFile.m1();
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, null, null, str2, m12 != null ? m12.d : null, null, 38, null), new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.TOP, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741822, null), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                maz e = xwk.d().e();
                Context context = view.getContext();
                ActionLink m13 = videoFile.m1();
                if (m13 == null || (str = m13.e) == null) {
                    str = "";
                }
                e.a(context, str);
                return s3q0.a;
            default:
                VideoView$State videoView$State = (VideoView$State) obj;
                return new VideoView$State(videoView$State.b, videoView$State.c, this.c, videoView$State.e, videoView$State.f, videoView$State.g);
        }
    }
}
