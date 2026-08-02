package xsna;

import android.content.Context;
import com.vk.community.design.view.skeleton.community.post.CommunityContentSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;
import one.video.view.subtitles.BaseSubtitleView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class uo6 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ uo6(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                int i2 = BaseSubtitleView.g;
                return Integer.valueOf(context.getColor(R.color.one_video_subtitle_background));
            case 1:
                return new k1g(context);
            default:
                int i3 = CommunityContentSkeleton.y;
                ThemableShimmer.a aVar = new ThemableShimmer.a(context);
                ThemableShimmer themableShimmer = aVar.a;
                themableShimmer.i = R.attr.vk_ui_skeleton_from;
                themableShimmer.j = Float.POSITIVE_INFINITY;
                ThemableShimmer.a.d(aVar);
                return aVar.a();
        }
    }
}
