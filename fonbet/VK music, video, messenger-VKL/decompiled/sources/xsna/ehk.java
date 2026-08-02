package xsna;

import com.vk.photo.editor.features.collage.model.CollageAspectRatioFormat;
import com.vk.photo.editor.features.collage.model.stat.CollageStatEvent;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CropFormatConverter.kt */
/* loaded from: classes4.dex */
public final class ehk {

    /* compiled from: CropFormatConverter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CollageAspectRatioFormat.values().length];
            try {
                iArr[CollageAspectRatioFormat.CollageOriginal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CollageAspectRatioFormat.CollageFree.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CollageAspectRatioFormat.CollageSquare.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CollageAspectRatioFormat.Collage3X4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CollageAspectRatioFormat.Collage4X3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CollageAspectRatioFormat.Collage16X9.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CollageAspectRatioFormat.Collage9X16.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final CollageStatEvent.Format a(CollageAspectRatioFormat collageAspectRatioFormat) {
        switch (a.$EnumSwitchMapping$0[collageAspectRatioFormat.ordinal()]) {
            case 1:
                return CollageStatEvent.Format.CollageOriginal;
            case 2:
                return CollageStatEvent.Format.CollageFree;
            case 3:
                return CollageStatEvent.Format.CollageSquare;
            case 4:
                return CollageStatEvent.Format.Collage3X4;
            case 5:
                return CollageStatEvent.Format.Collage4X3;
            case 6:
                return CollageStatEvent.Format.Collage16X9;
            case 7:
                return CollageStatEvent.Format.Collage9X16;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
