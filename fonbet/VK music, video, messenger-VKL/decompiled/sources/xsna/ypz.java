package xsna;

import android.view.View;
import com.pnikosis.materialishprogress.ProgressWheel;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: LoadMoreVh.kt */
/* loaded from: classes2.dex */
public final class ypz extends vfz<wpz> {
    public final ProgressWheel l;

    public ypz(View view, kkm kkmVar) {
        super(view);
        ProgressWheel progressWheel = (ProgressWheel) view.findViewById(R.id.vkim_progress);
        this.l = progressWheel;
        kkmVar.e(progressWheel, new com.vk.movika.sdk.base.ui.q0(this, 6));
    }

    @Override // xsna.vfz
    public final void W5(wpz wpzVar) {
        d3m.c(this.l, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 100L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // xsna.vfz
    public final void a6() {
        this.l.animate().cancel();
    }
}
