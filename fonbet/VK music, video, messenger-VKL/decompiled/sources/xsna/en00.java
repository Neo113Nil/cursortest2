package xsna;

import android.os.Parcelable;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.ImageList;
import com.vk.dto.stickers.ImageConfigId;
import com.vk.dto.stickers.StickerAnimation;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.popup.PopupLayerFitType;
import com.vk.dto.stickers.popup.PopupLayerGradientPositionType;
import com.vk.dto.stickers.popup.PopupLayerPositionXType;
import com.vk.dto.stickers.popup.PopupLayerPositionYType;
import com.vk.dto.stickers.popup.PopupLayerRepeatType;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.dto.stickers.popup.PopupStickerAnimationLayer;
import com.vk.dto.stickers.ugc.UgcStatus;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageConfigIdDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageListDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageSizeDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupLayerFitTypeDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupLayerGradientPositionTypeDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupLayerPositionXTypeDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupLayerPositionYTypeDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupLayerRepeatTypeDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupStickerAnimationDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.PopupStickerAnimationLayerDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerAnimationDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerItemDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.StickerRenderDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.UgcStatusDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Mappers.kt */
/* loaded from: classes5.dex */
public final class en00 {

    /* compiled from: Mappers.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$10;
        public static final /* synthetic */ int[] $EnumSwitchMapping$11;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;
        public static final /* synthetic */ int[] $EnumSwitchMapping$8;
        public static final /* synthetic */ int[] $EnumSwitchMapping$9;

