package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.vkontakte.android.R;

/* compiled from: SectionBackground.kt */
/* loaded from: classes17.dex */
public final class q1i0 extends Drawable {
    public final Drawable[] a;
    public final Drawable[] b;
    public int c;
    public int d;
    public final Rect e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public int k;

    public q1i0(Context context, int i, int i2) {
        Drawable mutate = m33.a(R.drawable.vk_bg_tip_tail_left, context).mutate();
        Drawable mutate2 = m33.a(i, context).mutate();
        Drawable mutate3 = m33.a(i2, context).mutate();
        Drawable mutate4 = m33.a(R.drawable.vk_bg_tip_tail_right, context).mutate();
        this.e = new Rect();
        this.k = 80;
        this.a = new Drawable[]{mutate, mutate3, mutate4};
        this.b = new Drawable[]{mutate, mutate2, mutate3, mutate4};
    }

    @SuppressLint({"RtlHardcoded"})
    public final boolean a() {
        int i = this.k;
        return i == 3 || i == 5;
    }

    @SuppressLint({"RtlHardcoded"})
    public final void b(int i) {
        if (i == this.k) {
            return;
        }
        this.k = i;
        Drawable[] drawableArr = this.b;
        Drawable[] drawableArr2 = this.a;
        if (i == 3) {
            drawableArr2[0] = drawableArr[5];
            drawableArr2[1] = drawableArr[4];
            drawableArr2[2] = drawableArr[6];
        } else if (i == 5) {
            drawableArr2[0] = drawableArr[5];
            drawableArr2[1] = drawableArr[7];
            drawableArr2[2] = drawableArr[6];
        } else if (i == 48) {
            drawableArr2[0] = drawableArr[0];
            drawableArr2[1] = drawableArr[1];
            drawableArr2[2] = drawableArr[3];
        } else if (i == 80) {
            drawableArr2[0] = drawableArr[0];
            drawableArr2[1] = drawableArr[2];
            drawableArr2[2] = drawableArr[3];
        }
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    public final void c(int i) {
        if (this.c == i) {
            return;
        }
        this.c = i;
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (this.f == i && this.g == i2 && this.h == i3 && this.i == i4) {
            return;
        }
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        onBoundsChange(getBounds());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        for (Drawable drawable : this.a) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable;
        boolean a = a();
        Drawable[] drawableArr = this.a;
        if (a) {
            int i = 0;
            for (Drawable drawable2 : drawableArr) {
                i += drawable2.getIntrinsicHeight();
            }
            return i;
        }
        if (drawableArr.length == 0) {
            drawable = null;
        } else {
            drawable = drawableArr[0];
            int i2 = 1;
            int length = drawableArr.length - 1;
            if (length != 0) {
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (1 <= length) {
                    while (true) {
                        Drawable drawable3 = drawableArr[i2];
                        int intrinsicHeight2 = drawable3.getIntrinsicHeight();
                        if (intrinsicHeight < intrinsicHeight2) {
                            drawable = drawable3;
                            intrinsicHeight = intrinsicHeight2;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable;
        boolean a = a();
        Drawable[] drawableArr = this.a;
        if (!a) {
            int i = 0;
            for (Drawable drawable2 : drawableArr) {
                i += drawable2.getIntrinsicWidth();
            }
            return i;
        }
        if (drawableArr.length == 0) {
            drawable = null;
        } else {
            drawable = drawableArr[0];
            int i2 = 1;
            int length = drawableArr.length - 1;
            if (length != 0) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (1 <= length) {
                    while (true) {
                        Drawable drawable3 = drawableArr[i2];
                        int intrinsicWidth2 = drawable3.getIntrinsicWidth();
                        if (intrinsicWidth < intrinsicWidth2) {
                            drawable = drawable3;
                            intrinsicWidth = intrinsicWidth2;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        Drawable drawable;
        boolean a = a();
        Drawable[] drawableArr = this.a;
        if (a) {
            int i = 0;
            for (Drawable drawable2 : drawableArr) {
                i += drawable2.getMinimumHeight();
            }
            return (i - this.g) - this.i;
        }
        if (drawableArr.length == 0) {
            drawable = null;
        } else {
            drawable = drawableArr[0];
            int i2 = 1;
            int length = drawableArr.length - 1;
            if (length != 0) {
                int minimumHeight = drawable.getMinimumHeight();
                if (1 <= length) {
                    while (true) {
                        Drawable drawable3 = drawableArr[i2];
                        int minimumHeight2 = drawable3.getMinimumHeight();
                        if (minimumHeight < minimumHeight2) {
                            drawable = drawable3;
                            minimumHeight = minimumHeight2;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return drawable.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        Drawable drawable;
        boolean a = a();
        Drawable[] drawableArr = this.a;
        if (!a) {
            int i = 0;
            for (Drawable drawable2 : drawableArr) {
                i += drawable2.getMinimumWidth();
            }
            return i;
        }
        if (drawableArr.length == 0) {
            drawable = null;
        } else {
            drawable = drawableArr[0];
            int i2 = 1;
            int length = drawableArr.length - 1;
            if (length != 0) {
                int minimumWidth = drawable.getMinimumWidth();
                if (1 <= length) {
                    while (true) {
                        Drawable drawable3 = drawableArr[i2];
                        int minimumWidth2 = drawable3.getMinimumWidth();
                        if (minimumWidth < minimumWidth2) {
                            drawable = drawable3;
                            minimumWidth = minimumWidth2;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
        }
        return (drawable.getMinimumWidth() - this.f) - this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return ((Drawable) rl3.L(this.a)).getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (!this.j) {
            return false;
        }
        int a = iah0.a(12);
        int i = a >> 1;
        boolean a2 = a();
        Rect rect2 = this.e;
        Drawable[] drawableArr = this.a;
        if (a2) {
            drawableArr[1].getPadding(rect);
            rect.left += i;
            rect.right += i;
            drawableArr[0].getPadding(rect2);
            rect.top = rect2.top + i;
            drawableArr[2].getPadding(rect2);
            rect.bottom = rect2.bottom + a;
            return true;
        }
        drawableArr[1].getPadding(rect);
        rect.top += i;
        rect.bottom += i;
        drawableArr[0].getPadding(rect2);
        rect.left = rect2.left + a;
        drawableArr[2].getPadding(rect2);
        rect.right = rect2.right + i;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        rect.left -= this.f;
        rect.right += this.h;
        rect.top -= this.g;
        rect.bottom += this.i;
        boolean a = a();
        Drawable[] drawableArr = this.a;
        if (!a) {
            int minimumWidth = drawableArr[1].getMinimumWidth();
            int width = (rect.width() - minimumWidth) / 2;
            int i = rect.left;
            int minimumWidth2 = rect.right - drawableArr[1].getMinimumWidth();
            if (minimumWidth2 < i) {
                minimumWidth2 = i;
            }
            Drawable drawable = drawableArr[0];
            int i2 = rect.left;
            drawable.setBounds(i2, rect.top, swe0.g(this.c + i2 + width, i, minimumWidth2), rect.bottom);
            drawableArr[1].setBounds(drawableArr[0].getBounds().right, rect.top, drawableArr[0].getBounds().right + minimumWidth, rect.bottom);
            drawableArr[2].setBounds(drawableArr[1].getBounds().right, rect.top, rect.right, rect.bottom);
            return;
        }
        int minimumHeight = drawableArr[1].getMinimumHeight();
        int height = (rect.height() - minimumHeight) / 2;
        int i3 = rect.top;
        drawableArr[0].setBounds(rect.left, i3, rect.right, x9.b(this.g, this.i, 2, this.d + i3 + height));
        int i4 = drawableArr[0].getBounds().bottom;
        drawableArr[1].setBounds(rect.left, i4, rect.right, minimumHeight + i4);
        drawableArr[2].setBounds(rect.left, drawableArr[1].getBounds().bottom, rect.right, rect.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        for (Drawable drawable : this.b) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Drawable drawable : this.b) {
            drawable.setColorFilter(colorFilter);
        }
    }

    public q1i0(Context context, int i, int i2, int i3) {
        Drawable mutate = m33.a(R.drawable.vk_bg_tip_tail_left, context).mutate();
        Drawable mutate2 = m33.a(i, context).mutate();
        Drawable mutate3 = m33.a(i2, context).mutate();
        Drawable mutate4 = m33.a(i3, context).mutate();
        Drawable mutate5 = m33.a(R.drawable.vk_bg_tip_tail_left_center, context).mutate();
        Drawable mutate6 = m33.a(R.drawable.vk_bg_tip_no_tail_top, context).mutate();
        Drawable mutate7 = m33.a(R.drawable.vk_bg_tip_no_tail_bottom, context).mutate();
        Drawable mutate8 = m33.a(R.drawable.vk_bg_tip_tail_right_center, context).mutate();
        this.e = new Rect();
        this.k = 80;
        this.a = new Drawable[]{mutate, mutate3, mutate4};
        this.b = new Drawable[]{mutate, mutate2, mutate3, mutate4, mutate5, mutate6, mutate7, mutate8};
    }
}
