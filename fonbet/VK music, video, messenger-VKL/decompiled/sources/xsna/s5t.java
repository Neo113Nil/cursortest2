package xsna;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.vkontakte.android.R;
import xsna.qor;

/* compiled from: GalvitaFlexDecoration.kt */
/* loaded from: classes18.dex */
public final class s5t implements qor.b {
    public final xso0 a;
    public final RectF b = new RectF();
    public final Path c = new Path();
    public final float[] d;

    public s5t(float f) {
        this.a = new xso0(f, f, cn70.a() * 0.5f, krv0.l(R.attr.vk_ui_background_content), krv0.l(R.attr.vk_ui_image_border_alpha));
        this.d = new float[]{f, f, f, f, f, f, f, f};
    }

    @Override // xsna.qor.b
    public final boolean a(Canvas canvas, View view, por porVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        qor.c cVar = layoutParams instanceof qor.c ? (qor.c) layoutParams : null;
        if (cVar == null) {
            return false;
        }
        int save = canvas.save();
        Path path = this.c;
        path.reset();
        float left = view.getLeft();
        float top = view.getTop();
        float right = view.getRight();
        float bottom = view.getBottom();
        RectF rectF = this.b;
        rectF.set(left, top, right, bottom);
        rectF.offset(view.getTranslationX(), view.getTranslationY());
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        float f = rectF.right;
        float f2 = rectF.left;
        float f3 = rectF.bottom;
        float f4 = rectF.top;
        float f5 = (int) (((scaleY - 1.0f) * (f3 - f4)) / 2.0f);
        rectF.top = f4 - f5;
        rectF.bottom = f3 + f5;
        float f6 = (int) (((scaleX - 1.0f) * (f - f2)) / 2.0f);
        rectF.left = f2 - f6;
        rectF.right = f + f6;
        path.addRoundRect(rectF, this.d, Path.Direction.CW);
        path.close();
        canvas.clipPath(path);
        boolean booleanValue = ((Boolean) porVar.invoke()).booleanValue();
        this.a.b(canvas, rectF, cVar.a);
        canvas.restoreToCount(save);
        return booleanValue;
    }
}
