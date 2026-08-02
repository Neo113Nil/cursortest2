package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AppCompatSeekBarHelper.java */
/* loaded from: classes11.dex */
public final class n33 extends j33 {
    public final AppCompatSeekBar d;
    public Drawable e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public boolean h;
    public boolean i;

    public n33(AppCompatSeekBar appCompatSeekBar) {
        super(appCompatSeekBar);
        this.f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.d = appCompatSeekBar;
    }

    @Override // xsna.j33
    public final void a(AttributeSet attributeSet, int i) {
        super.a(attributeSet, i);
        AppCompatSeekBar appCompatSeekBar = this.d;
        Context context = appCompatSeekBar.getContext();
        int[] iArr = R$styleable.g;
        yyo0 e = yyo0.e(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = e.b;
        iut0.p(appCompatSeekBar, appCompatSeekBar.getContext(), iArr, attributeSet, e.b, i);
        Drawable c = e.c(0);
        if (c != null) {
            appCompatSeekBar.setThumb(c);
        }
        Drawable b = e.b(1);
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.e = b;
        if (b != null) {
            b.setCallback(appCompatSeekBar);
            b.setLayoutDirection(appCompatSeekBar.getLayoutDirection());
            if (b.isStateful()) {
                b.setState(appCompatSeekBar.getDrawableState());
            }
            c();
        }
        appCompatSeekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.g = rko.c(typedArray.getInt(3, -1), this.g);
            this.i = true;
        }
        if (typedArray.hasValue(2)) {
            this.f = e.a(2);
            this.h = true;
        }
        e.f();
        c();
    }

    public final void c() {
        Drawable drawable = this.e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable mutate = drawable.mutate();
                this.e = mutate;
                if (this.h) {
                    mutate.setTintList(this.f);
                }
                if (this.i) {
                    this.e.setTintMode(this.g);
                }
                if (this.e.isStateful()) {
                    this.e.setState(this.d.getDrawableState());
                }
            }
        }
    }

    public final void d(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.e.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.e.draw(canvas);
                    canvas.translate(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
