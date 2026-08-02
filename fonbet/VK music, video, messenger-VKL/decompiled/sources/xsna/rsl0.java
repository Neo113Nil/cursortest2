package xsna;

import com.vk.api.generated.stories.dto.StoriesAdsDataV5113Dto;
import com.vk.api.generated.stories.dto.StoriesAdsSettingsDto;
import com.vk.api.generated.stories.dto.StoriesGetV5113ResponseDto;
import com.vk.api.generated.storiesIdeas.dto.StoriesIdeasIdeaBirthdayDto;
import com.vk.api.generated.storiesIdeas.dto.StoriesIdeasIdeaDto;
import com.vk.api.generated.storiesIdeas.dto.StoriesIdeasIdeaGalleryDto;
import com.vk.api.generated.storiesIdeas.dto.StoriesIdeasIdeaItemDto;
import com.vk.api.generated.storiesIdeas.dto.StoriesIdeasIdeasBlockDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesAds;
import com.vk.dto.stories.model.ideas.StoryIdea;
import com.vk.dto.stories.model.ideas.StoryIdeaPayload;
import com.vk.dto.stories.model.ideas.StoryIdeasBlock;
import com.vk.toggle.features.StoriesFeatures;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: StoriesGetV5113ResponseDtoToGetStoriesResponseMapper.kt */
/* loaded from: classes3.dex */
public final class rsl0 {
    public final bpn0 a = new bpn0(new pkd0(5));

