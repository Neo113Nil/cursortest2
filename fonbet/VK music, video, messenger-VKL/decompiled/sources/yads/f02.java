package yads;

import android.view.View;
import android.widget.ProgressBar;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes10.dex */
public final class f02 implements d02 {
    @Override // yads.d02
    public final ProgressBar a(View view) {
        return (ProgressBar) view.findViewWithTag("close_progress_view");
    }

    @Override // yads.d02
    public final View b(View view) {
        return view.findViewWithTag("skip_button");
    }

    @Override // yads.d02
    public final View c(View view) {
        return view.findViewWithTag(CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
    }
}
