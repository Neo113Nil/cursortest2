package xsna;

import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CropFormatConverter.kt */
/* loaded from: classes4.dex */
public final class fhk {

    /* compiled from: CropFormatConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CropAspectRatioFormat.values().length];
            try {
                iArr[CropAspectRatioFormat.CropOriginal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CropAspectRatioFormat.CropFree.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CropAspectRatioFormat.CropSquare.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CropAspectRatioFormat.Crop3X4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CropAspectRatioFormat.Crop4X3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CropAspectRatioFormat.Crop16X9.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CropAspectRatioFormat.Crop9X16.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CropStatEvent.Format a(CropAspectRatioFormat cropAspectRatioFormat) {
        switch (a.$EnumSwitchMapping$0[cropAspectRatioFormat.ordinal()]) {
            case 1:
                return CropStatEvent.Format.CropOriginal;
            case 2:
                return CropStatEvent.Format.CropFree;
            case 3:
                return CropStatEvent.Format.CropSquare;
            case 4:
                return CropStatEvent.Format.Crop3X4;
            case 5:
                return CropStatEvent.Format.Crop4X3;
            case 6:
                return CropStatEvent.Format.Crop16X9;
            case 7:
                return CropStatEvent.Format.Crop9X16;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
