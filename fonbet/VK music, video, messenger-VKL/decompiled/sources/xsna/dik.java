package xsna;

import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$PhotoParams;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CropStatEventExt.kt */
/* loaded from: classes15.dex */
public final class dik {

    /* compiled from: CropStatEventExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropStatEvent.Format.values().length];
            try {
                iArr[CropStatEvent.Format.CropOriginal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropStatEvent.Format.CropFree.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropStatEvent.Format.CropSquare.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropStatEvent.Format.Crop3X4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CropStatEvent.Format.Crop4X3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CropStatEvent.Format.Crop16X9.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CropStatEvent.Format.Crop9X16.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio a(CropStatEvent.Format format) {
        switch (a.$EnumSwitchMapping$0[format.ordinal()]) {
            case 1:
                return MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.ORIGINAL;
            case 2:
                return MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.FREE;
            case 3:
                return MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.ONE_TO_ONE;
            case 4:
                return MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.THREE_TO_FOUR;
            case 5:
                return MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.FOUR_TO_THREE;
            case 6:
                return MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.SIXTEEN_TO_NINE;
            case 7:
                return MobileOfficialAppsCorePhotoEditorStat$PhotoParams.Ratio.NINE_TO_SIXTEEN;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
