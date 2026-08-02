package xsna;

import com.vk.api.generated.stickers.dto.StickersPackBadgeDto;

/* compiled from: StickersPackPreviewDtoToStickerPackPreviewMapper.kt */
/* loaded from: classes16.dex */
public final class abl0 {

    /* compiled from: StickersPackPreviewDtoToStickerPackPreviewMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickersPackBadgeDto.SubtypeDto.values().length];
            try {
                iArr[StickersPackBadgeDto.SubtypeDto.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickersPackBadgeDto.SubtypeDto.DISCOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
