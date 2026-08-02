package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import com.vkontakte.android.R;

/* compiled from: GalvitaFrameDecoration.kt */
/* loaded from: classes4.dex */
public final class w5t extends GalvitaLayout.a {
    public final RectF a = new RectF();
    public final Rect b = new Rect();
    public final Paint c;
    public final float d;

    public w5t(Context context) {
        Paint paint = new Paint();
        paint.setColor(dhr0.Y(R.attr.vk_ui_image_border_alpha, context));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(cn70.a() * 0.5f);
        paint.setAntiAlias(false);
        this.c = paint;
        this.d = paint.getStrokeWidth() / 2.0f;
    }

    @Override // com.vk.core.tool.view.galvitalayout.GalvitaLayout.a
    public final void a(Canvas canvas, GalvitaLayout galvitaLayout) {
        int childCount = galvitaLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = galvitaLayout.getChildAt(i);
            if (childAt != null) {
                int left = childAt.getLeft();
                int top = childAt.getTop();
                int right = childAt.getRight();
                int bottom = childAt.getBottom();
                Rect rect = this.b;
                rect.set(left, top, right, bottom);
                RectF rectF = this.a;
                rectF.set(rect);
                rect.setEmpty();
                float f = rectF.left;
                float f2 = this.d;
                rectF.left = f + f2;
                rectF.top += f2;
                rectF.right -= f2;
                rectF.bottom -= f2;
                canvas.drawRect(rectF, this.c);
            }
        }
    }
}
