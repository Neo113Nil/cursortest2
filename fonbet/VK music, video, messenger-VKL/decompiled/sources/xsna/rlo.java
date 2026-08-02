package xsna;

import android.graphics.Matrix;
import com.vk.photo.editor.features.markup.draw.internal.mvi.model.BrushType;
import com.vk.photo.editor.markup.view.DrawingView;
import xsna.y8g;

/* compiled from: DrawingManager.kt */
/* loaded from: classes4.dex */
public final class rlo {
    public static final int d = alk.p(3);
    public static final int e = alk.p(50);
    public static final int f = alk.p(2);
    public static final int g = alk.p(10);
    public static final y8g.c h = new y8g.c(-1);
    public final DrawingView a;
    public final nv10 b;
    public final boolean c;

    /* compiled from: DrawingManager.kt */
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

    public rlo(DrawingView drawingView, nv10 nv10Var, boolean z) {
        this.a = drawingView;
        this.b = nv10Var;
        this.c = z;
    }

    public final float a() {
        mv10 provide = this.b.provide();
        Matrix matrix = provide.b;
        matrix.postConcat(provide.c);
        float a2 = nn10.a(matrix);
        double e2 = nn10.e(matrix);
        matrix.getValues(nn10.b());
        return Math.max(a2, (float) Math.hypot(e2, nn10.b()[1]));
    }

    public final float b(float f2) {
        int i = e;
        return ((f2 * (i - r1)) + d) / a();
    }
}
