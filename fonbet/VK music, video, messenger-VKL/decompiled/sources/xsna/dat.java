package xsna;

import com.vk.api.generated.apps.dto.AppsActivityItemDto;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.games.model.GamesCatalogActivityType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GamesCatalogCollectionsMapper.kt */
/* loaded from: classes17.dex */
public final class dat {
    public final cct a;
    public final z9t b;
    public final act c;

    /* compiled from: GamesCatalogCollectionsMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppsActivityItemDto.TypeDto.values().length];
            try {
                iArr[AppsActivityItemDto.TypeDto.INSTALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.SCORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.LEVEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.ACHIEVEMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.STICKERS_ACHIEVEMENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.GAME_SEND_GIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.INVITE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.REQUEST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.APPS_NEWS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.NOTIFICATION.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AppsActivityItemDto.TypeDto.RUN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public dat(cct cctVar, z9t z9tVar, act actVar) {
        this.a = cctVar;
        this.b = z9tVar;
        this.c = actVar;
    }

    public static GamesCatalogActivityType a(AppsActivityItemDto.TypeDto typeDto) {
        switch (a.$EnumSwitchMapping$0[typeDto.ordinal()]) {
            case 1:
                return GamesCatalogActivityType.INSTALL;
            case 2:
                return GamesCatalogActivityType.SCORE;
            case 3:
                return GamesCatalogActivityType.LEVEL;
            case 4:
                return GamesCatalogActivityType.ACHIEVEMENT;
            case 5:
                return GamesCatalogActivityType.STICKERS_ACHIEVEMENT;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return null;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static WebImage b(List list) {
        List<BaseImageDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (BaseImageDto baseImageDto : list2) {
            arrayList.add(new WebImageSize(baseImageDto.getUrl(), baseImageDto.getHeight(), baseImageDto.getWidth(), (char) 0, false, baseImageDto.e(), 24, null));
        }
        return new WebImage(arrayList);
    }
}
