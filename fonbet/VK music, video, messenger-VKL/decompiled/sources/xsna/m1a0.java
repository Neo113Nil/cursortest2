package xsna;

import com.vk.api.generated.apps.dto.AppsActionBannerDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.external.miniapp.net.personal.BannerType;
import java.util.Iterator;

/* compiled from: PersonalBannerMapper.kt */
/* loaded from: classes6.dex */
public final class m1a0 {

    /* compiled from: PersonalBannerMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppsActionBannerDto.BannerTypeDto.values().length];
            try {
                iArr[AppsActionBannerDto.BannerTypeDto.PERSONAL_DISCOUNT_BONUS_VOTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppsActionBannerDto.BannerTypeDto.PERSONAL_DISCOUNT_FREE_VOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppsActionBannerDto.BannerTypeDto.PERSONAL_DISCOUNT_PERCENT_DISCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static l1a0 a(AppsActionBannerDto appsActionBannerDto) {
        BannerType bannerType;
        Object obj;
        Object obj2;
        Iterator<T> it = appsActionBannerDto.e().iterator();
        while (true) {
            bannerType = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((BaseImageDto) obj).d() == BaseImageDto.ThemeDto.LIGHT) {
                break;
            }
        }
        BaseImageDto baseImageDto = (BaseImageDto) obj;
        String url = baseImageDto != null ? baseImageDto.getUrl() : null;
        Iterator<T> it2 = appsActionBannerDto.e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((BaseImageDto) obj2).d() == BaseImageDto.ThemeDto.DARK) {
                break;
            }
        }
        BaseImageDto baseImageDto2 = (BaseImageDto) obj2;
        String url2 = baseImageDto2 != null ? baseImageDto2.getUrl() : null;
        String title = appsActionBannerDto.getTitle();
        AppsActionBannerDto.BannerTypeDto d = appsActionBannerDto.d();
        int i = d == null ? -1 : a.$EnumSwitchMapping$0[d.ordinal()];
        if (i == 1) {
            bannerType = BannerType.BONUS_VOTES;
        } else if (i == 2) {
            bannerType = BannerType.FREE_VOTES;
        } else if (i == 3) {
            bannerType = BannerType.PERCENT_DISCOUNT;
        }
        return new l1a0(url, url2, title, bannerType, appsActionBannerDto.getDescription(), appsActionBannerDto.g(), appsActionBannerDto.f());
    }
}
