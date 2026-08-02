package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dy20 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Context c;

    public /* synthetic */ dy20(Context context) {
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        dw20.a c;
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                c = new kmu0(context, new hy20()).w0("Закрытие по тапу").c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                ((dw20.b) c).q(true).I0(null);
                return s3q0.a;
            default:
                int i2 = VideoMinimizableDiscoveryFragment.p1;
                return context.getString(R.string.video_about_similar_videos_title_recommendations_redesign);
        }
    }
}
