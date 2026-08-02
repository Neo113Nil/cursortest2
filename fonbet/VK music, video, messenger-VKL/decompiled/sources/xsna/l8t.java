package xsna;

import com.vk.api.generated.apps.dto.AppsAchievementBlockLabelDto;
import com.vk.api.generated.apps.dto.AppsCatalogBaseActionTypeDto;
import com.vk.api.generated.apps.dto.AppsMiniappsAchievementInfoDto;
import com.vk.api.generated.apps.dto.AppsWhatInsideModalInfoGiftsDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GamesAchievementBlockMapper.kt */
/* loaded from: classes17.dex */
public final class l8t {
    public final z9t a;
    public final act b;

    /* compiled from: GamesAchievementBlockMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[AppsMiniappsAchievementInfoDto.AchievementTypeDto.values().length];
            try {
                iArr[AppsMiniappsAchievementInfoDto.AchievementTypeDto.TIMESPENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppsMiniappsAchievementInfoDto.AchievementTypeDto.VOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppsMiniappsAchievementInfoDto.StateDto.values().length];
            try {
                iArr2[AppsMiniappsAchievementInfoDto.StateDto.IN_PROGRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AppsMiniappsAchievementInfoDto.StateDto.READY_TO_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AppsMiniappsAchievementInfoDto.StateDto.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AppsAchievementBlockLabelDto.ColorDto.values().length];
            try {
                iArr3[AppsAchievementBlockLabelDto.ColorDto.GREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AppsAchievementBlockLabelDto.ColorDto.YELLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[AppsAchievementBlockLabelDto.ColorDto.RED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[AppsCatalogBaseActionTypeDto.values().length];
            try {
                iArr4[AppsCatalogBaseActionTypeDto.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[AppsCatalogBaseActionTypeDto.OPEN_MINI_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[AppsCatalogBaseActionTypeDto.OPEN_GAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[AppsCatalogBaseActionTypeDto.OPEN_ACHIEVEMENT_MODAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[AppsWhatInsideModalInfoGiftsDto.TypeDto.values().length];
            try {
                iArr5[AppsWhatInsideModalInfoGiftsDto.TypeDto.VOTES_COUPON.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[AppsWhatInsideModalInfoGiftsDto.TypeDto.WISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public l8t(z9t z9tVar, act actVar) {
        this.a = z9tVar;
        this.b = actVar;
    }

    public static WebImage a(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new WebImageSize(baseImageDto.getUrl(), baseImageDto.getHeight(), baseImageDto.getWidth(), (char) 0, false, baseImageDto.e(), 24, null));
        }
        return new WebImage(arrayList);
    }
}
