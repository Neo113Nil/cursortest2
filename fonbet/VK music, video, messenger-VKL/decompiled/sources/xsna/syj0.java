package xsna;

import android.view.ViewGroup;
import com.vk.core.view.shimmer.ThemableShimmer;
import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vk.feed.design.view.newsfeed.ads.nativeskeleton.FeedAdsNativeSkeleton;
import com.vkontakte.android.R;
import xsna.bwy;

/* compiled from: SkeletonOptionalNativeAdHolderV2.kt */
/* loaded from: classes4.dex */
public final class syj0 extends rp6<tyj0, OptionalNativeAdEntry> {
    public final ThemableShimmer E;

    public syj0(ViewGroup viewGroup) {
        super(R.layout.feed_ads_native_skeleton_item, viewGroup);
        ThemableShimmer a = new ThemableShimmer.a(viewGroup.getContext()).a();
        this.E = a;
        ((FeedAdsNativeSkeleton) this.itemView).setShimmer(a);
    }

    @Override // xsna.rp6
    public final void R6(tyj0 tyj0Var) {
        boolean f = epx.f(tyj0Var.i.f, bwy.c.a);
        ThemableShimmer themableShimmer = this.E;
        if (f) {
            themableShimmer.b();
        } else {
            themableShimmer.c();
        }
    }
}
