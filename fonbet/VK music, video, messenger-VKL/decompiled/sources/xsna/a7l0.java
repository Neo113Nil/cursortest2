package xsna;

import com.vk.attachpicker.stat.models.VkStickerMeta;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$StickerData;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StickerStatExt.kt */
/* loaded from: classes15.dex */
public final class a7l0 {

    /* compiled from: StickerStatExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkStickerMeta.Type.values().length];
            try {
                iArr[VkStickerMeta.Type.Individual.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkStickerMeta.Type.FromPack.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkStickerMeta.Type.Animated.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkStickerMeta.Type.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkStickerMeta.Type.Vmoji.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkStickerMeta.Type.Emoji.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MobileOfficialAppsCorePhotoEditorStat$StickerData a(f5l0 f5l0Var) {
        MobileOfficialAppsCorePhotoEditorStat$StickerData.Type type;
        if (!(f5l0Var instanceof VkStickerMeta)) {
            return null;
        }
        VkStickerMeta vkStickerMeta = (VkStickerMeta) f5l0Var;
        switch (a.$EnumSwitchMapping$0[vkStickerMeta.a.ordinal()]) {
            case 1:
                type = MobileOfficialAppsCorePhotoEditorStat$StickerData.Type.INDIVIDUAL;
                break;
            case 2:
                type = MobileOfficialAppsCorePhotoEditorStat$StickerData.Type.FROM_PACK;
                break;
            case 3:
                type = MobileOfficialAppsCorePhotoEditorStat$StickerData.Type.ANIMATED;
                break;
            case 4:
                type = MobileOfficialAppsCorePhotoEditorStat$StickerData.Type.GIF;
                break;
            case 5:
                type = MobileOfficialAppsCorePhotoEditorStat$StickerData.Type.VMOJI;
                break;
            case 6:
                type = MobileOfficialAppsCorePhotoEditorStat$StickerData.Type.EMOJI;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new MobileOfficialAppsCorePhotoEditorStat$StickerData(type, vkStickerMeta.b, vkStickerMeta.c);
    }
}
