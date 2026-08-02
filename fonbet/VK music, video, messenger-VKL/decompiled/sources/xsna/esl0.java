package xsna;

import com.vk.api.generated.apps.dto.AppsAppMinDto;
import com.vk.api.generated.stories.dto.StoriesFeedItemDto;
import com.vk.api.generated.stories.dto.StoriesPromoBlockDto;
import com.vk.api.generated.stories.dto.StoriesStoryDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.entities.PromoData;
import com.vk.dto.stories.model.AppGroupedStoriesContainer;
import com.vk.dto.stories.model.DiscoverStoriesContainer;
import com.vk.dto.stories.model.IdeasStoriesContainer;
import com.vk.dto.stories.model.LiveActiveStoriesContainer;
import com.vk.dto.stories.model.LiveFinishedStoriesContainer;
import com.vk.dto.stories.model.PromoStoriesContainer;
import com.vk.dto.stories.model.SimpleStoriesContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.dto.stories.model.ads.MyTargetAdStoriesContainer;
import com.vk.dto.user.UserProfile;
import com.vk.toggle.features.StoriesFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: StoriesFeedItemDtoToStoriesContainerMapper.kt */
/* loaded from: classes3.dex */
public final class esl0 {

    /* compiled from: StoriesFeedItemDtoToStoriesContainerMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StoriesFeedItemDto.TypeDto.values().length];
            try {
                iArr[StoriesFeedItemDto.TypeDto.PROMO_STORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoriesFeedItemDto.TypeDto.STORIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoriesFeedItemDto.TypeDto.LIVE_ACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StoriesFeedItemDto.TypeDto.LIVE_FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StoriesFeedItemDto.TypeDto.APP_GROUPED_STORIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StoriesFeedItemDto.TypeDto.DISCOVER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StoriesFeedItemDto.TypeDto.PROMO_IDEAS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ArrayList b(esl0 esl0Var, List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3) {
        return esl0Var.a(list, linkedHashMap, linkedHashMap2, linkedHashMap3, EmptyList.b, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static PromoData c(StoriesPromoBlockDto storiesPromoBlockDto) {
        boolean z = false;
        return new PromoData(storiesPromoBlockDto.d(), new Image((List<ImageSize>) rl3.I(new ImageSize[]{new ImageSize(storiesPromoBlockDto.g(), 50, 50, null, (char) 0, false, 56, null), new ImageSize(storiesPromoBlockDto.f(), 100, 100, null, 0 == true ? 1 : 0, z, 56, null)})), storiesPromoBlockDto.e());
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0018 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList a(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, List list2, String str, String str2) {
        UserId q;
        StoryOwner owner;
        StoriesContainer promoStoriesContainer;
        String i;
        Boolean g;
        StoriesStoryDto storiesStoryDto;
        List<StoriesFeedItemDto> list3 = list == null ? EmptyList.b : list;
        ArrayList arrayList = new ArrayList();
        for (StoriesFeedItemDto storiesFeedItemDto : list3) {
            List<StoriesStoryDto> l = storiesFeedItemDto.l();
            if (l == null || (storiesStoryDto = (StoriesStoryDto) j5g.a0(l)) == null || (q = storiesStoryDto.q()) == null) {
                q = storiesFeedItemDto.q();
            }
            UserProfile userProfile = (UserProfile) linkedHashMap2.get(q);
            StoriesContainer storiesContainer = null;
            storiesContainer = null;
            storiesContainer = null;
            storiesContainer = null;
            storiesContainer = null;
            storiesContainer = null;
            storiesContainer = null;
            storiesContainer = null;
            storiesContainer = null;
            if (userProfile != null) {
                owner = new StoryOwner.User(userProfile, null, 2, null);
            } else {
                Group group = (Group) linkedHashMap3.get(q != null ? fkq0.e(q) : null);
                if (group != null) {
                    owner = new StoryOwner.Community(group, null, 2, null);
                } else {
                    Owner owner2 = (Owner) linkedHashMap.get(q);
                    owner = owner2 != null ? new StoryOwner.Owner(owner2) : null;
                }
            }
            StoryOwner storyOwner = owner;
            List<StoriesStoryDto> l2 = storiesFeedItemDto.l();
            if (l2 == null) {
                l2 = EmptyList.b;
            }
            List<StoriesStoryDto> list4 = l2;
            ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList2.add(ivl0.a((StoriesStoryDto) it.next(), linkedHashMap, linkedHashMap2, linkedHashMap3));
            }
            String id = storiesFeedItemDto.getId();
            ArrayList b = b(this, storiesFeedItemDto.f(), linkedHashMap, linkedHashMap2, linkedHashMap3);
            boolean z = false;
            if (!arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        StoryEntry storyEntry = (StoryEntry) it2.next();
                        if (storyEntry.F && storyEntry.E0 != null) {
                            z = true;
                        }
                    }
                }
            }
            switch (a.$EnumSwitchMapping$0[storiesFeedItemDto.n().ordinal()]) {
                case 1:
                    if (storyOwner != null) {
                        StoriesPromoBlockDto k = storiesFeedItemDto.k();
                        PromoData c = k != null ? c(k) : null;
                        Boolean g2 = storiesFeedItemDto.g();
                        Boolean bool = Boolean.TRUE;
                        promoStoriesContainer = new PromoStoriesContainer(storyOwner, arrayList2, id, epx.f(g2, bool), c, epx.f(storiesFeedItemDto.j(), bool));
                        storiesContainer = promoStoriesContainer;
                    }
                    if (storiesContainer != null) {
                        storiesContainer.c = storiesFeedItemDto.e();
                    }
                    if (storiesContainer != null) {
                        arrayList.add(storiesContainer);
                    }
                case 2:
                    if (z) {
                        storiesContainer = new MyTargetAdStoriesContainer(storyOwner, arrayList2, id, epx.f(storiesFeedItemDto.g(), Boolean.TRUE));
                    } else if (storyOwner != null) {
                        storiesContainer = new SimpleStoriesContainer(storyOwner, arrayList2, id, epx.f(storiesFeedItemDto.g(), Boolean.TRUE));
                    }
                    if (storiesContainer != null) {
                    }
                    if (storiesContainer != null) {
                    }
                    break;
                case 3:
                    if (storyOwner != null) {
                        storiesContainer = new LiveActiveStoriesContainer(storyOwner, arrayList2, id, epx.f(storiesFeedItemDto.g(), Boolean.TRUE));
                    }
                    if (storiesContainer != null) {
                    }
                    if (storiesContainer != null) {
                    }
                    break;
                case 4:
                    if (storyOwner != null) {
                        storiesContainer = new LiveFinishedStoriesContainer(storyOwner, arrayList2, id, epx.f(storiesFeedItemDto.g(), Boolean.TRUE));
                    }
                    if (storiesContainer != null) {
                    }
                    if (storiesContainer != null) {
                    }
                    break;
                case 5:
                    AppsAppMinDto d = storiesFeedItemDto.d();
                    if (d != null) {
                        promoStoriesContainer = new AppGroupedStoriesContainer(storyOwner, arrayList2, id, epx.f(storiesFeedItemDto.g(), Boolean.TRUE), b, e13.b(d));
                        storiesContainer = promoStoriesContainer;
                    }
                    if (storiesContainer != null) {
                    }
                    if (storiesContainer != null) {
                    }
                    break;
                case 6:
                    String r = storiesFeedItemDto.r();
                    if (r != null && (i = storiesFeedItemDto.i()) != null && (g = storiesFeedItemDto.g()) != null) {
                        storiesContainer = new DiscoverStoriesContainer(r, i, g.booleanValue(), storiesFeedItemDto.getId());
                    }
                    if (storiesContainer != null) {
                    }
                    if (storiesContainer != null) {
                    }
                    break;
                case 7:
                    StoriesFeatures storiesFeatures = StoriesFeatures.IDEAS_STORY_VIEWER;
                    storiesFeatures.getClass();
                    if (com.vk.toggle.b.A.a(storiesFeatures)) {
                        String str3 = (str == null || drm0.N(str)) ? null : str;
                        String str4 = (str2 == null || drm0.N(str2)) ? null : str2;
                        String i2 = storiesFeedItemDto.i();
                        StoriesPromoBlockDto k2 = storiesFeedItemDto.k();
                        PromoData c2 = k2 != null ? c(k2) : null;
                        Boolean j = storiesFeedItemDto.j();
                        Boolean bool2 = Boolean.TRUE;
                        promoStoriesContainer = new IdeasStoriesContainer(list2, null, str3, str4, i2, c2, epx.f(j, bool2), epx.f(storiesFeedItemDto.g(), bool2), storiesFeedItemDto.getId());
                        storiesContainer = promoStoriesContainer;
                    }
                    if (storiesContainer != null) {
                    }
                    if (storiesContainer != null) {
                    }
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return arrayList;
    }
}
