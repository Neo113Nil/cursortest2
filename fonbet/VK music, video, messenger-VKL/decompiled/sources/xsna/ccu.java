package xsna;

import com.vk.attachpicker.impl.graffiti.domain.model.BrushType;
import com.vk.photo.editor.markup.view.DrawingView;
import xsna.y8g;

/* compiled from: GraffitiDrawingManager.kt */
/* loaded from: classes15.dex */
public final class ccu {
    public static final int b = alk.p(3);
    public static final int c = alk.p(50);
    public static final int d = alk.p(2);
    public static final int e = alk.p(10);
    public static final y8g.c f = new y8g.c(-1);
    public final DrawingView a;

    /* compiled from: GraffitiDrawingManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrushType.values().length];
            try {
                iArr[BrushType.Pen.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrushType.Arrow.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrushType.Marker.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrushType.Glow.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrushType.Eraser.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ccu(DrawingView drawingView) {
        this.a = drawingView;
    }

    public static float a(float f2) {
        int i = c;
        return (f2 * (i - r1)) + b;
    }
}
