package xsna;

import com.vk.attachpicker.stat.data.GraffityParamsEntity;
import com.vk.attachpicker.stat.data.PhotoParamsEntity;
import com.vk.attachpicker.stat.data.StickerParamsEntity;
import com.vk.attachpicker.stat.data.TextParamsEntity;
import com.vk.attachpicker.stat.models.VkStickerMeta;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.photo.editor.features.markup.text.model.stat.TextStatEvent;

/* compiled from: mappings.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class mn00 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;
    public static final /* synthetic */ int[] $EnumSwitchMapping$2;
    public static final /* synthetic */ int[] $EnumSwitchMapping$3;
    public static final /* synthetic */ int[] $EnumSwitchMapping$4;
    public static final /* synthetic */ int[] $EnumSwitchMapping$5;
    public static final /* synthetic */ int[] $EnumSwitchMapping$6;
    public static final /* synthetic */ int[] $EnumSwitchMapping$7;

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
        int[] iArr2 = new int[PhotoParamsEntity.Ratio.values().length];
        try {
            iArr2[PhotoParamsEntity.Ratio.CropOriginal.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PhotoParamsEntity.Ratio.CropFree.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PhotoParamsEntity.Ratio.CropSquare.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PhotoParamsEntity.Ratio.Crop3X4.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PhotoParamsEntity.Ratio.Crop4X3.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[PhotoParamsEntity.Ratio.Crop16X9.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[PhotoParamsEntity.Ratio.Crop9X16.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        $EnumSwitchMapping$1 = iArr2;
        int[] iArr3 = new int[VkStickerMeta.Type.values().length];
        try {
            iArr3[VkStickerMeta.Type.Individual.ordinal()] = 1;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr3[VkStickerMeta.Type.FromPack.ordinal()] = 2;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr3[VkStickerMeta.Type.Animated.ordinal()] = 3;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr3[VkStickerMeta.Type.GIF.ordinal()] = 4;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr3[VkStickerMeta.Type.Vmoji.ordinal()] = 5;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr3[VkStickerMeta.Type.Emoji.ordinal()] = 6;
        } catch (NoSuchFieldError unused20) {
        }
        $EnumSwitchMapping$2 = iArr3;
        int[] iArr4 = new int[StickerParamsEntity.Type.values().length];
        try {
            iArr4[StickerParamsEntity.Type.Individual.ordinal()] = 1;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr4[StickerParamsEntity.Type.FromPack.ordinal()] = 2;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr4[StickerParamsEntity.Type.Animated.ordinal()] = 3;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr4[StickerParamsEntity.Type.GIF.ordinal()] = 4;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr4[StickerParamsEntity.Type.Vimoji.ordinal()] = 5;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr4[StickerParamsEntity.Type.Emoji.ordinal()] = 6;
        } catch (NoSuchFieldError unused26) {
        }
        $EnumSwitchMapping$3 = iArr4;
        int[] iArr5 = new int[DrawStatEvent.BrushType.values().length];
        try {
            iArr5[DrawStatEvent.BrushType.Pen.ordinal()] = 1;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr5[DrawStatEvent.BrushType.Arrow.ordinal()] = 2;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr5[DrawStatEvent.BrushType.Marker.ordinal()] = 3;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr5[DrawStatEvent.BrushType.Glow.ordinal()] = 4;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr5[DrawStatEvent.BrushType.Eraser.ordinal()] = 5;
        } catch (NoSuchFieldError unused31) {
        }
        $EnumSwitchMapping$4 = iArr5;
        int[] iArr6 = new int[GraffityParamsEntity.BrushType.values().length];
        try {
            iArr6[GraffityParamsEntity.BrushType.Pen.ordinal()] = 1;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr6[GraffityParamsEntity.BrushType.Arrow.ordinal()] = 2;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr6[GraffityParamsEntity.BrushType.Marker.ordinal()] = 3;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr6[GraffityParamsEntity.BrushType.Glow.ordinal()] = 4;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr6[GraffityParamsEntity.BrushType.Eraser.ordinal()] = 5;
        } catch (NoSuchFieldError unused36) {
        }
        $EnumSwitchMapping$5 = iArr6;
        int[] iArr7 = new int[TextStatEvent.Align.values().length];
        try {
            iArr7[TextStatEvent.Align.Start.ordinal()] = 1;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr7[TextStatEvent.Align.Center.ordinal()] = 2;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr7[TextStatEvent.Align.End.ordinal()] = 3;
        } catch (NoSuchFieldError unused39) {
        }
        $EnumSwitchMapping$6 = iArr7;
        int[] iArr8 = new int[TextParamsEntity.Align.values().length];
        try {
            iArr8[TextParamsEntity.Align.Start.ordinal()] = 1;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr8[TextParamsEntity.Align.Center.ordinal()] = 2;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr8[TextParamsEntity.Align.End.ordinal()] = 3;
        } catch (NoSuchFieldError unused42) {
        }
        $EnumSwitchMapping$7 = iArr8;
    }
}
