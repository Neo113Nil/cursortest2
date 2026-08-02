package xsna;

import com.vk.photo.editor.features.markup.draw.model.stat.DrawStatEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$GraffityData;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DrawStatExt.kt */
/* loaded from: classes15.dex */
public final class pio {

    /* compiled from: DrawStatExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DrawStatEvent.BrushType.values().length];
            try {
                iArr[DrawStatEvent.BrushType.Pen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DrawStatEvent.BrushType.Arrow.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DrawStatEvent.BrushType.Marker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DrawStatEvent.BrushType.Glow.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DrawStatEvent.BrushType.Eraser.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final MobileOfficialAppsCorePhotoEditorStat$GraffityData a(DrawStatEvent.b bVar) {
        MobileOfficialAppsCorePhotoEditorStat$GraffityData.Brush brush;
        Integer valueOf = Integer.valueOf(bVar.b);
        String V = blk.V(bVar.a.b);
        int i = a.$EnumSwitchMapping$0[bVar.c.ordinal()];
        if (i == 1) {
            brush = MobileOfficialAppsCorePhotoEditorStat$GraffityData.Brush.PEN;
        } else if (i == 2) {
            brush = MobileOfficialAppsCorePhotoEditorStat$GraffityData.Brush.ARROW;
        } else if (i == 3) {
            brush = MobileOfficialAppsCorePhotoEditorStat$GraffityData.Brush.MARKER;
        } else if (i == 4) {
            brush = MobileOfficialAppsCorePhotoEditorStat$GraffityData.Brush.GLOW;
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            brush = MobileOfficialAppsCorePhotoEditorStat$GraffityData.Brush.ERASER;
        }
        return new MobileOfficialAppsCorePhotoEditorStat$GraffityData(valueOf, V, brush);
    }
}
