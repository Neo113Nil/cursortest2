package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.vk.regionsdrawer.drawer.DrawMode;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RegionsDrawer.kt */
/* loaded from: classes5.dex */
public final class vpf0 {
    public final ac7 a;
    public final jge0 b;
    public final Rect c;
    public final Matrix d;
    public final Path e;
    public final Paint f;

    /* compiled from: RegionsDrawer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DrawMode.values().length];
            try {
                iArr[DrawMode.OFFSCREEN_BITMAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DrawMode.OFFSCREEN_LAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public vpf0(ac7 ac7Var) {
        this.a = ac7Var;
        jge0 jge0Var = new jge0();
        jge0Var.b = new ArrayList();
        jge0Var.c = new dge(new om60(8));
        this.b = jge0Var;
        this.c = new Rect();
        this.d = new Matrix();
        this.e = new Path();
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        paint.setAntiAlias(true);
        this.f = paint;
    }

    public final void a(Canvas canvas, Rect rect, ArrayList arrayList) {
        zpf0 zpf0Var;
        Rect rect2 = this.c;
        boolean f = epx.f(rect2, rect);
        ac7 ac7Var = this.a;
        if (!f) {
            rect2.set(rect);
            g5g.D(ac7Var.a, true, new com.vk.im.ui.fragments.b(rect, 9));
        }
        jge0 jge0Var = this.b;
        dge dgeVar = (dge) jge0Var.c;
        ArrayList arrayList2 = (ArrayList) jge0Var.b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            zpf0 zpf0Var2 = (zpf0) arrayList2.get(i);
            zpf0Var2.getClass();
            zpf0Var2.a = trm0.a;
            zpf0Var2.b = DrawMode.OFFSCREEN_LAYER;
            zpf0Var2.c.clear();
            ((ArrayList) dgeVar.c).add(zpf0Var2);
        }
        arrayList2.clear();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            spf0 spf0Var = (spf0) arrayList.get(i2);
            Drawable drawable = spf0Var.c;
            DrawMode drawMode = spf0Var.e;
            int size3 = arrayList2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size3) {
                    zpf0Var = null;
                    break;
                }
                zpf0Var = (zpf0) arrayList2.get(i3);
                if (epx.f(zpf0Var.a, drawable) && zpf0Var.b == drawMode) {
                    break;
                } else {
                    i3++;
                }
            }
            if (zpf0Var == null) {
                Object J = g5g.J((ArrayList) dgeVar.c);
                Object obj = J;
                if (J == null) {
                    obj = ((gzs) dgeVar.b).invoke();
                }
                zpf0Var = (zpf0) obj;
                zpf0Var.a = drawable;
                zpf0Var.b = drawMode;
                arrayList2.add(zpf0Var);
            }
            zpf0Var.c.add(spf0Var);
        }
        int size4 = arrayList2.size();
        for (int i4 = 0; i4 < size4; i4++) {
            zpf0 zpf0Var3 = (zpf0) arrayList2.get(i4);
            ArrayList arrayList3 = zpf0Var3.c;
            if (!arrayList3.isEmpty()) {
                Drawable drawable2 = zpf0Var3.a;
                DrawMode drawMode2 = zpf0Var3.b;
                Path path = this.e;
                path.reset();
                int size5 = arrayList3.size();
                int i5 = 0;
                while (i5 < size5) {
                    spf0 spf0Var2 = (spf0) arrayList3.get(i5);
                    spf0Var2.d.setBounds(spf0Var2.a);
                    spf0Var2.d.setAlpha(spf0Var2.b);
                    spf0Var2.d.draw(canvas);
                    Rect rect3 = spf0Var2.a;
                    Path path2 = path;
                    path2.addRect(rect3.left, rect3.top, rect3.right, rect3.bottom, Path.Direction.CW);
                    i5++;
                    path = path2;
                    drawMode2 = drawMode2;
                }
                DrawMode drawMode3 = drawMode2;
                Path path3 = path;
                int save = canvas.save();
                try {
                    canvas.clipPath(path3);
                    int i6 = a.$EnumSwitchMapping$0[drawMode3.ordinal()];
                    Paint paint = this.f;
                    if (i6 == 1) {
                        canvas.drawBitmap(ac7Var.a(drawable2, rect), this.d, paint);
                    } else {
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int saveLayer = canvas.saveLayer(rect.left, rect.top, rect.right, rect.bottom, paint);
                        drawable2.setBounds(rect);
                        drawable2.draw(canvas);
                        canvas.restoreToCount(saveLayer);
                    }
                    canvas.restoreToCount(save);
                } catch (Throwable th) {
                    canvas.restoreToCount(save);
                    throw th;
                }
            }
        }
    }
}
