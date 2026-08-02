package xsna;

import com.vk.api.generated.wall.dto.WallWallpostAttachmentsMetaDto;

/* compiled from: WallpostAttachmentsMetaDtoToAttachmentsMetaMapper.kt */
/* loaded from: classes3.dex */
public final class wax0 {

    /* compiled from: WallpostAttachmentsMetaDtoToAttachmentsMetaMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[WallWallpostAttachmentsMetaDto.PrimaryModeDto.values().length];
            try {
                iArr[WallWallpostAttachmentsMetaDto.PrimaryModeDto.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WallWallpostAttachmentsMetaDto.PrimaryModeDto.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WallWallpostAttachmentsMetaDto.PrimaryModeDto.CAROUSEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[WallWallpostAttachmentsMetaDto.CarouselLayoutDto.values().length];
            try {
                iArr2[WallWallpostAttachmentsMetaDto.CarouselLayoutDto.ROUNDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[WallWallpostAttachmentsMetaDto.CarouselLayoutDto.WIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
