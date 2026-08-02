package xsna;

import android.os.Bundle;
import android.util.LruCache;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.dto.newsfeed.discover.DiscoverCategory;
import com.vk.dto.newsfeed.discover.DiscoverCategoryType;
import com.vk.dto.newsfeed.discover.DiscoverId;
import com.vk.newsfeed.domain.model.NewsfeedCustomFeedType;
import com.vk.newsfeed.impl.discover.media.DiscoverMediaTabFragment;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.toggle.features.FeedFeatures;
import java.util.UUID;
import kotlin.Pair;

/* compiled from: DiscoverFragmentsFactory.kt */
/* loaded from: classes4.dex */
public final class e2n {
    public final DiscoverCategory a;
    public final int b;
    public final boolean c;

    /* compiled from: DiscoverFragmentsFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverCategoryType.values().length];
            try {
                iArr[DiscoverCategoryType.DISCOVER_FULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DiscoverCategoryType.DISCOVER_MEDIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ e2n(DiscoverCategory discoverCategory, int i) {
        this(discoverCategory, i, false);
    }

    public final FragmentImpl a() {
        String str;
        DiscoverCategory discoverCategory = this.a;
        String str2 = discoverCategory.b;
        DiscoverCategory.Ref ref = discoverCategory.e;
        if (str2.length() != 0) {
            int i = a.$EnumSwitchMapping$0[discoverCategory.d.ordinal()];
            int i2 = this.b;
            boolean z = this.c;
            if (i == 1) {
                NewsfeedCustomFragment2.a aVar = new NewsfeedCustomFragment2.a(str2);
                DiscoverId discoverId = DiscoverId.i;
                DiscoverId a2 = DiscoverId.a.a(discoverCategory, i2);
                Bundle bundle = aVar.j;
                bundle.putParcelable("discover_id", a2);
                bundle.putBoolean("NewsfeedCustomFragmentWithPreload", true);
                bundle.putBoolean("show_in_lego_theme", z);
                FeedFeatures feedFeatures = FeedFeatures.BREAKING_NEWS_API;
                feedFeatures.getClass();
                if (com.vk.toggle.b.A.a(feedFeatures)) {
                    bundle.putSerializable("feed_type", NewsfeedCustomFeedType.BREAKING_NEWS);
                }
                if (ref != null && (str = ref.b) != null) {
                    bundle.putString("ref", str);
                }
                return aVar.f();
            }
            if (i == 2) {
                FeedFeatures feedFeatures2 = FeedFeatures.MVI_DISCOVER;
                feedFeatures2.getClass();
                if (com.vk.toggle.b.A.a(feedFeatures2)) {
                    DiscoverMediaTabFragment2.a aVar2 = new DiscoverMediaTabFragment2.a(DiscoverMediaTabFragment2.class, null, null);
                    LruCache<UUID, mzp0> lruCache = rzp0.a;
                    Pair c = rzp0.c(UiMeasuringScreen.DISCOVER_MEDIA, null, false, 62);
                    UUID uuid = (UUID) c.d();
                    Bundle bundle2 = aVar2.j;
                    bundle2.putSerializable("com.vk.newsfeed.impl.discover.media.UI_MEASURING_UUID_ARG", uuid);
                    zrd0 zrd0Var = zrd0.a;
                    Pair a3 = zrd0.a(PerformanceScoreProduct.DISCOVER_MEDIA);
                    UUID uuid2 = (UUID) a3.d();
                    ((yw90) a3.g()).init();
                    bundle2.putSerializable("com.vk.newsfeed.impl.discover.media.PRODUCT_SCORE_UUID_ARG", uuid2);
                    DiscoverId discoverId2 = DiscoverId.i;
                    bundle2.putParcelable("discover_id", DiscoverId.a.a(discoverCategory, i2));
                    if (ref != null) {
                        bundle2.putString("ref", ref.b);
                    }
                    bundle2.putBoolean("show_in_lego_theme", z);
                    return aVar2.f();
                }
                DiscoverMediaTabFragment.a aVar3 = new DiscoverMediaTabFragment.a(DiscoverMediaTabFragment.class, null, null);
                Bundle bundle3 = aVar3.j;
                bundle3.putString("feed_id", str2);
                LruCache<UUID, mzp0> lruCache2 = rzp0.a;
                Pair c2 = rzp0.c(UiMeasuringScreen.DISCOVER_MEDIA, null, false, 62);
                UUID uuid3 = (UUID) c2.d();
                bundle3.putSerializable("com.vk.newsfeed.impl.discover.media.UI_MEASURING_UUID_ARG", uuid3);
                zrd0 zrd0Var2 = zrd0.a;
                Pair a4 = zrd0.a(PerformanceScoreProduct.DISCOVER_MEDIA);
                UUID uuid4 = (UUID) a4.d();
                ((yw90) a4.g()).init();
                bundle3.putSerializable("com.vk.newsfeed.impl.discover.media.PRODUCT_SCORE_UUID_ARG", uuid4);
                bundle3.putBoolean("tab_mode", true);
                DiscoverId discoverId3 = DiscoverId.i;
                bundle3.putParcelable("discover_id", DiscoverId.a.a(discoverCategory, i2));
                bundle3.putBoolean("show_in_lego_theme", z);
                if (ref != null) {
                    bundle3.putString("ref", ref.b);
                    bundle3.putString("ref_single", ref.c);
                }
                return aVar3.f();
            }
        }
        return null;
    }

    public e2n(DiscoverCategory discoverCategory, int i, boolean z) {
        this.a = discoverCategory;
        this.b = i;
        this.c = z;
    }
}
