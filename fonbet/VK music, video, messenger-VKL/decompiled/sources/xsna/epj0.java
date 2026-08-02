package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.base.dto.BaseLinkButtonActionDto;
import com.vk.api.generated.onboarding.dto.OnboardingCardsItemDto;
import com.vk.api.generated.onboarding.dto.OnboardingGetCardsResponseDto;
import com.vk.clips.viewer.impl.adapters.VideoFileAdapter;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.im.ui.components.attaches_history.attaches.pagination.PageLoadingState;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.superapp.ui.SuperAppFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.irt0;
import xsna.sx40;
import xsna.yv3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class epj0 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ epj0(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Image image;
        switch (this.b) {
            case 0:
                return ((PageLoadingState) obj).Bb();
            case 1:
                Throwable th = (Throwable) obj;
                int i = StoryBottomViewGroup.P;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{th});
                }
                return s3q0.a;
            case 2:
                return Integer.valueOf(((k9l0) obj).b);
            case 3:
                return ((pgq0) ((vg6) obj)).d;
            case 4:
                return new Pair((GetStoriesResponse) obj, null);
            case 5:
                return gpt0.e(gpt0.a, (VideoFile) obj, -1, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.STORY_VIEWER), false, false, null, null, false, 480);
            case 6:
                int i2 = SuperAppFragment.o0;
                qgi0.r((tgi0) obj, "SuperAppHeaderMenuIcon");
                return s3q0.a;
            case 7:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.t0);
            case 8:
                List<OnboardingCardsItemDto> d = ((OnboardingGetCardsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (OnboardingCardsItemDto onboardingCardsItemDto : d) {
                    List<BaseImageDto> e = onboardingCardsItemDto.e();
                    if (e != null) {
                        List<BaseImageDto> list = e;
                        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
                        for (BaseImageDto baseImageDto : list) {
                            arrayList2.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                        }
                        image = new Image(arrayList2);
                    } else {
                        image = null;
                    }
                    String title = onboardingCardsItemDto.getTitle();
                    String description = onboardingCardsItemDto.getDescription();
                    BaseLinkButtonActionDto d2 = onboardingCardsItemDto.d();
                    arrayList.add(new gd80(title, description, d2 != null ? d2.getUrl() : null, image));
                }
                return arrayList;
            case 9:
                gps gpsVar = (gps) obj;
                return new UsersDiscoverPresenter.a(gpsVar, null, false, null, gpsVar.d.b, 10);
            case 10:
                return s3q0.a;
            case 11:
                Owner owner = (Owner) obj;
                qcy<Object>[] qcyVarArr = VideoFileAdapter.l;
                if (owner != null) {
                    return o490.a(owner);
                }
                return null;
            case 12:
                return Boolean.valueOf(((irt0.a) obj).b);
            case 13:
                return Boolean.valueOf(!epx.f((n730) obj, z7x0.a));
            case 14:
                cvk.u(R.string.error, false);
                return s3q0.a;
            case 15:
                return Boolean.valueOf(((yv3) obj) instanceof yv3.b);
            default:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }
}
