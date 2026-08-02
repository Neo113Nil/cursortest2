package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.typography.FontFamily;
import java.util.WeakHashMap;

/* compiled from: GridAlbumViewGroup.kt */
/* loaded from: classes4.dex */
public final class afu extends FrameLayout {
    public Drawable b;
    public CharSequence c;
    public int d;
    public int e;
    public float f;
    public final SparseArray<Drawable> g;
    public Drawable h;
    public final Rect i;
    public final Rect j;
    public final Rect k;
    public final Rect l;
    public final RectF m;
    public final Paint n;
    public final TextPaint o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public afu(Context context) {
        super(context, null, 0);
        this.g = new SparseArray<>();
        this.i = new Rect();
        this.j = new Rect();
        this.k = new Rect();
        this.l = new Rect();
        this.m = new RectF();
        Paint paint = new Paint(1);
        this.n = paint;
        TextPaint textPaint = new TextPaint(1);
        this.o = textPaint;
        paint.setColor(n8g.l(-16777216, 89));
        textPaint.setColor(-1);
    }

    public final void a(Drawable drawable, int i) {
        boolean z;
        boolean z2 = true;
        if (this.b != drawable) {
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.b = mutate;
            if (mutate != null) {
                mutate.setTint(-1);
            }
            z = true;
        } else {
            z = false;
        }
        if (this.e != i) {
            this.e = i;
        } else {
            z2 = z;
        }
        if (z2) {
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable drawable;
        super.dispatchDraw(canvas);
        if (this.w > 0 && (drawable = this.h) != null) {
            drawable.draw(canvas);
        }
        Rect rect = this.l;
        RectF rectF = this.m;
        rectF.set(rect);
        float f = this.f;
        canvas.drawRoundRect(rectF, f, f, this.n);
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        CharSequence charSequence = this.c;
        if (this.t <= 0 || charSequence == null || charSequence.length() == 0) {
            return;
        }
        rectF.set(this.k);
        canvas.drawText(charSequence, 0, charSequence.length(), rectF.left, rectF.top, this.o);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int layoutDirection = getLayoutDirection();
        boolean z2 = layoutDirection == 1;
        int i5 = this.p;
        int i6 = this.q;
        int width = getWidth() - this.p;
        int height = getHeight() - this.q;
        Rect rect = this.i;
        rect.set(i5, i6, width, height);
        Gravity.apply(8388693, this.u, this.v, this.i, this.l, layoutDirection);
        rect.set(this.l);
        rect.inset(this.r, this.s);
        int i7 = this.t;
        if (i7 > 0) {
            TextPaint textPaint = this.o;
            Gravity.apply(8388629, i7, (int) (textPaint.ascent() + textPaint.descent() + 0.5f), this.i, this.k, layoutDirection);
            int width2 = this.k.width() + this.d;
            if (z2) {
                rect.left += width2;
            } else {
                rect.right -= width2;
            }
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            int i8 = this.e;
            Gravity.apply(8388629, i8, i8, this.i, this.j, layoutDirection);
            drawable.setBounds(this.j);
        }
        Drawable drawable2 = this.h;
        if (drawable2 == null || this.w <= 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int paddingTop = getPaddingTop() + (((getMeasuredHeight() - (getPaddingBottom() + getPaddingTop())) - this.w) / 2);
        int i9 = this.w;
        int b = x9.b(measuredWidth - paddingLeft, i9, 2, paddingLeft);
        drawable2.setBounds(b, paddingTop, b + i9, i9 + paddingTop);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.h = null;
        SparseArray<Drawable> sparseArray = this.g;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (-1 >= size) {
                i3 = 0;
                break;
            }
            i3 = sparseArray.keyAt(size);
            if (measuredHeight >= i3) {
                this.h = sparseArray.valueAt(size);
                break;
            }
        }
        this.w = i3;
        int b = cn70.b(70);
        int b2 = cn70.b(8);
        int b3 = cn70.b(8);
        CharSequence charSequence = this.c;
        TextPaint textPaint = this.o;
        int measureText = (b > measuredWidth || charSequence == null || charSequence.length() == 0) ? 0 : (int) (textPaint.measureText(charSequence, 0, charSequence.length()) + 0.5f);
        this.t = measureText;
        int i4 = this.b != null ? this.e : 0;
        if (rqi.a(b3, 2, b2 * 2, i4) + this.d + measureText > measuredWidth) {
            this.t = 0;
        }
        if (this.t == 0) {
            int b4 = cn70.b(2);
            this.p = b4;
            this.q = b4;
            int b5 = cn70.b(3);
            this.r = b5;
            this.s = b5;
        } else {
            this.p = b2;
            this.q = b2;
            this.r = b3;
            this.s = cn70.b(4);
        }
        int i5 = (this.r * 2) + i4;
        this.u = i5;
        int i6 = this.t;
        if (i6 > 0) {
            this.u = this.d + i6 + i5;
        }
        this.v = Math.max(i4, (int) ((textPaint.descent() - textPaint.ascent()) + 0.5f)) + (this.s * 2);
    }

    public final void setLabelCornerRadius(float f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        invalidate();
    }

    public final void setLabelGap(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
            invalidate();
        }
    }

    public final void setLabelText(CharSequence charSequence) {
        if (TextUtils.equals(this.c, charSequence)) {
            return;
        }
        this.c = charSequence;
        requestLayout();
        invalidate();
    }

    public final void setLabelTextSize(float f) {
        com.vk.typography.b.j(this.o, getContext(), FontFamily.MEDIUM, Float.valueOf(f), 8);
        invalidate();
    }

    public final void setOverlayIcon(SparseArray<Drawable> sparseArray) {
        SparseArray<Drawable> sparseArray2 = this.g;
        sparseArray2.clear();
        this.h = null;
        if (sparseArray != null) {
            xx1.B(sparseArray2, sparseArray);
        }
        requestLayout();
        invalidate();
    }
}
