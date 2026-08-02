package xsna;

import android.content.Context;
import com.vk.community.design.view.skeleton.community.header.CommunityHeaderSkeleton;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3g implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ h3g(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                return new g1g(context);
            default:
                int i2 = CommunityHeaderSkeleton.w;
                ThemableShimmer.a aVar = new ThemableShimmer.a(context);
                ThemableShimmer themableShimmer = aVar.a;
                themableShimmer.i = R.attr.vk_ui_skeleton_from;
                themableShimmer.j = Float.POSITIVE_INFINITY;
                ThemableShimmer.a.d(aVar);
                return aVar.a();
        }
    }
}
