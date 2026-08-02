package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.unity3d.services.UnityAdsConstants;
import xsna.cut0;

/* compiled from: ClipsCommentTooltipDrawable.kt */
/* loaded from: classes16.dex */
public final class pnd extends Drawable {
    public final float a;
    public final Paint b;
    public final Path c;
    public final Path d;
    public final Path e;

    public pnd(Context context, float f, x7g x7gVar) {
        this.a = f;
        Paint paint = new Paint(1);
        paint.setColor(cut0.a.a(x7gVar, context));
        paint.setStyle(Paint.Style.FILL);
        this.b = paint;
        Path path = new Path();
        this.c = path;
        this.d = new Path();
        this.e = new Path();
        path.reset();
        path.moveTo(iah0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), iah0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        path.cubicTo(iah0.b(3.1915f), iah0.b(4.78153f), iah0.b(7.64861f), iah0.b(8.32031f), iah0.b(13.6326f), iah0.b(8.32031f));
        path.cubicTo(iah0.b(13.3452f), iah0.b(8.32031f), iah0.b(13.258f), iah0.b(8.31902f), iah0.b(13.1709f), iah0.b(8.31738f));
        path.cubicTo(iah0.b(12.6914f), iah0.b(8.30833f), iah0.b(12.2106f), iah0.b(8.32708f), iah0.b(11.7402f), iah0.b(8.4209f));
        path.cubicTo(iah0.b(7.77928f), iah0.b(9.2111f), iah0.b(3.18415f), iah0.b(10.7751f), iah0.b(1.58105f), iah0.b(9.63574f));
        path.cubicTo(iah0.b(0.304753f), iah0.b(8.72808f), iah0.b(0.662302f), iah0.b(6.04312f), iah0.b(0.833008f), iah0.b(3.35449f));
        path.cubicTo(iah0.b(0.907116f), iah0.b(2.18717f), iah0.b(0.527423f), iah0.b(1.05721f), iah0.b(0.00488281f), iah0.b(0.0107422f));
        path.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().isEmpty()) {
            return;
        }
        canvas.drawPath(this.e, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    @ozl
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f = 8;
        rect.set(iah0.a(f), iah0.a(f), iah0.a(f), iah0.a(10));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (rect.isEmpty()) {
            return;
        }
        float f = rect.left;
        float f2 = rect.top;
        float f3 = rect.right;
        float f4 = rect.bottom;
        Path path = this.d;
        path.reset();
        float b = f4 - iah0.b(2.0f);
        float f5 = this.a;
        path.addRoundRect(f, f2, f3, b, f5, f5, Path.Direction.CW);
        Path path2 = new Path(this.c);
        path2.offset(iah0.b(1.55f) + f, f4 - iah0.b(10.55f));
        Path path3 = this.e;
        path3.reset();
        path3.op(path, path2, Path.Op.UNION);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
