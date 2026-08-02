package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Direction;

/* loaded from: classes5.dex */
public final class dgr0 extends g7h {
    public final Rect H;
    public final Rect I;

    public dgr0(Context context) {
        super(context);
        this.H = new Rect();
        this.I = new Rect();
    }

    @Override // defpackage.g7h
    public final void i(Canvas canvas, int i, int i2) {
        canvas.save();
        Rect rect = this.y;
        canvas.translate(rect.left, rect.top);
        Drawable drawable = this.F;
        Rect rect2 = this.H;
        drawable.setBounds(-rect2.left, -rect2.top, i + rect2.right, i2 + rect2.bottom);
        this.F.draw(canvas);
        canvas.restore();
    }

    @Override // defpackage.g7h
    public final void j(Canvas canvas, int i, int i2) {
        if (this.G == DefaultBubbleDecorator$Direction.UP) {
            canvas.translate(-this.w, 0.0f);
            canvas.translate(h(i), 0.0f);
            Rect rect = this.I;
            int i3 = -rect.top;
            int i4 = -rect.left;
            canvas.clipRect(i4, i3, this.E.getIntrinsicWidth() + i4, (this.E.getIntrinsicHeight() + i3) - rect.bottom);
            Drawable drawable = this.E;
            int i5 = rect.left;
            drawable.setBounds(-i5, -rect.top, drawable.getIntrinsicWidth() + (-i5), this.E.getIntrinsicHeight() + (-rect.top));
            this.E.draw(canvas);
        }
    }

    @Override // defpackage.g7h
    public final Drawable k() {
        return this.F;
    }

    @Override // defpackage.g7h
    public final Drawable l() {
        return this.E;
    }

    @Override // defpackage.g7h
    public final void n(Drawable drawable) {
        super.n(drawable);
        this.F.getPadding(this.H);
    }
}
