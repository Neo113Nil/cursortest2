package xsna;

import com.vk.api.generated.gifts.dto.GiftsAnimationDto;
import com.vk.api.generated.gifts.dto.GiftsAnimationSourceDto;
import com.vk.api.generated.gifts.dto.GiftsBackgroundDto;
import com.vk.api.generated.gifts.dto.GiftsGiftBaseUrlConfigAdditionalLayoutDto;
import com.vk.api.generated.gifts.dto.GiftsGiftBaseUrlConfigAdditionalThemeDto;
import com.vk.api.generated.gifts.dto.GiftsGiftBaseUrlConfigDto;
import com.vk.api.generated.gifts.dto.GiftsGiftCardDto;
import com.vk.api.generated.gifts.dto.GiftsGiftImageStatusAttachmentDto;
import com.vk.api.generated.gifts.dto.GiftsGiftImageStatusPackAttachmentDto;
import com.vk.api.generated.gifts.dto.GiftsImageDto;
import com.vk.api.generated.gifts.dto.GiftsImageSourceDto;
import com.vk.api.generated.gifts.dto.GiftsLayoutDto;
import com.vk.api.generated.gifts.dto.GiftsRarityDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.gift.Animation;
import com.vk.dto.common.gift.GiftAnimation;
import com.vk.dto.common.gift.GiftBackground;
import com.vk.dto.common.gift.GiftBaseUrlConfig;
import com.vk.dto.common.gift.GiftCard;
import com.vk.dto.common.gift.GiftRarity;
import com.vk.dto.common.gift.GiftTheme;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.gift.ImageStatus;
import com.vk.dto.common.gift.ImageStatusPack;
import com.vk.dto.gift.Gift;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: GiftsLayoutDtoToGiftMapper.kt */
/* loaded from: classes3.dex */
public final class vzt {

    /* compiled from: GiftsLayoutDtoToGiftMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[GiftsRarityDto.TypeDto.values().length];
            try {
                iArr[GiftsRarityDto.TypeDto.UNCOMMON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftsRarityDto.TypeDto.RARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftsRarityDto.TypeDto.LEGENDARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GiftsRarityDto.TypeDto.FALLBACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[GiftsBackgroundDto.ThemeDto.values().length];
            try {
                iArr2[GiftsBackgroundDto.ThemeDto.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[GiftsBackgroundDto.ThemeDto.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[GiftsAnimationSourceDto.ThemeDto.values().length];
            try {
                iArr3[GiftsAnimationSourceDto.ThemeDto.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[GiftsAnimationSourceDto.ThemeDto.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[GiftsLayoutDto.TypeDto.values().length];
            try {
                iArr4[GiftsLayoutDto.TypeDto.IMAGE_STATUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[GiftsLayoutDto.TypeDto.IMAGE_STATUS_PACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[GiftsLayoutDto.TypeDto.REGULAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[GiftsLayoutDto.TypeDto.STICKERS_PACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[GiftsLayoutDto.TypeDto.RANDOM_STICKERS_PACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[GiftsLayoutDto.TypeDto.STICKERS_PACK_FOR_CHOICE.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[GiftsLayoutDto.TypeDto.GIFT_CARD.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006f, code lost:
    
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List<com.vk.dto.common.gift.GiftBackground>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Gift a(GiftsLayoutDto giftsLayoutDto) {
        GiftType giftType;
        GiftCard giftCard;
        ?? r4;
        GiftRarity giftRarity;
        ?? r6;
        ?? r5;
        GiftRarity.Type type;
        ?? r12;
        Gift gift = new Gift();
        gift.c = giftsLayoutDto.getId();
        gift.d = giftsLayoutDto.p();
        gift.e = giftsLayoutDto.u();
        gift.f = giftsLayoutDto.o();
        String k = giftsLayoutDto.k();
        gift.i = k != null ? drm0.c0(k, new String[]{StringUtils.COMMA}, 0, 6) : EmptyList.b;
        gift.g = giftsLayoutDto.n();
        Boolean C = giftsLayoutDto.C();
        if (C == null) {
            C = Boolean.FALSE;
        }
        gift.h = C;
        GiftsLayoutDto.TypeDto B = giftsLayoutDto.B();
        if (B != null) {
            switch (a.$EnumSwitchMapping$3[B.ordinal()]) {
                case 1:
                    giftType = GiftType.IMAGE_STATUS;
                    break;
                case 2:
                    giftType = GiftType.IMAGE_STATUS_PACK;
                    break;
                case 3:
                    giftType = GiftType.REGULAR;
                    break;
                case 4:
                    giftType = GiftType.STICKERS_PACK;
                    break;
                case 5:
                    giftType = GiftType.RANDOM_STICKERS_PACK;
                    break;
                case 6:
                    giftType = GiftType.STICKERS_PACK_FOR_CHOICES;
                    break;
                case 7:
                    giftType = GiftType.GIFT_CARD;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        giftType = GiftType.REGULAR;
        gift.n = giftType;
        GiftsGiftImageStatusAttachmentDto i = giftsLayoutDto.i();
        GiftBaseUrlConfig giftBaseUrlConfig = null;
        gift.o = i != null ? new ImageStatus(i.getUrl(), i.d(), i.e()) : null;
        GiftsGiftImageStatusPackAttachmentDto j = giftsLayoutDto.j();
        gift.p = j != null ? new ImageStatusPack(j.getUrl(), j.d()) : null;
        GiftsGiftCardDto g = giftsLayoutDto.g();
        if (g != null) {
            int d = g.d();
            Boolean e = g.e();
            giftCard = new GiftCard(d, null, e != null ? e.booleanValue() : false, 2, null);
        } else {
            giftCard = null;
        }
        gift.q = giftCard;
        GiftsAnimationDto d2 = giftsLayoutDto.d();
        GiftAnimation b = d2 != null ? b(d2, String.valueOf(giftsLayoutDto.getId())) : null;
        gift.j = b;
        if (b != null) {
            List<Animation> list = b.c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext() && ((Animation) it.next()).c != GiftTheme.DARK) {
                }
            }
        }
        List<GiftsBackgroundDto> e2 = giftsLayoutDto.e();
        if (e2 != null) {
            List<GiftsBackgroundDto> list2 = e2;
            r4 = new ArrayList(c5g.u(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                r4.add(c((GiftsBackgroundDto) it2.next()));
            }
        } else {
            r4 = EmptyList.b;
        }
        gift.k = r4;
        GiftsRarityDto l = giftsLayoutDto.l();
        if (l != null) {
            String title = l.getTitle();
            int i2 = a.$EnumSwitchMapping$0[l.l().ordinal()];
            if (i2 == 1) {
                type = GiftRarity.Type.UNCOMMON;
            } else if (i2 == 2) {
                type = GiftRarity.Type.RARE;
            } else if (i2 == 3) {
                type = GiftRarity.Type.LEGENDARY;
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                type = GiftRarity.Type.UNKNOWN;
            }
            GiftRarity.Type type2 = type;
            Integer k2 = l.k();
            Integer e3 = l.e();
            Integer g2 = l.g();
            Integer j2 = l.j();
            String d3 = l.d();
            List<GiftsBackgroundDto> f = l.f();
            if (f != null) {
                List<GiftsBackgroundDto> list3 = f;
                r12 = new ArrayList(c5g.u(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    r12.add(c((GiftsBackgroundDto) it3.next()));
                }
            } else {
                r12 = EmptyList.b;
            }
            List list4 = r12;
            GiftsAnimationDto i3 = l.i();
            giftRarity = new GiftRarity(title, type2, k2, e3, g2, j2, d3, null, null, i3 != null ? b(i3, "secondary_animation") : null, list4, 384, null);
        } else {
            giftRarity = null;
        }
        gift.l = giftRarity;
        GiftsGiftBaseUrlConfigDto f2 = giftsLayoutDto.f();
        if (f2 != null) {
            String f3 = f2.f();
            Integer g3 = f2.g();
            List<GiftsGiftBaseUrlConfigAdditionalLayoutDto> d4 = f2.d();
            if (d4 != null) {
                List<GiftsGiftBaseUrlConfigAdditionalLayoutDto> list5 = d4;
                r6 = new ArrayList(c5g.u(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    r6.add(((GiftsGiftBaseUrlConfigAdditionalLayoutDto) it4.next()).i());
                }
            } else {
                r6 = EmptyList.b;
            }
            List<GiftsGiftBaseUrlConfigAdditionalThemeDto> e4 = f2.e();
            if (e4 != null) {
                List<GiftsGiftBaseUrlConfigAdditionalThemeDto> list6 = e4;
                r5 = new ArrayList(c5g.u(list6, 10));
                Iterator it5 = list6.iterator();
                while (it5.hasNext()) {
                    r5.add(((GiftsGiftBaseUrlConfigAdditionalThemeDto) it5.next()).i());
                }
            } else {
                r5 = EmptyList.b;
            }
            giftBaseUrlConfig = new GiftBaseUrlConfig(f3, g3, r6, r5);
        }
        gift.m = giftBaseUrlConfig;
        return gift;
    }

    public static GiftAnimation b(GiftsAnimationDto giftsAnimationDto, String str) {
        GiftTheme giftTheme;
        List<GiftsAnimationSourceDto> e = giftsAnimationDto.e();
        ArrayList arrayList = new ArrayList(c5g.u(e, 10));
        for (GiftsAnimationSourceDto giftsAnimationSourceDto : e) {
            String url = giftsAnimationSourceDto.getUrl();
            GiftsAnimationSourceDto.ThemeDto d = giftsAnimationSourceDto.d();
            int i = d == null ? -1 : a.$EnumSwitchMapping$2[d.ordinal()];
            if (i == -1) {
                giftTheme = GiftTheme.UNKNOWN;
            } else if (i == 1) {
                giftTheme = GiftTheme.LIGHT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                giftTheme = GiftTheme.DARK;
            }
            arrayList.add(new Animation(url, giftTheme));
        }
        Integer d2 = giftsAnimationDto.d();
        return new GiftAnimation(str, arrayList, d2 != null ? d2.intValue() : 0);
    }

    public static GiftBackground c(GiftsBackgroundDto giftsBackgroundDto) {
        Image image;
        GiftTheme giftTheme;
        String d = giftsBackgroundDto.d();
        GiftsImageDto e = giftsBackgroundDto.e();
        GiftTheme giftTheme2 = null;
        if (e != null) {
            List<GiftsImageSourceDto> d2 = e.d();
            ArrayList arrayList = new ArrayList(c5g.u(d2, 10));
            for (GiftsImageSourceDto giftsImageSourceDto : d2) {
                arrayList.add(new ImageSize(giftsImageSourceDto.getUrl(), giftsImageSourceDto.getWidth(), giftsImageSourceDto.getHeight(), null, (char) 0, false, 56, null));
            }
            image = new Image(arrayList);
        } else {
            image = null;
        }
        GiftsBackgroundDto.ThemeDto f = giftsBackgroundDto.f();
        if (f != null) {
            int i = a.$EnumSwitchMapping$1[f.ordinal()];
            if (i == 1) {
                giftTheme = GiftTheme.LIGHT;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                giftTheme = GiftTheme.DARK;
            }
            giftTheme2 = giftTheme;
        }
        return new GiftBackground(d, image, giftTheme2);
    }
}
