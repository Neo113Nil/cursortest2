package xsna;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.vk.community.design.view.skeleton.community.header.CommunityHeaderSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.stories.design.view.viewer.StoryUploadIndicatorView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ g3g(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new z0g(context);
            case 1:
                int i2 = CommunityHeaderSkeleton.w;
                ThemableShimmer.a aVar = new ThemableShimmer.a(context);
                ThemableShimmer themableShimmer = aVar.a;
                themableShimmer.i = R.attr.vk_ui_background_content;
                themableShimmer.j = Float.POSITIVE_INFINITY;
                ThemableShimmer.a.d(aVar);
                return aVar.a();
            default:
                int i3 = StoryUploadIndicatorView.g;
                int color = context.getColor(R.color.vk_gray_900);
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n8g.l(color, 0), color});
        }
    }
}
