package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import ru.yandex.taxi.design.bubble.decorator.DefaultBubbleDecorator$Position;

/* loaded from: classes5.dex */
public final class egr0 extends g7h {
    public final Rect H;

    public egr0(Context context) {
        super(context);
        this.H = new Rect();
    }

    @Override // defpackage.g7h
    public final void f(Integer num) {
        Drawable drawable = this.F;
        if (drawable instanceof LayerDrawable) {
            g7h.g(((LayerDrawable) drawable).getDrawable(1), num);
        } else {
            g7h.g(drawable, num);
        }
        g7h.g(this.E, num);
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0037, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        if (r3 != false) goto L16;
     */
    @Override // defpackage.g7h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Canvas canvas, int i, int i2) {
        canvas.translate(-this.w, -this.x);
        float f = this.w;
        float f2 = this.B;
        float f3 = f + f2;
        float f4 = i;
        float f5 = (f4 - f) - f2;
        int i3 = cgr0.a[this.C.ordinal()];
        if (i3 != 1) {
            boolean z = this.A;
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        w511.b();
                        return;
                    }
                    f3 = 0.0f;
                }
            }
        } else {
            f3 = (f4 / 2.0f) + this.B;
        }
        canvas.translate(f3, i2);
        if (this.C == DefaultBubbleDecorator$Position.CENTER) {
            canvas.translate(0.0f, this.x);
        }
        canvas.rotate(180.0f, this.w, this.x);
        this.E.setBounds(0, 0, this.c, this.b);
        this.E.draw(canvas);
    }

    @Override // defpackage.g7h
    public final Drawable k() {
        return this.F;
    }

    @Override // defpackage.g7h
    public final void n(Drawable drawable) {
        super.n(drawable);
        this.F.getPadding(this.H);
    }
}
