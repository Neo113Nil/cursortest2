package xsna;

import com.vk.api.generated.catalog.dto.CatalogPinnedVideosItemDto;
import com.vk.libvideo.author.VideoPinType;

/* compiled from: VideoPinType.kt */
/* loaded from: classes2.dex */
public final class k3t0 {

    /* compiled from: VideoPinType.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CatalogPinnedVideosItemDto.PinTypeDto.values().length];
            try {
                iArr[CatalogPinnedVideosItemDto.PinTypeDto.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogPinnedVideosItemDto.PinTypeDto.SUB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogPinnedVideosItemDto.PinTypeDto.NON_SUB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogPinnedVideosItemDto.PinTypeDto.CLIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoPinType.values().length];
            try {
                iArr2[VideoPinType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoPinType.SUBSCRIBERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[VideoPinType.NON_SUBSCRIBERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final VideoPinType a(CatalogPinnedVideosItemDto.PinTypeDto pinTypeDto) {
        int i = pinTypeDto == null ? -1 : a.$EnumSwitchMapping$0[pinTypeDto.ordinal()];
        if (i == 1) {
            return VideoPinType.ALL;
        }
        if (i == 2) {
            return VideoPinType.SUBSCRIBERS;
        }
        if (i == 3) {
            return VideoPinType.NON_SUBSCRIBERS;
        }
        if (i != 4) {
            return null;
        }
        return VideoPinType.CLIP;
    }
}
