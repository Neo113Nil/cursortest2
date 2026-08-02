package xsna;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.VideoFile;
import com.vk.video.ui.share.api.ScreenMode;
import com.vk.video.ui.share.api.ShareItemType;
import com.vk.video.ui.share.api.StatsArguments;
import com.vk.video.ui.share.api.VideoShareArguments;
import com.vkontakte.android.R;
import xsna.v6j0;

/* compiled from: VideoShareLauncherImpl.kt */
/* loaded from: classes7.dex */
public final class lgt0 implements com.vk.video.ui.share.api.a {
    @Override // com.vk.video.ui.share.api.a
    public final void a(Context context, VideoShareArguments videoShareArguments, VideoFile videoFile) {
        Activity h = e3m.h(context);
        FragmentActivity fragmentActivity = h instanceof FragmentActivity ? (FragmentActivity) h : null;
        FragmentManager supportFragmentManager = fragmentActivity != null ? fragmentActivity.getSupportFragmentManager() : null;
        if (supportFragmentManager != null) {
            v6j0.p1.getClass();
            v6j0.a aVar = new v6j0.a(context, v6j0.r1);
            aVar.g = new VideoShareArguments("", 0, false, new StatsArguments(ShareItemType.VIDEO, 0L, 0L, null, ScreenMode.PREVIEW, null, 40, null), 6, null);
            aVar.c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            aVar.t();
            aVar.s(context.getDrawable(R.drawable.vk_icon_cancel_24));
            aVar.v0(R.string.video_share_dialog_title);
            aVar.g = videoShareArguments;
            aVar.h = videoFile;
            if (videoShareArguments.d) {
                dhr0.a.getClass();
                aVar.u0(dhr0.u().c);
            }
            aVar.H0(supportFragmentManager, null);
        }
    }
}