    /* compiled from: StoriesGetV5113ResponseDtoToGetStoriesResponseMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StoriesIdeasIdeaDto.TypeDto.values().length];
            try {
                iArr[StoriesIdeasIdeaDto.TypeDto.BIRTHDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StoriesIdeasIdeaDto.TypeDto.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StoriesIdeasIdeaDto.TypeDto.GALLERY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StoriesAdsSettingsDto.IntervalTypeDto.values().length];
            try {
                iArr2[StoriesAdsSettingsDto.IntervalTypeDto.STORIES_AND_AUTHORS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[StoriesAdsSettingsDto.IntervalTypeDto.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[StoriesAdsSettingsDto.IntervalTypeDto.STORIES_AND_AUTHORS_AND_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0163  */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v27, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final GetStoriesResponse a(StoriesGetV5113ResponseDto storiesGetV5113ResponseDto) {
        StoryIdeasBlock storyIdeasBlock;
        List<StoryIdea> list;
        StoriesAdsDataV5113Dto d;
        StoriesAds.Settings settings;
        StoriesAds.Settings settings2;
        StoriesAds.Settings.IntervalType intervalType;
        ?? r2;
        UserId userId;
        StoryIdeaPayload birthday;
        StoryIdea storyIdea;
        String sb;
        UserId userId2;
        List<String> d2;
        new j2r0();
        LinkedHashMap b = j2r0.b(storiesGetV5113ResponseDto.j());
        new dqu();
        LinkedHashMap b2 = dqu.b(storiesGetV5113ResponseDto.e());
        StoriesAds storiesAds = null;
        LinkedHashMap a2 = b590.a(new b590(), null, storiesGetV5113ResponseDto.j(), storiesGetV5113ResponseDto.e(), 3);
        StoriesIdeasIdeasBlockDto f = storiesGetV5113ResponseDto.f();
        if (f != null) {
            StoriesFeatures storiesFeatures = StoriesFeatures.IDEAS_STORY_VIEWER;
            storiesFeatures.getClass();
            if (!com.vk.toggle.b.A.a(storiesFeatures)) {
                f = null;
            }
            if (f != null) {
                List<StoriesIdeasIdeaItemDto> e = f.e();
                if (e != null) {
                    r2 = new ArrayList();
                    for (StoriesIdeasIdeaItemDto storiesIdeasIdeaItemDto : e) {
                        StoriesIdeasIdeaDto e2 = storiesIdeasIdeaItemDto.e();
                        StoriesIdeasIdeaDto.TypeDto f2 = e2.f();
                        int[] iArr = a.$EnumSwitchMapping$0;
                        int i = iArr[f2.ordinal()];
                        if (i == 1) {
                            StoriesIdeasIdeaBirthdayDto d3 = e2.d();
                            if (d3 != null && (userId = d3.getUserId()) != null) {
                                birthday = new StoryIdeaPayload.Birthday(userId);
                            }
                            birthday = null;
                        } else if (i == 2) {
                            birthday = StoryIdeaPayload.Music.b;
                        } else {
                            if (i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            StoriesIdeasIdeaGalleryDto e3 = e2.e();
                            if (e3 != null && (d2 = e3.d()) != null) {
                                birthday = new StoryIdeaPayload.Gallery(d2);
                            }
                            birthday = null;
                        }
                        if (birthday == null) {
                            storyIdea = null;
                        } else {
                            StoriesIdeasIdeaDto e4 = storiesIdeasIdeaItemDto.e();
                            int i2 = iArr[e4.f().ordinal()];
                            if (i2 == 1) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(e4.f().i());
                                sb2.append('_');
                                StoriesIdeasIdeaBirthdayDto d4 = e4.d();
                                sb2.append((d4 == null || (userId2 = d4.getUserId()) == null) ? null : Long.valueOf(userId2.b));
                                sb = sb2.toString();
                            } else {
                                if (i2 != 2 && i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                sb = e4.f().i();
                            }
                            storyIdea = new StoryIdea(sb, birthday, storiesIdeasIdeaItemDto.f(), storiesIdeasIdeaItemDto.d());
                        }
                        if (storyIdea != null) {
                            r2.add(storyIdea);
                        }
                    }
                } else {
                    r2 = 0;
                }
                if (r2 == 0) {
                    r2 = EmptyList.b;
                }
                storyIdeasBlock = r2.isEmpty() ? null : new StoryIdeasBlock(r2, f.d(), f.f(), f.F5());
                list = storyIdeasBlock == null ? storyIdeasBlock.b : null;
                if (list == null) {
                    list = EmptyList.b;
                }
                List<StoryIdea> list2 = list;
                bpn0 bpn0Var = this.a;
                ArrayList a3 = ((esl0) bpn0Var.getValue()).a(storiesGetV5113ResponseDto.g(), a2, b, b2, list2, storyIdeasBlock == null ? storyIdeasBlock.c : null, storyIdeasBlock == null ? storyIdeasBlock.e : null);
                d = storiesGetV5113ResponseDto.d();
                if (d != null) {
                    StoriesAdsSettingsDto e5 = d.e();
                    if (e5 != null) {
                        if (e5.f() == null) {
                            e5 = null;
                        }
                        if (e5 != null) {
                            int i3 = a.$EnumSwitchMapping$1[e5.f().ordinal()];
                            if (i3 == 1) {
                                intervalType = StoriesAds.Settings.IntervalType.STORIES_AND_AUTHORS;
                            } else if (i3 == 2) {
                                intervalType = StoriesAds.Settings.IntervalType.TIME;
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                intervalType = StoriesAds.Settings.IntervalType.STORIES_AND_AUTHORS_AND_TIME;
                            }
                            StoriesAds.Settings.IntervalType intervalType2 = intervalType;
                            Integer k = e5.k();
                            int intValue = k != null ? k.intValue() : 0;
                            Integer i4 = e5.i();
                            int intValue2 = i4 != null ? i4.intValue() : 0;
                            Integer e6 = e5.e();
                            int intValue3 = e6 != null ? e6.intValue() : 0;
                            Integer j = e5.j();
                            int intValue4 = j != null ? j.intValue() : 0;
                            Integer g = e5.g();
                            int intValue5 = g != null ? g.intValue() : 0;
                            Integer d5 = e5.d();
                            settings2 = new StoriesAds.Settings(intervalType2, intValue, intValue2, intValue3, intValue4, intValue5, d5 != null ? d5.intValue() : 0);
                        } else {
                            settings2 = null;
                        }
                        settings = settings2;
                    } else {
                        settings = null;
                    }
                    esl0 esl0Var = (esl0) bpn0Var.getValue();
                    StoriesAdsDataV5113Dto d6 = storiesGetV5113ResponseDto.d();
                    storiesAds = new StoriesAds(settings, esl0.b(esl0Var, d6 != null ? d6.d() : null, a2, b, b2));
                }
                return new GetStoriesResponse(storiesGetV5113ResponseDto.getCount(), storiesGetV5113ResponseDto.i(), a3, storiesAds, storiesGetV5113ResponseDto.r(), storyIdeasBlock);
            }
        }
        storyIdeasBlock = null;
        if (storyIdeasBlock == null) {
        }
        if (list == null) {
        }
        List<StoryIdea> list22 = list;
        bpn0 bpn0Var2 = this.a;
        ArrayList a32 = ((esl0) bpn0Var2.getValue()).a(storiesGetV5113ResponseDto.g(), a2, b, b2, list22, storyIdeasBlock == null ? storyIdeasBlock.c : null, storyIdeasBlock == null ? storyIdeasBlock.e : null);
        d = storiesGetV5113ResponseDto.d();
        if (d != null) {
        }
        return new GetStoriesResponse(storiesGetV5113ResponseDto.getCount(), storiesGetV5113ResponseDto.i(), a32, storiesAds, storiesGetV5113ResponseDto.r(), storyIdeasBlock);
    }
}
