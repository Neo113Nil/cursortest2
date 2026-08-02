package xsna;

import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.DiscoverStubStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DiscoverUtils.kt */
/* loaded from: classes6.dex */
public final class gan {

    /* compiled from: DiscoverUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MobileOfficialAppsConStoriesStat$ViewEntryPoint.values().length];
            try {
                iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_GEO_BLOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_FEED_BLOCK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.SEAMLESS_TRANSITION_DISCOVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MobileOfficialAppsConStoriesStat$ViewEntryPoint.SEAMLESS_TRANSITION_DISCOVER_FEED_BLOCK.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MobileOfficialAppsConStoriesStat$ViewEntryPoint a(StoriesContainer storiesContainer, ArrayList<StoriesContainer> arrayList, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
        boolean z = storiesContainer instanceof DiscoverStoriesContainer;
        Iterator<StoriesContainer> it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next() instanceof DiscoverStoriesContainer) {
                break;
            }
            i++;
        }
        DiscoverStoriesContainer discoverStoriesContainer = null;
        if (i > -1) {
            StoriesContainer storiesContainer2 = arrayList.get(i);
            if (storiesContainer2 instanceof DiscoverStoriesContainer) {
                discoverStoriesContainer = (DiscoverStoriesContainer) storiesContainer2;
            }
        }
        if (discoverStoriesContainer != null) {
            arrayList.remove(i);
            DiscoverStubStoriesContainer discoverStubStoriesContainer = new DiscoverStubStoriesContainer(discoverStoriesContainer.o, discoverStoriesContainer.e, discoverStoriesContainer.f);
            if (z) {
                discoverStubStoriesContainer.p = DiscoverStubStoriesContainer.State.NO_GRID_LOADER;
            }
            arrayList.add(discoverStubStoriesContainer);
            if (!z) {
                return mobileOfficialAppsConStoriesStat$ViewEntryPoint == MobileOfficialAppsConStoriesStat$ViewEntryPoint.YOUR_FRIENDS_STORIES_BLOCK ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.SEAMLESS_TRANSITION_DISCOVER_FEED_BLOCK : MobileOfficialAppsConStoriesStat$ViewEntryPoint.SEAMLESS_TRANSITION_DISCOVER;
            }
        }
        return mobileOfficialAppsConStoriesStat$ViewEntryPoint;
    }
}
