package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.community.design.view.skeleton.community.header.CommunityLiveHeaderSkeleton;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.newsfeed.impl.views.ModalCommentsPaginatedView;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class e9h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ e9h(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                int i2 = CommunityLiveHeaderSkeleton.v;
                ThemableShimmer.a aVar = new ThemableShimmer.a(context);
                ThemableShimmer themableShimmer = aVar.a;
                themableShimmer.i = R.attr.vk_ui_background_content;
                themableShimmer.j = Float.POSITIVE_INFINITY;
                ThemableShimmer.a.d(aVar);
                return aVar.a();
            case 1:
                int i3 = ModalCommentsPaginatedView.T;
                return enj.e(R.drawable.vk_icon_comment_outline_56, R.attr.vk_ui_icon_secondary, context);
            case 2:
                VkSpinner vkSpinner = new VkSpinner(context, null, 6, 0);
                vkSpinner.setId(View.generateViewId());
                ConstraintLayout.b bVar = new ConstraintLayout.b(cn70.b(16), cn70.b(16));
                bVar.s = R.id.counter;
                bVar.v = 0;
                bVar.i = 0;
                bVar.l = 0;
                vkSpinner.setLayoutParams(bVar);
                vkSpinner.setVisibility(8);
                return vkSpinner;
            case 3:
                Drawable a = m33.a(R.drawable.bg_rounded_elevation_fill_16, context);
                Drawable mutate = a != null ? a.mutate() : null;
                if (mutate instanceof NinePatchDrawable) {
                    return (NinePatchDrawable) mutate;
                }
                return null;
            case 4:
                return LayoutInflater.from(context);
            default:
                return Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.one_video_seek_view_progress_interval_min_width));
        }
    }
}
