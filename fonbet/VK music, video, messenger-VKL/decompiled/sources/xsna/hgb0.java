package xsna;

import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
import com.vk.catalog2.common.dto.api.CatalogOnboardingInfo;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.style.PodcastSliderViewStyle;
import com.vk.catalog2.feature.music.dto.ui.UIBlockPodcastItem;
import com.vk.dto.podcast.Podcast;

/* compiled from: PodcastBlockTransformer.kt */
/* loaded from: classes16.dex */
public final class hgb0 {

    /* compiled from: PodcastBlockTransformer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogViewType.values().length];
            try {
                iArr[CatalogViewType.MY_SHELF_PLAYABLE_ITEM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogViewType.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final UIBlockPodcastItem a(bi20 bi20Var, Podcast podcast, PodcastSliderViewStyle podcastSliderViewStyle) {
        return new UIBlockPodcastItem(new com.vk.catalog2.common.dto.api.ui.a(bi20Var.a, bi20Var.b, bi20Var.d, bi20Var.c, bi20Var.k, bi20Var.e, bi20Var.j, bi20Var.m, bi20Var.o, podcastSliderViewStyle, (CatalogOnboardingInfo) null, (CatalogLaunchOrigin) null, 7168), podcast);
    }
}
