package xsna;

import com.vk.dto.stories.model.DiscoverBlockType;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import kotlin.LazyThreadSafetyMode;

/* compiled from: InterestingStoriesBlockAnalytics.kt */
/* loaded from: classes4.dex */
public final class udx {
    public static final Object c = msy.a(LazyThreadSafetyMode.NONE, new ig(13));
    public final anm0 a;
    public DiscoverBlockType b = DiscoverBlockType.DISCOVER;

    /* compiled from: InterestingStoriesBlockAnalytics.kt */
    public static final class a {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public static String a() {
            return (String) udx.c.getValue();
        }
    }

    /* compiled from: InterestingStoriesBlockAnalytics.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DiscoverBlockType.values().length];
            try {
                iArr[DiscoverBlockType.PHONE_BOOK_STORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public udx(anm0 anm0Var) {
        this.a = anm0Var;
    }

    public static u8m0 a(StoryEntry storyEntry, StoriesContainer storiesContainer, rdx rdxVar) {
        if (rdxVar == null) {
            return null;
        }
        long j = rdxVar.a;
        Long valueOf = Long.valueOf(rdxVar.b);
        if (storyEntry == null) {
            return null;
        }
        int indexOf = storiesContainer.g.indexOf(storyEntry);
        return new u8m0(j, indexOf, (storiesContainer.g.size() - 1) - indexOf, valueOf, false);
    }

    public final MobileOfficialAppsConStoriesStat$ViewEntryPoint b() {
        return b.$EnumSwitchMapping$0[this.b.ordinal()] == 1 ? MobileOfficialAppsConStoriesStat$ViewEntryPoint.DISCOVER_FEED_BLOCK_PREVIEW : MobileOfficialAppsConStoriesStat$ViewEntryPoint.STORIES_FEED_BLOCK_PREVIEW;
    }
}