        static {
            int[] iArr = new int[PopupLayerFitType.values().length];
            try {
                iArr[PopupLayerFitType.CONTAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PopupLayerFitType.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PopupLayerFitTypeDto.values().length];
            try {
                iArr2[PopupLayerFitTypeDto.CONTAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PopupLayerFitTypeDto.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[UgcStatus.values().length];
            try {
                iArr3[UgcStatus.CLAIMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[UgcStatus.BANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[UgcStatus.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[UgcStatus.AGE_RESTRICTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[UgcStatus.OK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[UgcStatusDto.values().length];
            try {
                iArr4[UgcStatusDto.CLAIMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[UgcStatusDto.BANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[UgcStatusDto.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[UgcStatusDto.AGE_RESTRICTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[UgcStatusDto.OK.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[PopupLayerGradientPositionType.values().length];
            try {
                iArr5[PopupLayerGradientPositionType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[PopupLayerGradientPositionType.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[PopupLayerGradientPositionType.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[PopupLayerGradientPositionType.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[PopupLayerGradientPositionType.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[PopupLayerGradientPositionTypeDto.values().length];
            try {
                iArr6[PopupLayerGradientPositionTypeDto.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[PopupLayerGradientPositionTypeDto.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[PopupLayerGradientPositionTypeDto.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[PopupLayerGradientPositionTypeDto.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[PopupLayerGradientPositionTypeDto.RIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused24) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[PopupLayerPositionXType.values().length];
            try {
                iArr7[PopupLayerPositionXType.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr7[PopupLayerPositionXType.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[PopupLayerPositionXType.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[PopupLayerPositionXTypeDto.values().length];
            try {
                iArr8[PopupLayerPositionXTypeDto.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr8[PopupLayerPositionXTypeDto.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr8[PopupLayerPositionXTypeDto.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$7 = iArr8;
            int[] iArr9 = new int[PopupLayerPositionYType.values().length];
            try {
                iArr9[PopupLayerPositionYType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr9[PopupLayerPositionYType.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr9[PopupLayerPositionYType.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            $EnumSwitchMapping$8 = iArr9;
            int[] iArr10 = new int[PopupLayerPositionYTypeDto.values().length];
            try {
                iArr10[PopupLayerPositionYTypeDto.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr10[PopupLayerPositionYTypeDto.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr10[PopupLayerPositionYTypeDto.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused36) {
            }
            $EnumSwitchMapping$9 = iArr10;
            int[] iArr11 = new int[PopupLayerRepeatType.values().length];
            try {
                iArr11[PopupLayerRepeatType.NO_REPEAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr11[PopupLayerRepeatType.REPEAT_X.ordinal()] = 2;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr11[PopupLayerRepeatType.REPEAT_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr11[PopupLayerRepeatType.REPEAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused40) {
            }
            $EnumSwitchMapping$10 = iArr11;
            int[] iArr12 = new int[PopupLayerRepeatTypeDto.values().length];
            try {
                iArr12[PopupLayerRepeatTypeDto.NO_REPEAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr12[PopupLayerRepeatTypeDto.REPEAT_X.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr12[PopupLayerRepeatTypeDto.REPEAT_Y.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr12[PopupLayerRepeatTypeDto.REPEAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused44) {
            }
            $EnumSwitchMapping$11 = iArr12;
        }
    }

    public static final StickerItem a(StickerItemDto stickerItemDto) {
        int c = stickerItemDto.c();
        int g = stickerItemDto.g();
        ImageList l = l(stickerItemDto.d());
        ImageList l2 = l(stickerItemDto.e());
        ImageConfigIdDto b = stickerItemDto.b();
        ImageConfigId imageConfigId = b != null ? new ImageConfigId(b.b(), b.a()) : null;
        StickerAnimationDto a2 = stickerItemDto.a();
        PopupStickerAnimation popupStickerAnimation = null;
        StickerAnimation stickerAnimation = new StickerAnimation(a2.a(), a2.b());
        boolean j = stickerItemDto.j();
        StickerRenderDto h = stickerItemDto.h();
        StickerRender stickerRender = h != null ? new StickerRender(h.a(), l(h.b()), l(h.c()), h.e(), h.d()) : null;
        String i = stickerItemDto.i();
        PopupStickerAnimationDto f = stickerItemDto.f();
        if (f != null) {
            popupStickerAnimation = d(f);
        }
        return new StickerItem(c, g, l, l2, imageConfigId, stickerAnimation, j, stickerRender, i, popupStickerAnimation);
    }

    public static final PopupLayerPositionXType b(PopupLayerPositionXTypeDto popupLayerPositionXTypeDto) {
        int i = a.$EnumSwitchMapping$7[popupLayerPositionXTypeDto.ordinal()];
        if (i == 1) {
            return PopupLayerPositionXType.LEFT;
        }
        if (i == 2) {
            return PopupLayerPositionXType.CENTER;
        }
        if (i == 3) {
            return PopupLayerPositionXType.RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PopupLayerPositionYType c(PopupLayerPositionYTypeDto popupLayerPositionYTypeDto) {
        int i = a.$EnumSwitchMapping$9[popupLayerPositionYTypeDto.ordinal()];
        if (i == 1) {
            return PopupLayerPositionYType.TOP;
        }
        if (i == 2) {
            return PopupLayerPositionYType.MIDDLE;
        }
        if (i == 3) {
            return PopupLayerPositionYType.BOTTOM;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PopupStickerAnimation d(PopupStickerAnimationDto popupStickerAnimationDto) {
        PopupLayerRepeatType popupLayerRepeatType;
        PopupLayerFitType popupLayerFitType;
        Parcelable popupStickerFullscreenAnimationLayer;
        PopupLayerGradientPositionType popupLayerGradientPositionType;
        boolean a2 = popupStickerAnimationDto.a();
        List<PopupStickerAnimationLayerDto> b = popupStickerAnimationDto.b();
        ArrayList arrayList = new ArrayList(c5g.u(b, 10));
        for (PopupStickerAnimationLayerDto popupStickerAnimationLayerDto : b) {
            if (popupStickerAnimationLayerDto instanceof PopupStickerAnimationLayerDto.PopupStickerGradientLayerDto) {
                PopupStickerAnimationLayerDto.PopupStickerGradientLayerDto popupStickerGradientLayerDto = (PopupStickerAnimationLayerDto.PopupStickerGradientLayerDto) popupStickerAnimationLayerDto;
                int i = a.$EnumSwitchMapping$5[popupStickerGradientLayerDto.a().ordinal()];
                if (i == 1) {
                    popupLayerGradientPositionType = PopupLayerGradientPositionType.TOP;
                } else if (i == 2) {
                    popupLayerGradientPositionType = PopupLayerGradientPositionType.BOTTOM;
                } else if (i == 3) {
                    popupLayerGradientPositionType = PopupLayerGradientPositionType.LEFT;
                } else if (i == 4) {
                    popupLayerGradientPositionType = PopupLayerGradientPositionType.CENTER;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    popupLayerGradientPositionType = PopupLayerGradientPositionType.RIGHT;
                }
                popupStickerFullscreenAnimationLayer = new PopupStickerAnimationLayer.PopupStickerGradientLayer(popupLayerGradientPositionType, popupStickerGradientLayerDto.b());
            } else if (popupStickerAnimationLayerDto instanceof PopupStickerAnimationLayerDto.PopupStickerFixedAnimationLayerDto) {
                PopupStickerAnimationLayerDto.PopupStickerFixedAnimationLayerDto popupStickerFixedAnimationLayerDto = (PopupStickerAnimationLayerDto.PopupStickerFixedAnimationLayerDto) popupStickerAnimationLayerDto;
                popupStickerFullscreenAnimationLayer = new PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer(b(popupStickerFixedAnimationLayerDto.b()), c(popupStickerFixedAnimationLayerDto.c()), popupStickerFixedAnimationLayerDto.e(), popupStickerFixedAnimationLayerDto.a(), popupStickerFixedAnimationLayerDto.d());
            } else {
                if (!(popupStickerAnimationLayerDto instanceof PopupStickerAnimationLayerDto.PopupStickerFullscreenAnimationLayerDto)) {
                    throw new NoWhenBranchMatchedException();
                }
                PopupStickerAnimationLayerDto.PopupStickerFullscreenAnimationLayerDto popupStickerFullscreenAnimationLayerDto = (PopupStickerAnimationLayerDto.PopupStickerFullscreenAnimationLayerDto) popupStickerAnimationLayerDto;
                PopupLayerPositionXType b2 = b(popupStickerFullscreenAnimationLayerDto.c());
                PopupLayerPositionYType c = c(popupStickerFullscreenAnimationLayerDto.d());
                String g = popupStickerFullscreenAnimationLayerDto.g();
                int b3 = popupStickerFullscreenAnimationLayerDto.b();
                int i2 = a.$EnumSwitchMapping$11[popupStickerFullscreenAnimationLayerDto.e().ordinal()];
                if (i2 == 1) {
                    popupLayerRepeatType = PopupLayerRepeatType.NO_REPEAT;
                } else if (i2 == 2) {
                    popupLayerRepeatType = PopupLayerRepeatType.REPEAT_X;
                } else if (i2 == 3) {
                    popupLayerRepeatType = PopupLayerRepeatType.REPEAT_Y;
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    popupLayerRepeatType = PopupLayerRepeatType.REPEAT;
                }
                PopupLayerRepeatType popupLayerRepeatType2 = popupLayerRepeatType;
                int i3 = a.$EnumSwitchMapping$1[popupStickerFullscreenAnimationLayerDto.a().ordinal()];
                if (i3 == 1) {
                    popupLayerFitType = PopupLayerFitType.CONTAIN;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    popupLayerFitType = PopupLayerFitType.COVER;
                }
                popupStickerFullscreenAnimationLayer = new PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer(b2, c, g, b3, popupLayerRepeatType2, popupLayerFitType, popupStickerFullscreenAnimationLayerDto.f());
            }
            arrayList.add(popupStickerFullscreenAnimationLayer);
        }
        return new PopupStickerAnimation(a2, arrayList);
    }

    public static final ImageListDto e(Image image) {
        ArrayList<ImageSize> arrayList = image.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        for (ImageSize imageSize : arrayList) {
            com.vk.dto.common.im.Image image2 = imageSize.d;
            arrayList2.add(new ImageSizeDto(image2.d, image2.c, image2.b, imageSize.c7(), imageSize.c));
        }
        return new ImageListDto(arrayList2);
    }

    public static final ImageListDto f(ImageList imageList) {
        List<com.vk.dto.common.im.Image> list = imageList.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (com.vk.dto.common.im.Image image : list) {
            arrayList.add(new ImageSizeDto(image.d, image.c, image.b, image.e, false));
        }
        return new ImageListDto(arrayList);
    }

    public static final PopupLayerPositionXTypeDto g(PopupLayerPositionXType popupLayerPositionXType) {
        int i = a.$EnumSwitchMapping$6[popupLayerPositionXType.ordinal()];
        if (i == 1) {
            return PopupLayerPositionXTypeDto.LEFT;
        }
        if (i == 2) {
            return PopupLayerPositionXTypeDto.CENTER;
        }
        if (i == 3) {
            return PopupLayerPositionXTypeDto.RIGHT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PopupLayerPositionYTypeDto h(PopupLayerPositionYType popupLayerPositionYType) {
        int i = a.$EnumSwitchMapping$8[popupLayerPositionYType.ordinal()];
        if (i == 1) {
            return PopupLayerPositionYTypeDto.TOP;
        }
        if (i == 2) {
            return PopupLayerPositionYTypeDto.MIDDLE;
        }
        if (i == 3) {
            return PopupLayerPositionYTypeDto.BOTTOM;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final PopupStickerAnimationDto i(PopupStickerAnimation popupStickerAnimation) {
        PopupLayerRepeatTypeDto popupLayerRepeatTypeDto;
        PopupLayerFitTypeDto popupLayerFitTypeDto;
        PopupStickerAnimationLayerDto popupStickerFullscreenAnimationLayerDto;
        PopupLayerGradientPositionTypeDto popupLayerGradientPositionTypeDto;
        boolean z = popupStickerAnimation.b;
        List<PopupStickerAnimationLayer> list = popupStickerAnimation.c;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (PopupStickerAnimationLayer popupStickerAnimationLayer : list) {
            if (popupStickerAnimationLayer instanceof PopupStickerAnimationLayer.PopupStickerGradientLayer) {
                PopupStickerAnimationLayer.PopupStickerGradientLayer popupStickerGradientLayer = (PopupStickerAnimationLayer.PopupStickerGradientLayer) popupStickerAnimationLayer;
                int i = a.$EnumSwitchMapping$4[popupStickerGradientLayer.b.ordinal()];
                if (i == 1) {
                    popupLayerGradientPositionTypeDto = PopupLayerGradientPositionTypeDto.TOP;
                } else if (i == 2) {
                    popupLayerGradientPositionTypeDto = PopupLayerGradientPositionTypeDto.BOTTOM;
                } else if (i == 3) {
                    popupLayerGradientPositionTypeDto = PopupLayerGradientPositionTypeDto.LEFT;
                } else if (i == 4) {
                    popupLayerGradientPositionTypeDto = PopupLayerGradientPositionTypeDto.CENTER;
                } else {
                    if (i != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    popupLayerGradientPositionTypeDto = PopupLayerGradientPositionTypeDto.RIGHT;
                }
                popupStickerFullscreenAnimationLayerDto = new PopupStickerAnimationLayerDto.PopupStickerGradientLayerDto(popupLayerGradientPositionTypeDto, popupStickerGradientLayer.c);
            } else if (popupStickerAnimationLayer instanceof PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer) {
                PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer popupStickerFixedAnimationLayer = (PopupStickerAnimationLayer.PopupStickerFixedAnimationLayer) popupStickerAnimationLayer;
                popupStickerFullscreenAnimationLayerDto = new PopupStickerAnimationLayerDto.PopupStickerFixedAnimationLayerDto(g(popupStickerFixedAnimationLayer.b), h(popupStickerFixedAnimationLayer.c), popupStickerFixedAnimationLayer.d, popupStickerFixedAnimationLayer.e, popupStickerFixedAnimationLayer.f);
            } else {
                if (!(popupStickerAnimationLayer instanceof PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer)) {
                    throw new NoWhenBranchMatchedException();
                }
                PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer popupStickerFullscreenAnimationLayer = (PopupStickerAnimationLayer.PopupStickerFullscreenAnimationLayer) popupStickerAnimationLayer;
                PopupLayerPositionXTypeDto g = g(popupStickerFullscreenAnimationLayer.b);
                PopupLayerPositionYTypeDto h = h(popupStickerFullscreenAnimationLayer.c);
                String str = popupStickerFullscreenAnimationLayer.d;
                int i2 = popupStickerFullscreenAnimationLayer.e;
                int i3 = a.$EnumSwitchMapping$10[popupStickerFullscreenAnimationLayer.f.ordinal()];
                if (i3 == 1) {
                    popupLayerRepeatTypeDto = PopupLayerRepeatTypeDto.NO_REPEAT;
                } else if (i3 == 2) {
                    popupLayerRepeatTypeDto = PopupLayerRepeatTypeDto.REPEAT_X;
                } else if (i3 == 3) {
                    popupLayerRepeatTypeDto = PopupLayerRepeatTypeDto.REPEAT_Y;
                } else {
                    if (i3 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    popupLayerRepeatTypeDto = PopupLayerRepeatTypeDto.REPEAT;
                }
                PopupLayerRepeatTypeDto popupLayerRepeatTypeDto2 = popupLayerRepeatTypeDto;
                int i4 = a.$EnumSwitchMapping$0[popupStickerFullscreenAnimationLayer.g.ordinal()];
                if (i4 == 1) {
                    popupLayerFitTypeDto = PopupLayerFitTypeDto.CONTAIN;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    popupLayerFitTypeDto = PopupLayerFitTypeDto.COVER;
                }
                popupStickerFullscreenAnimationLayerDto = new PopupStickerAnimationLayerDto.PopupStickerFullscreenAnimationLayerDto(g, h, str, i2, popupLayerRepeatTypeDto2, popupLayerFitTypeDto, popupStickerFullscreenAnimationLayer.h);
            }
            arrayList.add(popupStickerFullscreenAnimationLayerDto);
        }
        return new PopupStickerAnimationDto(z, arrayList);
    }

    public static final StickerItemDto j(StickerItem stickerItem) {
        PopupStickerAnimationDto popupStickerAnimationDto;
        StickerRenderDto stickerRenderDto;
        int i = stickerItem.b;
        int i2 = stickerItem.c;
        ImageListDto f = f(stickerItem.d);
        ImageListDto f2 = f(stickerItem.e);
        ImageConfigId imageConfigId = stickerItem.f;
        ImageConfigIdDto imageConfigIdDto = imageConfigId != null ? new ImageConfigIdDto(imageConfigId.b, imageConfigId.c) : null;
        StickerAnimation stickerAnimation = stickerItem.g;
        StickerAnimationDto stickerAnimationDto = new StickerAnimationDto(stickerAnimation.zb(), stickerAnimation.Bb());
        boolean z = stickerItem.h;
        StickerRender stickerRender = stickerItem.i;
        if (stickerRender != null) {
            stickerRenderDto = new StickerRenderDto(stickerRender.b, f(stickerRender.c), f(stickerRender.d), stickerRender.e, stickerRender.f);
            popupStickerAnimationDto = null;
        } else {
            popupStickerAnimationDto = null;
            stickerRenderDto = null;
        }
        String str = stickerItem.j;
        PopupStickerAnimation popupStickerAnimation = stickerItem.k;
        if (popupStickerAnimation != null) {
            popupStickerAnimationDto = i(popupStickerAnimation);
        }
        return new StickerItemDto(i, i2, f, f2, imageConfigIdDto, stickerAnimationDto, z, stickerRenderDto, str, popupStickerAnimationDto);
    }

    public static final Image k(ImageListDto imageListDto) {
        List<ImageSizeDto> a2 = imageListDto.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        for (ImageSizeDto imageSizeDto : a2) {
            String b = imageSizeDto.b();
            int a3 = imageSizeDto.a();
            int c = imageSizeDto.c();
            boolean e = imageSizeDto.e();
            arrayList.add(new ImageSize(b, c, a3, Boolean.valueOf(e), (char) 0, imageSizeDto.d(), 16, null));
        }
        return new Image(arrayList);
    }

    public static final ImageList l(ImageListDto imageListDto) {
        List<ImageSizeDto> a2 = imageListDto.a();
        ArrayList arrayList = new ArrayList(c5g.u(a2, 10));
        for (ImageSizeDto imageSizeDto : a2) {
            String b = imageSizeDto.b();
            arrayList.add(new com.vk.dto.common.im.Image(imageSizeDto.c(), imageSizeDto.a(), b, imageSizeDto.e()));
        }
        return new ImageList(new ArrayList(arrayList));
    }
}
