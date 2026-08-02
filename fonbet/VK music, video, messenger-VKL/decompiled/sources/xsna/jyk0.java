package xsna;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.market.ui.R$styleable;

/* compiled from: StaticRatingView.kt */
@ozl
/* loaded from: classes18.dex */
public class jyk0 extends View implements too0 {
    public a b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final Drawable l;
    public final Drawable m;
    public final ClipDrawable n;
    public final ClipDrawable o;
    public final int p;
    public final int q;

    /* compiled from: StaticRatingView.kt */
    public interface a {
        int a(jyk0 jyk0Var);
    }

    public jyk0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void b(Canvas canvas, Drawable drawable, int i, int i2) {
        drawable.setLevel(i2);
        drawable.setBounds(i, 0, drawable.getIntrinsicWidth() + i, drawable.getIntrinsicHeight());
        drawable.draw(canvas);
    }

    @Override // xsna.too0
    public final void Ng() {
        a();
    }

    public final void a() {
        int i = this.c;
        this.c = i;
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        ClipDrawable clipDrawable = this.n;
        if (clipDrawable != null) {
            clipDrawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
        int i2 = this.d;
        this.d = i2;
        Drawable drawable2 = this.m;
        if (drawable2 != null) {
            drawable2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        ClipDrawable clipDrawable2 = this.o;
        if (clipDrawable2 != null) {
            clipDrawable2.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void c(Canvas canvas, Drawable drawable, k9x k9xVar) {
        int i = k9xVar.b;
        int i2 = k9xVar.c;
        if (i > i2) {
            return;
        }
        while (true) {
            b(canvas, drawable, (i - 1) * (drawable.getIntrinsicWidth() + this.i), 10000);
            if (i == i2) {
                return;
            } else {
                i++;
            }
        }
    }

    public final int getBoundsHeight() {
        return this.e;
    }

    public final int getBoundsWidth() {
        return this.f;
    }

    public final int getInnerPadding() {
        return this.j;
    }

    public final float getRating() {
        return this.g;
    }

    public final int getRatingCount() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        int i3 = this.h;
        int i4 = 10000 / i3;
        int g = swe0.g(this.k / i4, 0, i3);
        boolean z = this.k % i4 > 0;
        if (z) {
            g++;
            i = g;
        } else {
            i = g + 1;
        }
        Drawable drawable = this.l;
        if (drawable != null && (i2 = g + 1) <= this.h) {
            c(canvas, drawable, new k9x(i2, this.h, 1));
        }
        if (z) {
            ClipDrawable clipDrawable = this.n;
            int intrinsicWidth = clipDrawable != null ? clipDrawable.getIntrinsicWidth() : 0;
            int g2 = swe0.g(((this.k % i4) * 10000) / i4, 0, 10000);
            int i5 = (g - 1) * (intrinsicWidth + this.i);
            ClipDrawable clipDrawable2 = this.n;
            if (clipDrawable2 != null) {
                b(canvas, clipDrawable2, i5, 10000 - g2);
            }
            ClipDrawable clipDrawable3 = this.o;
            if (clipDrawable3 != null) {
                b(canvas, clipDrawable3, i5, g2);
            }
        }
        Drawable drawable2 = this.m;
        if (drawable2 == null || i < 1) {
            return;
        }
        c(canvas, drawable2, swe0.q(1, i));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.f, this.e);
    }

    public final void setBoundsHeight(int i) {
        this.e = i;
    }

    public final void setBoundsWidth(int i) {
        this.f = i;
    }

    public final void setInnerPadding(int i) {
        this.j = i;
    }

    public final void setLevelPaintingProvider(a aVar) {
        this.b = aVar;
        this.k = aVar != null ? aVar.a(this) : 0;
        invalidate();
    }

    public final void setPaddingBetween(int i) {
        if (this.i != i) {
            this.i = i;
            int i2 = this.h;
            this.f = ir.b(i2, 1, i, this.p * i2);
            d();
        }
    }

    public final void setRating(float f) {
        this.g = f;
    }

    public final void setRatingCount(int i) {
        this.h = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jyk0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Object obj;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        if (obtainStyledAttributes.hasValue(2)) {
            this.c = obtainStyledAttributes.getColor(2, 0);
        }
        if (obtainStyledAttributes.hasValue(3)) {
            this.d = obtainStyledAttributes.getColor(3, 0);
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.i = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        }
        this.g = obtainStyledAttributes.getFloat(6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.h = obtainStyledAttributes.getInt(7, 5);
        this.j = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        Drawable drawable4 = obtainStyledAttributes.getDrawable(0);
        this.l = drawable4 != null ? drawable4.mutate() : null;
        Drawable drawable5 = obtainStyledAttributes.getDrawable(4);
        if (drawable5 == null || (drawable = drawable5.mutate()) == null) {
            Drawable drawable6 = this.l;
            if (drawable6 != null) {
                Drawable.ConstantState constantState = drawable6.getConstantState();
                Drawable newDrawable = constantState != null ? constantState.newDrawable() : null;
                if (newDrawable != null) {
                    drawable = newDrawable.mutate();
                }
            }
            drawable = null;
        }
        this.m = drawable;
        Drawable drawable7 = this.l;
        if (drawable7 != null) {
            Drawable.ConstantState constantState2 = drawable7.getConstantState();
            Drawable newDrawable2 = constantState2 != null ? constantState2.newDrawable() : null;
            if (newDrawable2 != null) {
                drawable2 = new ClipDrawable(newDrawable2, 8388613, 1).mutate();
                this.n = !(drawable2 instanceof ClipDrawable) ? (ClipDrawable) drawable2 : null;
                drawable3 = this.m;
                if (drawable3 != null) {
                    Drawable.ConstantState constantState3 = drawable3.getConstantState();
                    Drawable newDrawable3 = constantState3 != null ? constantState3.newDrawable() : null;
                    if (newDrawable3 != null) {
                        obj = new ClipDrawable(newDrawable3, 8388611, 1).mutate();
                        this.o = obj instanceof ClipDrawable ? (ClipDrawable) obj : null;
                        Drawable drawable8 = this.l;
                        this.p = drawable8 != null ? drawable8.getIntrinsicWidth() : 0;
                        Drawable drawable9 = this.l;
                        this.q = drawable9 != null ? drawable9.getIntrinsicHeight() : 0;
                        a();
                        a aVar = this.b;
                        this.k = aVar != null ? aVar.a(this) : 0;
                        invalidate();
                        obtainStyledAttributes.recycle();
                        int i2 = this.p;
                        int i3 = this.h;
                        this.f = ir.b(i3, 1, this.i, i2 * i3);
                        this.e = this.q;
                    }
                }
                obj = null;
                this.o = obj instanceof ClipDrawable ? (ClipDrawable) obj : null;
                Drawable drawable82 = this.l;
                this.p = drawable82 != null ? drawable82.getIntrinsicWidth() : 0;
                Drawable drawable92 = this.l;
                this.q = drawable92 != null ? drawable92.getIntrinsicHeight() : 0;
                a();
                a aVar2 = this.b;
                this.k = aVar2 != null ? aVar2.a(this) : 0;
                invalidate();
                obtainStyledAttributes.recycle();
                int i22 = this.p;
                int i32 = this.h;
                this.f = ir.b(i32, 1, this.i, i22 * i32);
                this.e = this.q;
            }
        }
        drawable2 = null;
        this.n = !(drawable2 instanceof ClipDrawable) ? (ClipDrawable) drawable2 : null;
        drawable3 = this.m;
        if (drawable3 != null) {
        }
        obj = null;
        this.o = obj instanceof ClipDrawable ? (ClipDrawable) obj : null;
        Drawable drawable822 = this.l;
        this.p = drawable822 != null ? drawable822.getIntrinsicWidth() : 0;
        Drawable drawable922 = this.l;
        this.q = drawable922 != null ? drawable922.getIntrinsicHeight() : 0;
        a();
        a aVar22 = this.b;
        this.k = aVar22 != null ? aVar22.a(this) : 0;
        invalidate();
        obtainStyledAttributes.recycle();
        int i222 = this.p;
        int i322 = this.h;
        this.f = ir.b(i322, 1, this.i, i222 * i322);
        this.e = this.q;
    }

    public void d() {
    }
}
